package fr.aoste.sync.compose;

import java.util.ArrayList;
import java.util.List;

import fr.aoste.sync.ComposedTransitionSystem;
import fr.aoste.sync.Event;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.visitor.AstsVisitor;

public class EventCollector extends AstsVisitor<List<Event>> {
	private List<Event> eventList = new ArrayList<Event>();

	@Override
	public List<Event> visit(SynchronousTransitionSystem sts) {
		for(Event e : sts.getEvents())
			e.accept(this);
		return eventList;
	}

	@Override
	public List<Event> visit(Event e) {
		eventList.add(e);
		return eventList;
	}

	@Override
	public List<Event> visit(ComposedTransitionSystem e) {
		for(SynchronousTransitionSystem sts : e.getSubsystems())
			sts.accept(this);
		return eventList;
	}
}
