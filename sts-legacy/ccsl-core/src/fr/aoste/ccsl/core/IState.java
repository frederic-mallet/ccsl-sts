package fr.aoste.ccsl.core;


/**
 * For constraints that depend on a state
 * @author fmallet
 *
 */
public interface IState {
	/**
	 * Self transition
	 * @param clocks list of ticking clocks
	 * @return new state
	 */
	public IState addTransition(ICCSLClock ... clocks);

	/**
	 * Transition to another state
	 * @param clocks list of ticking clocks
	 * @return should be target
	 */
	public IState addTransition(IState target, ICCSLClock ... clocks);
}
