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

public class SDF_exp extends ACCSLStsBuilder<SynchronousTransitionSystem>
{
	private FactoryHelper helper = new FactoryHelper();
	public SynchronousTransitionSystem create()
	{
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem("SDF_exp");
		
		Event e0 = helper.createEvent("wr_AB");
		Event e1 = helper.createEvent("wr_AB_weight");
		Event e2 = helper.createEvent("A");
		Event e3 = helper.createEvent("rd_AB");
		Event e4 = helper.createEvent("rd_AB_delayed");
		Event e5 = helper.createEvent("B");
		Event e6 = helper.createEvent("wr_BC");
		Event e7 = helper.createEvent("rd_BC");
		Event e8 = helper.createEvent("C");
		Event e9 = helper.createEvent("wr_CB");
		Event e10 = helper.createEvent("rd_CB");
		
		State s0 = helper.createState("initxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0");
		s0.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s1 = helper.createState("initxpixinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0");
		s1.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s2 = helper.createState("initxp0xinitxpixinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0");
		s2.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s3 = helper.createState("initxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xd1xp0xo0xp0");
		s3.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s4 = helper.createState("initxpixinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xd1xp0xo0xp0");
		s4.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s5 = helper.createState("initxp0xinitxpixinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xd1xp0xo0xp0");
		s5.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s6 = helper.createState("initxpixinitxpixinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0");
		s6.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s7 = helper.createState("initxpixinitxpixinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xd1xp0xo0xp0");
		s7.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s8 = helper.createState("initxp0xinitxp0xo0xp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0");
		s8.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s9 = helper.createState("initxpixinitxp0xo0xp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0");
		s9.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s10 = helper.createState("initxp0xinitxpixo0xp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0");
		s10.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s11 = helper.createState("initxpixinitxpixo0xp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0");
		s11.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s12 = helper.createState("initxp0xinitxp0xo0xp0xinitxp0xinitxp0xinitxp0xinitxp0xd1xp0xo0xp0");
		s12.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s13 = helper.createState("initxpixinitxp0xo0xp0xinitxp0xinitxp0xinitxp0xinitxp0xd1xp0xo0xp0");
		s13.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s14 = helper.createState("initxp0xinitxpixo0xp0xinitxp0xinitxp0xinitxp0xinitxp0xd1xp0xo0xp0");
		s14.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s15 = helper.createState("initxpixinitxpixo0xp0xinitxp0xinitxp0xinitxp0xinitxp0xd1xp0xo0xp0");
		s15.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s16 = helper.createState("initxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xd2xp0xo1xp0");
		s16.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s17 = helper.createState("initxpixinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xd2xp0xo1xp0");
		s17.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s18 = helper.createState("initxp0xinitxpixinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xd2xp0xo1xp0");
		s18.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s19 = helper.createState("initxpixinitxpixinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xd2xp0xo1xp0");
		s19.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s20 = helper.createState("initxp0xinitxp0xo0xp0xinitxp0xinitxp0xinitxp0xinitxp0xd2xp0xo1xp0");
		s20.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s21 = helper.createState("initxpixinitxp0xo0xp0xinitxp0xinitxp0xinitxp0xinitxp0xd2xp0xo1xp0");
		s21.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s22 = helper.createState("initxp0xinitxpixo0xp0xinitxp0xinitxp0xinitxp0xinitxp0xd2xp0xo1xp0");
		s22.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s23 = helper.createState("initxpixinitxpixo0xp0xinitxp0xinitxp0xinitxp0xinitxp0xd2xp0xo1xp0");
		s23.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s24 = helper.createState("initxp0xinitxp0xo1xp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0");
		s24.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s25 = helper.createState("initxpixinitxp0xo1xp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0");
		s25.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s26 = helper.createState("initxp0xinitxpixo1xp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0");
		s26.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s27 = helper.createState("initxpixinitxpixo1xp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0");
		s27.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s28 = helper.createState("initxp0xinitxp0xo1xp0xinitxp0xinitxp0xinitxp0xinitxp0xd1xp0xo0xp0");
		s28.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s29 = helper.createState("initxpixinitxp0xo1xp0xinitxp0xinitxp0xinitxp0xinitxp0xd1xp0xo0xp0");
		s29.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s30 = helper.createState("initxp0xinitxpixo1xp0xinitxp0xinitxp0xinitxp0xinitxp0xd1xp0xo0xp0");
		s30.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s31 = helper.createState("initxpixinitxpixo1xp0xinitxp0xinitxp0xinitxp0xinitxp0xd1xp0xo0xp0");
		s31.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s32 = helper.createState("initxp0xinitxp0xo1xp0xinitxp0xinitxp0xinitxp0xinitxp0xd2xp0xo1xp0");
		s32.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s33 = helper.createState("initxpixinitxp0xo1xp0xinitxp0xinitxp0xinitxp0xinitxp0xd2xp0xo1xp0");
		s33.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s34 = helper.createState("initxp0xinitxpixo1xp0xinitxp0xinitxp0xinitxp0xinitxp0xd2xp0xo1xp0");
		s34.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s35 = helper.createState("initxpixinitxpixo1xp0xinitxp0xinitxp0xinitxp0xinitxp0xd2xp0xo1xp0");
		s35.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s36 = helper.createState("initxp0xinitxp0xp1xpixinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0");
		s36.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s37 = helper.createState("initxpixinitxp0xp1xpixinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0");
		s37.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s38 = helper.createState("initxp0xinitxpixp1xpixinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0");
		s38.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s39 = helper.createState("initxpixinitxpixp1xpixinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0");
		s39.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s40 = helper.createState("initxp0xinitxp0xp1xpixinitxp0xinitxp0xinitxp0xinitxp0xd1xp0xo0xp0");
		s40.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s41 = helper.createState("initxpixinitxp0xp1xpixinitxp0xinitxp0xinitxp0xinitxp0xd1xp0xo0xp0");
		s41.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s42 = helper.createState("initxp0xinitxpixp1xpixinitxp0xinitxp0xinitxp0xinitxp0xd1xp0xo0xp0");
		s42.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s43 = helper.createState("initxpixinitxpixp1xpixinitxp0xinitxp0xinitxp0xinitxp0xd1xp0xo0xp0");
		s43.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s44 = helper.createState("initxp0xinitxp0xp1xpixinitxp0xinitxp0xinitxp0xinitxp0xd2xp0xo1xp0");
		s44.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s45 = helper.createState("initxpixinitxp0xp1xpixinitxp0xinitxp0xinitxp0xinitxp0xd2xp0xo1xp0");
		s45.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s46 = helper.createState("initxp0xinitxpixp1xpixinitxp0xinitxp0xinitxp0xinitxp0xd2xp0xo1xp0");
		s46.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s47 = helper.createState("initxpixinitxpixp1xpixinitxp0xinitxp0xinitxp0xinitxp0xd2xp0xo1xp0");
		s47.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s48 = helper.createState("initxp0xinitxp0xo1xpixinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0");
		s48.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s49 = helper.createState("initxpixinitxp0xo1xpixinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0");
		s49.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s50 = helper.createState("initxp0xinitxpixo1xpixinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0");
		s50.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s51 = helper.createState("initxpixinitxpixo1xpixinitxp0xinitxp0xinitxp0xinitxp0xinitxp0xinitxp0");
		s51.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s52 = helper.createState("initxp0xinitxp0xo1xpixinitxp0xinitxp0xinitxp0xinitxp0xd1xp0xo0xp0");
		s52.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s53 = helper.createState("initxpixinitxp0xo1xpixinitxp0xinitxp0xinitxp0xinitxp0xd1xp0xo0xp0");
		s53.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s54 = helper.createState("initxp0xinitxpixo1xpixinitxp0xinitxp0xinitxp0xinitxp0xd1xp0xo0xp0");
		s54.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s55 = helper.createState("initxpixinitxpixo1xpixinitxp0xinitxp0xinitxp0xinitxp0xd1xp0xo0xp0");
		s55.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s56 = helper.createState("initxp0xinitxp0xo1xpixinitxp0xinitxp0xinitxp0xinitxp0xd2xp0xo1xp0");
		s56.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s57 = helper.createState("initxpixinitxp0xo1xpixinitxp0xinitxp0xinitxp0xinitxp0xd2xp0xo1xp0");
		s57.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 0, ComparisonOperator.EQUALS)));
		State s58 = helper.createState("initxp0xinitxpixo1xpixinitxp0xinitxp0xinitxp0xinitxp0xd2xp0xo1xp0");
		s58.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		State s59 = helper.createState("initxpixinitxpixo1xpixinitxp0xinitxp0xinitxp0xinitxp0xd2xp0xo1xp0");
		s59.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e3, e4), 0, ComparisonOperator.EQUALS), inv(diff(e0, e4), 1, ComparisonOperator.GREATEROREQUAL)));
		sts.setInitial(s0);
		
		helper.createTransition(s0, s1, e2);
		helper.createTransition(s0, s2, e0, e2);
		helper.createTransition(s0, s3, e10);
		helper.createTransition(s0, s4, e2, e10);
		helper.createTransition(s0, s5, e0, e2, e10);
		helper.createTransition(s1, s1, e2);
		// no header
		{
			Transition t = helper.createTransition(s1, s2, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s1, s6, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s1, s6, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s1, s4, e10);
		helper.createTransition(s1, s4, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s1, s5, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s1, s7, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s1, s7, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s2, s6, e2);
		helper.createTransition(s2, s2, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s2, s8, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s2, s9, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s2, s10, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s2, s10, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s2, s11, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s2, s5, e10);
		helper.createTransition(s2, s7, e2, e10);
		helper.createTransition(s2, s5, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s2, s12, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s2, s13, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s2, s14, e0, e1, e2, e3, e4, e10);
		// no header
		{
			Transition t = helper.createTransition(s2, s14, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s2, s15, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s3, s4, e2);
		helper.createTransition(s3, s5, e0, e1, e2);
		helper.createTransition(s3, s16, e10);
		helper.createTransition(s3, s17, e2, e10);
		helper.createTransition(s3, s18, e0, e1, e2, e10);
		helper.createTransition(s4, s4, e2);
		// no header
		{
			Transition t = helper.createTransition(s4, s5, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s4, s7, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s4, s7, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s4, s17, e10);
		helper.createTransition(s4, s17, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s4, s18, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s4, s19, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s4, s19, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s5, s7, e2);
		helper.createTransition(s5, s5, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s5, s12, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s13, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s5, s14, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s5, s14, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s15, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s5, s18, e10);
		helper.createTransition(s5, s19, e2, e10);
		helper.createTransition(s5, s18, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s5, s20, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s21, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s5, s22, e0, e1, e2, e3, e4, e10);
		// no header
		{
			Transition t = helper.createTransition(s5, s22, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s5, s23, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s6, s6, e2);
		// no header
		{
			Transition t = helper.createTransition(s6, s2, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s6, s6, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s6, s6, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s6, s9, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s6, s9, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s6, s10, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s6, s11, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s6, s11, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s6, s11, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s6, s11, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s6, s7, e10);
		helper.createTransition(s6, s7, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s6, s5, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s6, s7, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s6, s7, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s6, s13, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s6, s13, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s6, s14, e0, e1, e3, e4, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s6, s15, e0, e1, e2, e3, e4, e10);
		// no header
		{
			Transition t = helper.createTransition(s6, s15, e0, e1, e3, e4, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s6, s15, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s6, s15, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s7, s7, e2);
		// no header
		{
			Transition t = helper.createTransition(s7, s5, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s7, s7, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s7, s7, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s13, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s13, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s14, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s7, s15, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s7, s15, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s15, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s15, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s7, s19, e10);
		helper.createTransition(s7, s19, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s7, s18, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s7, s19, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s7, s19, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s21, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s21, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s22, e0, e1, e3, e4, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s7, s23, e0, e1, e2, e3, e4, e10);
		// no header
		{
			Transition t = helper.createTransition(s7, s23, e0, e1, e3, e4, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s23, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s7, s23, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s8, s9, e2);
		helper.createTransition(s8, s10, e0, e1, e2);
		helper.createTransition(s8, s12, e10);
		helper.createTransition(s8, s13, e2, e10);
		helper.createTransition(s8, s14, e0, e1, e2, e10);
		helper.createTransition(s9, s9, e2);
		// no header
		{
			Transition t = helper.createTransition(s9, s10, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s9, s11, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s9, s11, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s9, s13, e10);
		helper.createTransition(s9, s13, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s9, s14, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s9, s15, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s9, s15, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s10, s11, e2);
		helper.createTransition(s10, s10, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s10, s24, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s10, s25, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s10, s26, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s10, s26, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s10, s27, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s10, s14, e10);
		helper.createTransition(s10, s15, e2, e10);
		helper.createTransition(s10, s14, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s10, s28, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s10, s29, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s10, s30, e0, e1, e2, e3, e4, e10);
		// no header
		{
			Transition t = helper.createTransition(s10, s30, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s10, s31, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s11, s11, e2);
		// no header
		{
			Transition t = helper.createTransition(s11, s10, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s11, s11, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s11, s11, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s25, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s25, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s26, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s11, s27, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s11, s27, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s27, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s27, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s11, s15, e10);
		helper.createTransition(s11, s15, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s11, s14, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s11, s15, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s11, s15, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s29, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s29, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s30, e0, e1, e3, e4, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s11, s31, e0, e1, e2, e3, e4, e10);
		// no header
		{
			Transition t = helper.createTransition(s11, s31, e0, e1, e3, e4, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s31, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s11, s31, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s12, s13, e2);
		helper.createTransition(s12, s14, e0, e1, e2);
		helper.createTransition(s12, s20, e10);
		helper.createTransition(s12, s21, e2, e10);
		helper.createTransition(s12, s22, e0, e1, e2, e10);
		helper.createTransition(s13, s13, e2);
		// no header
		{
			Transition t = helper.createTransition(s13, s14, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s13, s15, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s13, s15, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s13, s21, e10);
		helper.createTransition(s13, s21, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s13, s22, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s13, s23, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s13, s23, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s14, s15, e2);
		helper.createTransition(s14, s14, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s14, s28, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s14, s29, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s14, s30, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s14, s30, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s14, s31, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s14, s22, e10);
		helper.createTransition(s14, s23, e2, e10);
		helper.createTransition(s14, s22, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s14, s32, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s14, s33, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s14, s34, e0, e1, e2, e3, e4, e10);
		// no header
		{
			Transition t = helper.createTransition(s14, s34, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s14, s35, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s15, s15, e2);
		// no header
		{
			Transition t = helper.createTransition(s15, s14, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s15, s15, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s15, s15, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s15, s29, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s15, s29, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s15, s30, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s15, s31, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s15, s31, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s15, s31, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s15, s31, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s15, s23, e10);
		helper.createTransition(s15, s23, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s15, s22, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s15, s23, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s15, s23, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s15, s33, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s15, s33, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s15, s34, e0, e1, e3, e4, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s15, s35, e0, e1, e2, e3, e4, e10);
		// no header
		{
			Transition t = helper.createTransition(s15, s35, e0, e1, e3, e4, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s15, s35, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s15, s35, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s16, s17, e2);
		helper.createTransition(s16, s18, e0, e1, e2);
		helper.createTransition(s17, s17, e2);
		// no header
		{
			Transition t = helper.createTransition(s17, s18, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s17, s19, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s17, s19, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s18, s19, e2);
		helper.createTransition(s18, s18, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s18, s20, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s18, s21, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s18, s22, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s18, s22, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s18, s23, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s19, s19, e2);
		// no header
		{
			Transition t = helper.createTransition(s19, s18, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s19, s19, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s19, s19, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s19, s21, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s19, s21, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s19, s22, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s19, s23, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s19, s23, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s19, s23, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s19, s23, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s20, s21, e2);
		helper.createTransition(s20, s22, e0, e1, e2);
		helper.createTransition(s21, s21, e2);
		// no header
		{
			Transition t = helper.createTransition(s21, s22, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s21, s23, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s21, s23, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s22, s23, e2);
		helper.createTransition(s22, s22, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s22, s32, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s33, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s22, s34, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s22, s34, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s22, s35, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s23, s23, e2);
		// no header
		{
			Transition t = helper.createTransition(s23, s22, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s23, s23, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s23, s23, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s23, s33, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s23, s33, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s23, s34, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s23, s35, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s23, s35, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s23, s35, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s23, s35, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s24, s25, e2);
		helper.createTransition(s24, s26, e0, e1, e2);
		helper.createTransition(s24, s28, e10);
		helper.createTransition(s24, s29, e2, e10);
		helper.createTransition(s24, s30, e0, e1, e2, e10);
		helper.createTransition(s25, s25, e2);
		// no header
		{
			Transition t = helper.createTransition(s25, s26, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s25, s27, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s25, s27, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s25, s29, e10);
		helper.createTransition(s25, s29, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s25, s30, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s25, s31, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s25, s31, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s26, s27, e2);
		helper.createTransition(s26, s26, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s26, s36, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s37, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s26, s38, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s26, s38, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s39, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s26, s30, e10);
		helper.createTransition(s26, s31, e2, e10);
		helper.createTransition(s26, s30, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s26, s40, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s41, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s26, s42, e0, e1, e2, e3, e4, e10);
		// no header
		{
			Transition t = helper.createTransition(s26, s42, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s26, s43, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s27, s27, e2);
		// no header
		{
			Transition t = helper.createTransition(s27, s26, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s27, s27, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s27, s27, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s37, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s37, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s38, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s27, s39, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s27, s39, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s39, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s39, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s27, s31, e10);
		helper.createTransition(s27, s31, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s27, s30, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s27, s31, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s27, s31, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s41, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s41, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s42, e0, e1, e3, e4, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s27, s43, e0, e1, e2, e3, e4, e10);
		// no header
		{
			Transition t = helper.createTransition(s27, s43, e0, e1, e3, e4, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s43, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s27, s43, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s28, s29, e2);
		helper.createTransition(s28, s30, e0, e1, e2);
		helper.createTransition(s28, s32, e10);
		helper.createTransition(s28, s33, e2, e10);
		helper.createTransition(s28, s34, e0, e1, e2, e10);
		helper.createTransition(s29, s29, e2);
		// no header
		{
			Transition t = helper.createTransition(s29, s30, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s29, s31, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s29, s31, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s29, s33, e10);
		helper.createTransition(s29, s33, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s29, s34, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s29, s35, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s29, s35, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s30, s31, e2);
		helper.createTransition(s30, s30, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s30, s40, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s30, s41, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s30, s42, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s30, s42, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s30, s43, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s30, s34, e10);
		helper.createTransition(s30, s35, e2, e10);
		helper.createTransition(s30, s34, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s30, s44, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s30, s45, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s30, s46, e0, e1, e2, e3, e4, e10);
		// no header
		{
			Transition t = helper.createTransition(s30, s46, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s30, s47, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s31, s31, e2);
		// no header
		{
			Transition t = helper.createTransition(s31, s30, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s31, s31, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s31, s31, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s41, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s41, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s42, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s31, s43, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s31, s43, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s43, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s43, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s31, s35, e10);
		helper.createTransition(s31, s35, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s31, s34, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s31, s35, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s31, s35, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s45, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s45, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s46, e0, e1, e3, e4, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s31, s47, e0, e1, e2, e3, e4, e10);
		// no header
		{
			Transition t = helper.createTransition(s31, s47, e0, e1, e3, e4, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s47, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s31, s47, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s32, s33, e2);
		helper.createTransition(s32, s34, e0, e1, e2);
		helper.createTransition(s33, s33, e2);
		// no header
		{
			Transition t = helper.createTransition(s33, s34, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s33, s35, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s33, s35, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s34, s35, e2);
		helper.createTransition(s34, s34, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s34, s44, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s34, s45, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s34, s46, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s34, s46, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s34, s47, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s35, s35, e2);
		// no header
		{
			Transition t = helper.createTransition(s35, s34, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s35, s35, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s35, s35, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s45, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s45, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s46, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s35, s47, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s35, s47, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s47, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s35, s47, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s36, s37, e2);
		helper.createTransition(s36, s38, e0, e1, e2);
		helper.createTransition(s36, s40, e10);
		helper.createTransition(s36, s41, e2, e10);
		helper.createTransition(s36, s42, e0, e1, e2, e10);
		helper.createTransition(s37, s37, e2);
		// no header
		{
			Transition t = helper.createTransition(s37, s38, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s37, s39, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s37, s39, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s37, s41, e10);
		helper.createTransition(s37, s41, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s37, s42, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s37, s43, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s37, s43, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s38, s39, e2);
		helper.createTransition(s38, s38, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s38, s48, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s38, s49, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s38, s50, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s38, s50, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s38, s51, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s38, s42, e10);
		helper.createTransition(s38, s43, e2, e10);
		helper.createTransition(s38, s42, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s38, s52, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s38, s53, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s38, s54, e0, e1, e2, e3, e4, e10);
		// no header
		{
			Transition t = helper.createTransition(s38, s54, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s38, s55, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s39, s39, e2);
		// no header
		{
			Transition t = helper.createTransition(s39, s38, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s39, s39, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s39, s39, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s39, s49, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s39, s49, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s39, s50, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s39, s51, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s39, s51, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s39, s51, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s39, s51, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s39, s43, e10);
		helper.createTransition(s39, s43, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s39, s42, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s39, s43, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s39, s43, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s39, s53, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s39, s53, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s39, s54, e0, e1, e3, e4, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s39, s55, e0, e1, e2, e3, e4, e10);
		// no header
		{
			Transition t = helper.createTransition(s39, s55, e0, e1, e3, e4, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s39, s55, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s39, s55, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s40, s41, e2);
		helper.createTransition(s40, s42, e0, e1, e2);
		helper.createTransition(s40, s44, e10);
		helper.createTransition(s40, s45, e2, e10);
		helper.createTransition(s40, s46, e0, e1, e2, e10);
		helper.createTransition(s41, s41, e2);
		// no header
		{
			Transition t = helper.createTransition(s41, s42, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s41, s43, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s41, s43, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s41, s45, e10);
		helper.createTransition(s41, s45, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s41, s46, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s41, s47, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s41, s47, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s42, s43, e2);
		helper.createTransition(s42, s42, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s42, s52, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s42, s53, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s42, s54, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s42, s54, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s42, s55, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s42, s46, e10);
		helper.createTransition(s42, s47, e2, e10);
		helper.createTransition(s42, s46, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s42, s56, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s42, s57, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s42, s58, e0, e1, e2, e3, e4, e10);
		// no header
		{
			Transition t = helper.createTransition(s42, s58, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s42, s59, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s43, s43, e2);
		// no header
		{
			Transition t = helper.createTransition(s43, s42, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s43, s43, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s43, s43, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s43, s53, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s43, s53, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s43, s54, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s43, s55, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s43, s55, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s43, s55, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s43, s55, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s43, s47, e10);
		helper.createTransition(s43, s47, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s43, s46, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s43, s47, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s43, s47, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s43, s57, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s43, s57, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s43, s58, e0, e1, e3, e4, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s43, s59, e0, e1, e2, e3, e4, e10);
		// no header
		{
			Transition t = helper.createTransition(s43, s59, e0, e1, e3, e4, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s43, s59, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s43, s59, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s44, s45, e2);
		helper.createTransition(s44, s46, e0, e1, e2);
		helper.createTransition(s45, s45, e2);
		// no header
		{
			Transition t = helper.createTransition(s45, s46, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s45, s47, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s45, s47, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s46, s47, e2);
		helper.createTransition(s46, s46, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s46, s56, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s46, s57, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s46, s58, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s46, s58, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s46, s59, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s47, s47, e2);
		// no header
		{
			Transition t = helper.createTransition(s47, s46, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s47, s47, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s47, s47, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s57, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s57, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s58, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s47, s59, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s47, s59, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s59, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s47, s59, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s48, s49, e2);
		helper.createTransition(s48, s50, e0, e1, e2);
		helper.createTransition(s48, s52, e10);
		helper.createTransition(s48, s53, e2, e10);
		helper.createTransition(s48, s54, e0, e1, e2, e10);
		helper.createTransition(s49, s49, e2);
		// no header
		{
			Transition t = helper.createTransition(s49, s50, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s49, s51, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s49, s51, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s49, s53, e10);
		helper.createTransition(s49, s53, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s49, s54, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s49, s55, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s49, s55, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s50, s51, e2);
		helper.createTransition(s50, s50, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s50, s36, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s50, s37, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s50, s38, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s50, s38, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s50, s39, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s50, s54, e10);
		helper.createTransition(s50, s55, e2, e10);
		helper.createTransition(s50, s54, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s50, s40, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s50, s41, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s50, s42, e0, e1, e2, e3, e4, e10);
		// no header
		{
			Transition t = helper.createTransition(s50, s42, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s50, s43, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s51, s51, e2);
		// no header
		{
			Transition t = helper.createTransition(s51, s50, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s51, s51, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s51, s51, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s37, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s37, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s38, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s51, s39, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s51, s39, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s39, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s39, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s51, s55, e10);
		helper.createTransition(s51, s55, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s51, s54, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s51, s55, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s51, s55, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s41, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s41, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s42, e0, e1, e3, e4, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s51, s43, e0, e1, e2, e3, e4, e10);
		// no header
		{
			Transition t = helper.createTransition(s51, s43, e0, e1, e3, e4, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s43, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s51, s43, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s52, s53, e2);
		helper.createTransition(s52, s54, e0, e1, e2);
		helper.createTransition(s52, s56, e10);
		helper.createTransition(s52, s57, e2, e10);
		helper.createTransition(s52, s58, e0, e1, e2, e10);
		helper.createTransition(s53, s53, e2);
		// no header
		{
			Transition t = helper.createTransition(s53, s54, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s53, s55, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s53, s55, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s53, s57, e10);
		helper.createTransition(s53, s57, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s53, s58, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s53, s59, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s53, s59, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s54, s55, e2);
		helper.createTransition(s54, s54, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s54, s40, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s41, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s54, s42, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s54, s42, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s43, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s54, s58, e10);
		helper.createTransition(s54, s59, e2, e10);
		helper.createTransition(s54, s58, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s54, s44, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s45, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s54, s46, e0, e1, e2, e3, e4, e10);
		// no header
		{
			Transition t = helper.createTransition(s54, s46, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s54, s47, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s55, s55, e2);
		// no header
		{
			Transition t = helper.createTransition(s55, s54, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s55, s55, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s55, s55, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s41, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s41, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s42, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s55, s43, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s55, s43, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s43, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s43, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s55, s59, e10);
		helper.createTransition(s55, s59, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s55, s58, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s55, s59, e0, e1, e2, e10);
		// no header
		{
			Transition t = helper.createTransition(s55, s59, e0, e1, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s45, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s45, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s46, e0, e1, e3, e4, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s55, s47, e0, e1, e2, e3, e4, e10);
		// no header
		{
			Transition t = helper.createTransition(s55, s47, e0, e1, e3, e4, e10);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s47, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s55, s47, e2, e3, e4, e10);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s56, s57, e2);
		helper.createTransition(s56, s58, e0, e1, e2);
		helper.createTransition(s57, s57, e2);
		// no header
		{
			Transition t = helper.createTransition(s57, s58, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s57, s59, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s57, s59, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s58, s59, e2);
		helper.createTransition(s58, s58, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s58, s44, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s45, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s58, s46, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s58, s46, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s58, s47, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		helper.createTransition(s59, s59, e2);
		// no header
		{
			Transition t = helper.createTransition(s59, s58, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s59, s59, e0, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s59, s59, e0, e1);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s59, s45, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s59, s45, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.EQUALS));
		}
		// no header
		{
			Transition t = helper.createTransition(s59, s46, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s59, s47, e0, e1, e2, e3, e4);
		// no header
		{
			Transition t = helper.createTransition(s59, s47, e0, e1, e3, e4);
			t.setGuard(inv(diff(e2, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s59, s47, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		// no header
		{
			Transition t = helper.createTransition(s59, s47, e2, e3, e4);
			t.setGuard(inv(diff(e0, e4), 1, ComparisonOperator.GREATERTHAN));
		}
		
		return sts;
	}
}

