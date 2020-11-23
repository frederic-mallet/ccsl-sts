package fr.aoste.sync.util;

import fr.aoste.sync.dynamic.util.DTSHelper;
import fr.aoste.sync.vspec.BooleanExpression;
import fr.aoste.sync.vspec.Comparison;
import fr.aoste.sync.vspec.ComparisonOperator;
import fr.aoste.sync.vspec.Conjunction;
import fr.aoste.sync.vspec.Difference;
import fr.aoste.sync.vspec.IntegerExpression;
import fr.aoste.sync.vspec.LiteralInteger;
import fr.aoste.sync.vspec.ValueSpecification;
import fr.aoste.sync.vspec.visitor.AvaluespecificationVisitor;

public class ValueSpecificationPrettyPrinter extends AvaluespecificationVisitor<CharSequence> {
	private StringBuilder sb;
	private DTSHelper helper;
	public ValueSpecificationPrettyPrinter(DTSHelper helper) {
		this(helper, new StringBuilder());
	}
	public ValueSpecificationPrettyPrinter(DTSHelper helper, StringBuilder sb) {
		super();
		this.helper = helper;
		this.sb = sb;
	}

	@Override
	public CharSequence visit(ValueSpecification e) {
		// TODO Auto-generated method stub
		return super.visit(e);
	}
	@Override
	public CharSequence visit(LiteralInteger e) {
		sb.append(e.getValue());
		return sb.toString();
	}
	@Override
	public CharSequence visit(Difference e) {
		e.getLeft().accept(this);
		sb.append("-");
		e.getRight().accept(this);
		return sb.toString();
	}
	@Override
	public CharSequence visit(Conjunction e) {
		String sep = "";
		for(BooleanExpression exp : e.getOperands()) {
			sb.append(sep);
			exp.accept(this);
			sep = ".";
		}
		return sb.toString();
	}
	@Override
	public CharSequence visit(Comparison e) {
		e.getLeft().accept(this);
		visit(e.getOperator());
		e.getRight().accept(this);
		return sb.toString();
	}
	@Override
	public CharSequence visit(ComparisonOperator op) {
		switch(op) {
		case EQUALS: sb.append("=="); break;
		case LESSOREQUAL: sb.append("<="); break;
		case LESSTHAN: sb.append("<"); break;
		case GREATEROREQUAL: sb.append(">="); break;
		case GREATERTHAN: sb.append(">"); break;
		}
		return sb;
	}
	@Override
	public CharSequence visit(IntegerExpression e) {
		// if here, it means it is a Chi or a ParameterReference
		return e.accept(new STSPrettyPrinter(helper, sb)).toString();
	}
}
