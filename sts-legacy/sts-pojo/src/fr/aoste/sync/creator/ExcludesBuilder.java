package fr.aoste.sync.creator;

import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;

class ExcludesBuilder extends ACCSLStsBuilder<SynchronousTransitionSystem> {
	static String NB_CLOCKS = "NbClocks";

	private FactoryHelper helper = new FactoryHelper();

	ExcludesBuilder() {
		super();
	}

	public SynchronousTransitionSystem create() {
		int nbClocks = getIntParameterValue(NB_CLOCKS, 2);
		if (nbClocks<2) throw new RuntimeException("ExcludesBuilder: must have at least two parameters:"+nbClocks);
		
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem(""); // do not know the name yet !

		State init = helper.createState("X");
		sts.setInitial(init);
		
		StringBuilder sb = new StringBuilder("#(");
		String sep = "";
		for(int i = 0; i<nbClocks; i++) {
			String clockName = getStringParameterValue("c"+(i+1), "c"+(i+1));
			sb.append(sep).append(clockName);
			sep = ", ";

			// create one event for each clock
			helper.createTransition(init, init, helper.createEvent(clockName));
		}			
		sb.append(')');
		sts.setName(sb.toString());
				
		// no invariant for exclusion
		return sts;
	}
}
