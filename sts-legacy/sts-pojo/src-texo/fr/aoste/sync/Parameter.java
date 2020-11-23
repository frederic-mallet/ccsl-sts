package fr.aoste.sync;

import fr.aoste.sync.vspec.ValueSpecification;

/**
 * A representation of the model object '<em><b>Parameter</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Parameter extends NamedElement {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private ValueSpecification defaultValue = null;

	/**
	 * An accept method to implement the Visitor pattern. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public Object accept(IstsVisitor<?> visiteur) {
		return visiteur.visit(this);
	}

	// classImplements: []

	/**
	 * Returns the value of '<em><b>defaultValue</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>defaultValue</b></em>' feature
	 * @generated
	 */
	public ValueSpecification getDefaultValue() {
		return defaultValue;
	}

	/**
	 * Sets the '{@link Parameter#getDefaultValue() <em>defaultValue</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newDefaultValue
	 *            the new value of the '{@link Parameter#getDefaultValue()
	 *            defaultValue}' feature.
	 * @generated
	 */
	public void setDefaultValue(ValueSpecification newDefaultValue) {
		defaultValue = newDefaultValue;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Parameter" + "<name: " + getName() + ">";
	}
}
