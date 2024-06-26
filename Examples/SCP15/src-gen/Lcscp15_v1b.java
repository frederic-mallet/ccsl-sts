import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;

public class Lcscp15_v1b implements ISpecificationBuilder {
	static public Lcscp15_v1b INSTANCE = new Lcscp15_v1b();
	private Lcscp15_v1b () {
		// SINGLETON
	}
	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("in1");
		simple.addClock("in2");
		simple.addClock("step3");
		simple.addClock("out");
		
		simple.precedence("in1", "step3");
		simple.causality("step3", "out");
		
		simple.precedence("in2", "step3");
		
		simple.inf("in", "in1", "in2");
		
		simple.precedence("in", "out", 0, 1);
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "scp15_v1b";
		for (IUtility u : utilities) {
			u.treat(name, INSTANCE);
		}
		// no execution
	}
}
