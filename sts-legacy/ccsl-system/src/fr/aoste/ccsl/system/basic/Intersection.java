package fr.aoste.ccsl.system.basic;

/**
 * Requires a type for Intersection to get a dedicated visitor
 * 
 * @author fmallet
 *
 */
class Intersection extends Expression {
	
	protected Intersection(String...operands) {
		super(operands);
	}

	@Override
	public void accept(ICCSLSpecificationVisitor visitor) {
		visitor.visit(this);
	}
}
