package lccsl;

import fr.kairos.timesquare.ccsl.ISimpleSpecification;

public class JavaToC implements ISimpleSpecification {
	public JavaToC() {
		System.out.println("void precedence(char * left, char* right) {}");		
		System.out.println("void main() {");
	}
	@Override
	public void addClock(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void subclock(String left, String right) {
		System.out.println("void subclock(char* left, char* right) {");
		System.out.println("}");
	}

	@Override
	public void exclusion(String left, String right) {
		// TODO Auto-generated method stub

	}

	@Override
	public void precedence(String left, String right) {
		System.out.println("  precedence(\"" + left + "\", \"" + right + "\")");
	}

	@Override
	public void precedence(String left, String right, int min, int max) {
		// TODO Auto-generated method stub

	}

	@Override
	public void causality(String left, String right) {
		// TODO Auto-generated method stub

	}

	@Override
	public void causality(String left, String right, int min, int max) {
		// TODO Auto-generated method stub

	}

	@Override
	public void inf(String defClock, String... clocks) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sup(String defClock, String... clocks) {
		// TODO Auto-generated method stub

	}

	@Override
	public void union(String defClock, String... clocks) {
		// TODO Auto-generated method stub

	}

	@Override
	public void intersection(String defClock, String... clocks) {
		// TODO Auto-generated method stub

	}

	@Override
	public void minus(String defClock, String... clocks) {
		// TODO Auto-generated method stub

	}

	@Override
	public void periodic(String defClock, String ref, int period, int from, int upTo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delayFor(String defClock, String ref, int from, int upTo, String base) {
		// TODO Auto-generated method stub

	}

}
