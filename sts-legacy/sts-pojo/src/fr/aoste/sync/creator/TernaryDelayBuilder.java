package fr.aoste.sync.creator;

import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;

public class TernaryDelayBuilder extends ACCSLStsBuilder<SynchronousTransitionSystem> {
	static String SOURCE = "source";
	static String DELAYED = "delayed";
	static String DELAY = "delay";
	static String BASE = "base";

	private FactoryHelper helper = new FactoryHelper();

	public TernaryDelayBuilder(String def, String src, int delay, String base) {
		super();
		setParameterValue(SOURCE, src);
		setParameterValue(DELAYED, def);
		setParameterValue(DELAY, delay);
		setParameterValue(BASE, base);
	}

	public SynchronousTransitionSystem create() {
		int delay = getIntParameterValue(DELAY, 1);
		assert(delay>=0);
		String source = getStringParameterValue(SOURCE, "source");
		String delayed = getStringParameterValue(DELAYED, "delayed");
		String base = getStringParameterValue(BASE, "delayed");

		SynchronousTransitionSystem 
		sts = helper.createSynchronousTransitionSystem(delayed + "=" + source + "$" + delay + " on " + base);

		Event srcE = helper.createEvent(source);
		Event delE = helper.createEvent(delayed);
		Event baseE = helper.createEvent(base);

		State[] states = new State[1<<delay];
		states[0] = helper.createState("Z0");
		sts.setInitial(states[0]);
		if (delay == 0) {
			helper.createTransition(states[0], states[0], srcE, delE);
			helper.createTransition(states[0], states[0], srcE, baseE, delE);
		}
		helper.createTransition(states[0], states[0], baseE);

		for (int i = 1; i < states.length; i++) {
			states[i] = helper.createState("Z" + i);
		}
		if (delay > 0) {
			helper.createTransition(states[0], states[1], srcE);
			helper.createTransition(states[0], states[1], srcE, baseE);
		}

		for(int i = 1; i < states.length; i++) {
			{ // srcE
				int next = i | 1; // cannot overflow
				helper.createTransition(states[i], states[next], srcE);				
			}
			{
				// baseE
				int next = i << 1;
				if (next >= states.length)
					helper.createTransition(states[i], states[next % states.length], baseE, delE);
				else
					helper.createTransition(states[i], states[next], baseE);

				// baseE and srcE
				next = next + 1;

				if (next >= states.length)
					helper.createTransition(states[i], states[next % states.length], srcE, baseE, delE);
				else
					helper.createTransition(states[i], states[next], srcE, baseE);
			}
		}
		return sts;
	}
}
