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
import fr.aoste.sync.Transition;

public class erc20 extends ACCSLStsBuilder<SynchronousTransitionSystem>
{
	private FactoryHelper helper = new FactoryHelper();
	public SynchronousTransitionSystem create()
	{
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem("erc20");
		
		Event e0 = helper.createEvent("approve");
		Event e1 = helper.createEvent("transferFrom");
		Event e2 = helper.createEvent("allowance");
		
		State s0 = helper.createState("XxXxXxp0xp0");
		s0.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS)));
		State s1 = helper.createState("XxXxXxpixp0");
		s1.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS)));
		State s2 = helper.createState("XxXxXxp0xpi");
		s2.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL)));
		State s3 = helper.createState("XxXxXxpixpi");
		s3.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL)));
		sts.setInitial(s0);
		
		helper.createTransition(s0, s1, e0);
		helper.createTransition(s1, s1, e0);
		// no header
		{
			Transition t = helper.createTransition(s1, s2, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s1, s3, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s2, s3, e0);
		// no header
		{
			Transition t = helper.createTransition(s2, s0, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s2, s2, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s3, s3, e0);
		// no header
		{
			Transition t = helper.createTransition(s3, s1, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s3, s2, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s3, s3, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s3, s3, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		
		return sts;
	}
}

