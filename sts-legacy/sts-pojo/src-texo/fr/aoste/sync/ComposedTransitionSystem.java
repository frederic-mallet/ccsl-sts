package fr.aoste.sync;

import java.util.ArrayList;
import java.util.List;

import fr.aoste.sts.IEvent;
import fr.aoste.sts.SyncVector;

/**
 * A representation of the model object '
 * <em><b>ComposedTransitionSystem</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class ComposedTransitionSystem {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<SynchronousTransitionSystem> subsystems = new ArrayList<SynchronousTransitionSystem>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<ParameterBinding> pBindings = new ArrayList<ParameterBinding>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<SyncVector<? extends IEvent>> vectors = new ArrayList<>();

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
	 * Returns the value of '<em><b>subsystems</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>subsystems</b></em>' feature
	 * @generated
	 */
	public List<SynchronousTransitionSystem> getSubsystems() {
		return subsystems;
	}

	/**
	 * Adds to the <em>subsystems</em> feature.
	 * 
	 * @param subsystemsValue
	 *            value to add
	 * 
	 * @generated
	 */
	public boolean addToSubsystems(SynchronousTransitionSystem subsystemsValue) {
		if (!subsystems.contains(subsystemsValue)) {
			subsystems.add(subsystemsValue);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Removes from the <em>subsystems</em> feature.
	 * 
	 * @param subsystemsValue
	 *            value to remove
	 * 
	 * @generated
	 */
	public boolean removeFromSubsystems(
			SynchronousTransitionSystem subsystemsValue) {
		if (subsystems.contains(subsystemsValue)) {
			subsystems.remove(subsystemsValue);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Clears the <em>subsystems</em> feature.
	 * 
	 * @generated
	 */
	public void clearSubsystems() {
		while (!subsystems.isEmpty()) {
			removeFromSubsystems(subsystems.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ComposedTransitionSystem#getSubsystems()
	 * <em>subsystems</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newSubsystems
	 *            the new value of the '
	 *            {@link ComposedTransitionSystem#getSubsystems() subsystems}'
	 *            feature.
	 * @generated
	 */
	public void setSubsystems(List<SynchronousTransitionSystem> newSubsystems) {
		subsystems = newSubsystems;
	}

	/**
	 * Returns the value of '<em><b>pBindings</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>pBindings</b></em>' feature
	 * @generated
	 */
	public List<ParameterBinding> getPBindings() {
		return pBindings;
	}

	/**
	 * Adds to the <em>pBindings</em> feature.
	 * 
	 * @param pBindingsValue
	 *            value to add
	 * 
	 * @generated
	 */
	public boolean addToPBindings(ParameterBinding pBindingsValue) {
		if (!pBindings.contains(pBindingsValue)) {
			pBindings.add(pBindingsValue);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Removes from the <em>pBindings</em> feature.
	 * 
	 * @param pBindingsValue
	 *            value to remove
	 * 
	 * @generated
	 */
	public boolean removeFromPBindings(ParameterBinding pBindingsValue) {
		if (pBindings.contains(pBindingsValue)) {
			pBindings.remove(pBindingsValue);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Clears the <em>pBindings</em> feature.
	 * 
	 * @generated
	 */
	public void clearPBindings() {
		while (!pBindings.isEmpty()) {
			removeFromPBindings(pBindings.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ComposedTransitionSystem#getPBindings()
	 * <em>pBindings</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newPBindings
	 *            the new value of the '
	 *            {@link ComposedTransitionSystem#getPBindings() pBindings}'
	 *            feature.
	 * @generated
	 */
	public void setPBindings(List<ParameterBinding> newPBindings) {
		pBindings = newPBindings;
	}

	/**
	 * Returns the value of '<em><b>vectors</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>vectors</b></em>' feature
	 * @generated
	 */
	public List<SyncVector<? extends IEvent>> getVectors() {
		return vectors;
	}

	/**
	 * Sets the '{@link ComposedTransitionSystem#getVectors() <em>vectors</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newVectors
	 *            the new value of the '
	 *            {@link ComposedTransitionSystem#getVectors() vectors}'
	 *            feature.
	 * @generated
	 */
	public void setVectors(List<SyncVector<? extends IEvent>> newVectors) {
		vectors = newVectors;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "ComposedTransitionSystem";
	}
}
