package fr.aoste.ccsl.modelgeneration;

import java.util.Collection;

import fr.aoste.ccsl.core.ACCSLSpecification;
import fr.aoste.ccsl.core.CCSLConstraint;
import fr.aoste.ccsl.core.ICCSLClock;
import fr.aoste.ccsl.core.ICCSLConstraint;
import fr.aoste.ccsl.core.IState;

public class ExtendedCCSLSpecificationBuilder extends ACCSLSpecification<MyCCSLModel> {
	private MyCCSLModel ccslModel = new MyCCSLModel();
	
	public ExtendedCCSLSpecificationBuilder() {
		ObserverClock.reset();
		ccslModel.addImport("platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib", "kernel");
	}

	@Override
	final public MyCCSLModel getContext() {
		return ccslModel;
	}

	
	@Override
	public IObserverClock buildClock(Object context) {
		IObserverClock res = new ObserverClock(context.toString());
		addClock(res);
		return res;
	}
	
	final protected void addClock(IObserverClock clock) {
		ccslModel.addClock(clock.getName());
	}
	
	protected IObserverClock addExpression(String exprName, ICCSLClock first, ICCSLClock second) {
		ExpressionClock expr = new ExpressionClock(exprName, (IObserverClock)first, (IObserverClock)second);
		ccslModel.addExpression(expr);
		return expr;
	}
	
	@Override
	final public void addPrecedes(ICCSLClock left, ICCSLClock right) {
		IObserverClock leftC = (IObserverClock)left;
		IObserverClock rightC = (IObserverClock)right;
		ccslModel.addRelation(new ObsRelation("Precedes", leftC, rightC));
	}

	@Override
	final public void addCauses(ICCSLClock left, ICCSLClock right) {
		IObserverClock leftC = (IObserverClock)left;
		IObserverClock rightC = (IObserverClock)right;
		ccslModel.addRelation(new ObsRelation("Causes", leftC, rightC));
	}

	@Override
	public void addExclusion(ICCSLClock left, ICCSLClock right) {
		IObserverClock leftC = (IObserverClock)left;
		IObserverClock rightC = (IObserverClock)right;
		ccslModel.addRelation(new ObsRelation("Exclusion", leftC, rightC));		
	}

	@Override
	public void addSubclock(ICCSLClock left, ICCSLClock right) {
		IObserverClock leftC = (IObserverClock)left;
		IObserverClock rightC = (IObserverClock)right;
		ccslModel.addRelation(new ObsRelation("SubClock", leftC, rightC));		
	}
	@Override
	public ICCSLConstraint addConstraint(String name) {
		if (name.equals("Duration")) {
			DurationConstraint dc = new DurationConstraint();
			ccslModel.addRelation(dc);
			return dc;
		}
		if (name.equals("Alternates")) {
			AlternatesConstraint ac = new AlternatesConstraint();
			ccslModel.addCCSLLibRelation(ac);
			return ac;
		}
		System.err.println("Constraint: "+name+" not supported!");
		return new CCSLConstraint();
	}

	@Override
	public IState addStateRelation(String name, Collection<ICCSLClock> clocks) {
		StatefulObsRelation rel = new StatefulObsRelation(name, clocks);
		System.out.println("TODO:add State Relation");
//TODO:		traceObserver.addRelation(rel);
		return rel.getCurrentState();
	}

	@Override
	public ICCSLClock addFilter(ICCSLClock base, int every, int from) {
		Filter filter = new Filter((IObserverClock)base, every, from);
		ccslModel.addExpression(filter);
		return filter;
	}
}
