/*******************************************************************************
 * Copyright (c) 2017,2018 I3S laboratory, INRIA and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * I3S laboratory and INRIA Kairos – initial API and implementation
 *******************************************************************************/
package fr.kairos.lightccsl.sts;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import fr.aoste.ccsl.system.ICCSLSystemBuilder;
import fr.aoste.sync.SynchronousTransitionSystem;
import fr.aoste.sync.compose.STSSystemBuilder;
import fr.aoste.sync.visitor.AstsVisitor;
import fr.kairos.lightccsl.core.stepper.StepperUtility;
import fr.kairos.timesquare.ccsl.ISimpleSpecification;
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
	private AstsVisitor<CharSequence> visitor = null;
	private String ext = ".txt";

	@Override
	public ISimpleSpecification treat(String name, ISpecificationBuilder specBuilder) {
		ICCSLSystemBuilder<SynchronousTransitionSystem> sBuilder = STSSystemBuilder.buildParallelSystemBuilder();
		STSAdapter builder = new STSAdapter(sBuilder);
		specBuilder.build(builder);
		SynchronousTransitionSystem sts = sBuilder.getCCSLSystem();
		sts.setName(name);
		
		if (visitor != null) {
			File folder = createFolder("sts");
			String res = sts.accept(visitor).toString();
			File file = new File(folder, name + ext);
			try (PrintWriter pw = new PrintWriter(new FileWriter(file))) {
				pw.println(res);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return builder;
	}
	
	public void setBackend(AstsVisitor<CharSequence> visitor, String extension) {
		this.visitor = visitor;
		this.ext = extension;
	}
}
