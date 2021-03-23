package fr.aoste.ccsl.system.basic;

/**
 * Requires a type for Infimum to get a dedicated visitor
 * 
 * @author fmallet
 *
 */
class Infimum extends Expression {
	
	protected Infimum(String...operands) {
		super(operands);
	}

	@Override
	public void accept(ICCSLSpecificationVisitor visitor) {
		visitor.visit(this);
	}
}
