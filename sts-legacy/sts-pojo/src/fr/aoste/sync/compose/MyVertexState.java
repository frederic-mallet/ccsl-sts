package fr.aoste.sync.compose;

import java.util.ArrayList;
import java.util.List;

import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.Transition;
import fr.aoste.sync.linearprogramming.AInvariantHelper;
import fr.aoste.sync.vspec.BooleanExpression;

/**
 * Wrapper around Vertex to add new information
 * 
 * @author fmallet
 *
 */
class MyVertexState extends MyState {
	State state;
	MyVertexState(State v) {
		this.state = v;
	}
	String getName() {
		return state.getName();
	}
	@Override
	BooleanExpression buildInvariant(AInvariantHelper invHelper,
			BooleanExpression stsInvariant) {
		BooleanExpression res = state.getInvariant();

		// add the invariant for the state for the current STS, if any
		if (res!=null) {
			invHelper.addInvariant(res);
		}

		// add the invariant for the current STS, if any
		if (stsInvariant!=null)
			invHelper.addInvariant(stsInvariant);

		return res;
	}
	
	@Override
	List<Transition> getTransitions(
			SynchronousTransitionSystem synchronousTransitionSystem,
			ITransitionValidator validator) {
		ArrayList<Transition> res = new ArrayList<>();

		for(Transition t : synchronousTransitionSystem.getTransitions()) {
			if (t.getSource()!=state) continue;
				
			if (validator.isGuardValid(t)) {
				res.add(t);
			} 
		} // empty list means not in finalState but no fireable transition
		return res;
	}
	@Override
	public String toString() {
		return "*(" + state + ")*";
	}
}