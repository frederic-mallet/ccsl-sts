package sts;

import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.creator.FactoryHelper;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import static fr.aoste.sync.creator.InvariantBuilder.diff;
import fr.aoste.sync.vspec.ComparisonOperator;
import static fr.aoste.sync.creator.InvariantBuilder.inv;
import static fr.aoste.sync.creator.InvariantBuilder.conjunction;
import fr.aoste.sync.Transition;

public class modes extends ACCSLStsBuilder<SynchronousTransitionSystem>
{
	private FactoryHelper helper = new FactoryHelper();
	public SynchronousTransitionSystem create()
	{
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem("modes");
		
		Event e0 = helper.createEvent("Mode1");
		Event e1 = helper.createEvent("Mode2");
		Event e2 = helper.createEvent("Trigger");
		Event e3 = helper.createEvent("Delay");
		
		State s0 = helper.createState("UxXxinitxp0xp0");
		s0.setInvariant(conjunction(inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS)));
		State s1 = helper.createState("UxXxinitxpixp0");
		s1.setInvariant(conjunction(inv(diff(e2, e3), 0, ComparisonOperator.EQUALS), inv(diff(e2, e3), 0, ComparisonOperator.EQUALS)));
		State s2 = helper.createState("UxXxd1xp0xpi");
		s2.setInvariant(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL)));
		State s3 = helper.createState("UxXxd1xpixpi");
		s3.setInvariant(conjunction(inv(diff(e2, e3), 1, ComparisonOperator.EQUALS), inv(diff(e2, e3), 1, ComparisonOperator.GREATEROREQUAL)));
		sts.setInitial(s0);
		
		helper.createTransition(s0, s1, e0);
		helper.createTransition(s0, s1, e1);
		helper.createTransition(s1, s1, e0);
		helper.createTransition(s1, s1, e1);
		// no header
		{
			Transition t = helper.createTransition(s1, s2, e2);
		}
		helper.createTransition(s1, s3, e0, e2);
		helper.createTransition(s1, s3, e1, e2);
		// no header
		{
			Transition t = helper.createTransition(s1, s3, e2);
		}
		helper.createTransition(s2, s3, e0);
		helper.createTransition(s2, s3, e1);
		helper.createTransition(s3, s3, e0);
		helper.createTransition(s3, s3, e1);
		// no header
		{
			Transition t = helper.createTransition(s3, s2, e2, e3);
		}
		helper.createTransition(s3, s3, e0, e2, e3);
		helper.createTransition(s3, s3, e1, e2, e3);
		// no header
		{
			Transition t = helper.createTransition(s3, s3, e2, e3);
		}
		
		return sts;
	}
}

