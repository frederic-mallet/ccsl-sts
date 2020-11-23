package fr.aoste.ccsl.basic;

abstract class Expression implements ICCSLSpecificationElement {
	private static int num = 0;
	private String name;
	private String[] operands;
	
	Expression(String ... operands) {
		this.name = "_expr"+num++;
		this.operands = operands;
	}
	public String getName() {
		return name;
	}
	public String[] getOperands() {
		return this.operands;
	}
	
}
