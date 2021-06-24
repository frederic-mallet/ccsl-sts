package fr.aoste.sync.gen;

import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.Transition;
import fr.aoste.sync.Trigger;
import fr.aoste.sync.ta.states.MyLocationFactory;
import fr.aoste.sync.visitor.AstsVisitor;

public class STStoTA extends AstsVisitor<CharSequence> {
	private StringBuilder builder = new StringBuilder();
	private String tab;
	private MyLocationFactory factory = new MyLocationFactory();
	private SynchronousTransitionSystem sts;

	@Override
	public StringBuilder visit(SynchronousTransitionSystem sts) {
		this.sts = sts;
		builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>").append('\n');
		builder.append("<!DOCTYPE nta PUBLIC '-//Uppaal Team//DTD Flat System 1.1//EN' 'http://www.it.uu.se/research/group/darts/uppaal/flat-1_1.dtd'>").append('\n');
		builder.append("<nta>").append('\n');
		builder.append("\t<declaration></declaration>").append('\n');
		builder.append("\t<template>").append('\n');
		builder.append("\t\t<name x=\"5\" y=\"5\">Spec</name>").append('\n');
		builder.append("\t\t<declaration>");

		String sep="bool ";
		for(Event e : sts.getEvents()) {
			super.visit(e); // only for diagnostic
			builder.append(sep).append(e.getName());
			sep=", ";
		}
		builder.append(";</declaration>").append('\n');

		tab = "\t\t";

		for(State s : sts.getStates())
			s.accept(this);

		builder.append(tab).append("<init ref=\"");
		builder.append(factory.getId(sts.getInitial()));
		builder.append("\"/>\n");

		for(Transition t : sts.getTransitions())
			t.accept(this);

		builder.append("\t</template>").append('\n');
		builder.append("\t<system>").append('\n');
		builder.append("\t\t").append(sts.getName()).append(" = Spec();\n\n");
		builder.append("\t\tsystem ").append(sts.getName()).append(";\n");
		builder.append("\t</system>").append('\n');
		builder.append("</nta>").append('\n');
		
		return builder;
	}

	@Override
	public StringBuilder visit(State s) {
		super.visit(s);
		builder.append(tab);
		factory.buildLocation(s, builder);
		builder.append('\n');
		return builder;
	}

	@Override
	public StringBuilder visit(Transition t) {
		super.visit(t); // only for diagnostic
		
		//<transition><source ref="id9"/><target ref="id1"/><label kind="assignment" x="120" y="128">in1=1,in2=1,step1=1,step2=1,out=0</label><nail x="136" y="128"/><nail x="336" y="128"/></transition>		
		builder.append(tab);
		factory.buildTransition(t, builder);
		visit(t.getTrigger());
		builder.append("</label>");		
		builder.append("</transition>");
		builder.append('\n');
		return builder;
	}

	boolean showOneOnly = true;

	@Override
	public StringBuilder visit(Trigger trigger) {
		String sep="";
		for(Event e : sts.getEvents()) {
			if (showOneOnly && !trigger.getEvents().contains(e)) continue;
			super.visit(e); // for diagnostic
			builder.append(sep);
			builder.append(e.getName());
			if(trigger.getEvents().contains(e))
				builder.append("=1");
			else 
				builder.append("=0");
			sep=",";
		}
		return builder;
	}
}
