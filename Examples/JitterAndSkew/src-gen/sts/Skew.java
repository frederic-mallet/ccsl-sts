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

public class Skew extends ACCSLStsBuilder<SynchronousTransitionSystem>
{
	private FactoryHelper helper = new FactoryHelper();
	public SynchronousTransitionSystem create()
	{
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem("Skew");
		
		Event e0 = helper.createEvent("s");
		Event e1 = helper.createEvent("T");
		Event e2 = helper.createEvent("min");
		Event e3 = helper.createEvent("max");
		Event e4 = helper.createEvent("T1");
		
		State s0 = helper.createState("initxZ0xZ0xSxp0xp0");
		s0.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e4), 0, ComparisonOperator.EQUALS), inv(diff(e4, e3), 0, ComparisonOperator.EQUALS)));
		State s1 = helper.createState("p1xZ1xZ1xSxp0xp0");
		s1.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e4), 0, ComparisonOperator.EQUALS), inv(diff(e4, e3), 0, ComparisonOperator.EQUALS)));
		State s2 = helper.createState("p2xZ2xZ2xSxp0xp0");
		s2.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.GREATERTHAN), inv(diff(e2, e4), 0, ComparisonOperator.EQUALS), inv(diff(e4, e3), 0, ComparisonOperator.EQUALS)));
		State s3 = helper.createState("p3xZ4xZ4xSxp0xp0");
		s3.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.GREATERTHAN), inv(diff(e2, e4), 0, ComparisonOperator.EQUALS), inv(diff(e4, e3), 0, ComparisonOperator.EQUALS)));
		State s4 = helper.createState("p4xZ8xZ8xSxp0xp0");
		s4.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.GREATERTHAN), inv(diff(e2, e4), 0, ComparisonOperator.EQUALS), inv(diff(e4, e3), 0, ComparisonOperator.EQUALS)));
		State s5 = helper.createState("initxZ0xZ16xSxpixp0");
		s5.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e4), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e3), 0, ComparisonOperator.EQUALS)));
		State s6 = helper.createState("initxZ0xZ16xSxp0xpi");
		s6.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e4), 0, ComparisonOperator.EQUALS), inv(diff(e4, e3), 1, ComparisonOperator.GREATEROREQUAL)));
		State s7 = helper.createState("p1xZ1xZ33xSxpixp0");
		s7.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e4), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e3), 0, ComparisonOperator.EQUALS)));
		State s8 = helper.createState("p1xZ1xZ33xSxp0xpi");
		s8.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e4), 0, ComparisonOperator.EQUALS), inv(diff(e4, e3), 1, ComparisonOperator.GREATEROREQUAL)));
		State s9 = helper.createState("p1xZ1xZ33xSxpixpi");
		s9.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e4), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e3), 1, ComparisonOperator.GREATEROREQUAL)));
		State s10 = helper.createState("p2xZ2xZ66xSxpixp0");
		s10.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.GREATERTHAN), inv(diff(e2, e4), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e3), 0, ComparisonOperator.EQUALS)));
		State s11 = helper.createState("p2xZ2xZ66xSxp0xpi");
		s11.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.GREATERTHAN), inv(diff(e2, e4), 0, ComparisonOperator.EQUALS), inv(diff(e4, e3), 1, ComparisonOperator.GREATEROREQUAL)));
		State s12 = helper.createState("p2xZ2xZ66xSxpixpi");
		s12.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.GREATERTHAN), inv(diff(e2, e4), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e3), 1, ComparisonOperator.GREATEROREQUAL)));
		State s13 = helper.createState("p3xZ4xZ4xSxpixp0");
		s13.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.GREATERTHAN), inv(diff(e2, e4), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e3), 0, ComparisonOperator.EQUALS)));
		State s14 = helper.createState("p3xZ4xZ4xSxp0xpi");
		s14.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.GREATERTHAN), inv(diff(e2, e4), 0, ComparisonOperator.EQUALS), inv(diff(e4, e3), 1, ComparisonOperator.GREATEROREQUAL)));
		State s15 = helper.createState("p3xZ4xZ4xSxpixpi");
		s15.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.GREATERTHAN), inv(diff(e2, e4), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e3), 1, ComparisonOperator.GREATEROREQUAL)));
		State s16 = helper.createState("p4xZ8xZ8xSxpixp0");
		s16.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.GREATERTHAN), inv(diff(e2, e4), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e3), 0, ComparisonOperator.EQUALS)));
		State s17 = helper.createState("p4xZ8xZ8xSxp0xpi");
		s17.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.GREATERTHAN), inv(diff(e2, e4), 0, ComparisonOperator.EQUALS), inv(diff(e4, e3), 1, ComparisonOperator.GREATEROREQUAL)));
		State s18 = helper.createState("p4xZ8xZ8xSxpixpi");
		s18.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.GREATERTHAN), inv(diff(e2, e4), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e3), 1, ComparisonOperator.GREATEROREQUAL)));
		State s19 = helper.createState("initxZ0xZ16xSxpixpi");
		s19.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e4), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e3), 1, ComparisonOperator.GREATEROREQUAL)));
		sts.setInitial(s0);
		
		helper.createTransition(s0, s1, e0, e1);
		helper.createTransition(s1, s2, e0);
		helper.createTransition(s2, s3, e0);
		helper.createTransition(s3, s4, e0);
		helper.createTransition(s4, s5, e0, e2);
		helper.createTransition(s4, s6, e0, e2, e4);
		helper.createTransition(s5, s7, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s5, s8, e0, e1, e4);
			t.setGuard(inv(diff(e2, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s9, e0, e1, e4);
			t.setGuard(inv(diff(e2, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s6, s8, e0, e1);
		helper.createTransition(s7, s10, e0);
		// no header
		{
			Transition t = helper.createTransition(s7, s11, e0, e4);
			t.setGuard(inv(diff(e2, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s12, e0, e4);
			t.setGuard(inv(diff(e2, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s8, s11, e0);
		helper.createTransition(s9, s12, e0);
		// no header
		{
			Transition t = helper.createTransition(s9, s11, e0, e4);
			t.setGuard(inv(diff(e2, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s9, s12, e0, e4);
			t.setGuard(inv(diff(e2, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s10, s3, e0, e3, e4);
			t.setGuard(inv(diff(e2, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s10, s13, e0, e3, e4);
			t.setGuard(inv(diff(e2, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s3, e0, e3);
			t.setGuard(inv(diff(e4, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s14, e0, e3);
			t.setGuard(inv(diff(e4, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s12, s13, e0, e3);
			t.setGuard(inv(diff(e4, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s12, s14, e0, e3, e4);
			t.setGuard(inv(diff(e2, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s12, s15, e0, e3, e4);
			t.setGuard(inv(diff(e2, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s12, s15, e0, e3);
			t.setGuard(inv(diff(e4, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s13, s16, e0);
		// no header
		{
			Transition t = helper.createTransition(s13, s17, e0, e4);
			t.setGuard(inv(diff(e2, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s18, e0, e4);
			t.setGuard(inv(diff(e2, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s14, s17, e0);
		helper.createTransition(s15, s18, e0);
		// no header
		{
			Transition t = helper.createTransition(s15, s17, e0, e4);
			t.setGuard(inv(diff(e2, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s15, s18, e0, e4);
			t.setGuard(inv(diff(e2, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s16, s5, e0, e2);
		helper.createTransition(s16, s19, e0, e2, e4);
		helper.createTransition(s17, s19, e0, e2);
		helper.createTransition(s17, s6, e0, e2, e4);
		helper.createTransition(s18, s19, e0, e2);
		helper.createTransition(s18, s19, e0, e2, e4);
		helper.createTransition(s19, s9, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s19, s8, e0, e1, e4);
			t.setGuard(inv(diff(e2, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s19, s9, e0, e1, e4);
			t.setGuard(inv(diff(e2, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		
		return sts;
	}
}

