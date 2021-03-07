package fr.kairos.lightccsl.sts;

import fr.aoste.ccsl.system.ICCSLSystemBuilder;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.compose.STSParallelComposer;
import fr.aoste.sync.compose.STSSystemBuilder;
import fr.aoste.sync.dynamic.util.DTSRunner;
import fr.kairos.lightccsl.core.stepper.IClockManager;
import fr.kairos.lightccsl.core.stepper.INameToIntegerMapper;
import fr.kairos.lightccsl.core.stepper.ISolutionSet;
import fr.kairos.lightccsl.core.stepper.ISpecificationToSolution;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;

public class STSSolutionFinder implements ISpecificationToSolution {
	private DTSRunnerToSolution solution = null;
	
	@Override
	public ISolutionSet buildSolutionsFor(ISpecificationBuilder builder, 
			INameToIntegerMapper mapper,
			IClockManager clockManager) { // do not need the clock manager here !
		if (solution != null) return solution;
		
		ICCSLSystemBuilder<SynchronousTransitionSystem> sBuilder = STSSystemBuilder.buildParallelSystemBuilder();
		STSAdapter adapter = new STSAdapter(sBuilder);
		builder.build(adapter);

		SynchronousTransitionSystem sts = sBuilder.getCCSLSystem();
		STSParallelComposer composer = new STSParallelComposer(sts);
		DTSRunner runner = DTSRunner.create(composer);

		solution = new DTSRunnerToSolution(runner, mapper);
		return solution;
	}
}
