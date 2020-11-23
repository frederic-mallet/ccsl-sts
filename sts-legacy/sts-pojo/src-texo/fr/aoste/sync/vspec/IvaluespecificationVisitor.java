package fr.aoste.sync.vspec;

/**
 * A Visitor for the package '<em><b>valuespecification</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */

public interface IvaluespecificationVisitor<T> {
	/**
	 * Visiting a '<em><b>BooleanExpression</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public T visit(BooleanExpression e);

	/**
	 * Visiting a '<em><b>ValueSpecification</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public T visit(ValueSpecification e);

	/**
	 * Visiting a '<em><b>IntegerExpression</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public T visit(IntegerExpression e);

	/**
	 * Visiting a '<em><b>LiteralInteger</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public T visit(LiteralInteger e);

	/**
	 * Visiting a '<em><b>Difference</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public T visit(Difference e);

	/**
	 * Visiting a '<em><b>Conjunction</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public T visit(Conjunction e);

	/**
	 * Visiting a '<em><b>Comparison</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public T visit(Comparison e);

	/**
	 * Visiting a '<em><b>ComparisonOperator</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public T visit(ComparisonOperator e);
}
