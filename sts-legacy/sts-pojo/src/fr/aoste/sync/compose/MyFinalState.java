package fr.aoste.sync.compose;

import fr.aoste.sync.FinalState;

/**
 * Wrapper around Vertex to add new information
 * 
 * @author fmallet
 *
 */
final class MyFinalState extends MyState {
	FinalState state;
	MyFinalState(FinalState v) {
		this.state = v;
	}
	String getName() {
		return "_";
	}
}