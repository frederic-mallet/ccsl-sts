package fr.aoste.ccsl.system.basic;

/**
 * Requires a type for Subclock to get a dedicated visitor
 * 
 * @author fmallet
 *
 */
final class Subclock extends BinaryRelation {
	protected Subclock(String leftClock, String rightClock) {
		super(leftClock, rightClock);
	}

	@Override
	public void accept(ICCSLSpecificationVisitor visitor) {
		visitor.visit(this);
	}
}
