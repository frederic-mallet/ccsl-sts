package fr.aoste.ccsl.system.basic;

/**
 * Requires a type for Union to get a dedicated visitor
 * 
 * @author fmallet
 *
 */
class Union extends Expression {
	
	protected Union(String name, String...operands) {
		super(name, operands);
	}

	@Override
	public void accept(ICCSLSpecificationVisitor visitor) {
		visitor.visit(this);
	}

}
