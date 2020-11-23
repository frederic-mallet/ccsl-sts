package fr.aoste.sync.dynamic.util;

import java.util.ArrayList;

import fr.aoste.sync.Event;
import fr.aoste.sync.Parameter;
import fr.aoste.sync.ParameterBinding;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.Transition;
import fr.aoste.sync.Vertex;
import fr.aoste.sync.compose.CTSHelper;
import fr.aoste.sync.compose.ITransitionValidator;
import fr.aoste.sync.compose.MyState;
import fr.aoste.sync.compose.TransitionSynchronizer;
import fr.aoste.sync.dynamic.DynamicTransitionSystem;
import fr.aoste.sync.dynamic.EventCounter;
import fr.aoste.sync.util.ValueSpecificationEvaluator;
import fr.aoste.sync.visitor.PrettyPrintstsVisitor;
import fr.aoste.sync.vspec.BooleanExpression;

final public class DTSHelper implements ITransitionValidator {
	private DynamicTransitionSystem context;
	// FM: 2014/04/18: modified to use MyState instead of Vertex, not tested
	private ArrayList<MyState> currentStates = new ArrayList<>();
	private IFiringTransitionListener listener = new DefaultFiringTransitionListener();
	
	CTSHelper ctsHelper; // accessed by SynchronizedTransition
	
	DTSHelper(DynamicTransitionSystem context) {
		super();
		this.context = context;
		this.ctsHelper = new CTSHelper(context.getStatic_());
		
		ctsHelper.buildSyncEventForStandaloneEvents();
		ctsHelper.fillWithInitialState(currentStates);
	}

	public void setListener(IFiringTransitionListener listener) {
		this.listener = listener;
	}
	TransitionSynchronizer getFireableTransitions() {
		listener.clear(); // expect to call fire next to collect the name of clocks
		return new TransitionSynchronizer(currentStates, ctsHelper, this);
	}
	
	public void reset() {
		listener.clear();
		for (EventCounter counter : context.getCounters())
			counter.setCounter(0);
		int i = 0;
		for(SynchronousTransitionSystem bts : ctsHelper) {
			currentStates.set(i++, MyState.getMyState(bts.getInitial()));
		}
	}
	
	void printFiredClockNames() {
		for (String s : listener.firedClocks())
			System.out.print(s + " ");
		System.out.println();
	}
	void fire(Event e) {
		if (e.getSync().getName() == null)
			listener.fire(e.getName());
		else
			listener.fire(e.getSync().getName());

		EventCounter counter = getEventCounterByEvent(e);
		counter.setCounter(counter.getCounter()+1);
	}
	
	final public void fire(int stsNb, Transition t) {
		currentStates.set(stsNb, MyState.getMyState(t.getTarget()));
		for(Event e : t.getTrigger().getEvents()) {
			fire(e);
		}
	}
	
	final public EventCounter getEventCounterByEvent(Event e) {
		for(EventCounter counter : context.getCounters()) {
			if (counter.getEvent() == e) return counter;
		}
		return null; // unable to find a binding for this event
	}
	
	final public ParameterBinding getParameterBindingByParameter(Parameter param) {
		return ctsHelper.getParameterBindingByParameter(param);
	}	

	//	public EventBinding getEventBindingByBindingName(String name) {
	//		for(EventBinding binding : context.getBindings()) {
	//			if (binding.getName().equals(name)) return binding;
	//		}
	//		return null; // unable to find a binding for this name
	//	}
	final public String toString(Transition t) {
		return t.accept(new PrettyPrintstsVisitor()).toString();
	}
	final public String toString(Vertex v) {
		return v.accept(new PrettyPrintstsVisitor()).toString();
	}

	final public boolean isGuardValid(Transition t) {
		if (t==null) return true; // null transition are always valid
		BooleanExpression g = t.getGuard();
		if (g==null) return true; // when there is no guard, it is equivalent to true
		Boolean b = (Boolean)g.accept(new ValueSpecificationEvaluator(this));
		return b.booleanValue();
	}
}
