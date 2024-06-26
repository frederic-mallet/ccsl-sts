package fr.aoste.ccsl.system.basic;

/**
 * Requires a type for Filter to get a dedicated visitor
 * 
 * @author fmallet
 *
 */
class Filter extends Expression {
	private int every = 1, from = 0;
	
	protected Filter(String der, String base, int every, int from) {
		super(der, base);
		this.every = every;
		this.from = from;
	}

	@Override
	public void accept(ICCSLSpecificationVisitor visitor) {
		visitor.visit(this);
	}

	public int getEvery() {
		return every;
	}
	
	public int getFrom() {
		return from;
	}
}
