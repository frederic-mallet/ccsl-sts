package fr.kairos.lightccsl.sts;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.gen.STStoJava;
import fr.kairos.common.java.ClassBlock;
import fr.kairos.common.java.JavaElementList;
import fr.kairos.common.java.PrettyPrintJavaVisitor;
import fr.kairos.timesquare.ccsl.simple.AUtility;

public class STSJavaBackend implements ISTSBackend<Boolean> {
	static private void classToFile(ClassBlock cl, File f) {
		try (PrintWriter pw = new PrintWriter(new FileWriter(f))) {
			StringWriter sw = new StringWriter();
			PrettyPrintJavaVisitor jv = new PrettyPrintJavaVisitor(sw);
			cl.accept(jv);
			pw.println(sw.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void produceFireable(String name, File f) {
		ClassBlock javaClass = new ClassBlock("sts", name + "Fireable");
		javaClass.addExtends("fr.kairos.lightccsl.sts.AFireable");
		classToFile(javaClass, f);	
	}
	
	private void produceMain(String name, File f) {
		ClassBlock javaClass = new ClassBlock("sts", name + "Main");
		
		JavaElementList _main = javaClass.addMain();
		_main.ins(name + "Fireable _fire = new " + name + "Fireable()");
		_main.ins(name + " _instance = new " + name + "()");
		_main.lv("fr.aoste.sync.SynchronousTransitionSystem", "sts = _instance.create()");
		_main.lv("fr.aoste.sync.compose.STSParallelComposer", "composer = new STSParallelComposer(sts)");
		_main.lv("fr.aoste.sync.dynamic.util.DTSRunner", "runner = DTSRunner.create(composer)");
		_main.lv("fr.aoste.sync.dynamic.util.DefaultFiringTransitionListener", "l = new DefaultFiringTransitionListener()");
		_main.ins("runner.setListener(l)");
		
		JavaElementList _forBody = _main.block("for (int i = 0; i < 10; i++)");
		_forBody.ins("runner.fireRandomValidTransition()");
		_forBody.ins("_fire.fire(i, l.firedClocksAsArray())");
		classToFile(javaClass, f);
	}
	@Override
	public Boolean treat(AUtility utility, SynchronousTransitionSystem sts, String name) {
		STSDefaultBackend backend = new STSDefaultBackend(new STStoJava(), ".java");
		File folder = backend.treat(utility, sts, name);
		File mainFile = new File(folder, name+"Main.java");
		produceMain(name, mainFile);
		File fireable = new File(folder, name+"Fireable.java");
		produceFireable(name, fireable);
		return true;
	}

}
