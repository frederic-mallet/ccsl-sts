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

public class Aadl2 extends ACCSLStsBuilder<SynchronousTransitionSystem>
{
	private FactoryHelper helper = new FactoryHelper();
	public SynchronousTransitionSystem create()
	{
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem("Aadl2");
		
		Event e0 = helper.createEvent("read");
		Event e1 = helper.createEvent("control");
		Event e2 = helper.createEvent("t1");
		Event e3 = helper.createEvent("t2");
		
		State s0 = helper.createState("p0xZxZxinitxp0");
		s0.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e0), 0, ComparisonOperator.EQUALS), inv(diff(e3, e1), 0, ComparisonOperator.EQUALS)));
		State s1 = helper.createState("p0xZxP1xinitxp0");
		s1.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e0), 0, ComparisonOperator.EQUALS), inv(diff(e3, e1), 1, ComparisonOperator.EQUALS)));
		State s2 = helper.createState("p0xP1xZxd1xp0");
		s2.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e0), 1, ComparisonOperator.EQUALS), inv(diff(e3, e1), 0, ComparisonOperator.EQUALS)));
		State s3 = helper.createState("pixZxZxd1xp0");
		s3.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e0), 0, ComparisonOperator.EQUALS), inv(diff(e3, e1), 0, ComparisonOperator.EQUALS)));
		State s4 = helper.createState("p0xP1xP1xd1xp0");
		s4.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e0), 1, ComparisonOperator.EQUALS), inv(diff(e3, e1), 1, ComparisonOperator.EQUALS)));
		State s5 = helper.createState("pixZxP1xd1xp0");
		s5.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e0), 0, ComparisonOperator.EQUALS), inv(diff(e3, e1), 1, ComparisonOperator.EQUALS)));
		State s6 = helper.createState("p0xZxZxd1xpi");
		s6.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e0), 0, ComparisonOperator.EQUALS), inv(diff(e3, e1), 0, ComparisonOperator.EQUALS)));
		State s7 = helper.createState("p0xZxP1xd1xpi");
		s7.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e0), 0, ComparisonOperator.EQUALS), inv(diff(e3, e1), 1, ComparisonOperator.EQUALS)));
		sts.setInitial(s0);
		
		helper.createTransition(s0, s1, e3);
		helper.createTransition(s0, s2, e2);
		helper.createTransition(s0, s3, e0, e2);
		helper.createTransition(s0, s4, e2, e3);
		helper.createTransition(s0, s5, e0, e2, e3);
		helper.createTransition(s1, s4, e2);
		helper.createTransition(s1, s5, e0, e2);
		helper.createTransition(s2, s3, e0);
		helper.createTransition(s2, s4, e3);
		helper.createTransition(s2, s5, e0, e3);
		helper.createTransition(s3, s5, e3);
		helper.createTransition(s3, s6, e1, e3);
		helper.createTransition(s4, s5, e0);
		helper.createTransition(s5, s6, e1);
		helper.createTransition(s5, s7, e1, e3);
		helper.createTransition(s6, s7, e3);
		
		return sts;
	}
}

