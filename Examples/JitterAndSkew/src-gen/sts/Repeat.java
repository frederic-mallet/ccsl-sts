package sts;

import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.creator.FactoryHelper;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import static fr.aoste.sync.creator.InvariantBuilder.diff;
import fr.aoste.sync.vspec.ComparisonOperator;
import static fr.aoste.sync.creator.InvariantBuilder.inv;

public class Repeat extends ACCSLStsBuilder<SynchronousTransitionSystem>
{
	private FactoryHelper helper = new FactoryHelper();
	public SynchronousTransitionSystem create()
	{
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem("Repeat");
		
		Event e0 = helper.createEvent("s");
		Event e1 = helper.createEvent("T");
		
		State s0 = helper.createState("init");
		s0.setInvariant(inv(diff(e0, e1), 0, ComparisonOperator.GREATEROREQUAL));
		State s1 = helper.createState("p1");
		s1.setInvariant(inv(diff(e0, e1), 0, ComparisonOperator.GREATEROREQUAL));
		State s2 = helper.createState("p2");
		s2.setInvariant(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		State s3 = helper.createState("p3");
		s3.setInvariant(inv(diff(e0, e1), 2, ComparisonOperator.GREATERTHAN));
		State s4 = helper.createState("p4");
		s4.setInvariant(inv(diff(e0, e1), 3, ComparisonOperator.GREATERTHAN));
		sts.setInitial(s0);
		
		helper.createTransition(s0, s1, e0, e1);
		helper.createTransition(s1, s2, e0);
		helper.createTransition(s2, s3, e0);
		helper.createTransition(s3, s4, e0);
		helper.createTransition(s4, s0, e0);
		
		return sts;
	}
}

