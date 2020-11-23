package fr.aoste.sync;

import fr.aoste.sync.vspec.IntegerExpression;
import fr.aoste.sync.vspec.IvaluespecificationVisitor;

/**
 * A representation of the model object '<em><b>ParameterReference</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ParameterReference implements IntegerExpression {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Parameter reference = null;

	/**
	 * An accept method to implement the Visitor pattern. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public Object accept(IstsVisitor<?> visiteur) {
		return visiteur.visit(this);
	}

	// classImplements: [fr.aoste.sync.vspec.IntegerExpression]

	/**
	 * An accept method to implement the Visitor pattern for package
	 * valuespecification <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public Object accept(IvaluespecificationVisitor<?> visiteur) {
		return visiteur.visit(this);
	}

	/**
	 * Returns the value of '<em><b>reference</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>reference</b></em>' feature
	 * @generated
	 */
	public Parameter getReference() {
		return reference;
	}

	/**
	 * Sets the '{@link ParameterReference#getReference() <em>reference</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newReference
	 *            the new value of the '
	 *            {@link ParameterReference#getReference() reference}' feature.
	 * @generated
	 */
	public void setReference(Parameter newReference) {
		reference = newReference;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "ParameterReference";
	}
}
