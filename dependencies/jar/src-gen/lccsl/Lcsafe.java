package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;

public class Lcsafe implements ISpecificationBuilder
{
	static public Lcsafe INSTANCE = new Lcsafe();
	public void build(ISimpleSpecification spec)
	{
		spec.addClock("approve");
		spec.addClock("transferFrom");
		spec.addClock("allowance");
		spec.delayFor("two_safe", "approve", 2, -1, null);
		spec.precedence("approve", "transferFrom", 0, -1);
		spec.precedence("transferFrom", "allowance", 0, -1);
		spec.precedence("allowance", "two_safe", 0, -1);
		spec.exclusion("approve", "transferFrom");
		spec.exclusion("approve", "allowance");
		spec.exclusion("transferFrom", "allowance");
	}
	static public void main(String[] args)
	{
		PrettyPrintUtility utility = new PrettyPrintUtility();
		utility.treat("safe", INSTANCE);
	}
}
