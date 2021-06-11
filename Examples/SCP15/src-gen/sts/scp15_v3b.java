package sts;

import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.creator.FactoryHelper;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import static fr.aoste.sync.creator.InvariantBuilder.diff;
import fr.aoste.sync.vspec.ComparisonOperator;
import static fr.aoste.sync.creator.InvariantBuilder.inv;
import static fr.aoste.sync.creator.InvariantBuilder.conjunction;

public class scp15_v3b extends ACCSLStsBuilder<SynchronousTransitionSystem>
{
	private FactoryHelper helper = new FactoryHelper();
	public SynchronousTransitionSystem create()
	{
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem("scp15_v3b");
		
		Event e0 = helper.createEvent("in1");
		Event e1 = helper.createEvent("step3");
		Event e2 = helper.createEvent("out");
		Event e3 = helper.createEvent("in2");
		
		State s0 = helper.createState("p0xp0xp0xUxA0");
		s0.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e3, e1), 0, ComparisonOperator.EQUALS)));
		State s1 = helper.createState("pixp0xp0xUxA1");
		s1.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e3, e1), 0, ComparisonOperator.EQUALS)));
		State s2 = helper.createState("p0xp0xpixUxA1");
		s2.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e3, e1), 1, ComparisonOperator.GREATEROREQUAL)));
		State s3 = helper.createState("pixp0xpixUxA1");
		s3.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e3, e1), 1, ComparisonOperator.GREATEROREQUAL)));
		State s4 = helper.createState("p0xpixp0xUxA1");
		s4.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e1), 0, ComparisonOperator.EQUALS)));
		sts.setInitial(s0);
		
		helper.createTransition(s0, s1, e0);
		helper.createTransition(s0, s2, e3);
		helper.createTransition(s0, s3, e0, e3);
		helper.createTransition(s3, s4, e1);
		helper.createTransition(s3, s0, e1, e2);
		helper.createTransition(s4, s0, e2);
		
		return sts;
	}
}

