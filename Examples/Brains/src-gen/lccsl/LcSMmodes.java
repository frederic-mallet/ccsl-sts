package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;
import fr.kairos.lightccsl.core.stepper.StepperUtility;
import fr.unice.lightccsl.sat.bdd.BDDSolutionFinder;
import fr.kairos.lightccsl.sts.STSJavaBackend;
import fr.kairos.lightccsl.sts.STSUtility;
//import fr.kairos.sts.pojo.choco.ChocoInvariantHelper;
import fr.aoste.sync.ilp.JalinoptInvariantHelper;
import fr.kairos.timesquare.ccsl.reduce.ReduceSpecificationBuilder;

public class LcSMmodes implements ISpecificationBuilder {
	static public LcSMmodes INSTANCE = new LcSMmodes();
	private LcSMmodes () {
		// SINGLETON
	}	

	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("StartMode");
		simple.addClock("finalMode");
		simple.addClock("Trigger");
		simple.addClock("Context");
		simple.addClock("ReactionTime");
		
		simple.intersection("condition", "Trigger", "Context");
		simple.causality("condition", "finalMode");
		
		simple.delayFor("end", "StartMode", 1, -1, "ReactionTime");
		simple.causality("finalMode", "end");
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "SMmodes";
		
		ReduceSpecificationBuilder INSTANCE = new ReduceSpecificationBuilder(LcSMmodes.INSTANCE);
		for (IUtility u : utilities) {
			u.treat(name, INSTANCE);
		}
		
		StepperUtility exe = new StepperUtility(new BDDSolutionFinder());
		exe.setParam(StepperUtility.INTERACTIVE, false);
		exe.setParam(StepperUtility.NB_STEPS, 20);
		exe.treat(name, INSTANCE);
		
		STSUtility sts = new STSUtility();
		//ChocoInvariantHelper.activate(); // to reduce STS
		JalinoptInvariantHelper.activate(); // to reduce STS
		sts.setBackend(new STSJavaBackend());
		sts.setParam("folderName", "src-gen/sts");
		sts.treat(name, INSTANCE);
	}
}
