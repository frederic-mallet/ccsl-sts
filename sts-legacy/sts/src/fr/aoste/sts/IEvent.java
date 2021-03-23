package fr.aoste.sts;

/**
 * An event has an atomic occurrence and can be synchronized with other events in other STS
 * See Synchronization Vector from Arnold/Nivat:
 * Arnold A. Finite Transition Systems: Semantics of Communicating Systems. Hertfordshire: Prentice-Hall, 1994
 *
 * @author fmallet
 *
 */
public interface IEvent {

	void setSync(SyncVector<?> syncVector);

	Object getName();

}
