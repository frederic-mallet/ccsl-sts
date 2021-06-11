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

public class scp15_v3 extends ACCSLStsBuilder<SynchronousTransitionSystem>
{
	private FactoryHelper helper = new FactoryHelper();
	public SynchronousTransitionSystem create()
	{
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem("scp15_v3");
		
		Event e0 = helper.createEvent("in1");
		Event e1 = helper.createEvent("step1");
		Event e2 = helper.createEvent("step3");
		Event e3 = helper.createEvent("out");
		Event e4 = helper.createEvent("in2");
		Event e5 = helper.createEvent("step2");
		
		State s0 = helper.createState("p0xp0xp0xp0xp0xUxA0");
		s0.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS)));
		State s1 = helper.createState("pixp0xp0xp0xp0xUxA1");
		s1.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS)));
		State s2 = helper.createState("p0xpixp0xp0xp0xUxA1");
		s2.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS)));
		State s3 = helper.createState("p0xp0xp0xpixp0xUxA1");
		s3.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS)));
		State s4 = helper.createState("p0xp0xp0xp0xpixUxA1");
		s4.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL)));
		State s5 = helper.createState("pixp0xp0xpixp0xUxA1");
		s5.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS)));
		State s6 = helper.createState("p0xpixp0xpixp0xUxA1");
		s6.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS)));
		State s7 = helper.createState("pixp0xp0xp0xpixUxA1");
		s7.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL)));
		State s8 = helper.createState("p0xpixp0xp0xpixUxA1");
		s8.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL)));
		State s9 = helper.createState("p0xp0xpixp0xp0xUxA1");
		s9.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS)));
		sts.setInitial(s0);
		
		helper.createTransition(s0, s1, e0);
		helper.createTransition(s0, s2, e0, e1);
		helper.createTransition(s0, s3, e4);
		helper.createTransition(s0, s4, e4, e5);
		helper.createTransition(s0, s5, e0, e4);
		helper.createTransition(s0, s6, e0, e1, e4);
		helper.createTransition(s0, s7, e0, e4, e5);
		helper.createTransition(s0, s8, e0, e1, e4, e5);
		helper.createTransition(s1, s2, e1);
		helper.createTransition(s3, s4, e5);
		helper.createTransition(s5, s6, e1);
		helper.createTransition(s5, s7, e5);
		helper.createTransition(s5, s8, e1, e5);
		helper.createTransition(s6, s8, e5);
		helper.createTransition(s7, s8, e1);
		helper.createTransition(s8, s9, e2);
		helper.createTransition(s8, s0, e2, e3);
		helper.createTransition(s9, s0, e3);
		
		return sts;
	}
}

