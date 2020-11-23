package fr.aoste.ccsl.core;


public interface IState {
	public IState addTransition(ICCSLClock ... clocks);
	public IState addTransition(IState target, ICCSLClock ... clocks);
}
