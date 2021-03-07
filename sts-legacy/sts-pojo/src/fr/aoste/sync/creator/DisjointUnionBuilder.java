package fr.aoste.sync.creator;

import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.vspec.ComparisonOperator;
import fr.aoste.sync.vspec.Conjunction;

class DisjointUnionBuilder extends ACCSLStsBuilder<SynchronousTransitionSystem> {
	static String NB_CLOCKS = "NbClocks";
	static String DISJOINT_UNION = "xunion";
	
	private FactoryHelper helper = new FactoryHelper();
	
	DisjointUnionBuilder() {
		super();
	}

	public SynchronousTransitionSystem create() {
		int nbClocks = getIntParameterValue(NB_CLOCKS, 2);
		if (nbClocks<2) throw new RuntimeException("DisjointUnionBuilder: Union must have at least one parameter:"+nbClocks);
		
		String disjointunion = getStringParameterValue(DISJOINT_UNION, "xu");
		
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem(""); // do not know the name yet !
		Event xUnionE = helper.createEvent(disjointunion);

		State init = helper.createState("XU");
		sts.setInitial(init);
		
		StringBuilder sb = new StringBuilder("xUnion(");
		String sep = "";
		Event[] events = new Event[nbClocks];
		for(int i = 0; i<nbClocks; i++) {
			String clockName = getStringParameterValue("c"+(i+1), "c"+(i+1));
			sb.append(sep).append(clockName);
			sep = ", ";

			// create one event for each clock
			helper.createTransition(init, init, events[i]=helper.createEvent(clockName), xUnionE);
		}			
		sb.append(')');
		sts.setName(sb.toString());

		// Same as union
		Conjunction c = InvariantBuilder.conjunction();
		for(int i = 0; i<nbClocks; i++) {
			c.getOperands().add(InvariantBuilder.inv(xUnionE, events[i], 0, ComparisonOperator.GREATEROREQUAL));
		}
		init.setInvariant(c);
		
		return sts;
	}
}
