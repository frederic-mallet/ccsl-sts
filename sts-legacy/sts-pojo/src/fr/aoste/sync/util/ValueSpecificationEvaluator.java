package fr.aoste.sync.util;

import fr.aoste.sync.Chi;
import fr.aoste.sync.Event;
import fr.aoste.sync.IstsVisitor;
import fr.aoste.sync.Parameter;
import fr.aoste.sync.ParameterBinding;
import fr.aoste.sync.ParameterReference;
import fr.aoste.sync.compose.CTSHelper;
import fr.aoste.sync.dynamic.EventCounter;
import fr.aoste.sync.dynamic.util.DTSHelper;
import fr.aoste.sync.visitor.AstsVisitor;
import fr.aoste.sync.vspec.BooleanExpression;
import fr.aoste.sync.vspec.Comparison;
import fr.aoste.sync.vspec.ComparisonOperator;
import fr.aoste.sync.vspec.Conjunction;
import fr.aoste.sync.vspec.Difference;
import fr.aoste.sync.vspec.IntegerExpression;
import fr.aoste.sync.vspec.IvaluespecificationVisitor;
import fr.aoste.sync.vspec.LiteralInteger;
import fr.aoste.sync.vspec.ValueSpecification;

public class ValueSpecificationEvaluator extends AstsVisitor<Object> implements IvaluespecificationVisitor<Object> {
	private DTSHelper dtsHelper;
	private CTSHelper ctsHelper;
	
	public ValueSpecificationEvaluator(DTSHelper context) {
		super();
		this.dtsHelper = context;
	}
	public ValueSpecificationEvaluator(CTSHelper context) {
		super();
		this.ctsHelper = context;
	}
	
	@Override
	public Object visit(Parameter e) {
		return e.getDefaultValue().accept(this);
	}
	@Override
	public Object visit(ParameterBinding e) {
		return e.getValue().accept(this);
	}
	@Override
	public Object visit(Chi object) {
		if (dtsHelper==null) {
			throw new RuntimeException("Cannot evalue Chi_"+object.getEvent().getName()+" without counter");
		}
		Event ev = object.getEvent();
		EventCounter eb = dtsHelper.getEventCounterByEvent(ev);
		return Integer.valueOf(eb.getCounter());
	}
	@Override
	public Object visit(ParameterReference paramRef) {
		Parameter parameter = paramRef.getReference();
		ParameterBinding binding = null;
		if (ctsHelper != null) binding = ctsHelper.getParameterBindingByParameter(parameter);
		else if (dtsHelper !=null) binding = dtsHelper.getParameterBindingByParameter(parameter);
		
		if (binding != null) return binding.accept(this);
		return parameter.accept(this);
	}
	@Override
	public Boolean visit(BooleanExpression e) {
		return (Boolean)e.accept(this);  // use dynamic binding to find the concrete type
	}
	@Override
	public Object visit(ValueSpecification e) {
		return e.accept(this); // use dynamic binding to find the concrete type
	}
	@Override
	public Integer visit(IntegerExpression e) {
		if (e instanceof Chi)
			return (Integer)((Chi)e).accept((IstsVisitor<Object>)this);
		if (e instanceof ParameterReference)
			return (Integer)((ParameterReference)e).accept((IstsVisitor<Object>)this);
			
		return (Integer)e.accept(this); // use dynamic binding to find the concrete type
	}
	@Override
	public Integer visit(LiteralInteger e) {
		return e.getValue();
	}
	@Override
	public Number visit(Difference e) {
		return visit(e.getLeft())-visit(e.getRight());
	}
	@Override
	public Boolean visit(Conjunction e) {
		for(BooleanExpression expr : e.getOperands())
			if (!visit(expr)) return false;
		return true;
	}
	@Override
	public Boolean visit(Comparison e) {
		int left = visit(e.getLeft());
		int right = visit(e.getRight());
		switch(e.getOperator()) {
		case EQUALS: return left==right;
		case GREATEROREQUAL: return left>=right;
		case GREATERTHAN: return left>right;
		case LESSOREQUAL: return left<=right;
		case LESSTHAN: return left<right;
		}
		return false; // cannot happen;
	}
	@Override
	public Object visit(ComparisonOperator e) {
		return e;
	}
}
