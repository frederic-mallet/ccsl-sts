package fr.aoste.ccsl.system.basic;

/**
 * Requires a type for Expressions to get a dedicated visitor
 * 
 * @author fmallet
 *
 */
abstract class Expression implements ICCSLSpecificationElement {
	private String name;
	private String[] operands;
	
	Expression(String name, String ... operands) {
		this.name = name;
		this.operands = operands;
	}
	public String getName() {
		return name;
	}
	public String[] getOperands() {
		return this.operands;
	}
	
}
