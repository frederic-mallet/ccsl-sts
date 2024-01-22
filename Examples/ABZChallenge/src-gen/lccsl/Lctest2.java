package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;
import fr.kairos.lightccsl.sts.STSUtility;
//import fr.kairos.sts.pojo.choco.ChocoInvariantHelper;
import fr.aoste.sync.ilp.JalinoptInvariantHelper;
import fr.kairos.timesquare.ccsl.reduce.ReduceSpecificationBuilder;

public class Lctest2 implements ISpecificationBuilder {
	static public Lctest2 INSTANCE = new Lctest2();
	private Lctest2 () {
		// SINGLETON
	}	

	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("m_s");
		simple.addClock("m_f");
		simple.addClock("v_s");
		simple.addClock("v_f");
		
		simple.precedence("m_s", "m_f", 0, 1);
		
		simple.precedence("v_s", "v_f", 0, 1);
		
		simple.delayFor("v1", "v_s", 1, -1, "m_f");
		simple.delayFor("v2", "v_f", 1, -1, "m_f");
		simple.subclock("v1", "v2");
		
		simple.subclock("v2", "v1");
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "test2";
		
		ReduceSpecificationBuilder INSTANCE = new ReduceSpecificationBuilder(Lctest2.INSTANCE);
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
