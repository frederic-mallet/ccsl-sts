package fr.aoste.sync.gen;

import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.Transition;
import fr.aoste.sync.Trigger;

public class STStoDOT extends CheckVisitor {
	private StringBuilder builder = new StringBuilder();
	private SynchronousTransitionSystem sts;
	
	private String cleanId(String id) {
		id = id.replaceAll(" ", "_");
		id = id.replaceAll("<", "less");
		id = id.replaceAll("~", "alt");
		id = id.replaceAll(">", "more");
		id = id.replaceAll("=", "eq");
		id = id.replaceAll("\\(", "_");
		id = id.replaceAll("\\)", "_");
		id = id.replaceAll(",", "_");
		return id;
	}
	@Override
	public StringBuilder visit(SynchronousTransitionSystem sts) {
		this.sts = sts;

		builder.append("digraph ").append(cleanId(sts.getName())).append(" { \n");
		builder.append("  rankdir=\"LR\"\n");
		builder.append("  s").append(sts.getStates().indexOf(sts.getInitial())).append(" [ shape=\"doublecircle\" ]\n");
		for(Event e : sts.getEvents()) { e.accept(this); } // only for CheckVisitor
		for(State s : sts.getStates()) { s.accept(this); } // only for CheckVisitor
		for(Transition t : sts.getTransitions()) {
			t.accept(this);
		}
		builder.append("}\n");
		
		StringBuilder res = builder;
		builder = new StringBuilder(); // clean for the next one
		diagnostic();
		return res;
	}

	@Override
	public StringBuilder visit(Transition t) {
		super.visit(t);
		builder.append("  s"+sts.getStates().indexOf(t.getSource()));
		builder.append("->");
		builder.append("s"+sts.getStates().indexOf(t.getTarget()));
		if (t.getGuard()==null) { color = ""; }
		else { color = "color = \"red\""; }
		t.getTrigger().accept(this);
		builder.append(";\n");
		return builder;
	}
	private String color;

	@Override
	public StringBuilder visit(Trigger trigger) {
		super.visit(trigger);
		builder.append(" [\n    ").append(color).append("label= \"");
		String sep = "";
		for(Event e : trigger.getEvents()) {
			builder.append(sep).append(e.getName());
			sep=".";
		}
		builder.append("\"\n  ] ");
		return builder;
	}
}
