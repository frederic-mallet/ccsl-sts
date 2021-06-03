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
		String[][] modes = { 
				 {"Auto", "Manual"},  
				 {"Manual", "MRM"}, 
				 { "MRM", "Degraded"}};

		for (int i = 0; i < modes.length; i++) {
			changeMode(simple, modes[i][0], modes[i][1]);
		}
	}
	private static int i = 0;
	private void changeMode(ISimpleSpecification simple, String initialMode, String finalMode) {
		String mode = "mode" + (i++);
		simple.addClock(initialMode);
		simple.addClock(finalMode);
		simple.addClock("Trigger");
		simple.addClock("ReactionTime");

		simple.union(mode, initialMode, finalMode);

		simple.exclusion(initialMode, finalMode);

		simple.delayFor("Delay", "Trigger", 1, -1, null);

		simple.precedence("Mode", "Trigger");
		simple.precedence("Trigger", "Mode");
		simple.causality("Mode", "Delay", 0, 1);
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
