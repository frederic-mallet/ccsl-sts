package fr.aoste.sync.compose;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import fr.aoste.sts.IEvent;
import fr.aoste.sts.SyncVector;
import fr.aoste.sync.Event;
import fr.aoste.sync.StsFactory;
import fr.aoste.sync.Transition;
import fr.aoste.sync.Trigger;
import fr.aoste.sync.compose.InternalMonitor.TransitionKind;
import fr.aoste.sync.linearprogramming.AInvariantHelper;
import fr.aoste.sync.util.TransposeGuard;
import fr.aoste.sync.vspec.BooleanExpression;
import fr.aoste.sync.vspec.Conjunction;
import fr.aoste.sync.vspec.ValuespecificationFactory;

final public class SynchronizedTransition implements Iterable<Transition>{
	private Transition[] transitions;
	private CTSHelper helper;
	
	SynchronizedTransition(int number, CTSHelper helper) {
		transitions = new Transition[number];
		this.helper = helper;
	}
	void set(int pos, Transition t) {
		transitions[pos] = t;
	}
	int size() {
		return transitions.length;
	}
	
	SynchronizedState buildTransition(SynchronizedState source, Map<SyncVector<? extends IEvent>, Event> syncMap, AInvariantHelper invHelper) {
		Transition transition = StsFactory.eINSTANCE.createTransition();
		transition.setSource(source.getState());
		Trigger trigger = StsFactory.eINSTANCE.createTrigger();
		transition.setTrigger(trigger);
		List<MyState> targets = new ArrayList<>();
		BooleanExpression guard = null;
		int i = 0;
		for(Transition t : this) {
			if (t==null) {
				targets.add(source.getSubState(i++));
				continue;
			}
			targets.add(MyState.getMyState(t.getTarget()));
			
			int iG = invHelper.testGuard(t.getGuard());
//			int iG = 0;
			// must deal with guards
			if (iG==0)
				guard = compose(guard, t.getGuard(), syncMap);
			else if (iG<0) {
				helper.logTransition(TransitionKind.INVALID_GUARD);
				return null;
			} // if == 0, the guard is useless, just ignore it
			// deal with trigger
			for(Event e : t.getTrigger().getEvents()) {
				Event ev = syncMap.get(e.getSync());
				if (!trigger.getEvents().contains(ev))
					trigger.getEvents().add(ev);
			}
			i++;
		}
		
		SynchronizedState res = SynchronizedState.getSynchronizedState(targets, helper);
		if (res.isInvalid()) {
			helper.logInvalidState();
			return null; // else the invariant are violated and the state does not exist
		}
		
//		int g = invHelper.testGuard(guard);
//		if (g==0) // guard not systematically true or false
			transition.setGuard(guard);
//		else if (g<0)
//			return null; // the state is valid but he 
		// else guard is always true but the transition is always false, only add the state if a transition actually reaches that state 
		
		transition.setTarget(res.getState());

		source.addTransition(transition);
		return res;
		
	}
	private BooleanExpression compose(BooleanExpression g1, BooleanExpression g2, Map<SyncVector<? extends IEvent>, Event> syncMap) {
		if (g2==null) return g1;
		BooleanExpression res = (BooleanExpression)g2.accept(new TransposeGuard(syncMap,helper));
		if (g1==null) return res;
		Conjunction c = ValuespecificationFactory.eINSTANCE.createConjunction();
		c.getOperands().add(g1);
		c.getOperands().add(res);
		return c;
	}
	boolean check() {
		if (transitions.length==1) return true;
//		for(int i = 0; i<transitions.length; i++) // 07/02/14: je ne comprends pas � quoi servirait cette ligne
		for (int first = 0; first<transitions.length-1; first++) {
			for (int second = first+1; second<transitions.length; second++) {
				int t1S2 = helper.getMap().synchronize(transitions[first], second);
				int t2S1 = helper.getMap().synchronize(transitions[second], first);
				if (t1S2 != t2S1) return false;
//				if (!BinaryWordFactoryFactory.getFactory().equals(t1S2,t2S1)) return false;
			}
		}
		
		return true;
	}
	
	public Iterator<Transition> iterator() {
		return new MyIterator();
	}
	private class MyIterator implements Iterator<Transition>  {
		private int i = 0;
		public boolean hasNext() {
			return i<transitions.length;
		}

		public Transition next() {
			return transitions[i++];
		}

		public void remove() {
			transitions[i]=null;
		}		
	}
}
