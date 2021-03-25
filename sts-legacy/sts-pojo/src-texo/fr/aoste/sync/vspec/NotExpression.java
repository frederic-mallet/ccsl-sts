package fr.aoste.sync.vspec;

/**
 * The negation of a boolean expression
 * 
 * @author fmallet
 *
 */
public class NotExpression implements BooleanExpression {
	private BooleanExpression operand;
	
	public NotExpression(BooleanExpression op) {
		super();
		this.operand = op;
	}

	@Override
	public Object accept(IvaluespecificationVisitor<?> visiteur) {
		return visiteur.visit(this);
	}

	public BooleanExpression getOperand() {
		return operand;
	}
}
