/*******************************************************************************
 * Copyright (c) 2017,2018,2019,2020,2021 I3S laboratory, INRIA and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * I3S laboratory and INRIA Kairos – initial API and implementation
 *******************************************************************************/
package fr.kairos.lightccsl.sts;

import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.compose.STSSystemBuilder;
import fr.aoste.sync.gen.CheckVisitor;
import fr.aoste.sync.visitor.AstsVisitor;
import fr.kairos.lightccsl.core.stepper.StepperUtility;
import fr.kairos.timesquare.ccsl.simple.AUtility;
import fr.kairos.timesquare.ccsl.simple.ISpecificationBuilder;
import fr.kairos.timesquare.ccsl.simple.IUtility;

/**
 * Utility to produce STS to be displayed (DOT, Java, ?)
 * 
 * To execute the STS prefer the StepperUtility combined with STSSolutionFinder
 * @see StepperUtility
 * @see STSSolutionFinder
 * 
 * @author fmallet
 *
 */
public class STSUtility extends AUtility implements IUtility {
	private ISTSBackend<?> backend = null;
	public static final String STATS = "stats";
	private Object result = null;
	
	@Override
	public void treat(String name, ISpecificationBuilder specBuilder) {
		STSSystemBuilder sBuilder = STSSystemBuilder.buildParallelSystemBuilder();
		STSAdapter builder = new STSAdapter(sBuilder);
		specBuilder.build(builder);
		SynchronousTransitionSystem sts = sBuilder.getCCSLSystem();
		sts.setName(name);
		if (getBooleanParam(STATS, true)) {
			CheckVisitor.check(sts);
		}
		if (backend != null) {
			result = backend.treat(this, sts, name);
		}
	}
	public Object getResult() {
		return result;
	}
	public void setBackend(ISTSBackend<?> backend) {
		this.backend = backend;
	}
	public void setBackend(AstsVisitor<CharSequence> visitor, String ext) {
		setBackend(new STSDefaultBackend(visitor, ext));
	}
}
