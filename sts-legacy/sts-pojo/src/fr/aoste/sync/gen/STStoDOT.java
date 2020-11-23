package fr.aoste.sync.gen;

import fr.aoste.sync.Event;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.Transition;
import fr.aoste.sync.Trigger;
import fr.aoste.sync.visitor.AstsVisitor;

public class STStoDOT extends AstsVisitor<CharSequence> {
	private StringBuilder builder = new StringBuilder();
	private SynchronousTransitionSystem sts;
	
	@Override
	public StringBuilder visit(SynchronousTransitionSystem sts) {
		this.sts = sts;

		builder.append("digraph ").append(sts.getName()).append(" { \n");
		for(Transition t : sts.getTransitions()) {
			t.accept(this);
		}
		builder.append("}\n");

		return builder;
	}

	@Override
	public StringBuilder visit(Transition t) {
		builder.append("  s"+sts.getStates().indexOf(t.getSource()));
		builder.append("->");
		builder.append("s"+sts.getStates().indexOf(t.getTarget()));
		t.getTrigger().accept(this);
		builder.append(";\n");
		return builder;
	}

	@Override
	public StringBuilder visit(Trigger trigger) {
		builder.append(" [\n    label= \"");
		String sep = "";
		for(Event e : trigger.getEvents()) {
			builder.append(sep).append(e.getName());
			sep=".";
		}
		builder.append("\"\n  ] ");
		return builder;
	}
}
