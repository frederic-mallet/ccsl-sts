import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;

public class LcSDF_ab implements ISpecificationBuilder {
	static public LcSDF_ab INSTANCE = new LcSDF_ab();
	private LcSDF_ab () {
		// SINGLETON
	}
	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("A");
		simple.addClock("B");
		simple.addClock("rd_AB");
		
		simple.causality("A", "rd_AB", 0, 2);
		
		simple.periodic("rd_AB_del", "rd_AB", 2, 1, -1);
		
		simple.precedence("rd_AB_del", "B", 0, 1);
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "SDF_ab";
		for (IUtility u : utilities) {
			u.treat(name, INSTANCE);
		}
		// no execution
	}
}
