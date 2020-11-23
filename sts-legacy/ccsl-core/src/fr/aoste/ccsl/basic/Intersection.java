package fr.aoste.ccsl.basic;

class Intersection extends Expression {
	
	protected Intersection(String...operands) {
		super(operands);
	}

	@Override
	public void accept(ICCSLSpecificationVisitor visitor) {
		visitor.visit(this);
	}
}
