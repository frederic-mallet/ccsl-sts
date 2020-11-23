package fr.aoste.sync.dynamic.visitor;

import fr.aoste.sync.Vertex;
import fr.aoste.sync.dynamic.DynamicTransitionSystem;
import fr.aoste.sync.dynamic.EventCounter;
import fr.aoste.sync.dynamic.IdynamicVisitor;

/**
 * A Default Pretty Print Visitor for the package '<em><b>dynamic</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PrettyPrintdynamicVisitor implements IdynamicVisitor<CharSequence> {
	/**
	 * @generated
	 */
	private StringBuilder surface = null;

	/**
	 * @generated
	 */
	private StringBuilder internal = new StringBuilder();

	/**
	 * @generated
	 */
	private String tab;

	/**
	 * @generated
	 */
	private String sep = "";

	/**
	 * @generated
	 */
	public PrettyPrintdynamicVisitor() {
		this("");
	}

	/**
	 * Should be private, but is public to be used when there are multiple
	 * package for the same model
	 * 
	 * @generated
	 */
	public PrettyPrintdynamicVisitor(String tab) {
		this.tab = tab;
	}

	/**
	 * Visiting a '<em><b>DynamicTransitionSystem</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CharSequence visit(DynamicTransitionSystem obj) {
		boolean toplevel = false;
		if (surface == null) {
			surface = new StringBuilder();
			surface.append(tab).append("DynamicTransitionSystem<");
			toplevel = true;
			sep = "";
		}

		/** Reference: name=current many=true useList=true */
		surface.append(sep).append("current={");
		{
			String localSep = "";
			for (Vertex e : obj.getCurrent()) {
				surface.append(localSep).append(e);
				localSep = ", ";
			}
		}
		surface.append("}");
		sep = ", ";
		/** Reference: name=counters many=true useList=true */
		surface.append(sep).append("counters={");
		{
			String localSep = "";
			for (EventCounter e : obj.getCounters()) {
				surface.append(localSep).append(e);
				localSep = ", ";
			}
		}
		surface.append("}");
		sep = ", ";
		/** Reference: name=static_ many=false useList=false */
		surface.append(sep).append("static_=").append(obj.getStatic_());
		sep = ", ";

		if (toplevel) {
			surface.append("> [").append(internal);
			if (internal.length() > 0)
				surface.append('\n').append(tab);
			surface.append(']');
		}
		return surface;
	}

	/**
	 * Visiting a '<em><b>EventCounter</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public CharSequence visit(EventCounter obj) {
		boolean toplevel = false;
		if (surface == null) {
			surface = new StringBuilder();
			surface.append(tab).append("EventCounter<");
			toplevel = true;
			sep = "";
		}

		/** Attribute: counter */
		surface.append(sep).append("counter: ").append(obj.getCounter());
		sep = ", ";
		/** Reference: name=event many=false useList=false */
		surface.append(sep).append("event=").append(obj.getEvent());
		sep = ", ";

		if (toplevel) {
			surface.append("> [").append(internal);
			if (internal.length() > 0)
				surface.append('\n').append(tab);
			surface.append(']');
		}
		return surface;
	}

}
