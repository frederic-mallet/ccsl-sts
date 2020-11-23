package fr.aoste.sync.dynamic.util;

public interface IFiringTransitionListener {
	void clear();

	void fire(String clock);

	Iterable<String> firedClocks();

}
