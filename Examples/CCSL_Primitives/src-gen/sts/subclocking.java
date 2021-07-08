package sts;

import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.creator.FactoryHelper;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;

public class subclocking extends ACCSLStsBuilder<SynchronousTransitionSystem>
{
	private FactoryHelper helper = new FactoryHelper();
	public SynchronousTransitionSystem create()
	{
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem("subclocking");
		
		Event e0 = helper.createEvent("a");
		Event e1 = helper.createEvent("b");
		Event e2 = helper.createEvent("c");
		
		State s0 = helper.createState("SxS");
		sts.setInitial(s0);
		
		helper.createTransition(s0, s0, e0, e1, e2);
		helper.createTransition(s0, s0, e1, e2);
		helper.createTransition(s0, s0, e2);
		
		return sts;
	}
}

