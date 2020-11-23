package fr.aoste.sync.creator;

import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.Transition;
import fr.aoste.sync.Trigger;
import fr.aoste.sync.vspec.ComparisonOperator;
import fr.aoste.sync.vspec.Conjunction;

class UnionBuilder extends ACCSLStsBuilder<SynchronousTransitionSystem> {
	static String NB_CLOCKS = "NbClocks";
	static String UNION = "union";
	
	private FactoryHelper helper = new FactoryHelper();
	
	UnionBuilder() {
		super();
	}

	public SynchronousTransitionSystem create() {
		int nbClocks = getIntParameterValue(NB_CLOCKS, 2);
		if (nbClocks<2) throw new RuntimeException("UnionBuilder: Union must have at least two parameters:"+nbClocks);
		
		String union = getStringParameterValue(UNION, "u");
		
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem(""); // do not know the name yet !
		StringBuilder sb = new StringBuilder(union);
		String sep = "=";
		Event[] events = new Event[nbClocks];
		for(int i = 0; i<nbClocks; i++) {
			String clockName = getStringParameterValue("c"+(i+1), "c"+(i+1));
			sb.append(sep).append(clockName);
			sep = " + ";

			// create one event for each clock
			events[i] = helper.createEvent(clockName);
		}			
		sts.setName(sb.toString());
		
		
		Event unionE = helper.createEvent(union);
		
		State init = helper.createState("U");
		sts.setInitial(init);
		Conjunction c = InvariantBuilder.buildConjunction();
		for(int i = 0; i<nbClocks; i++) {
			c.getOperands().add(InvariantBuilder.buildInvariant(unionE, events[i], 0, ComparisonOperator.GREATEROREQUAL));
		}
		init.setInvariant(c);
		sts.getStates().add(init);		
		
		boolean[] clockStatus = new boolean[nbClocks];
		int pos = 0;
		do {
			do {
				clockStatus[pos] = !clockStatus[pos];
				if (clockStatus[pos]) {
					pos=0;
					break;
				} else {
					++pos;
				}
			} while (pos<nbClocks);
			
			assert(pos == 0 || pos == nbClocks);
			
			if (pos == nbClocks) break;
			
			Transition transition = helper.createTransition(init, init, unionE);
			Trigger trigger = transition.getTrigger();
			
			for (int i = 0; i<nbClocks; i++)
				if (clockStatus[i]) trigger.getEvents().add(events[i]);
		} while (true);
		
		return sts;
	}
}
