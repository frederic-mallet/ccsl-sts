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

public class Altern extends ACCSLStsBuilder<SynchronousTransitionSystem>
{
	private FactoryHelper helper = new FactoryHelper();
	public SynchronousTransitionSystem create()
	{
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem("Altern");
		
		Event e0 = helper.createEvent("a");
		Event e1 = helper.createEvent("b");
		
		State s0 = helper.createState("A0");
		s0.setInvariant(inv(diff(e0, e1), 0, ComparisonOperator.EQUALS));
		State s1 = helper.createState("A1");
		s1.setInvariant(inv(diff(e0, e1), 1, ComparisonOperator.EQUALS));
		sts.setInitial(s0);
		
		helper.createTransition(s0, s1, e0);
		helper.createTransition(s1, s0, e1);
		
		return sts;
	}
	static public void main(String[] args)
	{
		Altern _instance = new Altern();
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

