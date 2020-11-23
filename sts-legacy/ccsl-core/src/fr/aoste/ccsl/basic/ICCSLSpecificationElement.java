package fr.aoste.ccsl.basic;

public interface ICCSLSpecificationElement {
	void accept(ICCSLSpecificationVisitor visitor);
}
