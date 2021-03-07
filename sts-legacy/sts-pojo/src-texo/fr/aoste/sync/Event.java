package fr.aoste.sync;

import fr.aoste.sts.IEvent;
import fr.aoste.sts.SyncVector;

/**
 * A representation of the model object '<em><b>Event</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 */
public class Event extends NamedElement implements IEvent {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	private SyncVector<?> sync = null;

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
	 * Returns the value of '<em><b>sync</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>sync</b></em>' feature
	 */
	public SyncVector<?> getSync() {
		return sync;
	}

	/**
	 * Sets the '{@link Event#getSync() <em>sync</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newSync
	 *            the new value of the '{@link Event#getSync() sync}' feature.
	 */
	public void setSync(SyncVector<?> newSync) {
		sync = newSync;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@Override
	public String toString() {
		return sync==null?getName():sync.getName();
		//return "Event" + "<name: " + getName() + ">" + "<sync: " + getSync()
//				+ ">";
	}
}
