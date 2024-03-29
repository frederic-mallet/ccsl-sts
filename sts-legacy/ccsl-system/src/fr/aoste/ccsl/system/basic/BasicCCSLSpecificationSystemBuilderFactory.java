package fr.aoste.ccsl.system.basic;

import fr.aoste.ccsl.system.ICCSLSystemBuilderFactory;

/**
 * Another factory system
 * 
 * @TODO should be merged with BasicCCSLSpecificationFactory ?
 * 
 * @author fmallet
 *
 */
class BasicCCSLSpecificationSystemBuilderFactory implements ICCSLSystemBuilderFactory{
	static final public ICCSLSystemBuilderFactory SINGLETON = new BasicCCSLSpecificationSystemBuilderFactory();
	private BasicCCSLSpecificationSystemBuilderFactory() {
		// SINGLETON
	}
	@Override
	public BasicCCSLSpecification createSystemBuilder() {
		return new BasicCCSLSpecification();
	}
}
