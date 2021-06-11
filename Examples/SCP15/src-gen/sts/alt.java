package sts;

import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.creator.FactoryHelper;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import static fr.aoste.sync.creator.InvariantBuilder.diff;
import fr.aoste.sync.vspec.ComparisonOperator;
import static fr.aoste.sync.creator.InvariantBuilder.inv;

public class alt extends ACCSLStsBuilder<SynchronousTransitionSystem>
{
	private FactoryHelper helper = new FactoryHelper();
	public SynchronousTransitionSystem create()
	{
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem("alt");
		
		Event e0 = helper.createEvent("a");
		Event e1 = helper.createEvent("c");
		
		State s0 = helper.createState("initxp0xp0");
		s0.setInvariant(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS));
		State s1 = helper.createState("d1xpixp0");
		s1.setInvariant(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL));
		State s2 = helper.createState("d1xp0xpi");
		s2.setInvariant(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS));
		sts.setInitial(s0);
		
		helper.createTransition(s0, s1, e0);
		helper.createTransition(s1, s2, e1);
		helper.createTransition(s2, s1, e0);
		
		return sts;
	}
}

