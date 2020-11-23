package fr.aoste.sync;

import fr.aoste.sync.vspec.Comparison;
import fr.aoste.sync.vspec.Conjunction;
import fr.aoste.sync.vspec.Difference;
import fr.aoste.sync.vspec.LiteralInteger;

/**
 * A Visitor for the package '<em><b>sts</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class StsFactory {
	final static public StsFactory eINSTANCE = new StsFactory();

	private StsFactory() {
		// SINGLETON
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

}
