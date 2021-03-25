package fr.aoste.sync.util;

import fr.aoste.sts.SyncVector;
import fr.aoste.sync.Chi;
import fr.aoste.sync.Event;
import fr.aoste.sync.FinalState;
import fr.aoste.sync.Parameter;
import fr.aoste.sync.ParameterBinding;
import fr.aoste.sync.ParameterReference;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.Transition;
import fr.aoste.sync.Trigger;
import fr.aoste.sync.dynamic.util.DTSHelper;
import fr.aoste.sync.visitor.AstsVisitor;
import fr.aoste.sync.vspec.BooleanExpression;
import fr.aoste.sync.vspec.Comparison;
import fr.aoste.sync.vspec.ComparisonOperator;
import fr.aoste.sync.vspec.Conjunction;
import fr.aoste.sync.vspec.Difference;
import fr.aoste.sync.vspec.IntegerExpression;
import fr.aoste.sync.vspec.IvaluespecificationVisitor;
import fr.aoste.sync.vspec.LiteralInteger;
import fr.aoste.sync.vspec.NotExpression;
import fr.aoste.sync.vspec.ValueSpecification;

/**
 * Pretty Print a STS
 * @author fmallet
 *
 */
public class STSPrettyPrinter extends AstsVisitor<StringBuilder> implements IvaluespecificationVisitor<StringBuilder> {
	private StringBuilder sb;
	private DTSHelper helper;

	public static void print(SynchronousTransitionSystem sts) {
		System.out.println("**"+sts.getName()+"** State:"+sts.getStates().size()+" Transition:"+sts.getTransitions().size());		
//		STSPrettyPrinter pp = new STSPrettyPrinter(null);
//		System.out.println(sts.accept(pp));		
	}
	public STSPrettyPrinter(DTSHelper helper) {
		this(helper, new StringBuilder());
	}
	public STSPrettyPrinter(DTSHelper helper, StringBuilder sb) {
		super();
		this.helper = helper;
		this.sb = sb;
	}

	@Override
	public String toString() {
		return sb.toString();
	}

	@Override
	public StringBuilder visit(SynchronousTransitionSystem sts) {
		sb.append("<STS:").append(sts.getName()).append(">").append('\n');
		
		sb.append("\tEvents:");
		for (Event e : sts.getEvents()) {
			e.accept(this);
			sb.append(' ');
		}
		sb.append('\n');
		
		sb.append("\tStates [\n");
		for (State s : sts.getStates()) {
			sb.append("\t\t");
			if (s==sts.getInitial()) sb.append("init:");
			s.accept(this);
			sb.append('\n');
		}
		
		sb.append("\t]\n\tTransitions [\n");
		for (Transition t : sts.getTransitions()) {
			sb.append("\t\t");
			t.accept(this);
			sb.append('\n');
		}
		sb.append("\t]\n");
		
		if (sts.getInvariant()!=null) {
			sb.append("\t").append("Inv:");
			sts.getInvariant().accept(this);
			sb.append('\n');
		}
		return sb;
	}

	@Override
	public StringBuilder visit(Event event) {
		sb.append(event.getName());
		return sb;
	}
	@Override
	public StringBuilder visit(State state) {
		sb.append(state.getName());
		if (state.getInvariant()!=null) {
			sb.append("\n\t\t\t").append("inv:");
			state.getInvariant().accept(this);
		}
		
		return sb;
	}
	@Override
	public StringBuilder visit(FinalState e) {
		sb.append("FinalState");
		return sb;
	}
	@Override
	public StringBuilder visit(Parameter parameter) {
		sb.append("(").append(parameter.getName()).append("=");
		if (helper != null) {
			ParameterBinding binding = helper.getParameterBindingByParameter(parameter);
			if (binding != null) {
				binding.getValue().accept(this);
				sb.append(")");
				return sb;
			}
		}
		parameter.getDefaultValue().accept(this);
		sb.append(")");
		return sb;
	}
	@Override
	public StringBuilder visit(Transition transition) {
		if (transition.getGuard()!=null) {
			sb.append("[");
			visit(transition.getGuard());
			sb.append("] ");
		}
		sb.append("From ");
		sb.append(transition.getSource().getName());
		sb.append(" to ");
		if (transition.getTarget() instanceof State)
			sb.append(((State)transition.getTarget()).getName());
		sb.append(" when ");
		transition.getTrigger().accept(this);
		return sb;
	}
	@Override
	public StringBuilder visit(Trigger trigger) {
		String sep = "";
		for(Event e : trigger.getEvents()) {
			sb.append(sep);
			e.accept(this);
			sep = ".";
		}
		return sb;
	}
	@Override
	public StringBuilder visit(Chi object) {
		sb.append("Chi_");
		object.getEvent().accept(this);
		return sb;
	}
	@Override
	public StringBuilder visit(ParameterReference ref) {
		ref.getReference().accept(this);
		return sb;
	}

	public StringBuilder caseSyncVector(SyncVector<Event> syncEvent) {
		sb.append(syncEvent.getName());
		String sep = "/";
		for(Event ev : syncEvent) {
			sb.append(sep);
			ev.accept(this);
			sep=".";
		}
		return sb;
	}

	//	@Override
	//	public StringBuilder caseGuard(Guard guard) {
	//		if (guard == null) return sb;
	//		sb.append("[Chi_");
	//		caseEvent(guard.getFirst());
	//		sb.append("-Chi_");
	//		caseEvent(guard.getSecond());
	//		caseOperator(guard.getOperator());
	//		doSwitch(guard.getBoundary());
	//		sb.append("]");
	//		return sb;
	//	}
	//

	public String printTransition(Transition transition) {
		if (transition.getGuard()!=null) {
			sb.append(" [");
			visit(transition.getGuard());
			sb.append("] ");
		}
		transition.getTrigger().accept(this);
		return sb.toString();
	}

	@Override
	public StringBuilder visit(BooleanExpression e) {
		e.accept(new ValueSpecificationPrettyPrinter(helper, sb));
		return sb;
	}
	@Override
	public StringBuilder visit(ValueSpecification e) {
		e.accept(new ValueSpecificationPrettyPrinter(helper, sb));
		return sb;
	}
	@Override
	public StringBuilder visit(IntegerExpression e) {
		if (e instanceof Chi) 
			visit((Chi)e);
		else if (e instanceof ParameterReference)
			visit((ParameterReference)e);
		else
			e.accept(new ValueSpecificationPrettyPrinter(helper, sb));
		return sb;
	}
	@Override
	public StringBuilder visit(LiteralInteger e) {
		return null;
	}
	@Override
	public StringBuilder visit(Difference e) {
		return null;
	}
	@Override
	public StringBuilder visit(Conjunction e) {
		String sep = "";
		for (BooleanExpression be : e.getOperands()) {
			sb.append(sep);
			be.accept(this);
			sep = " && ";
		}
		return sb;
	}
	@Override
	public StringBuilder visit(Comparison e) {
		return visit((ValueSpecification)e);
	}
	@Override
	public StringBuilder visit(ComparisonOperator e) {
		return null;
	}
	@Override
	public StringBuilder visit(NotExpression e) {
		sb.append("!");
		e.getOperand().accept(this);
		return sb;
	}
}
