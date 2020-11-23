package fr.aoste.sync.compose;

import fr.aoste.sync.Transition;
import fr.aoste.sync.dynamic.util.DTSHelper;

/**
 * Used to select which transitions must be considered or no
 * @see DTSHelper Works with the value of EventCounter, accepts only transitions with valid guards
 * @see CTSHelper works statically and accepts all transitions
 * @author fmallet
 *
 */
public interface ITransitionValidator {
	public boolean isGuardValid(Transition t);
}
