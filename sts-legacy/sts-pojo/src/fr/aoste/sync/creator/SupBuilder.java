package fr.aoste.sync.creator;

import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.Transition;
import fr.aoste.sync.vspec.ComparisonOperator;
import fr.aoste.sync.vspec.Conjunction;

class SupBuilder extends ACCSLStsBuilder<SynchronousTransitionSystem> {
	static String CLOCK1 = "clock1";
	static String CLOCK2 = "clock2";
	static String SUP = "sup";

	private FactoryHelper helper = new FactoryHelper();
	
	SupBuilder() {
		super();
	}

	public SynchronousTransitionSystem create() {
		String clock1 = getStringParameterValue(CLOCK1, "c1");
		String clock2 = getStringParameterValue(CLOCK2, "c2");
		String sup = getStringParameterValue(SUP, "s");

		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem(sup+" = sup("+clock1+","+clock2+")");

		Event clock1Event = helper.createEvent(clock1);
		Event clock2Event = helper.createEvent(clock2);

		Event supE = helper.createEvent(sup);

		{ // general invariant
			Conjunction c = InvariantBuilder.conjunction(
					InvariantBuilder.inv(clock1Event, supE, 0, ComparisonOperator.GREATEROREQUAL),
					InvariantBuilder.inv(clock2Event, supE, 0, ComparisonOperator.GREATEROREQUAL)
			);
			sts.setInvariant(c);
		}
		
		State s0 = helper.createState("S0");
		sts.setInitial(s0);
		s0.setInvariant(InvariantBuilder.inv(clock1Event, clock2Event, 0, ComparisonOperator.EQUALS));

		{ // s0 -> s0, c1.c2.sup
			helper.createTransition(s0, s0, supE, clock1Event, clock2Event);	
		}

		State sPlus = helper.createState("S+");
		sPlus.setInvariant(InvariantBuilder.inv(clock1Event, clock2Event, 1, ComparisonOperator.GREATEROREQUAL));

		{ // s0 -> s+, c1
			helper.createTransition(s0, sPlus, clock1Event);	
		}
		
		{ // s+ -> s+, c1
			helper.createTransition(sPlus, sPlus, clock1Event);	
		}
		{ // s+ -> s+, c1.c2.sup
			helper.createTransition(sPlus, sPlus, supE, clock1Event, clock2Event);	
		}
		
		{ // s+ -> s+, c2.sup [delta>1]
			Transition transition = helper.createTransition(sPlus, sPlus, supE, clock2Event);
			transition.setGuard(InvariantBuilder.inv(clock1Event, clock2Event, 1, ComparisonOperator.GREATERTHAN));
		}
		{ // s+ -> s0, c2.sup [delta==1]
			Transition transition = helper.createTransition(sPlus, s0, supE, clock2Event);
			transition.setGuard(InvariantBuilder.inv(clock1Event, clock2Event, 1, ComparisonOperator.EQUALS));
		}
		
		State sMinus = helper.createState("S-");		
		sMinus.setInvariant(InvariantBuilder.inv(clock2Event, clock1Event, 1, ComparisonOperator.GREATEROREQUAL));
		
		{ // s0 -> s-, c2
			helper.createTransition(s0, sMinus, clock2Event);
		}
		{ // s- -> s-, c2
			helper.createTransition(sMinus, sMinus, clock2Event);
		}
		{ // s- -> s-, c1.c2.inf
			helper.createTransition(sMinus, sMinus, supE, clock1Event, clock2Event);
		}
		{ // s- -> s-, c1.sup [-delta>1]
			Transition transition = helper.createTransition(sMinus, sMinus, supE, clock1Event);	
			transition.setGuard(InvariantBuilder.inv(clock2Event, clock1Event, 1, ComparisonOperator.GREATERTHAN));
		}
		{ // s- -> s0, c1.sup [-delta==1]
			Transition transition = helper.createTransition(sMinus, s0, supE, clock1Event);	
			transition.setGuard(InvariantBuilder.inv(clock2Event, clock1Event, 1, ComparisonOperator.EQUALS));
		}
		
		return sts;
	}
}
