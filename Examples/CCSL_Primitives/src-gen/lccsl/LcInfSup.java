package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;
import fr.kairos.lightccsl.core.stepper.StepperUtility;
import fr.unice.lightccsl.sat.bdd.BDDSolutionFinder;
import fr.kairos.timesquare.ccsl.reduce.ReduceSpecificationBuilder;

public class LcInfSup implements ISpecificationBuilder {
	static public LcInfSup INSTANCE = new LcInfSup();
	private LcInfSup () {
		// SINGLETON
	}	

	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("a");
		simple.addClock("b");
		simple.addClock("c");
		
		simple.inf("i", "a", "b", "c");
		simple.sup("u", "a", "b", "c");
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "InfSup";
		
		ReduceSpecificationBuilder INSTANCE = new ReduceSpecificationBuilder(LcInfSup.INSTANCE);
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
