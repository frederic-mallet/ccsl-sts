package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;
import fr.kairos.lightccsl.sts.STSUtility;
//import fr.kairos.sts.pojo.choco.ChocoInvariantHelper;
import fr.aoste.sync.ilp.JalinoptInvariantHelper;
import fr.kairos.timesquare.ccsl.reduce.ReduceSpecificationBuilder;

public class LcSDF implements ISpecificationBuilder {
	static public LcSDF INSTANCE = new LcSDF();
	private LcSDF () {
		// SINGLETON
	}	

	public void token(ISimpleSpecification simple, int del, int max, String... _c) {
		int _i = 0;
		int _write = _i++;
		int _read = _i++;
		
		simple.causality(_c[_write], _c[_read], del, max);
	}

	public void input(ISimpleSpecification simple, int weight, String... _c) {
		int _i = 0;
		int _actor = _i++;
		int _read = _i++;
		
		simple.periodic(_c[_read] + "_" + "del", _c[_read], weight, weight-1, -1);
		simple.precedence(_c[_read] + "_" + "del", _c[_actor], 0, 1);
	}

	public void output(ISimpleSpecification simple, int weight, String... _c) {
		int _i = 0;
		int _actor = _i++;
		int _write = _i++;
		
		simple.periodic(_c[_write] + "_" + "weight", _c[_write], weight, 0, -1);
		simple.causality(_c[_actor], _c[_write] + "_" + "weight", 0, 0);
	}

	public void arc(ISimpleSpecification simple, int del, int out, int in, String... _c) {
		int _i = 0;
		int _source = _i++;
		int _target = _i++;
		int _write = _i++;
		int _read = _i++;
		
		output(simple, out, _c[_source], _c[_write]);
		token(simple, del, in, _c[_write], _c[_read]);
		input(simple, in, _c[_target], _c[_read]);		
	}

	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("A");
		simple.addClock("B");
		simple.addClock("C");
		simple.addClock("wr_AB");
		simple.addClock("rd_AB");
		simple.addClock("wr_BC");
		simple.addClock("rd_BC");
		simple.addClock("wr_CB");
		simple.addClock("rd_CB");
		
		arc(simple, 0, 1, 2, "A", "B", "wr_AB", "rd_AB");
		arc(simple, 0, 2, 1, "B", "C", "wr_BC", "rd_BC");
		arc(simple, 2, 1, 2, "C", "B", "wr_CB", "rd_CB");
	}
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "SDF";
		
		ReduceSpecificationBuilder INSTANCE = new ReduceSpecificationBuilder(LcSDF.INSTANCE);
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
