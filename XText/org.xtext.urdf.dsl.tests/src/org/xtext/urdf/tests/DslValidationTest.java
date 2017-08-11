package org.xtext.urdf.tests;

import org.eclipse.xtext.junit4.InjectWith;
import org.junit.Assert;
import org.junit.Test;
import org.xtext.urdf.myURDF.Link;
import org.xtext.urdf.myURDF.MyURDFFactory;
import org.xtext.urdf.myURDF.Robot;
import org.xtext.urdf.myURDF.Topology;
import org.xtext.urdf.myURDF.impl.MyURDFFactoryImpl;
import org.xtext.urdf.myURDF.impl.RobotImpl;
import org.xtext.urdf.validation.CyclesValidator;

@InjectWith(DslInjectorProvider.class)

public class DslValidationTest{
	
	//Ideas for test cases:
	//Can we test parser rules?
	//Test - A Joint of type revolute or prismatic must have Limit defined
	//Test - Not legal to reuse from a joint, that is already made from reuse
	//Constants??
	//Test addTo joint/links - see TestAdapter, testAddToVisual() - to get some of the necessary objects


	//Test Expressions - all 4 operators
//	@Test 
	public void testAddition() {
		Assert.assertEquals("Addition ok", 4, 4 /* An expression generating 4 as result - using Expression objects */  ); 
	}

	
	@Test 
	public void oneRoot() {
		/*
			1.	Topology l1 -> l2 
			2.	Topology l1 -> l3   1. and 2. together are valid 
			3.	Topology l2 -> l4   1. 2. 3. together are not valid
		*/
		Robot robo = TestAdapter.createTestUrdf();
		//if validation returns false - there is a root problem. The topologies created in the adapter
		//contains multiple roots, so we expect false
		Assert.assertFalse("Houston - we have a problem", new CyclesValidator().oneRoot(robo));
	}
	
	@Test 
	public void cycles() {
		Robot robo = TestAdapter.createTestUrdf();
		String[] result = new CyclesValidator().cycles(robo);
		Assert.assertTrue("cycle detected - but not expected", result[0]=="FALSE");
	}
	
	@Test 
	public void cyclesFound() {
		/*
				Topology l1 -> l2 
				Topology l2 -> l1   
		*/
		   MyURDFFactory eINSTANCE = MyURDFFactoryImpl.init();
		   Topology topo = eINSTANCE.createTopology();
		   Topology child = eINSTANCE.createTopology();
		   Link l2 = eINSTANCE.createLink();
		   l2.setName("l2");
		   child.setParent(l2);

		   topo.setChild(child);
		   Link l1 = eINSTANCE.createLink();
		   l1.setName("l1");
		   topo.setParent(l1);

		   Topology topo2 = eINSTANCE.createTopology();
		   topo2.setParent(l2);
		   Topology child2 = eINSTANCE.createTopology();
		   topo2.setChild(child2);
		   child2.setParent(l1);

		   RobotImpl robot = (RobotImpl)eINSTANCE.createRobot();
		   robot.setName("test");
		   robot.getTopologies().add(topo);
		   robot.getTopologies().add(child);
		   robot.getTopologies().add(topo2);
		   robot.getTopologies().add(child2);
		
		   //The cycle method in validation returns true if a cycle is detected
		   //Here we expect a cycle
		   String[] result = new CyclesValidator().cycles(robot);
		   Assert.assertTrue("cycle not detected, but was expected", result[0]=="TRUE");
	}
}
