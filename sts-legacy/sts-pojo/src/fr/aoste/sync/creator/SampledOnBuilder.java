package fr.aoste.sync.creator;

import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.vspec.ComparisonOperator;
import fr.aoste.sync.vspec.Conjunction;

public class SampledOnBuilder extends ACCSLStsBuilder<SynchronousTransitionSystem> {
	static String REF = "Clock1";
	static String BASE = "Clock2";
	static String DERIVED = "derived";

	private FactoryHelper helper = new FactoryHelper();

	SampledOnBuilder() {
		super();
	}


	@Override
	public SynchronousTransitionSystem create() {
		String clock1 = getStringParameterValue(REF, "c1");
		String clock2 = getStringParameterValue(BASE, "c2");
		String derived = getStringParameterValue(DERIVED, "s");
		

		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem(derived+" = " + clock1 + " sampledOn " + clock2);

		Event clock1Event = helper.createEvent(clock1);
		Event clock2Event = helper.createEvent(clock2);
		Event derivedEvent = helper.createEvent(derived);
		
		{ // general invariant
			Conjunction c = InvariantBuilder.conjunction(
					InvariantBuilder.inv(clock1Event, derivedEvent, 0, ComparisonOperator.GREATEROREQUAL),
					InvariantBuilder.inv(clock2Event, derivedEvent, 0, ComparisonOperator.GREATEROREQUAL));
			sts.setInvariant(c);
		}
		
		State init = helper.createState("i");
		sts.setInitial(init);
//		init.setInvariant(InvariantBuilder.inv(clock1Event, clock2Event, 0, ComparisonOperator.EQUALS));

		{ 
			helper.createTransition(init, init, clock2Event);	
		}

		State s1 = helper.createState("s1"); // received clock1
		{ 
			helper.createTransition(init, s1, clock1Event, clock2Event);	
			helper.createTransition(init, s1, clock1Event);	
			helper.createTransition(s1, s1, clock1Event);			
		}
		
		{ 
			helper.createTransition(s1, init, derivedEvent, clock2Event);	
			helper.createTransition(s1, init, derivedEvent, clock1Event, clock2Event);			
		}
		
		return sts;
	}

}
