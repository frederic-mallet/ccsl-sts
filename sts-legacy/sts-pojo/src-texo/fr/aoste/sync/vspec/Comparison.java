package fr.aoste.sync.vspec;

/**
 * A representation of the model object '<em><b>Comparison</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Comparison implements BooleanExpression {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private ComparisonOperator operator = null;

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

	// classImplements: [fr.aoste.sync.vspec.BooleanExpression]

	/**
	 * Returns the value of '<em><b>operator</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>operator</b></em>' feature
	 * @generated
	 */
	public ComparisonOperator getOperator() {
		return operator;
	}

	/**
	 * Sets the '{@link Comparison#getOperator() <em>operator</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newOperator
	 *            the new value of the '{@link Comparison#getOperator()
	 *            operator}' feature.
	 * @generated
	 */
	public void setOperator(ComparisonOperator newOperator) {
		operator = newOperator;
	}

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
	 * Sets the '{@link Comparison#getLeft() <em>left</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newLeft
	 *            the new value of the '{@link Comparison#getLeft() left}'
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
	 * Sets the '{@link Comparison#getRight() <em>right</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newRight
	 *            the new value of the '{@link Comparison#getRight() right}'
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
		return "Comparison" + "<operator: " + getOperator() + ">";
	}
}
