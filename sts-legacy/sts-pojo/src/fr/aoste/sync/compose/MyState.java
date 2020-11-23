package fr.aoste.sync.compose;

import java.util.HashMap;
import java.util.List;

import fr.aoste.sync.FinalState;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.Transition;
import fr.aoste.sync.Vertex;
import fr.aoste.sync.linearprogramming.AInvariantHelper;
import fr.aoste.sync.vspec.BooleanExpression;

/**
 * Wrapper around Vertex to add new information
 * 
 * @author fmallet
 *
 */
public abstract class MyState {
	static private HashMap<Vertex, MyState> map = new HashMap<>();
	
	static public MyState getMyState(Vertex v) {
		MyState res = map.get(v);
		if (res==null) {
			if (v instanceof State)
				res = new MyVertexState((State)v);
			else 
				res = new MyFinalState((FinalState)v);
			map.put(v, res);
		}
		return res;
	}
	protected MyState() {
	}
	abstract String getName();
	BooleanExpression buildInvariant(AInvariantHelper invHelper,
			BooleanExpression stsInvariant) {
		return null;
	}
	List<Transition> getTransitions(
			SynchronousTransitionSystem synchronousTransitionSystem,
			ITransitionValidator validator) {
		return null;
	}
}