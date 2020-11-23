package fr.aoste.sync.compose;


/**
 * Decorator of binding to deal with Sequential composition
 * Take the STS two by two, must adapt the numSts accordingly
 * 
 * @author fmallet
 *
 */
class BindingFilter implements IBinding {
	private int level;
	private IBinding decorated;

	BindingFilter(IBinding toDecorate, int level) {
		this.decorated = toDecorate;
		this.level = level;
	}
	void bind(STSParallelComposer composer) {
		if (decorated.getSTSNumber()>level) return; // ignore bindings that do not apply

		try {
			composer.synchronize(getName()).bind(getSTSNumber(), getEvent());
		} catch (RuntimeException re) {
			// Ignore runtime exceptions due to multiple binding of clocks.
		}
	}

	@Override
	public String getName() {
		return decorated.getName();
	}
	@Override
	public int getSTSNumber() {
		if (decorated.getSTSNumber()==level)
			return 1;
		return 0;
	}
	@Override
	public String getEvent() {
		if (decorated.getSTSNumber()==level || level==1) return decorated.getEvent();
		return getName();
	}

}