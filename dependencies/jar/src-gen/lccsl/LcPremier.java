package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;

public class LcPremier implements ISpecificationBuilder
{
	static public LcPremier INSTANCE = new LcPremier();
	public void build(ISimpleSpecification spec)
	{
		spec.addClock("a");
		spec.addClock("b");
		spec.addClock("c");
		spec.addClock("d");
		spec.addClock("e");
		spec.addClock("f");
		spec.precedence("a", "b", 0, -1);
		spec.precedence("b", "c", 0, -1);
		spec.exclusion("a", "c");
	}
	static public void main(String[] args)
	{
		PrettyPrintUtility utility = new PrettyPrintUtility();
		utility.treat("Premier", INSTANCE);
	}
}
