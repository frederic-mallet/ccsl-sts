package fr.aoste.sync.compose;

import java.util.List;

import fr.aoste.sync.SynchronousTransitionSystem;

public interface ICCSLSpecificationComposer {
	SynchronousTransitionSystem treat(List<SynchronousTransitionSystem> systems, List<Binding> bindings, List<String> localClocks);
}
