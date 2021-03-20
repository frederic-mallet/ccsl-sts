package fr.kairos.lightccsl.sts;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class AFireable implements IFireable {
	@Override
	public void fire(int step, String... clocks) {
		System.out.print(step);
		for (String c : clocks)
		{
			fire(c);
		}
		System.out.println();
	}

	private void fire(String c) {
		try {
			Method m = this.getClass().getMethod(c);
			m.invoke(this);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			System.out.print(" " + c);
		}
	}
}
