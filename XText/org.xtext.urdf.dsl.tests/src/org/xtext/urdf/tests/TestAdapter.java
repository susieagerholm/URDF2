package org.xtext.urdf.tests;


import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.xtext.urdf.validation.DslValidator;

import org.xtext.urdf.myURDF.Axis;
import org.xtext.urdf.myURDF.Collision;
import org.xtext.urdf.myURDF.Geometry;
import org.xtext.urdf.myURDF.Joint;
import org.xtext.urdf.myURDF.JointType;
import org.xtext.urdf.myURDF.Limit;
import org.xtext.urdf.myURDF.Link;
import org.xtext.urdf.myURDF.Robot;
import org.xtext.urdf.myURDF.MyURDFFactory;
//import org.xtext.urdf.myURDF.MyURDFModel;
import org.xtext.urdf.myURDF.MyURDFPackage;
import org.xtext.urdf.myURDF.impl.LinkImpl;
import org.xtext.urdf.myURDF.impl.RobotImpl;
import org.xtext.urdf.myURDF.impl.MyURDFFactoryImpl;
import org.xtext.urdf.myURDF.impl.MyURDFPackageImpl;

public class TestAdapter {

	
	public static RobotImpl createTestUrdf() 	{
	   MyURDFFactory eINSTANCE = MyURDFFactoryImpl.init();
	   //URDFModel model = eINSTANCE.createURDFModel();
	   MyURDFPackage pkg = MyURDFPackageImpl.init();
	   
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
	   Geometry geo = eINSTANCE.createBox();
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
	   Limit limit = eINSTANCE.createLimit();
//	   limit.setEffort("4");
//	   joint2.setLimit(limit);
	   
	   Axis axis = eINSTANCE.createAxis();
//	   axis.setX(1);
//	   joint2.setLimit(limit);
//	   joint2.setAxis(axis);
	   
	   
	   EList<Joint> jointList = new BasicEList<Joint>();
	   jointList.add(joint);
	   jointList.add(joint2);
	   robot.eSet(MyURDFPackage.ROBOT__JOINT,jointList);
	   
	   // assert (ConstraintsAdapter.urdfValid(robot));
	   
	   return robot;
	   
	 
	}
	
	
	public static void main(String[] args) {
		Robot r = createTestUrdf();
		DslValidator dsl = new DslValidator();
		try {
			System.out.println("Validation is: " + dsl.checkURDFComplete(r));
		//	new UrdfGenerator().generate(r);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
