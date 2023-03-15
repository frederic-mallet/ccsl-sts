package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;

public class Lcscp15_v3 implements ISpecificationBuilder {
	static public Lcscp15_v3 INSTANCE = new Lcscp15_v3();
	private Lcscp15_v3 () {
		// SINGLETON
	}	

	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("in1");
		simple.addClock("in2");
		simple.addClock("step1");
		simple.addClock("step2");
		simple.addClock("step3");
		simple.addClock("out");
		
		simple.causality("in1", "step1");
		simple.precedence("step1", "step3");
		simple.causality("step3", "out");
		
		simple.causality("in2", "step2");
		simple.precedence("step2", "step3");
		
		simple.union("in", "in1", "in2");
		simple.precedence("in", "out", 0, 1);
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "scp15_v3";
		
		// do not reduce
		for (IUtility u : utilities) {
			u.treat(name, INSTANCE);
		}
		// no execution
		// no STS generation
	}
}
