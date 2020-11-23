package fr.aoste.ccsl.modelgeneration;

import java.io.PrintWriter;


final class ObsRelation extends ObserverClock implements IModelElement {
	private String relName;
	private IObserverClock left, right;
	
	ObsRelation(String relName, IObserverClock left, IObserverClock right) {
		super(ObserverClock.buildUniqueName("rel"));
		this.relName = relName;
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String toString() {
		return "Relation "+getName()+" [ "+ relName+ " ] ( LeftClock -> "+left.getName()+", RightClock -> "+right.getName()+" )";
	}

	@Override
	public void print(PrintWriter pw, String tab) {
		pw.print(tab);
		pw.println(this);
	}
}
