package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;

public class Lcsubclock implements ISpecificationBuilder
{
	static public Lcsubclock INSTANCE = new Lcsubclock();
	public void build(ISimpleSpecification spec)
	{
		spec.addClock("minutes");
		spec.addClock("seconds");
		spec.subclock("minutes", "seconds");
	}
	static public void main(String[] args)
	{
		PrettyPrintUtility utility = new PrettyPrintUtility();
		utility.treat("subclock", INSTANCE);
	}
}
