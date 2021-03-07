package fr.kairos.lightccsl.sts;

import fr.aoste.ccsl.system.ICCSLSystemBuilder;
import fr.aoste.sync.SynchronousTransitionSystem;
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
		throw new RuntimeException("Unsupported operation precedence " + left + ":" + right + ":" + min + ":" + max);		
	}

	@Override
	public void causality(String left, String right) {
		stsBuilder.causes(left, right);
	}

	@Override
	public void causality(String left, String right, int min, int max) {
		throw new RuntimeException("Unsupported operation causality " + left + ":" + right + ":" + min + ":" + max);				
	}

	@Override
	public void inf(String defClock, String... clocks) {
		throw new RuntimeException("Unsupported operation");
	}

	@Override
	public void sup(String defClock, String... clocks) {
		throw new RuntimeException("Unsupported operation");
	}

	@Override
	public void union(String defClock, String... clocks) {
		String der = stsBuilder.union(clocks);
		stsBuilder.coincides(defClock, der);
	}

	@Override
	public void intersection(String defClock, String... clocks) {
		String der = stsBuilder.intersection(clocks);
		stsBuilder.coincides(defClock, der);
	}

	@Override
	public void minus(String defClock, String... clocks) {
		throw new RuntimeException("Unsupported operation");
	}

	@Override
	public void periodic(String defClock, String ref, int period, int from, int upto) {
		throw new RuntimeException("Unsupported operation");
	}

	@Override
	public void delayFor(String defClock, String ref, int from, int upTo, String base) {
		throw new RuntimeException("Unsupported operation");
	}
}
