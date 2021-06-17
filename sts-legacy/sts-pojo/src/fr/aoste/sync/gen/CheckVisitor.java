package fr.aoste.sync.gen;

import java.util.HashSet;

import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import fr.aoste.sync.Transition;
import fr.aoste.sync.Trigger;
import fr.aoste.sync.visitor.AstsVisitor;

abstract class CheckVisitor extends AstsVisitor<CharSequence> {
	private HashSet<Event> events = new HashSet<>();
	private int nbStates = 0;
	private int nbTransitions = 0;
	
	@Override
	public CharSequence visit(Event e) {
		events.add(e);
		return null;
	}
	
	@Override
	public CharSequence visit(State s) {
		nbStates++;
		return null;
	}
	
	@Override
	public CharSequence visit(Transition t) {
		nbTransitions++;
		return null;
	}
	@Override
	public CharSequence visit(Trigger e) {
		for (Event ev : e.getEvents())
			events.remove(ev);
		return null;
	}
	final void diagnostic() {
		System.out.println("Nb states: " + nbStates);
		System.out.println("Nb transitions: " + nbTransitions);
		if (!events.isEmpty()) {
			System.err.print("Some clocks are never used:");
			for (Event ev : events) System.out.print(" " + ev.getName());
		}
	}
}
