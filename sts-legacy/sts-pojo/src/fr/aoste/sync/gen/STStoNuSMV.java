package fr.aoste.sync.gen;

import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.Transition;
import fr.aoste.sync.Trigger;

public class STStoNuSMV extends CheckVisitor {
	private StringBuilder builder = new StringBuilder();
	private SynchronousTransitionSystem sts;
	
	@Override
	public StringBuilder visit(SynchronousTransitionSystem sts) {
		this.sts = sts;

		builder.append("MODULE main\n");//").append(sts.getName()).append('\n');
		builder.append("VAR \n");
		
		builder.append("  _state : -2 .. "); // -1 is the final state if any, -2 is FAIL state
		builder.append(sts.getStates().size()-1);
		builder.append(";\n\n");
		
		builder.append("INVARSPEC !(_state=-2); -- not fail state\n\n");
		builder.append("ASSIGN \n");

		builder.append("  init(_state) := ");
		builder.append(sts.getStates().indexOf(sts.getInitial()));
		builder.append(";\n\n");

		builder.append("  next(_state) := case\n");
		int statepos=0;
		for(State s : sts.getStates()) {
			s.accept(this); // only for checkVisitor
			builder.append("                    _state = ");
			builder.append(statepos);
			builder.append(": { ");
			String sep = "";
			for(Transition t : sts.getTransitions()) {
				if (t.getSource()==s) {
					builder.append(sep).append(sts.getStates().indexOf(t.getTarget()));
					sep = ", ";
				}
			}
			if (sep=="") builder.append("-2");
			builder.append(" };\n");
			statepos++;
		}
		builder.append("                    TRUE: _state;\n");
		builder.append("                  esac;\n\n");
		
		
		builder.append("DEFINE \n");
		for (Transition t : sts.getTransitions()) 
			t.accept(this); // only for diagnostic
			
		for(Event e : sts.getEvents()) {
			boolean assigned = false;
			String sep="";
			builder.append("  ").append(e.getName()).append(" := ");
			for(Transition t: sts.getTransitions()) {
				if (t.getTrigger().getEvents().contains(e)) {
					super.visit(e); // only for diagnostic
					builder.append(sep).append("((_state = ");
					builder.append(sts.getStates().indexOf(t.getSource()));
					builder.append(") & (next(_state) = ");
					builder.append(sts.getStates().indexOf(t.getTarget()));
					builder.append("))");
					assigned = true;
					sep = "\n\t| ";
				}
			}
			if (!assigned) builder.append("FALSE");
			builder.append(";\n");
		}

		diagnostic();
		
		return builder;
	}

	@Override
	public StringBuilder visit(Transition t) {
		super.visit(t);
		builder.append("\t  _state=").append(t.getSource().accept(this));
		visit(t.getTrigger());
		builder.append(" :\n");
		builder.append("\t    ").append(t.getTarget().accept(this)).append(";\n");
		return builder;
	}

	boolean showOneOnly = true;

	@Override
	public StringBuilder visit(Trigger trigger) {
		for(Event e : sts.getEvents()) {
			builder.append(" & ");
			if(!trigger.getEvents().contains(e))
				builder.append("!");
			builder.append(e.getName());
		}
		return builder;
	}
}
