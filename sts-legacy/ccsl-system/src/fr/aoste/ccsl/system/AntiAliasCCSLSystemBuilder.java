package fr.aoste.ccsl.system;

import java.util.HashMap;

/**
 * Decorator to remove aliases due to coincides expressions !
 * 
 * @author fmallet
 *
 * @param <RESULT>
 */
final public class AntiAliasCCSLSystemBuilder<RESULT> implements ICCSLSystemBuilder<RESULT> {
	private ICCSLSystemBuilder<RESULT> decorated;
	public AntiAliasCCSLSystemBuilder(ICCSLSystemBuilder<RESULT> toDecorate) {
		this.decorated = toDecorate;
	}

	@Override
	public void addLocalClock(String name) {
		this.decorated.addLocalClock(name);
	}

	/**
	 * @param name may be an alias
	 * @return concrete name of the alias
	 */
	private String resolveAlias(String name) {
		return resolve(name, null);
	}
	
	@Override
	public RESULT getCCSLSystem() {
		return decorated.getCCSLSystem();
	}

	@Override
	public void causes(String left, String right) {
		decorated.causes(resolveAlias(left), resolveAlias(right));
	}

	@Override
	public void precedes(String left, String right) {
		decorated.precedes(resolveAlias(left), resolveAlias(right));
	}

	@Override
	public void alternates(String left, String right) {
		decorated.alternates(resolveAlias(left), resolveAlias(right));
	}

	@Override
	public void exclusion(String left, String right) {
		decorated.exclusion(resolveAlias(left), resolveAlias(right));
	}
	
	@Override
	public void subclock(String left, String right) {
		decorated.subclock(resolveAlias(left), resolveAlias(right));
	}
	
	private HashMap<String, String> aliases = new HashMap<>();
	@Override
	public void coincides(String c1, String c2) {
		if (c1.equals(c2)) return; // nothing to do
		
		String tgtC1 = resolve(c1, c2); 
		if (tgtC1==null) return; // C2 is already on the path down c1;
		
		String tgtC2 = resolve(c2, c1); // tries to make acyclic trees and not graphs!
		if (tgtC2!=null) {
			aliases.put(tgtC2, c1); // aliases are built backwards to make trees.
		}
	}
	
	// avoid is used to prevent cyclic aliases
	private String resolve(String name, String avoid) {
		String res = aliases.get(name);
		if (res==null) return name;
		if (res==avoid) return null;
		return resolve(res, avoid); 
	}	

	@Override
	public String union(String der, String... operands) {
		String[] ops = new String[operands.length];
		for(int i=0;i<operands.length;i++)
			ops[i]=resolveAlias(operands[i]);
		return decorated.union(der, ops);
	}

	@Override
	public String union(String der, String operand1, String operand2) {
		return decorated.union(resolveAlias(der), resolveAlias(operand1), resolveAlias(operand2));
	}

	@Override
	public String intersection(String der, String... operands) {
		String[] ops = new String[operands.length];
		for(int i=0;i<operands.length;i++)
			ops[i]=resolveAlias(operands[i]);
		return decorated.intersection(resolveAlias(der), ops);
	}

	@Override
	public String intersection(String der, String operand1, String operand2) {
		return decorated.intersection(resolveAlias(der), resolveAlias(operand1), resolveAlias(operand2));
	}

	@Override
	public String inf(String der, String... operands) {
		String[] ops = new String[operands.length];
		for(int i=0;i<operands.length;i++)
			ops[i]=resolveAlias(operands[i]);
		return decorated.inf(resolveAlias(der), ops);
	}

	@Override
	public String inf(String der, String operand1, String operand2) {
		return decorated.inf(resolveAlias(der), resolveAlias(operand1), resolveAlias(operand2));
	}

	@Override
	public String sup(String der, String... operands) {
		String[] ops = new String[operands.length];
		for(int i=0;i<operands.length;i++)
			ops[i]=resolveAlias(operands[i]);
		return decorated.sup(resolveAlias(der), ops);
	}

	@Override
	public String sup(String der, String operand1, String operand2) {
		return decorated.sup(resolveAlias(operand1), resolveAlias(operand2));
	}

	@Override
	public void addSpecification(ICCSLSystemBuilder<?> builder) {
		decorated.addSpecification(builder);
	}

	@Override
	public String filter(String der, String base, int every, int from) {
		return decorated.filter(resolveAlias(der), resolveAlias(base), every, from);
	}
}
