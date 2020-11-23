package fr.aoste.sync.visitor;

import fr.aoste.sync.Chi;
import fr.aoste.sync.ComposedTransitionSystem;
import fr.aoste.sync.Event;
import fr.aoste.sync.FinalState;
import fr.aoste.sync.IstsVisitor;
import fr.aoste.sync.NamedElement;
import fr.aoste.sync.Parameter;
import fr.aoste.sync.ParameterBinding;
import fr.aoste.sync.ParameterReference;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.Transition;
import fr.aoste.sync.Trigger;
import fr.aoste.sync.Vertex;
import fr.aoste.sync.vspec.visitor.PrettyPrintvaluespecificationVisitor;

/**
 * A Default Pretty Print Visitor for the package '<em><b>sts</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PrettyPrintstsVisitor implements IstsVisitor<CharSequence> {
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
	public PrettyPrintstsVisitor() {
		this("");
	}

	/**
	 * Should be private, but is public to be used when there are multiple
	 * package for the same model
	 * 
	 * @generated
	 */
	public PrettyPrintstsVisitor(String tab) {
		this.tab = tab;
	}

	/**
	 * Visiting a '<em><b>SynchronousTransitionSystem</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CharSequence visit(SynchronousTransitionSystem obj) {
		boolean toplevel = false;
		if (surface == null) {
			surface = new StringBuilder();
			surface.append(tab).append("SynchronousTransitionSystem<");
			toplevel = true;
			sep = "";
		}

		/** SuperType:NamedElement */
		visit((NamedElement) obj);

		/** Reference: name=events many=true useList=true */
		internal.append('\n').append(tab).append("\tevents={");
		for (Event e : obj.getEvents()) {
			internal.append('\n').append(
					e.accept(new PrettyPrintstsVisitor(tab + "\t\t")));
		}
		if (!obj.getEvents().isEmpty())
			internal.append('\n').append(tab).append("\t");
		internal.append('}');
		sep = ", ";
		/** Reference: name=states many=true useList=true */
		internal.append('\n').append(tab).append("\tstates={");
		for (State e : obj.getStates()) {
			internal.append('\n').append(
					e.accept(new PrettyPrintstsVisitor(tab + "\t\t")));
		}
		if (!obj.getStates().isEmpty())
			internal.append('\n').append(tab).append("\t");
		internal.append('}');
		sep = ", ";
		/** Reference: name=initial many=false useList=false */
		surface.append(sep).append("initial=").append(obj.getInitial());
		sep = ", ";
		/** Reference: name=final_ many=false useList=false */
		if (obj.getFinal_() != null)

			internal.append('\n').append(
					obj.getFinal_().accept(
							new PrettyPrintstsVisitor(tab + '\t')));

		sep = ", ";
		/** Reference: name=transitions many=true useList=true */
		internal.append('\n').append(tab).append("\ttransitions={");
		for (Transition e : obj.getTransitions()) {
			internal.append('\n').append(
					e.accept(new PrettyPrintstsVisitor(tab + "\t\t")));
		}
		if (!obj.getTransitions().isEmpty())
			internal.append('\n').append(tab).append("\t");
		internal.append('}');
		sep = ", ";
		/** Reference: name=parameters many=true useList=true */
		internal.append('\n').append(tab).append("\tparameters={");
		for (Parameter e : obj.getParameters()) {
			internal.append('\n').append(
					e.accept(new PrettyPrintstsVisitor(tab + "\t\t")));
		}
		if (!obj.getParameters().isEmpty())
			internal.append('\n').append(tab).append("\t");
		internal.append('}');
		sep = ", ";
		/** Reference: name=invariant many=false useList=false */
		if (obj.getInvariant() != null)

			internal.append('\n').append(
					obj.getInvariant()
							.accept(new PrettyPrintvaluespecificationVisitor(
									tab + '\t')));

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
	 * Visiting a '<em><b>NamedElement</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public CharSequence visit(NamedElement obj) {
		boolean toplevel = false;
		if (surface == null) {
			surface = new StringBuilder();
			surface.append(tab).append("NamedElement<");
			toplevel = true;
			sep = "";
		}

		/** Attribute: name */
		surface.append(sep).append("name: ").append(obj.getName());
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
	 * Visiting a '<em><b>Event</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public CharSequence visit(Event obj) {
		boolean toplevel = false;
		if (surface == null) {
			surface = new StringBuilder();
			surface.append(tab).append("Event<");
			toplevel = true;
			sep = "";
		}

		/** SuperType:NamedElement */
		visit((NamedElement) obj);

		/** Attribute: sync */
		surface.append(sep).append("sync: ").append(obj.getSync());
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
	 * Visiting a '<em><b>State</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public CharSequence visit(State obj) {
		boolean toplevel = false;
		if (surface == null) {
			surface = new StringBuilder();
			surface.append(tab).append("State<");
			toplevel = true;
			sep = "";
		}

		/** SuperType:Vertex */
		visit((Vertex) obj);

		/** Attribute: name */
		surface.append(sep).append("name: ").append(obj.getName());
		sep = ", ";
		/** Reference: name=invariant many=false useList=false */
		if (obj.getInvariant() != null)

			internal.append('\n').append(
					obj.getInvariant()
							.accept(new PrettyPrintvaluespecificationVisitor(
									tab + '\t')));

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
	 * Visiting a '<em><b>Vertex</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public CharSequence visit(Vertex obj) {
		boolean toplevel = false;
		if (surface == null) {
			surface = new StringBuilder();
			surface.append(tab).append("Vertex<");
			toplevel = true;
			sep = "";
		}

		if (toplevel) {
			surface.append("> [").append(internal);
			if (internal.length() > 0)
				surface.append('\n').append(tab);
			surface.append(']');
		}
		return surface;
	}

	/**
	 * Visiting a '<em><b>FinalState</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public CharSequence visit(FinalState obj) {
		boolean toplevel = false;
		if (surface == null) {
			surface = new StringBuilder();
			surface.append(tab).append("FinalState<");
			toplevel = true;
			sep = "";
		}

		/** SuperType:Vertex */
		visit((Vertex) obj);

		if (toplevel) {
			surface.append("> [").append(internal);
			if (internal.length() > 0)
				surface.append('\n').append(tab);
			surface.append(']');
		}
		return surface;
	}

	/**
	 * Visiting a '<em><b>Parameter</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public CharSequence visit(Parameter obj) {
		boolean toplevel = false;
		if (surface == null) {
			surface = new StringBuilder();
			surface.append(tab).append("Parameter<");
			toplevel = true;
			sep = "";
		}

		/** SuperType:NamedElement */
		visit((NamedElement) obj);

		/** Reference: name=defaultValue many=false useList=false */

		internal.append('\n').append(
				obj.getDefaultValue().accept(
						new PrettyPrintvaluespecificationVisitor(tab + '\t')));

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
	 * Visiting a '<em><b>Transition</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public CharSequence visit(Transition obj) {
		boolean toplevel = false;
		if (surface == null) {
			surface = new StringBuilder();
			surface.append(tab).append("Transition<");
			toplevel = true;
			sep = "";
		}

		/** Reference: name=source many=false useList=false */
		surface.append(sep).append("source=").append(obj.getSource());
		sep = ", ";
		/** Reference: name=target many=false useList=false */
		surface.append(sep).append("target=").append(obj.getTarget());
		sep = ", ";
		/** Reference: name=guard many=false useList=false */
		if (obj.getGuard() != null)

			internal.append('\n').append(
					obj.getGuard()
							.accept(new PrettyPrintvaluespecificationVisitor(
									tab + '\t')));

		sep = ", ";
		/** Reference: name=trigger many=false useList=false */

		internal.append('\n').append(
				obj.getTrigger().accept(new PrettyPrintstsVisitor(tab + '\t')));

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
	 * Visiting a '<em><b>Trigger</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public CharSequence visit(Trigger obj) {
		boolean toplevel = false;
		if (surface == null) {
			surface = new StringBuilder();
			surface.append(tab).append("Trigger<");
			toplevel = true;
			sep = "";
		}

		/** Reference: name=events many=true useList=true */
		surface.append(sep).append("events={");
		{
			String localSep = "";
			for (Event e : obj.getEvents()) {
				surface.append(localSep).append(e);
				localSep = ", ";
			}
		}
		surface.append("}");
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
	 * Visiting a '<em><b>ParameterBinding</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CharSequence visit(ParameterBinding obj) {
		boolean toplevel = false;
		if (surface == null) {
			surface = new StringBuilder();
			surface.append(tab).append("ParameterBinding<");
			toplevel = true;
			sep = "";
		}

		/** Reference: name=formal many=false useList=false */
		surface.append(sep).append("formal=").append(obj.getFormal());
		sep = ", ";
		/** Reference: name=value many=false useList=false */

		internal.append('\n').append(
				obj.getValue().accept(
						new PrettyPrintvaluespecificationVisitor(tab + '\t')));

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
	 * Visiting a '<em><b>Chi</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public CharSequence visit(Chi obj) {
		boolean toplevel = false;
		if (surface == null) {
			surface = new StringBuilder();
			surface.append(tab).append("Chi<");
			toplevel = true;
			sep = "";
		}

		/** SuperType:IntegerExpression */
		// TODO: Should access visitor from package valuespecification
		// visit((IntegerExpression)obj);

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

	/**
	 * Visiting a '<em><b>ParameterReference</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CharSequence visit(ParameterReference obj) {
		boolean toplevel = false;
		if (surface == null) {
			surface = new StringBuilder();
			surface.append(tab).append("ParameterReference<");
			toplevel = true;
			sep = "";
		}

		/** SuperType:IntegerExpression */
		// TODO: Should access visitor from package valuespecification
		// visit((IntegerExpression)obj);

		/** Reference: name=reference many=false useList=false */
		surface.append(sep).append("reference=").append(obj.getReference());
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
	 * Visiting a '<em><b>ComposedTransitionSystem</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CharSequence visit(ComposedTransitionSystem obj) {
		boolean toplevel = false;
		if (surface == null) {
			surface = new StringBuilder();
			surface.append(tab).append("ComposedTransitionSystem<");
			toplevel = true;
			sep = "";
		}

		/** Reference: name=subsystems many=true useList=true */
		internal.append('\n').append(tab).append("\tsubsystems={");
		for (SynchronousTransitionSystem e : obj.getSubsystems()) {
			internal.append('\n').append(
					e.accept(new PrettyPrintstsVisitor(tab + "\t\t")));
		}
		if (!obj.getSubsystems().isEmpty())
			internal.append('\n').append(tab).append("\t");
		internal.append('}');
		sep = ", ";
		/** Reference: name=pBindings many=true useList=true */
		internal.append('\n').append(tab).append("\tpBindings={");
		for (ParameterBinding e : obj.getPBindings()) {
			internal.append('\n').append(
					e.accept(new PrettyPrintstsVisitor(tab + "\t\t")));
		}
		if (!obj.getPBindings().isEmpty())
			internal.append('\n').append(tab).append("\t");
		internal.append('}');
		sep = ", ";
		/** Attribute: vectors */
		surface.append(sep).append("vectors: ").append(obj.getVectors());
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
