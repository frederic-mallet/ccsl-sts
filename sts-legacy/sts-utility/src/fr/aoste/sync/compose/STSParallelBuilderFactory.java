package fr.aoste.sync.compose;

import fr.aoste.ccsl.system.ICCSLSystemBuilderFactory;

final public class STSParallelBuilderFactory implements ICCSLSystemBuilderFactory{
	public final static STSParallelBuilderFactory SINGLETON = new STSParallelBuilderFactory();
	private STSParallelBuilderFactory() {
		// SINGLETON
	}
	@Override
	public STSSystemBuilder createSystemBuilder() {
		return STSSystemBuilder.buildParallelSystemBuilder();
	}
}
