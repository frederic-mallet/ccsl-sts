package fr.aoste.sync.linearprogramming;

import fr.aoste.sync.vspec.BooleanExpression;

class DefaultInvariantHelper extends AInvariantHelper {
	static final public AInvariantHelper INSTANCE = new DefaultInvariantHelper();
	
	private DefaultInvariantHelper() {
		// SINGLETON
	}
	@Override
	public boolean hasNoSolution() {
		return false;
	}

	@Override
	public int testGuard(BooleanExpression g) {
		return 0;
	}
	@Override
	public void addInvariant(BooleanExpression invariant) {
		// do nothing here
	}

}
