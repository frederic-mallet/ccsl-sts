package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;

public class LcSMmodes implements ISpecificationBuilder {
	static public LcSMmodes INSTANCE = new LcSMmodes();
	private LcSMmodes () {
		// SINGLETON
	}	

	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("StartMode");
		simple.addClock("finalMode");
		simple.addClock("Trigger");
		simple.addClock("Context");
		simple.addClock("ReactionTime");
		
		simple.intersection("condition", "Trigger", "Context");
		simple.causality("condition", "finalMode");
		
		simple.delayFor("end", "StartMode", 1, -1, "ReactionTime");
		simple.causality("finalMode", "end");
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "SMmodes";
		
		// do not reduce
		for (IUtility u : utilities) {
			u.treat(name, INSTANCE);
		}
		// no execution
		// no STS generation
	}
}
