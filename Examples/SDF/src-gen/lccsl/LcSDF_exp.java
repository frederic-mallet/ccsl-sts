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

public class LcSDF_exp implements ISpecificationBuilder {
	static public LcSDF_exp INSTANCE = new LcSDF_exp();
	private LcSDF_exp () {
		// SINGLETON
	}	

	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("A");
		simple.addClock("B");
		simple.addClock("C");
		simple.addClock("rd_AB");
		simple.addClock("wr_BC");
		simple.addClock("rd_BC");
		simple.addClock("rd_CB");
		
		simple.causality("A", "rd_AB", 0, 2);
		
		simple.periodic("rd_AB_del", "rd_AB", 2, 1, -1);
		simple.precedence("rd_AB_del", "B", 0, 1);
		
		simple.periodic("B", "wr_BC", 2, 0, -1);
		simple.causality("wr_BC", "rd_BC", 0, 1);
		
		simple.precedence("rd_BC", "C", 0, 1);
		
		simple.causality("C", "rd_CB", 2, 2);
		
		simple.periodic("rd_CB_del", "rd_CB", 2, 1, -1);
		simple.precedence("rd_CB_del", "B", 0, 1);
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "SDF_exp";
		
		ReduceSpecificationBuilder INSTANCE = new ReduceSpecificationBuilder(LcSDF_exp.INSTANCE);
		for (IUtility u : utilities) {
			u.treat(name, INSTANCE);
		}
		
		StepperUtility exe = new StepperUtility(new BDDSolutionFinder());
		exe.setParam(StepperUtility.INTERACTIVE, false);
		exe.setBackend(new fr.unice.lightccsl.html.HtmlVCDBackend());
		exe.setParam(StepperUtility.NB_STEPS, 41);
		exe.treat(name, INSTANCE);
		
		STSUtility sts = new STSUtility();
		//ChocoInvariantHelper.activate(); // to reduce STS
		JalinoptInvariantHelper.activate(); // to reduce STS
		sts.setBackend(new STSJavaBackend());
		sts.setParam("folderName", "src-gen/sts");
		sts.treat(name, INSTANCE);
	}
}
