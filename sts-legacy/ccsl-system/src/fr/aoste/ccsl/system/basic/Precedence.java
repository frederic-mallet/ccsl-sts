package fr.aoste.ccsl.system.basic;

/**
 * Requires a type for Precedence to get a dedicated visitor
 * 
 * @author fmallet
 *
 */
final class Precedence extends BinaryRelation {
	protected Precedence(String leftClock, String rightClock) {
		super(leftClock, rightClock);
	}

	@Override
	public void accept(ICCSLSpecificationVisitor visitor) {
		visitor.visit(this);
	}
}
