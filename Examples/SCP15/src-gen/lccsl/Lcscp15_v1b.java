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

public class Lcscp15_v1b implements ISpecificationBuilder {
	static public Lcscp15_v1b INSTANCE = new Lcscp15_v1b();
	private Lcscp15_v1b () {
		// SINGLETON
	}

	public void build(ISimpleSpecification simple, String in1, String in2, String step3, String out) {
		
		simple.precedence(in1, step3);
		simple.causality(step3, out);
		
		simple.precedence(in2, step3);
		
		simple.inf("in", "in1", "in2");
		simple.precedence("in", out, 0, 1);
	}
	
	@Override
	public void build(ISimpleSpecification simple) {
		build(simple, "in1", "in2", "step3", "out");
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "scp15_v1b";
		for (IUtility u : utilities) {
			u.treat(name, INSTANCE);
		}
		
		StepperUtility exe = new StepperUtility(new BDDSolutionFinder());
		exe.setParam(StepperUtility.INTERACTIVE, false);
		exe.setBackend(new fr.unice.lightccsl.html.HtmlVCDBackend());
		exe.setParam(StepperUtility.NB_STEPS, 10);
		exe.treat(name, INSTANCE);
		
		STSUtility sts = new STSUtility();
		//ChocoInvariantHelper.activate(); // to reduce STS
		JalinoptInvariantHelper.activate(); // to reduce STS
		sts.setBackend(new STSJavaBackend());
		sts.setParam("folderName", "src-gen/sts");
		sts.treat(name, INSTANCE);
	}
}
