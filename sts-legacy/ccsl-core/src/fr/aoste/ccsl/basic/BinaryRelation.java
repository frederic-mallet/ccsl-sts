package fr.aoste.ccsl.basic;

abstract class BinaryRelation implements IRelation {
	private String leftClock, rightClock;
	
	protected BinaryRelation(String leftClock, String rightClock) {
		super();
		this.leftClock = leftClock;
		this.rightClock = rightClock;
	}

	public String getLeftClock() {
		return leftClock;
	}
	public String getRightClock() {
		return rightClock;
	}

}
