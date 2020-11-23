package fr.aoste.sts;

/**
 * Generic abstraction to build a STS, independently of whether it is a emf.SynchronousTransitionSystem or a sync.SynchronousTransitionSystem
 * @author fmallet
 *
 * @param <STS>
 */
public interface STSBuilder<STS> {
	void setParameterValue(String parameterName, Object value);
	STS create();
}
