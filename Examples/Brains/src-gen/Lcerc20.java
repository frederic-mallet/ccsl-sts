import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;

public class Lcerc20 implements ISpecificationBuilder {
	static public Lcerc20 INSTANCE = new Lcerc20();
	private Lcerc20 () {
		// SINGLETON
	}
	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("approve");
		simple.addClock("transferFrom");
		simple.addClock("allowance");
		
		simple.exclusion("approve", "transferFrom");
		simple.exclusion("approve", "allowance");
		simple.exclusion("transferFrom", "allowance");
		
		simple.precedence("approve", "transferFrom");
		simple.precedence("transferFrom", "allowance");
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "erc20";
		for (IUtility u : utilities) {
			u.treat(name, INSTANCE);
		}
		// no execution
	}
}
