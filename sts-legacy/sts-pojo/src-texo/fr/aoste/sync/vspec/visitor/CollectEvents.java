package fr.aoste.sync.vspec.visitor;

import java.util.LinkedList;
import java.util.List;

import fr.aoste.sync.Chi;
import fr.aoste.sync.Event;
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

public class CollectEvents extends AstsVisitor<Event> implements IvaluespecificationVisitor<List<Event>> {
	private LinkedList<Event> events = new LinkedList<>();
	
	@Override
	public List<Event> visit(BooleanExpression e) {
		return this.events;
	}

	@Override
	public List<Event> visit(ValueSpecification e) {
		return this.events;
	}

	@Override
	public List<Event> visit(IntegerExpression e) {
		if (e instanceof Chi)
			this.events.add(visit((Chi)e));		
		return this.events;
	}

	@Override
	public List<Event> visit(LiteralInteger e) {
		return this.events;
	}

	@Override
	public List<Event> visit(Difference e) {
		e.getLeft().accept(this);
		e.getRight().accept(this);
		return this.events;
	}

	@Override
	public List<Event> visit(Conjunction e) {
		for (BooleanExpression be : e.getOperands())
			be.accept(this);
		return this.events;
	}

	@Override
	public List<Event> visit(Comparison e) {
		e.getLeft().accept(this);
		e.getRight().accept(this);
		return this.events;
	}

	@Override
	public List<Event> visit(ComparisonOperator e) {
		return this.events;
	}
	
	@Override
	public Event visit(Chi e) {
		return e.getEvent();
	}
}
