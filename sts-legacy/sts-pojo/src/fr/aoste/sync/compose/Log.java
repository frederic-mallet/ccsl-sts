package fr.aoste.sync.compose;

final public class Log {
	static public final Log L = new Log();
	private byte state = 0;
	private Log() {
		// SINGLETON
	}
	public void activate(LogKind kind) {
		state |= kind.value;
	}
	public void deactivate(LogKind kind) {
		state &= (255-kind.value);
	}
	public boolean eval(LogKind kind) {
		return (kind.value&state) != 0;
	}
	public void ad(LogKind tag, String msg) {
		assert(!eval(tag) || d(tag, msg)); // remove -ea to ignore this
	}
	public boolean d(LogKind tag, String msg) {
		System.out.println("*"+tag+"*: "+msg);
		return true;
	}
	public void e(LogKind tag, String msg) {
		System.err.println("*"+tag+"*: "+msg);
	}
	public static enum LogKind {
		STATES(1), TRANSITION5(2);
		LogKind(int v) {
			value = (byte)v;
		}
		byte value;
	}
}
