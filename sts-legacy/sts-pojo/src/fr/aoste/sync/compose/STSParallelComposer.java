package fr.aoste.sync.compose;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import fr.aoste.sts.IEvent;
import fr.aoste.sts.SyncVector;
import fr.aoste.sync.ComposedTransitionSystem;
import fr.aoste.sync.Event;
import fr.aoste.sync.Parameter;
import fr.aoste.sync.ParameterBinding;
import fr.aoste.sync.StsFactory;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.Transition;
import fr.aoste.sync.linearprogramming.InvariantHelperFactory;
import fr.aoste.sync.util.STSHelper;
import fr.aoste.sync.vspec.LiteralInteger;
import fr.aoste.sync.vspec.ValuespecificationFactory;

public class STSParallelComposer {
	private ComposedTransitionSystem cts;
	public ComposedTransitionSystem getCts() {
		return cts;
	}
	private HashMap<String,SyncEvent> syncMap = new HashMap<String,SyncEvent>();
	private CTSHelper helper;

	public STSParallelComposer(SynchronousTransitionSystem ...systems) {
		assert(systems.length>0) : "Must at least have one BasicTransition System";
		cts = StsFactory.eINSTANCE.createComposedTransitionSystem();
		for(SynchronousTransitionSystem bts : systems) {
			if (cts.getSubsystems().contains(bts))
				throw new RuntimeException("Cannot add several times the same sts");
			cts.getSubsystems().add(bts);
		}
		helper = new CTSHelper(cts);
		InvariantHelperFactory.getHelper().setCTSHelper(helper);
	}
	STSParallelComposer(ComposedTransitionSystem cts) {
		this.cts = cts;
		helper = new CTSHelper(cts);
		InvariantHelperFactory.getHelper().setCTSHelper(helper);
	}

	public void bindParameter(String name, int value) {
		Parameter param = helper.getParameterByName(name);
		ParameterBinding binding = helper.getParameterBindingByParameter(param);
		if (binding == null) {
			binding = StsFactory.eINSTANCE.createParameterBinding();
			cts.getPBindings().add(binding);
			binding.setFormal(param);
		}
		LiteralInteger spec = ValuespecificationFactory.eINSTANCE.createLiteralInteger();
		spec.setValue(value);
		binding.setValue(spec);
	}

	public SyncEvent synchronize(String name) {
		SyncEvent se = syncMap.get(name);
		if (se==null) {
			se = new SyncEvent(name);
			syncMap.put(name, se);
		}
		return se;
	}

	public SynchronousTransitionSystem getComposedSTS(String name) {
		SynchronizedState.clear(); // needs to clear the cache of Synchronized states (big mistake in using the factory !
		SynchronousTransitionSystem sts = StsFactory.eINSTANCE.createSynchronousTransitionSystem();
		sts.setName(name);
		helper.buildSyncEventForStandaloneEvents();

		HashMap<SyncVector<? extends IEvent>, Event> syncMap = new HashMap<>();
		for(SyncVector<? extends IEvent> vec : cts.getVectors()){
			Event e = StsFactory.eINSTANCE.createEvent();
			e.setName(vec.getName());
			sts.getEvents().add(e);
			syncMap.put(vec, e);
		}

		// deal with the initial state
		List<MyState> initialStates = new ArrayList<>();
		helper.fillWithInitialState(initialStates);

		SynchronizedState current = SynchronizedState.getSynchronizedState(initialStates, helper);
		if (current.isInvalid()) return sts;
		sts.setInitial(current.getState());

		// push the initial state into the list of states to explore
		List<SynchronizedState> stateToExplore = new LinkedList<SynchronizedState>();
		stateToExplore.add(current);
		helper.startMonitoring();
		do {
			current = stateToExplore.remove(0);

			assert(helper.log(current)); // Within an assert => remove -ea to ignore this instruction
			
			sts.getStates().add(current.getState());

			current.buildTransitions(helper, stateToExplore, syncMap);

			for(Transition t : current.outgoing)
				sts.getTransitions().add(t);

		} while (!stateToExplore.isEmpty());
		return sts;
	}
	public class SyncEvent {
		SyncVector<Event> sv;
		SyncEvent(String name) {
			sv = new SyncVector<Event>(cts.getSubsystems().size());
			sv.setName(name);
			cts.getVectors().add(sv);
		}
		/**
		 * @param num Number of BasicTransitionSystem
		 * @param name Name of the event to synchronize in the BasicTransitionSystem
		 * @return this (for commodity only)
		 */
		public SyncEvent bind(int num, String name) {
			Event ev = STSHelper.getEventByName(cts.getSubsystems().get(num), name);
			if (ev==null) throw new RuntimeException("Event "+name+" not found in STS num "+num);
			if (ev.getSync()!=null) throw new RuntimeException("Event "+ev+" is already bound to "+ev.getSync().getName());
			sv.set(num, ev);
			return this;
		}
		public SyncEvent bind(String name) {
			return bind(0, name);
		}
	}
}
