package fr.aoste.ccsl.modelgeneration;

import java.io.PrintWriter;

class AlternatesConstraint extends AConstraint {
	public AlternatesConstraint() {
		super("_alt");
	}
	@Override
	public void print(PrintWriter pw, String tab) {
		pw.print(tab);
		pw.print("Relation "+name+" [ Alternates ] ( AlternatesLeftClock -> ");
		pw.print(getStringParam("LEFT"));
		pw.print(", AlternatesRightClock -> ");
		pw.print(getStringParam("RIGHT"));
		pw.println(")");
		
	}
//	Relation _alt0 [Alternates](  AlternatesLeftClock-> i ,	AlternatesRightClock-> out  )
	
}
