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
		if (systems.size() == 1) {
			return systems.get(0);
		} 

		String name = "";
		ComposedTransitionSystem cts = StsFactory.eINSTANCE.createComposedTransitionSystem();
		STSParallelComposer composer = new STSParallelComposer(cts);
		for(SynchronousTransitionSystem sts : systems) {
			cts.getSubsystems().add(sts);
			name += "_" + sts.getName();
		}

		int[] countRef = new int[localClocks.size()];
		for(Binding b : bindings) {
			int pos = localClocks.indexOf(b.getName());
			if (pos != -1) countRef[pos]++;
			b.bind(composer);
		}
		SynchronousTransitionSystem sts = composer.getComposedSTS(name);

		int i = 0;
		for(String local : localClocks) {
			if (countRef[i] > 1) // only hide local clocks with several references
				STSHelper.hide(sts, local);
			i++;
		}

		return sts;
	}
}
