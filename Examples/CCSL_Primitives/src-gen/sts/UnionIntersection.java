package sts;

import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.creator.FactoryHelper;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import static fr.aoste.sync.creator.InvariantBuilder.diff;
import fr.aoste.sync.vspec.ComparisonOperator;
import static fr.aoste.sync.creator.InvariantBuilder.inv;

public class UnionIntersection extends ACCSLStsBuilder<SynchronousTransitionSystem>
{
	private FactoryHelper helper = new FactoryHelper();
	public SynchronousTransitionSystem create()
	{
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem("UnionIntersection");
		
		Event e0 = helper.createEvent("a");
		Event e1 = helper.createEvent("b");
		Event e2 = helper.createEvent("c");
		Event e3 = helper.createEvent("d");
		Event e4 = helper.createEvent("u");
		
		State s0 = helper.createState("UxI");
		s0.setInvariant(inv(diff(e4, e3), 0, ComparisonOperator.LESSOREQUAL));
		sts.setInitial(s0);
		
		helper.createTransition(s0, s0, e3);
		helper.createTransition(s0, s0, e0);
		helper.createTransition(s0, s0, e1);
		helper.createTransition(s0, s0, e0, e1);
		helper.createTransition(s0, s0, e2);
		helper.createTransition(s0, s0, e0, e2);
		helper.createTransition(s0, s0, e1, e2);
		helper.createTransition(s0, s0, e0, e1, e2);
		helper.createTransition(s0, s0, e0, e3, e4);
		helper.createTransition(s0, s0, e1, e3, e4);
		helper.createTransition(s0, s0, e0, e1, e3, e4);
		helper.createTransition(s0, s0, e2, e3, e4);
		helper.createTransition(s0, s0, e0, e2, e3, e4);
		helper.createTransition(s0, s0, e1, e2, e3, e4);
		helper.createTransition(s0, s0, e0, e1, e2, e3, e4);
		
		return sts;
	}
}

