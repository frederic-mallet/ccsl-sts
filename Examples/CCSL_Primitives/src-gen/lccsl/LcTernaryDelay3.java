package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;
import fr.kairos.lightccsl.sts.STSUtility;
//import fr.kairos.sts.pojo.choco.ChocoInvariantHelper;
import fr.aoste.sync.ilp.JalinoptInvariantHelper;
import fr.kairos.timesquare.ccsl.reduce.ReduceSpecificationBuilder;

public class LcTernaryDelay3 implements ISpecificationBuilder {
	static public LcTernaryDelay3 INSTANCE = new LcTernaryDelay3();
	private LcTernaryDelay3 () {
		// SINGLETON
	}	

	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("a");
		simple.addClock("sec");
		
		simple.delayFor("b", "a", 3, -1, "sec");
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "TernaryDelay3";
		
		ReduceSpecificationBuilder INSTANCE = new ReduceSpecificationBuilder(LcTernaryDelay3.INSTANCE);
		for (IUtility u : utilities) {
			u.treat(name, INSTANCE);
		}
		// no execution
		
		STSUtility sts = new STSUtility();
		//ChocoInvariantHelper.activate(); // to reduce STS
		JalinoptInvariantHelper.activate(); // to reduce STS
		sts.setBackend(new fr.aoste.sync.gen.STStoDOT(), ".dot");
		sts.setParam("folderName", "sts");
		sts.treat(name, INSTANCE);
	}
}
