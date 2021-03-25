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
	public String union(String der, String ... operands) {
		if (operands.length==0) throw new RuntimeException("cannot make the union of nothing");
		
		return union(der, 0, operands);
	}
	private String union(String der, int pos, String ... operands) { 
		assert (operands.length-pos>=2); // comes from the public method
		if (operands.length-pos==1) return operands[pos];
	
		return union(pos==0?der:(der+pos), operands[pos], union(der, pos+1, operands));
	}

	/* (non-Javadoc)
	 * @see fr.aoste.sync.compose.ICCSLSpecification#intersection(java.lang.String)
	 */
	@Override
	public String intersection(String der, String ... operands) {
		if (operands.length==0) throw new RuntimeException("cannot make the intersection of nothing");
		
		return intersection(der, 0, operands);
	}
	private String intersection(String der, int pos, String ... operands) { 
		assert (operands.length-pos>=2); // comes from the public method
		if (operands.length-pos==1) return operands[pos];
	
		return intersection(pos==0?der:(der+pos), operands[pos], intersection(der, pos+1, operands));
	}
	
	/* (non-Javadoc)
	 * @see fr.aoste.sync.compose.ICCSLSpecification#inf(java.lang.String)
	 */
	@Override
	public String inf(String der, String ... operands) {
		if (operands.length==0) throw new RuntimeException("cannot make the inf of nothing");
		
		return inf(der, 0, operands);
	}
	private String inf(String der, int pos, String ... operands) { 
		assert (operands.length-pos>=2); // comes from the public method
		if (operands.length-pos==1) return operands[pos];
	
		return inf(pos==0?der:(der+pos), operands[pos], inf(der, pos+1, operands));
	}
	
	/* (non-Javadoc)
	 * @see fr.aoste.sync.compose.ICCSLSpecification#sup(java.lang.String)
	 */
	@Override
	public String sup(String der, String ... operands) {
		if (operands.length==0) throw new RuntimeException("cannot make the sup of nothing");
		
		return sup(der, 0, operands);
	}
	private String sup(String der, int pos, String ... operands) { 
		assert (operands.length-pos>=2); // comes from the public method
		if (operands.length-pos==1) return operands[pos];
	
		return sup(pos==0?der:(der+pos), operands[pos], sup(der, pos+1, operands));
	}	
}
