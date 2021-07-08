package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;
import fr.kairos.timesquare.ccsl.simple.IUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;
import fr.kairos.lightccsl.sts.STSUtility;
//import fr.kairos.sts.pojo.choco.ChocoInvariantHelper;
import fr.aoste.sync.ilp.JalinoptInvariantHelper;
import fr.kairos.timesquare.ccsl.reduce.ReduceSpecificationBuilder;

public class LcIsse_v2 implements ISpecificationBuilder {
	static public LcIsse_v2 INSTANCE = new LcIsse_v2();
	private LcIsse_v2 () {
		// SINGLETON
	}	

	public void token(ISimpleSpecification simple, int del, int max, String... _c) {
		int _i = 0;
		int _write = _i++;
		int _read = _i++;
		
		simple.causality(_c[_write], _c[_read], del, -1);
	}

	public void input(ISimpleSpecification simple, int weight, String... _c) {
		int _i = 0;
		int _actor = _i++;
		int _read = _i++;
		
		simple.periodic(local(_c[_read], "del"), _c[_read], weight, weight-1, -1);
		simple.precedence(local(_c[_read], "del"), _c[_actor]);
	}

	public void output(ISimpleSpecification simple, int weight, String... _c) {
		int _i = 0;
		int _actor = _i++;
		int _write = _i++;
		
		simple.periodic(local(_c[_write], "weight"), _c[_write], weight, 0, -1);
		simple.causality(_c[_actor], local(_c[_write], "weight"), 0, 0);
	}

	public void arc(ISimpleSpecification simple, int delay, int out, int in, String... _c) {
		int _i = 0;
		int _source = _i++;
		int _target = _i++;
		simple.addClock("read_source_target");
		simple.addClock("write_source_target");
		
		output(simple, out, _c[_source], "write_source_target");
		token(simple, delay, in, "write_source_target", "read_source_target");
		input(simple, in, _c[_target], "read_source_target");		
	}

	@Override
	public void build(ISimpleSpecification simple) {
		simple.addClock("A");
		simple.addClock("B");
		simple.addClock("C");
		
		arc(simple, 0, 1, 2, "A", "B");
		arc(simple, 2, 2, 1, "B", "A");
		arc(simple, 0, 2, 1, "B", "C");
		arc(simple, 2, 1, 2, "C", "B");
	}
	private static String local(String base, String ext) { return base+"_"+ext; }
	private static IUtility[] utilities = { 
		new fr.kairos.timesquare.ccsl.simple.PrettyPrintUtility()
	};
	public static void main(String[] args) {
		String name = "Isse_v2";
		
		ReduceSpecificationBuilder INSTANCE = new ReduceSpecificationBuilder(LcIsse_v2.INSTANCE);
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
