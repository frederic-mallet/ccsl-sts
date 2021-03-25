package fr.aoste.ccsl.system.basic;

/**
 * Requires a type for Intersection to get a dedicated visitor
 * 
 * @author fmallet
 *
 */
class Intersection extends Expression {
	
	protected Intersection(String name, String...operands) {
		super(name, operands);
	}

	@Override
	public void accept(ICCSLSpecificationVisitor visitor) {
		visitor.visit(this);
	}
}
