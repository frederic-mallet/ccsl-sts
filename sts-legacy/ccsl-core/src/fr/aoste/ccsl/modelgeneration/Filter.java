package fr.aoste.ccsl.modelgeneration;

import java.io.PrintWriter;


final class Filter extends ObserverClock implements IModelElement {
	private IObserverClock base;
	private int every, from;
	
	Filter(IObserverClock base, int every, int from) {
		super(ObserverClock.buildUniqueName("expr"));
		this.base = base;
		this.every = every;
		this.from = from;
	}
	
	@Override
	public String toString() {
		return getName();
	}

	@Override
	public void print(PrintWriter pw, String tab) {
		pw.print(tab);
		pw.println("Integer _i"+from+" = "+ from+";");
		pw.print(tab);
		if (every == 1)
			pw.println("Expression "+getName()+" = DelayFor(\n"+ 
					"\t\t DelayForClockToDelay -> "+base.getName()+",\n" +
					"\t\t DelayForClockForCounting -> "+base.getName()+",\n" +
					"\t\t DelayForDelay -> _i"+from+" )");
		else
			throw new RuntimeException("Not supported yet!");
	}
}
