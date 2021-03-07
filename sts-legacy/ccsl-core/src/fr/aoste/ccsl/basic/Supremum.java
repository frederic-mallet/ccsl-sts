package fr.aoste.ccsl.basic;

class Supremum extends Expression {
	
	protected Supremum(String...operands) {
		super(operands);
	}

	@Override
	public void accept(ICCSLSpecificationVisitor visitor) {
		visitor.visit(this);
	}
}
