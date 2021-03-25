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

public class Aadl1 extends ACCSLStsBuilder<SynchronousTransitionSystem>
{
	private FactoryHelper helper = new FactoryHelper();
	public SynchronousTransitionSystem create()
	{
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem("Aadl1");
		
		Event e0 = helper.createEvent("read");
		Event e1 = helper.createEvent("control");
		Event e2 = helper.createEvent("t1");
		Event e3 = helper.createEvent("t2");
		
		State s0 = helper.createState("p0xZxZ");
		s0.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e0), 0, ComparisonOperator.EQUALS), inv(diff(e3, e1), 0, ComparisonOperator.EQUALS)));
		State s1 = helper.createState("p0xP1xZ");
		s1.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e0), 1, ComparisonOperator.EQUALS), inv(diff(e3, e1), 0, ComparisonOperator.EQUALS)));
		State s2 = helper.createState("pixZxZ");
		s2.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e0), 0, ComparisonOperator.EQUALS), inv(diff(e3, e1), 0, ComparisonOperator.EQUALS)));
		State s3 = helper.createState("p0xZxP1");
		s3.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e0), 0, ComparisonOperator.EQUALS), inv(diff(e3, e1), 1, ComparisonOperator.EQUALS)));
		State s4 = helper.createState("p0xP1xP1");
		s4.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e0), 1, ComparisonOperator.EQUALS), inv(diff(e3, e1), 1, ComparisonOperator.EQUALS)));
		State s5 = helper.createState("pixZxP1");
		s5.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e0), 0, ComparisonOperator.EQUALS), inv(diff(e3, e1), 1, ComparisonOperator.EQUALS)));
		State s6 = helper.createState("pixP1xZ");
		s6.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e0), 1, ComparisonOperator.EQUALS), inv(diff(e3, e1), 0, ComparisonOperator.EQUALS)));
		State s7 = helper.createState("pixP1xP1");
		s7.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e0), 1, ComparisonOperator.EQUALS), inv(diff(e3, e1), 1, ComparisonOperator.EQUALS)));
		sts.setInitial(s0);
		
		helper.createTransition(s0, s1, e2);
		helper.createTransition(s0, s2, e0, e2);
		helper.createTransition(s0, s3, e3);
		helper.createTransition(s0, s4, e2, e3);
		helper.createTransition(s0, s5, e0, e2, e3);
		helper.createTransition(s1, s2, e0);
		helper.createTransition(s1, s6, e0, e2);
		helper.createTransition(s1, s4, e3);
		helper.createTransition(s1, s5, e0, e3);
		helper.createTransition(s1, s7, e0, e2, e3);
		helper.createTransition(s2, s6, e2);
		helper.createTransition(s2, s2, e0, e2);
		helper.createTransition(s2, s5, e3);
		helper.createTransition(s2, s7, e2, e3);
		helper.createTransition(s2, s5, e0, e2, e3);
		// no header
		{
			Transition t = helper.createTransition(s2, s0, e1, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s2, s2, e1, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s2, s1, e1, e2, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s2, s6, e1, e2, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s2, s2, e0, e1, e2, e3);
		helper.createTransition(s3, s4, e2);
		helper.createTransition(s3, s5, e0, e2);
		helper.createTransition(s4, s5, e0);
		helper.createTransition(s4, s7, e0, e2);
		helper.createTransition(s5, s7, e2);
		helper.createTransition(s5, s5, e0, e2);
		// no header
		{
			Transition t = helper.createTransition(s5, s0, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s2, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s1, e1, e2);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s6, e1, e2);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s5, s2, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s5, s3, e1, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s5, e1, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s4, e1, e2, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s7, e1, e2, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s5, s5, e0, e1, e2, e3);
		helper.createTransition(s6, s2, e0);
		helper.createTransition(s6, s6, e0, e2);
		helper.createTransition(s6, s7, e3);
		helper.createTransition(s6, s5, e0, e3);
		helper.createTransition(s6, s7, e0, e2, e3);
		// no header
		{
			Transition t = helper.createTransition(s6, s1, e1, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s6, s6, e1, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s6, s2, e0, e1, e3);
		helper.createTransition(s6, s6, e0, e1, e2, e3);
		helper.createTransition(s7, s5, e0);
		helper.createTransition(s7, s7, e0, e2);
		// no header
		{
			Transition t = helper.createTransition(s7, s1, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s6, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s7, s2, e0, e1);
		helper.createTransition(s7, s6, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s7, s4, e1, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s7, e1, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s7, s5, e0, e1, e3);
		helper.createTransition(s7, s7, e0, e1, e2, e3);
		
		return sts;
	}
}

