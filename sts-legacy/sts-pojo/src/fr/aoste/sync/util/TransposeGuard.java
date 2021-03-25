package fr.aoste.sync.util;

import java.util.Map;

import fr.aoste.sts.IEvent;
import fr.aoste.sts.SyncVector;
import fr.aoste.sync.Chi;
import fr.aoste.sync.Event;
import fr.aoste.sync.Parameter;
import fr.aoste.sync.ParameterBinding;
import fr.aoste.sync.ParameterReference;
import fr.aoste.sync.StsFactory;
import fr.aoste.sync.compose.CTSHelper;
import fr.aoste.sync.visitor.AstsVisitor;
import fr.aoste.sync.vspec.BooleanExpression;
import fr.aoste.sync.vspec.Comparison;
import fr.aoste.sync.vspec.ComparisonOperator;
import fr.aoste.sync.vspec.Conjunction;
import fr.aoste.sync.vspec.Difference;
import fr.aoste.sync.vspec.IntegerExpression;
import fr.aoste.sync.vspec.IvaluespecificationVisitor;
import fr.aoste.sync.vspec.LiteralInteger;
import fr.aoste.sync.vspec.NotExpression;
import fr.aoste.sync.vspec.ValueSpecification;
import fr.aoste.sync.vspec.ValuespecificationFactory;

public class TransposeGuard implements IvaluespecificationVisitor<ValueSpecification> {
	private Map<SyncVector<? extends IEvent>, Event> syncMap;
	private CTSHelper helper;

	public TransposeGuard(Map<SyncVector<? extends IEvent>, Event> syncMap, CTSHelper helper) {
		super();
		this.syncMap = syncMap;
		this.helper = helper;
	}

	@Override
	public ValueSpecification visit(ValueSpecification e) {
		return (ValueSpecification)e.accept(this);
	}


	@Override
	public BooleanExpression visit(BooleanExpression e) {
		return (BooleanExpression)e.accept(this); // use dynamic binding
	}

	@Override
	public IntegerExpression visit(IntegerExpression e) {
		if (e instanceof Chi)
			return (IntegerExpression)((Chi)e).accept(new Internal());
		if (e instanceof ParameterReference)
			return (IntegerExpression)((ParameterReference)e).accept(new Internal());
		return (IntegerExpression)e.accept(this); // use dynamic binding when possible
	}

	@Override
	public ValueSpecification visit(ComparisonOperator e) {
		return null;
	}

	@Override
	public LiteralInteger visit(LiteralInteger object) {
		LiteralInteger res = ValuespecificationFactory.eINSTANCE.createLiteralInteger();
		res.setValue(object.getValue());
		return res;
	}

	@Override
	public Difference visit(Difference e) {
		Difference d = ValuespecificationFactory.eINSTANCE.createDifference();
		d.setLeft(visit(e.getLeft()));
		d.setRight(visit(e.getRight()));
		return d;
	}

	@Override
	public ValueSpecification visit(Conjunction object) {
		Conjunction c = ValuespecificationFactory.eINSTANCE.createConjunction();
		for(BooleanExpression be : object.getOperands()) {
			c.getOperands().add(visit(be));
		}
		return c;
	}

	@Override
	public Comparison visit(Comparison object) {
		Comparison res = ValuespecificationFactory.eINSTANCE.createComparison();
		res.setOperator(object.getOperator());
		res.setLeft(visit(object.getLeft()));
		res.setRight(visit(object.getRight()));
		return res;
	}

	class Internal extends AstsVisitor<Object>  {
		@Override
		public Event visit(Event e) {
			return syncMap.get(e.getSync());
		}

		@Override
		public Object visit(Parameter p) {
			ParameterBinding binding = helper.getParameterBindingByParameter(p);
			ValueSpecification v = binding==null?p.getDefaultValue():binding.getValue();
			return v.accept(TransposeGuard.this);
		}

		@Override
		public Chi visit(Chi object) {
			Chi res = StsFactory.eINSTANCE.createChi();
			res.setEvent(visit(object.getEvent()));
			return res;
		}

		@Override
		public Object visit(ParameterReference e) {
			return visit(e.getReference());
		}
	}

	@Override
	public NotExpression visit(NotExpression e) {
		return new NotExpression(visit(e.getOperand()));
	}
}
