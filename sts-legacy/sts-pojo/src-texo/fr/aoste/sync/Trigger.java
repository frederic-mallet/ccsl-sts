package fr.aoste.sync;

import java.util.ArrayList;
import java.util.List;

/**
 * A representation of the model object '<em><b>Trigger</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Trigger {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<Event> events = new ArrayList<Event>();

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
	 * Returns the value of '<em><b>events</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>events</b></em>' feature
	 * @generated
	 */
	public List<Event> getEvents() {
		return events;
	}

	/**
	 * Adds to the <em>events</em> feature.
	 * 
	 * @param eventsValue
	 *            value to add
	 * 
	 * @generated
	 */
	public boolean addToEvents(Event eventsValue) {
		if (!events.contains(eventsValue)) {
			events.add(eventsValue);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Removes from the <em>events</em> feature.
	 * 
	 * @param eventsValue
	 *            value to remove
	 * 
	 * @generated
	 */
	public boolean removeFromEvents(Event eventsValue) {
		if (events.contains(eventsValue)) {
			events.remove(eventsValue);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Clears the <em>events</em> feature.
	 * 
	 * @generated
	 */
	public void clearEvents() {
		while (!events.isEmpty()) {
			removeFromEvents(events.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Trigger#getEvents() <em>events</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newEvents
	 *            the new value of the '{@link Trigger#getEvents() events}'
	 *            feature.
	 * @generated
	 */
	public void setEvents(List<Event> newEvents) {
		events = newEvents;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Trigger";
	}
}
