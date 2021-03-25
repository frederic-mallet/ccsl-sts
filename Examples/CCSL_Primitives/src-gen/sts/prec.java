package sts;

import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.creator.FactoryHelper;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import static fr.aoste.sync.creator.InvariantBuilder.diff;
import fr.aoste.sync.vspec.ComparisonOperator;
import static fr.aoste.sync.creator.InvariantBuilder.inv;
import fr.aoste.sync.Transition;

public class prec extends ACCSLStsBuilder<SynchronousTransitionSystem>
{
	private FactoryHelper helper = new FactoryHelper();
	public SynchronousTransitionSystem create()
	{
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem("prec");
		
		Event e0 = helper.createEvent("a");
		Event e1 = helper.createEvent("b");
		
		State s0 = helper.createState("p0");
		s0.setInvariant(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS));
		State s1 = helper.createState("pi");
		s1.setInvariant(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL));
		sts.setInitial(s0);
		
		helper.createTransition(s0, s1, e0);
		// no header
		{
			Transition t = helper.createTransition(s1, s0, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		}
		helper.createTransition(s1, s1, e0);
		helper.createTransition(s1, s1, e0, e1);
		// no header
		{
			Transition t = helper.createTransition(s1, s1, e1);
			t.setGuard(inv(diff(e0, e1), 1, ComparisonOperator.GREATERTHAN));
		}
		
		return sts;
	}
}

