package fr.aoste.sync.util;

import java.util.Iterator;
import java.util.List;

import fr.aoste.sync.Event;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.Transition;
import fr.aoste.sync.Trigger;

public class STSHelper {
	public static void hide(SynchronousTransitionSystem sts, String local) {
		Event toRemove = null;
		for(Iterator<Event> it = sts.getEvents().iterator(); it.hasNext(); ) {
			Event e = it.next();
			if (e.getName().equals(local)) {
				it.remove();
				toRemove = e;
				break;
			}
		}
//		if (toRemove==null) throw new RuntimeException("Event not found:"+local);
//TODO: Pb when renaming the clocks BasicCCSLSpecification to STSBuilder adaptation, replace temporarily exception by an error message
		if (toRemove == null) {
			System.err.println("Event not found:"+local);
			return;
		}
		for(Transition transition : sts.getTransitions()) {
			Trigger trigger = transition.getTrigger();
			trigger.getEvents().remove(toRemove);
			if (trigger.getEvents().size()==0)
				throw new RuntimeException("Hidding event "+local+" makes the STS non deterministic!!");
		}
	}	
	
	public static Event getEventByName(SynchronousTransitionSystem bts, String name) {
		for(Event event : bts.getEvents()) {
			if (event.getName().equals(name)) return event;
		}
		return null; // unable to find an event of this name
	}
//	public static boolean isDeterministic(SynchronousTransitionSystem sts) {
//		for(Vertex state : sts.getStates()) {
//			if(!isDeterministic(state)) return false;
//		}
//		return true;
//	}
//	public static boolean isDeterministic(Vertex vertex) {
//		if (vertex instanceof FinalState) return true;
//		State state = (State)vertex;
//		for(Transition t1 : state.getOutgoing()) {
//			for(Transition t2 : state.getOutgoing()) {
////				if (!areIndependent(t1, t2))
////					return false;
//			}
//		}
//		return true;		
//	}
//	public static boolean areIndependent(Transition t1, Transition t2) {
//		return !areEqual(t1.getTrigger(), t2.getTrigger())
//				|| 
//				areDisjoint(t1.getGuard(), t2.getGuard());
//	}
	
	/**
	 * Compare two lists
	 * @return true if the list contains the exact same elements not necessarily in the same order (compare elements with ==)
	 */
	public static boolean areEqual(List<?> l1, List<?> l2) {
		if (l1.size() != l2.size()) return false;
		for(Object ev : l1) {
			if (!l2.contains(ev)) return false;
		}
		return true;
	}
	
	/**
	 * Compare two guards
	 * @return true iif the guards are not overlapping (have no intersection)
	 */
//	public static boolean areDisjoint(Guard g1, Guard g2) {
//		if (g1.getFirst()!=g2.getFirst() && g1.getFirst()!=g2.getSecond()) return false; // not applied on the same events
//		if (g1.getSecond()!=g2.getFirst() && g1.getSecond()!=g2.getSecond()) return false;
//		
//		// assume that g1.getFirst() != g1.getSecond() && g2.getSecond() != g2.getSecond();
//		return false;
//	}
}
