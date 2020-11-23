package fr.aoste.ccsl.basic;

class Filter extends Expression {
	private int every = 1, from = 0;
	
	protected Filter(String base, int every, int from) {
		super(base);
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
