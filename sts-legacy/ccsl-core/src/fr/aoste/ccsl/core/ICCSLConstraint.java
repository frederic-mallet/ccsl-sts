package fr.aoste.ccsl.core;

/**
 * A generic constraint needs to bind a parameter to a value without assuming any 
 * specific encoding.
 * 
 * @see CCSLConstraint use a HashMap to store the binding
 * 
 * @author fmallet
 *
 */
public interface ICCSLConstraint {
	ICCSLConstraint bind(String param, Object value);
}
