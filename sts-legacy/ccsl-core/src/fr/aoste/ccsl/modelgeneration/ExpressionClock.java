package fr.aoste.ccsl.modelgeneration;

import java.io.PrintWriter;


final class ExpressionClock extends ObserverClock implements IModelElement {
	private String exprName;
	private IObserverClock c1, c2;
	
	ExpressionClock(String expr, IObserverClock c1, IObserverClock c2) {
		super(ObserverClock.buildUniqueName("expr"));
		this.exprName = expr;
		this.c1 = c1;
		this.c2 = c2;
	}
	
	@Override
	public String toString() {
		return getName();
	}

	@Override
	public void print(PrintWriter pw, String tab) {
		pw.print(tab);
		pw.println("Expression "+getName()+" = "+ exprName+ " ( Clock1 -> "+c1.getName()+", Clock2 -> "+c2.getName()+" )");
		
	}
}
