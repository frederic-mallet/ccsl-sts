package fr.aoste.sync.ta.states;

import java.util.HashMap;

import fr.aoste.sync.State;
import fr.aoste.sync.Transition;
import fr.aoste.sync.Vertex;

public class MyLocationFactory {
	private int nb = 0;
	private HashMap<Vertex,MyLocation> vertexToId = new HashMap<>();
	
	MyLocation createState(State s) {
		MyLocation res = new MyLocation(nb++);
		vertexToId.put(s,  res);
		return res;
	}
	
	public void buildLocation(State s, StringBuilder builder) {
		MyLocation st = createState(s);
		builder.append("<location id=\"");
		builder.append(st.getId());
		builder.append("\" x=\"");
		builder.append(st.getX());
		builder.append("\" y=\"");
		builder.append(st.getY());
		builder.append("\"></location>");		
	}
	public void buildTransition(Transition t, StringBuilder builder) {
		MyLocation source = vertexToId.get(t.getSource());
		MyLocation target = vertexToId.get(t.getTarget());
		builder.append("<transition>");
		builder.append("<source ref=\"");
		builder.append(source.getId());
		builder.append("\"/>");
		builder.append("<target ref=\"");
		builder.append(target.getId());
		builder.append("\"/>");
		builder.append("<label kind=\"assignment\" x=\"");
		builder.append((source.getX()+target.getX())/2);
		builder.append("\" y=\"");
		builder.append((source.getY()+target.getY())/2);
		builder.append("\">");
		
	}
	public String getId(Vertex s) {
		return vertexToId.get(s).getId();
	}
}
