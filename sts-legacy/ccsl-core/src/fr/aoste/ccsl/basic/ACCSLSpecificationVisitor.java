package fr.aoste.ccsl.basic;

abstract class ACCSLSpecificationVisitor implements ICCSLSpecificationVisitor {
	@Override
	public void visit(BasicCCSLSpecification specification) {
		for(ICCSLSpecificationElement e : specification)
			e.accept(this);
	}
}
