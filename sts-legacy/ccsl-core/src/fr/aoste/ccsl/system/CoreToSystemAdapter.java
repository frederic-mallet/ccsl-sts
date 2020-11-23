package fr.aoste.ccsl.system;

import java.util.ArrayList;
import java.util.HashMap;

import fr.aoste.ccsl.core.ICCSLClock;
import fr.aoste.ccsl.core.ICCSLSpecification;

/**
 * This class is to use core.ICCSLSpecification (like JavaBuilder, extendedSpecificationBuilder) called
 * the simple API of system.ICCSLSystemBuilder
 * 
 * @author fmallet
 */
public class CoreToSystemAdapter<RESULT> implements ICCSLSystemBuilder<RESULT> {
	private ICCSLSpecification<RESULT> toAdapt; // Object to adapt
	
	private HashMap<String, ICCSLClock> nameToClock = new HashMap<>();
	
	static public <RESULT> ICCSLSystemBuilder<RESULT> buildAdapter(ICCSLSpecification<RESULT> toAdapt) {
		return new AntiAliasCCSLSystemBuilder<>(new CoreToSystemAdapter<>(toAdapt));
	}
	private CoreToSystemAdapter(ICCSLSpecification<RESULT> toAdapt) {
		super();
		this.toAdapt = toAdapt;
	}

	private ICCSLClock getClock(String clockName) {
		ICCSLClock clock = nameToClock.get(clockName);
		if (clock==null) {
			clock = toAdapt.buildClock(clockName);
			nameToClock.put(clockName, clock);
		}
		return clock;
	}
	private ArrayList<ICCSLClock> namesToList(String ... clockNames) {
		ArrayList<ICCSLClock> clocks = new ArrayList<>();
		for(String op : clockNames) clocks.add(getClock(op));
		return clocks;
	}
	@Override
	public void causes(String left, String right) {
		toAdapt.addCauses(getClock(left), getClock(right));
	}

	@Override
	public void precedes(String left, String right) {
		toAdapt.addPrecedes(getClock(left), getClock(right));
	}

	@Override
	public void exclusion(String left, String right) {
		toAdapt.addExclusion(getClock(left), getClock(right));
	}
	
	@Override
	public void subclock(String left, String right) {
		toAdapt.addSubclock(getClock(left), getClock(right));
	}
	
	@Override
	public void alternates(String left, String right) {
		toAdapt.addConstraint("Alternates").bind("LEFT", left).bind("RIGHT", right);
	}

	@Override
	public void coincides(String c1, String c2) {
		throw new RuntimeException(this+":coincides should not be called:must be intercepted by a decorator treating aliases in a generic way");		
	}

	@Override
	public String union(String... clockNames) {
		ICCSLClock res = toAdapt.addUnion(namesToList(clockNames));
		return res.toString();
	}

	@Override
	public String union(String operand1, String operand2) {
		return union(new String[]{operand1, operand2});
	}

	@Override
	public String intersection(String... clockNames) {
		ICCSLClock res = toAdapt.addIntersection(namesToList(clockNames));
		return res.toString();
	}

	@Override
	public String intersection(String operand1, String operand2) {
		return intersection(new String[]{operand1, operand2});
	}

	@Override
	public String inf(String... clockNames) {
		ICCSLClock res = toAdapt.addInfimum(namesToList(clockNames));
		return res.toString();
	}

	@Override
	public String inf(String operand1, String operand2) {
		return inf(new String[]{operand1, operand2});
	}

	@Override
	public String sup(String... clockNames) {
		ICCSLClock res = toAdapt.addSupremum(namesToList(clockNames));
		return res.toString();
	}

	@Override
	public String sup(String operand1, String operand2) {
		return sup(new String[]{operand1, operand2});
	}

	@Override
	public RESULT getCCSLSystem() {
		return toAdapt.getContext();
	}
	@Override
	public void addSpecification(ICCSLSystemBuilder<?> builder) {
		System.err.println("Unsupported adding of user-defined relations");
	}
	@Override
	public String filter(String base, int every, int from) {
		ICCSLClock res = toAdapt.addFilter(getClock(base), every, from);
		return res.toString();
	}
}
