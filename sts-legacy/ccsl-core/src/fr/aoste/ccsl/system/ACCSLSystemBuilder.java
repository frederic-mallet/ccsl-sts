package fr.aoste.ccsl.system;

/**
 * This class just unfold the nary operators into n-1 calls to binary operators
 * Some algorithm may require not to unfold can override to directly implement the interface
 * 
 * @author fmallet
 *
 * @param <RESULT> same as required by ICCSLSpecification
 */
abstract public class ACCSLSystemBuilder<RESULT> implements ICCSLSystemBuilder<RESULT> {
	
	/* (non-Javadoc)
	 * @see fr.aoste.sync.compose.ICCSLSpecification#union(java.lang.String)
	 */
	@Override
	public String union(String ... operands) {
		if (operands.length==0) throw new RuntimeException("cannot make the union of nothing");
		
		return union(0, operands);
	}
	private String union(int pos, String ... operands) { 
		assert (operands.length-pos>=2); // comes from the public method
		if (operands.length-pos==1) return operands[pos];
	
		return union(operands[pos], inf(pos+1, operands));
	}

	/* (non-Javadoc)
	 * @see fr.aoste.sync.compose.ICCSLSpecification#intersection(java.lang.String)
	 */
	@Override
	public String intersection(String ... operands) {
		if (operands.length==0) throw new RuntimeException("cannot make the intersection of nothing");
		
		return intersection(0, operands);
	}
	private String intersection(int pos, String ... operands) { 
		assert (operands.length-pos>=2); // comes from the public method
		if (operands.length-pos==1) return operands[pos];
	
		return intersection(operands[pos], inf(pos+1, operands));
	}
	
	/* (non-Javadoc)
	 * @see fr.aoste.sync.compose.ICCSLSpecification#inf(java.lang.String)
	 */
	@Override
	public String inf(String ... operands) {
		if (operands.length==0) throw new RuntimeException("cannot make the inf of nothing");
		
		return inf(0, operands);
	}
	private String inf(int pos, String ... operands) { 
		assert (operands.length-pos>=2); // comes from the public method
		if (operands.length-pos==1) return operands[pos];
	
		return inf(operands[pos], inf(pos+1, operands));
	}
	
	/* (non-Javadoc)
	 * @see fr.aoste.sync.compose.ICCSLSpecification#sup(java.lang.String)
	 */
	@Override
	public String sup(String ... operands) {
		if (operands.length==0) throw new RuntimeException("cannot make the sup of nothing");
		
		return sup(0, operands);
	}
	private String sup(int pos, String ... operands) { 
		assert (operands.length-pos>=2); // comes from the public method
		if (operands.length-pos==1) return operands[pos];
	
		return sup(operands[pos], sup(pos+1, operands));
	}	
}
