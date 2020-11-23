package fr.aoste.ccsl.modelgeneration;

import fr.aoste.ccsl.system.CoreToSystemAdapter;
import fr.aoste.ccsl.system.ICCSLSystemBuilder;
import fr.aoste.ccsl.system.ICCSLSystemBuilderFactory;

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
