package fr.aoste.ccsl.basic;

final class Subclock extends BinaryRelation {
	protected Subclock(String leftClock, String rightClock) {
		super(leftClock, rightClock);
	}

	@Override
	public void accept(ICCSLSpecificationVisitor visitor) {
		visitor.visit(this);
	}
}
