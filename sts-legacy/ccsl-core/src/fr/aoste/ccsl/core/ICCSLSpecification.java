package fr.aoste.ccsl.core;

import java.util.Collection;

/**
 * This was the definition of CCSLSpecification when I built the STS in 2014
 * Now this should be replaced by the one deployed in TimeSquare in the safety plugin
 * 
 * @author fmallet
 *
 * @param <CONTEXT>
 */
public interface ICCSLSpecification<CONTEXT> {
	ICCSLClock buildClock(Object context);

	// Only kernel expressions
	ICCSLClock addUnion(Collection<ICCSLClock> clocks);
	ICCSLClock addIntersection(Collection<ICCSLClock> clocks);
	ICCSLClock addInfimum(Collection<ICCSLClock> clocks);
	ICCSLClock addSupremum(Collection<ICCSLClock> clocks);
	ICCSLClock addFilter(ICCSLClock base, int every, int from);
	//TODO: Should also have a mechanism to add user-defined expressions! 
	
	// only kernel relations
	void addPrecedes(ICCSLClock left, ICCSLClock right);
	void addCauses(ICCSLClock left, ICCSLClock right);
	void addExclusion(ICCSLClock left, ICCSLClock right);
	void addSubclock(ICCSLClock left, ICCSLClock right);
	
	// Should also have a mechanism to add user-defined relations!
	//TODO: Should also have a mechanism to add user-defined relations!
	
	ICCSLConstraint addConstraint(String name);
	
	CONTEXT getContext();

	// User-defined Stateful relation
	IState addStateRelation(String name, Collection<ICCSLClock> clocks);
}
