package fr.aoste.ccsl.basic;

final class Causality extends BinaryRelation {
	protected Causality(String leftClock, String rightClock) {
		super(leftClock, rightClock);
	}

	@Override
	public void accept(ICCSLSpecificationVisitor visitor) {
		visitor.visit(this);
	}
}
