package fr.aoste.sync.vspec;

import fr.aoste.sync.Chi;
import fr.aoste.sync.ComposedTransitionSystem;
import fr.aoste.sync.Event;
import fr.aoste.sync.FinalState;
import fr.aoste.sync.Parameter;
import fr.aoste.sync.ParameterBinding;
import fr.aoste.sync.ParameterReference;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.Transition;
import fr.aoste.sync.Trigger;

/**
 * A Visitor for the package '<em><b>valuespecification</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ValuespecificationFactory {
	final static public ValuespecificationFactory eINSTANCE = new ValuespecificationFactory();

	private ValuespecificationFactory() {
		// SINGLETON
	}

	/**
	 * create an instance for '<em><b>LiteralInteger</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LiteralInteger createLiteralInteger() {
		return new LiteralInteger();
	}

	/**
	 * create an instance for '<em><b>Difference</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Difference createDifference() {
		return new Difference();
	}

	/**
	 * create an instance for '<em><b>Conjunction</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Conjunction createConjunction() {
		return new Conjunction();
	}

	/**
	 * create an instance for '<em><b>Comparison</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Comparison createComparison() {
		return new Comparison();
	}

	/**
	 * create an instance for '<em><b>SynchronousTransitionSystem</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SynchronousTransitionSystem createSynchronousTransitionSystem() {
		return new SynchronousTransitionSystem();
	}

	/**
	 * create an instance for '<em><b>Event</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Event createEvent() {
		return new Event();
	}

	/**
	 * create an instance for '<em><b>State</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public State createState() {
		return new State();
	}

	/**
	 * create an instance for '<em><b>FinalState</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FinalState createFinalState() {
		return new FinalState();
	}

	/**
	 * create an instance for '<em><b>Transition</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Transition createTransition() {
		return new Transition();
	}

	/**
	 * create an instance for '<em><b>Parameter</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Parameter createParameter() {
		return new Parameter();
	}

	/**
	 * create an instance for '<em><b>Trigger</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Trigger createTrigger() {
		return new Trigger();
	}

	/**
	 * create an instance for '<em><b>ParameterBinding</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ParameterBinding createParameterBinding() {
		return new ParameterBinding();
	}

	/**
	 * create an instance for '<em><b>Chi</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Chi createChi() {
		return new Chi();
	}

	/**
	 * create an instance for '<em><b>ParameterReference</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ParameterReference createParameterReference() {
		return new ParameterReference();
	}

	/**
	 * create an instance for '<em><b>ComposedTransitionSystem</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComposedTransitionSystem createComposedTransitionSystem() {
		return new ComposedTransitionSystem();
	}

}
