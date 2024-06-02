package fr.aoste.sync.creator;

import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.vspec.ComparisonOperator;
import fr.aoste.sync.vspec.Conjunction;

class ExclusiveUnionBuilder extends ACCSLStsBuilder<SynchronousTransitionSystem> {
	static String NB_CLOCKS = "NbClocks";
	static String EXCLUSIVEUNION = "xor";
	
	private FactoryHelper helper = new FactoryHelper();
	
	ExclusiveUnionBuilder() {
		super();
	}

	public SynchronousTransitionSystem create() {
		int nbClocks = getIntParameterValue(NB_CLOCKS, 2);
		if (nbClocks<2) throw new RuntimeException("ExclusiveUnionBuilder: Union must have at least two parameters:"+nbClocks);
		
		String exclusiveUnion = getStringParameterValue(EXCLUSIVEUNION, "x");
		
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem(""); // do not know the name yet !
		StringBuilder sb = new StringBuilder(exclusiveUnion);
		String sep = "=";
		Event[] events = new Event[nbClocks];
		for(int i = 0; i<nbClocks; i++) {
			String clockName = getStringParameterValue("x"+(i+1), "x"+(i+1));
			sb.append(sep).append(clockName);
			sep = " xor ";

			// create one event for each clock
			events[i] = helper.createEvent(clockName);
		}			
		sts.setName(sb.toString());
				
		Event exclusiveUnionE = helper.createEvent(exclusiveUnion);
		
		State init = helper.createState("X"); // create and add
		sts.setInitial(init);
		Conjunction c = InvariantBuilder.conjunction();
		for(int i = 0; i<nbClocks; i++) {
			c.getOperands().add(InvariantBuilder.inv(exclusiveUnionE, events[i], 0, ComparisonOperator.GREATEROREQUAL));
		}
		init.setInvariant(c);
		
		for (int i=0; i < nbClocks; i++) {
			helper.createTransition(init, init, exclusiveUnionE, events[i]);
		}
		
		return sts;
	}
}
