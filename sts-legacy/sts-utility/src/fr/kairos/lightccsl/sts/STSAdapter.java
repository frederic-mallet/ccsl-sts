package fr.kairos.lightccsl.sts;

import fr.aoste.ccsl.system.ICCSLSystemBuilder;
import fr.aoste.sts.STSBuilder;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.creator.CCSLStsFactory;
import fr.aoste.sync.creator.TernaryDelayBuilder;
import fr.kairos.timesquare.ccsl.ISimpleSpecification;

/**
 * Adapts STSSystemBuilder to ISimpleSpecification
 * 
 * @author fmallet
 *
 */
class STSAdapter implements ISimpleSpecification {
	// will put all the sts in parallel, remove aliases and fold n-ary expressions 
	private ICCSLSystemBuilder<SynchronousTransitionSystem> stsBuilder;
	
	STSAdapter(ICCSLSystemBuilder<SynchronousTransitionSystem> stsBuilder) {
		super();
		this.stsBuilder = stsBuilder;
	}
	
	@Override
	public void addClock(String name) {
		stsBuilder.addClock(name, false);
	}
	
	@Override
	public void subclock(String left, String right) {
		stsBuilder.subclock(left, right);
	}

	@Override
	public void exclusion(String left, String right) {
		stsBuilder.exclusion(left, right);
	}

	@Override
	public void precedence(String left, String right) {
		stsBuilder.precedes(left, right);
	}

	@Override
	public void precedence(String left, String right, int min, int max) {
		STSBuilder<SynchronousTransitionSystem> builder = CCSLStsFactory.INSTANCE.createPrecedesBuilder(left, right, min, max);
		stsBuilder.addSpecification(builder.create());
	}

	@Override
	public void causality(String left, String right) {
		stsBuilder.causes(left, right);
	}

	@Override
	public void causality(String left, String right, int min, int max) {
		STSBuilder<SynchronousTransitionSystem> builder = CCSLStsFactory.INSTANCE.createCausesBuilder(left, right, min, max);
		stsBuilder.addSpecification(builder.create());
	}

	@Override
	public void inf(String defClock, String... clocks) {
		stsBuilder.inf(defClock, clocks);
	}

	@Override
	public void sup(String defClock, String... clocks) {
		stsBuilder.sup(defClock, clocks);
	}

	@Override
	public void union(String defClock, String... clocks) {
		stsBuilder.union(defClock, clocks);
	}

	@Override
	public void intersection(String defClock, String... clocks) {
		stsBuilder.intersection(defClock, clocks);
	}

	@Override
	public void minus(String defClock, String... clocks) {
		throw new RuntimeException("Unsupported operation");
	}

	@Override
	public void periodic(String defClock, String ref, int period, int from, int upto) {
		if (upto != -1)
			throw new RuntimeException("STS: Unsupported: repeat " + defClock + " every " + period + " " + ref + "$" + " from " + from + " upTo " + upto);
		stsBuilder.filter(defClock, ref, period, from);
	}

	@Override
	public void delayFor(String defClock, String ref, int from, int upTo, String base) {
		if (base != null && from == 0) {
			sampledOn(defClock, ref, base);
			return;
		}
		if (upTo != -1)
			throw new RuntimeException("STS: Unsupported delayFor " + defClock + " = " + ref + "$" + from + " -> " + upTo + " on " + base);
		if (base == null || base.equals(ref))
			stsBuilder.filter(defClock, ref, 1, from);
		else {
			TernaryDelayBuilder builder = new TernaryDelayBuilder(defClock, ref, from, base);
			stsBuilder.addSpecification(builder.create());
		}
	}
	private void sampledOn(String defClock, String ref, String base) {
		STSBuilder<SynchronousTransitionSystem> builder = CCSLStsFactory.INSTANCE.createSampledBuilder(defClock, ref, base);
		stsBuilder.addSpecification(builder.create());
	}
}
