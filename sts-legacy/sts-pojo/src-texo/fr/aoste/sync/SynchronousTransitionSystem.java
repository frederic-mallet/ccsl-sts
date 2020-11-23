package fr.aoste.sync;

import java.util.ArrayList;
import java.util.List;

import fr.aoste.sync.vspec.BooleanExpression;

/**
 * A representation of the model object '
 * <em><b>SynchronousTransitionSystem</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class SynchronousTransitionSystem extends NamedElement {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<Event> events = new ArrayList<Event>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<State> states = new ArrayList<State>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private State initial = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private FinalState final_ = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<Transition> transitions = new ArrayList<Transition>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<Parameter> parameters = new ArrayList<Parameter>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private BooleanExpression invariant = null;

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
	 * Sets the '{@link SynchronousTransitionSystem#getEvents() <em>events</em>}
	 * ' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newEvents
	 *            the new value of the '
	 *            {@link SynchronousTransitionSystem#getEvents() events}'
	 *            feature.
	 * @generated
	 */
	public void setEvents(List<Event> newEvents) {
		events = newEvents;
	}

	/**
	 * Returns the value of '<em><b>states</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>states</b></em>' feature
	 * @generated
	 */
	public List<State> getStates() {
		return states;
	}

	/**
	 * Adds to the <em>states</em> feature.
	 * 
	 * @param statesValue
	 *            value to add
	 * 
	 * @generated
	 */
	public boolean addToStates(State statesValue) {
		if (!states.contains(statesValue)) {
			states.add(statesValue);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Removes from the <em>states</em> feature.
	 * 
	 * @param statesValue
	 *            value to remove
	 * 
	 * @generated
	 */
	public boolean removeFromStates(State statesValue) {
		if (states.contains(statesValue)) {
			states.remove(statesValue);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Clears the <em>states</em> feature.
	 * 
	 * @generated
	 */
	public void clearStates() {
		while (!states.isEmpty()) {
			removeFromStates(states.iterator().next());
		}
	}

	/**
	 * Sets the '{@link SynchronousTransitionSystem#getStates() <em>states</em>}
	 * ' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newStates
	 *            the new value of the '
	 *            {@link SynchronousTransitionSystem#getStates() states}'
	 *            feature.
	 * @generated
	 */
	public void setStates(List<State> newStates) {
		states = newStates;
	}

	/**
	 * Returns the value of '<em><b>initial</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>initial</b></em>' feature
	 * @generated
	 */
	public State getInitial() {
		return initial;
	}

	/**
	 * Sets the '{@link SynchronousTransitionSystem#getInitial()
	 * <em>initial</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newInitial
	 *            the new value of the '
	 *            {@link SynchronousTransitionSystem#getInitial() initial}'
	 *            feature.
	 * @generated
	 */
	public void setInitial(State newInitial) {
		initial = newInitial;
	}

	/**
	 * Returns the value of '<em><b>final</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>final</b></em>' feature
	 * @generated
	 */
	public FinalState getFinal_() {
		return final_;
	}

	/**
	 * Sets the '{@link SynchronousTransitionSystem#getFinal_() <em>final</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFinal_
	 *            the new value of the '
	 *            {@link SynchronousTransitionSystem#getFinal_() final}'
	 *            feature.
	 * @generated
	 */
	public void setFinal_(FinalState newFinal_) {
		final_ = newFinal_;
	}

	/**
	 * Returns the value of '<em><b>transitions</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>transitions</b></em>' feature
	 * @generated
	 */
	public List<Transition> getTransitions() {
		return transitions;
	}

	/**
	 * Adds to the <em>transitions</em> feature.
	 * 
	 * @param transitionsValue
	 *            value to add
	 * 
	 * @generated
	 */
	public boolean addToTransitions(Transition transitionsValue) {
		if (!transitions.contains(transitionsValue)) {
			transitions.add(transitionsValue);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Removes from the <em>transitions</em> feature.
	 * 
	 * @param transitionsValue
	 *            value to remove
	 * 
	 * @generated
	 */
	public boolean removeFromTransitions(Transition transitionsValue) {
		if (transitions.contains(transitionsValue)) {
			transitions.remove(transitionsValue);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Clears the <em>transitions</em> feature.
	 * 
	 * @generated
	 */
	public void clearTransitions() {
		while (!transitions.isEmpty()) {
			removeFromTransitions(transitions.iterator().next());
		}
	}

	/**
	 * Sets the '{@link SynchronousTransitionSystem#getTransitions()
	 * <em>transitions</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTransitions
	 *            the new value of the '
	 *            {@link SynchronousTransitionSystem#getTransitions()
	 *            transitions}' feature.
	 * @generated
	 */
	public void setTransitions(List<Transition> newTransitions) {
		transitions = newTransitions;
	}

	/**
	 * Returns the value of '<em><b>parameters</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>parameters</b></em>' feature
	 * @generated
	 */
	public List<Parameter> getParameters() {
		return parameters;
	}

	/**
	 * Adds to the <em>parameters</em> feature.
	 * 
	 * @param parametersValue
	 *            value to add
	 * 
	 * @generated
	 */
	public boolean addToParameters(Parameter parametersValue) {
		if (!parameters.contains(parametersValue)) {
			parameters.add(parametersValue);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Removes from the <em>parameters</em> feature.
	 * 
	 * @param parametersValue
	 *            value to remove
	 * 
	 * @generated
	 */
	public boolean removeFromParameters(Parameter parametersValue) {
		if (parameters.contains(parametersValue)) {
			parameters.remove(parametersValue);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Clears the <em>parameters</em> feature.
	 * 
	 * @generated
	 */
	public void clearParameters() {
		while (!parameters.isEmpty()) {
			removeFromParameters(parameters.iterator().next());
		}
	}

	/**
	 * Sets the '{@link SynchronousTransitionSystem#getParameters()
	 * <em>parameters</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newParameters
	 *            the new value of the '
	 *            {@link SynchronousTransitionSystem#getParameters() parameters}
	 *            ' feature.
	 * @generated
	 */
	public void setParameters(List<Parameter> newParameters) {
		parameters = newParameters;
	}

	/**
	 * Returns the value of '<em><b>invariant</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>invariant</b></em>' feature
	 * @generated
	 */
	public BooleanExpression getInvariant() {
		return invariant;
	}

	/**
	 * Sets the '{@link SynchronousTransitionSystem#getInvariant()
	 * <em>invariant</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newInvariant
	 *            the new value of the '
	 *            {@link SynchronousTransitionSystem#getInvariant() invariant}'
	 *            feature.
	 * @generated
	 */
	public void setInvariant(BooleanExpression newInvariant) {
		invariant = newInvariant;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "SynchronousTransitionSystem" + "<name: " + getName() + ">";
	}
}
