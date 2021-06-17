package fr.aoste.ccsl.system.basic;

import java.util.Iterator;
import java.util.LinkedList;

import fr.aoste.ccsl.system.ICCSLSystemBuilder;

/**
 * Builds an internal model of a Basic CCSL Specification without 
 * any assumption on how it should be used later contrary to the ICCSLSystemBuilder
 * that assumes a particular usage
 *  
 * @author fmallet
 *
 */
public class BasicCCSLSpecification 
implements ICCSLSystemBuilder<BasicCCSLSpecification>, ICCSLSpecificationElement, 
Iterable<ICCSLSpecificationElement>{
	private LinkedList<ICCSLSpecificationElement> elements = new LinkedList<>();

	@Override
	public BasicCCSLSpecification getCCSLSystem() {
		return this;
	}

	@Override
	public void addClock(String name, boolean local) {
		// nothing to do
	}

	@Override
	public void causes(String left, String right) {
		elements.add(new Causality(left, right));
	}

	@Override
	public void precedes(String left, String right) {
		elements.add(new Precedence(left, right));
	}

	@Override
	public void alternates(String left, String right) {
		elements.add(new Alternation(left, right));
	}

	@Override
	public void subclock(String left, String right) {
		elements.add(new Subclock(left, right));
	}
	@Override
	public void coincides(String c1, String c2) {
		elements.add(new Coincidence(c1, c2));
	}

	@Override
	public void exclusion(String left, String right) {
		elements.add(new Exclusion(left, right));
	}

	@Override
	public String union(String der, String... operands) {
		Union u = new Union(der, operands);
		elements.add(u);
		return der;
	}

	@Override
	public String union(String der, String operand1, String operand2) {
		Union u = new Union(der, operand1, operand2);
		elements.add(u);
		return der;
	}

	@Override
	public String intersection(String der, String... operands) {
		Intersection u = new Intersection(der, operands);
		elements.add(u);
		return der;
	}

	@Override
	public String intersection(String der, String operand1, String operand2) {
		Intersection u = new Intersection(operand1, operand2);
		elements.add(u);
		return der;
	}

	@Override
	public String filter(String der, String base, int every, int from) {
		Filter f = new Filter(der, base, every, from);
		elements.add(f);
		return der;
	}

	@Override
	public String inf(String der, String... operands) {
		Infimum inf = new Infimum(der, operands);
		elements.add(inf);
		return der;
	}

	@Override
	public String inf(String der, String operand1, String operand2) {
		Infimum inf = new Infimum(der, operand1, operand2);
		elements.add(inf);
		return der;
	}

	@Override
	public String sup(String der, String... operands) {
		Supremum sup = new Supremum(der, operands);
		elements.add(sup);
		return der;
	}

	@Override
	public String sup(String der, String operand1, String operand2) {
		Supremum sup = new Supremum(der, operand1, operand2);
		elements.add(sup);
		return der;
	}

	@Override
	public void addSpecification(ICCSLSystemBuilder<?> spec) {
		if (spec instanceof BasicCCSLSpecification) {
			elements.add((BasicCCSLSpecification)spec);
		} else
			throw new RuntimeException("Do not know what to do with that "+spec);
	}

	@Override
	public void accept(ICCSLSpecificationVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public Iterator<ICCSLSpecificationElement> iterator() {
		return elements.iterator();
	}
}
