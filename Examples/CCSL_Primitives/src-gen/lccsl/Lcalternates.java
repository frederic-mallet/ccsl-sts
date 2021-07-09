package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;
import fr.kairos.lightccsl.sts.STSUtility;
//import fr.kairos.sts.pojo.choco.ChocoInvariantHelper;
import fr.aoste.sync.ilp.JalinoptInvariantHelper;
import fr.kairos.timesquare.ccsl.reduce.ReduceSpecificationBuilder;

public class Lcalternates implements ISpecificationBuilder {
	static public Lcalternates INSTANCE = new Lcalternates();
	private Lcalternates () {
		// SINGLETON
	}	

	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("a");
		simple.addClock("b");
		
		simple.precedence("a", "b", 0, 1);
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "alternates";
		
		ReduceSpecificationBuilder INSTANCE = new ReduceSpecificationBuilder(Lcalternates.INSTANCE);
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
