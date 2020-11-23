package fr.aoste.sync.dynamic;

import fr.aoste.sync.Event;

/**
 * A representation of the model object '<em><b>EventCounter</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class EventCounter {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private int counter = 0;

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

	public Object accept(IdynamicVisitor<?> visiteur) {
		return visiteur.visit(this);
	}

	// classImplements: []

	/**
	 * Returns the value of '<em><b>counter</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>counter</b></em>' feature
	 * @generated
	 */
	public int getCounter() {
		return counter;
	}

	/**
	 * Sets the '{@link EventCounter#getCounter() <em>counter</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newCounter
	 *            the new value of the '{@link EventCounter#getCounter()
	 *            counter}' feature.
	 * @generated
	 */
	public void setCounter(int newCounter) {
		counter = newCounter;
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
	 * Sets the '{@link EventCounter#getEvent() <em>event</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newEvent
	 *            the new value of the '{@link EventCounter#getEvent() event}'
	 *            feature.
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
		return "EventCounter" + "<counter: " + getCounter() + ">";
	}
}
