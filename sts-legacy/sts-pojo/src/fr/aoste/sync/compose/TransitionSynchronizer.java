package fr.aoste.sync.compose;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import fr.aoste.sync.Transition;
import fr.aoste.sync.dynamic.util.DTSRunner;

/**
 * Internal use only: Take the list of "fireable" transitions for each STS and build a list 
 * of SynchronizedTransitions by composing compatible transitions
 * 
 * @see DTSRunner
 * @author fmallet
 */
final public class TransitionSynchronizer implements Iterable<SynchronizedTransition> {
	private int numberOfSTS;
	private List<Transition>[] availableTransitions;
	private List<SynchronizedTransition> validSyncTransitions = new ArrayList<SynchronizedTransition>();

	public TransitionSynchronizer(List<MyState> vertices, CTSHelper helper) {
		this(vertices, helper, helper);
	}
	public TransitionSynchronizer(List<MyState> vertices, CTSHelper helper, ITransitionValidator validator) {
		this.numberOfSTS = vertices.size();

		this.availableTransitions = helper.buildListOfAvailableTransitions(vertices, validator);
		buildSynchronizedTransitions(helper);
	}

	private void buildSynchronizedTransitions(CTSHelper helper) {
		int[] progression = new int[numberOfSTS];
		Arrays.fill(progression, -1);

		while (true) {
			SynchronizedTransition st = new SynchronizedTransition(progression.length, helper); // one transition for each BTS	

// find a valid combination of transitions
			int progress = 0;
			do {
				// skip STS where there are no transition available
				while(progress<progression.length && availableTransitions[progress]==null) progress++;
				
				if (progress>=progression.length) return; // no more transition to treat 

				progression[progress]++;

				if (progression[progress]>=availableTransitions[progress].size()) {
					progression[progress]=-1;
					progress++;
				} else break;
			} while(progress<progression.length);
			if (progress>=progression.length)break; 
			
			for(int i = 0; i<progression.length; i++) {
				if (availableTransitions[i]== null // final State 
						|| 
						availableTransitions[i].isEmpty() // no fireable transition 
						||
						progression[i]==-1) // consider the case where this bts does not fire
					continue; // (does not prevent not synchronized BTS to work)
				st.set(i, availableTransitions[i].get(progression[i]));
			}
			if (st.check())
				validSyncTransitions.add(st);
		}
	}

	public boolean isEmpty() {return validSyncTransitions.isEmpty();}

	public SynchronizedTransition pickRandomSynchonizedTransition() {
		Random r = new Random();
		return validSyncTransitions.get(r.nextInt(validSyncTransitions.size()));
	}
	public Iterator<SynchronizedTransition> iterator() {
		return validSyncTransitions.iterator();
	}
	public SynchronizedTransition pick(int i) {
		return validSyncTransitions.get(i);
	}	
}