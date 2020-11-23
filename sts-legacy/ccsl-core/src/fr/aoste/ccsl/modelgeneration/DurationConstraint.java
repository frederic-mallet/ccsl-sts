package fr.aoste.ccsl.modelgeneration;

import java.io.PrintWriter;

class DurationConstraint extends AConstraint{
	public DurationConstraint() {
		super("_dur");
	}
	@Override
	public void print(PrintWriter pw, String tab) {
		pw.print(tab);
		pw.println("Integer "+name+"min = "+getIntParam("MIN")+";");

		pw.print(tab);
		pw.println("Integer "+name+"max = "+getIntParam("MAX")+";");
		
		pw.print(tab);
		pw.print("Relation "+name+" [ Duration ] ( Start -> ");
		pw.print(getStringParam("START"));
		pw.print(", End -> ");
		pw.print(getStringParam("FINISH"));
		pw.print(", Base -> ms, MinValue -> "); pw.print(name);
		pw.print("min, MaxValue -> "); pw.print(name);
		pw.println("max)");
		
	}
// 	Relation _d [ Duration ] ( Start -> _Time1, End -> _Time2, Base -> ns, MinValue -> zero, MaxValue -> fivethousand)
	
}
