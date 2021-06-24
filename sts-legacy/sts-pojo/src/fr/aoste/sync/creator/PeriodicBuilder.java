package fr.aoste.sync.creator;

import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.Transition;
import fr.aoste.sync.vspec.ComparisonOperator;

class PeriodicBuilder extends ACCSLStsBuilder<SynchronousTransitionSystem> {
	static String PERIOD = "period";
	static String OFFSET = "offset";
	static String SUPERCLOCK = "super";
	static String SUBCLOCK = "sub";
	
	private FactoryHelper helper = new FactoryHelper();

	PeriodicBuilder() {
		super();
	}

	public SynchronousTransitionSystem create() {
		int period = getIntParameterValue(PERIOD, 2);
		assert(period>=0);
		int offset = getIntParameterValue(OFFSET, 0);
		assert(offset>=0);
		String sup = getStringParameterValue(SUPERCLOCK, "sup");
		String sub = getStringParameterValue(SUBCLOCK, "sub");
		
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem(sub+"=PeriodicOn "+sup+" period="+period+" offset="+offset);
		
		Event supE = helper.createEvent(sup);
		Event subE = helper.createEvent(sub);
		
		State init = helper.createState("init");
		init.setInvariant(InvariantBuilder.inv(supE, subE, 0, ComparisonOperator.EQUALS));
		sts.setInitial(init);
		
		State current = init;
		for(int i = 0; i<offset; i++) {
			State state = helper.createState("o"+i);
			state.setInvariant(InvariantBuilder.inv(supE, subE, i+1, ComparisonOperator.EQUALS));
			
			helper.createTransition(current, state, supE);
			
			current = state;
		}
		if (offset > 0) {
			current.setInvariant(InvariantBuilder.inv(supE, subE, offset, ComparisonOperator.GREATEROREQUAL));			
		}
		if (period==0) return sts;
		
		State beginCycle = current;
		Transition sync = helper.createTransition(beginCycle, beginCycle, supE, subE); //put initially target state, but change later
		
		for(int i = 1; i<period; i++) {
			State state = helper.createState("p"+i);
			state.setInvariant(InvariantBuilder.inv(supE, subE, offset, 
					i==1?ComparisonOperator.GREATEROREQUAL:ComparisonOperator.GREATERTHAN));
			sync.setTarget(state);
			
			sync=helper.createTransition(state, state, supE); //put initially target state, but change later
		}
		
		sync.setTarget(beginCycle);
		return sts;
	}
}
