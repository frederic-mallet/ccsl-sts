package fr.aoste.sync.creator;

import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.vspec.ComparisonOperator;
import fr.aoste.sync.vspec.Conjunction;
import fr.aoste.sync.vspec.ValuespecificationFactory;

class CoincidesBuilder extends ACCSLStsBuilder<SynchronousTransitionSystem> {
	static String NB_CLOCKS = "NbClocks";

	private FactoryHelper helper = new FactoryHelper();

	CoincidesBuilder() {
		super();
	}

	public SynchronousTransitionSystem create() {
		int nbClocks = getIntParameterValue(NB_CLOCKS, 2);
		if (nbClocks<2) throw new RuntimeException(getClass().getSimpleName()+": must have at least two parameters:"+nbClocks);

		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem(""); // do not know the name yet
		StringBuilder sb = new StringBuilder();
		String sep = "";
		Event[] events = new Event[nbClocks];
		for(int i = 0; i<nbClocks; i++) {
			String clockName = getStringParameterValue("c"+(i+1), "c"+(i+1));
			sb.append(sep).append(clockName);
			sep = " = ";

			// create one event for each clock
			events[i] = helper.createEvent(clockName);
		}			
		sts.setName(sb.toString());


		State init = helper.createState("C");
		sts.setInitial(init);
		Conjunction c = ValuespecificationFactory.eINSTANCE.createConjunction();
		for(int i = 1; i<nbClocks; i++) {
			c.getOperands().add(InvariantBuilder.buildInvariant(events[0], events[i], 0, ComparisonOperator.EQUALS));
		}
		init.setInvariant(c);
		sts.getStates().add(init);

		helper.createTransition(init, init, events);

		return sts;
	}
}
