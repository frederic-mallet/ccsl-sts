package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;

public class Lcdemo implements ISpecificationBuilder
{
	static public Lcdemo INSTANCE = new Lcdemo();
	public void build(ISimpleSpecification spec)
	{
		spec.addClock("a");
		spec.addClock("b");
		spec.addClock("c");
		spec.precedence("a", "b", 0, -1);
		spec.causality("b", "c", 0, -1);
		spec.periodic("d", "a", 2, 0, -1);
	}
	static public void main(String[] args)
	{
		PrettyPrintUtility utility = new PrettyPrintUtility();
		utility.treat("demo", INSTANCE);
	}
}
