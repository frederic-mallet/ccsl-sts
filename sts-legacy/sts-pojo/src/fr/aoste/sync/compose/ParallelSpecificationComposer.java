package fr.aoste.sync.compose;

import java.util.List;

import fr.aoste.sync.ComposedTransitionSystem;
import fr.aoste.sync.StsFactory;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.util.STSHelper;

/**
 * @see SequentialSpecificationComposer
 * Contrary to SequentialSpecificationComposer build a big synchronization vector between all the STS.
 * SequentialSpecificationComposer use ParallelSpecificatioBuilder to build synchronization vector 2 by 2 and
 * produce a composed STS
 */
public class ParallelSpecificationComposer implements ICCSLSpecificationComposer {

	@Override
	public SynchronousTransitionSystem treat(
			List<SynchronousTransitionSystem> systems, List<Binding> bindings, List<String> localClocks) {
		String name = "";
		
		ComposedTransitionSystem cts = StsFactory.eINSTANCE.createComposedTransitionSystem();
		STSParallelComposer composer = new STSParallelComposer(cts);
		for(SynchronousTransitionSystem sts : systems) {
			cts.getSubsystems().add(sts);
			name += "_" + sts.getName();
		}

		for(Binding b : bindings)
			b.bind(composer);
		
		SynchronousTransitionSystem sts = composer.getComposedSTS(name);
		
		for(String local : localClocks)
			STSHelper.hide(sts, local);
		
		return sts;
	}
}
