import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;

public class LcAadl1 implements ISpecificationBuilder {
	static public LcAadl1 INSTANCE = new LcAadl1();
	private LcAadl1 () {
		// SINGLETON
	}
	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("read");
		simple.addClock("control");
		simple.addClock("t1");
		simple.addClock("t2");
		
		simple.precedence("read", "control");
		
		simple.causality("t1", "read", 0, 1);
		
		simple.causality("t2", "control", 0, 1);
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "Aadl1";
		for (IUtility u : utilities) {
			u.treat(name, INSTANCE);
		}
		// no execution
	}
}
