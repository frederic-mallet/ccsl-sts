package fr.aoste.sync.compose;

import fr.aoste.ccsl.system.ICCSLSystemBuilder;
import fr.aoste.ccsl.system.ICCSLSystemBuilderFactory;
import fr.aoste.sync.SynchronousTransitionSystem;

final public class STSParallelBuilderFactory implements ICCSLSystemBuilderFactory{
	public final static STSParallelBuilderFactory SINGLETON = new STSParallelBuilderFactory();
	private STSParallelBuilderFactory() {
		// SINGLETON
	}
	@Override
	public ICCSLSystemBuilder<SynchronousTransitionSystem> createSystemBuilder() {
		return STSSystemBuilder.buildParallelSystemBuilder();
	}
}
