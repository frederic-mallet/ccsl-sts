package fr.aoste.sync.creator;

import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.vspec.ComparisonOperator;

class BoundedCausesBuilder extends ACCSLStsBuilder<SynchronousTransitionSystem> {
	static String INIT = "init";
	static String MAX = "max";
	
	private FactoryHelper helper = new FactoryHelper();

	@Override
	public SynchronousTransitionSystem create() {
		String leftName = getStringParameterValue(CausesBuilder.LEFTCLOCK, "left");
		String rightName = getStringParameterValue(CausesBuilder.RIGHTCLOCK, "right");
		int init = getIntParameterValue(INIT, 0);
		int max = getIntParameterValue(MAX, -1);
		if (init == 0 && max == -1) {
			return new CausesBuilder().create();
		} else if (max == -1) {
			throw new RuntimeException("Unsupported unbounded with init " + init);
		}
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem(leftName+"<=(" + init + "," + max + ")" + rightName);

		Event leftEvent = helper.createEvent(leftName);
		Event rightEvent = helper.createEvent(rightName);

		State[] states = new State[init + max + 1];
		
		states[init] = helper.createState("Z");
		states[init].setInvariant(InvariantBuilder.inv(leftEvent, rightEvent, 0, ComparisonOperator.EQUALS));
		sts.setInitial(states[init]);
		
		for (int i=1; i <= init; i++) {
			states[init - i] = helper.createState("N"+i);
			states[init - i].setInvariant(InvariantBuilder.inv(leftEvent, rightEvent, -i, ComparisonOperator.EQUALS));
		}
		for (int i=1; i <= max; i++) {
			states[init + i] = helper.createState("P"+i);
			states[init + i].setInvariant(InvariantBuilder.inv(leftEvent, rightEvent, i, ComparisonOperator.EQUALS));
		}
		for (int i=0; i < states.length - 1; i++) {
			helper.createTransition(states[i], states[i + 1], leftEvent);
			helper.createTransition(states[i + 1], states[i], rightEvent);
			helper.createTransition(states[i], states[i], leftEvent, rightEvent);
		}
		helper.createTransition(states[states.length - 1], states[states.length - 1], leftEvent, rightEvent);

		return sts;
	}

}
