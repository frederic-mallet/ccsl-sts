package fr.aoste.sync.creator;

import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.vspec.ComparisonOperator;

class SubclockBuilder extends ACCSLStsBuilder<SynchronousTransitionSystem> {
	static String SUBCLOCK = "Clock1";
	static String SUPERCLOCK = "Clock2";

	private FactoryHelper helper = new FactoryHelper();

	SubclockBuilder() {
		super();
	}

	public SynchronousTransitionSystem create() {
		String subclock = getStringParameterValue(SUBCLOCK, "sub");
		String superclock = getStringParameterValue(SUPERCLOCK, "super");

		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem(subclock+" C "+superclock);

		Event subEvent = helper.createEvent(subclock);
		Event superEvent = helper.createEvent(superclock);

		State init = helper.createState("S");
		sts.setInitial(init);
		sts.setInvariant(InvariantBuilder.buildInvariant(superEvent, subEvent, 0, ComparisonOperator.GREATEROREQUAL));
		
		
		{
			helper.createTransition(init, init, subEvent, superEvent);
		}

		{
			helper.createTransition(init, init, superEvent);
		}
		return sts;
	}
}
