import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;

public class Lcseq implements ISpecificationBuilder {
	static public Lcseq INSTANCE = new Lcseq();
	private Lcseq () {
		// SINGLETON
	}
	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("approve");
		simple.addClock("transferFrom");
		simple.addClock("allowance");
		
		simple.delayFor("one_safe", "approve", 1, -1, null);
		
		simple.precedence("approve", "transferFrom");
		simple.precedence("transferFrom", "allowance");
		simple.precedence("allowance", "one_safe");
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "seq";
		for (IUtility u : utilities) {
			u.treat(name, INSTANCE);
		}
		// no execution
	}
}
