package fr.aoste.ccsl.basic;

/**
 * Requires a type for Exclusion to get a dedicated visitor
 * 
 * @author fmallet
 *
 */
final class Exclusion extends BinaryRelation {
	protected Exclusion(String leftClock, String rightClock) {
		super(leftClock, rightClock);
	}

	@Override
	public void accept(ICCSLSpecificationVisitor visitor) {
		visitor.visit(this);
	}
}
