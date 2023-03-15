package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;

public class Lctimed implements ISpecificationBuilder {
	static public Lctimed INSTANCE = new Lctimed();
	private Lctimed () {
		// SINGLETON
	}	

	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("approve");
		simple.addClock("transferFrom");
		simple.addClock("allowance");
		simple.addClock("minutes");
		
		simple.delayFor("deadline", "approve", 2, -1, "minutes");
		simple.precedence("approve", "transferFrom");
		simple.precedence("transferFrom", "allowance");
		simple.precedence("allowance", "deadline");
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "timed";
		
		// do not reduce
		for (IUtility u : utilities) {
			u.treat(name, INSTANCE);
		}
		// no execution
		// no STS generation
	}
}
