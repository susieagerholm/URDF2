package org.xtext.urdf.tests;


import org.xtext.urdf.myURDF.AddTo;
import org.xtext.urdf.myURDF.Box;
import org.xtext.urdf.myURDF.Cylinder;
import org.xtext.urdf.myURDF.Link;
import org.xtext.urdf.myURDF.Mesh;
import org.xtext.urdf.myURDF.MyURDFFactory;
import org.xtext.urdf.myURDF.Sphere;
import org.xtext.urdf.myURDF.Topology;
import org.xtext.urdf.myURDF.URDFAttrNumeric;
import org.xtext.urdf.myURDF.URDFAttrSTRING;
import org.xtext.urdf.myURDF.Visual;
import org.xtext.urdf.myURDF.impl.LinkImpl;
import org.xtext.urdf.myURDF.impl.MyURDFFactoryImpl;
import org.xtext.urdf.myURDF.impl.RobotImpl;

public class TestUtil {

	public static RobotImpl createCycleFoundTestUrdf() {
		
		 /*
			Topology l1 -> l2 -> l1 
		 */
		
		   MyURDFFactory eINSTANCE = MyURDFFactoryImpl.init();
		   Topology topo = eINSTANCE.createTopology();
		   Link l1 = eINSTANCE.createLink();
		   l1.setName("l1");
		   topo.setParent(l1);

		   Topology child = eINSTANCE.createTopology();
		   Link l2 = eINSTANCE.createLink();
		   l2.setName("l2");
		   child.setParent(l2);

		   topo.setChild(child);

		   Topology child2 = eINSTANCE.createTopology();
		   child2.setParent(l1);
		   
		   child.setChild(child2);

		   RobotImpl robot = (RobotImpl)eINSTANCE.createRobot();
		   robot.setName("test");
		   robot.getTopologies().add(topo);
		   
		   return robot;

	}
	
	
	public static RobotImpl createCycleTestUrdf() 	{
	   MyURDFFactory eINSTANCE = MyURDFFactoryImpl.init();
	   //URDFModel model = eINSTANCE.createURDFModel();
	   
	   //Robot
	   RobotImpl robot = (RobotImpl)eINSTANCE.createRobot();
	   robot.setName("test");

	   // Topology l1 -> l2
	   // Topology l3 -> l4
	   // Topology l1 -> l3
	   
	   Topology topo = eINSTANCE.createTopology();
	   Link l1 = eINSTANCE.createLink();
	   l1.setName("l1");
	   topo.setParent(l1);

	   Topology child = eINSTANCE.createTopology();
	   Link l2 = eINSTANCE.createLink();
	   l2.setName("l2");
	   child.setParent(l2);

	   topo.setChild(child);

	   Topology topo2 = eINSTANCE.createTopology();
	   Link l3 = eINSTANCE.createLink();
	   l3.setName("l3");
	   topo2.setParent(l3);

	   Topology child2 = eINSTANCE.createTopology();
	   Link l4 = eINSTANCE.createLink();
	   l4.setName("l4");
	   child2.setParent(l4);

	   topo2.setChild(child2);

	   Topology topo3 = eINSTANCE.createTopology();
	   Topology child3 = eINSTANCE.createTopology();
	   topo3.setParent(l1);
	   
	   child3.setParent(l3);
	   topo3.setChild(child3);
	   
	   robot.getTopologies().add(topo);
	   robot.getTopologies().add(topo2);
	   robot.getTopologies().add(topo3);
	   
	   return robot;
	   
	   
	}

//	@Test
	public static void testAddToVisual() {
		//Draft - for testing AddTo - consider calling DerivedState and check that object are created as expected
		
		   MyURDFFactory eINSTANCE = MyURDFFactoryImpl.init();
		   //URDFModel model = eINSTANCE.createURDFModel();
		   //MyURDFPackage pkg = MyURDFPackageImpl.init();
		   
		   //Robot
		   RobotImpl robot = (RobotImpl)eINSTANCE.createRobot();
		   robot.setName("test");

		   //Links
		   LinkImpl link = (LinkImpl)eINSTANCE.createLink();
		   link.setName("URDFLink1Testname");
		   Visual addToVisual = eINSTANCE.createVisual();
		   link.getVisual().add(addToVisual);
		   AddTo addto = eINSTANCE.createAddTo();
		   addto.setLink(link);

		
			Visual newVis = MyURDFFactory.eINSTANCE.createVisual();
			URDFAttrNumeric newAttrNum = MyURDFFactory.eINSTANCE.createURDFAttrNumeric();
			URDFAttrNumeric newAttrNum2 = MyURDFFactory.eINSTANCE.createURDFAttrNumeric();
			URDFAttrNumeric newAttrNum3 = MyURDFFactory.eINSTANCE.createURDFAttrNumeric();
			
			URDFAttrSTRING newAttrString = MyURDFFactory.eINSTANCE.createURDFAttrSTRING();
			
			if(addToVisual.getGeometry() instanceof Sphere) {
				Sphere newSphere = MyURDFFactory.eINSTANCE.createSphere();
				Sphere sphere = (Sphere)addToVisual.getGeometry();
				newAttrNum.setValue(sphere.getRadius().getValue());
				newSphere.setRadius(newAttrNum);
				newSphere.setName("_"+sphere.getName());
				newVis.setGeometry(newSphere);			
			} else if(addToVisual.getGeometry() instanceof Mesh) {
				Mesh newMesh = MyURDFFactory.eINSTANCE.createMesh();
				Mesh mesh = (Mesh)addToVisual.getGeometry();
				newAttrString.setValue(mesh.getPathToFile().getValue());
				newMesh.setPathToFile(newAttrString);
				newMesh.setName("_"+mesh.getName());
			} else if(addToVisual.getGeometry() instanceof Cylinder) {
				Cylinder newCylinder = MyURDFFactory.eINSTANCE.createCylinder();
				Cylinder cylinder = (Cylinder)addToVisual.getGeometry();
				newAttrNum.setValue(cylinder.getRadius().getValue());
				newCylinder.setRadius(newAttrNum);
				newAttrNum2.setValue(cylinder.getLength().getValue());
				newCylinder.setLength(newAttrNum2);
				newCylinder.setName("_"+cylinder.getName());
				newVis.setGeometry(newCylinder);			
			} else if(addToVisual.getGeometry() instanceof Box) {
				Box newBox = MyURDFFactory.eINSTANCE.createBox();
				Box box = (Box)addToVisual.getGeometry();
				newAttrNum.setValue(box.getHeight().getValue());
				newBox.setHeight(newAttrNum);
				newAttrNum2.setValue(box.getLength().getValue());
				newBox.setLength(newAttrNum2);
				newAttrNum3.setValue(box.getWidth().getValue());
				newBox.setWidth(newAttrNum3);
			} 
			
			newVis.setName("_"+addToVisual.getName());
		    LinkImpl parentLink = (LinkImpl)eINSTANCE.createLink();
			parentLink.setName("Parent");
			parentLink.getVisual().add(newVis);
			
			//inspiration for a testcase
	//		Assert.assertEquals(parentLink.getVisual().get(0), newVis);
			
	}

	public static RobotImpl createOneRootTestUrdf() 	{
		   MyURDFFactory eINSTANCE = MyURDFFactoryImpl.init();
		   
		   //Robot
		   RobotImpl robot = (RobotImpl)eINSTANCE.createRobot();
		   robot.setName("test");

		   // Topology l1 -> l2 -> l3
		   // Topology l1 -> l4 -> l5
		   
		   Topology parent = eINSTANCE.createTopology();
		   Link l1 = eINSTANCE.createLink();
		   l1.setName("l1");
		   parent.setParent(l1);

		   Topology child1 = eINSTANCE.createTopology();
		   Link l2 = eINSTANCE.createLink();
		   l2.setName("l2");
		   child1.setParent(l2);

		   parent.setChild(child1);

		   Topology child2 = eINSTANCE.createTopology();
		   Link l3 = eINSTANCE.createLink();
		   l3.setName("l3");
		   child2.setParent(l3);

		   child1.setChild(child2);
		   
//////////////////////////////////////////
		   
		   Topology parent2 = eINSTANCE.createTopology();
		   parent2.setParent(l1);
		   
		   Topology child4 = eINSTANCE.createTopology();
		   Link l4 = eINSTANCE.createLink();
		   l4.setName("l4");
		   child4.setParent(l4);

		   parent2.setChild(child4);

		   Topology child5 = eINSTANCE.createTopology();
		   Link l5 = eINSTANCE.createLink();
		   l5.setName("l5");
		   child5.setParent(l5);

		   child4.setChild(child5);
		   
		   robot.getTopologies().add(parent);
		   robot.getTopologies().add(parent2);
		   
		   return robot;
		}
	
}
