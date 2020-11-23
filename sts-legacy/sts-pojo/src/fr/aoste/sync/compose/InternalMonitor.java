package fr.aoste.sync.compose;

class InternalMonitor {
	private int nbState = 1, invalidState = 0;
	private long max; 
	private long previousTime = System.currentTimeMillis(), initialTime = previousTime;
	InternalMonitor(long max) {
		this.max = max;
	}
	public boolean logInvalidState() {
		invalidState++;
		return true;
	}
	boolean log(SynchronizedState state) {
		long currentTime = System.currentTimeMillis();
		Log.L.ad(Log.LogKind.STATES, "state "+nbState+"/("+max+"-"+invalidState+")\t"+(currentTime-previousTime)+"ms "+(currentTime-initialTime)+" ms");
		nbState++;
		previousTime = System.currentTimeMillis();
		
		return true;
	}
	private int[] nbTransitions = new int[TransitionKind.values().length];
	public boolean logTransition(TransitionKind kind) {
		nbTransitions[kind.pos]++;
		return true;
	}
	public boolean logTransitions() {
		Log.L.ad(Log.LogKind.TRANSITION5, 
				"Active:"+nbTransitions[TransitionKind.ACTIVE.pos]+
				" Invalid:"+nbTransitions[TransitionKind.INVALID_GUARD.pos]+
				" Removed:"+nbTransitions[TransitionKind.REMOVED.pos]);
		return true;		
	}
	static enum TransitionKind {
		ACTIVE(0), // when the guard is valid (or not checked) and not made inactive because of other boolean constraints
		INVALID_GUARD(1), // when the integer guard is checked and invalid
		REMOVED(2); // when removed because not possible
		private TransitionKind(int pos) {
			this.pos = pos;
		}
		int pos;
	}
	boolean logStatesToExplore(int size) {
		Log.L.ad(Log.LogKind.STATES, "To explore:\t"+size);
		return false;
	}
}