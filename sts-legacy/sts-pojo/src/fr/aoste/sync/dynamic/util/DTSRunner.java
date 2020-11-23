package fr.aoste.sync.dynamic.util;

import java.util.List;

import fr.aoste.sync.Event;
import fr.aoste.sync.Transition;
import fr.aoste.sync.compose.EventCollector;
import fr.aoste.sync.compose.STSParallelComposer;
import fr.aoste.sync.compose.SynchronizedTransition;
import fr.aoste.sync.compose.TransitionSynchronizer;
import fr.aoste.sync.dynamic.DynamicFactory;
import fr.aoste.sync.dynamic.DynamicTransitionSystem;
import fr.aoste.sync.dynamic.EventCounter;

public class DTSRunner {
	private DynamicTransitionSystem dts;
	private DTSHelper helper;

	public static DTSRunner create(STSParallelComposer c, String ... names) {
		DynamicTransitionSystem dts = DynamicFactory.eINSTANCE.createDynamicTransitionSystem();
		dts.setStatic_(c.getCts());

		return new DTSRunner(dts, names);
	}

	private DTSRunner(DynamicTransitionSystem dts, String ... names) {
		super();
		assert(dts != null);
		this.dts = dts;
		this.helper = new DTSHelper(dts);

		@SuppressWarnings("unchecked")
		List<Event> events = (List<Event>)dts.getStatic_().accept(new EventCollector());
		int i = 0;
		for(Event e : events) {
			EventCounter eCounter = DynamicFactory.eINSTANCE.createEventCounter();
			dts.getCounters().add(eCounter);
			eCounter.setEvent(e);
			if (i<names.length)
				e.getSync().setName(names[i]);
			i++;
		}		
	}
	
	public void setListener(IFiringTransitionListener listener) {
		helper.setListener(listener);
	}

	public void reset() {
		helper.reset();
	}

	public void printState() {
		System.out.print("State: ");
		System.out.println(dts.accept(new DTSPrettyPrinter()));
	}
	//	public void fire(String expression) {
	//		List<EventBinding> conjunctionOfEvents = new ArrayList<EventBinding>();
	//		String[] vals = expression.split("\\.");
	//		for(String val : vals) {
	//			EventBinding eb = helper.getEventBindingByBindingName(val);
	//			if (eb==null) continue; // ignore the name since it is an external event
	//			conjunctionOfEvents.add(eb);
	//		}
	//		if(conjunctionOfEvents.isEmpty()) {
	//			System.out.println("Nothing to do!");
	//			return;
	//		}
	//		Transition t = findOutgoingTransition(conjunctionOfEvents);
	//		fire(t);
	//	}
	//
	public void fireRandomValidTransition() {
		TransitionSynchronizer fireable = helper.getFireableTransitions();
		if (fireable.isEmpty()) throw new RuntimeException("No valid outgoing transition");
		
		fire(fireable.pickRandomSynchonizedTransition());
	}

	public void fire(SynchronizedTransition synchronizedTransition) {
		// fire transitions
		int i = 0;
		for(Transition t : synchronizedTransition) {
			if (t!=null) {
				helper.fire(i, t);
			}
			i++;
		}
	}

	public TransitionSynchronizer getFireableTransitions() {
		return helper.getFireableTransitions();
	}

	public int getNbCounters() {
		return dts.getCounters().size();
	}
	public void fire(int nbStep, boolean debug) {
		for (int i = 0; i < nbStep; i++) {
			fireRandomValidTransition();
			if (debug) printState();
		}
	}
}
