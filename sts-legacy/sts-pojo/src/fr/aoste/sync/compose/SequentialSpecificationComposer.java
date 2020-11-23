package fr.aoste.sync.compose;

import java.util.List;

import fr.aoste.sync.ComposedTransitionSystem;
import fr.aoste.sync.StsFactory;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.util.STSHelper;

/**
 * Compose the STS 2 by two
 * @see ParallelSpecificationComposer
 */
public class SequentialSpecificationComposer implements ICCSLSpecificationComposer {

	@Override
	public SynchronousTransitionSystem treat(
			List<SynchronousTransitionSystem> systems, List<Binding> bindings, List<String> localClocks) {
		SynchronousTransitionSystem stsMain = systems.get(0);
		if (systems.size()==1) return stsMain;
		
		for(int i=1; i<systems.size(); i++) {
			ComposedTransitionSystem cts = StsFactory.eINSTANCE.createComposedTransitionSystem();
			STSParallelComposer composer = new STSParallelComposer(cts);
			cts.getSubsystems().add(stsMain);
			cts.getSubsystems().add(systems.get(i));
			
			for(Binding b : bindings)
				new BindingFilter(b,i).bind(composer);
			
			stsMain = composer.getComposedSTS("STS"+i);
			
//			STSPrettyPrinter.print(stsMain);
			
			for(String local : localClocks)
				STSHelper.hide(stsMain, local);
		}
		return stsMain;
	}

}
