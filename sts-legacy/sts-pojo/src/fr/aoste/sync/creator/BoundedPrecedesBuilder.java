package fr.aoste.sync.creator;

import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.vspec.ComparisonOperator;

class BoundedPrecedesBuilder extends ACCSLStsBuilder<SynchronousTransitionSystem> {
	static String INIT = "init";
	static String MAX = "max";
	
	private FactoryHelper helper = new FactoryHelper();

	@Override
	public SynchronousTransitionSystem create() {
		String leftName = getStringParameterValue(PrecedesBuilder.LEFTCLOCK, "left");
		String rightName = getStringParameterValue(PrecedesBuilder.RIGHTCLOCK, "right");
		int init = getIntParameterValue(INIT, 0);
		int max = getIntParameterValue(MAX, -1);
		if (init == 0 && max == 1) {
			AlternatesBuilder ab = new AlternatesBuilder();
			ab.setParameterValue(PrecedesBuilder.LEFTCLOCK, leftName);
			ab.setParameterValue(PrecedesBuilder.RIGHTCLOCK, rightName);
			return ab.create();
		} else if (init == 0 && max == -1) {
			PrecedesBuilder pb = new PrecedesBuilder();
			pb.setParameterValue(PrecedesBuilder.LEFTCLOCK, leftName);
			pb.setParameterValue(PrecedesBuilder.RIGHTCLOCK, rightName);
			return pb.create();
		} else if (max == -1) {
			throw new RuntimeException("Unsupported unbounded with init " + init);
		}
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem(leftName+"<(" + init + "," + max + ")" + rightName);

		Event leftEvent = helper.createEvent(leftName);
		Event rightEvent = helper.createEvent(rightName);

		State[] states = new State[max + 1];
		
		states[init] = helper.createState("Z");
		states[init].setInvariant(InvariantBuilder.inv(leftEvent, rightEvent, 0, ComparisonOperator.EQUALS));
		sts.setInitial(states[init]);
		
		for (int i=1; i <= init; i++) {
			states[init - i] = helper.createState("N"+i);
			states[init - i].setInvariant(InvariantBuilder.inv(leftEvent, rightEvent, -i, ComparisonOperator.EQUALS));
		}
		for (int i=1; i <= max - init; i++) {
			states[init + i] = helper.createState("P"+i);
			states[init + i].setInvariant(InvariantBuilder.inv(leftEvent, rightEvent, i, ComparisonOperator.EQUALS));
		}
		for (int i=0; i < states.length - 1; i++) {
			helper.createTransition(states[i], states[i + 1], leftEvent);
			helper.createTransition(states[i + 1], states[i], rightEvent);
			if (i > 0)
				helper.createTransition(states[i], states[i], leftEvent, rightEvent);
		}

		return sts;
	}

}
