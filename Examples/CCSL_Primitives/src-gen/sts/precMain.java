package sts;

import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.compose.STSParallelComposer;
import fr.aoste.sync.dynamic.util.DTSRunner;
import fr.aoste.sync.dynamic.util.DefaultFiringTransitionListener;

public class precMain
{
	static public void main(String[] args)
	{
		precFireable _fire = new precFireable();
		prec _instance = new prec();
		SynchronousTransitionSystem sts = _instance.create();
		STSParallelComposer composer = new STSParallelComposer(sts);
		DTSRunner runner = DTSRunner.create(composer);
		DefaultFiringTransitionListener l = new DefaultFiringTransitionListener();
		runner.setListener(l);
		for (int i = 0; i < 10; i++)
		{
			runner.fireRandomValidTransition();
			_fire.fire(i, l.firedClocksAsArray());
		}
	}
}

