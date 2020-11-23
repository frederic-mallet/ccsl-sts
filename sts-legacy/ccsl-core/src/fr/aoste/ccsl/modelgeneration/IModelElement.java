package fr.aoste.ccsl.modelgeneration;

import java.io.PrintWriter;

public interface IModelElement {
	void print(PrintWriter pw, String tab);
}
