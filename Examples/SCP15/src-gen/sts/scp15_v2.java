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

public class scp15_v2 extends ACCSLStsBuilder<SynchronousTransitionSystem>
{
	private FactoryHelper helper = new FactoryHelper();
	public SynchronousTransitionSystem create()
	{
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem("scp15_v2");
		
		Event e0 = helper.createEvent("in1");
		Event e1 = helper.createEvent("step1");
		Event e2 = helper.createEvent("step3");
		Event e3 = helper.createEvent("out");
		Event e4 = helper.createEvent("in2");
		Event e5 = helper.createEvent("step2");
		
		State s0 = helper.createState("p0xp0xp0xp0xp0xS0xA0");
		s0.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s1 = helper.createState("pixp0xp0xp0xp0xS+xA0");
		s1.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s2 = helper.createState("p0xpixp0xp0xp0xS+xA0");
		s2.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s3 = helper.createState("p0xp0xp0xpixp0xS-xA0");
		s3.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s4 = helper.createState("p0xp0xp0xp0xpixS-xA0");
		s4.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s5 = helper.createState("pixp0xp0xpixp0xS0xA1");
		s5.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s6 = helper.createState("p0xpixp0xpixp0xS0xA1");
		s6.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s7 = helper.createState("pixp0xp0xp0xpixS0xA1");
		s7.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s8 = helper.createState("p0xpixp0xp0xpixS0xA1");
		s8.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s9 = helper.createState("pixpixp0xp0xp0xS+xA0");
		s9.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s10 = helper.createState("pixp0xp0xpixp0xS+xA1");
		s10.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s11 = helper.createState("pixpixp0xpixp0xS+xA1");
		s11.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s12 = helper.createState("pixp0xp0xp0xpixS+xA1");
		s12.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s13 = helper.createState("pixpixp0xp0xpixS+xA1");
		s13.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s14 = helper.createState("p0xpixp0xpixp0xS+xA1");
		s14.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s15 = helper.createState("p0xpixp0xp0xpixS+xA1");
		s15.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s16 = helper.createState("pixpixp0xpixp0xS0xA1");
		s16.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s17 = helper.createState("pixpixp0xp0xpixS0xA1");
		s17.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s18 = helper.createState("p0xp0xp0xpixpixS-xA0");
		s18.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s19 = helper.createState("pixp0xp0xpixp0xS-xA1");
		s19.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s20 = helper.createState("p0xpixp0xpixp0xS-xA1");
		s20.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s21 = helper.createState("pixp0xp0xpixpixS-xA1");
		s21.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s22 = helper.createState("p0xpixp0xpixpixS-xA1");
		s22.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s23 = helper.createState("pixp0xp0xp0xpixS-xA1");
		s23.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s24 = helper.createState("p0xpixp0xp0xpixS-xA1");
		s24.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s25 = helper.createState("pixp0xp0xpixpixS0xA1");
		s25.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s26 = helper.createState("p0xpixp0xpixpixS0xA1");
		s26.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s27 = helper.createState("pixpixp0xpixpixS0xA1");
		s27.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s28 = helper.createState("pixp0xp0xpixpixS+xA1");
		s28.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s29 = helper.createState("pixpixp0xpixpixS+xA1");
		s29.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s30 = helper.createState("pixpixp0xpixp0xS-xA1");
		s30.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s31 = helper.createState("pixpixp0xpixpixS-xA1");
		s31.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s32 = helper.createState("p0xpixp0xpixpixS+xA1");
		s32.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s33 = helper.createState("pixpixp0xp0xpixS-xA1");
		s33.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s34 = helper.createState("p0xp0xpixp0xp0xS0xA1");
		s34.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s35 = helper.createState("p0xpixpixp0xpixS0xA1");
		s35.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s36 = helper.createState("pixp0xpixp0xp0xS+xA1");
		s36.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s37 = helper.createState("p0xpixpixp0xp0xS+xA1");
		s37.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s38 = helper.createState("pixpixpixp0xp0xS+xA1");
		s38.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s39 = helper.createState("pixp0xpixp0xpixS+xA1");
		s39.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s40 = helper.createState("p0xpixpixp0xpixS+xA1");
		s40.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s41 = helper.createState("pixpixpixp0xpixS+xA1");
		s41.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s42 = helper.createState("p0xp0xpixpixp0xS-xA1");
		s42.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s43 = helper.createState("p0xpixpixpixp0xS-xA1");
		s43.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s44 = helper.createState("p0xp0xpixp0xpixS-xA1");
		s44.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s45 = helper.createState("p0xpixpixp0xpixS-xA1");
		s45.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s46 = helper.createState("p0xp0xpixpixpixS-xA1");
		s46.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s47 = helper.createState("p0xpixpixpixpixS-xA1");
		s47.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s48 = helper.createState("p0xpixp0xp0xpixS0xA0");
		s48.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s49 = helper.createState("pixp0xp0xp0xpixS+xA0");
		s49.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s50 = helper.createState("p0xpixp0xp0xpixS+xA0");
		s50.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s51 = helper.createState("pixpixp0xp0xpixS+xA0");
		s51.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s52 = helper.createState("p0xpixp0xpixp0xS-xA0");
		s52.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s53 = helper.createState("p0xpixp0xp0xpixS-xA0");
		s53.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s54 = helper.createState("p0xpixp0xpixpixS-xA0");
		s54.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s55 = helper.createState("pixp0xpixp0xpixS0xA1");
		s55.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s56 = helper.createState("pixpixpixp0xpixS0xA1");
		s56.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s57 = helper.createState("pixp0xpixpixp0xS-xA1");
		s57.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s58 = helper.createState("pixpixpixpixp0xS-xA1");
		s58.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s59 = helper.createState("pixp0xpixp0xpixS-xA1");
		s59.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s60 = helper.createState("pixpixpixp0xpixS-xA1");
		s60.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s61 = helper.createState("pixp0xpixpixpixS-xA1");
		s61.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s62 = helper.createState("pixpixpixpixpixS-xA1");
		s62.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s63 = helper.createState("pixp0xp0xp0xpixS0xA0");
		s63.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s64 = helper.createState("pixpixp0xp0xpixS0xA0");
		s64.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s65 = helper.createState("pixp0xp0xpixp0xS-xA0");
		s65.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s66 = helper.createState("pixpixp0xpixp0xS-xA0");
		s66.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s67 = helper.createState("pixp0xp0xp0xpixS-xA0");
		s67.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s68 = helper.createState("pixpixp0xp0xpixS-xA0");
		s68.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s69 = helper.createState("pixp0xp0xpixpixS-xA0");
		s69.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s70 = helper.createState("pixpixp0xpixpixS-xA0");
		s70.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s71 = helper.createState("p0xpixpixpixp0xS0xA1");
		s71.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s72 = helper.createState("p0xpixpixpixpixS0xA1");
		s72.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s73 = helper.createState("pixp0xpixpixp0xS+xA1");
		s73.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s74 = helper.createState("p0xpixpixpixp0xS+xA1");
		s74.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s75 = helper.createState("pixpixpixpixp0xS+xA1");
		s75.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s76 = helper.createState("pixp0xpixpixpixS+xA1");
		s76.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s77 = helper.createState("p0xpixpixpixpixS+xA1");
		s77.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s78 = helper.createState("pixpixpixpixpixS+xA1");
		s78.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s79 = helper.createState("p0xpixp0xpixp0xS0xA0");
		s79.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s80 = helper.createState("p0xpixp0xpixpixS0xA0");
		s80.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s81 = helper.createState("pixp0xp0xpixp0xS+xA0");
		s81.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s82 = helper.createState("p0xpixp0xpixp0xS+xA0");
		s82.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s83 = helper.createState("pixpixp0xpixp0xS+xA0");
		s83.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s84 = helper.createState("pixp0xp0xpixpixS+xA0");
		s84.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s85 = helper.createState("p0xpixp0xpixpixS+xA0");
		s85.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s86 = helper.createState("pixpixp0xpixpixS+xA0");
		s86.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s87 = helper.createState("pixp0xpixpixp0xS0xA1");
		s87.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s88 = helper.createState("pixpixpixpixp0xS0xA1");
		s88.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s89 = helper.createState("pixp0xpixpixpixS0xA1");
		s89.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s90 = helper.createState("pixpixpixpixpixS0xA1");
		s90.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s91 = helper.createState("pixp0xp0xpixp0xS0xA0");
		s91.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s92 = helper.createState("pixpixp0xpixp0xS0xA0");
		s92.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s93 = helper.createState("pixp0xp0xpixpixS0xA0");
		s93.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s94 = helper.createState("pixpixp0xpixpixS0xA0");
		s94.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s95 = helper.createState("p0xp0xpixp0xp0xS0xA0");
		s95.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s96 = helper.createState("pixp0xpixp0xp0xS+xA0");
		s96.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s97 = helper.createState("p0xpixpixp0xp0xS+xA0");
		s97.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s98 = helper.createState("p0xp0xpixpixp0xS-xA0");
		s98.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s99 = helper.createState("p0xp0xpixp0xpixS-xA0");
		s99.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s100 = helper.createState("p0xpixpixp0xpixS0xA0");
		s100.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s101 = helper.createState("pixpixpixp0xpixS+xA0");
		s101.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s102 = helper.createState("p0xpixpixp0xpixS+xA0");
		s102.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s103 = helper.createState("pixpixpixp0xp0xS+xA0");
		s103.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s104 = helper.createState("pixp0xpixp0xpixS+xA0");
		s104.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s105 = helper.createState("p0xpixpixpixpixS-xA0");
		s105.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s106 = helper.createState("p0xpixpixpixp0xS-xA0");
		s106.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s107 = helper.createState("p0xpixpixp0xpixS-xA0");
		s107.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s108 = helper.createState("p0xp0xpixpixpixS-xA0");
		s108.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s109 = helper.createState("pixp0xpixp0xpixS0xA0");
		s109.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s110 = helper.createState("pixpixpixp0xpixS0xA0");
		s110.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s111 = helper.createState("pixp0xpixpixpixS-xA0");
		s111.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s112 = helper.createState("pixpixpixpixpixS-xA0");
		s112.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s113 = helper.createState("pixp0xpixp0xpixS-xA0");
		s113.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s114 = helper.createState("pixpixpixp0xpixS-xA0");
		s114.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 0, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s115 = helper.createState("pixp0xpixpixp0xS-xA0");
		s115.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s116 = helper.createState("pixpixpixpixp0xS-xA0");
		s116.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATEROREQUAL)));
		State s117 = helper.createState("p0xpixpixpixp0xS0xA0");
		s117.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s118 = helper.createState("p0xpixpixpixpixS0xA0");
		s118.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s119 = helper.createState("pixpixpixpixp0xS+xA0");
		s119.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s120 = helper.createState("p0xpixpixpixp0xS+xA0");
		s120.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s121 = helper.createState("pixpixpixpixpixS+xA0");
		s121.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s122 = helper.createState("p0xpixpixpixpixS+xA0");
		s122.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s123 = helper.createState("pixp0xpixpixp0xS+xA0");
		s123.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s124 = helper.createState("pixp0xpixpixpixS+xA0");
		s124.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s125 = helper.createState("pixp0xpixpixp0xS0xA0");
		s125.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s126 = helper.createState("pixpixpixpixp0xS0xA0");
		s126.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s127 = helper.createState("pixp0xpixpixpixS0xA0");
		s127.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s128 = helper.createState("pixpixpixpixpixS0xA0");
		s128.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e4, e5), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e5, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		sts.setInitial(s0);
		
		helper.createTransition(s0, s1, e0);
		helper.createTransition(s0, s2, e0, e1);
		helper.createTransition(s0, s3, e4);
		helper.createTransition(s0, s4, e4, e5);
		helper.createTransition(s0, s5, e0, e4);
		helper.createTransition(s0, s6, e0, e1, e4);
		helper.createTransition(s0, s7, e0, e4, e5);
		helper.createTransition(s0, s8, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s1, s2, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s1, s9, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s1, s1, e0);
		helper.createTransition(s1, s9, e0, e1);
		helper.createTransition(s1, s10, e0, e4);
		helper.createTransition(s1, s11, e0, e1, e4);
		helper.createTransition(s1, s12, e0, e4, e5);
		helper.createTransition(s1, s13, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s1, s10, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s1, s14, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s1, s11, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s1, s12, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s1, s15, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s1, s13, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s1, s5, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s1, s6, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s1, s16, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s1, s7, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s1, s8, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s1, s17, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s2, s9, e0);
		helper.createTransition(s2, s2, e0, e1);
		helper.createTransition(s2, s11, e0, e4);
		helper.createTransition(s2, s14, e0, e1, e4);
		helper.createTransition(s2, s13, e0, e4, e5);
		helper.createTransition(s2, s15, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s2, s14, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s2, s15, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s2, s6, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s2, s8, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s3, s4, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s3, s18, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s3, s3, e4);
		helper.createTransition(s3, s18, e4, e5);
		helper.createTransition(s3, s19, e0, e4);
		helper.createTransition(s3, s20, e0, e1, e4);
		helper.createTransition(s3, s21, e0, e4, e5);
		helper.createTransition(s3, s22, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s3, s19, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s3, s20, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s3, s23, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s3, s24, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s3, s21, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s3, s22, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s3, s5, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s3, s6, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s3, s7, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s3, s8, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s3, s25, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s3, s26, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s4, s18, e4);
		helper.createTransition(s4, s4, e4, e5);
		helper.createTransition(s4, s21, e0, e4);
		helper.createTransition(s4, s22, e0, e1, e4);
		helper.createTransition(s4, s23, e0, e4, e5);
		helper.createTransition(s4, s24, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s4, s23, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s4, s24, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s4, s7, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s4, s8, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s6, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s16, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s7, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s8, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s17, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s25, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s26, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s27, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s5, s10, e0);
		helper.createTransition(s5, s11, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s5, s12, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s13, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s28, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s29, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s5, s19, e4);
		// no header
		{
			Transition t = helper.createTransition(s5, s20, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s30, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s5, s21, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s5, s22, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s31, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s6, s8, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s6, s26, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s6, s11, e0);
		helper.createTransition(s6, s14, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s6, s13, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s6, s15, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s6, s29, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s6, s32, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s6, s20, e4);
		helper.createTransition(s6, s22, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s7, s8, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s17, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s7, s12, e0);
		helper.createTransition(s7, s13, e0, e1);
		helper.createTransition(s7, s21, e4);
		// no header
		{
			Transition t = helper.createTransition(s7, s22, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s31, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s7, s23, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s7, s24, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s33, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s34, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s35, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s8, s13, e0);
		helper.createTransition(s8, s15, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s8, s36, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s37, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s38, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s39, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s40, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s41, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s8, s22, e4);
		// no header
		{
			Transition t = helper.createTransition(s8, s42, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s43, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s8, s24, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s8, s44, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s45, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s46, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s47, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s48, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s1, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s2, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s9, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s49, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s50, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s51, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s3, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s52, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s4, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s53, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s18, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s8, s54, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s9, s2, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s9, s9, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s9, s9, e0);
		helper.createTransition(s9, s9, e0, e1);
		helper.createTransition(s9, s11, e0, e4);
		helper.createTransition(s9, s11, e0, e1, e4);
		helper.createTransition(s9, s13, e0, e4, e5);
		helper.createTransition(s9, s13, e0, e1, e4, e5);
		helper.createTransition(s9, s11, e4);
		// no header
		{
			Transition t = helper.createTransition(s9, s14, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s9, s11, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s9, s13, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s9, s15, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s9, s13, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s9, s16, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s9, s6, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s9, s16, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s9, s17, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s9, s8, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s9, s17, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s10, s14, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s10, s11, e1);
		// no header
		{
			Transition t = helper.createTransition(s10, s12, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s10, s15, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s10, s13, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s10, s28, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s10, s32, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s10, s29, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s10, s10, e0);
		helper.createTransition(s10, s11, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s10, s12, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s10, s13, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s10, s28, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s10, s29, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s14, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s11, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s13, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s15, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s13, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s29, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s32, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s29, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s11, s11, e0);
		helper.createTransition(s11, s11, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s11, s13, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s13, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s29, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s29, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s12, s15, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s12, s13, e1);
		helper.createTransition(s12, s12, e0);
		helper.createTransition(s12, s13, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s13, s15, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s13, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s36, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s37, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s38, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s38, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s39, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s40, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s41, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s41, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s13, s13, e0);
		helper.createTransition(s13, s13, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s13, s36, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s38, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s38, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s39, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s41, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s41, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s1, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s2, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s9, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s9, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s49, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s50, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s51, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s51, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s1, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s9, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s9, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s49, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s51, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s13, s51, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s14, s15, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s14, s32, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s14, s11, e0);
		helper.createTransition(s14, s14, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s14, s13, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s14, s15, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s14, s29, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s14, s32, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s15, s37, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s15, s40, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s15, s13, e0);
		helper.createTransition(s15, s15, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s15, s36, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s15, s37, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s15, s38, e0, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s15, s39, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s15, s40, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s15, s41, e0, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s15, s2, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s15, s50, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s15, s1, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s15, s2, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s15, s9, e0, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s15, s49, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s15, s50, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s15, s51, e0, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s16, s6, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s16, s16, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s16, s17, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s16, s8, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s16, s17, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s16, s27, e5);
		// no header
		{
			Transition t = helper.createTransition(s16, s26, e1, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s16, s27, e1, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s16, s11, e0);
		helper.createTransition(s16, s11, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s16, s13, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s16, s13, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s16, s29, e0, e5);
		helper.createTransition(s16, s29, e0, e1, e5);
		helper.createTransition(s16, s30, e4);
		// no header
		{
			Transition t = helper.createTransition(s16, s20, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s16, s30, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s16, s31, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s16, s22, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s16, s31, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s8, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s17, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s55, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s35, e1, e2);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s56, e1, e2);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s56, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s17, s13, e0);
		helper.createTransition(s17, s13, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s17, s36, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s38, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s38, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s39, e0, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s17, s41, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s17, s41, e0, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s17, s31, e4);
		// no header
		{
			Transition t = helper.createTransition(s17, s22, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s31, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s57, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s43, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s58, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s58, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s17, s33, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s17, s24, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s33, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s59, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s45, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s60, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s60, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s61, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s47, e1, e2, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s62, e1, e2, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s62, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s63, e2, e3);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s48, e1, e2, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s64, e1, e2, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s64, e2, e3);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s1, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s9, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s9, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s49, e0, e2, e3);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s17, s51, e0, e1, e2, e3);
		// no header
		{
			Transition t = helper.createTransition(s17, s51, e0, e2, e3);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s65, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s52, e1, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s66, e1, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s66, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s67, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s53, e1, e2, e3, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s68, e1, e2, e3, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s68, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s69, e2, e3, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s54, e1, e2, e3, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s70, e1, e2, e3, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s17, s70, e2, e3, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s18, s4, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s18, s18, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s18, s18, e4);
		helper.createTransition(s18, s18, e4, e5);
		helper.createTransition(s18, s21, e0, e4);
		helper.createTransition(s18, s22, e0, e1, e4);
		helper.createTransition(s18, s21, e0, e4, e5);
		helper.createTransition(s18, s22, e0, e1, e4, e5);
		helper.createTransition(s18, s21, e0);
		helper.createTransition(s18, s22, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s18, s23, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s18, s24, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s18, s21, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s18, s22, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s18, s25, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s18, s26, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s18, s7, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s18, s8, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s18, s25, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s18, s26, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s19, s20, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s19, s30, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s19, s23, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s19, s24, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s19, s33, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s19, s21, e5);
		// no header
		{
			Transition t = helper.createTransition(s19, s22, e1, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s19, s31, e1, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s19, s19, e4);
		// no header
		{
			Transition t = helper.createTransition(s19, s20, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s19, s30, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s19, s21, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s19, s22, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s19, s31, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s20, s24, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s20, s22, e5);
		helper.createTransition(s20, s20, e4);
		helper.createTransition(s20, s22, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s21, s22, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s21, s31, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s21, s23, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s21, s24, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s21, s33, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s21, s21, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s21, s22, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s21, s31, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s21, s21, e4);
		// no header
		{
			Transition t = helper.createTransition(s21, s22, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s21, s31, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s21, s21, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s21, s22, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s21, s31, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s42, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s43, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s24, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s22, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s44, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s45, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s46, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s47, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s46, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s47, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s22, s22, e4);
		// no header
		{
			Transition t = helper.createTransition(s22, s42, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s43, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s22, s22, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s22, s46, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s47, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s46, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s47, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s3, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s52, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s4, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s53, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s18, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s54, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s18, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s54, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s3, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s52, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s18, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s54, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s18, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s54, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s23, s24, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s23, s33, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s23, s21, e4);
		// no header
		{
			Transition t = helper.createTransition(s23, s22, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s23, s31, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s23, s23, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s23, s24, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s23, s33, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s24, s44, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s24, s45, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s24, s22, e4);
		// no header
		{
			Transition t = helper.createTransition(s24, s42, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s24, s43, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s24, s24, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s24, s44, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s24, s45, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s24, s46, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s24, s47, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s24, s4, e2, e3);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s24, s53, e2, e3);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s24, s3, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s24, s52, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s24, s4, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s24, s53, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s24, s18, e2, e3, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s24, s54, e2, e3, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s25, s26, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s25, s27, e1);
		// no header
		{
			Transition t = helper.createTransition(s25, s7, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s25, s8, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s25, s17, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s25, s25, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s25, s26, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s25, s27, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s25, s28, e0);
		helper.createTransition(s25, s29, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s25, s12, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s25, s13, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s25, s28, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s25, s29, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s25, s21, e4);
		// no header
		{
			Transition t = helper.createTransition(s25, s22, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s25, s31, e1, e4);
		helper.createTransition(s25, s21, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s25, s22, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s25, s31, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s26, s71, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s8, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s26, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s35, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s72, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s72, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s26, s29, e0);
		helper.createTransition(s26, s32, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s26, s73, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s74, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s75, e0, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s13, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s15, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s29, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s32, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s39, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s40, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s41, e0, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s76, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s77, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s78, e0, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s76, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s77, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s78, e0, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s26, s22, e4);
		// no header
		{
			Transition t = helper.createTransition(s26, s42, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s43, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s26, s22, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s26, s46, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s26, s47, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s26, s46, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s47, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s79, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s48, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s80, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s80, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s81, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s82, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s83, e0, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s49, e0, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s50, e0, e1, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s51, e0, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s84, e0, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s85, e0, e1, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s86, e0, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s84, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s85, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s86, e0, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s3, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s52, e2, e3, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s18, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s26, s54, e2, e3, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s26, s18, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s54, e2, e3, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s26, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s27, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s87, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s71, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s88, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s88, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s17, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s8, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s17, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s27, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s26, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s27, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s55, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s35, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s56, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s56, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s89, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s72, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s90, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s90, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s89, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s72, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s90, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s90, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s27, s29, e0);
		helper.createTransition(s27, s29, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s27, s73, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s75, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s75, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s13, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s13, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s29, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s29, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s39, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s41, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s41, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s76, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s78, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s78, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s76, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s78, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s78, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s27, s31, e4);
		// no header
		{
			Transition t = helper.createTransition(s27, s22, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s31, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s57, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s43, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s58, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s58, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s27, s31, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s27, s22, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s31, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s61, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s47, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s62, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s62, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s61, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s47, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s62, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s62, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s91, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s79, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s92, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s92, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s63, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s48, e1, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s64, e1, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s64, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s93, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s80, e1, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s94, e1, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s94, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s93, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s80, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s94, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s94, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s81, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s83, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s83, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s49, e0, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s51, e0, e1, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s51, e0, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s84, e0, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s86, e0, e1, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s86, e0, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s84, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s86, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s86, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s65, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s52, e1, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s66, e1, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s66, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s69, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s54, e1, e2, e3, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s70, e1, e2, e3, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s70, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s69, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s54, e1, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s70, e1, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s70, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s28, s32, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s28, s29, e1);
		// no header
		{
			Transition t = helper.createTransition(s28, s12, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s28, s15, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s28, s13, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s28, s28, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s28, s32, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s28, s29, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s28, s28, e0);
		helper.createTransition(s28, s29, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s28, s12, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s28, s13, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s28, s28, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s28, s29, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s32, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s29, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s73, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s74, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s75, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s75, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s13, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s15, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s13, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s29, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s32, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s29, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s39, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s40, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s41, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s41, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s76, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s77, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s78, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s78, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s76, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s77, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s78, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s78, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s29, s29, e0);
		helper.createTransition(s29, s29, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s29, s73, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s75, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s75, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s13, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s13, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s29, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s29, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s39, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s41, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s41, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s76, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s78, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s78, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s76, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s78, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s78, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s81, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s82, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s83, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s83, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s49, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s50, e1, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s51, e1, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s51, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s84, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s85, e1, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s86, e1, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s86, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s84, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s85, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s86, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s86, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s81, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s83, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s83, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s49, e0, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s51, e0, e1, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s51, e0, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s84, e0, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s86, e0, e1, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s86, e0, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s84, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s86, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s29, s86, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s30, s20, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s30, s30, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s30, s33, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s30, s24, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s30, s33, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s30, s31, e5);
		// no header
		{
			Transition t = helper.createTransition(s30, s22, e1, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s30, s31, e1, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s30, s30, e4);
		// no header
		{
			Transition t = helper.createTransition(s30, s20, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s30, s30, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s30, s31, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s30, s22, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s30, s31, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s22, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s31, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s57, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s43, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s58, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s58, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s33, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s24, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s33, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s31, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s22, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s31, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s59, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s45, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s60, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s60, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s61, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s47, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s62, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s62, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s61, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s47, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s62, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s62, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s31, s31, e4);
		// no header
		{
			Transition t = helper.createTransition(s31, s22, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s31, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s57, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s43, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s58, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s58, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s31, s31, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s31, s22, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s31, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s61, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s47, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s62, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s62, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s61, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s47, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s62, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s62, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s65, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s52, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s66, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s66, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s67, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s53, e1, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s68, e1, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s68, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s69, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s54, e1, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s70, e1, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s70, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s69, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s54, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s70, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s70, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s65, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s52, e1, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s66, e1, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s66, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s69, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s54, e1, e2, e3, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s70, e1, e2, e3, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s70, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s69, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s54, e1, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s70, e1, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s70, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s74, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s15, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s32, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s40, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s77, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s77, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s32, s29, e0);
		helper.createTransition(s32, s32, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s32, s73, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s74, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s75, e0, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s13, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s15, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s29, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s32, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s39, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s40, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s41, e0, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s76, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s77, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s78, e0, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s76, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s77, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s78, e0, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s82, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s50, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s85, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s85, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s81, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s82, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s83, e0, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s49, e0, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s50, e0, e1, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s51, e0, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s84, e0, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s85, e0, e1, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s86, e0, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s84, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s85, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s32, s86, e0, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s24, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s33, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s59, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s45, e1, e2);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s60, e1, e2);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s60, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s33, s31, e4);
		// no header
		{
			Transition t = helper.createTransition(s33, s22, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s31, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s57, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s43, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s58, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s58, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s33, s33, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s33, s24, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s33, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s59, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s45, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s60, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s60, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s61, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s47, e1, e2, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s62, e1, e2, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s62, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s67, e2, e3);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s53, e1, e2, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s68, e1, e2, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s68, e2, e3);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s65, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s52, e1, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s66, e1, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s66, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s67, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s53, e1, e2, e3, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s68, e1, e2, e3, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s68, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s69, e2, e3, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s54, e1, e2, e3, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s70, e1, e2, e3, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s33, s70, e2, e3, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s34, s36, e0);
		helper.createTransition(s34, s37, e0, e1);
		helper.createTransition(s34, s42, e4);
		helper.createTransition(s34, s44, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s34, s0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s34, s95, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s34, s1, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s34, s2, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s34, s96, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s34, s97, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s34, s3, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s34, s98, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s34, s4, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s34, s99, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s34, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s35, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s35, s41, e0);
		helper.createTransition(s35, s40, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s35, s36, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s37, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s38, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s39, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s40, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s41, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s35, s47, e4);
		// no header
		{
			Transition t = helper.createTransition(s35, s42, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s43, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s35, s45, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s35, s44, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s45, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s46, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s47, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s48, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s100, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s95, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s100, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s51, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s50, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s101, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s102, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s96, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s97, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s103, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s104, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s102, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s101, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s54, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s105, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s98, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s106, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s53, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s107, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s99, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s107, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s108, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s105, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s36, s37, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s36, s38, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s36, s36, e0);
		helper.createTransition(s36, s38, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s36, s1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s36, s2, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s36, s9, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s36, s96, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s36, s97, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s36, s103, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s36, s1, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s36, s9, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s36, s96, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s36, s103, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s37, s38, e0);
		helper.createTransition(s37, s37, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s37, s2, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s37, s97, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s37, s9, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s37, s2, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s37, s103, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s37, s97, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s38, s37, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s38, s38, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s38, s38, e0);
		helper.createTransition(s38, s38, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s38, s9, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s38, s2, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s38, s9, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s38, s103, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s38, s97, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s38, s103, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s38, s9, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s38, s9, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s38, s103, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s38, s103, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s39, s40, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s39, s41, e1);
		helper.createTransition(s39, s39, e0);
		helper.createTransition(s39, s41, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s39, s49, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s39, s50, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s39, s51, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s39, s104, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s39, s102, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s39, s101, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s39, s49, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s39, s51, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s39, s104, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s39, s101, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s40, s37, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s40, s40, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s40, s41, e0);
		helper.createTransition(s40, s40, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s40, s36, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s40, s37, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s40, s38, e0, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s40, s39, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s40, s40, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s40, s41, e0, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s40, s50, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s40, s102, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s40, s97, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s40, s102, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s40, s51, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s40, s50, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s40, s101, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s40, s102, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s40, s96, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s40, s97, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s40, s103, e0, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s40, s104, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s40, s102, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s40, s101, e0, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s40, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s41, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s36, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s37, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s38, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s38, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s39, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s40, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s41, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s41, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s41, s41, e0);
		helper.createTransition(s41, s41, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s41, s36, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s38, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s38, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s39, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s41, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s41, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s51, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s50, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s51, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s101, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s102, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s101, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s96, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s97, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s103, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s103, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s104, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s102, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s101, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s101, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s51, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s51, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s101, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s101, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s96, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s103, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s103, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s104, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s101, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s41, s101, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s42, s44, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s42, s46, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s42, s42, e4);
		helper.createTransition(s42, s46, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s42, s3, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s42, s98, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s42, s4, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s42, s99, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s42, s18, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s42, s108, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s42, s3, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s42, s98, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s42, s18, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s42, s108, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s43, s45, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s43, s47, e5);
		helper.createTransition(s43, s43, e4);
		helper.createTransition(s43, s47, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s43, s52, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s43, s106, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s43, s53, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s43, s107, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s43, s54, e3, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s43, s105, e3, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s43, s52, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s43, s106, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s43, s54, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s43, s105, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s44, s46, e4);
		helper.createTransition(s44, s44, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s44, s4, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s44, s99, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s44, s18, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s44, s108, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s44, s4, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s44, s99, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s45, s44, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s45, s45, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s45, s47, e4);
		// no header
		{
			Transition t = helper.createTransition(s45, s42, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s45, s43, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s45, s45, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s45, s44, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s45, s45, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s45, s46, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s45, s47, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s45, s53, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s45, s107, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s45, s99, e2, e3);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s45, s107, e2, e3);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s45, s54, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s45, s105, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s45, s98, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s45, s106, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s45, s53, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s45, s107, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s45, s99, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s45, s107, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s45, s108, e2, e3, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s45, s105, e2, e3, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s46, s44, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s46, s46, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s46, s46, e4);
		helper.createTransition(s46, s46, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s46, s18, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s46, s108, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s46, s4, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s46, s99, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s46, s18, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s46, s108, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s46, s18, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s46, s108, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s46, s18, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s46, s108, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s42, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s43, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s45, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s47, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s44, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s45, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s46, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s47, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s46, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s47, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s47, s47, e4);
		// no header
		{
			Transition t = helper.createTransition(s47, s42, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s43, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s47, s47, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s47, s46, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s47, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s46, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s47, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s54, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s105, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s98, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s106, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s53, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s107, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s54, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s105, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s99, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s107, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s108, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s105, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s108, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s105, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s54, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s105, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s98, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s106, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s54, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s105, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s108, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s105, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s108, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s105, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s48, s95, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s48, s100, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s48, s51, e0);
		helper.createTransition(s48, s50, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s48, s96, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s48, s97, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s48, s103, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s48, s104, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s48, s102, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s48, s101, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s48, s54, e4);
		// no header
		{
			Transition t = helper.createTransition(s48, s98, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s48, s106, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s48, s53, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s48, s99, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s48, s107, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s48, s108, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s48, s105, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s48, s27, e0, e4);
		helper.createTransition(s48, s26, e0, e1, e4);
		// no header
		{
			Transition t = helper.createTransition(s48, s87, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s48, s71, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s48, s88, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s48, s17, e0, e4, e5);
		helper.createTransition(s48, s8, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s48, s55, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s48, s35, e0, e1, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s48, s56, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s48, s89, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s48, s72, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s48, s90, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s49, s50, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s49, s51, e1);
		helper.createTransition(s49, s49, e0);
		helper.createTransition(s49, s51, e0, e1);
		helper.createTransition(s49, s28, e0, e4);
		helper.createTransition(s49, s29, e0, e1, e4);
		helper.createTransition(s49, s12, e0, e4, e5);
		helper.createTransition(s49, s13, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s49, s28, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s49, s32, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s49, s29, e1, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s49, s12, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s49, s15, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s49, s13, e1, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s49, s25, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s49, s26, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s49, s27, e1, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s49, s7, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s49, s8, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s49, s17, e1, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s50, s97, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s50, s102, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s50, s51, e0);
		helper.createTransition(s50, s50, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s50, s96, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s50, s97, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s50, s103, e0, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s50, s104, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s50, s102, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s50, s101, e0, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s50, s29, e0, e4);
		helper.createTransition(s50, s32, e0, e1, e4);
		// no header
		{
			Transition t = helper.createTransition(s50, s73, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s50, s74, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s50, s75, e0, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s50, s13, e0, e4, e5);
		helper.createTransition(s50, s15, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s50, s39, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s50, s40, e0, e1, e2, e4, e5);
		helper.createTransition(s50, s41, e0, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s50, s76, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s50, s77, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s50, s78, e0, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s50, s32, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s50, s74, e2, e4);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s50, s15, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s50, s40, e2, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s50, s77, e2, e4);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s50, s26, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s50, s71, e2, e4);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s50, s8, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s50, s35, e2, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s50, s72, e2, e4);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s50, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s51, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s96, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s97, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s103, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s103, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s104, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s102, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s101, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s101, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s51, s51, e0);
		helper.createTransition(s51, s51, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s51, s96, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s103, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s103, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s104, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s101, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s101, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s51, s29, e0, e4);
		helper.createTransition(s51, s29, e0, e1, e4);
		// no header
		{
			Transition t = helper.createTransition(s51, s73, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s75, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s75, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s51, s13, e0, e4, e5);
		helper.createTransition(s51, s13, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s51, s39, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s51, s41, e0, e1, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s51, s41, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s76, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s78, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s78, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s29, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s32, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s29, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s73, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s74, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s75, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s75, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s13, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s15, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s13, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s39, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s40, e1, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s41, e1, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s41, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s76, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s77, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s78, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s78, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s27, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s26, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s27, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s87, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s71, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s88, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s88, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s17, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s8, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s17, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s55, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s35, e1, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s56, e1, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s56, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s89, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s72, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s90, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s90, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s52, s53, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s52, s54, e5);
		helper.createTransition(s52, s52, e4);
		helper.createTransition(s52, s54, e4, e5);
		helper.createTransition(s52, s30, e0, e4);
		helper.createTransition(s52, s20, e0, e1, e4);
		helper.createTransition(s52, s31, e0, e4, e5);
		helper.createTransition(s52, s22, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s52, s30, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s52, s20, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s52, s33, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s52, s24, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s52, s31, e0, e5);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s52, s22, e0, e1, e5);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s52, s16, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s52, s6, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s52, s17, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s52, s8, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s52, s27, e0, e5);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s52, s26, e0, e1, e5);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s53, s99, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s53, s107, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s53, s54, e4);
		// no header
		{
			Transition t = helper.createTransition(s53, s98, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s53, s106, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s53, s53, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s53, s99, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s53, s107, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s53, s108, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s53, s105, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s53, s31, e0, e4);
		helper.createTransition(s53, s22, e0, e1, e4);
		// no header
		{
			Transition t = helper.createTransition(s53, s57, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s53, s43, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s53, s58, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s53, s33, e0, e4, e5);
		helper.createTransition(s53, s24, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s53, s59, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s53, s45, e0, e1, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s53, s60, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s53, s61, e0, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s53, s47, e0, e1, e2, e4);
		// no header
		{
			Transition t = helper.createTransition(s53, s62, e0, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s53, s33, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s53, s24, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s53, s59, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s53, s45, e0, e1, e2);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s53, s60, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s53, s17, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s53, s8, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s53, s55, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s53, s35, e0, e1, e2);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s53, s56, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s98, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s106, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s53, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s54, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s99, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s107, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s108, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s105, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s108, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s105, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s54, s54, e4);
		// no header
		{
			Transition t = helper.createTransition(s54, s98, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s106, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s54, s54, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s54, s108, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s105, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s108, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s105, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s54, s31, e0, e4);
		helper.createTransition(s54, s22, e0, e1, e4);
		// no header
		{
			Transition t = helper.createTransition(s54, s57, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s43, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s58, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s54, s31, e0, e4, e5);
		helper.createTransition(s54, s22, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s54, s61, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s54, s47, e0, e1, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s54, s62, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s61, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s47, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s62, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s31, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s22, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s57, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s43, e0, e1, e2);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s58, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s33, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s24, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s31, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s22, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s59, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s45, e0, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s60, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s61, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s47, e0, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s62, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s61, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s47, e0, e1, e2);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s62, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s27, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s26, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s87, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s71, e0, e1, e2);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s88, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s17, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s8, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s27, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s26, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s55, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s35, e0, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s56, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s89, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s72, e0, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s90, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s89, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s72, e0, e1, e2);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s90, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s35, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s56, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s55, s39, e0);
		helper.createTransition(s55, s41, e0, e1);
		helper.createTransition(s55, s61, e4);
		// no header
		{
			Transition t = helper.createTransition(s55, s47, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s62, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s55, s59, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s55, s45, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s60, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s63, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s48, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s64, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s109, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s100, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s110, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s49, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s51, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s104, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s101, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s69, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s54, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s70, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s111, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s105, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s112, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s67, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s53, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s68, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s113, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s107, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s114, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s35, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s56, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s55, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s35, e1, e2);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s56, e1, e2);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s56, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s56, s41, e0);
		helper.createTransition(s56, s41, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s56, s36, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s38, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s38, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s39, e0, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s56, s41, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s56, s41, e0, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s56, s62, e4);
		// no header
		{
			Transition t = helper.createTransition(s56, s47, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s62, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s57, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s43, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s58, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s58, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s56, s60, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s56, s45, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s60, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s59, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s45, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s60, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s60, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s61, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s47, e1, e2, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s62, e1, e2, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s62, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s64, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s48, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s64, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s110, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s100, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s110, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s109, e2, e3);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s100, e1, e2, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s110, e1, e2, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s110, e2, e3);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s51, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s51, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s101, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s101, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s96, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s103, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s103, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s104, e0, e2, e3);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s56, s101, e0, e1, e2, e3);
		// no header
		{
			Transition t = helper.createTransition(s56, s101, e0, e2, e3);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s70, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s54, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s70, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s112, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s105, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s112, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s115, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s106, e1, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s116, e1, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s116, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s68, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s53, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s68, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s114, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s107, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s114, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s113, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s107, e1, e2, e3, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s114, e1, e2, e3, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s114, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s111, e2, e3, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s105, e1, e2, e3, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s112, e1, e2, e3, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s56, s112, e2, e3, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s43, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s58, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s59, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s45, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s60, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s57, s61, e5);
		// no header
		{
			Transition t = helper.createTransition(s57, s47, e1, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s62, e1, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s57, s57, e4);
		// no header
		{
			Transition t = helper.createTransition(s57, s43, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s58, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s57, s61, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s57, s47, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s62, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s65, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s52, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s66, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s115, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s106, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s116, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s67, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s53, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s68, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s113, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s107, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s114, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s69, e3, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s54, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s70, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s111, e3, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s105, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s112, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s65, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s52, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s66, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s115, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s106, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s116, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s69, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s54, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s70, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s111, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s105, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s57, s112, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s43, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s58, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s60, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s45, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s60, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s58, s62, e5);
		// no header
		{
			Transition t = helper.createTransition(s58, s47, e1, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s62, e1, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s58, s58, e4);
		// no header
		{
			Transition t = helper.createTransition(s58, s43, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s58, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s58, s62, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s58, s47, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s62, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s66, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s52, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s66, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s116, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s106, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s116, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s68, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s53, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s68, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s114, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s107, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s114, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s70, e3, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s54, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s70, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s112, e3, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s105, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s112, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s66, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s52, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s66, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s116, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s106, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s116, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s70, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s54, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s70, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s112, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s105, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s112, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s59, s45, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s59, s60, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s59, s61, e4);
		// no header
		{
			Transition t = helper.createTransition(s59, s47, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s59, s62, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s59, s59, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s59, s45, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s59, s60, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s59, s67, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s59, s53, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s59, s68, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s59, s113, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s59, s107, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s59, s114, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s59, s69, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s59, s54, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s59, s70, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s59, s111, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s59, s105, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s59, s112, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s59, s67, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s59, s53, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s59, s68, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s59, s113, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s59, s107, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s59, s114, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s45, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s60, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s59, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s45, e1, e2);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s60, e1, e2);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s60, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s60, s62, e4);
		// no header
		{
			Transition t = helper.createTransition(s60, s47, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s62, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s57, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s43, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s58, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s58, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s60, s60, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s60, s45, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s60, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s59, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s45, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s60, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s60, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s61, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s47, e1, e2, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s62, e1, e2, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s62, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s68, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s53, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s68, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s114, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s107, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s114, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s113, e2, e3);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s107, e1, e2, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s114, e1, e2, e3);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s114, e2, e3);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s70, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s54, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s70, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s112, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s105, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s112, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s115, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s106, e1, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s116, e1, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s116, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s68, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s53, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s68, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s114, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s107, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s114, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s113, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s107, e1, e2, e3, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s114, e1, e2, e3, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s114, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s111, e2, e3, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s105, e1, e2, e3, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s112, e1, e2, e3, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s60, s112, e2, e3, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s47, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s62, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s59, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s45, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s60, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s61, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s47, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s62, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s61, s61, e4);
		// no header
		{
			Transition t = helper.createTransition(s61, s47, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s62, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s61, s61, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s61, s47, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s62, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s69, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s54, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s70, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s111, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s105, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s112, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s67, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s53, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s68, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s113, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s107, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s114, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s69, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s54, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s70, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s111, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s105, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s112, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s69, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s54, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s70, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s111, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s105, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s112, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s69, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s54, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s70, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s111, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s105, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s61, s112, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s47, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s62, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s57, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s43, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s58, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s58, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s60, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s45, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s60, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s62, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s47, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s62, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s59, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s45, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s60, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s60, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s61, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s47, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s62, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s62, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s61, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s47, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s62, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s62, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s62, s62, e4);
		// no header
		{
			Transition t = helper.createTransition(s62, s47, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s62, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s57, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s43, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s58, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s58, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s62, s62, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s62, s47, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s62, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s61, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s47, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s62, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s62, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s61, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s47, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s62, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s62, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s70, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s54, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s70, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s112, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s105, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s112, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s115, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s106, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s116, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s116, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s68, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s53, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s68, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s114, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s107, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s114, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s70, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s54, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s70, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s112, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s105, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s112, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s113, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s107, e1, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s114, e1, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s114, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s111, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s105, e1, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s112, e1, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s112, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s111, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s105, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s112, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s112, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s70, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s54, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s70, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s112, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s105, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s112, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s115, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s106, e1, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s116, e1, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s116, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s70, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s54, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s70, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s112, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s105, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s112, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s111, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s105, e1, e2, e3, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s112, e1, e2, e3, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s112, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s111, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s105, e1, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s112, e1, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s62, s112, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s63, s48, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s63, s64, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s63, s49, e0);
		helper.createTransition(s63, s51, e0, e1);
		helper.createTransition(s63, s69, e4);
		// no header
		{
			Transition t = helper.createTransition(s63, s54, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s63, s70, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s63, s67, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s63, s53, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s63, s68, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s63, s25, e0, e4);
		helper.createTransition(s63, s27, e0, e1, e4);
		helper.createTransition(s63, s7, e0, e4, e5);
		helper.createTransition(s63, s17, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s64, s48, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s64, s64, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s64, s109, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s64, s100, e1, e2);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s64, s110, e1, e2);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s64, s110, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s64, s51, e0);
		helper.createTransition(s64, s51, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s64, s96, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s64, s103, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s64, s103, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s64, s104, e0, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s64, s101, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s64, s101, e0, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s64, s70, e4);
		// no header
		{
			Transition t = helper.createTransition(s64, s54, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s64, s70, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s64, s115, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s64, s106, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s64, s116, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s64, s116, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s64, s68, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s64, s53, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s64, s68, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s64, s113, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s64, s107, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s64, s114, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s64, s114, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s64, s111, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s64, s105, e1, e2, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s64, s112, e1, e2, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s64, s112, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s64, s27, e0, e4);
		helper.createTransition(s64, s27, e0, e1, e4);
		// no header
		{
			Transition t = helper.createTransition(s64, s87, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s64, s88, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s64, s88, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s64, s17, e0, e4, e5);
		helper.createTransition(s64, s17, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s64, s55, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s64, s56, e0, e1, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s64, s56, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s64, s89, e0, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s64, s90, e0, e1, e2, e4);
		// no header
		{
			Transition t = helper.createTransition(s64, s90, e0, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s65, s52, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s65, s66, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s65, s67, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s65, s53, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s65, s68, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s65, s69, e5);
		// no header
		{
			Transition t = helper.createTransition(s65, s54, e1, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s65, s70, e1, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s65, s65, e4);
		// no header
		{
			Transition t = helper.createTransition(s65, s52, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s65, s66, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s65, s69, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s65, s54, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s65, s70, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s65, s19, e0, e4);
		helper.createTransition(s65, s30, e0, e1, e4);
		helper.createTransition(s65, s21, e0, e4, e5);
		helper.createTransition(s65, s31, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s65, s19, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s65, s30, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s65, s23, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s65, s33, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s65, s21, e0, e5);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s65, s31, e0, e1, e5);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s65, s5, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s65, s16, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s65, s7, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s65, s17, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s65, s25, e0, e5);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s65, s27, e0, e1, e5);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s66, s52, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s66, s66, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s66, s68, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s66, s53, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s66, s68, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s66, s70, e5);
		// no header
		{
			Transition t = helper.createTransition(s66, s54, e1, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s66, s70, e1, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s66, s66, e4);
		// no header
		{
			Transition t = helper.createTransition(s66, s52, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s66, s66, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s66, s70, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s66, s54, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s66, s70, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s66, s30, e0, e4);
		helper.createTransition(s66, s30, e0, e1, e4);
		helper.createTransition(s66, s31, e0, e4, e5);
		helper.createTransition(s66, s31, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s66, s30, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s66, s30, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s66, s33, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s66, s33, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s66, s31, e0, e5);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s66, s31, e0, e1, e5);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s66, s16, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s66, s16, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s66, s17, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s66, s17, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s66, s27, e0, e5);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s66, s27, e0, e1, e5);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s67, s53, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s67, s68, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s67, s69, e4);
		// no header
		{
			Transition t = helper.createTransition(s67, s54, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s67, s70, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s67, s67, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s67, s53, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s67, s68, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s67, s21, e0, e4);
		helper.createTransition(s67, s31, e0, e1, e4);
		helper.createTransition(s67, s23, e0, e4, e5);
		helper.createTransition(s67, s33, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s67, s23, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s67, s33, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s67, s7, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s67, s17, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s53, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s68, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s113, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s107, e1, e2);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s114, e1, e2);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s114, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s68, s70, e4);
		// no header
		{
			Transition t = helper.createTransition(s68, s54, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s70, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s115, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s106, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s116, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s116, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s68, s68, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s68, s53, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s68, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s113, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s107, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s114, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s114, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s111, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s105, e1, e2, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s112, e1, e2, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s112, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s68, s31, e0, e4);
		helper.createTransition(s68, s31, e0, e1, e4);
		// no header
		{
			Transition t = helper.createTransition(s68, s57, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s58, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s58, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s68, s33, e0, e4, e5);
		helper.createTransition(s68, s33, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s68, s59, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s68, s60, e0, e1, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s68, s60, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s61, e0, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s68, s62, e0, e1, e2, e4);
		// no header
		{
			Transition t = helper.createTransition(s68, s62, e0, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s33, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s33, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s59, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s60, e0, e1, e2);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s60, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s17, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s17, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s55, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s56, e0, e1, e2);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s68, s56, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s69, s54, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s69, s70, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s69, s67, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s69, s53, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s69, s68, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s69, s69, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s69, s54, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s69, s70, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s69, s69, e4);
		// no header
		{
			Transition t = helper.createTransition(s69, s54, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s69, s70, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s69, s69, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s69, s54, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s69, s70, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s69, s21, e0, e4);
		helper.createTransition(s69, s31, e0, e1, e4);
		helper.createTransition(s69, s21, e0, e4, e5);
		helper.createTransition(s69, s31, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s69, s21, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s69, s31, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s69, s23, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s69, s33, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s69, s21, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s69, s31, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s69, s25, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s69, s27, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s69, s7, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s69, s17, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s69, s25, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s69, s27, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s54, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s70, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s115, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s106, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s116, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s116, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s68, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s53, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s68, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s70, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s54, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s70, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s113, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s107, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s114, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s114, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s111, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s105, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s112, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s112, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s111, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s105, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s112, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s112, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s70, s70, e4);
		// no header
		{
			Transition t = helper.createTransition(s70, s54, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s70, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s115, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s106, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s116, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s116, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s70, s70, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s70, s54, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s70, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s111, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s105, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s112, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s112, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s111, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s105, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s112, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s112, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s70, s31, e0, e4);
		helper.createTransition(s70, s31, e0, e1, e4);
		// no header
		{
			Transition t = helper.createTransition(s70, s57, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s58, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s58, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s70, s31, e0, e4, e5);
		helper.createTransition(s70, s31, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s70, s61, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s70, s62, e0, e1, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s70, s62, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s61, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s62, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s62, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s31, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s31, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s57, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s58, e0, e1, e2);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s58, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s33, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s33, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s31, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s31, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s59, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s60, e0, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s60, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s61, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s62, e0, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s62, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s61, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s62, e0, e1, e2);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s62, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s27, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s27, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s87, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s88, e0, e1, e2);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s88, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s17, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s17, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s27, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s27, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s55, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s56, e0, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s56, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s89, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s90, e0, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s90, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s89, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s90, e0, e1, e2);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s70, s90, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s71, s35, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s71, s72, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s71, s75, e0);
		helper.createTransition(s71, s74, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s71, s41, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s71, s40, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s71, s78, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s71, s77, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s71, s43, e4);
		helper.createTransition(s71, s47, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s71, s79, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s71, s117, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s71, s48, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s71, s100, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s71, s80, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s71, s118, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s71, s83, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s71, s82, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s71, s119, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s71, s120, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s71, s51, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s71, s50, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s71, s101, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s71, s102, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s71, s86, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s71, s85, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s71, s121, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s71, s122, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s71, s52, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s71, s106, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s71, s54, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s71, s105, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s71, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s35, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s72, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s35, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s72, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s72, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s72, s78, e0);
		helper.createTransition(s72, s77, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s72, s73, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s74, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s75, e0, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s41, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s40, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s78, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s77, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s39, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s40, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s41, e0, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s76, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s77, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s78, e0, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s76, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s77, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s78, e0, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s72, s47, e4);
		// no header
		{
			Transition t = helper.createTransition(s72, s42, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s43, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s72, s47, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s72, s46, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s72, s47, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s72, s46, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s47, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s80, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s118, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s117, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s48, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s100, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s80, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s118, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s100, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s118, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s118, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s86, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s85, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s121, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s122, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s123, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s120, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s119, e0, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s51, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s50, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s101, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s102, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s86, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s85, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s121, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s122, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s104, e0, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s102, e0, e1, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s101, e0, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s124, e0, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s122, e0, e1, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s121, e0, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s124, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s122, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s121, e0, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s54, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s105, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s98, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s106, e2, e3, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s54, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s105, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s108, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s72, s105, e2, e3, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s72, s108, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s72, s105, e2, e3, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s74, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s73, s75, e1);
		// no header
		{
			Transition t = helper.createTransition(s73, s39, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s40, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s41, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s76, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s77, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s78, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s73, s73, e0);
		helper.createTransition(s73, s75, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s73, s39, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s41, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s76, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s78, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s81, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s82, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s83, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s123, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s120, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s119, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s49, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s50, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s51, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s104, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s102, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s101, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s84, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s85, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s86, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s124, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s122, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s121, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s81, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s83, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s123, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s119, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s49, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s51, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s104, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s101, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s84, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s86, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s124, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s73, s121, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s74, s40, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s74, s77, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s74, s75, e0);
		helper.createTransition(s74, s74, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s74, s41, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s74, s40, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s74, s78, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s74, s77, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s74, s82, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s74, s120, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s74, s50, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s74, s102, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s74, s85, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s74, s122, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s74, s83, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s74, s82, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s74, s119, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s74, s120, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s74, s51, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s74, s50, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s74, s101, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s74, s102, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s74, s86, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s74, s85, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s74, s121, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s74, s122, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s74, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s75, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s41, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s40, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s41, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s78, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s77, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s78, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s75, s75, e0);
		helper.createTransition(s75, s75, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s75, s41, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s41, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s78, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s78, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s83, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s82, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s83, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s119, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s120, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s119, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s51, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s50, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s51, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s101, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s102, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s101, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s86, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s85, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s86, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s121, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s122, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s121, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s83, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s83, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s119, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s119, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s51, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s51, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s101, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s101, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s86, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s86, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s121, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s75, s121, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s77, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s76, s78, e1);
		// no header
		{
			Transition t = helper.createTransition(s76, s39, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s40, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s41, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s76, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s77, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s78, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s76, s76, e0);
		helper.createTransition(s76, s78, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s76, s39, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s41, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s76, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s78, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s84, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s85, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s86, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s124, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s122, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s121, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s49, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s50, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s51, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s104, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s102, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s101, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s84, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s85, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s86, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s124, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s122, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s121, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s84, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s86, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s124, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s121, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s49, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s51, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s104, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s101, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s84, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s86, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s124, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s76, s121, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s74, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s40, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s77, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s40, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s77, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s77, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s77, s78, e0);
		helper.createTransition(s77, s77, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s77, s73, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s74, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s75, e0, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s41, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s40, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s78, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s77, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s39, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s40, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s41, e0, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s76, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s77, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s78, e0, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s76, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s77, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s78, e0, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s85, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s122, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s120, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s50, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s102, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s85, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s122, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s102, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s122, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s122, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s86, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s85, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s121, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s122, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s123, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s120, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s119, e0, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s51, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s50, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s101, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s102, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s86, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s85, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s121, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s122, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s104, e0, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s102, e0, e1, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s101, e0, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s124, e0, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s122, e0, e1, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s121, e0, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s124, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s122, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s77, s121, e0, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s77, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s78, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s73, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s74, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s75, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s75, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s41, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s40, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s41, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s78, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s77, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s78, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s39, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s40, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s41, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s41, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s76, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s77, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s78, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s78, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s76, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s77, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s78, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s78, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s78, s78, e0);
		helper.createTransition(s78, s78, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s78, s73, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s75, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s75, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s41, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s41, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s78, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s78, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s39, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s41, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s41, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s76, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s78, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s78, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s76, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s78, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s78, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s86, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s85, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s86, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s121, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s122, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s121, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s123, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s120, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s119, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s119, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s51, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s50, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s51, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s101, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s102, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s101, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s86, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s85, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s86, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s121, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s122, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s121, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s104, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s102, e1, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s101, e1, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s101, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s124, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s122, e1, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s121, e1, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s121, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s124, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s122, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s121, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s121, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s86, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s86, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s121, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s121, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s123, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s119, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s119, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s51, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s51, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s101, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s101, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s86, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s86, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s121, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s121, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s104, e0, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s101, e0, e1, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s101, e0, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s124, e0, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s121, e0, e1, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s121, e0, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s124, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s121, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s78, s121, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s79, s48, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s79, s80, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s79, s83, e0);
		helper.createTransition(s79, s82, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s79, s51, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s79, s50, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s79, s86, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s79, s85, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s79, s52, e4);
		helper.createTransition(s79, s54, e4, e5);
		helper.createTransition(s79, s16, e0, e4);
		helper.createTransition(s79, s6, e0, e1, e4);
		helper.createTransition(s79, s27, e0, e4, e5);
		helper.createTransition(s79, s26, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s80, s117, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s80, s48, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s80, s80, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s80, s100, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s80, s118, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s80, s118, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s80, s86, e0);
		helper.createTransition(s80, s85, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s80, s123, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s80, s120, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s80, s119, e0, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s80, s51, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s80, s50, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s80, s86, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s80, s85, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s80, s104, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s80, s102, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s80, s101, e0, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s80, s124, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s80, s122, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s80, s121, e0, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s80, s124, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s80, s122, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s80, s121, e0, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s80, s54, e4);
		// no header
		{
			Transition t = helper.createTransition(s80, s98, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s80, s106, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s80, s54, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s80, s108, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s80, s105, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s80, s108, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s80, s105, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s80, s27, e0, e4);
		helper.createTransition(s80, s26, e0, e1, e4);
		// no header
		{
			Transition t = helper.createTransition(s80, s87, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s80, s71, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s80, s88, e0, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s80, s27, e0, e4, e5);
		helper.createTransition(s80, s26, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s80, s89, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s80, s72, e0, e1, e2, e4, e5);
		helper.createTransition(s80, s90, e0, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s80, s89, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s80, s72, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s80, s90, e0, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s81, s82, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s81, s83, e1);
		// no header
		{
			Transition t = helper.createTransition(s81, s49, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s81, s50, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s81, s51, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s81, s84, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s81, s85, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s81, s86, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s81, s81, e0);
		helper.createTransition(s81, s83, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s81, s49, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s81, s51, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s81, s84, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s81, s86, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s81, s10, e0, e4);
		helper.createTransition(s81, s11, e0, e1, e4);
		helper.createTransition(s81, s28, e0, e4, e5);
		helper.createTransition(s81, s29, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s81, s10, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s81, s14, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s81, s11, e1, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s81, s28, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s81, s32, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s81, s29, e1, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s81, s5, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s81, s6, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s81, s16, e1, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s81, s25, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s81, s26, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s81, s27, e1, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s82, s50, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s82, s85, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s82, s83, e0);
		helper.createTransition(s82, s82, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s82, s51, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s82, s50, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s82, s86, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s82, s85, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s82, s11, e0, e4);
		helper.createTransition(s82, s14, e0, e1, e4);
		helper.createTransition(s82, s29, e0, e4, e5);
		helper.createTransition(s82, s32, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s82, s14, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s82, s32, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s82, s6, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s82, s26, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s83, s82, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s83, s83, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s83, s51, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s83, s50, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s83, s51, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s83, s86, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s83, s85, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s83, s86, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s83, s83, e0);
		helper.createTransition(s83, s83, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s83, s51, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s83, s51, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s83, s86, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s83, s86, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s83, s11, e0, e4);
		helper.createTransition(s83, s11, e0, e1, e4);
		helper.createTransition(s83, s29, e0, e4, e5);
		helper.createTransition(s83, s29, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s83, s11, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s83, s14, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s83, s11, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s83, s29, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s83, s32, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s83, s29, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s83, s16, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s83, s6, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s83, s16, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s83, s27, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s83, s26, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s83, s27, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s84, s85, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s84, s86, e1);
		// no header
		{
			Transition t = helper.createTransition(s84, s49, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s84, s50, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s84, s51, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s84, s84, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s84, s85, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s84, s86, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s84, s84, e0);
		helper.createTransition(s84, s86, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s84, s49, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s84, s51, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s84, s84, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s84, s86, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s84, s28, e0, e4);
		helper.createTransition(s84, s29, e0, e1, e4);
		helper.createTransition(s84, s28, e0, e4, e5);
		helper.createTransition(s84, s29, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s84, s28, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s84, s32, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s84, s29, e1, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s84, s28, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s84, s32, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s84, s29, e1, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s84, s25, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s84, s26, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s84, s27, e1, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s84, s25, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s84, s26, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s84, s27, e1, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s120, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s50, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s85, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s102, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s122, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s122, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s85, s86, e0);
		helper.createTransition(s85, s85, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s85, s123, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s120, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s119, e0, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s51, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s50, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s86, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s85, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s104, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s102, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s101, e0, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s124, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s122, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s121, e0, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s124, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s122, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s121, e0, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s85, s29, e0, e4);
		helper.createTransition(s85, s32, e0, e1, e4);
		// no header
		{
			Transition t = helper.createTransition(s85, s73, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s74, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s75, e0, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s85, s29, e0, e4, e5);
		helper.createTransition(s85, s32, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s85, s76, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s85, s77, e0, e1, e2, e4, e5);
		helper.createTransition(s85, s78, e0, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s85, s76, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s77, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s78, e0, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s32, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s74, e2, e4);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s32, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s77, e2, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s77, e2, e4);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s26, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s71, e2, e4);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s26, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s72, e2, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s85, s72, e2, e4);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s85, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s86, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s123, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s120, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s119, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s119, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s51, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s50, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s51, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s86, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s85, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s86, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s104, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s102, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s101, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s101, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s124, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s122, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s121, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s121, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s124, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s122, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s121, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s121, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s86, s86, e0);
		helper.createTransition(s86, s86, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s86, s123, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s119, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s119, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s51, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s51, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s86, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s86, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s104, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s101, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s101, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s124, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s121, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s121, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s124, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s121, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s121, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s86, s29, e0, e4);
		helper.createTransition(s86, s29, e0, e1, e4);
		// no header
		{
			Transition t = helper.createTransition(s86, s73, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s75, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s75, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s86, s29, e0, e4, e5);
		helper.createTransition(s86, s29, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s86, s76, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s86, s78, e0, e1, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s86, s78, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s76, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s78, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s78, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s29, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s32, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s29, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s73, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s74, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s75, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s75, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s29, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s32, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s29, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s76, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s77, e1, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s78, e1, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s78, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s76, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s77, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s78, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s78, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s27, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s26, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s27, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s87, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s71, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s88, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s88, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s27, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s26, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s27, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s89, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s72, e1, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s90, e1, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s90, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s89, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s72, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s90, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s86, s90, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s71, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s88, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s55, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s35, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s56, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s89, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s72, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s90, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s87, s73, e0);
		helper.createTransition(s87, s75, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s87, s39, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s41, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s76, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s78, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s87, s57, e4);
		// no header
		{
			Transition t = helper.createTransition(s87, s43, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s58, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s87, s61, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s87, s47, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s62, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s91, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s79, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s92, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s125, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s117, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s126, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s63, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s48, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s64, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s109, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s100, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s110, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s93, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s80, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s94, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s127, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s118, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s128, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s81, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s83, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s123, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s119, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s49, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s51, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s104, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s101, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s84, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s86, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s124, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s121, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s65, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s52, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s66, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s115, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s106, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s116, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s69, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s54, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s70, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s111, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s105, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s87, s112, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s71, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s88, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s56, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s35, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s56, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s88, s90, e5);
		// no header
		{
			Transition t = helper.createTransition(s88, s72, e1, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s90, e1, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s88, s75, e0);
		helper.createTransition(s88, s75, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s88, s41, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s41, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s88, s78, e0, e5);
		helper.createTransition(s88, s78, e0, e1, e5);
		helper.createTransition(s88, s58, e4);
		// no header
		{
			Transition t = helper.createTransition(s88, s43, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s58, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s88, s62, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s88, s47, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s62, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s92, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s79, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s92, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s126, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s117, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s126, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s64, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s48, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s64, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s110, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s100, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s110, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s94, e3, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s80, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s94, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s128, e3, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s118, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s128, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s83, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s83, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s119, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s119, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s51, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s51, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s101, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s101, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s86, e0, e3, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s86, e0, e1, e3, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s121, e0, e3, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s121, e0, e1, e3, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s66, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s52, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s66, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s116, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s106, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s116, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s70, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s54, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s70, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s112, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s105, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s88, s112, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s72, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s89, s90, e1);
		// no header
		{
			Transition t = helper.createTransition(s89, s55, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s35, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s56, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s89, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s72, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s90, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s89, s76, e0);
		helper.createTransition(s89, s78, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s89, s39, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s41, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s76, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s78, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s89, s61, e4);
		// no header
		{
			Transition t = helper.createTransition(s89, s47, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s89, s62, e1, e4);
		helper.createTransition(s89, s61, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s89, s47, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s89, s62, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s89, s93, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s80, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s94, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s127, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s118, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s128, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s63, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s48, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s64, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s109, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s100, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s110, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s93, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s80, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s94, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s127, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s118, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s128, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s84, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s86, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s124, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s121, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s49, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s51, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s104, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s101, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s84, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s86, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s124, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s121, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s69, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s54, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s70, e1, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s111, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s105, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s112, e1, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s69, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s54, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s70, e1, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s111, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s105, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s89, s112, e1, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s72, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s90, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s87, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s71, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s88, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s88, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s56, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s35, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s56, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s90, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s72, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s90, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s55, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s35, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s56, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s56, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s89, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s72, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s90, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s90, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s89, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s72, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s90, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s90, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s90, s78, e0);
		helper.createTransition(s90, s78, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s90, s73, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s75, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s75, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s41, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s41, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s78, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s78, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s39, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s41, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s41, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s76, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s78, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s78, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s76, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s78, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s78, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s90, s62, e4);
		// no header
		{
			Transition t = helper.createTransition(s90, s47, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s62, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s57, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s43, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s58, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s58, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s90, s62, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s90, s47, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s62, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s61, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s47, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s62, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s62, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s61, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s47, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s62, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s62, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s94, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s80, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s94, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s128, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s118, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s128, e1, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s125, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s117, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s126, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s126, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s64, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s48, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s64, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s110, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s100, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s110, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s94, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s80, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s94, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s128, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s118, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s128, e1, e3, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s109, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s100, e1, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s110, e1, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s110, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s127, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s118, e1, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s128, e1, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s128, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s127, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s118, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s128, e1, e2, e3);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s128, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s86, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s86, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s121, e0, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s121, e0, e1, e3);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s123, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s119, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s119, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s51, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s51, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s101, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s101, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s86, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s86, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s121, e0, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s121, e0, e1, e3, e5);
			t.setGuard(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s104, e0, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s101, e0, e1, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s101, e0, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s124, e0, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s121, e0, e1, e2, e3, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s121, e0, e2, e3, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s124, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s121, e0, e1, e2, e3);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s121, e0, e2, e3);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s70, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s54, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s70, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s112, e3, e4);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s105, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s112, e1, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s115, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s106, e1, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s116, e1, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s116, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s70, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s54, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s70, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s112, e3, e4, e5);
			t.setGuard(inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s105, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s112, e1, e3, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e2, e3), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s111, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s105, e1, e2, e3, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s112, e1, e2, e3, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s112, e2, e3, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s111, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s105, e1, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s112, e1, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s90, s112, e2, e3, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s91, s79, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s91, s92, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s91, s63, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s91, s48, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s91, s64, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s91, s93, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s91, s80, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s91, s94, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s91, s81, e0);
		helper.createTransition(s91, s83, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s91, s49, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s91, s51, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s91, s84, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s91, s86, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s91, s65, e4);
		// no header
		{
			Transition t = helper.createTransition(s91, s52, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s91, s66, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s91, s69, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s91, s54, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s91, s70, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s91, s5, e0, e4);
		helper.createTransition(s91, s16, e0, e1, e4);
		helper.createTransition(s91, s25, e0, e4, e5);
		helper.createTransition(s91, s27, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s92, s79, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s92, s92, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s92, s64, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s92, s48, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s92, s64, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s92, s94, e5);
		// no header
		{
			Transition t = helper.createTransition(s92, s80, e1, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s92, s94, e1, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s92, s83, e0);
		helper.createTransition(s92, s83, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s92, s51, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s92, s51, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s92, s86, e0, e5);
		helper.createTransition(s92, s86, e0, e1, e5);
		helper.createTransition(s92, s66, e4);
		// no header
		{
			Transition t = helper.createTransition(s92, s52, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s92, s66, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s92, s70, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s92, s54, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s92, s70, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s92, s16, e0, e4);
		helper.createTransition(s92, s16, e0, e1, e4);
		helper.createTransition(s92, s27, e0, e4, e5);
		helper.createTransition(s92, s27, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s93, s80, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s93, s94, e1);
		// no header
		{
			Transition t = helper.createTransition(s93, s63, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s93, s48, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s93, s64, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s93, s93, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s93, s80, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s93, s94, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s93, s84, e0);
		helper.createTransition(s93, s86, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s93, s49, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s93, s51, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s93, s84, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s93, s86, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s93, s69, e4);
		// no header
		{
			Transition t = helper.createTransition(s93, s54, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s93, s70, e1, e4);
		helper.createTransition(s93, s69, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s93, s54, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s93, s70, e1, e4, e5);
		helper.createTransition(s93, s25, e0, e4);
		helper.createTransition(s93, s27, e0, e1, e4);
		helper.createTransition(s93, s25, e0, e4, e5);
		helper.createTransition(s93, s27, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s94, s80, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s94, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s125, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s117, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s126, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s126, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s64, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s48, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s64, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s94, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s80, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s94, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s109, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s100, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s110, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s110, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s127, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s118, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s128, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s128, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s127, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s118, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s128, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s128, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s94, s86, e0);
		helper.createTransition(s94, s86, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s94, s123, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s119, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s119, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s51, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s51, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s86, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s86, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s104, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s101, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s101, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s124, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s121, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s121, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s124, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s121, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s121, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s94, s70, e4);
		// no header
		{
			Transition t = helper.createTransition(s94, s54, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s70, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s115, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s106, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s116, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s116, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s94, s70, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s94, s54, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s70, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s111, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s105, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s112, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s112, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s111, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s105, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s112, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s112, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s94, s27, e0, e4);
		helper.createTransition(s94, s27, e0, e1, e4);
		// no header
		{
			Transition t = helper.createTransition(s94, s87, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s88, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s88, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s94, s27, e0, e4, e5);
		helper.createTransition(s94, s27, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s94, s89, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s94, s90, e0, e1, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s94, s90, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s89, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s90, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s94, s90, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s95, s96, e0);
		helper.createTransition(s95, s97, e0, e1);
		helper.createTransition(s95, s98, e4);
		helper.createTransition(s95, s99, e4, e5);
		helper.createTransition(s95, s87, e0, e4);
		helper.createTransition(s95, s71, e0, e1, e4);
		helper.createTransition(s95, s55, e0, e4, e5);
		helper.createTransition(s95, s35, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s96, s97, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s96, s103, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s96, s96, e0);
		helper.createTransition(s96, s103, e0, e1);
		helper.createTransition(s96, s73, e0, e4);
		helper.createTransition(s96, s75, e0, e1, e4);
		helper.createTransition(s96, s39, e0, e4, e5);
		helper.createTransition(s96, s41, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s96, s73, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s96, s74, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s96, s75, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s96, s39, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s96, s40, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s96, s41, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s96, s87, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s96, s71, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s96, s88, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s96, s55, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s96, s35, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s96, s56, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s97, s103, e0);
		helper.createTransition(s97, s97, e0, e1);
		helper.createTransition(s97, s75, e0, e4);
		helper.createTransition(s97, s74, e0, e1, e4);
		helper.createTransition(s97, s41, e0, e4, e5);
		helper.createTransition(s97, s40, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s97, s74, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s97, s40, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s97, s71, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s97, s35, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s98, s99, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s98, s108, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s98, s98, e4);
		helper.createTransition(s98, s108, e4, e5);
		helper.createTransition(s98, s57, e0, e4);
		helper.createTransition(s98, s43, e0, e1, e4);
		helper.createTransition(s98, s61, e0, e4, e5);
		helper.createTransition(s98, s47, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s98, s57, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s98, s43, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s98, s59, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s98, s45, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s98, s61, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s98, s47, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s98, s87, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s98, s71, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s98, s55, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s98, s35, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s98, s89, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s98, s72, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s99, s108, e4);
		helper.createTransition(s99, s99, e4, e5);
		helper.createTransition(s99, s61, e0, e4);
		helper.createTransition(s99, s47, e0, e1, e4);
		helper.createTransition(s99, s59, e0, e4, e5);
		helper.createTransition(s99, s45, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s99, s59, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s99, s45, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s99, s55, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s99, s35, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s100, s95, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s100, s100, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s100, s101, e0);
		helper.createTransition(s100, s102, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s100, s96, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s100, s97, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s100, s103, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s100, s104, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s100, s102, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s100, s101, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s100, s105, e4);
		// no header
		{
			Transition t = helper.createTransition(s100, s98, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s100, s106, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s100, s107, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s100, s99, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s100, s107, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s100, s108, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s100, s105, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s100, s90, e0, e4);
		helper.createTransition(s100, s72, e0, e1, e4);
		// no header
		{
			Transition t = helper.createTransition(s100, s87, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s100, s71, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s100, s88, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s100, s56, e0, e4, e5);
		helper.createTransition(s100, s35, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s100, s55, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s100, s35, e0, e1, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s100, s56, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s100, s89, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s100, s72, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s100, s90, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s102, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s101, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s96, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s97, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s103, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s103, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s104, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s102, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s101, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s101, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s101, s101, e0);
		helper.createTransition(s101, s101, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s101, s96, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s103, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s103, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s104, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s101, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s101, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s101, s78, e0, e4);
		helper.createTransition(s101, s78, e0, e1, e4);
		// no header
		{
			Transition t = helper.createTransition(s101, s73, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s75, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s75, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s101, s41, e0, e4, e5);
		helper.createTransition(s101, s41, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s101, s39, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s101, s41, e0, e1, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s101, s41, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s76, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s78, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s78, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s78, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s77, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s78, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s73, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s74, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s75, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s75, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s41, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s40, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s41, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s39, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s40, e1, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s41, e1, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s41, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s76, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s77, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s78, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s78, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s90, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s72, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s90, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s87, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s71, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s88, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s88, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s56, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s35, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s56, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s55, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s35, e1, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s56, e1, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s56, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s89, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s72, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s90, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s101, s90, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s102, s97, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s102, s102, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s102, s101, e0);
		helper.createTransition(s102, s102, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s102, s96, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s102, s97, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s102, s103, e0, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s102, s104, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s102, s102, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s102, s101, e0, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s102, s78, e0, e4);
		helper.createTransition(s102, s77, e0, e1, e4);
		// no header
		{
			Transition t = helper.createTransition(s102, s73, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s102, s74, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s102, s75, e0, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s102, s41, e0, e4, e5);
		helper.createTransition(s102, s40, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s102, s39, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s102, s40, e0, e1, e2, e4, e5);
		helper.createTransition(s102, s41, e0, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s102, s76, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s102, s77, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s102, s78, e0, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s102, s77, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s102, s74, e2, e4);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s102, s40, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s102, s40, e2, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s102, s77, e2, e4);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s102, s72, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s102, s71, e2, e4);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s102, s35, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s102, s35, e2, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s102, s72, e2, e4);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s103, s97, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s103, s103, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s103, s103, e0);
		helper.createTransition(s103, s103, e0, e1);
		helper.createTransition(s103, s75, e0, e4);
		helper.createTransition(s103, s75, e0, e1, e4);
		helper.createTransition(s103, s41, e0, e4, e5);
		helper.createTransition(s103, s41, e0, e1, e4, e5);
		helper.createTransition(s103, s75, e4);
		// no header
		{
			Transition t = helper.createTransition(s103, s74, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s103, s75, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s103, s41, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s103, s40, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s103, s41, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s103, s88, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s103, s71, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s103, s88, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s103, s56, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s103, s35, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s103, s56, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s104, s102, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s104, s101, e1);
		helper.createTransition(s104, s104, e0);
		helper.createTransition(s104, s101, e0, e1);
		helper.createTransition(s104, s76, e0, e4);
		helper.createTransition(s104, s78, e0, e1, e4);
		helper.createTransition(s104, s39, e0, e4, e5);
		helper.createTransition(s104, s41, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s104, s76, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s104, s77, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s104, s78, e1, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s104, s39, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s104, s40, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s104, s41, e1, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s104, s89, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s104, s72, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s104, s90, e1, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s104, s55, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s104, s35, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s104, s56, e1, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s98, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s106, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s107, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s105, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s99, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s107, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s108, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s105, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s108, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s105, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s105, s105, e4);
		// no header
		{
			Transition t = helper.createTransition(s105, s98, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s106, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s105, s105, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s105, s108, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s105, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s108, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s105, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s105, s62, e0, e4);
		helper.createTransition(s105, s47, e0, e1, e4);
		// no header
		{
			Transition t = helper.createTransition(s105, s57, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s43, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s58, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s105, s62, e0, e4, e5);
		helper.createTransition(s105, s47, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s105, s61, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s105, s47, e0, e1, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s105, s62, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s61, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s47, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s62, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s62, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s47, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s57, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s43, e0, e1, e2);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s58, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s60, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s45, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s62, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s47, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s59, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s45, e0, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s60, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s61, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s47, e0, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s62, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s61, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s47, e0, e1, e2);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s62, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s90, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s72, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s87, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s71, e0, e1, e2);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s88, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s56, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s35, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s90, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s72, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s55, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s35, e0, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s56, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s89, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s72, e0, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s90, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s89, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s72, e0, e1, e2);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s105, s90, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s106, s107, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s106, s105, e5);
		helper.createTransition(s106, s106, e4);
		helper.createTransition(s106, s105, e4, e5);
		helper.createTransition(s106, s58, e0, e4);
		helper.createTransition(s106, s43, e0, e1, e4);
		helper.createTransition(s106, s62, e0, e4, e5);
		helper.createTransition(s106, s47, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s106, s58, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s106, s43, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s106, s60, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s106, s45, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s106, s62, e0, e5);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s106, s47, e0, e1, e5);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s106, s88, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s106, s71, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s106, s56, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s106, s35, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s106, s90, e0, e5);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s106, s72, e0, e1, e5);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s107, s99, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s107, s107, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s107, s105, e4);
		// no header
		{
			Transition t = helper.createTransition(s107, s98, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s107, s106, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s107, s107, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s107, s99, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s107, s107, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s107, s108, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s107, s105, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s107, s62, e0, e4);
		helper.createTransition(s107, s47, e0, e1, e4);
		// no header
		{
			Transition t = helper.createTransition(s107, s57, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s107, s43, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s107, s58, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s107, s60, e0, e4, e5);
		helper.createTransition(s107, s45, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s107, s59, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s107, s45, e0, e1, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s107, s60, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s107, s61, e0, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s107, s47, e0, e1, e2, e4);
		// no header
		{
			Transition t = helper.createTransition(s107, s62, e0, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s107, s60, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s107, s45, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s107, s59, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s107, s45, e0, e1, e2);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s107, s60, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s107, s56, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s107, s35, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s107, s55, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s107, s35, e0, e1, e2);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s107, s56, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s108, s99, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s108, s108, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s108, s108, e4);
		helper.createTransition(s108, s108, e4, e5);
		helper.createTransition(s108, s61, e0, e4);
		helper.createTransition(s108, s47, e0, e1, e4);
		helper.createTransition(s108, s61, e0, e4, e5);
		helper.createTransition(s108, s47, e0, e1, e4, e5);
		helper.createTransition(s108, s61, e0);
		helper.createTransition(s108, s47, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s108, s59, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s108, s45, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s108, s61, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s108, s47, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s108, s89, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s108, s72, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s108, s55, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s108, s35, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s108, s89, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s108, s72, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s109, s100, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s109, s110, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s109, s104, e0);
		helper.createTransition(s109, s101, e0, e1);
		helper.createTransition(s109, s111, e4);
		// no header
		{
			Transition t = helper.createTransition(s109, s105, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s109, s112, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s109, s113, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s109, s107, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s109, s114, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s109, s89, e0, e4);
		helper.createTransition(s109, s90, e0, e1, e4);
		helper.createTransition(s109, s55, e0, e4, e5);
		helper.createTransition(s109, s56, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s110, s100, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s110, s110, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s110, s109, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s110, s100, e1, e2);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s110, s110, e1, e2);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s110, s110, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s110, s101, e0);
		helper.createTransition(s110, s101, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s110, s96, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s110, s103, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s110, s103, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s110, s104, e0, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s110, s101, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s110, s101, e0, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s110, s112, e4);
		// no header
		{
			Transition t = helper.createTransition(s110, s105, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s110, s112, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s110, s115, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s110, s106, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s110, s116, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s110, s116, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s110, s114, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s110, s107, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s110, s114, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s110, s113, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s110, s107, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s110, s114, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s110, s114, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s110, s111, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s110, s105, e1, e2, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s110, s112, e1, e2, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s110, s112, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s110, s90, e0, e4);
		helper.createTransition(s110, s90, e0, e1, e4);
		// no header
		{
			Transition t = helper.createTransition(s110, s87, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s110, s88, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s110, s88, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s110, s56, e0, e4, e5);
		helper.createTransition(s110, s56, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s110, s55, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s110, s56, e0, e1, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s110, s56, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s110, s89, e0, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s110, s90, e0, e1, e2, e4);
		// no header
		{
			Transition t = helper.createTransition(s110, s90, e0, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s111, s105, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s111, s112, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s111, s113, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s111, s107, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s111, s114, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s111, s111, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s111, s105, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s111, s112, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s111, s111, e4);
		// no header
		{
			Transition t = helper.createTransition(s111, s105, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s111, s112, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s111, s111, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s111, s105, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s111, s112, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s111, s61, e0, e4);
		helper.createTransition(s111, s62, e0, e1, e4);
		helper.createTransition(s111, s61, e0, e4, e5);
		helper.createTransition(s111, s62, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s111, s61, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s111, s62, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s111, s59, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s111, s60, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s111, s61, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s111, s62, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s111, s89, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s111, s90, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s111, s55, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s111, s56, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s111, s89, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s111, s90, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s105, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s112, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s115, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s106, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s116, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s116, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s114, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s107, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s114, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s112, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s105, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s112, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s113, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s107, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s114, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s114, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s111, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s105, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s112, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s112, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s111, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s105, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s112, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s112, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s112, s112, e4);
		// no header
		{
			Transition t = helper.createTransition(s112, s105, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s112, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s115, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s106, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s116, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s116, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s112, s112, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s112, s105, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s112, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s111, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s105, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s112, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s112, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s111, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s105, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s112, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s112, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s112, s62, e0, e4);
		helper.createTransition(s112, s62, e0, e1, e4);
		// no header
		{
			Transition t = helper.createTransition(s112, s57, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s58, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s58, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s112, s62, e0, e4, e5);
		helper.createTransition(s112, s62, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s112, s61, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s112, s62, e0, e1, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s112, s62, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s61, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s62, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s62, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s62, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s62, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s57, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s58, e0, e1, e2);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s58, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s60, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s60, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s62, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s62, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s59, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s60, e0, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s60, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s61, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s62, e0, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s62, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s61, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s62, e0, e1, e2);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s62, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s90, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s90, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s87, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s88, e0, e1, e2);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s88, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s56, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s56, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s90, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s90, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s55, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s56, e0, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s56, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s89, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s90, e0, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s90, e0, e2, e5);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s89, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s90, e0, e1, e2);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s112, s90, e0, e2);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s113, s107, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s113, s114, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s113, s111, e4);
		// no header
		{
			Transition t = helper.createTransition(s113, s105, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s113, s112, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s113, s113, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s113, s107, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s113, s114, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s113, s61, e0, e4);
		helper.createTransition(s113, s62, e0, e1, e4);
		helper.createTransition(s113, s59, e0, e4, e5);
		helper.createTransition(s113, s60, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s113, s59, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s113, s60, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s113, s55, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s113, s56, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s107, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s114, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s113, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s107, e1, e2);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s114, e1, e2);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s114, e2);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s114, s112, e4);
		// no header
		{
			Transition t = helper.createTransition(s114, s105, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s112, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s115, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s106, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s116, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s116, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s114, s114, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s114, s107, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s114, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s113, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s107, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s114, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s114, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s111, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s105, e1, e2, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s112, e1, e2, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s112, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s114, s62, e0, e4);
		helper.createTransition(s114, s62, e0, e1, e4);
		// no header
		{
			Transition t = helper.createTransition(s114, s57, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s58, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s58, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s114, s60, e0, e4, e5);
		helper.createTransition(s114, s60, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s114, s59, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s114, s60, e0, e1, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s114, s60, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s61, e0, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s114, s62, e0, e1, e2, e4);
		// no header
		{
			Transition t = helper.createTransition(s114, s62, e0, e2, e4);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s60, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s60, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s59, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s60, e0, e1, e2);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s60, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s56, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s56, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s55, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s56, e0, e1, e2);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s114, s56, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s115, s106, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s115, s116, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s115, s113, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s115, s107, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s115, s114, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s115, s111, e5);
		// no header
		{
			Transition t = helper.createTransition(s115, s105, e1, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s115, s112, e1, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s115, s115, e4);
		// no header
		{
			Transition t = helper.createTransition(s115, s106, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s115, s116, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s115, s111, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s115, s105, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s115, s112, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s115, s57, e0, e4);
		helper.createTransition(s115, s58, e0, e1, e4);
		helper.createTransition(s115, s61, e0, e4, e5);
		helper.createTransition(s115, s62, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s115, s57, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s115, s58, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s115, s59, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s115, s60, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s115, s61, e0, e5);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s115, s62, e0, e1, e5);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s115, s87, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s115, s88, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s115, s55, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s115, s56, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s115, s89, e0, e5);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s115, s90, e0, e1, e5);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s116, s106, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s116, s116, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s116, s114, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s116, s107, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s116, s114, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s116, s112, e5);
		// no header
		{
			Transition t = helper.createTransition(s116, s105, e1, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s116, s112, e1, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s116, s116, e4);
		// no header
		{
			Transition t = helper.createTransition(s116, s106, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s116, s116, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s116, s112, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s116, s105, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s116, s112, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s116, s58, e0, e4);
		helper.createTransition(s116, s58, e0, e1, e4);
		helper.createTransition(s116, s62, e0, e4, e5);
		helper.createTransition(s116, s62, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s116, s58, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s116, s58, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s116, s60, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s116, s60, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s116, s62, e0, e5);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s116, s62, e0, e1, e5);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s116, s88, e0);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s116, s88, e0, e1);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s116, s56, e0, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s116, s56, e0, e1, e5);
			t.setGuard(conjunction(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS), inv(diff(e4, e0), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s116, s90, e0, e5);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s116, s90, e0, e1, e5);
			t.setGuard(inv(diff(e4, e0), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s117, s100, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s117, s118, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s117, s119, e0);
		helper.createTransition(s117, s120, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s117, s101, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s117, s102, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s117, s121, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s117, s122, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s117, s106, e4);
		helper.createTransition(s117, s105, e4, e5);
		helper.createTransition(s117, s88, e0, e4);
		helper.createTransition(s117, s71, e0, e1, e4);
		helper.createTransition(s117, s90, e0, e4, e5);
		helper.createTransition(s117, s72, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s118, s117, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s118, s100, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s118, s118, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s118, s100, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s118, s118, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s118, s118, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s118, s121, e0);
		helper.createTransition(s118, s122, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s118, s123, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s118, s120, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s118, s119, e0, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s118, s101, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s118, s102, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s118, s121, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s118, s122, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s118, s104, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s118, s102, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s118, s101, e0, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s118, s124, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s118, s122, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s118, s121, e0, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s118, s124, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s118, s122, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s118, s121, e0, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s118, s105, e4);
		// no header
		{
			Transition t = helper.createTransition(s118, s98, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s118, s106, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s118, s105, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s118, s108, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s118, s105, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s118, s108, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s118, s105, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s118, s90, e0, e4);
		helper.createTransition(s118, s72, e0, e1, e4);
		// no header
		{
			Transition t = helper.createTransition(s118, s87, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s118, s71, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s118, s88, e0, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s118, s90, e0, e4, e5);
		helper.createTransition(s118, s72, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s118, s89, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s118, s72, e0, e1, e2, e4, e5);
		helper.createTransition(s118, s90, e0, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s118, s89, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s118, s72, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s118, s90, e0, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s119, s120, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s119, s119, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s119, s101, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s119, s102, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s119, s101, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s119, s121, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s119, s122, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s119, s121, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s119, s119, e0);
		helper.createTransition(s119, s119, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s119, s101, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s119, s101, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s119, s121, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s119, s121, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s119, s75, e0, e4);
		helper.createTransition(s119, s75, e0, e1, e4);
		helper.createTransition(s119, s78, e0, e4, e5);
		helper.createTransition(s119, s78, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s119, s75, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s119, s74, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s119, s75, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s119, s78, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s119, s77, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s119, s78, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s119, s88, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s119, s71, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s119, s88, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s119, s90, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s119, s72, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s119, s90, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s120, s102, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s120, s122, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s120, s119, e0);
		helper.createTransition(s120, s120, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s120, s101, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s120, s102, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s120, s121, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s120, s122, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s120, s75, e0, e4);
		helper.createTransition(s120, s74, e0, e1, e4);
		helper.createTransition(s120, s78, e0, e4, e5);
		helper.createTransition(s120, s77, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s120, s74, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s120, s77, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s120, s71, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s120, s72, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s122, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s121, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s123, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s120, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s119, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s119, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s101, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s102, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s101, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s121, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s122, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s121, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s104, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s102, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s101, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s101, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s124, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s122, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s121, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s121, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s124, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s122, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s121, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s121, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s121, s121, e0);
		helper.createTransition(s121, s121, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s121, s123, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s119, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s119, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s101, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s101, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s121, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s121, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s104, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s101, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s101, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s124, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s121, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s121, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s124, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s121, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s121, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s121, s78, e0, e4);
		helper.createTransition(s121, s78, e0, e1, e4);
		// no header
		{
			Transition t = helper.createTransition(s121, s73, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s75, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s75, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s121, s78, e0, e4, e5);
		helper.createTransition(s121, s78, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s121, s76, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s121, s78, e0, e1, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s121, s78, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s76, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s78, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s78, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s78, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s77, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s78, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s73, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s74, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s75, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s75, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s78, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s77, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s78, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s76, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s77, e1, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s78, e1, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s78, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s76, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s77, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s78, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s78, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s90, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s72, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s90, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s87, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s71, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s88, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s88, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s90, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s72, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s90, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s89, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s72, e1, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s90, e1, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s90, e2, e4, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s89, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s72, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s90, e1, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s121, s90, e2, e4);
			t.setGuard(conjunction(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s120, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s102, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s122, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s102, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s122, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s122, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s122, s121, e0);
		helper.createTransition(s122, s122, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s122, s123, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s120, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s119, e0, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s101, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s102, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s121, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s122, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s104, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s102, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s101, e0, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s124, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s122, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s121, e0, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s124, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s122, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s121, e0, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s122, s78, e0, e4);
		helper.createTransition(s122, s77, e0, e1, e4);
		// no header
		{
			Transition t = helper.createTransition(s122, s73, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s74, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s75, e0, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s122, s78, e0, e4, e5);
		helper.createTransition(s122, s77, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s122, s76, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s122, s77, e0, e1, e2, e4, e5);
		helper.createTransition(s122, s78, e0, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s122, s76, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s77, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s78, e0, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s77, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s74, e2, e4);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s77, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s77, e2, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s77, e2, e4);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s72, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s71, e2, e4);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s72, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s72, e2, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s122, s72, e2, e4);
			t.setGuard(conjunction(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s123, s120, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s123, s119, e1);
		// no header
		{
			Transition t = helper.createTransition(s123, s104, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s123, s102, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s123, s101, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s123, s124, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s123, s122, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s123, s121, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s123, s123, e0);
		helper.createTransition(s123, s119, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s123, s104, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s123, s101, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s123, s124, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s123, s121, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s123, s73, e0, e4);
		helper.createTransition(s123, s75, e0, e1, e4);
		helper.createTransition(s123, s76, e0, e4, e5);
		helper.createTransition(s123, s78, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s123, s73, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s123, s74, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s123, s75, e1, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s123, s76, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s123, s77, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s123, s78, e1, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s123, s87, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s123, s71, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s123, s88, e1, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s123, s89, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s123, s72, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s123, s90, e1, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s124, s122, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s124, s121, e1);
		// no header
		{
			Transition t = helper.createTransition(s124, s104, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s124, s102, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s124, s101, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s124, s124, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s124, s122, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s124, s121, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s124, s124, e0);
		helper.createTransition(s124, s121, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s124, s104, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s124, s101, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s124, s124, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s124, s121, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s124, s76, e0, e4);
		helper.createTransition(s124, s78, e0, e1, e4);
		helper.createTransition(s124, s76, e0, e4, e5);
		helper.createTransition(s124, s78, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s124, s76, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s124, s77, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s124, s78, e1, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s124, s76, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s124, s77, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s124, s78, e1, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s124, s89, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s124, s72, e1, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s124, s90, e1, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s124, s89, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s124, s72, e1, e4, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s124, s90, e1, e4, e5);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s125, s117, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s125, s126, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s125, s109, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s125, s100, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s125, s110, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s125, s127, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s125, s118, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s125, s128, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s125, s123, e0);
		helper.createTransition(s125, s119, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s125, s104, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s125, s101, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s125, s124, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s125, s121, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s125, s115, e4);
		// no header
		{
			Transition t = helper.createTransition(s125, s106, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s125, s116, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s125, s111, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s125, s105, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s125, s112, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s125, s87, e0, e4);
		helper.createTransition(s125, s88, e0, e1, e4);
		helper.createTransition(s125, s89, e0, e4, e5);
		helper.createTransition(s125, s90, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s126, s117, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s126, s126, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s126, s110, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s126, s100, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s126, s110, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s126, s128, e5);
		// no header
		{
			Transition t = helper.createTransition(s126, s118, e1, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s126, s128, e1, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s126, s119, e0);
		helper.createTransition(s126, s119, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s126, s101, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s126, s101, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s126, s121, e0, e5);
		helper.createTransition(s126, s121, e0, e1, e5);
		helper.createTransition(s126, s116, e4);
		// no header
		{
			Transition t = helper.createTransition(s126, s106, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s126, s116, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s126, s112, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s126, s105, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s126, s112, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s126, s88, e0, e4);
		helper.createTransition(s126, s88, e0, e1, e4);
		helper.createTransition(s126, s90, e0, e4, e5);
		helper.createTransition(s126, s90, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s127, s118, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s127, s128, e1);
		// no header
		{
			Transition t = helper.createTransition(s127, s109, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s127, s100, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s127, s110, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s127, s127, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s127, s118, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s127, s128, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s127, s124, e0);
		helper.createTransition(s127, s121, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s127, s104, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s127, s101, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s127, s124, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s127, s121, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s127, s111, e4);
		// no header
		{
			Transition t = helper.createTransition(s127, s105, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s127, s112, e1, e4);
		helper.createTransition(s127, s111, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s127, s105, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s127, s112, e1, e4, e5);
		helper.createTransition(s127, s89, e0, e4);
		helper.createTransition(s127, s90, e0, e1, e4);
		helper.createTransition(s127, s89, e0, e4, e5);
		helper.createTransition(s127, s90, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s128, s118, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s128, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s125, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s117, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s126, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s126, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s110, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s100, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s110, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s128, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s118, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s128, e1, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s109, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s100, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s110, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s110, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s127, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s118, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s128, e1, e2, e5);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s128, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s127, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s118, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s128, e1, e2);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s128, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s128, s121, e0);
		helper.createTransition(s128, s121, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s128, s123, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s119, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s119, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s101, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s101, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s121, e0, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s121, e0, e1, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s104, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s101, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s101, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s124, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s121, e0, e1, e2, e5);
			t.setGuard(inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s121, e0, e2, e5);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e4, e5), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s124, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s121, e0, e1, e2);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s121, e0, e2);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s128, s112, e4);
		// no header
		{
			Transition t = helper.createTransition(s128, s105, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s112, e1, e4);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s115, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s106, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s116, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s116, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s128, s112, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s128, s105, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s112, e1, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s111, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s105, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s112, e1, e2, e4, e5);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s112, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s111, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s105, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s112, e1, e2, e4);
			t.setGuard(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s112, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		helper.createTransition(s128, s90, e0, e4);
		helper.createTransition(s128, s90, e0, e1, e4);
		// no header
		{
			Transition t = helper.createTransition(s128, s87, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s88, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s88, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.EQUALS)));
		}
		helper.createTransition(s128, s90, e0, e4, e5);
		helper.createTransition(s128, s90, e0, e1, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s128, s89, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s128, s90, e0, e1, e2, e4, e5);
		// no header
		{
			Transition t = helper.createTransition(s128, s90, e0, e2, e4, e5);
			t.setGuard(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s89, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.EQUALS), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s90, e0, e1, e2, e4);
			t.setGuard(inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s128, s90, e0, e2, e4);
			t.setGuard(conjunction(inv(diff(e1, e2), 1, ComparisonOperator.GREATERTHAN), inv(diff(e5, e2), 1, ComparisonOperator.GREATERTHAN)));
		}
		
		return sts;
	}
}

