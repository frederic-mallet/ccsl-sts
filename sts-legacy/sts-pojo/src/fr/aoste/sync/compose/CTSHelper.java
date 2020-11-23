package fr.aoste.sync.compose;

import java.util.Iterator;
import java.util.List;

import fr.aoste.sts.IEvent;
import fr.aoste.sts.SyncVector;
import fr.aoste.sync.ComposedTransitionSystem;
import fr.aoste.sync.Event;
import fr.aoste.sync.Parameter;
import fr.aoste.sync.ParameterBinding;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.Transition;
import fr.aoste.sync.compose.InternalMonitor.TransitionKind;
import fr.aoste.sync.vspec.BooleanExpression;

/**
 * Old CTSHelper has become CTSHelperBW
 * New CTSHelper uses integers instead of binary words
 * @author fmallet
 *
 */
final public class CTSHelper implements Iterable<SynchronousTransitionSystem>, ITransitionValidator {
	private ComposedTransitionSystem cts;
	
//	private SyncVectorToBinaryWordMap map; // accessed by SynchronizedTransition
	private SyncVectorToIntMap map; // replace IBinaryWord
	
	private InternalMonitor monitor = null;
	
	public CTSHelper(ComposedTransitionSystem cts) {
		super();
		assert(cts != null);
		this.cts = cts;
	}

	void startMonitoring() {
		monitor = new InternalMonitor(computeMaxNumberOfStates());
	}
	boolean logStateToExplore(int size) {
		// Should always return true (just using assert mechanism to disable when not monitoring)		
		return monitor==null || monitor.logStatesToExplore(size); 
	}	
	boolean logInvalidState() {
		// Should always return true (just using assert mechanism to disable when not monitoring)		
		return monitor==null || monitor.logInvalidState(); 
	}		
	boolean log(SynchronizedState state) {
		// Should always return true (just using assert mechanism to disable when not monitoring)		
		return monitor==null || monitor.log(state); 
	}
	boolean logTransition(InternalMonitor.TransitionKind status) {
		return monitor==null || monitor.logTransition(status);
	}
	SyncVectorToIntMap getMap() {
		if (map!=null) return map;
		map = new SyncVectorToIntMap(cts.getSubsystems().size());
		for(SyncVector<? extends IEvent> vector : cts.getVectors()) {
			map.add(vector);
		}
		int nbSts = 0;
		for(SynchronousTransitionSystem sts : cts.getSubsystems()) {
			map.buildBinaryWord(nbSts, sts.getEvents());
			nbSts++;
		}
		return map;
	}
	
	long computeMaxNumberOfStates() {
		long res = 1l;
		for(SynchronousTransitionSystem sts : cts.getSubsystems()) {
			res = res*sts.getStates().size();
		}
		return res;
	}

	final List<Transition>[] buildListOfAvailableTransitions(List<MyState> vertices) {
		return buildListOfAvailableTransitions(vertices, this);
	}

	public void fillWithInitialState(List<MyState> v) {
		for(SynchronousTransitionSystem sts : cts.getSubsystems())
			v.add(MyState.getMyState(sts.getInitial()));
	}
	final public List<Transition>[] buildListOfAvailableTransitions(List<MyState> vertices, ITransitionValidator validator) {
		@SuppressWarnings("unchecked")
		List<Transition>[] list = new List[vertices.size()];

		int i = 0;
		for(MyState current : vertices) {
			list[i] = current.getTransitions(cts.getSubsystems().get(i), validator);
			// empty list means not in finalState but no fireable transition
			// list[i]==null meaning finalState
			i++;
		}
		filterOutCannot(list);
		
		assert(monitor==null || monitor.logTransitions());
		
		return list;
	}	

	private void filterOutCannot(List<Transition>[] list) {
		getMap();
		int[] may = new int[list.length];

		int cannot = 0;
		for (int i = 0; i<may.length; i++) {
			may[i] = 0;

			if (list[i] != null) {
				for (Transition t : list[i]) {
					may[i] |= map.getBinaryWord(t);
				}
			}
			cannot |= map.xor(i, may[i]);				
		}
		boolean hasChanged = false;
		// remove transitions that cannot tick anyway
		for (int i = 0; i<list.length; i++) {
			if (list[i]==null) continue;		
			iterTransitions:for(Iterator<Transition> it = list[i].iterator(); it.hasNext(); ) {
				Transition t = it.next();
				for(Event e : t.getTrigger().getEvents()) {
					int pos = map.getPosition(e.getSync());
					if ((cannot & (1<<pos)) == 1) {
						it.remove();
						assert(logTransition(TransitionKind.REMOVED));
						hasChanged = true;
						continue iterTransitions;
					}
				}
			}
		}
		if (hasChanged) filterOutCannot(list);
	}

	Parameter getParameterByName(String name) {
		int indComa = name.indexOf("::");
		SynchronousTransitionSystem mySts = null;
		if (indComa==-1) {
			if (cts.getSubsystems().size()>1) return null; // need "::" when several sts
			mySts = cts.getSubsystems().get(0);
		} else {
			String stsName = name.substring(0, indComa);
			for(SynchronousTransitionSystem sts:cts.getSubsystems())
				if(sts.getName().equals(stsName)) { mySts = sts; break; }
			name = name.substring(indComa+2);
		}
		if (mySts==null) return null; // no sts with the name given before "::"

		for(Parameter param : mySts.getParameters()) {
			if (param.getName().equals(name)) return param;
		}
		return null; // unable to find a Parameter with this name;
	}

	/** add SyncEvent for events that are not synchronized
	 *  This is to deal uniformly with all events whether or not they have a SyncVector
	 */
	public void buildSyncEventForStandaloneEvents() {
		int stsNumber = 0;
		for(SynchronousTransitionSystem sts : cts.getSubsystems()) {
			for(Event e : sts.getEvents()) {
				if (e.getSync()!=null) continue;

				SyncVector<Event> vec = new SyncVector<Event>(cts==null?1:cts.getSubsystems().size());
				vec.set(stsNumber, e);
				if (cts != null) { // if went through the CTS
					cts.getVectors().add(vec);  // add it to the CTS, it will be parsed in the caseCTS
				}
			}
			stsNumber++;
		}		
	}

	public ParameterBinding getParameterBindingByParameter(Parameter param) {
		for(ParameterBinding binding : cts.getPBindings()) {
			if(binding.getFormal()==param) return binding;
		}
		return null; // unable to find a binding for this parameter
	}

	public Iterator<SynchronousTransitionSystem> iterator() {
		return cts.getSubsystems().iterator();
	}

	public boolean isGuardValid(Transition t) {
		return true; // accept all transitions since working from a static context (cannot validate guards): used to build the synchronized product
	}

	BooleanExpression getSTSInvariant(int index) {
		return cts.getSubsystems().get(index).getInvariant();
	}

}
