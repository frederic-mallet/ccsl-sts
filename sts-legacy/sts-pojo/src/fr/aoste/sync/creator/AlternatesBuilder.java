package fr.aoste.sync.creator;

import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.vspec.ComparisonOperator;

class AlternatesBuilder extends ACCSLStsBuilder<SynchronousTransitionSystem> {
	static String LEFTCLOCK = "left";
	static String RIGHTCLOCK = "right";
	
	private FactoryHelper helper = new FactoryHelper();

	@Override
	public SynchronousTransitionSystem create() {
		String leftName = getStringParameterValue(LEFTCLOCK, "left");
		String rightName = getStringParameterValue(RIGHTCLOCK, "right");
		
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem(leftName+"  ~ "+rightName);

		Event leftEvent = helper.createEvent(leftName);
		Event rightEvent = helper.createEvent(rightName);

		State s0 = helper.createState("A0");
		sts.setInitial(s0);
		s0.setInvariant(InvariantBuilder.buildInvariant(leftEvent, rightEvent, 0, ComparisonOperator.EQUALS));

		State s1 = helper.createState("A1");
		s1.setInvariant(InvariantBuilder.buildInvariant(leftEvent, rightEvent, 1, ComparisonOperator.EQUALS));

		helper.createTransition(s0, s1, leftEvent);
		helper.createTransition(s1, s0, rightEvent);

		return sts;
	}

}
