package fr.aoste.ccsl.system.basic;

/**
 * An element of a specification : basic visitors iterate over all the elements of a specification
 * 
 * @author fmallet
 *
 */
public interface ICCSLSpecificationElement {
	void accept(ICCSLSpecificationVisitor visitor);
}
