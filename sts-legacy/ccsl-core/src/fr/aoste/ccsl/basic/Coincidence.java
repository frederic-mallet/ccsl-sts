package fr.aoste.ccsl.basic;

final class Coincidence extends BinaryRelation {
	protected Coincidence(String leftClock, String rightClock) {
		super(leftClock, rightClock);
	}

	@Override
	public void accept(ICCSLSpecificationVisitor visitor) {
		visitor.visit(this);
	}
}
