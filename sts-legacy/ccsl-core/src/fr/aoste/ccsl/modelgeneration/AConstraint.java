package fr.aoste.ccsl.modelgeneration;

import fr.aoste.ccsl.core.CCSLConstraint;
import fr.aoste.ccsl.core.ICCSLConstraint;

abstract class AConstraint extends CCSLConstraint implements ICCSLConstraint, IModelElement {
	private static int nb = 0;
	String name;
	AConstraint(String base) {
		name = base+nb++;
	}
}
