package fr.aoste.ccsl.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * An abstract implements of ICCSLSpecification that deals with base multi-clocks expressions
 * 
 * It basically unfolds expressions on list of clocks into call to the binary expressions by creating intermediate clocks
 * Use a dichotomic iteration to have logarithmic depth in the expression tree
 * 
 * @author fmallet
 *
 * @param <T> Type of the object built. Depends on the kind of analysis required
 */
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
		return buildExpression(expr, clockList, 0, clockList.size());
	}
	private ICCSLClock buildExpression(String exprName, List<ICCSLClock> clocks, int pos, int size) {
		assert(size >= 1 && pos < size);
		if (size == 1)
			return clocks.get(pos);
		
		int half = size / 2;
		ICCSLClock first  = buildExpression(exprName, clocks, pos,  half);              // first half  (floor   when odd)
		ICCSLClock second = buildExpression(exprName, clocks, pos + half, size - half); // second half (ceiling when odd)

		if (first == second) return first; // a+a = a, a*a = a, inf(a,a)=a, sup(a,a) = a
		
		return addExpression(exprName, first, second);
	}

	protected abstract ICCSLClock addExpression(String exprName, ICCSLClock first, ICCSLClock second);
}
