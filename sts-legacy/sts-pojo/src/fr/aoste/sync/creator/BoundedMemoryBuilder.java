package fr.aoste.sync.creator;

import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;

public class BoundedMemoryBuilder extends ACCSLStsBuilder<SynchronousTransitionSystem> {
	public static String CAPACITY = "capacity";
	public static String NBACTORS = "nbActors";
	public static String READ = "r";
	public static String WRITE = "w";
	
	private FactoryHelper helper = new FactoryHelper();

	@Override
	public SynchronousTransitionSystem create() {		
		int capacity = getIntParameterValue(CAPACITY, 1);
		if (capacity<1) throw new RuntimeException("BoundedMemoryBuilder: Invalid capacity "+capacity);

		int nbActors = getIntParameterValue(NBACTORS, 1);
		if (nbActors<1) throw new RuntimeException("BoundedMemoryBuilder: Invalid nb of actors "+nbActors);
		
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem("MEM("+capacity+", "+nbActors+")");
		Actor[] actors = new Actor[nbActors];
		
		for(int i = 0; i<nbActors; i++) {
			actors[i] = new Actor(i+1);
			if (actors[i].read>capacity) 
				throw new RuntimeException("BoundedMemoryBuilder: Invalid actor read "+actors[i].read+" > "+capacity);
			if (actors[i].write>capacity) 
				throw new RuntimeException("BoundedMemoryBuilder: Invalid actor write "+actors[i].write+" > "+capacity);
		}			

		State[] states = new State[capacity+1];
		
		for(int i=0; i<=capacity; i++) {
			states[i] = helper.createState("M"+i);
		}
		sts.setInitial(states[0]);

		for(int size=0; size<=capacity; size++) { // For all sizes
			for (int indActor = 0; indActor<nbActors; indActor++) { // For all actors
				Actor a = actors[indActor];
				// read before write.
				if ((a.read == 0 || size>=a.read)   // I have enough tokens to read
						&& a.execute(size)<=capacity) { // && I do not overload the memory
					helper.createTransition(states[size], states[a.execute(size)], a.event);
				}
			}
		}

		return sts;
	}

	class Actor {
		Event event;
		int read, write;
		Actor(int num) {
			event = helper.createEvent("a"+num);
			read = getIntParameterValue(READ+num, 0);
			if (read<0) throw new RuntimeException("BoundedMemoryBuilder: Invalid actor read "+read);
			write = getIntParameterValue(WRITE+num, 0);
			if (write<0) throw new RuntimeException("BoundedMemoryBuilder: Invalid actor write "+write);
		}
		int execute(int actualSize) {
			return actualSize+write-read;
		}
	}
}
