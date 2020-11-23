package fr.aoste.ccsl.modelgeneration;


public class ObserverClock implements IObserverClock {
	static private int nb = 0;
	private String name;
	
	public static void reset() {
		nb = 0;
	}
	
	static protected String buildUniqueName(String base) {
		return '_'+base+nb++;
	}
	public ObserverClock(String name) {
		this.name = name;
	}
	
	final public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return getName();
	}
}
