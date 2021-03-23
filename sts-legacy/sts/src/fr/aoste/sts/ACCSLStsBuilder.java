package fr.aoste.sts;

import java.util.HashMap;

/**
 * Default implementation for STSBuilder.
 * Use HashMap to parameterize the generation
 * 
 * @author fmallet
 *
 * @param <STS> Type of the actual STS built either EMF-based or POJO
 */
public abstract class ACCSLStsBuilder<STS> implements STSBuilder<STS> {
	private HashMap<String, Object> parameterValues = new HashMap<String,Object>();
	
	final protected String getStringParameterValue(String parameterName, String defaut) {
		Object o = getParameterValue(parameterName);
		if (o != null) return o.toString();
		return defaut;
	}
	final protected boolean getBooleanParameterValue(String parameterName, boolean defaut) {
		Object o = getParameterValue(parameterName);
		if (o != null && o instanceof Boolean) return (Boolean)o;
		return defaut;
	}
	final protected int getIntParameterValue(String parameterName, int defaut) {
		Object o = getParameterValue(parameterName);
		if (o != null && o instanceof Integer) return (Integer)o;
		return defaut;
	}
	final protected Object getParameterValue(String parameterName) {
		return parameterValues.get(parameterName);
	}

	final public void setParameterValue(String parameterName, Object value) {
		parameterValues.put(parameterName, value);
	}
}
