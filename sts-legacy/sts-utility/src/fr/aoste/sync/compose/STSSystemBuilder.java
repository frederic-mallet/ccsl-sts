package fr.aoste.sync.compose;

import java.util.LinkedList;
import java.util.List;

import fr.aoste.ccsl.system.ACCSLSystemBuilder;
import fr.aoste.ccsl.system.AntiAliasCCSLSystemBuilder;
import fr.aoste.ccsl.system.ICCSLSystemBuilder;
import fr.aoste.ccsl.system.basic.BasicCCSLSpecification;
import fr.aoste.ccsl.system.basic.SystemBuilderVisitor;
import fr.aoste.sts.STSBuilder;
import fr.aoste.sync.Event;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.creator.CCSLStsFactory;

final public class STSSystemBuilder extends ACCSLSystemBuilder<SynchronousTransitionSystem> {
	private static final String LEFT = "left", RIGHT = "right";
	private static final String DERIVED = "derived", C1 = "c1", C2 = "c2";
	private STSBuilder<SynchronousTransitionSystem> causes = CCSLStsFactory.INSTANCE.createCausesBuilder(LEFT, RIGHT);
	private STSBuilder<SynchronousTransitionSystem> precedes = CCSLStsFactory.INSTANCE.createPrecedesBuilder(LEFT, RIGHT);
	private STSBuilder<SynchronousTransitionSystem> alternates = CCSLStsFactory.INSTANCE.createAlternatesBuilder(LEFT, RIGHT);
	private STSBuilder<SynchronousTransitionSystem> excludes = CCSLStsFactory.INSTANCE.createExcludesBuilder(LEFT, RIGHT);
	private STSBuilder<SynchronousTransitionSystem> subclock = CCSLStsFactory.INSTANCE.createSubclockBuilder(LEFT, RIGHT);
	private STSBuilder<SynchronousTransitionSystem> inf = CCSLStsFactory.INSTANCE.createInfBuilder(DERIVED, C1, C2);
	private STSBuilder<SynchronousTransitionSystem> sup = CCSLStsFactory.INSTANCE.createSupBuilder(DERIVED, C1, C2);

	private List<Binding> bindings = new LinkedList<>();
	private List<SynchronousTransitionSystem> systems = new LinkedList<>();

	private List<String> localClocks = new LinkedList<>();

	static public ICCSLSystemBuilder<SynchronousTransitionSystem> buildParallelSystemBuilder() {
		return new AntiAliasCCSLSystemBuilder<>(new STSSystemBuilder(new ParallelSpecificationComposer()));
	}
	static public ICCSLSystemBuilder<SynchronousTransitionSystem> buildSequentialSystemBuilder() {
		return new AntiAliasCCSLSystemBuilder<>(new STSSystemBuilder(new SequentialSpecificationComposer()));
	}
	public STSSystemBuilder() { // Could be made private to avoid problems, but useful when no use of coincides
		this(new ParallelSpecificationComposer());
	}
	private ICCSLSpecificationComposer composer;
	public STSSystemBuilder(ICCSLSpecificationComposer composer) {
		this.composer = composer;
	}
	/* (non-Javadoc)
	 * @see fr.aoste.sync.compose.ICCSLSpecification#causes(java.lang.String, java.lang.String)
	 */
	@Override
	public void causes(String left, String right) {
		binRelation (left, right, causes.create());
	}

	@Override
	public void subclock(String left, String right) {
		binRelation(left, right, subclock.create());
	}
	/* (non-Javadoc)
	 * @see fr.aoste.sync.compose.ICCSLSpecification#precedes(java.lang.String, java.lang.String)
	 */
	@Override
	public void precedes(String left, String right) {
		binRelation(left, right, precedes.create());
	}

	/* (non-Javadoc)
	 * @see fr.aoste.sync.compose.ICCSLSpecification#alternates(java.lang.String, java.lang.String)
	 */
	@Override
	public void alternates(String left, String right) {
		binRelation(left, right, alternates.create());
	}

	@Override
	public void exclusion(String left, String right) {
		binRelation(left, right, excludes.create());
	}
	
	/* (non-Javadoc)
	 * @see fr.aoste.sync.compose.ICCSLSpecification#union(java.lang.String)
	 */
	@Override
	public String union(String ... operands) {
		assert(operands.length>=2);
		int num = systems.size();
		String[] names = new String[operands.length];
		for(int i = 0; i<names.length; i++) names[i] = "u"+i;

		SynchronousTransitionSystem sts =  CCSLStsFactory.INSTANCE.createUnionBuilder("u", names).create();
		systems.add(sts);

		String derived=""; 
		String sep="u_";
		for(int i = 0; i<operands.length; i++) {
			bindings.add(new Binding(operands[i],  num,  names[i]));
			derived += sep + operands[i];
			sep = "_";
		}
		bindings.add(new Binding(derived,  num,  "u"));

		localClocks.add(derived);

		return derived;
	}
	@Override
	public String union(String operand1, String operand2) {
		return union(new String[] {operand1, operand2});
	}

	/* (non-Javadoc)
	 * @see fr.aoste.sync.compose.ICCSLSpecification#intersection(java.lang.String)
	 */
	@Override
	public String intersection(String ... operands) {
		assert(operands.length>=2);
		int num = systems.size();
		String[] names = new String[operands.length];
		for(int i = 0; i<names.length; i++) names[i] = "i"+i;

		SynchronousTransitionSystem sts =  CCSLStsFactory.INSTANCE.createIntersectionBuilder("i", names).create();
		systems.add(sts);

		String derived=""; 
		String sep="i_";
		for(int i = 0; i<operands.length; i++) {
			bindings.add(new Binding(operands[i],  num,  names[i]));
			derived += sep + operands[i];
			sep = "_";
		}
		bindings.add(new Binding(derived,  num,  "i"));

		localClocks.add(derived);

		return derived;
	}
	@Override
	public String intersection(String operand1, String operand2) {
		return intersection(new String[] {operand1, operand2});
	}
	
	@Override
	public String inf(String operand1, String operand2) {
		return binExpression(inf.create(), operand1, operand2);
	}

	@Override
	public String sup(String operand1, String operand2) {
		return binExpression(sup.create(), operand1, operand2);
	}

	@Override
	public String filter(String base, int every, int from) {
		int num = systems.size();
		STSBuilder<SynchronousTransitionSystem> ex;
		if (every == 1) 
			ex = CCSLStsFactory.INSTANCE.createDelayBuilder(base, "expr"+num, from, false);
		else
			ex = CCSLStsFactory.INSTANCE.createPeriodicBuilder(base, "expr"+num, every, from);
		
		systems.add(ex.create());
		localClocks.add("expr"+num);
		bindings.add(new Binding(base, num, base));
		bindings.add(new Binding("expr" + num, num, "expr"+ num));
		return "expr"+num;
	}
	
	private String binExpression(SynchronousTransitionSystem sts,
			String op1, String op2) {
		int num = systems.size();
		systems.add(sts);
		bindings.add(new Binding(op1,  num,  C1));
		bindings.add(new Binding(op2,  num,  C2));
		bindings.add(new Binding("expr"+num, num, DERIVED));

		localClocks.add("expr"+num);

		return "expr"+num;
	}
	private void binRelation(String left, String right, SynchronousTransitionSystem sts) {
		int num = systems.size();
		systems.add(sts);
		bindings.add(new Binding(left,  num,  LEFT));
		bindings.add(new Binding(right,  num,  RIGHT));
	}	

	public void addConstraint(SynchronousTransitionSystem sts, String ...local) {
		assert(local.length%2==0);
		
		int num = systems.size();
		systems.add(sts);
		for (int i = 0; i<local.length; i+=2) {
			bindings.add(new Binding(local[i], num, local[i+1]));
		}
	}

	@Override
	public void coincides(String c1, String c2) {
		throw new RuntimeException("coincides:Should be intercepted by the AntiAlias decorator");
	}
	
	public void setComposer(ICCSLSpecificationComposer composer) {
		this.composer = composer;
	}
	@Override
	public SynchronousTransitionSystem getCCSLSystem() {
		return composer.treat(systems, bindings, localClocks);
	}
	@Override
	public void addSpecification(ICCSLSystemBuilder<?> builder) {
		Object o = builder.getCCSLSystem();
		SynchronousTransitionSystem sts = null;
		if (o instanceof SynchronousTransitionSystem) {
			sts = (SynchronousTransitionSystem)o;
		} else if (o instanceof BasicCCSLSpecification) {
			// Makes the parallel composition of the local specification
			// If that was not the intent, then could have flattened the spec calling precedes, alternates, ...
			ICCSLSystemBuilder<SynchronousTransitionSystem> localBuilder = buildParallelSystemBuilder();
			SystemBuilderVisitor visitor = new SystemBuilderVisitor(localBuilder);
			BasicCCSLSpecification spec = (BasicCCSLSpecification) o;
			spec.accept(visitor);
			sts = localBuilder.getCCSLSystem();
		} else
			throw new RuntimeException("Do not know what to do with "+o);

		int num = systems.size();
		sts.setName("intern"+systems.size());
		systems.add(sts);
		for(Event e : sts.getEvents()) {
			bindings.add(new Binding(e.getName(), num, e.getName()));
		}
	}
}
