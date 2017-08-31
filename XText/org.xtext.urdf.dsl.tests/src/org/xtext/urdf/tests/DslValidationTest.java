package org.xtext.urdf.tests;

import org.eclipse.xtext.junit4.InjectWith;
import org.junit.Assert;
import org.junit.Test;
import org.xtext.urdf.myURDF.Robot;
import org.xtext.urdf.validation.CyclesValidator;
import org.xtext.urdf.validation.RootCheck;

@InjectWith(DslInjectorProvider.class)

public class DslValidationTest{
	
	@Test 
	public void oneRoot() {
		/*
			1.	Topology l1 -> l2 -> l3 
			2.	Topology l1 -> l4 -> l5 
		*/
		Robot robo = TestUtil.createOneRootTestUrdf();
		RootCheck result = new CyclesValidator().oneRoot(robo.getTopologies());
		Assert.assertTrue("only one root detected", result.isValidationError()==false);
	}
	
	@Test 
	public void cycles() {
		Robot robo = TestUtil.createCycleTestUrdf();
		String result = new CyclesValidator().cycles(robo,false);
		Assert.assertTrue("no cycle detected", result==null);
	}
	
	@Test 
	public void cyclesFound() {
		Robot robo = TestUtil.createCycleFoundTestUrdf();
		String result = new CyclesValidator().cycles(robo,false);
		Assert.assertTrue("cycle detected", result!=null);
	}
}
