package fr.aoste.sync.creator;

import fr.aoste.sync.Chi;
import fr.aoste.sync.Event;
import fr.aoste.sync.vspec.BooleanExpression;
import fr.aoste.sync.vspec.Comparison;
import fr.aoste.sync.vspec.ComparisonOperator;
import fr.aoste.sync.vspec.Conjunction;
import fr.aoste.sync.vspec.Difference;
import fr.aoste.sync.vspec.LiteralInteger;
import fr.aoste.sync.vspec.ValuespecificationFactory;

// chi(src)-chi(tgt) op val
public class InvariantBuilder {
	static public Difference diff(Event src, Event tgt) {
		Difference diff = new Difference();
		Chi chiS = new Chi();
		chiS.setEvent(src);
		diff.setLeft(chiS);
		Chi chiT = new Chi();
		chiT.setEvent(tgt);
		diff.setRight(chiT);
		return diff;
	}
	static public Comparison inv(Event src, Event tgt, int val, ComparisonOperator op) {
		return inv(diff(src, tgt), val, op);
	}
	static public Comparison inv(Difference diff, int val, ComparisonOperator op) {
		Comparison comp = new Comparison();
		LiteralInteger right = new LiteralInteger();
		right.setValue(val);
		comp.setRight(right);
		comp.setOperator(op);
		
		comp.setLeft(diff);
		
		return comp;
	}
	
	static public Conjunction conjunction(BooleanExpression ...booleanExpressions) {
		Conjunction c = ValuespecificationFactory.eINSTANCE.createConjunction();
		for(BooleanExpression exp : booleanExpressions)
			c.getOperands().add(exp);
		return c;
	}
	
}
