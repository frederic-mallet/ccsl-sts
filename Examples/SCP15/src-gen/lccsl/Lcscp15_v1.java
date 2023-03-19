package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;
import fr.kairos.lightccsl.core.stepper.StepperUtility;
import fr.unice.lightccsl.sat.bdd.BDDSolutionFinder;
import fr.kairos.timesquare.ccsl.reduce.ReduceSpecificationBuilder;

public class Lcscp15_v1 implements ISpecificationBuilder {
	static public Lcscp15_v1 INSTANCE = new Lcscp15_v1();
	private Lcscp15_v1 () {
		// SINGLETON
	}	

	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("in1");
		simple.addClock("in2");
		simple.addClock("step1");
		simple.addClock("step2");
		simple.addClock("step3");
		simple.addClock("out");
		
		simple.causality("in1", "step1");
		simple.precedence("step1", "step3");
		simple.causality("step3", "out");
		
		simple.causality("in2", "step2");
		simple.precedence("step2", "step3");
		
		simple.inf("in", "in1", "in2");
		simple.precedence("in", "out", 0, 1);
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "scp15_v1";
		
		ReduceSpecificationBuilder INSTANCE = new ReduceSpecificationBuilder(Lcscp15_v1.INSTANCE);
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
