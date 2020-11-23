package fr.aoste.sync.dynamic.util;

import java.util.HashSet;

class DefaultFiringTransitionListener implements IFiringTransitionListener {
	private HashSet<String> namesOfFiredClocks = new HashSet<>();
	
	@Override
	public void clear() {
		namesOfFiredClocks.clear();
	}
	
	@Override
	public void fire(String clock) {
	}
	
	@Override
	public Iterable<String> firedClocks() {
		return namesOfFiredClocks;
	}

}
