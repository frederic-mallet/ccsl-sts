package fr.aoste.sts;

public interface IEvent {

	void setSync(SyncVector<?> syncVector);

	Object getName();

}
