package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;
import fr.kairos.lightccsl.sts.STSUtility;
//import fr.kairos.sts.pojo.choco.ChocoInvariantHelper;
import fr.aoste.sync.ilp.JalinoptInvariantHelper;

public class Lctest1b implements ISpecificationBuilder {
	static public Lctest1b INSTANCE = new Lctest1b();
	private Lctest1b () {
		// SINGLETON
	}	

	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("m_s");
		simple.addClock("m_f");
		simple.addClock("v_s");
		simple.addClock("v_f");
		
		// Alternation "m_s", "m_f"
		simple.precedence("m_s", "m_f", 0, 1);
		// Alternation "v_s", "v_f"
		simple.precedence("v_s", "v_f", 0, 1);
		
		simple.exclusion("m_s", "v_s");
		simple.exclusion("m_s", "m_f");
		simple.exclusion("m_s", "v_f");
		simple.exclusion("v_s", "m_f");
		simple.exclusion("v_s", "v_f");
		simple.exclusion("m_f", "v_f");
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "test1b";
		
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
