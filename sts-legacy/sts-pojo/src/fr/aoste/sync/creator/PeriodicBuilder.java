package fr.aoste.sync.creator;

import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.Transition;

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
		sts.setInitial(init);
		
		State current = init;
		for(int i = 0; i<offset; i++) {
			State state = helper.createState("o"+i);
			
			helper.createTransition(current, state, supE);
			
			current = state;
		}
		if (period==0) return sts;
		
		State beginCycle = current;
		Transition sync = helper.createTransition(beginCycle, beginCycle, supE, subE); //put initially target state, but change later
		
		for(int i = 1; i<period; i++) {
			State state = helper.createState("p"+i);
			sync.setTarget(state);
			
			sync=helper.createTransition(state, state, supE); //put initially target state, but change later
		}
		
		sync.setTarget(beginCycle);
		return sts;
	}
}
