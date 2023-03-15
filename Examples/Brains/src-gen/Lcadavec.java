import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;

public class Lcadavec implements ISpecificationBuilder {
	static public Lcadavec INSTANCE = new Lcadavec();
	private Lcadavec () {
		// SINGLETON
	}
	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("Urban");
		simple.addClock("Highway");
		simple.addClock("interurban");
		simple.addClock("Sunny");
		simple.addClock("Night");
		simple.addClock("On");
		simple.addClock("Off");
		
		simple.union("Road", "Urban", "Highway", "interurban");
		
		simple.exclusion("Urban", "Highway");
		simple.exclusion("Urban", "interurban");
		simple.exclusion("Highway", "interurban");
		
		simple.union("Daytime", "Sunny", "Night");
		
		simple.causality("Sunny", "Night", 0, 1);
		
		simple.union("sensor", "On", "Off");
		
		simple.causality("On", "Off", 0, 2);
		
		simple.precedence("sensor", "Daytime", 0, 1);
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "adavec";
		for (IUtility u : utilities) {
			u.treat(name, INSTANCE);
		}
		// no execution
	}
}
