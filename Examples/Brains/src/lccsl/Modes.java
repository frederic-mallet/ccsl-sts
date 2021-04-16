package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;
import fr.kairos.lightccsl.core.stepper.StepperUtility;
import fr.kairos.lightccsl.sts.STSSolutionFinder;
import fr.kairos.lightccsl.sts.STSUtility;
//import fr.kairos.sts.pojo.choco.ChocoInvariantHelper;
import fr.aoste.sync.ilp.JalinoptInvariantHelper;

public class Modes implements ISpecificationBuilder {
	static public Modes INSTANCE = new Modes();
	private Modes () {
		// SINGLETON
	}
	@Override
	public void build(ISimpleSpecification simple) {
		String[] modes = { "Auto", "Manual", "MRM" };

		for (String m1 : modes) {
			changeMode(simple, m1, "MRM");
		}
	}
	private void changeMode(ISimpleSpecification simple, String initialMode, String finalMode) {
		simple.addClock(initialMode);
		simple.addClock("Mode2");
		simple.addClock("Trigger");
		simple.addClock("ReactionTime");

		simple.union("Mode", initialMode, "Mode2");

		simple.exclusion(initialMode, "Mode2");

		//simple.delayFor("Delay", "Trigger", 1, -1, "ReactionTime");

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

		StepperUtility exe = new StepperUtility(new STSSolutionFinder());
		exe.setParam(StepperUtility.INTERACTIVE, true);
		exe.setBackend(new fr.unice.lightccsl.html.HtmlVCDBackend());
		exe.treat(name, INSTANCE);

		STSUtility sts = new STSUtility();
		//ChocoInvariantHelper.activate(); // to reduce STS
		JalinoptInvariantHelper.activate(); // to reduce STS
		sts.setBackend(new fr.aoste.sync.gen.STStoDOT(), ".dot");
		sts.setParam("folderName", "sts");
		sts.treat(name, INSTANCE);
	}
}
