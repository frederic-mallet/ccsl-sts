package fr.aoste.ccsl.basic;

/**
 * Requires a type for Causality to get a dedicated visitor
 * 
 * @author fmallet
 *
 */
final class Causality extends BinaryRelation {
	protected Causality(String leftClock, String rightClock) {
		super(leftClock, rightClock);
	}

	@Override
	public void accept(ICCSLSpecificationVisitor visitor) {
		visitor.visit(this);
	}
}
