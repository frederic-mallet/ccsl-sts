package fr.aoste.sync.vspec;

/**
 * A representation of the model object '<em><b>LiteralInteger</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class LiteralInteger implements IntegerExpression {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private int value = 0;

	/**
	 * An accept method to implement the Visitor pattern. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public Object accept(IvaluespecificationVisitor<?> visiteur) {
		return visiteur.visit(this);
	}

	// classImplements: [fr.aoste.sync.vspec.IntegerExpression]

	/**
	 * Returns the value of '<em><b>value</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>value</b></em>' feature
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Sets the '{@link LiteralInteger#getValue() <em>value</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newValue
	 *            the new value of the '{@link LiteralInteger#getValue() value}'
	 *            feature.
	 * @generated
	 */
	public void setValue(int newValue) {
		value = newValue;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@Override
	public String toString() {
		return value + "";
	}
}
