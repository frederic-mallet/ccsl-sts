package sts;

import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.creator.FactoryHelper;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;

public class adavec extends ACCSLStsBuilder<SynchronousTransitionSystem>
{
	private FactoryHelper helper = new FactoryHelper();
	public SynchronousTransitionSystem create()
	{
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem("adavec");
		
		Event e0 = helper.createEvent("Urban");
		Event e1 = helper.createEvent("Highway");
		Event e2 = helper.createEvent("interurban");
		
		State s0 = helper.createState("Uxp0");
		State s1 = helper.createState("Uxpi");
		sts.setInitial(s0);
		
		helper.createTransition(s0, s1, e1);
		helper.createTransition(s0, s1, e2);
		helper.createTransition(s0, s1, e1, e2);
		helper.createTransition(s0, s0, e0);
		helper.createTransition(s0, s0, e0, e1);
		helper.createTransition(s0, s0, e0, e2);
		helper.createTransition(s0, s0, e0, e1, e2);
		helper.createTransition(s1, s1, e1);
		helper.createTransition(s1, s1, e2);
		helper.createTransition(s1, s1, e1, e2);
		helper.createTransition(s1, s1, e0);
		helper.createTransition(s1, s1, e0, e1);
		helper.createTransition(s1, s1, e0, e2);
		helper.createTransition(s1, s1, e0, e1, e2);
		
		return sts;
	}
}

