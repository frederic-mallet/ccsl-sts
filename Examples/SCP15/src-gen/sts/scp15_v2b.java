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

public class scp15_v2b extends ACCSLStsBuilder<SynchronousTransitionSystem>
{
	private FactoryHelper helper = new FactoryHelper();
	public SynchronousTransitionSystem create()
	{
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem("scp15_v2b");
		
		Event e0 = helper.createEvent("in1");
		Event e1 = helper.createEvent("step3");
		Event e2 = helper.createEvent("out");
		Event e3 = helper.createEvent("in2");
		
		State s0 = helper.createState("p0xp0xp0xS0xA0");
		s0.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e3, e1), 0, ComparisonOperator.EQUALS), inv(diff(e0, e3), 0, ComparisonOperator.EQUALS)));
		State s1 = helper.createState("pixp0xp0xS+xA0");
		s1.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e3, e1), 0, ComparisonOperator.EQUALS), inv(diff(e0, e3), 1, ComparisonOperator.GREATEROREQUAL)));
		State s2 = helper.createState("p0xp0xpixS-xA0");
		s2.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e3, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s3 = helper.createState("pixp0xpixS0xA1");
		s3.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e3, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e3), 0, ComparisonOperator.EQUALS)));
		State s4 = helper.createState("pixp0xpixS+xA1");
		s4.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e3, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e3), 1, ComparisonOperator.GREATEROREQUAL)));
		State s5 = helper.createState("pixp0xpixS-xA1");
		s5.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e3, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s6 = helper.createState("p0xpixp0xS0xA1");
		s6.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e1), 0, ComparisonOperator.EQUALS), inv(diff(e0, e3), 0, ComparisonOperator.EQUALS)));
		State s7 = helper.createState("pixpixpixS0xA1");
		s7.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e3), 0, ComparisonOperator.EQUALS)));
		State s8 = helper.createState("pixpixp0xS+xA1");
		s8.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e1), 0, ComparisonOperator.EQUALS), inv(diff(e0, e3), 1, ComparisonOperator.GREATEROREQUAL)));
		State s9 = helper.createState("pixpixpixS+xA1");
		s9.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e3), 1, ComparisonOperator.GREATEROREQUAL)));
		State s10 = helper.createState("p0xpixpixS-xA1");
		s10.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s11 = helper.createState("pixpixpixS-xA1");
		s11.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s12 = helper.createState("pixp0xpixS0xA0");
		s12.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e3, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e3), 0, ComparisonOperator.EQUALS)));
		State s13 = helper.createState("pixp0xpixS+xA0");
		s13.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e3, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e3), 1, ComparisonOperator.GREATEROREQUAL)));
		State s14 = helper.createState("pixp0xpixS-xA0");
		s14.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e3, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s15 = helper.createState("p0xpixp0xS0xA0");
		s15.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e1), 0, ComparisonOperator.EQUALS), inv(diff(e0, e3), 0, ComparisonOperator.EQUALS)));
		State s16 = helper.createState("pixpixp0xS+xA0");
		s16.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e1), 0, ComparisonOperator.EQUALS), inv(diff(e0, e3), 1, ComparisonOperator.GREATEROREQUAL)));
		State s17 = helper.createState("p0xpixpixS-xA0");
		s17.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s18 = helper.createState("pixpixpixS0xA0");
		s18.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e3), 0, ComparisonOperator.EQUALS)));
		State s19 = helper.createState("pixpixpixS+xA0");
		s19.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e3), 1, ComparisonOperator.GREATEROREQUAL)));
		State s20 = helper.createState("pixpixpixS-xA0");
		s20.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		sts.setInitial(s0);
		
		helper.createTransition(s0, s1, e0);
		helper.createTransition(s0, s2, e3);
		helper.createTransition(s0, s3, e0, e3);
		helper.createTransition(s1, s1, e0);
		helper.createTransition(s1, s4, e0, e3);
		// no header
		{
			Transition t = helper.createTransition(s1, s4, e3);
			t.setGuard(inv(diff(e0, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s1, s3, e3);
			t.setGuard(inv(diff(e0, e3), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s2, s2, e3);
		helper.createTransition(s2, s5, e0, e3);
		// no header
		{
			Transition t = helper.createTransition(s2, s5, e0);
			t.setGuard(inv(diff(e3, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s2, s3, e0);
			t.setGuard(inv(diff(e3, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s3, s6, e1);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e3, e1), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s3, s7, e1);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e3, e1), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s3, s4, e0);
		// no header
		{
			Transition t = helper.createTransition(s3, s8, e0, e1);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s3, s9, e0, e1);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s3, s5, e3);
		// no header
		{
			Transition t = helper.createTransition(s3, s10, e1, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s3, s11, e1, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s3, s0, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e3, e1), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s3, s12, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e3, e1), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s3, s1, e0, e1, e2);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s3, s13, e0, e1, e2);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s3, s2, e1, e2, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s3, s14, e1, e2, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s4, s8, e1);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s4, s9, e1);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s4, s4, e0);
		// no header
		{
			Transition t = helper.createTransition(s4, s8, e0, e1);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s4, s9, e0, e1);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s4, s1, e1, e2);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s4, s13, e1, e2);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s4, s1, e0, e1, e2);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s4, s13, e0, e1, e2);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s10, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s11, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s5, s5, e3);
		// no header
		{
			Transition t = helper.createTransition(s5, s10, e1, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s11, e1, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s2, e1, e2);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s14, e1, e2);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s2, e1, e2, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s14, e1, e2, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s6, s8, e0);
		helper.createTransition(s6, s10, e3);
		// no header
		{
			Transition t = helper.createTransition(s6, s0, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s6, s15, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s6, s1, e0, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s6, s16, e0, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s6, s2, e2, e3);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s6, s17, e2, e3);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s6, e1);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e3, e1), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s7, e1);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e3, e1), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s7, s9, e0);
		// no header
		{
			Transition t = helper.createTransition(s7, s8, e0, e1);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s9, e0, e1);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s7, s11, e3);
		// no header
		{
			Transition t = helper.createTransition(s7, s10, e1, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s11, e1, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s12, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s18, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s15, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e3, e1), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s18, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e3, e1), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s13, e0, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s19, e0, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s16, e0, e1, e2);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s19, e0, e1, e2);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s14, e2, e3);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s20, e2, e3);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s17, e1, e2, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s20, e1, e2, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s8, s8, e0);
		// no header
		{
			Transition t = helper.createTransition(s8, s1, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s16, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s1, e0, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s16, e0, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s9, s8, e1);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s9, s9, e1);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s9, s9, e0);
		// no header
		{
			Transition t = helper.createTransition(s9, s8, e0, e1);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s9, s9, e0, e1);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s9, s13, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s9, s19, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s9, s16, e1, e2);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s9, s19, e1, e2);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s9, s13, e0, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s9, s19, e0, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s9, s16, e0, e1, e2);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s9, s19, e0, e1, e2);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s10, s10, e3);
		// no header
		{
			Transition t = helper.createTransition(s10, s2, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s10, s17, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s10, s2, e2, e3);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s10, s17, e2, e3);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s10, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s11, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s11, s11, e3);
		// no header
		{
			Transition t = helper.createTransition(s11, s10, e1, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s11, e1, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s14, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s20, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s17, e1, e2);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s20, e1, e2);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s14, e2, e3);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s20, e2, e3);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s17, e1, e2, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s20, e1, e2, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s12, s15, e1);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e3, e1), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s12, s18, e1);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e3, e1), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s12, s13, e0);
		// no header
		{
			Transition t = helper.createTransition(s12, s16, e0, e1);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s12, s19, e0, e1);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s12, s14, e3);
		// no header
		{
			Transition t = helper.createTransition(s12, s17, e1, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s12, s20, e1, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s12, s3, e0, e3);
		helper.createTransition(s12, s7, e0, e1, e3);
		// no header
		{
			Transition t = helper.createTransition(s13, s16, e1);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s19, e1);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s13, s13, e0);
		// no header
		{
			Transition t = helper.createTransition(s13, s16, e0, e1);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s19, e0, e1);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s13, s4, e0, e3);
		helper.createTransition(s13, s9, e0, e1, e3);
		// no header
		{
			Transition t = helper.createTransition(s13, s4, e3);
			t.setGuard(inv(diff(e0, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s9, e1, e3);
			t.setGuard(inv(diff(e0, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s3, e3);
			t.setGuard(inv(diff(e0, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s7, e1, e3);
			t.setGuard(inv(diff(e0, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s14, s17, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s14, s20, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s14, s14, e3);
		// no header
		{
			Transition t = helper.createTransition(s14, s17, e1, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s14, s20, e1, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s14, s5, e0, e3);
		helper.createTransition(s14, s11, e0, e1, e3);
		// no header
		{
			Transition t = helper.createTransition(s14, s5, e0);
			t.setGuard(inv(diff(e3, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s14, s11, e0, e1);
			t.setGuard(inv(diff(e3, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s14, s3, e0);
			t.setGuard(inv(diff(e3, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s14, s7, e0, e1);
			t.setGuard(inv(diff(e3, e0), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s15, s16, e0);
		helper.createTransition(s15, s17, e3);
		helper.createTransition(s15, s7, e0, e3);
		helper.createTransition(s16, s16, e0);
		helper.createTransition(s16, s9, e0, e3);
		// no header
		{
			Transition t = helper.createTransition(s16, s9, e3);
			t.setGuard(inv(diff(e0, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s16, s7, e3);
			t.setGuard(inv(diff(e0, e3), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s17, s17, e3);
		helper.createTransition(s17, s11, e0, e3);
		// no header
		{
			Transition t = helper.createTransition(s17, s11, e0);
			t.setGuard(inv(diff(e3, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s7, e0);
			t.setGuard(inv(diff(e3, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s18, s15, e1);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e3, e1), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s18, s18, e1);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e3, e1), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s18, s19, e0);
		// no header
		{
			Transition t = helper.createTransition(s18, s16, e0, e1);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s18, s19, e0, e1);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s18, s20, e3);
		// no header
		{
			Transition t = helper.createTransition(s18, s17, e1, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s18, s20, e1, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s18, s7, e0, e3);
		helper.createTransition(s18, s7, e0, e1, e3);
		// no header
		{
			Transition t = helper.createTransition(s19, s16, e1);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s19, s19, e1);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s19, s19, e0);
		// no header
		{
			Transition t = helper.createTransition(s19, s16, e0, e1);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s19, s19, e0, e1);
			t.setGuard(inv(diff(e3, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s19, s9, e0, e3);
		helper.createTransition(s19, s9, e0, e1, e3);
		// no header
		{
			Transition t = helper.createTransition(s19, s9, e3);
			t.setGuard(inv(diff(e0, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s19, s9, e1, e3);
			t.setGuard(inv(diff(e0, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s19, s7, e3);
			t.setGuard(inv(diff(e0, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s19, s7, e1, e3);
			t.setGuard(inv(diff(e0, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s20, s17, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s20, s20, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s20, s20, e3);
		// no header
		{
			Transition t = helper.createTransition(s20, s17, e1, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s20, s20, e1, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s20, s11, e0, e3);
		helper.createTransition(s20, s11, e0, e1, e3);
		// no header
		{
			Transition t = helper.createTransition(s20, s11, e0);
			t.setGuard(inv(diff(e3, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s20, s11, e0, e1);
			t.setGuard(inv(diff(e3, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s20, s7, e0);
			t.setGuard(inv(diff(e3, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s20, s7, e0, e1);
			t.setGuard(inv(diff(e3, e0), 1, ComparisonOperator.EQUALS));
		}
		
		return sts;
	}
}

