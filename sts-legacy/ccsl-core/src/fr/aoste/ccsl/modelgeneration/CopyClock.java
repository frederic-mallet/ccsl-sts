package fr.aoste.ccsl.modelgeneration;


final public class CopyClock implements IObserverClock {
	private IObserverClock delegate;
	
	public CopyClock(IObserverClock delegate) {
		this.delegate = delegate;
	}

	@Override
	public String toString() {
		return this.delegate.toString();
	}

	@Override
	public String getName() {
		return this.delegate.getName();
	}
}
