package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;
import fr.kairos.lightccsl.core.stepper.StepperUtility;
import fr.unice.lightccsl.sat.bdd.BDDSolutionFinder;
import fr.kairos.lightccsl.sts.STSUtility;
//import fr.kairos.sts.pojo.choco.ChocoInvariantHelper;
import fr.aoste.sync.ilp.JalinoptInvariantHelper;

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
		simple.addClock("wr_AB");
		simple.addClock("rd_AB");
		simple.addClock("wr_BC");
		simple.addClock("rd_BC");
		simple.addClock("wr_CB");
		simple.addClock("rd_CB");
		
		simple.delayFor("wr_AB_weight", "wr_AB", 0, -1, null);
		simple.causality("A", "wr_AB_weight");
		
		simple.delayFor("rd_AB_delayed", "rd_AB", 0, -1, null);
		simple.precedence("wr_AB", "rd_AB_delayed");
		
		simple.periodic("rd_AB_del", "rd_AB", 2, 2, -1);
		simple.precedence("rd_AB_del", "B");
		
		simple.periodic("wr_BC_weight", "wr_BC", 2, 0, -1);
		simple.causality("B", "wr_BC_weight");
		
		simple.delayFor("rd_BC_delayed", "rd_BC", 0, -1, null);
		simple.precedence("wr_BC", "rd_BC_delayed");
		
		simple.delayFor("rd_BC_del", "rd_BC", 1, -1, null);
		simple.precedence("rd_BC_del", "C");
		
		simple.delayFor("wr_CB_weight", "wr_CB", 0, -1, null);
		simple.causality("C", "wr_CB_weight");
		
		simple.delayFor("rd_CB_delayed", "rd_CB", 2, -1, null);
		simple.precedence("wr_CB", "rd_CB_delayed");
		
		simple.periodic("rd_CB_del", "rd_CB", 2, 2, -1);
		simple.precedence("rd_CB_del", "B");
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "SDF_exp";
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
		sts.setBackend(new fr.aoste.sync.gen.STStoDOT(), ".dot");
		sts.setParam("folderName", "sts");
		sts.treat(name, INSTANCE);
	}
}
