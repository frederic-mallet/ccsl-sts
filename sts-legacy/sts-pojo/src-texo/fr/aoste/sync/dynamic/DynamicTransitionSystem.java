package fr.aoste.sync.dynamic;

import java.util.ArrayList;
import java.util.List;

import fr.aoste.sync.ComposedTransitionSystem;
import fr.aoste.sync.Vertex;

/**
 * A representation of the model object '<em><b>DynamicTransitionSystem</b></em>
 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class DynamicTransitionSystem {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<Vertex> current = new ArrayList<Vertex>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<EventCounter> counters = new ArrayList<EventCounter>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private ComposedTransitionSystem static_ = null;

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
	 * Returns the value of '<em><b>current</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>current</b></em>' feature
	 * @generated
	 */
	public List<Vertex> getCurrent() {
		return current;
	}

	/**
	 * Adds to the <em>current</em> feature.
	 * 
	 * @param currentValue
	 *            value to add
	 * 
	 * @generated
	 */
	public boolean addToCurrent(Vertex currentValue) {
		if (!current.contains(currentValue)) {
			current.add(currentValue);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Removes from the <em>current</em> feature.
	 * 
	 * @param currentValue
	 *            value to remove
	 * 
	 * @generated
	 */
	public boolean removeFromCurrent(Vertex currentValue) {
		if (current.contains(currentValue)) {
			current.remove(currentValue);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Clears the <em>current</em> feature.
	 * 
	 * @generated
	 */
	public void clearCurrent() {
		while (!current.isEmpty()) {
			removeFromCurrent(current.iterator().next());
		}
	}

	/**
	 * Sets the '{@link DynamicTransitionSystem#getCurrent() <em>current</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newCurrent
	 *            the new value of the '
	 *            {@link DynamicTransitionSystem#getCurrent() current}' feature.
	 * @generated
	 */
	public void setCurrent(List<Vertex> newCurrent) {
		current = newCurrent;
	}

	/**
	 * Returns the value of '<em><b>counters</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>counters</b></em>' feature
	 * @generated
	 */
	public List<EventCounter> getCounters() {
		return counters;
	}

	/**
	 * Adds to the <em>counters</em> feature.
	 * 
	 * @param countersValue
	 *            value to add
	 * 
	 * @generated
	 */
	public boolean addToCounters(EventCounter countersValue) {
		if (!counters.contains(countersValue)) {
			counters.add(countersValue);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Removes from the <em>counters</em> feature.
	 * 
	 * @param countersValue
	 *            value to remove
	 * 
	 * @generated
	 */
	public boolean removeFromCounters(EventCounter countersValue) {
		if (counters.contains(countersValue)) {
			counters.remove(countersValue);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Clears the <em>counters</em> feature.
	 * 
	 * @generated
	 */
	public void clearCounters() {
		while (!counters.isEmpty()) {
			removeFromCounters(counters.iterator().next());
		}
	}

	/**
	 * Sets the '{@link DynamicTransitionSystem#getCounters() <em>counters</em>}
	 * ' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newCounters
	 *            the new value of the '
	 *            {@link DynamicTransitionSystem#getCounters() counters}'
	 *            feature.
	 * @generated
	 */
	public void setCounters(List<EventCounter> newCounters) {
		counters = newCounters;
	}

	/**
	 * Returns the value of '<em><b>static</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>static</b></em>' feature
	 * @generated
	 */
	public ComposedTransitionSystem getStatic_() {
		return static_;
	}

	/**
	 * Sets the '{@link DynamicTransitionSystem#getStatic_() <em>static</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newStatic_
	 *            the new value of the '
	 *            {@link DynamicTransitionSystem#getStatic_() static}' feature.
	 * @generated
	 */
	public void setStatic_(ComposedTransitionSystem newStatic_) {
		static_ = newStatic_;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "DynamicTransitionSystem";
	}
}
