package fr.aoste.ccsl.basic;

/**
 * Requires a type for Alternation to get a dedicated visitor
 * 
 * @author fmallet
 *
 */
final class Alternation extends BinaryRelation {
	protected Alternation(String leftClock, String rightClock) {
		super(leftClock, rightClock);
	}

	@Override
	public void accept(ICCSLSpecificationVisitor visitor) {
		visitor.visit(this);
	}
}
