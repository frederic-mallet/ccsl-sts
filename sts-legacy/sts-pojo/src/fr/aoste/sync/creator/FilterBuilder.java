package fr.aoste.sync.creator;

import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;

class FilterBuilder extends ACCSLStsBuilder<SynchronousTransitionSystem> {
	static String PERIOD = "period";
	static String INIT = "init";
	static String SUPERCLOCK = "super";
	static String SUBCLOCK = "sub";
	
	private FactoryHelper helper = new FactoryHelper();

	FilterBuilder() {
		super();
	}

	private int i = 0; 
	private State addState(SynchronousTransitionSystem sts, State src, State tgt, Event ...events) {
		if (tgt == null) {
			tgt = helper.createState("s"+i++);
		}
		
		helper.createTransition(src, tgt, events);
		
		return tgt;
	}
	
	public SynchronousTransitionSystem create() {
		String initS = getStringParameterValue(INIT, "").trim();
		String periodS = getStringParameterValue(PERIOD, "01").trim();
		String sup = getStringParameterValue(SUPERCLOCK, "sup");
		String sub = getStringParameterValue(SUBCLOCK, "sub");
		
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem(sub+"="+sup+" filteredBy "+initS+"("+periodS+")");
		
		Event supE = helper.createEvent(sup);
		Event subE = helper.createEvent(sub);
		
		State init = helper.createState("init");
		sts.setInitial(init);
		
		State current = init;
		char[] initC = initS.toCharArray();
		for(char i : initC) {
			if (i=='0') current = addState(sts, current, null, supE);
			else current = addState(sts, current, null, supE, subE);
		}
		if (periodS.isEmpty()) return sts;
		
		State beginCycle = current;
		char[] periodC = periodS.toCharArray();
		for(int i = 0; i<periodC.length; i++) {
			State tgt = i==periodC.length-1?beginCycle:null;
			if (periodC[i]=='0') current = addState(sts, current, tgt, supE);
			else current = addState(sts, current, tgt, supE, subE);
		}
		return sts;
	}
}
