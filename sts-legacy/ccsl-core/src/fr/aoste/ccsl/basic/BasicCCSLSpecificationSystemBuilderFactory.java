package fr.aoste.ccsl.basic;

import fr.aoste.ccsl.system.ICCSLSystemBuilder;
import fr.aoste.ccsl.system.ICCSLSystemBuilderFactory;

class BasicCCSLSpecificationSystemBuilderFactory implements ICCSLSystemBuilderFactory{
	static final public ICCSLSystemBuilderFactory SINGLETON = new BasicCCSLSpecificationSystemBuilderFactory();
	private BasicCCSLSpecificationSystemBuilderFactory() {
		// SINGLETON
	}
	@Override
	public ICCSLSystemBuilder<?> createSystemBuilder() {
		return new BasicCCSLSpecification();
	}
}
