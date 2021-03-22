package fr.aoste.ccsl.basic;

/**
 * Requires a type for Union to get a dedicated visitor
 * 
 * @author fmallet
 *
 */
class Union extends Expression {
	
	protected Union(String...operands) {
		super(operands);
	}

	@Override
	public void accept(ICCSLSpecificationVisitor visitor) {
		visitor.visit(this);
	}

}
