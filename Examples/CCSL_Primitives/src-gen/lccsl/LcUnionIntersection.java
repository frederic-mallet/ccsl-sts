package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;
import fr.kairos.lightccsl.core.stepper.StepperUtility;
import fr.unice.lightccsl.sat.bdd.BDDSolutionFinder;
import fr.kairos.timesquare.ccsl.reduce.ReduceSpecificationBuilder;

public class LcUnionIntersection implements ISpecificationBuilder {
	static public LcUnionIntersection INSTANCE = new LcUnionIntersection();
	private LcUnionIntersection () {
		// SINGLETON
	}	

	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("a");
		simple.addClock("b");
		simple.addClock("c");
		simple.addClock("d");
		
		simple.union("u_0", "a", "b", "c");
		simple.intersection("u", "d", "u_0");
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "UnionIntersection";
		
		ReduceSpecificationBuilder INSTANCE = new ReduceSpecificationBuilder(LcUnionIntersection.INSTANCE);
		for (IUtility u : utilities) {
			u.treat(name, INSTANCE);
		}
		
		StepperUtility exe = new StepperUtility(new BDDSolutionFinder());
		exe.setParam(StepperUtility.INTERACTIVE, false);
		exe.setBackend(new fr.unice.lightccsl.html.HtmlVCDBackend());
		exe.setParam(StepperUtility.NB_STEPS, 10);
		exe.treat(name, INSTANCE);
		// no STS generation
	}
}
