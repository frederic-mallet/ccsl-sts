package fr.aoste.ccsl.core;

import java.util.HashMap;

public class CCSLConstraint implements ICCSLConstraint {
	private HashMap<String, Object> parameters = new HashMap<>();
	
	@Override
	public ICCSLConstraint bind(String name, Object value) {
		parameters.put(name, value);
		return this;
	}
	
	protected String getStringParam(String name) {
		Object param = parameters.get(name);
		if (param==null) throw new RuntimeException("CCSLConstraint: Param is not set "+name);
		return param.toString();
	}
	protected int getIntParam(String name) {
		Object param = parameters.get(name);
		if (param==null) throw new RuntimeException("CCSLConstraint: Param is not set "+name);
		if (param instanceof Integer) return (Integer)param;
		throw new RuntimeException("CCSLConstraint: Param is not an int "+name);
	}
}
