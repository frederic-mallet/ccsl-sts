package fr.kairos.lightccsl.sts;

import java.util.ArrayList;
import java.util.List;

import fr.aoste.sync.Event;
import fr.aoste.sync.Transition;
import fr.aoste.sync.compose.SynchronizedTransition;
import fr.aoste.sync.compose.TransitionSynchronizer;
import fr.aoste.sync.dynamic.util.DTSRunner;
import fr.kairos.lightccsl.core.stepper.ClockStatus;
import fr.kairos.lightccsl.core.stepper.INameToIntegerMapper;
import fr.kairos.lightccsl.core.stepper.ISolutionSet;
import fr.kairos.lightccsl.core.stepper.IStep;

class DTSRunnerToSolution implements ISolutionSet {
	private DTSRunner runner;
	private INameToIntegerMapper nameToInteger;
	
	DTSRunnerToSolution(DTSRunner runner, INameToIntegerMapper mapper) {
		this.runner = runner;
		this.nameToInteger = mapper;
	}

	@Override
	public List<IStep> allSolutions() throws Exception {
		ArrayList<IStep> res = new ArrayList<>();
		TransitionSynchronizer fireable = runner.getFireableTransitions();
		for (SynchronizedTransition st : fireable) {
			res.add(transitionToStep(st));
		}
		return res;
	}

	@Override
	public IStep pickOneSolution() throws Exception {
		TransitionSynchronizer fireable = runner.getFireableTransitions();
		SynchronizedTransition syncTransition = fireable.pickRandomSynchonizedTransition();
		return transitionToStep(syncTransition);
	}

	private IStep transitionToStep(SynchronizedTransition syncTransition) {
		MyStep currentStep = new MyStep(syncTransition);
		for (Transition t : syncTransition) {
			for (Event e : t.getTrigger().getEvents()) {
				String clockName;
				if (e.getSync().getName() == null)
					clockName = e.getName();
				else
					clockName = e.getSync().getName();
				int clockId = nameToInteger.getIdFromName(clockName);
				currentStep.status[clockId] = true;
			}
		}
		return currentStep;
	}
	
	class MyStep implements IStep {
		boolean[] status = new boolean[runner.getNbCounters()];
		private SynchronizedTransition synchronizedTransition;
		
		MyStep(SynchronizedTransition syncTransition) {
			this.synchronizedTransition = syncTransition; 
		}

		@Override
		public ClockStatus status(int pos) {
			return status[pos]?ClockStatus.Must:ClockStatus.Cannot;
		}

		@Override
		public int size() {
			return nameToInteger.size();
		}

		@Override
		public void tick() {
			runner.fire(synchronizedTransition);
		}
	}
}
