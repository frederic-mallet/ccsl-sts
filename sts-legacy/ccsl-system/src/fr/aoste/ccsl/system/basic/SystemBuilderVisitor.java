package fr.aoste.ccsl.system.basic;

import java.util.HashMap;

import fr.aoste.ccsl.system.ICCSLSystemBuilder;
	
/**
 * Visit a BasicCCSLSpecification and invokes the 
 * builder
 * Adapts the names from one system to the other
 * 
 * @author fmallet
 *
 */
public class SystemBuilderVisitor extends ACCSLSpecificationVisitor {
	private ICCSLSystemBuilder<?> builder;
	private CompositionKind kind;
	
	static public enum CompositionKind {
		FLATTEN_SPECIFICATION, BUILD_ILOTS;
	}
	public SystemBuilderVisitor(ICCSLSystemBuilder<?> builder) {
		this(builder, CompositionKind.FLATTEN_SPECIFICATION);
	}
	public SystemBuilderVisitor(ICCSLSystemBuilder<?> builder, CompositionKind kind) {
		super();
		this.builder = builder;
		this.kind = kind;
	}
	
	private boolean firstVisit = true;
	
	@Override
	public void visit(BasicCCSLSpecification specification) {
		if (firstVisit || kind==CompositionKind.FLATTEN_SPECIFICATION) {
			firstVisit = false;
			super.visit(specification);
		} else {
			// Should provoke the parallel composition of the local specification			
			builder.addSpecification(specification);
		}
	}
	
	@Override
	public void visit(Causality cause) {
		builder.causes(adapt(cause.getLeftClock()), adapt(cause.getRightClock()));
	}

	@Override
	public void visit(Precedence precedence) {
		builder.precedes(adapt(precedence.getLeftClock()), adapt(precedence.getRightClock()));
	}

	@Override
	public void visit(Alternation alternation) {
		builder.alternates(adapt(alternation.getLeftClock()), adapt(alternation.getRightClock()));
	}

	@Override
	public void visit(Subclock relation) {
		builder.subclock(adapt(relation.getLeftClock()), adapt(relation.getRightClock()));
	}
	
	@Override
	public void visit(Coincidence coincidence) {
		builder.coincides(adapt(coincidence.getLeftClock()), adapt(coincidence.getRightClock()));
	}
	@Override
	public void visit(Union union) {
		builder.union(union.getName(), adapt(union.getOperands()));
	}
	@Override
	public void visit(Exclusion relation) {
		excludes(relation.getLeftClock(), relation.getRightClock());
	}
	@Override
	public void visit(ExclusiveUnion expr) {
		builder.union(expr.getName(), adapt(expr.getOperands()));
		excludes(0, expr.getOperands());
	}
	private void excludes(int pos, String...operands) {
		for (int i = pos+1; i < operands.length; i++) {
			excludes(operands[pos], operands[i]);
		}
		excludes(1, operands);
	}
	private void excludes(String left, String right) {
		builder.exclusion(adapt(left), adapt(right));
	}
	
	@Override
	public void visit(Intersection expression) {
		builder.intersection(expression.getName(), adapt(expression.getOperands()));
	}
	
	@Override
	public void visit(Infimum expression) {
		builder.inf(expression.getName(), adapt(expression.getOperands()));
	}
	@Override
	public void visit(Supremum expression) {
		builder.sup(expression.getName(),  adapt(expression.getOperands()));
	}
	
	@Override
	public void visit(Filter expression) {
		builder.filter(expression.getName(), (expression.getOperands()[0]), expression.getEvery(), expression.getFrom());
	}

	// The builder has its own naming convention for expressions
	// adapt makes the name adaptation between the convention of the BasicCCSLSpecification and the builder
	
	private HashMap<String, String> nameMappings = new HashMap<>();
	
	private String[] adapt(String[] names){
		String[] res = new String[names.length];
		for(int i = 0; i<names.length;i++) {
			res[i] = adapt(names[i]);
		}
		return res;
	}
	private String adapt(String name) {
		String res = nameMappings.get(name);
		if (res==null) return name;
		return res;
	}
}
