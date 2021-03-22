package fr.aoste.ccsl.basic;

/**
 * Requires a type for Supremum to get a dedicated visitor
 * 
 * @author fmallet
 *
 */
class Supremum extends Expression {
	
	protected Supremum(String...operands) {
		super(operands);
	}

	@Override
	public void accept(ICCSLSpecificationVisitor visitor) {
		visitor.visit(this);
	}
}
