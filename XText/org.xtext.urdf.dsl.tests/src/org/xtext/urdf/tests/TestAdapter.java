package org.xtext.urdf.tests;


import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.xtext.urdf.generator.UrdfGenerator;

import uRDF.Collision;
import uRDF.Geometry;
import uRDF.Joint;
import uRDF.Link;
import uRDF.Robot;
import uRDF.URDFFactory;
import uRDF.URDFModel;
import uRDF.URDFPackage;
import uRDF.impl.LinkImpl;
import uRDF.impl.RobotImpl;
import uRDF.impl.URDFFactoryImpl;
import uRDF.impl.URDFPackageImpl;

public class TestAdapter {

	public static Robot createTestUrdf() 	{
	   URDFFactory eINSTANCE = URDFFactoryImpl.init();
	   URDFModel model = eINSTANCE.createURDFModel();
	   URDFPackage pkg = URDFPackageImpl.init();
	   
	   //Robot
	   RobotImpl robot = (RobotImpl)eINSTANCE.createRobot();
	   robot.setName("test");
	   model.setRobot(robot);

	   //Links
	   LinkImpl link = (LinkImpl)eINSTANCE.createLink();
	   link.eSet(URDFPackage.LINK__NAME, "URDFTestName");

	   Link link2 = eINSTANCE.createLink();
	   
	   Collision col1 = eINSTANCE.createCollision();
	   col1.setName("TestCollision1");
	   Collision col2 = eINSTANCE.createCollision();
	   col2.setName("TestCollision2");
	   Geometry geo = eINSTANCE.createBox();
	   geo.setName("TestBox");
	   col1.setGeometry(geo);
	   EList<EObject> colList = new BasicEList<EObject>();
	   colList.add(col1);
	   colList.add(col2);
	   link.eSet(pkg.getLink_Collision(), colList);
	   
	   link2.setName("URDF2");
	   EList<Link> linkList = new BasicEList<Link>();
	   linkList.add(link);
	   linkList.add(link2);
	   robot.eSet(URDFPackage.ROBOT__LINK, linkList);
	

	   //Joints
	   Joint joint = eINSTANCE.createJoint();
	   joint.setName("Joint1");
	   Joint joint2 = eINSTANCE.createJoint();
	   joint2.setName("Joint2");
	   EList<Joint> jointList = new BasicEList<Joint>();
	   jointList.add(joint);
	   jointList.add(joint2);
	   robot.eSet(URDFPackage.ROBOT__JOINT,jointList);
	   
	   // assert (ConstraintsAdapter.urdfValid(robot));
	   
	   return robot;
	   
	 
	}
	
	
	public static void main(String[] args) {
		Robot r = createTestUrdf();
		try {
			new UrdfGenerator().generate(r);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
