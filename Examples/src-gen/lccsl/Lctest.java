package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;

public class Lctest implements ISpecificationBuilder {
	static public Lctest INSTANCE = new Lctest();
	private Lctest () {
		// SINGLETON
	}	

	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("ms_s");
		simple.addClock("ms_f");
		simple.addClock("v_s");
		simple.addClock("v_f");
		
		simple.precedence("ms_s", "ms_f", 0, 1);
		
		simple.precedence("v_s", "v_f", 0, 1);
		
		simple.delayFor("v1", "v_s", 1, -1, "ms_f");
		simple.delayFor("v2", "v_f", 1, -1, "ms_f");
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "test";
		
		// do not reduce
		for (IUtility u : utilities) {
			u.treat(name, INSTANCE);
		}
		// no execution
		// no STS generation
	}
}
