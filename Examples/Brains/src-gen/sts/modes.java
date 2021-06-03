package sts;

import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.creator.FactoryHelper;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;

public class modes extends ACCSLStsBuilder<SynchronousTransitionSystem>
{
	private FactoryHelper helper = new FactoryHelper();
	public SynchronousTransitionSystem create()
	{
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem("modes");
		
		Event e0 = helper.createEvent("Mode1");
		Event e1 = helper.createEvent("Mode2");
		Event e2 = helper.createEvent("Trigger");
		
		State s0 = helper.createState("UxXxinitxp0xp0xp0");
		sts.setInitial(s0);
		
		
		return sts;
	}
}

