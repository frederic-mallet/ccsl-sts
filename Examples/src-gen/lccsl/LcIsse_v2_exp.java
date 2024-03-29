package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;

public class LcIsse_v2_exp implements ISpecificationBuilder {
	static public LcIsse_v2_exp INSTANCE = new LcIsse_v2_exp();
	private LcIsse_v2_exp () {
		// SINGLETON
	}	

	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("A");
		simple.addClock("B");
		simple.addClock("C");
		simple.addClock("read_A_B");
		simple.addClock("read_B_A");
		simple.addClock("write_B_A");
		simple.addClock("read_B_C");
		simple.addClock("write_B_C");
		simple.addClock("read_C_B");
		
		simple.causality("A", "read_A_B");
		
		simple.periodic("read_A_B_del", "read_A_B", 2, 1, -1);
		simple.precedence("read_A_B_del", "B");
		
		simple.periodic("B", "write_B_A", 2, 0, -1);
		simple.causality("write_B_A", "read_B_A", 2, -1);
		
		simple.precedence("read_B_A", "A");
		
		simple.periodic("B", "write_B_C", 2, 0, -1);
		simple.causality("write_B_C", "read_B_C");
		
		simple.precedence("read_B_C", "C");
		
		simple.causality("C", "read_C_B", 2, -1);
		
		simple.periodic("read_C_B_del", "read_C_B", 2, 1, -1);
		simple.precedence("read_C_B_del", "B");
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "Isse_v2_exp";
		
		// do not reduce
		for (IUtility u : utilities) {
			u.treat(name, INSTANCE);
		}
		// no execution
		// no STS generation
	}
}
