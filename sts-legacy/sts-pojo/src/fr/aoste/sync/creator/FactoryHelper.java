package fr.aoste.sync.creator;

import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import fr.aoste.sync.StsFactory;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.Transition;
import fr.aoste.sync.Trigger;

class FactoryHelper {
	private SynchronousTransitionSystem sts = null;
	
	SynchronousTransitionSystem createSynchronousTransitionSystem(String name) {
		sts = StsFactory.eINSTANCE.createSynchronousTransitionSystem();
		sts.setName(name);
		return sts;
	}
	
	Event createEvent(String name) {
		if (sts == null) throw new RuntimeException("FactoryHelper: must create a STS before creating events");
		Event event = StsFactory.eINSTANCE.createEvent();
		event.setName(name);
		sts.getEvents().add(event);
		
		return event;
	}

	State createState(String name) {
		State s = StsFactory.eINSTANCE.createState();
		s.setName(name);
		sts.getStates().add(s);
		return s;
	}
	
	Transition createTransition(State source, State target, Event ...events) {
		Transition t = StsFactory.eINSTANCE.createTransition();
		t.setSource(source);
		t.setTarget(target);
		sts.getTransitions().add(t);
		
		Trigger trigger = StsFactory.eINSTANCE.createTrigger();
		t.setTrigger(trigger);
		for(Event e: events)
			trigger.getEvents().add(e);
		
		return t;
	}
}
