package fr.aoste.ccsl.core;

import java.util.HashMap;

/**
 * A generic CCSL constraint
 * Parameters are defined the the HashMap, including clocks, periods, delays
 * Default CCSL library gives a by default implementation, but can add others
 * 
 * @author fmallet
 *
 */
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
