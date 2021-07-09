package fr.aoste.ccsl.system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This class composes several builders together
 * 
 * @author fmallet
 *
 */
final public class MultipleBuilder implements ICCSLSystemBuilder<List<Object>>{
	/**
	 * Used for assigning a unique name
	 */
	private int count = 0;
	private String getNameForList(ArrayList<String> list) {
		String name = "__c"+count++;
		manyToSingle.put(name, list);
		return name;
	}
	/**
	 * 
	 * @param pos
	 * @param id Either the name of a genuine user clock or an id assigned by getNameForList
	 * @return if a genuine clock, returns id otherwise extract the clock within the list at postion pos
	 */
	private String idToClock(int pos, String id) {
		List<String> list = manyToSingle.get(id);
		if (list==null) return id;
		return list.get(pos);
	}

	/**
	 * Similar to idToClock but for an array
	 */
	private String[] adaptOperands(int pos, String... operands) {
		String [] res = new String[operands.length];
		for(int i = 0; i<res.length; i++)
			res[i] = idToClock(pos, operands[i]);
		return res;
	}
	
	
	/**
	 * Map the local unique name given to the list of names assigned by each builder 
	 */
	private HashMap<String, List<String>> manyToSingle = new HashMap<>();
 
	private ArrayList<ICCSLSystemBuilder<?>> builders = new ArrayList<>();
	public MultipleBuilder(ICCSLSystemBuilder<?> ... builders) {
		for(ICCSLSystemBuilder<?> builder : builders)
			this.builders.add(builder);
	}
	@Override
	public List<Object> getCCSLSystem() {
		ArrayList<Object> res = new ArrayList<>();
		for(ICCSLSystemBuilder<?> builder : builders)
			res.add(builder.getCCSLSystem());
		return res;
	}

	@Override
	public void addClock(String name, boolean local) {
		// nothing to do ?
	}
	@Override
	public void exclusion(String c1, String c2) {
		for (int i = 0; i<builders.size(); i++) {
			builders.get(i).exclusion(idToClock(i, c1), idToClock(i, c2));
		}
	}
	@Override
	public void coincides(String c1, String c2) {
		for (int i = 0; i<builders.size(); i++) {
			builders.get(i).coincides(idToClock(i, c1), idToClock(i, c2));
		}
	}
	
	@Override
	public void subclock(String left, String right) {
		for (int i = 0; i<builders.size(); i++) {
			builders.get(i).subclock(idToClock(i, left), idToClock(i, right));
		}		
	}

	@Override
	public void causes(String left, String right) {
		for (int i = 0; i<builders.size(); i++)
			builders.get(i).causes(idToClock(i, left), idToClock(i, right));
	}

	@Override
	public void precedes(String left, String right) {
		for (int i = 0; i<builders.size(); i++)
			builders.get(i).precedes(idToClock(i, left), idToClock(i, right));
	}

	@Override
	public void alternates(String left, String right) {
		for (int i = 0; i<builders.size(); i++)
			builders.get(i).alternates(idToClock(i, left), idToClock(i, right));
	}

	@Override
	public String union(String der, String... operands) {
		ArrayList<String> res = new ArrayList<>();
		for (int i = 0; i<builders.size(); i++) {
			res.add(builders.get(i).union(idToClock(i,der), adaptOperands(i, operands)));
		}
		return getNameForList(res);
	}

	@Override
	public String union(String der, String operand1, String operand2) {
		ArrayList<String> res = new ArrayList<>();
		for (int i = 0; i<builders.size(); i++) {
			res.add(builders.get(i).union(idToClock(i,der), idToClock(i, operand1), idToClock(i, operand2)));
		}
		return getNameForList(res);
	}

	@Override
	public String intersection(String der, String... operands) {
		ArrayList<String> res = new ArrayList<>();
		for (int i = 0; i<builders.size(); i++) {
			res.add(builders.get(i).intersection(idToClock(i,der), adaptOperands(i, operands)));
		}
		return getNameForList(res);
	}

	@Override
	public String intersection(String der, String operand1, String operand2) {
		ArrayList<String> res = new ArrayList<>();
		for (int i = 0; i<builders.size(); i++) {
			res.add(builders.get(i).intersection(idToClock(i,der), idToClock(i, operand1), idToClock(i, operand2)));
		}
		return getNameForList(res);
	}

	@Override
	public String inf(String der, String... operands) {
		ArrayList<String> res = new ArrayList<>();
		for (int i = 0; i<builders.size(); i++) {
			res.add(builders.get(i).inf(idToClock(i,der), adaptOperands(i, operands)));
		}
		return getNameForList(res);
	}

	@Override
	public String inf(String der, String operand1, String operand2) {
		ArrayList<String> res = new ArrayList<>();
		for (int i = 0; i<builders.size(); i++) {
			res.add(builders.get(i).inf(idToClock(i,der), idToClock(i, operand1), idToClock(i, operand2)));
		}
		return getNameForList(res);
	}

	@Override
	public String sup(String der, String... operands) {
		ArrayList<String> res = new ArrayList<>();
		for (int i = 0; i<builders.size(); i++) {
			res.add(builders.get(i).sup(idToClock(i,der), adaptOperands(i, operands)));
		}
		return getNameForList(res);
	}

	@Override
	public String sup(String der, String operand1, String operand2) {
		ArrayList<String> res = new ArrayList<>();
		for (int i = 0; i<builders.size(); i++) {
			res.add(builders.get(i).sup(idToClock(i,der), idToClock(i, operand1), idToClock(i, operand2)));
		}
		return getNameForList(res);
	}
	@Override
	public String filter(String der, String base, int every, int from) {
		ArrayList<String> res = new ArrayList<>();
		for (int i = 0; i<builders.size(); i++) {
			res.add(builders.get(i).filter(idToClock(i,der), idToClock(i, base), every, from));
		}
		return getNameForList(res);
	}
	@Override
	public void addSpecification(Object b) {
		for(ICCSLSystemBuilder<?> builder : builders) {
			builder.addSpecification(b);
		}
	}
}
