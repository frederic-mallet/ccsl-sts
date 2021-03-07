package fr.aoste.ccsl.basic;

class Infimum extends Expression {
	
	protected Infimum(String...operands) {
		super(operands);
	}

	@Override
	public void accept(ICCSLSpecificationVisitor visitor) {
		visitor.visit(this);
	}
}
