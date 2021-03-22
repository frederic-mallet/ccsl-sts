package fr.aoste.ccsl.core;

/**
 * A generic transition for constraints that have a state
 * 
 * @author fmallet
 *
 */
public interface ITransition {
	IState fire();
}
