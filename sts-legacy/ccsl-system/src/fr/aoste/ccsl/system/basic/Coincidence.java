package fr.aoste.ccsl.system.basic;

/**
 * Requires a type for Coincidence to get a dedicated visitor
 * 
 * @author fmallet
 *
 */
final class Coincidence extends BinaryRelation {
	protected Coincidence(String leftClock, String rightClock) {
		super(leftClock, rightClock);
	}

	@Override
	public void accept(ICCSLSpecificationVisitor visitor) {
		visitor.visit(this);
	}
}
