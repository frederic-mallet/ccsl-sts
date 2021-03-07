package fr.aoste.sync.creator;

import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.Transition;
import fr.aoste.sync.vspec.ComparisonOperator;

class PrecedesBuilder extends ACCSLStsBuilder<SynchronousTransitionSystem> {
	static String LEFTCLOCK = "left";
	static String RIGHTCLOCK = "right";

	private FactoryHelper helper = new FactoryHelper();

	@Override
	public SynchronousTransitionSystem create() {
		String leftName = getStringParameterValue(LEFTCLOCK, "left");
		String rightName = getStringParameterValue(RIGHTCLOCK, "right");
		
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem(leftName+" < "+rightName);

		Event leftEvent = helper.createEvent(leftName);
		Event rightEvent = helper.createEvent(rightName);

		State p0 = helper.createState("p0");
		sts.setInitial(p0);
		p0.setInvariant(InvariantBuilder.inv(leftEvent, rightEvent, 0, ComparisonOperator.EQUALS));

		State pi = helper.createState("pi");
		pi.setInvariant(InvariantBuilder.inv(leftEvent, rightEvent, 1, ComparisonOperator.GREATEROREQUAL));

		{ // p0 -> pi (left)
			helper.createTransition(p0, pi, leftEvent);
		}
		{ // pi -> p0 ([delta==1]right)
			Transition rightT = helper.createTransition(pi, p0, rightEvent);
			rightT.setGuard(InvariantBuilder.inv(leftEvent, rightEvent, 1, ComparisonOperator.EQUALS));
		}
		{ // pi -> pi (left)
			helper.createTransition(pi, pi, leftEvent);
		}
		{ // pi -> pi (left.right)
			helper.createTransition(pi, pi, leftEvent, rightEvent);
		}
		{ // pi -> pi ([delta>1]right)
			Transition rightT = helper.createTransition(pi, pi, rightEvent);
			rightT.setGuard(InvariantBuilder.inv(leftEvent, rightEvent, 1, ComparisonOperator.GREATERTHAN));
		}

		return sts;
	}

}
