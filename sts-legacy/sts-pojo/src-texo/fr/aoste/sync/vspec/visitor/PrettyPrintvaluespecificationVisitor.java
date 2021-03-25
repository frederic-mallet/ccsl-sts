package fr.aoste.sync.vspec.visitor;

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
 * A Default Pretty Print Visitor for the package '
 * <em><b>valuespecification</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class PrettyPrintvaluespecificationVisitor implements
		IvaluespecificationVisitor<CharSequence> {
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
	public PrettyPrintvaluespecificationVisitor() {
		this("");
	}

	/**
	 * Should be private, but is public to be used when there are multiple
	 * package for the same model
	 * 
	 * @generated
	 */
	public PrettyPrintvaluespecificationVisitor(String tab) {
		this.tab = tab;
	}

	/**
	 * Visiting a '<em><b>BooleanExpression</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CharSequence visit(BooleanExpression obj) {
		boolean toplevel = false;
		if (surface == null) {
			surface = new StringBuilder();
			surface.append(tab).append("BooleanExpression<");
			toplevel = true;
			sep = "";
		}

		/** SuperType:ValueSpecification */
		visit((ValueSpecification) obj);

		if (toplevel) {
			surface.append("> [").append(internal);
			if (internal.length() > 0)
				surface.append('\n').append(tab);
			surface.append(']');
		}
		return surface;
	}

	/**
	 * Visiting a '<em><b>ValueSpecification</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CharSequence visit(ValueSpecification obj) {
		boolean toplevel = false;
		if (surface == null) {
			surface = new StringBuilder();
			surface.append(tab).append("ValueSpecification<");
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
	 * Visiting a '<em><b>IntegerExpression</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CharSequence visit(IntegerExpression obj) {
		boolean toplevel = false;
		if (surface == null) {
			surface = new StringBuilder();
			surface.append(tab).append("IntegerExpression<");
			toplevel = true;
			sep = "";
		}

		/** SuperType:ValueSpecification */
		visit((ValueSpecification) obj);

		if (toplevel) {
			surface.append("> [").append(internal);
			if (internal.length() > 0)
				surface.append('\n').append(tab);
			surface.append(']');
		}
		return surface;
	}

	/**
	 * Visiting a '<em><b>LiteralInteger</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public CharSequence visit(LiteralInteger obj) {
		boolean toplevel = false;
		if (surface == null) {
			surface = new StringBuilder();
			surface.append(tab).append("LiteralInteger<");
			toplevel = true;
			sep = "";
		}

		/** SuperType:IntegerExpression */
		visit((IntegerExpression) obj);

		/** Attribute: value */
		surface.append(sep).append("value: ").append(obj.getValue());
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
	 * Visiting a '<em><b>Difference</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public CharSequence visit(Difference obj) {
		boolean toplevel = false;
		if (surface == null) {
			surface = new StringBuilder();
			surface.append(tab).append("Difference<");
			toplevel = true;
			sep = "";
		}

		/** SuperType:IntegerExpression */
		visit((IntegerExpression) obj);

		/** Reference: name=left many=false useList=false */

		internal.append('\n').append(
				obj.getLeft().accept(
						new PrettyPrintvaluespecificationVisitor(tab + '\t')));

		sep = ", ";
		/** Reference: name=right many=false useList=false */

		internal.append('\n').append(
				obj.getRight().accept(
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
	 * Visiting a '<em><b>Conjunction</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public CharSequence visit(Conjunction obj) {
		boolean toplevel = false;
		if (surface == null) {
			surface = new StringBuilder();
			surface.append(tab).append("Conjunction<");
			toplevel = true;
			sep = "";
		}

		/** SuperType:BooleanExpression */
		visit((BooleanExpression) obj);

		/** Reference: name=operands many=true useList=true */
		internal.append('\n').append(tab).append("\toperands={");
		for (BooleanExpression e : obj.getOperands()) {
			internal.append('\n').append(
					e.accept(new PrettyPrintvaluespecificationVisitor(tab
							+ "\t\t")));
		}
		if (!obj.getOperands().isEmpty())
			internal.append('\n').append(tab).append("\t");
		internal.append('}');
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
	 * Visiting a '<em><b>Comparison</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public CharSequence visit(Comparison obj) {
		boolean toplevel = false;
		if (surface == null) {
			surface = new StringBuilder();
			surface.append(tab).append("Comparison<");
			toplevel = true;
			sep = "";
		}

		/** SuperType:BooleanExpression */
		visit((BooleanExpression) obj);

		/** Attribute: operator */
		surface.append(sep).append("operator: ").append(obj.getOperator());
		sep = ", ";
		/** Reference: name=left many=false useList=false */

		internal.append('\n').append(
				obj.getLeft().accept(
						new PrettyPrintvaluespecificationVisitor(tab + '\t')));

		sep = ", ";
		/** Reference: name=right many=false useList=false */

		internal.append('\n').append(
				obj.getRight().accept(
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
	 * Visiting a '<em><b>fr.aoste.sync.vspec.ComparisonOperator</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CharSequence visit(ComparisonOperator obj) {
		return obj.toString();
	}

	@Override
	public CharSequence visit(NotExpression e) {
		boolean toplevel = false;
		if (surface == null) {
			surface = new StringBuilder();
			surface.append(tab).append("Not<");
			toplevel = true;
			sep = "";
		}

		/** SuperType:BooleanExpression */
		visit((BooleanExpression) e);

		/** Reference: name=operands many=true useList=true */
		internal.append('\n').append(tab).append("\toperand={");
		BooleanExpression be = e.getOperand();
		internal.append('\n').append(
				be.accept(new PrettyPrintvaluespecificationVisitor(tab
						+ "\t\t")));

		if (toplevel) {
			surface.append("> [").append(internal);
			if (internal.length() > 0)
				surface.append('\n').append(tab);
			surface.append(']');
		}
		return surface;
	}
}
