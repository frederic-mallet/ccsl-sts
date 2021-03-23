package fr.aoste.ccsl.system;

/**
 * Offer a CCSL API to build a CCSL Constraint System. This API is intended to be simpler than the one proposed by core.ICCSLSpecification
 * 
 * @author fmallet
 *
 * @param <RESULT> The type of the Constraint System to be built
 * @see fr.aoste.ccsl.core.ICCSLSpecification 
 */
public interface ICCSLSystemBuilder<RESULT> {
	/**
	 * Must be a way to retrieve the result produced
	 * @param resourceName most of the time the result must be given a name
	 * @return result produced by building the specification
	 */
	public RESULT getCCSLSystem();
	
	// --relations
	public abstract void causes(String left, String right);
	public abstract void precedes(String left, String right);
	public abstract void alternates(String left, String right);
	public abstract void coincides(String c1, String c2);
	public abstract void exclusion(String left, String right);
	public abstract void subclock(String left, String right);

	// -- expressions
	public abstract String union(String... operands);
	public abstract String union(String operand1, String operand2);
	
	public abstract String intersection(String... operands);
	public abstract String intersection(String operand1, String operand2);
	
	public abstract String inf(String... operands);
	public abstract String inf(String operand1, String operand2);
	
	public abstract String sup(String... operands);
	public abstract String sup(String operand1, String operand2);
	
	// -- generic way to add an existing specification
	public abstract void addSpecification(ICCSLSystemBuilder<?> spec);

	// Default values, every => 1, from => 0
	String filter(String base, int every, int from);
}