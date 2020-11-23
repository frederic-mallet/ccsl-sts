package fr.aoste.ccsl.basic;

final class Precedence extends BinaryRelation {
	protected Precedence(String leftClock, String rightClock) {
		super(leftClock, rightClock);
	}

	@Override
	public void accept(ICCSLSpecificationVisitor visitor) {
		visitor.visit(this);
	}
}
