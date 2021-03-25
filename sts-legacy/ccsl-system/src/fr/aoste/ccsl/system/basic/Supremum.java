package fr.aoste.ccsl.system.basic;

/**
 * Requires a type for Supremum to get a dedicated visitor
 * 
 * @author fmallet
 *
 */
class Supremum extends Expression {
	
	protected Supremum(String name, String...operands) {
		super(name, operands);
	}

	@Override
	public void accept(ICCSLSpecificationVisitor visitor) {
		visitor.visit(this);
	}
}
