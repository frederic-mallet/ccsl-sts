package fr.aoste.ccsl.system.basic;

import java.util.HashMap;
import java.util.LinkedList;

import fr.aoste.ccsl.core.ICCSLClock;
import fr.aoste.ccsl.core.ICCSLConstraint;
import fr.aoste.ccsl.core.ICCSLSpecification;

/**
 * Visit a BasicCCSLSpecification and invokes the 
 * ICCSLSpecification
 * TODO: This class should replace CoreToSystemAdapter
 * 
 * @see fr.aoste.ccsl.adapter.CoreToSystemAdapter
 * 
 * @author fmallet
 *
 */
public class CoreBuilderVisitor extends ACCSLSpecificationVisitor {
	private ICCSLSpecification<?> spec;
	private HashMap<String, ICCSLClock> nameToClocks = new HashMap<>();

	public CoreBuilderVisitor(ICCSLSpecification<?> spec) {
		super();
		this.spec = spec;
	}

	private ICCSLClock getClock(String name) {
		ICCSLClock res = nameToClocks.get(name);
		if (res==null) {
			res = spec.buildClock(name);
			nameToClocks.put(name,  res);
		}
		return res;
	}
	public void visit(Causality cause) {
		spec.addCauses(getClock(cause.getLeftClock()), getClock(cause.getRightClock()));
	}

	@Override
	public void visit(Precedence precedence) {
		spec.addPrecedes(getClock(precedence.getLeftClock()), getClock(precedence.getRightClock()));
	}

	@Override
	public void visit(Subclock subclock) {
		spec.addSubclock(getClock(subclock.getLeftClock()), getClock(subclock.getRightClock()));
	}

	@Override
	public void visit(Exclusion relation) 
	{
		spec.addExclusion(getClock(relation.getLeftClock()), getClock(relation.getRightClock()));
	}

	@Override
	public void visit(Filter filter) {
		throw new RuntimeException("Filter is not supported");
	}	

	@Override
	public void visit(Alternation alternation) {
		ICCSLConstraint c = spec.addConstraint("Alternates");
		c.bind("LEFT", getClock(alternation.getLeftClock()));
		c.bind("RIGHT", getClock(alternation.getRightClock()));
	}

	@Override
	public void visit(Coincidence coincidence) {
		throw new RuntimeException(this+":coincides should not be called:must be intercepted by a decorator treating aliases in a generic way");		
	}

	@Override
	public void visit(Union union) {
		LinkedList<ICCSLClock> clocks = new LinkedList<>();
		for(String clock : union.getOperands())
			clocks.add(getClock(clock));
		ICCSLClock res = spec.addUnion(clocks);
		if (nameToClocks.put(union.getName(), res) != null)
			throw new RuntimeException("Name conflict during union");
	}

	@Override
	public void visit(Intersection intersection) {
		LinkedList<ICCSLClock> clocks = new LinkedList<>();
		for(String clock : intersection.getOperands())
			clocks.add(getClock(clock));
		ICCSLClock res = spec.addIntersection(clocks);
		if (nameToClocks.put(intersection.getName(), res) != null)
			throw new RuntimeException("Name conflict during intersection");
	}
	
	@Override
	public void visit(Infimum infimum) {
		LinkedList<ICCSLClock> clocks = new LinkedList<>();
		for(String clock : infimum.getOperands())
			clocks.add(getClock(clock));		
		ICCSLClock res = spec.addInfimum(clocks);
		if (nameToClocks.put(infimum.getName(), res) != null)
			throw new RuntimeException("Name conflict during infimum");
	}
	@Override
	public void visit(Supremum supremum) {
		LinkedList<ICCSLClock> clocks = new LinkedList<>();
		for(String clock : supremum.getOperands())
			clocks.add(getClock(clock));		
		ICCSLClock res = spec.addSupremum(clocks);
		if (nameToClocks.put(supremum.getName(), res) != null)
			throw new RuntimeException("Name conflict during supremum");	}
}
