package org.xtext.urdf.tests;


import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.junit.Assert;
import org.xtext.urdf.myURDF.AddTo;
import org.xtext.urdf.myURDF.Box;
import org.xtext.urdf.myURDF.Collision;
import org.xtext.urdf.myURDF.Cylinder;
import org.xtext.urdf.myURDF.Joint;
import org.xtext.urdf.myURDF.JointType;
import org.xtext.urdf.myURDF.Link;
import org.xtext.urdf.myURDF.Mesh;
import org.xtext.urdf.myURDF.MyURDFFactory;
import org.xtext.urdf.myURDF.MyURDFPackage;
import org.xtext.urdf.myURDF.Sphere;
import org.xtext.urdf.myURDF.Topology;
import org.xtext.urdf.myURDF.URDFAttrNumeric;
import org.xtext.urdf.myURDF.URDFAttrSTRING;
import org.xtext.urdf.myURDF.Visual;
import org.xtext.urdf.myURDF.impl.LinkImpl;
import org.xtext.urdf.myURDF.impl.MyURDFFactoryImpl;
import org.xtext.urdf.myURDF.impl.RobotImpl;

public class TestAdapter {

	
	public static RobotImpl createTestUrdf() 	{
	   MyURDFFactory eINSTANCE = MyURDFFactoryImpl.init();
	   //URDFModel model = eINSTANCE.createURDFModel();
	   
	   //Robot
	   RobotImpl robot = (RobotImpl)eINSTANCE.createRobot();
	   robot.setName("test");
//	   model.setRobot(robot);

	   //Links
	   LinkImpl link = (LinkImpl)eINSTANCE.createLink();
//	   link.eSet(URDFPackage.LINK__NAME, "URDFTestName");
	   link.setName("URDFLink1Testname");
	   
	   Collision col1 = eINSTANCE.createCollision();
	   col1.setName("TestCollision1");
	   Collision col2 = eINSTANCE.createCollision();
	   col2.setName("TestCollision2");
//	   geo.setName("TestBox");
//	   col1.setGeometry(geo);
	   EList<EObject> colList = new BasicEList<EObject>();
	   colList.add(col1);
	   colList.add(col2);
//	   link.eSet(pkg.getLink_Collision(), colList);

	   Link link2 = eINSTANCE.createLink();
	   link2.setName("URDF2");
	   EList<Link> linkList = new BasicEList<Link>();
	   linkList.add(link);
	   linkList.add(link2);
	   robot.eSet(MyURDFPackage.ROBOT__LINKS, linkList);
	

	   //Joints
	   Joint joint = eINSTANCE.createJoint();
	   joint.setName("Joint1");
	   joint.setChildOf(link);
	   joint.setType(JointType.FIXED);
	   joint.setParentOf(link2);
	   
	   
	   Joint joint2 = eINSTANCE.createJoint();
	   joint2.setName("Joint2");
	   joint2.setChildOf(link2);
	   joint2.setType(JointType.REVOLUTE);
//	   limit.setEffort("4");
//	   joint2.setLimit(limit);
	   
//	   axis.setX(1);
//	   joint2.setLimit(limit);
//	   joint2.setAxis(axis);
	   
	   
	   EList<Joint> jointList = new BasicEList<Joint>();
	   jointList.add(joint);
	   jointList.add(joint2);
	   robot.eSet(MyURDFPackage.ROBOT__JOINT,jointList);
	   
	   
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
	   Topology child2 = eINSTANCE.createTopology();
	   Link l3 = eINSTANCE.createLink();
	   l3.setName("l3");
	   child2.setParent(l3);

	   topo2.setChild(child2);
	   Link l4 = eINSTANCE.createLink();
	   l4.setName("l4");
	   topo2.setParent(l4);
	   
	   robot.getTopologies().add(topo);
	   robot.getTopologies().add(child);
	   robot.getTopologies().add(topo2);
	   robot.getTopologies().add(child2);
	   
	   return robot;
	   
	   
	}

//	@Test
	public void testAddToVisual() {
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
			
			//Not test - just inspiration for a testcase
			Assert.assertEquals(parentLink.getVisual().get(0), newVis);
			
	}
	
}
