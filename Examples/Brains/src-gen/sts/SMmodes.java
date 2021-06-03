package sts;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;
import fr.kairos.lightccsl.core.stepper.StepperUtility;
import fr.unice.lightccsl.sat.SAT4JSolutionFinder;

public class SMmodes implements ISpecificationBuilder {
	static public SMmodes INSTANCE = new SMmodes();
	private SMmodes () {
		// SINGLETON
	}
	@Override
	public void build(ISimpleSpecification simple) {
//		exclusionCondition ("raining", "sun", "fog");
//		exclusionCondition ("drunk", "inebrieated", "...");
//		exclusionCondition ("countryside", "highway", "...");
		
		changeMode(simple, "Manual", "Automatic", "startRaining"); // scenario 1
		changeMode(simple, "Manual", "Automatic", "driverDrunk");  // scenario 3
		changeMode(simple, "Manual", "Automatic", "sensorFailing"); // scenario 7
		changeMode(simple, "Automatic", "MRM", "sensorFailing"); // scenario 45
		
//		changeMode(simple, "MRM", "Manual");
	}
	public void changeMode(ISimpleSpecification simple, String start, String finish, String trigger) {
		simple.addClock(start);
		simple.addClock(finish);
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
		for (IUtility u : utilities) {
			u.treat(name, INSTANCE);
		}
		
		StepperUtility exe = new StepperUtility(new SAT4JSolutionFinder());
		exe.setParam(StepperUtility.INTERACTIVE, true);
		exe.setBackend(new fr.unice.lightccsl.html.HtmlVCDBackend());
		exe.treat(name, INSTANCE);
		// no STS generation
	}
}
