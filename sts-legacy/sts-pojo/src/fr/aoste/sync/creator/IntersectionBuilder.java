package fr.aoste.sync.creator;

import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.Transition;
import fr.aoste.sync.Trigger;
import fr.aoste.sync.vspec.ComparisonOperator;
import fr.aoste.sync.vspec.Conjunction;

class IntersectionBuilder extends ACCSLStsBuilder<SynchronousTransitionSystem> {
	static String NB_CLOCKS = "NbClocks";
	static String INTERSECTION = "intersection";

	private FactoryHelper helper = new FactoryHelper();

	IntersectionBuilder() {
		super();
	}

	public SynchronousTransitionSystem create() {
		int nbClocks = getIntParameterValue(NB_CLOCKS, 2);
		if (nbClocks<2) throw new RuntimeException("IntersectionBuilder: must have at least two parameters:"+nbClocks);

		String intersection = getStringParameterValue(INTERSECTION, "i");

		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem(""); // do not know the name yet !
		StringBuilder sb = new StringBuilder(intersection);
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


		Event intersectionE = helper.createEvent(intersection);

		State init = helper.createState("I"); // create and add
		sts.setInitial(init);
		Conjunction c = InvariantBuilder.conjunction();
		for(int i = 0; i<nbClocks; i++) {
			c.getOperands().add(InvariantBuilder.inv(intersectionE, events[i], 0, ComparisonOperator.LESSOREQUAL));
		}
		init.setInvariant(c);

		boolean[] clockStatus = new boolean[nbClocks];
		int pos = 0;
		do {
			do {
				clockStatus[pos] = !clockStatus[pos];
				if (clockStatus[pos]) {
					pos = 0;
					break;
				} else {
					pos++;
				}
			} while (pos<nbClocks);
			
			assert(pos == 0 || pos == nbClocks);

			if (pos == nbClocks) break;
			
			Transition transition = helper.createTransition(init, init);

			Trigger trigger = transition.getTrigger();

			for (int i = 0; i<nbClocks; i++)
				if (clockStatus[i]) {
					trigger.getEvents().add(events[i]);
				}
			
			if (trigger.getEvents().size()==nbClocks) // only when all clocks tick
				trigger.getEvents().add(intersectionE);
		} while (true);

		return sts;
	}
}
