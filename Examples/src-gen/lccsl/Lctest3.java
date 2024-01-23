package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;
import fr.kairos.lightccsl.sts.STSUtility;
//import fr.kairos.sts.pojo.choco.ChocoInvariantHelper;
import fr.aoste.sync.ilp.JalinoptInvariantHelper;

public class Lctest3 implements ISpecificationBuilder {
	static public Lctest3 INSTANCE = new Lctest3();
	private Lctest3 () {
		// SINGLETON
	}	

	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("v_s");
		simple.addClock("v_f");
		simple.addClock("m_s");
		simple.addClock("m_f");
		
		// Alternation "v_s", "v_f"
		simple.precedence("v_s", "v_f", 0, 1);
		// Alternation "m_s", "m_f"
		simple.precedence("m_s", "m_f", 0, 1);
		simple.xor("u1", "m_s", "v_f");
		simple.xor("u2", "m_f", "v_s");
		// Alternation "u1", "u2"
		simple.precedence("u1", "u2", 0, 1);
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "test3";
		
		// do not reduce
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
