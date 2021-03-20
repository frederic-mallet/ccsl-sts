package fr.kairos.lightccsl.sts;

import fr.aoste.sync.SynchronousTransitionSystem;
import fr.kairos.timesquare.ccsl.simple.AUtility;

public interface ISTSBackend<T> {
	T treat(AUtility utility, SynchronousTransitionSystem sts, String name);
}
