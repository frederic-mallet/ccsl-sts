package fr.kairos.lightccsl.sts;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.visitor.AstsVisitor;
import fr.kairos.timesquare.ccsl.simple.AUtility;

public class STSDefaultBackend implements ISTSBackend<File> {
	private AstsVisitor<CharSequence> visitor;
	private String ext;
	
	public STSDefaultBackend(AstsVisitor<CharSequence> visitor, String extension) {
		this.visitor = visitor;
		this.ext = extension;
	}
	@Override
	public File treat(AUtility utility, SynchronousTransitionSystem sts, String name) {
		File folder = utility.createFolder("sts");
		String res = sts.accept(visitor).toString();
		File file = new File(folder, name + ext);
		try (PrintWriter pw = new PrintWriter(new FileWriter(file))) {
			pw.println(res);
			return folder;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
