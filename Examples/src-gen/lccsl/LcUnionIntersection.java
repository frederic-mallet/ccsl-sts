package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;

public class LcUnionIntersection implements ISpecificationBuilder {
	static public LcUnionIntersection INSTANCE = new LcUnionIntersection();
	private LcUnionIntersection () {
		// SINGLETON
	}	

	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("a");
		simple.addClock("b");
		simple.addClock("c");
		simple.addClock("d");
		
		simple.union("u_0", "a", "b", "c");
		simple.intersection("u", "d", "u_0");
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "UnionIntersection";
		
		// do not reduce
		for (IUtility u : utilities) {
			u.treat(name, INSTANCE);
		}
		// no execution
		// no STS generation
	}
}
