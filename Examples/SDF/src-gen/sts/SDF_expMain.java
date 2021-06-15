package sts;

import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.compose.STSParallelComposer;
import fr.aoste.sync.dynamic.util.DTSRunner;
import fr.aoste.sync.dynamic.util.DefaultFiringTransitionListener;

public class SDF_expMain
{
	static public void main(String[] args)
	{
		SDF_expFireable _fire = new SDF_expFireable();
		SDF_exp _instance = new SDF_exp();
		SynchronousTransitionSystem sts = _instance.create();
		STSParallelComposer composer = new STSParallelComposer(sts);
		DTSRunner runner = DTSRunner.create(composer);
		DefaultFiringTransitionListener l = new DefaultFiringTransitionListener();
		runner.setListener(l);
		for (int i = 0; i < 100; i++)
		{
			runner.fireRandomValidTransition();
			_fire.fire(i, l.firedClocksAsArray());
		}
	}
}

