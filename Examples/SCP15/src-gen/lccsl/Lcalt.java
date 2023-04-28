package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;
import fr.kairos.lightccsl.core.stepper.StepperUtility;
import fr.unice.lightccsl.sat.bdd.BDDSolutionFinder;
import fr.kairos.timesquare.ccsl.reduce.ReduceSpecificationBuilder;

public class Lcalt implements ISpecificationBuilder {
	static public Lcalt INSTANCE = new Lcalt();
	private Lcalt () {
		// SINGLETON
	}	

	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("a");
		simple.addClock("c");
		
		simple.delayFor("b", "a", 1, -1, null);
		simple.precedence("a", "c");
		simple.precedence("c", "b");
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "alt";
		
		ReduceSpecificationBuilder INSTANCE = new ReduceSpecificationBuilder(Lcalt.INSTANCE);
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
