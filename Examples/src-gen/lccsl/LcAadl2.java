package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;

public class LcAadl2 implements ISpecificationBuilder {
	static public LcAadl2 INSTANCE = new LcAadl2();
	private LcAadl2 () {
		// SINGLETON
	}	

	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("read");
		simple.addClock("control");
		simple.addClock("t1");
		simple.addClock("t2");
		
		simple.precedence("read", "control");
		
		simple.causality("t1", "read", 0, 1);
		
		simple.causality("t2", "control", 0, 1);
		
		simple.causality("control", "t1", 1, 1);
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "Aadl2";
		
		// do not reduce
		for (IUtility u : utilities) {
			u.treat(name, INSTANCE);
		}
		// no execution
		// no STS generation
	}
}
