package fr.aoste.ccsl.modelgeneration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;

public class MyCCSLModel {
	private LinkedList<String> imports = new LinkedList<>();
	private LinkedList<String> clocks = new LinkedList<>();
	private LinkedList<IModelElement> expressions = new LinkedList<>();
	private LinkedList<IModelElement> relations = new LinkedList<>();

	void addImport(String uri, String ref) {
		imports.add("\""+uri+"\" as "+ref);
	}
	void addClock(String c) {
		clocks.add(c);
	}
	void addExpression(IModelElement expr) {
		expressions.add(expr);
	}
	
	public void dump(String name, File f) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(f);
		pw.println("ClockConstraintSystem "+name+ " {");
		pw.println("  imports {");
		for(String s : imports) {
			pw.print("    import ");
			pw.print(s);
			pw.println(";");
		}
		pw.println("  }");
		pw.println("  entryBlock main");
		pw.println("  Block main {");
		for (String c : clocks) {
			pw.print("    Clock ");
			pw.print(c);
			pw.println(";");
		}
		pw.println("");
		for(IModelElement e : expressions) {
			e.print(pw, "    ");
		}
		pw.println("");
		for(IModelElement r : relations) {
			r.print(pw, "    ");
		}
		pw.println("  }");		
		pw.println("}");		
		pw.close();
	}
	void addRelation(ObsRelation obsRelation) {
		relations.add(obsRelation);
	}
	private boolean hasCCSLLib = false;
	void addCCSLLibRelation(AConstraint c) {
		if (!hasCCSLLib) {
			addImport("platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib", "libCCSL");
			hasCCSLLib = true;
		}
		relations.add(c);
	}
	private boolean hasDuration = false;
	void addRelation(DurationConstraint dc) {
		if (!hasDuration) {
			addImport("lib4RT.ccslLib", "lib4rt");
			addClock("ms");
			hasDuration = true;
		}
		relations.add(dc);
	}
}
