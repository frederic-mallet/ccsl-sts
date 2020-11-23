package fr.aoste.sync.creator;

import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.vspec.ComparisonOperator;

class DelayBuilder extends ACCSLStsBuilder<SynchronousTransitionSystem> {
	static String SOURCE = "source";
	static String DELAYED = "delayed";
	static String DELAY = "delay";
	static String PURE = "pure";
	
	private FactoryHelper helper = new FactoryHelper();

	DelayBuilder() {
		super();
	}

	public SynchronousTransitionSystem create() {
		int delay = getIntParameterValue(DELAY, 1);
		assert(delay>=0);
		String source = getStringParameterValue(SOURCE, "source");
		String delayed = getStringParameterValue(DELAYED, "delayed");
		boolean isPure = getBooleanParameterValue(PURE, false);
		
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem(delayed+"="+source+" $ "+delay);
		
		Event srcE = helper.createEvent(source);
		
		Event delE = helper.createEvent(delayed);
		
		State init = helper.createState("init");
		sts.setInitial(init);
		init.setInvariant(InvariantBuilder.buildInvariant(srcE, delE, 0, ComparisonOperator.EQUALS));
		
		State current = init;
		for(int i = 0; i<delay; i++) {
			State state = helper.createState("d"+(i+1));
			state.setInvariant(InvariantBuilder.buildInvariant(srcE, delE, i+1, ComparisonOperator.EQUALS));
			
			helper.createTransition(current, state, srcE);
			
			current = state;
		}
		
		helper.createTransition(current, current, srcE, delE);

		if (isPure) {
			for(int i = 0; i<delay; i++) {
				State state = helper.createState("p"+(delay-i-1));
				state.setInvariant(InvariantBuilder.buildInvariant(srcE, delE, delay-i-1, ComparisonOperator.EQUALS));
				
				helper.createTransition(current, state, delE);
				
				current = state;
			}
		}
		return sts;
	}
}
