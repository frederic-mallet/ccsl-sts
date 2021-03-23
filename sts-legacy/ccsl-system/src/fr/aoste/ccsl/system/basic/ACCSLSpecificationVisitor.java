package fr.aoste.ccsl.system.basic;

/**
 * An abstract visitor that iterators through all the specification elements
 * when meeting a BasicCCSLSpecification
 * 
 * @see ICCSLSpecificationElement
 * @see BasicCCSLSpecification
 * 
 * @author fmallet
 *
 */
abstract class ACCSLSpecificationVisitor implements ICCSLSpecificationVisitor {
	@Override
	public void visit(BasicCCSLSpecification specification) {
		for(ICCSLSpecificationElement e : specification)
			e.accept(this);
	}
}
