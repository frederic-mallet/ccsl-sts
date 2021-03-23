package fr.aoste.sts;

/**
 * Abstraction to generation STS builder from CCSL constraints
 * Does not say whether there is an ecore model or a POJO one
 * 
 * @author fmallet
 *
 * @param <STS> Used to have a single mechanism common between EMF models and POJO ones
 */
public interface ICCSLStsFactory<STS> {
	// expressions
	public STSBuilder<STS> createPeriodicBuilder();
	public STSBuilder<STS> createPeriodicBuilder(String sup, String sub, int period, int offset);
	public STSBuilder<STS> createDelayBuilder();
	public STSBuilder<STS> createDelayBuilder(int delay, boolean isPure);
	public STSBuilder<STS> createDelayBuilder(String src, String tgt, int delay, boolean isPure);
	public STSBuilder<STS> createUnionBuilder(String derived, String ... src);
	public STSBuilder<STS> createIntersectionBuilder(String derived, String ... src);
	public STSBuilder<STS> createInfBuilder(String derived, String c1, String c2);
	public STSBuilder<STS> createSupBuilder(String derived, String c1, String c2);
	public STSBuilder<STS> createFilterBuilder();
	public STSBuilder<STS> createFilterBuilder(String init, String period);
	// relations
	public STSBuilder<STS> createAlternatesBuilder(String left, String right);
	public STSBuilder<STS> createPrecedesBuilder(String left, String right);
	public STSBuilder<STS> createCausesBuilder(String left, String right);
	public STSBuilder<STS> createCoincidesBuilder(String ... src);
	public STSBuilder<STS> createExcludesBuilder(String ... src);
	public STSBuilder<STS> createSubclockBuilder(String clock1, String clock2);
}
