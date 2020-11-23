package fr.aoste.sync.ta.states;

public class MyLocation {
	private int id, x, y;
	
	MyLocation(int nb) {
		id = nb ++;
		x = (id%5)*100+50;
		y = (id/5)*100+50;
	}
	
	public String getId() {
		return "id"+id;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}
