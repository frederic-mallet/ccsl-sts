package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;
import fr.kairos.lightccsl.sts.STSUtility;
//import fr.kairos.sts.pojo.choco.ChocoInvariantHelper;
import fr.aoste.sync.ilp.JalinoptInvariantHelper;

public class Lcinterlocking_simple implements ISpecificationBuilder {
	static public Lcinterlocking_simple INSTANCE = new Lcinterlocking_simple();
	private Lcinterlocking_simple () {
		// SINGLETON
	}	

	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("request");
		simple.addClock("inquiry");
		simple.addClock("checkFail");
		simple.addClock("redPulse");
		simple.addClock("showRed");
		simple.addClock("wait");
		simple.addClock("checkSucc");
		simple.addClock("greenPulse");
		simple.addClock("showGreen");
		simple.addClock("enter");
		simple.addClock("leave");
		simple.addClock("getOccupied");
		simple.addClock("getUnoccupied");
		simple.addClock("tmp1");
		simple.addClock("tmp2");
		
		simple.precedence("request", "inquiry");
		simple.precedence("inquiry", "responseOfTrack");
		
		simple.precedence("checkFail", "redPulse");
		simple.causality("redPulse", "showRed");
		simple.precedence("showRed", "wait");
		simple.precedence("wait", "greenPulse");
		simple.causality("greenPulse", "showGreen");
		simple.precedence("showGreen", "enter");
		simple.precedence("enter", "leave");
		
		simple.subclock("enter", "getOccupied");
		simple.subclock("leave", "getUnoccupied");
		simple.precedence("getOccupied", "tmp1", 0, 1);
		
		simple.precedence("getUnoccupied", "tmp1", 0, 1);
		
		simple.subclock("checkFail", "tmp1");
		simple.precedence("tmp2", "getOccupied");
		
		simple.union("responseOfTrack", "checkSucc", "checkFail");
		simple.union("responseOfTrain", "enter", "wait");
		simple.precedence("getUnoccupied", "getOccupied", 0, 1);
		
		
		simple.exclusion("getOccupied", "getUnoccupied");
		simple.precedence("request", "responseOfTrain", 0, 1);
		
		simple.precedence("getUnoccupied", "tmp2");
		
		simple.subclock("checkSucc", "tmp2");
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "interlocking_simple";
		
		// do not reduce
		for (IUtility u : utilities) {
			u.treat(name, INSTANCE);
		}
		// no execution
		
		STSUtility sts = new STSUtility();
		//ChocoInvariantHelper.activate(); // to reduce STS
		JalinoptInvariantHelper.activate(); // to reduce STS
		sts.setBackend(new fr.aoste.sync.gen.STStoDOT(), ".dot");
		sts.setParam("folderName", "sts");
		sts.treat(name, INSTANCE);
	}
}
