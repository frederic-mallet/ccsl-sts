package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;
import fr.kairos.lightccsl.sts.STSJavaBackend;
import fr.kairos.lightccsl.sts.STSUtility;
//import fr.kairos.sts.pojo.choco.ChocoInvariantHelper;
import fr.aoste.sync.ilp.JalinoptInvariantHelper;
import fr.kairos.timesquare.ccsl.reduce.ReduceSpecificationBuilder;

public class Lcscp15_v3b implements ISpecificationBuilder {
	static public Lcscp15_v3b INSTANCE = new Lcscp15_v3b();
	private Lcscp15_v3b () {
		// SINGLETON
	}	

	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("in1");
		simple.addClock("in2");
		simple.addClock("step3");
		simple.addClock("out");
		
		simple.precedence("in1", "step3");
		simple.causality("step3", "out");
		
		simple.precedence("in2", "step3");
		
		simple.union("in", "in1", "in2");
		simple.precedence("in", "out", 0, 1);
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "scp15_v3b";
		
		ReduceSpecificationBuilder INSTANCE = new ReduceSpecificationBuilder(Lcscp15_v3b.INSTANCE);
		for (IUtility u : utilities) {
			u.treat(name, INSTANCE);
		}
		// no execution
		
		STSUtility sts = new STSUtility();
		//ChocoInvariantHelper.activate(); // to reduce STS
		JalinoptInvariantHelper.activate(); // to reduce STS
		sts.setBackend(new STSJavaBackend());
		sts.setParam("folderName", "src-gen/sts");
		sts.treat(name, INSTANCE);
	}
}
