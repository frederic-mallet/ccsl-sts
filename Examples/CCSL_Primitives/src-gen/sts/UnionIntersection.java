package sts;

import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.creator.FactoryHelper;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;

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
		
		State s0 = helper.createState("UxI");
		sts.setInitial(s0);
		
		helper.createTransition(s0, s0, e3);
		helper.createTransition(s0, s0, e0);
		helper.createTransition(s0, s0, e1);
		helper.createTransition(s0, s0, e0, e1);
		helper.createTransition(s0, s0, e2);
		helper.createTransition(s0, s0, e0, e2);
		helper.createTransition(s0, s0, e1, e2);
		helper.createTransition(s0, s0, e0, e1, e2);
		helper.createTransition(s0, s0, e0, e3);
		helper.createTransition(s0, s0, e1, e3);
		helper.createTransition(s0, s0, e0, e1, e3);
		helper.createTransition(s0, s0, e2, e3);
		helper.createTransition(s0, s0, e0, e2, e3);
		helper.createTransition(s0, s0, e1, e2, e3);
		helper.createTransition(s0, s0, e0, e1, e2, e3);
		
		return sts;
	}
}

