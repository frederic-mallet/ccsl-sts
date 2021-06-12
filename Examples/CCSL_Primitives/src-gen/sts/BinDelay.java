package sts;

import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.creator.FactoryHelper;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import static fr.aoste.sync.creator.InvariantBuilder.diff;
import fr.aoste.sync.vspec.ComparisonOperator;
import static fr.aoste.sync.creator.InvariantBuilder.inv;

public class BinDelay extends ACCSLStsBuilder<SynchronousTransitionSystem>
{
	private FactoryHelper helper = new FactoryHelper();
	public SynchronousTransitionSystem create()
	{
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem("BinDelay");
		
		Event e0 = helper.createEvent("a");
		Event e1 = helper.createEvent("b");
		
		State s0 = helper.createState("init");
		s0.setInvariant(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS));
		State s1 = helper.createState("d1");
		s1.setInvariant(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		State s2 = helper.createState("d2");
		s2.setInvariant(inv(diff(e0, e1), 2, ComparisonOperator.EQUALS));
		State s3 = helper.createState("d3");
		s3.setInvariant(inv(diff(e0, e1), 3, ComparisonOperator.EQUALS));
		State s4 = helper.createState("d4");
		s4.setInvariant(inv(diff(e0, e1), 4, ComparisonOperator.EQUALS));
		State s5 = helper.createState("d5");
		s5.setInvariant(inv(diff(e0, e1), 5, ComparisonOperator.EQUALS));
		sts.setInitial(s0);
		
		helper.createTransition(s0, s1, e0);
		helper.createTransition(s1, s2, e0);
		helper.createTransition(s2, s3, e0);
		helper.createTransition(s3, s4, e0);
		helper.createTransition(s4, s5, e0);
		helper.createTransition(s5, s5, e0, e1);
		
		return sts;
	}
}

