package fr.aoste.sync;

import fr.aoste.sync.vspec.IntegerExpression;
import fr.aoste.sync.vspec.IvaluespecificationVisitor;

/**
 * A representation of the model object '<em><b>Chi</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Chi implements IntegerExpression {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Event event = null;

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
	 * Returns the value of '<em><b>event</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>event</b></em>' feature
	 * @generated
	 */
	public Event getEvent() {
		return event;
	}

	/**
	 * Sets the '{@link Chi#getEvent() <em>event</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newEvent
	 *            the new value of the '{@link Chi#getEvent() event}' feature.
	 * @generated
	 */
	public void setEvent(Event newEvent) {
		event = newEvent;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "\u03c7_" + event;
	}
}
