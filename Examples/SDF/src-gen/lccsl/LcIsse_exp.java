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

public class LcIsse_exp implements ISpecificationBuilder {
	static public LcIsse_exp INSTANCE = new LcIsse_exp();
	private LcIsse_exp () {
		// SINGLETON
	}	

	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("A");
		simple.addClock("B");
		simple.addClock("C");
		simple.addClock("read_A_B");
		simple.addClock("read_B_C");
		simple.addClock("write_B_C");
		simple.addClock("read_C_B");
		
		simple.causality("A", "read_A_B");
		
		simple.periodic("read_A_B_del", "read_A_B", 2, 1, -1);
		simple.precedence("read_A_B_del", "B");
		
		simple.periodic("B", "write_B_C", 2, 0, -1);
		simple.causality("write_B_C", "read_B_C");
		
		simple.precedence("read_B_C", "C");
		
		simple.causality("C", "read_C_B", 2, -1);
		
		simple.periodic("read_C_B_del", "read_C_B", 2, 1, -1);
		simple.precedence("read_C_B_del", "B");
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "Isse_exp";
		
		ReduceSpecificationBuilder INSTANCE = new ReduceSpecificationBuilder(LcIsse_exp.INSTANCE);
		for (IUtility u : utilities) {
			u.treat(name, INSTANCE);
		}
		
		StepperUtility exe = new StepperUtility(new BDDSolutionFinder());
		exe.setParam(StepperUtility.INTERACTIVE, true);
		exe.setBackend(new fr.unice.lightccsl.html.HtmlVCDBackend());
		exe.treat(name, INSTANCE);
		
		STSUtility sts = new STSUtility();
		//ChocoInvariantHelper.activate(); // to reduce STS
		JalinoptInvariantHelper.activate(); // to reduce STS
		sts.setBackend(new fr.aoste.sync.gen.STStoDOT(), ".dot");
		sts.setParam("folderName", "sts");
		sts.treat(name, INSTANCE);
	}
}
