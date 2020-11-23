package fr.aoste.sync.vspec;

/**
 * A representation of the model object '<em><b>Difference</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Difference implements IntegerExpression {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private IntegerExpression left = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private IntegerExpression right = null;

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
	 * Returns the value of '<em><b>left</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>left</b></em>' feature
	 * @generated
	 */
	public IntegerExpression getLeft() {
		return left;
	}

	/**
	 * Sets the '{@link Difference#getLeft() <em>left</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newLeft
	 *            the new value of the '{@link Difference#getLeft() left}'
	 *            feature.
	 * @generated
	 */
	public void setLeft(IntegerExpression newLeft) {
		left = newLeft;
	}

	/**
	 * Returns the value of '<em><b>right</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>right</b></em>' feature
	 * @generated
	 */
	public IntegerExpression getRight() {
		return right;
	}

	/**
	 * Sets the '{@link Difference#getRight() <em>right</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newRight
	 *            the new value of the '{@link Difference#getRight() right}'
	 *            feature.
	 * @generated
	 */
	public void setRight(IntegerExpression newRight) {
		right = newRight;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Difference";
	}
}
