package fr.aoste.sync;

import fr.aoste.sync.vspec.ValueSpecification;

/**
 * A representation of the model object '<em><b>ParameterBinding</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ParameterBinding {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Parameter formal = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private ValueSpecification value = null;

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
	 * Returns the value of '<em><b>formal</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>formal</b></em>' feature
	 * @generated
	 */
	public Parameter getFormal() {
		return formal;
	}

	/**
	 * Sets the '{@link ParameterBinding#getFormal() <em>formal</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFormal
	 *            the new value of the '{@link ParameterBinding#getFormal()
	 *            formal}' feature.
	 * @generated
	 */
	public void setFormal(Parameter newFormal) {
		formal = newFormal;
	}

	/**
	 * Returns the value of '<em><b>value</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>value</b></em>' feature
	 * @generated
	 */
	public ValueSpecification getValue() {
		return value;
	}

	/**
	 * Sets the '{@link ParameterBinding#getValue() <em>value</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newValue
	 *            the new value of the '{@link ParameterBinding#getValue()
	 *            value}' feature.
	 * @generated
	 */
	public void setValue(ValueSpecification newValue) {
		value = newValue;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "ParameterBinding";
	}
}
