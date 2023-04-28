package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;
import fr.kairos.lightccsl.core.stepper.StepperUtility;
import fr.unice.lightccsl.sat.bdd.BDDSolutionFinder;
import fr.kairos.timesquare.ccsl.reduce.ReduceSpecificationBuilder;

public class LcPeriod implements ISpecificationBuilder {
	static public LcPeriod INSTANCE = new LcPeriod();
	private LcPeriod () {
		// SINGLETON
	}	

	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("c2");
		
		simple.periodic("c1", "c2", 3, 0, -1);
		simple.delayFor("c3", "c1", 2, -1, null);
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "Period";
		
		ReduceSpecificationBuilder INSTANCE = new ReduceSpecificationBuilder(LcPeriod.INSTANCE);
		for (IUtility u : utilities) {
			u.treat(name, INSTANCE);
		}
		
		StepperUtility exe = new StepperUtility(new BDDSolutionFinder());
		exe.setParam(StepperUtility.INTERACTIVE, false);
		exe.setParam(StepperUtility.NB_STEPS, 20);
		exe.treat(name, INSTANCE);
		// no STS generation
	}
}
