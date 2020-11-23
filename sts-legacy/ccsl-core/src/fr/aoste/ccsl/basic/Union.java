package fr.aoste.ccsl.basic;

class Union extends Expression {
	
	protected Union(String...operands) {
		super(operands);
	}

	@Override
	public void accept(ICCSLSpecificationVisitor visitor) {
		visitor.visit(this);
	}

}
