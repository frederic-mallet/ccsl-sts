package fr.aoste.sync.vspec;

import java.util.ArrayList;
import java.util.List;

/**
 * A representation of the model object '<em><b>Conjunction</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Conjunction implements BooleanExpression {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<BooleanExpression> operands = new ArrayList<BooleanExpression>();

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
	 * Returns the value of '<em><b>operands</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>operands</b></em>' feature
	 * @generated
	 */
	public List<BooleanExpression> getOperands() {
		return operands;
	}

	/**
	 * Adds to the <em>operands</em> feature.
	 * 
	 * @param operandsValue
	 *            value to add
	 * 
	 * @generated
	 */
	public boolean addToOperands(BooleanExpression operandsValue) {
		if (!operands.contains(operandsValue)) {
			operands.add(operandsValue);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Removes from the <em>operands</em> feature.
	 * 
	 * @param operandsValue
	 *            value to remove
	 * 
	 * @generated
	 */
	public boolean removeFromOperands(BooleanExpression operandsValue) {
		if (operands.contains(operandsValue)) {
			operands.remove(operandsValue);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Clears the <em>operands</em> feature.
	 * 
	 * @generated
	 */
	public void clearOperands() {
		while (!operands.isEmpty()) {
			removeFromOperands(operands.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Conjunction#getOperands() <em>operands</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newOperands
	 *            the new value of the '{@link Conjunction#getOperands()
	 *            operands}' feature.
	 * @generated
	 */
	public void setOperands(List<BooleanExpression> newOperands) {
		operands = newOperands;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		String[] op = new String[operands.size()];
		for (int i = 0; i < op.length; i++) op[i] = operands.get(i).toString();
		return String.join(" and ", op);
	}
}
