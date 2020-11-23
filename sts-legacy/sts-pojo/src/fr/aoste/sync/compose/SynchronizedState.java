package fr.aoste.sync.compose;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import fr.aoste.sts.IEvent;
import fr.aoste.sts.SyncVector;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import fr.aoste.sync.StsFactory;
import fr.aoste.sync.Transition;
import fr.aoste.sync.linearprogramming.AInvariantHelper;
import fr.aoste.sync.linearprogramming.InvariantHelperFactory;
import fr.aoste.sync.vspec.BooleanExpression;
import fr.aoste.sync.vspec.Conjunction;
import fr.aoste.sync.vspec.ValuespecificationFactory;

final class SynchronizedState {
	private List<MyState> states;
	List<Transition> outgoing = new LinkedList<Transition>();
	private AInvariantHelper invHelper;
	
	static private HashMap<String, SynchronizedState> stateMap = new HashMap<String, SynchronizedState>();

	static void clear() { stateMap.clear(); }
	static SynchronizedState getSynchronizedState(List<MyState> states, CTSHelper helper) {
		StringBuilder nameBuilder = new StringBuilder();
		String sep = "";

		for(MyState v : states) {
			nameBuilder.append(sep);
			nameBuilder.append(v.getName());
			sep="x";
		}
				
		String name = nameBuilder.toString();

		SynchronizedState res = stateMap.get(name);
		if (res == null) {
			res = new SynchronizedState(states, name, helper);
			stateMap.put(name, res);
		}
		return res;
	}
	private boolean isInvalid = false; // default
	private SynchronizedState(List<MyState> states, String name, CTSHelper helper) {
		super();
		this.states = states;
		state = StsFactory.eINSTANCE.createState();
		state.setName(name);
		this.invHelper = InvariantHelperFactory.getHelper();
		this.invHelper.setCTSHelper(helper);

		buildInvariantModel(helper);
		
		isInvalid = (invHelper.hasNoSolution());
//		isInvalid = false;
	}
	
	private void buildInvariantModel(CTSHelper helper) {
		if (invHelper.cannotSimplifyGuards()) return;
		invHelper.clear();
		
		 // used to compute the invariant of the resulting state (do not include sts invariants, only state invariants)
		LinkedList<BooleanExpression> invariants = new LinkedList<>();
		
		for(ListIterator<MyState> it = states.listIterator(); it.hasNext(); ) {
			MyState v = it.next();
			BooleanExpression inv = v.buildInvariant(invHelper, helper.getSTSInvariant(it.previousIndex()));
			if (inv != null) invariants.add(inv);
		}
		buildStateInvariant(invariants);
	}
	
	private void buildStateInvariant(LinkedList<BooleanExpression> invariants) {
		if (invariants.size()==0) return;
		if (invariants.size()==1) state.setInvariant(invariants.get(0)); // should duplicate ?
		
		Conjunction c = ValuespecificationFactory.eINSTANCE.createConjunction();
		c.getOperands().addAll(invariants); // should duplicate ??
		state.setInvariant(c);
	}
	private State state;
	
	State getState() {
		return state;
	}
	boolean isInvalid() {
		return isInvalid;
	}
	MyState getSubState(int pos) {
		return states.get(pos);
	}
	
	private boolean alreadyBuilt = false;
	void buildTransitions(CTSHelper helper, List<SynchronizedState> list, Map<SyncVector<? extends IEvent>, Event> syncMap) {
		if (alreadyBuilt) return; // nothing to do
		alreadyBuilt = true;
		TransitionSynchronizer tSync = new TransitionSynchronizer(states, helper);
		for(SynchronizedTransition st : tSync) {
			buildInvariantModel(helper); // needs to rebuild the current ILP model from state invariants because it is destroyed 
			SynchronizedState ss = st.buildTransition(this, syncMap, invHelper);
			if(ss!=null && !list.contains(ss) && !ss.alreadyBuilt)
				list.add(ss);
		}
		helper.logStateToExplore(list.size());
	}
	
	void addTransition(Transition t) {
		outgoing.add(t);
	}
	@Override
	public String toString() {
		return "<SyncState:"+states+">";
	}
}
