package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;

public class Lcsafe implements ISpecificationBuilder {
	static public Lcsafe INSTANCE = new Lcsafe();
	private Lcsafe () {
		// SINGLETON
	}	

	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("approve");
		simple.addClock("transferFrom");
		simple.addClock("allowance");
		
		simple.delayFor("two_safe", "approve", 2, -1, null);
		simple.precedence("approve", "transferFrom");
		simple.precedence("transferFrom", "allowance");
		simple.precedence("allowance", "two_safe");
		
		simple.exclusion("approve", "transferFrom");
		simple.exclusion("approve", "allowance");
		simple.exclusion("transferFrom", "allowance");
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "safe";
		
		// do not reduce
		for (IUtility u : utilities) {
			u.treat(name, INSTANCE);
		}
		// no execution
		// no STS generation
	}
}
