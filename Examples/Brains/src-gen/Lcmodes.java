import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;

public class Lcmodes implements ISpecificationBuilder {
	static public Lcmodes INSTANCE = new Lcmodes();
	private Lcmodes () {
		// SINGLETON
	}
	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("Mode1");
		simple.addClock("Mode2");
		simple.addClock("Trigger");
		simple.addClock("ReactionTime");
		
		simple.union("Mode", "Mode1", "Mode2");
		
		simple.exclusion("Mode1", "Mode2");
		
		simple.delayFor("Delay", "Trigger", 1, -1, null);
		
		simple.precedence("Mode", "Trigger");
		simple.precedence("Trigger", "Mode");
		simple.causality("Mode", "Delay");
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "modes";
		for (IUtility u : utilities) {
			u.treat(name, INSTANCE);
		}
		// no execution
	}
}
