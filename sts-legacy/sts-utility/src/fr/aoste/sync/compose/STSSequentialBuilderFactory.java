package fr.aoste.sync.compose;

import fr.aoste.ccsl.system.ICCSLSystemBuilder;
import fr.aoste.ccsl.system.ICCSLSystemBuilderFactory;
import fr.aoste.sync.SynchronousTransitionSystem;

final public class STSSequentialBuilderFactory implements ICCSLSystemBuilderFactory{
	public final static STSSequentialBuilderFactory SINGLETON = new STSSequentialBuilderFactory();
	private STSSequentialBuilderFactory() {
		// SINGLETON
	}
	@Override
	public ICCSLSystemBuilder<SynchronousTransitionSystem> createSystemBuilder() {
		return STSSystemBuilder.buildSequentialSystemBuilder();
	}
}
