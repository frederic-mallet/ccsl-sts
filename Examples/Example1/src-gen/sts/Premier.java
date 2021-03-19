package sts;

import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.creator.FactoryHelper;
import fr.aoste.sync.compose.STSParallelComposer;
import fr.aoste.sync.dynamic.util.DTSRunner;
import fr.aoste.sync.dynamic.util.DefaultFiringTransitionListener;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import static fr.aoste.sync.creator.InvariantBuilder.diff;
import fr.aoste.sync.vspec.ComparisonOperator;
import static fr.aoste.sync.creator.InvariantBuilder.inv;
import static fr.aoste.sync.creator.InvariantBuilder.conjunction;

public class Premier extends ACCSLStsBuilder<SynchronousTransitionSystem>
{
	private FactoryHelper helper = new FactoryHelper();
	public SynchronousTransitionSystem create()
	{
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem("Premier");
		
		Event e0 = helper.createEvent("a");
		Event e1 = helper.createEvent("b");
		Event e2 = helper.createEvent("c");
		
		State s0 = helper.createState("p0xp0xX");
		s0.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS)));
		State s1 = helper.createState("pixp0xX");
		s1.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 0, ComparisonOperator.EQUALS)));
		State s2 = helper.createState("p0xpixX");
		s2.setInvariant(conjunction(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL)));
		State s3 = helper.createState("pixpixX");
		s3.setInvariant(conjunction(inv(diff(e0, e1), 1, ComparisonOperator.GREATEROREQUAL), inv(diff(e1, e2), 1, ComparisonOperator.GREATEROREQUAL)));
		sts.setInitial(s0);
		
		helper.createTransition(s0, s1, e0);
		helper.createTransition(s1, s2, e1);
		helper.createTransition(s1, s1, e0);
		helper.createTransition(s1, s3, e0, e1);
		helper.createTransition(s2, s3, e0);
		helper.createTransition(s2, s0, e2);
		helper.createTransition(s3, s2, e1);
		helper.createTransition(s3, s3, e0);
		helper.createTransition(s3, s3, e0, e1);
		helper.createTransition(s3, s1, e2);
		helper.createTransition(s3, s2, e1, e2);
		
		return sts;
	}
	static public void main(String[] args)
	{
		Premier _instance = new Premier();
		SynchronousTransitionSystem sts = _instance.create();
		STSParallelComposer composer = new STSParallelComposer(sts);
		DTSRunner runner = DTSRunner.create(composer);
		DefaultFiringTransitionListener l = new DefaultFiringTransitionListener();
		runner.setListener(l);
		for (int i = 0; i < 10; i++)
		{
			runner.fireRandomValidTransition();
			System.out.print(i);
			for (String c : l.firedClocks()) System.out.print(" " + c);
			System.out.println();;
		}
	}
}

