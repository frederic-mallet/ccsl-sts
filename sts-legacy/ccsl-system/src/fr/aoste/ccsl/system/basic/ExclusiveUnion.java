package fr.aoste.ccsl.system.basic;

/**
 * Requires a type for Exclusive Union to get a dedicated visitor
 * 
 * @author fmallet
 *
 */
class ExclusiveUnion extends Expression {
	
	protected ExclusiveUnion(String name, String...operands) {
		super(name, operands);
	}

	@Override
	public void accept(ICCSLSpecificationVisitor visitor) {
		visitor.visit(this);
	}

}
