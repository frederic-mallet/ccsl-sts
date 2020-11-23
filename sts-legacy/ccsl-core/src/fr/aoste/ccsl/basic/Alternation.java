package fr.aoste.ccsl.basic;

final class Alternation extends BinaryRelation {
	protected Alternation(String leftClock, String rightClock) {
		super(leftClock, rightClock);
	}

	@Override
	public void accept(ICCSLSpecificationVisitor visitor) {
		visitor.visit(this);
	}
}
