package fr.aoste.sync;

import fr.aoste.sync.vspec.BooleanExpression;

/**
 * A representation of the model object '<em><b>Transition</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Transition {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Vertex target = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private State source = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private BooleanExpression guard = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Trigger trigger = null;

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
	 * Returns the value of '<em><b>target</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>target</b></em>' feature
	 * @generated
	 */
	public Vertex getTarget() {
		return target;
	}

	/**
	 * Sets the '{@link Transition#getTarget() <em>target</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTarget
	 *            the new value of the '{@link Transition#getTarget() target}'
	 *            feature.
	 * @generated
	 */
	public void setTarget(Vertex newTarget) {
		target = newTarget;
	}

	/**
	 * Returns the value of '<em><b>source</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>source</b></em>' feature
	 * @generated
	 */
	public State getSource() {
		return source;
	}

	/**
	 * Sets the '{@link Transition#getSource() <em>source</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newSource
	 *            the new value of the '{@link Transition#getSource() source}'
	 *            feature.
	 * @generated
	 */
	public void setSource(State newSource) {
		source = newSource;
	}

	/**
	 * Returns the value of '<em><b>guard</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>guard</b></em>' feature
	 * @generated
	 */
	public BooleanExpression getGuard() {
		return guard;
	}

	/**
	 * Sets the '{@link Transition#getGuard() <em>guard</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newGuard
	 *            the new value of the '{@link Transition#getGuard() guard}'
	 *            feature.
	 * @generated
	 */
	public void setGuard(BooleanExpression newGuard) {
		guard = newGuard;
	}

	/**
	 * Returns the value of '<em><b>trigger</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>trigger</b></em>' feature
	 * @generated
	 */
	public Trigger getTrigger() {
		return trigger;
	}

	/**
	 * Sets the '{@link Transition#getTrigger() <em>trigger</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTrigger
	 *            the new value of the '{@link Transition#getTrigger() trigger}'
	 *            feature.
	 * @generated
	 */
	public void setTrigger(Trigger newTrigger) {
		trigger = newTrigger;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Transition";
	}
}
