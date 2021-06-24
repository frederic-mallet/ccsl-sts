package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;
import fr.kairos.lightccsl.core.stepper.StepperUtility;
import fr.unice.lightccsl.sat.bdd.BDDSolutionFinder;
import fr.kairos.lightccsl.sts.STSUtility;
//import fr.kairos.sts.pojo.choco.ChocoInvariantHelper;
import fr.aoste.sync.ilp.JalinoptInvariantHelper;
import fr.kairos.timesquare.ccsl.reduce.ReduceSpecificationBuilder;

public class Lcerc20 implements ISpecificationBuilder {
	static public Lcerc20 INSTANCE = new Lcerc20();
	private Lcerc20 () {
		// SINGLETON
	}	

	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("approve");
		simple.addClock("transferFrom");
		simple.addClock("allowance");
		
		simple.exclusion("approve", "transferFrom");
		simple.exclusion("approve", "allowance");
		simple.exclusion("transferFrom", "allowance");
		
		simple.precedence("approve", "transferFrom");
		simple.precedence("transferFrom", "allowance");
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "erc20";
		
		ReduceSpecificationBuilder INSTANCE = new ReduceSpecificationBuilder(Lcerc20.INSTANCE);
		for (IUtility u : utilities) {
			u.treat(name, INSTANCE);
		}
		
		StepperUtility exe = new StepperUtility(new BDDSolutionFinder());
		exe.setParam(StepperUtility.INTERACTIVE, false);
		exe.setBackend(new fr.unice.lightccsl.html.HtmlVCDBackend());
		exe.setParam(StepperUtility.NB_STEPS, 20);
		exe.treat(name, INSTANCE);
		
		STSUtility sts = new STSUtility();
		//ChocoInvariantHelper.activate(); // to reduce STS
		JalinoptInvariantHelper.activate(); // to reduce STS
		sts.setBackend(new fr.aoste.sync.gen.STStoDOT(), ".dot");
		sts.setParam("folderName", "sts");
		sts.treat(name, INSTANCE);
	}
}
