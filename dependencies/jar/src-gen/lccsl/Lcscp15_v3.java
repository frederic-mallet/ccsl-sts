package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;

public class Lcscp15_v3 implements ISpecificationBuilder
{
	static public Lcscp15_v3 INSTANCE = new Lcscp15_v3();
	public void build(ISimpleSpecification spec)
	{
		spec.addClock("in1");
		spec.addClock("in2");
		spec.addClock("step1");
		spec.addClock("step2");
		spec.addClock("step3");
		spec.addClock("out");
		spec.causality("in1", "step1", 0, -1);
		spec.precedence("step1", "step3", 0, -1);
		spec.causality("step3", "out", 0, -1);
		spec.causality("in2", "step2", 0, -1);
		spec.precedence("step2", "step3", 0, -1);
		spec.union("in", "in1", "in2");
		spec.precedence("in", "out", 0, 1);
	}
	static public void main(String[] args)
	{
		PrettyPrintUtility utility = new PrettyPrintUtility();
		utility.treat("scp15_v3", INSTANCE);
	}
}
