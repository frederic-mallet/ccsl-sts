package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;

public class Safe implements ISpecificationBuilder {
	static public Safe INSTANCE = new Safe();
	private Safe () {
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

	public static void main(String[] args) {
		JavaToC javaToC = new JavaToC();
		INSTANCE.build(javaToC);

	}
}
