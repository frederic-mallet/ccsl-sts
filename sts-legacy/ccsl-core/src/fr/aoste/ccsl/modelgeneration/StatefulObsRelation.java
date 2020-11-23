package fr.aoste.ccsl.modelgeneration;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

import fr.aoste.ccsl.core.ICCSLClock;
import fr.aoste.ccsl.core.IState;
import fr.aoste.ccsl.core.ITransition;

final class StatefulObsRelation {
//	private String name;
	private IObserverClock[] clocks;
	private State initState;
	
	StatefulObsRelation(String name, Collection<ICCSLClock> clocks) {
		super();
//		this.name = name;
		assert(clocks.size()>=1);
		this.clocks = new IObserverClock[clocks.size()];
		clocks.toArray(this.clocks);
		initState = new State();
	}

	public IState getCurrentState() {
		return initState;
	}
	
	private int nb = 0;
	class State implements IState {
//		private boolean printed = false;
		private String name;
		private LinkedList<Transition> outgoing = new LinkedList<>();
		
		State() {
			this.name = "state"+nb++;
		}
		@Override
		public IState addTransition(ICCSLClock... clocks) {
			return addTransition(new State(), clocks);
		}

		@Override
		public IState addTransition(IState target, ICCSLClock... clocks) {
			outgoing.add(new Transition((State)target, clocks));
			return target;
		}
		
//		void print(JavaBlock block, String origin) {
//			if (printed) return;
//			printed = true;
//			block.addInstruction("IState "+name+" = "+origin);
//			for(Transition t : outgoing) {
//				State target = t.fire();
//				String sep = "";
//				StringBuilder sb = new StringBuilder();
//				for (ICCSLClock clock : t.clocks) {
//					sb.append(sep).append(clock);
//					sep = ", ";
//				}
//				if (target.printed) {
//					block.addInstruction(name+".addTransition("+target.name+", "+sb+")");
//				} else {
//					target.print(block, name+".addTransition("+sb+")");
//				}
//			}
//		}
	}	
	
	class Transition implements ITransition {
		private State target;
		private ICCSLClock[] clocks;
		private Transition(State target, ICCSLClock ...clocks) {
			this.target = target;
			this.clocks = clocks;
		}
		@Override
		public State fire() {
			return target;
		}
		@Override
		public String toString() {
			return "to "+target.name+" on "+Arrays.toString(clocks);
		}
	}
}
