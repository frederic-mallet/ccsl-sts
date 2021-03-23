package fr.aoste.ccsl.system;

import fr.aoste.ccsl.modelgeneration.ExtendedCCSLSpecificationBuilder;
import fr.aoste.ccsl.modelgeneration.MyCCSLModel;

public class ExtendedCCSLBuilderFactory implements ICCSLSystemBuilderFactory{
	public final static ExtendedCCSLBuilderFactory SINGLETON = new ExtendedCCSLBuilderFactory();
	private ExtendedCCSLBuilderFactory() {
		// SINGLETON
	}
	@Override
	public ICCSLSystemBuilder<MyCCSLModel> createSystemBuilder() {
		return CoreToSystemAdapter.buildAdapter(new ExtendedCCSLSpecificationBuilder());
	}
}
