package fr.aoste.ccsl.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class ACCSLSpecification<T> implements ICCSLSpecification<T> {
	static protected final String INF = "Inf";
	static protected final String SUP = "Sup";
	static protected final String UNION = "Union";
	static protected final String INTERSECTION = "Intersection";

	@Override
	final public ICCSLClock addUnion(Collection<ICCSLClock> clocks) {
		return buildExpression(UNION, clocks);
	}
	@Override
	final public ICCSLClock addIntersection(Collection<ICCSLClock> clocks) {
		return buildExpression(INTERSECTION, clocks);
	}
	@Override
	final public ICCSLClock addInfimum(Collection<ICCSLClock> clocks) {
		return buildExpression(INF, clocks);
	}
	@Override
	final public ICCSLClock addSupremum(Collection<ICCSLClock> clocks) {
		return buildExpression(SUP, clocks);
	}
	private ICCSLClock buildExpression(String expr, Collection<ICCSLClock> clocks) {
		if (clocks.size()==0) throw new RuntimeException("Cannot build "+expr+" of empty set");
		List<ICCSLClock> clockList;
		if (clocks instanceof List){
			clockList = (List<ICCSLClock>)clocks;
		} else {
			clockList = new ArrayList<>();
			clockList.addAll(clocks);
		}
		return buildExpression(expr, clockList, 0);
	}
	private ICCSLClock buildExpression(String exprName, List<ICCSLClock> clocks, int pos) { // pos >=1
		assert(clocks.size()>=1);
		ICCSLClock first = clocks.get(pos); 
		if (pos == clocks.size()-1) {
			return first;
		}
		
		ICCSLClock second = buildExpression(exprName, clocks, pos+1);
		
		if (first == second) return first; // Is it always the case ? Do we need a copy ?
		
		return addExpression(exprName, first, second);
	}

	protected abstract ICCSLClock addExpression(String exprName, ICCSLClock first, ICCSLClock second);
}
