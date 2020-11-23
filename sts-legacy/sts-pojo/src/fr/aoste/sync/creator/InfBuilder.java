package fr.aoste.sync.creator;

import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.Transition;
import fr.aoste.sync.vspec.ComparisonOperator;
import fr.aoste.sync.vspec.Conjunction;

class InfBuilder extends ACCSLStsBuilder<SynchronousTransitionSystem> {
	static String CLOCK1 = "clock1";
	static String CLOCK2 = "clock2";
	static String INF = "inf";

	private FactoryHelper helper = new FactoryHelper();

	InfBuilder() {
		super();
	}

	public SynchronousTransitionSystem create() {
		String clock1 = getStringParameterValue(CLOCK1, "c1");
		String clock2 = getStringParameterValue(CLOCK2, "c2");
		String inf = getStringParameterValue(INF, "i");

		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem(inf+" = inf("+clock1+","+clock2+")");

		Event clock1Event = helper.createEvent(clock1);
		Event clock2Event = helper.createEvent(clock2);
		Event infE = helper.createEvent(inf);

		{ // general invariant
			Conjunction c = InvariantBuilder.buildConjunction(
					InvariantBuilder.buildInvariant(infE, clock1Event, 0, ComparisonOperator.GREATEROREQUAL),
					InvariantBuilder.buildInvariant(infE, clock2Event, 0, ComparisonOperator.GREATEROREQUAL));
			sts.setInvariant(c);
		}
		
		State i0 = helper.createState("I0");
		sts.setInitial(i0);
		i0.setInvariant(InvariantBuilder.buildInvariant(clock1Event, clock2Event, 0, ComparisonOperator.EQUALS));

		{ // i0 -> i0, c1.c2.inf
			helper.createTransition(i0, i0, infE, clock1Event, clock2Event);	
		}

		State iPlus = helper.createState("I+");
		iPlus.setInvariant(InvariantBuilder.buildInvariant(clock1Event, clock2Event, 1, ComparisonOperator.GREATEROREQUAL));
		{ // i0 -> i+, c1.inf
			helper.createTransition(i0, iPlus, infE, clock1Event);
		}
		{ // i+ -> i+, c1.inf
			helper.createTransition(iPlus, iPlus, infE, clock1Event);
		}
		{ // i+ -> i+, c1.c2.inf
			helper.createTransition(iPlus, iPlus, infE, clock1Event, clock2Event);	
		}
		{ // i+ -> i+, c2 [delta>1]
			Transition transition = helper.createTransition(iPlus, iPlus, clock2Event);	
			transition.setGuard(InvariantBuilder.buildInvariant(clock1Event, clock2Event, 1, ComparisonOperator.GREATERTHAN));
		}
		{ // i+ -> i0, c2 [delta==1]
			Transition transition = helper.createTransition(iPlus, i0, clock2Event);	
			transition.setGuard(InvariantBuilder.buildInvariant(clock1Event, clock2Event, 1, ComparisonOperator.EQUALS));
		}
		
		State iMinus = helper.createState("I-");
		iMinus.setInvariant(InvariantBuilder.buildInvariant(clock2Event, clock1Event, 1, ComparisonOperator.GREATEROREQUAL));
		{ // i0 -> i-, c2.inf
			helper.createTransition(i0, iMinus, infE, clock2Event);
		}
		{ // i- -> i-, c2.inf
			helper.createTransition(iMinus, iMinus, infE, clock2Event);
		}
		{ // i- -> i-, c1.c2.inf
			helper.createTransition(iMinus, iMinus, infE, clock1Event, clock2Event);
		}
		{ // i- -> i-, c1 [-delta>1]
			Transition transition = helper.createTransition(iMinus, iMinus, clock1Event);	
			transition.setGuard(InvariantBuilder.buildInvariant(clock2Event, clock1Event, 1, ComparisonOperator.GREATERTHAN));
		}
		{ // i- -> i0, c1 [-delta==1]
			Transition transition = helper.createTransition(iMinus, i0, clock1Event);	
			transition.setGuard(InvariantBuilder.buildInvariant(clock2Event, clock1Event, 1, ComparisonOperator.EQUALS));
		}
		
		return sts;
	}
}
