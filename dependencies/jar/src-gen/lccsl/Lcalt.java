package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;

public class Lcalt implements ISpecificationBuilder
{
	static public Lcalt INSTANCE = new Lcalt();
	public void build(ISimpleSpecification spec)
	{
		spec.addClock("a");
		spec.addClock("c");
		spec.delayFor("b", "a", 1, -1, null);
		spec.precedence("a", "c", 0, -1);
		spec.precedence("c", "b", 0, -1);
	}
	static public void main(String[] args)
	{
		PrettyPrintUtility utility = new PrettyPrintUtility();
		utility.treat("alt", INSTANCE);
	}
}
