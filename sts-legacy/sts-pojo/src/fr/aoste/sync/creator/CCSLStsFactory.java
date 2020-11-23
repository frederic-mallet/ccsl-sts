package fr.aoste.sync.creator;

import fr.aoste.sts.ICCSLStsFactory;
import fr.aoste.sts.STSBuilder;
import fr.aoste.sync.SynchronousTransitionSystem;

final public class CCSLStsFactory implements ICCSLStsFactory<SynchronousTransitionSystem> {
	private CCSLStsFactory() { /* SINGLETON */ }
	static public CCSLStsFactory INSTANCE = new CCSLStsFactory();
	
	// expressions
	@Override
	public STSBuilder<SynchronousTransitionSystem> createPeriodicBuilder() {
		return new PeriodicBuilder();
	}
	@Override
	public STSBuilder<SynchronousTransitionSystem> createPeriodicBuilder(String sup, String sub, int period, int offset) {
		PeriodicBuilder pBuilder = new PeriodicBuilder();
		pBuilder.setParameterValue(PeriodicBuilder.SUPERCLOCK, sup);
		pBuilder.setParameterValue(PeriodicBuilder.SUBCLOCK, sub);
		pBuilder.setParameterValue(PeriodicBuilder.PERIOD, period);
		pBuilder.setParameterValue(PeriodicBuilder.OFFSET, offset);
		return pBuilder;
	}
	@Override
	public STSBuilder<SynchronousTransitionSystem> createDelayBuilder() {
		return new DelayBuilder();
	}
	@Override
	public STSBuilder<SynchronousTransitionSystem> createDelayBuilder(int delay, boolean isPure) {
		DelayBuilder dBuilder = new DelayBuilder();
		dBuilder.setParameterValue(DelayBuilder.DELAY, delay);
		dBuilder.setParameterValue(DelayBuilder.PURE, isPure);
		return dBuilder;
	}
	@Override
	public STSBuilder<SynchronousTransitionSystem> createDelayBuilder(String src, String tgt, int delay, boolean isPure) {
		DelayBuilder dBuilder = new DelayBuilder();
		dBuilder.setParameterValue(DelayBuilder.SOURCE, src);
		dBuilder.setParameterValue(DelayBuilder.DELAYED, tgt);
		dBuilder.setParameterValue(DelayBuilder.DELAY, delay);
		dBuilder.setParameterValue(DelayBuilder.PURE, isPure);
		return dBuilder;
	}	
	public STSBuilder<SynchronousTransitionSystem> createDisjointUnionBuilder(String derived, int nbClocks) {
		if (nbClocks<2) throw new RuntimeException("createDisjointUnionBuilder: cannot have less than 2 clocks in disjoint union");
		
		DisjointUnionBuilder builder = new DisjointUnionBuilder();
		builder.setParameterValue(DisjointUnionBuilder.NB_CLOCKS, nbClocks);
		builder.setParameterValue(DisjointUnionBuilder.DISJOINT_UNION, derived);
		return builder;
	}
	@Override
	public STSBuilder<SynchronousTransitionSystem> createUnionBuilder(String derived, String ... src) {
		UnionBuilder builder = new UnionBuilder();
		// cannot have less than two clocks
		int nbClocks = Math.max(src.length, 2);
		builder.setParameterValue(UnionBuilder.NB_CLOCKS, nbClocks);
		builder.setParameterValue(UnionBuilder.UNION, derived);
		int i = 1;
		for(String s : src) {
			builder.setParameterValue("c"+i, s);
			i++;
		}
		return builder;
	}
	@Override
	public STSBuilder<SynchronousTransitionSystem> createIntersectionBuilder(String derived, String ... src) {
		IntersectionBuilder builder = new IntersectionBuilder();
		// cannot have less than two clocks
		int nbClocks = Math.max(src.length, 2);
		builder.setParameterValue(IntersectionBuilder.NB_CLOCKS, nbClocks);
		builder.setParameterValue(IntersectionBuilder.INTERSECTION, derived);
		int i = 1;
		for(String s : src) {
			builder.setParameterValue("c"+i, s);
			i++;
		}
		return builder;
	}
	@Override
	public STSBuilder<SynchronousTransitionSystem> createInfBuilder(String derived, String c1, String c2) {
		InfBuilder builder = new InfBuilder();
		builder.setParameterValue(InfBuilder.INF, derived);
		builder.setParameterValue(InfBuilder.CLOCK1, c1);
		builder.setParameterValue(InfBuilder.CLOCK2, c2);
		return builder;
	}
	@Override
	public STSBuilder<SynchronousTransitionSystem> createSupBuilder(String derived, String c1, String c2) {
		SupBuilder builder = new SupBuilder();
		builder.setParameterValue(SupBuilder.SUP, derived);
		builder.setParameterValue(SupBuilder.CLOCK1, c1);
		builder.setParameterValue(SupBuilder.CLOCK2, c2);
		return builder;
	}
	@Override
	public STSBuilder<SynchronousTransitionSystem> createFilterBuilder() {
		return new FilterBuilder();
	}	
	@Override
	public STSBuilder<SynchronousTransitionSystem> createFilterBuilder(String init, String period) {
		FilterBuilder fBuilder = new FilterBuilder();
		fBuilder.setParameterValue(FilterBuilder.INIT, init);
		fBuilder.setParameterValue(FilterBuilder.PERIOD, period);
		return fBuilder;
	}
	// relations
	@Override
	public STSBuilder<SynchronousTransitionSystem> createAlternatesBuilder(String left, String right) {
		AlternatesBuilder builder = new AlternatesBuilder();
		builder.setParameterValue(AlternatesBuilder.LEFTCLOCK, left);
		builder.setParameterValue(AlternatesBuilder.RIGHTCLOCK, right);
		return builder;
	}
	@Override
	public STSBuilder<SynchronousTransitionSystem> createPrecedesBuilder(String left, String right) {
		PrecedesBuilder builder = new PrecedesBuilder();
		builder.setParameterValue(PrecedesBuilder.LEFTCLOCK, left);
		builder.setParameterValue(PrecedesBuilder.RIGHTCLOCK, right);
		return builder;
	}
	@Override
	public STSBuilder<SynchronousTransitionSystem> createCausesBuilder(String left, String right) {
		CausesBuilder builder = new CausesBuilder();
		builder.setParameterValue(CausesBuilder.LEFTCLOCK, left);
		builder.setParameterValue(CausesBuilder.RIGHTCLOCK, right);
		return builder;
	}
	@Override
	public STSBuilder<SynchronousTransitionSystem> createCoincidesBuilder(String ... src) {
		CoincidesBuilder builder = new CoincidesBuilder();
		// cannot have less than two clocks
		int nbClocks = Math.max(src.length, 2);
		builder.setParameterValue(CoincidesBuilder.NB_CLOCKS, nbClocks);
		int i = 1;
		for(String s : src) {
			builder.setParameterValue("c"+i, s);
			i++;
		}
		return builder;
	}	
	@Override
	public STSBuilder<SynchronousTransitionSystem> createExcludesBuilder(String ... src) {
		ExcludesBuilder builder = new ExcludesBuilder();
		// cannot have less than two clocks
		int nbClocks = Math.max(src.length, 2);
		builder.setParameterValue(ExcludesBuilder.NB_CLOCKS, nbClocks);
		int i = 1;
		for(String s : src) {
			builder.setParameterValue("c"+i, s);
			i++;
		}
		return builder;
	}
	@Override
	public STSBuilder<SynchronousTransitionSystem> createSubclockBuilder(String clock1, String clock2) {
		SubclockBuilder builder = new SubclockBuilder();
		builder.setParameterValue(SubclockBuilder.SUBCLOCK, clock1);
		builder.setParameterValue(SubclockBuilder.SUPERCLOCK, clock2);
		return builder;
	}
}
