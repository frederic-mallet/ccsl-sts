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
		String ref = getStringParameterValue(REF, "c1");
		String base = getStringParameterValue(BASE, "c2");
		String derived = getStringParameterValue(DERIVED, "s");

		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem(derived+" = " + ref + " sampledOn " + base);

		Event refEvent = helper.createEvent(ref);
		Event baseEvent = helper.createEvent(base);
		Event derivedEvent = helper.createEvent(derived);
		
		{ // general invariant
			Conjunction c = InvariantBuilder.conjunction(
					InvariantBuilder.inv(refEvent, derivedEvent, 0, ComparisonOperator.GREATEROREQUAL),
					InvariantBuilder.inv(baseEvent, derivedEvent, 0, ComparisonOperator.GREATEROREQUAL));
			sts.setInvariant(c);
		}
		
		State init = helper.createState("i");
		sts.setInitial(init);
//		init.setInvariant(InvariantBuilder.inv(clock1Event, clock2Event, 0, ComparisonOperator.EQUALS));

		{ 
			helper.createTransition(init, init, baseEvent);	
		}

		State s1 = helper.createState("s1"); // received clock1
		{ 
			helper.createTransition(init, s1, refEvent, baseEvent);	
			helper.createTransition(init, s1, refEvent);	
			helper.createTransition(s1, s1, refEvent);			
		}
		
		{ 
			helper.createTransition(s1, init, derivedEvent, baseEvent);	
			helper.createTransition(s1, s1, derivedEvent, refEvent, baseEvent);			
		}
		
		return sts;
	}

}
