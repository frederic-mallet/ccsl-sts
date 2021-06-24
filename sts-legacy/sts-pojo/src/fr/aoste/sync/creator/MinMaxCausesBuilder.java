package fr.aoste.sync.creator;

import fr.aoste.sts.ACCSLStsBuilder;
import fr.aoste.sync.Event;
import fr.aoste.sync.State;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.Transition;
import fr.aoste.sync.vspec.ComparisonOperator;

class MinMaxCausesBuilder extends ACCSLStsBuilder<SynchronousTransitionSystem> {
	static String INIT = "init";
	static String MAX = "max";
	
	private FactoryHelper helper = new FactoryHelper();

	@Override
	public SynchronousTransitionSystem create() {
		String leftName = getStringParameterValue(CausesBuilder.LEFTCLOCK, "left");
		String rightName = getStringParameterValue(CausesBuilder.RIGHTCLOCK, "right");
		int init = getIntParameterValue(INIT, 0);
		int max = getIntParameterValue(MAX, -1);
		
		SynchronousTransitionSystem sts = helper.createSynchronousTransitionSystem(leftName+" <= "+rightName);

		Event leftEvent = helper.createEvent(leftName);

		Event rightEvent = helper.createEvent(rightName);

		State p0 = helper.createState("L");
		p0.setInvariant(InvariantBuilder.inv(leftEvent, rightEvent, -init, ComparisonOperator.EQUALS));

		State pi = helper.createState("M");
		pi.setInvariant(InvariantBuilder.inv(leftEvent, rightEvent, -init+1, ComparisonOperator.GREATEROREQUAL));

		if (init == 0) {
			sts.setInitial(p0);
		} else {
			sts.setInitial(pi);
		}
		
		{ // p0 -> pi (left)
			helper.createTransition(p0, pi, leftEvent);
		}
		{ // p0 -> p0 (left.right)
			helper.createTransition(p0, p0, leftEvent, rightEvent);
		}
		{ // pi -> p0 ([delta==-init+1]right)
			Transition rightT = helper.createTransition(pi, p0, rightEvent);
			rightT.setGuard(InvariantBuilder.inv(leftEvent, rightEvent, -init+1, ComparisonOperator.EQUALS));
		}
		{ // pi -> pi (left.right)
			helper.createTransition(pi, pi, leftEvent, rightEvent);
		}
		{ // pi -> pi ([delta>=-init+2]right)
			Transition rightT = helper.createTransition(pi,  pi, rightEvent);
			rightT.setGuard(InvariantBuilder.inv(leftEvent, rightEvent, -init+2, ComparisonOperator.GREATEROREQUAL));
		}
		
		if (max == -1) {
			{ // pi -> pi (left)
				helper.createTransition(pi, pi, leftEvent);
			}
		} else {
			State pu = helper.createState("U");
			pu.setInvariant(InvariantBuilder.inv(leftEvent, rightEvent, -init+max, ComparisonOperator.EQUALS));
			if (init == max) sts.setInitial(pu);
			
			{ // pu -> pu (left.right)
				helper.createTransition(pu, pu, leftEvent, rightEvent);
			}
			
			{ // pu -> pi (right)
				helper.createTransition(pu, pi, rightEvent);
			}
			
			{ // pi -> pi ([delta<=-init+max-2)left)
				Transition leftT = helper.createTransition(pi, pi, leftEvent);
				leftT.setGuard(InvariantBuilder.inv(leftEvent, rightEvent, -init+max-2, ComparisonOperator.LESSOREQUAL));
			}
			{ // pi -> pu ([delta==-init+max-1)left)
				Transition leftT = helper.createTransition(pi, pu, leftEvent);
				leftT.setGuard(InvariantBuilder.inv(leftEvent, rightEvent, -init+max-1, ComparisonOperator.EQUALS));
			}
		}

		return sts;
	}

}
