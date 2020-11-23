package fr.aoste.ccsl.basic;

final class Exclusion extends BinaryRelation {
	protected Exclusion(String leftClock, String rightClock) {
		super(leftClock, rightClock);
	}

	@Override
	public void accept(ICCSLSpecificationVisitor visitor) {
		visitor.visit(this);
	}
}
