package fr.aoste.sync.linearprogramming;

import fr.aoste.sync.compose.CTSHelper;
import fr.aoste.sync.util.ValueSpecificationEvaluator;
import fr.aoste.sync.vspec.BooleanExpression;

public abstract class AInvariantHelper {
	protected ValueSpecificationEvaluator ev;

	/**
	 * @param ctsHelper helper to be used to evaluate ParameterBindings
	 * @throws IloException 
	 */
	final public void setCTSHelper(CTSHelper ctsHelper) {
		assert(ctsHelper != null);
		this.ev = new ValueSpecificationEvaluator(ctsHelper);
	}

	// make a new clean instance of the helper
	public abstract AInvariantHelper newHelper();
	
	/**
	 * @return false iif a ILP solver is connected
	 */
	public boolean cannotSimplifyGuards() { return true; }
	
	/**
	 * 
	 * @return whether or not there is a solution to the set of accepted guards
	 */
	public abstract boolean hasNoSolution();

	/**
	 * 
	 * @param g guard to test with the current system of inequalities
	 * @return 0 iif the guard is useful, <0 if the guard is not compatible (always false), >0 if the guard is always true (useless)
	 */
	public abstract int testGuard(BooleanExpression g);
	
	final public ValueSpecificationEvaluator getEv() {
		return ev;
	}

	public abstract void addInvariant(BooleanExpression invariant);
}
