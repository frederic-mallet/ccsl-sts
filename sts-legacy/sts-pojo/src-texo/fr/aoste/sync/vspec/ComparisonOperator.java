package fr.aoste.sync.vspec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '
 * <em><b>ComparisonOperator</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public enum ComparisonOperator {

	/**
	 * The enum: EQUALS <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	EQUALS(0, "equals", "equals", "=") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isEquals() {
			return true;
		}
	},
	/**
	 * The enum: GREATERTHAN <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	GREATERTHAN(1, "greaterThan", "greaterThan", ">") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isGreaterThan() {
			return true;
		}
	},
	/**
	 * The enum: LESSTHAN <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	LESSTHAN(2, "lessThan", "lessThan", "<") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isLessThan() {
			return true;
		}
	},
	/**
	 * The enum: GREATEROREQUAL <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	GREATEROREQUAL(3, "greaterOrEqual", "greaterOrEqual", ">=") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isGreaterOrEqual() {
			return true;
		}
	},
	/**
	 * The enum: LESSOREQUAL <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	LESSOREQUAL(4, "lessOrEqual", "lessOrEqual", "<=") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isLessOrEqual() {
			return true;
		}
	};

	/**
	 * An array of all the '<em><b>ComparisonOperator</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final ComparisonOperator[] VALUES_ARRAY = new ComparisonOperator[] {
			EQUALS, GREATERTHAN, LESSTHAN, GREATEROREQUAL, LESSOREQUAL };

	/**
	 * A public read-only list of all the '<em><b>ComparisonOperator</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<ComparisonOperator> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ComparisonOperator</b></em>' literal with the
	 * specified literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param literal
	 *            the literal to use to get the enum instance
	 * @return the ComparisonOperator, the literal enum class
	 * @generated
	 */
	public static ComparisonOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComparisonOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ComparisonOperator</b></em>' literal with the
	 * specified name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param name
	 *            the name to use to get the enum instance
	 * @return the ComparisonOperator, the literal enum class
	 * @generated
	 */
	public static ComparisonOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComparisonOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ComparisonOperator</b></em>' literal with the
	 * specified integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the value to use to get the enum instance
	 * @return the ComparisonOperator, the literal enum
	 * @generated
	 */
	public static ComparisonOperator get(int value) {
		for (ComparisonOperator enumInstance : VALUES_ARRAY) {
			if (enumInstance.getValue() == value) {
				return enumInstance;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	private final String display;
	
	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private ComparisonOperator(int value, String name, String literal, String display) {
		this.value = value;
		this.name = name;
		this.literal = literal;
		this.display = display;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isEquals() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isGreaterThan() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isLessThan() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isGreaterOrEqual() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isLessOrEqual() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the name
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the literal of this enum instance
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the literal value of the enumerator, which is its string
	 *         representation.
	 * @generated
	 */
	@Override
	public String toString() {
		return display;
	}
}
