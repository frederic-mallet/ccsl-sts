package fr.aoste.sync.gen;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.LinkedList;

import fr.aoste.sync.Chi;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.Transition;
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
import fr.kairos.common.java.Block;
import fr.kairos.common.java.ClassBlock;
import fr.kairos.common.java.JavaElementList;
import fr.kairos.common.java.PrettyPrintJavaVisitor;
import fr.kairos.common.java.Statement;

public class STStoJava extends AstsVisitor<CharSequence> {
	private ClassBlock javaClass;
	private JavaElementList createBody;
	
	private void init(String name) {
		javaClass = new ClassBlock("sts", name);
		javaClass.addExtends("ACCSLStsBuilder<SynchronousTransitionSystem>");
		javaClass.addImport("fr.aoste.sync.SynchronousTransitionSystem");
		javaClass.addImport("fr.aoste.sts.ACCSLStsBuilder");		
		
		javaClass.addPrivateField("fr.aoste.sync.creator.FactoryHelper", "helper", true);
		createBody = javaClass.addMethod("public SynchronousTransitionSystem create()");
		createBody.ins("SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem(").
				s(name).c(")");	
		JavaElementList _main = javaClass.addMain();
		_main.ins(name + " _instance = new " + name + "()");
		_main.ins("SynchronousTransitionSystem sts = _instance.create()");
		_main.lv("fr.aoste.sync.compose.STSParallelComposer", "composer = new STSParallelComposer(sts)");
		_main.lv("fr.aoste.sync.dynamic.util.DTSRunner", "runner = DTSRunner.create(composer)");
		_main.lv("fr.aoste.sync.dynamic.util.DefaultFiringTransitionListener", "l = new DefaultFiringTransitionListener()");
		_main.ins("runner.setListener(l)");
		
		Block _forBlock = new Block(javaClass, "for (int i = 0; i < 10; i++)");
		_main.add(_forBlock);
		JavaElementList _forBody = _forBlock.body();
		_forBody.ins("runner.fireRandomValidTransition()");
		_forBody.ins("System.out.print(i)");
		_forBody.ins("for (String c : l.firedClocks()) System.out.print(\" \" + c)");
		_forBody.ins("System.out.println();");
	}
	@Override
	public CharSequence visit(SynchronousTransitionSystem sts) {
		init(sts.getName());
		
		treat("sts", sts.getInvariant(), "Invariant");
		
		// events
		createBody.newLine();
		int ie = 0;
		for (Event e : sts.getEvents()) {
			eventToIndex.put(e.getName(), ie++);
			e.accept(this);
		}

		//states
		createBody.newLine();
		int is = 0;
		for(State s : sts.getStates()) {
			stateToIndex.put(s, is++);
			s.accept(this);
		}
		createBody.ins("sts.setInitial(").c(st(sts.getInitial())).pc();
		
		//transitions
		createBody.newLine();
		for(Transition t : sts.getTransitions()) {
			t.accept(this);
		}
		
		createBody.newLine();
		createBody.ins("return sts");
		
		StringWriter sw = new StringWriter();
		PrettyPrintJavaVisitor jv = new PrettyPrintJavaVisitor(sw);
		javaClass.accept(jv);
		
		return sw.getBuffer();
	}

	private HashMap<String,Integer> eventToIndex = new HashMap<>();
	@Override
	public CharSequence visit(Event e) {
		createBody.lv("fr.aoste.sync.Event", ev(e)).c(" = helper.createEvent(").s(e.getName()).pc();
		return null;
	}
	private HashMap<State,Integer> stateToIndex = new HashMap<>();
	@Override
	public CharSequence visit(State s) {
		String stateName = st(s);
		createBody.lv("fr.aoste.sync.State", stateName).c(" = helper.createState(").s(s.getName()).pc();
		treat(stateName, s.getInvariant(), "Invariant");
		return null;
	}
	private String ev(Event e) {
		String name;
		if (e.getSync() == null) name = e.getName();
		else name = e.getSync().getName();
		Integer res = eventToIndex.get(name);
		if (res == null) return null;
		return "e" + res;
	}
	private String st(State s) {
		return "s" + stateToIndex.get(s);
	}
	@Override
	public CharSequence visit(Transition t) {		
		JavaElementList body = createBody;
		BooleanExpression guard = t.getGuard();
		String decl = "";
		if (guard != null) {
			Block newBody = new Block(javaClass, "// no header");
			body.add(newBody);
			body = newBody.body();
			decl = "Transition t = ";
			javaClass.addImport("fr.aoste.sync.Transition");
		}
		Statement st = body.ins(decl).c("helper.createTransition(").c(st(t.getSource())).c(", ").c(st((State)t.getTarget()));
		for (Event ev : t.getTrigger().getEvents()) {
			st.c(", ").c(ev(ev));
		}
		st.pc();
		treat(body, "t", guard, "Guard");
		return null;
	}
	
	class MyBEVisitor implements IvaluespecificationVisitor<CharSequence> {
		@Override
		public CharSequence visit(BooleanExpression e) {
			return "\"" + e.toString() + "\"";
		}

		@Override
		public CharSequence visit(ValueSpecification e) {
			return "\"" + e.toString() + "\"";
		}

		@Override
		public CharSequence visit(IntegerExpression e) {
			if (e instanceof Chi) {
				Chi chi = (Chi)e;
				Event ev = chi.getEvent();
				return ev(ev);
			}
			return "\"" + e.toString() + "\"";
		}

		@Override
		public CharSequence visit(LiteralInteger e) {
			return e + "";
		}

		@Override
		public CharSequence visit(Difference e) {
			Object left = e.getLeft().accept(this);
			if (left == null) return null;
			Object right = e.getRight().accept(this);
			if (right == null) return null;
			javaClass.addImport("static fr.aoste.sync.creator.InvariantBuilder.diff");
			return "diff(" + left + ", " + right + ")";
		}

		@Override
		public CharSequence visit(Conjunction e) {
			LinkedList<CharSequence> op = new LinkedList<>();
			for (BooleanExpression be : e.getOperands()) {
				Object o = be.accept(this);
				if (o == null) continue;
				op.add(o.toString());
			}
			if (op.size() == 0) return null;
			if (op.size() == 1) return op.get(0);
			javaClass.addImport("static fr.aoste.sync.creator.InvariantBuilder.conjunction");
			return "conjunction(" + (String.join(", ", op)) + ")";
		}

		@Override
		public CharSequence visit(Comparison e) {
			Object left = e.getLeft().accept(this);
			if (left == null) return null;
			Object right = e.getRight().accept(this);
			if (right == null) return null;
			CharSequence op = visit(e.getOperator());
			
			javaClass.addImport("static fr.aoste.sync.creator.InvariantBuilder.inv");
			return "inv(" + left + ", " + right + ", " + op + ")";
		}

		@Override
		public CharSequence visit(ComparisonOperator e) {
			javaClass.addImport("fr.aoste.sync.vspec.ComparisonOperator");
			return "ComparisonOperator." + e.name();
		}
		
	}
	private void treat(String varName, BooleanExpression be, String methodName) {
		treat(createBody, varName, be, methodName);
	}
	private void treat(JavaElementList body, String varName, BooleanExpression be, String methodName) {
		if (be == null) return;
		MyBEVisitor v = new MyBEVisitor();
		Object res = be.accept(v);
		if (res != null)
			body.ins(varName).c(".set" + methodName + "(").c(res==null?"\"null\"":res.toString()).pc();
	}
}
