package fr.aoste.sync.dynamic.util;

import fr.aoste.sync.State;
import fr.aoste.sync.Vertex;
import fr.aoste.sync.dynamic.DynamicTransitionSystem;
import fr.aoste.sync.dynamic.EventCounter;
import fr.aoste.sync.dynamic.visitor.AdynamicVisitor;

public class DTSPrettyPrinter extends AdynamicVisitor<StringBuilder>{
	private StringBuilder sb;

	public DTSPrettyPrinter() {
		this(new StringBuilder());
	}

	public DTSPrettyPrinter(StringBuilder sb) {
		this.sb = sb;
	}
	

	@Override
	public StringBuilder visit(DynamicTransitionSystem object) {
		String sep = "";
		
		for(Vertex state : object.getCurrent()) {
			sb.append(sep);
			if (state instanceof State)
				sb.append(((State)state).getName());
			sep = " x ";
		}
		for(EventCounter eb: object.getCounters()) {
			sb.append(" ");
			eb.accept(this);
		}
		return sb;
	}
	@Override
	public StringBuilder visit(EventCounter object) {
		sb.append(object.getEvent().getSync().getName());
		sb.append("/").append(object.getEvent().getName());
//		pp.caseSyncVector(object.getEvent().getSync());
		sb.append("=").append(object.getCounter());
		return sb;
	}
}
