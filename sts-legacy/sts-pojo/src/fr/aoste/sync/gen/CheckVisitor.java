package fr.aoste.sync.gen;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import fr.aoste.sync.Chi;
import fr.aoste.sync.ComposedTransitionSystem;
import fr.aoste.sync.Event;
import fr.aoste.sync.FinalState;
import fr.aoste.sync.IstsVisitor;
import fr.aoste.sync.NamedElement;
import fr.aoste.sync.Parameter;
import fr.aoste.sync.ParameterBinding;
import fr.aoste.sync.ParameterReference;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.Transition;
import fr.aoste.sync.Trigger;
import fr.aoste.sync.Vertex;

public class CheckVisitor implements IstsVisitor<int[]> {
	private static int STATES = 0;
	private static int TRANSITIONS = 1;
	private static int GUARDS = 2;
	private static int SOFT_LOCKS = 3;
	private int[] statistics;
	private int[] nbTransitions;
	private HashSet<Event> events = new HashSet<>();
	
	static public int[] check(SynchronousTransitionSystem sts) {
		CheckVisitor visitor = new CheckVisitor();
		sts.accept(visitor);
		visitor.diagnostic();
		return visitor.statistics;
	}
	@Override
	public int[] visit(SynchronousTransitionSystem sts) {
		nbTransitions = new int[sts.getStates().size()];
		statistics = new int[4];
		for (Event event : sts.getEvents()) {
			event.accept(this);
		}
		for (State state : sts.getStates()) {
			state.accept(this);
		}
		for (Transition transition : sts.getTransitions()) {
			transition.accept(this);
		}
		for (int nbState = 0; nbState < nbTransitions.length; nbState++) {
			if (nbTransitions[nbState] == 0) {
				statistics[SOFT_LOCKS]++;
			}
		}
		return statistics;
	}

	@Override
	public int[] visit(NamedElement e) {
		return statistics;
	}

	@Override
	public int[] visit(Event e) {
		events.add(e);
		return statistics;
	}

	private HashMap<Vertex,Integer> stateToIndex = new HashMap<>();
	@Override
	public int[] visit(State state) {
		return visit((Vertex)state);
	}

	@Override
	public int[] visit(Vertex vertex) {
		stateToIndex.put(vertex, statistics[STATES]);
		statistics[STATES]++;
		return statistics;
	}

	@Override
	public int[] visit(FinalState state) {
		return visit((Vertex)state);
	}

	@Override
	public int[] visit(Parameter e) {
		return statistics;
	}

	@Override
	public int[] visit(Transition transition) {
		statistics[TRANSITIONS]++;
		nbTransitions[stateToIndex.get(transition.getSource())]++;
		if (transition.getGuard()!=null) statistics[GUARDS]++;
		transition.getTrigger().accept(this);
		return statistics;
	}

	@Override
	public int[] visit(Trigger trigger) {
		for (Event ev : trigger.getEvents())
			events.remove(ev);
		return statistics;
	}

	@Override
	public int[] visit(ParameterBinding e) {
		return statistics;
	}

	@Override
	public int[] visit(Chi e) {
		return statistics;
	}

	@Override
	public int[] visit(ParameterReference e) {
		return statistics;
	}

	@Override
	public int[] visit(ComposedTransitionSystem e) {
		for (SynchronousTransitionSystem sts : e.getSubsystems()) {
			sts.accept(this);
			diagnostic();
		}
		return statistics;
	}
	public int[] diagnostic() {
		System.out.println("Nb states: " + statistics[STATES]);
		System.out.println("Nb transitions: " + statistics[TRANSITIONS]);
		
		if (statistics[GUARDS] == 0) System.out.println("The STS is safe!");
		else System.out.println("Nb of guards: " + statistics[GUARDS]);
		
		if (statistics[SOFT_LOCKS] > 0) {
			System.out.println("Soft locks: " + statistics[SOFT_LOCKS]);
			String sep = "\t";
			for (int i = 0; i < nbTransitions.length; i++) {
				if (nbTransitions[i] == 0) {
					System.out.print(sep + "s" + i);
					sep = ", ";
				}
			}
			System.out.println("\n\t" + Arrays.toString(nbTransitions));
		} else System.out.println("No soft lock!");
		
		if (!events.isEmpty()) {
			System.err.print("Some clocks are never used:");
			for (Event ev : events) System.out.print(" " + ev.getName());
		}
		return statistics;
	}
}
