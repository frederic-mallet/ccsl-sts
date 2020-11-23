package fr.aoste.sync.compose;


final class Binding implements IBinding {
	private String name;
	private int numSts;
	private String formalParameter;
	Binding(String name, int numSts, String operand) {
		super();
		this.name = name;
		this.numSts = numSts;
		this.formalParameter = operand;
	}
	void bind(STSParallelComposer composer) {
		composer.synchronize(getName()).bind(getSTSNumber(), getEvent());
	}
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public int getSTSNumber() {
		return this.numSts;
	}
	@Override
	public String getEvent() {
		return this.formalParameter;
	}
	@Override
	public String toString() {
		return name+"<-"+this.formalParameter+" in "+numSts;
	}
}