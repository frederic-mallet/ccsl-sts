package fr.kairos.lightccsl.sts;

import fr.aoste.ccsl.system.ICCSLSystemBuilder;
import fr.aoste.sync.SynchronousTransitionSystem;

/**
 * Just to add an existing external STS into a STSAdapter.
 * 
 * @author fmallet
 *
 */
class DummyBuilder implements ICCSLSystemBuilder<SynchronousTransitionSystem> {
	private SynchronousTransitionSystem sts;
	
	DummyBuilder(SynchronousTransitionSystem sts) {
		super();
		this.sts = sts;
	}

	@Override
	public SynchronousTransitionSystem getCCSLSystem() {
		return this.sts;
	}

	@Override
	public void addClock(String name, boolean local) {
		// nothing to do
	}

	@Override
	public void causes(String left, String right) {
		throw new RuntimeException("Not expect to add new constraints in DummyBuilder");
	}

	@Override
	public void precedes(String left, String right) {
		throw new RuntimeException("Not expect to add new constraints in DummyBuilder");
	}

	@Override
	public void alternates(String left, String right) {
		throw new RuntimeException("Not expect to add new constraints in DummyBuilder");
	}

	@Override
	public void coincides(String c1, String c2) {
		throw new RuntimeException("Not expect to add new constraints in DummyBuilder");
	}

	@Override
	public void exclusion(String left, String right) {
		throw new RuntimeException("Not expect to add new constraints in DummyBuilder");
	}

	@Override
	public void subclock(String left, String right) {
		throw new RuntimeException("Not expect to add new constraints in DummyBuilder");
	}

	@Override
	public String union(String der, String... operands) {
		throw new RuntimeException("Not expect to add new constraints in DummyBuilder");
	}

	@Override
	public String union(String der, String operand1, String operand2) {
		throw new RuntimeException("Not expect to add new constraints in DummyBuilder");
	}

	@Override
	public String intersection(String der, String... operands) {
		throw new RuntimeException("Not expect to add new constraints in DummyBuilder");
	}

	@Override
	public String intersection(String der, String operand1, String operand2) {
		throw new RuntimeException("Not expect to add new constraints in DummyBuilder");
	}

	@Override
	public String inf(String der, String... operands) {
		throw new RuntimeException("Not expect to add new constraints in DummyBuilder");
	}

	@Override
	public String inf(String der, String operand1, String operand2) {
		throw new RuntimeException("Not expect to add new constraints in DummyBuilder");
	}

	@Override
	public String sup(String der, String... operands) {
		throw new RuntimeException("Not expect to add new constraints in DummyBuilder");
	}

	@Override
	public String sup(String der, String operand1, String operand2) {
		throw new RuntimeException("Not expect to add new constraints in DummyBuilder");
	}

	@Override
	public void addSpecification(ICCSLSystemBuilder<?> spec) {
		throw new RuntimeException("Not expect to add new constraints in DummyBuilder");
	}

	@Override
	public String filter(String der, String base, int every, int from) {
		throw new RuntimeException("Not expect to add new constraints in DummyBuilder");
	}
}
