package fr.aoste.sync.linearprogramming;

public class InvariantHelperFactory {
	private static AInvariantHelper helper = DefaultInvariantHelper.INSTANCE;
	
	static public void setHelper(AInvariantHelper helper) {
		if (helper != null) InvariantHelperFactory.helper = helper;
	}
	static public AInvariantHelper getHelper() {
		return helper;
	}
}
