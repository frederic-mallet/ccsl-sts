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

public class AlternCompose extends ACCSLStsBuilder<SynchronousTransitionSystem>
{
	private FactoryHelper helper = new FactoryHelper();
	public SynchronousTransitionSystem create()
	{
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem("AlternCompose");
		
		Event e0 = helper.createEvent("a");
		Event e1 = helper.createEvent("a1");
		Event e2 = helper.createEvent("b");
		
		State s0 = helper.createState("initxp0xp0");
		s0.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e0, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS)));
		State s1 = helper.createState("d1xpixp0");
		s1.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e2), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e2, e1), 0, ComparisonOperator.EQUALS)));
		State s2 = helper.createState("d1xp0xpi");
		s2.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS), inv(diff(e0, e2), 0, ComparisonOperator.EQUALS), inv(diff(e2, e1), 1, ComparisonOperator.GREATEROREQUAL)));
		sts.setInitial(s0);
		
		helper.createTransition(s0, s1, e0);
		helper.createTransition(s1, s2, e2);
		helper.createTransition(s2, s1, e0, e1);
		
		return sts;
	}
}

