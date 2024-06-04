package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;
import fr.kairos.lightccsl.core.stepper.StepperUtility;
import fr.unice.lightccsl.sat.bdd.BDDSolutionFinder;
import fr.kairos.lightccsl.sts.STSJavaBackend;
import fr.kairos.lightccsl.sts.STSUtility;
//import fr.kairos.sts.pojo.choco.ChocoInvariantHelper;
import fr.aoste.sync.ilp.JalinoptInvariantHelper;
import fr.kairos.timesquare.ccsl.reduce.ReduceSpecificationBuilder;

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
		
		ReduceSpecificationBuilder INSTANCE = new ReduceSpecificationBuilder(Lcadavec.INSTANCE);
		for (IUtility u : utilities) {
			u.treat(name, INSTANCE);
		}
		
		StepperUtility exe = new StepperUtility(new BDDSolutionFinder());
		exe.setParam(StepperUtility.INTERACTIVE, false);
		exe.setBackend(new fr.unice.lightccsl.html.HtmlVCDBackend());
		exe.setParam(StepperUtility.NB_STEPS, 41);
		exe.treat(name, INSTANCE);
		
		STSUtility sts = new STSUtility();
		//ChocoInvariantHelper.activate(); // to reduce STS
		JalinoptInvariantHelper.activate(); // to reduce STS
		sts.setBackend(new STSJavaBackend());
		sts.setParam("folderName", "src-gen/sts");
		sts.treat(name, INSTANCE);
	}
}
