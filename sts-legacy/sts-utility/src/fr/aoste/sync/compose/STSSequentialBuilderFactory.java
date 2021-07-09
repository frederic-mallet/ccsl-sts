package fr.aoste.sync.compose;

import fr.aoste.ccsl.system.ICCSLSystemBuilderFactory;

final public class STSSequentialBuilderFactory implements ICCSLSystemBuilderFactory{
	public final static STSSequentialBuilderFactory SINGLETON = new STSSequentialBuilderFactory();
	private STSSequentialBuilderFactory() {
		// SINGLETON
	}
	@Override
	public STSSystemBuilder createSystemBuilder() {
		return STSSystemBuilder.buildSequentialSystemBuilder();
	}
}
