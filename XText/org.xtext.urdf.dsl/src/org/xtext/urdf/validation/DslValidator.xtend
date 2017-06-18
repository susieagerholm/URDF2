/*
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.validation

import org.eclipse.xtext.validation.Check
import org.xtext.urdf.myURDF.Axis
import org.xtext.urdf.myURDF.MyURDFPackage
import org.xtext.urdf.myURDF.ReUseAble
import org.xtext.urdf.myURDF.Robot

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class DslValidator extends AbstractDslValidator {
	
	//Skal vi ikke droppe denne kontrol struktur - gaar ud fra den er til test formaal?
	@Check
	def checkURDFComplete(Robot robot)
	{
		//robotContainsLink(robot)
		
		//checkJointTypesHaveRequiredLimitOrAxis(robot)
//		if(!checkJointParentChildRelations(robot))
//		{
//			error("Parent child problem", URDFPackage.Literals.ROBOT__JOINT)
//		} else {
//			info("Robot is valid",URDFPackage.Literals.ROBOT__LINK);
//		}
		
	}
	
	
    
    //A Robot must contain at least one Link to be valid instance
    @Check
	def checkRobotContainsLink(Robot robot) {
		if (robot.link.length < 1)
		error("A Robot must contain at least one Link to be valid instance", 
        		MyURDFPackage.Literals.NAMED_ELEMENT__NAME)
	}
	
	//A Link must be connected to a Joint in order to be part of graph (otherwise parser will report multiple roots)
	@Check
	def checkLinkIsConnectedToAJoint(Robot robot) {
		//if more than one link - must be attached to joint
		if(robot.link.length > 1 && !robot.link.forall[l |  
			robot.joint.map[parentOf.name].contains(l.name) || 
			robot.joint.map[childOf.name].contains(l.name)
		]) 
		error("A Link has to be referenced as parentOf and/or childOf at least one Joint", 
        		MyURDFPackage.Literals.ROBOT__LINK)
	}
	
	// A Joint must not have the same Link as parent and child
	//maybe this check should be integrated in the topologi instead... 
	@Check
	def checkJointParentChildRelations (Robot robot) {
      robot.getJoint.forall[j | j.getParentOf != j.getChildOf]
    }
	
	// A Joint of type revolute or prismatic must have Limit defined
	@Check
	def checkJointTypesHaveRequiredLimit(Robot robot) {
		if (!robot.joint.filter[j | j.type.getName.equals("revolute") || j.type.getName.equals("prismatic")].forall[j | j.decorator.limit != null])
		error("A Joint of type revolute or prismatic must have a Limit defined", 
        		MyURDFPackage.Literals.NAMED_ELEMENT__NAME)
	}
	
	// A Joint of type revolute or prismatic must have Axis defined
	@Check
	def checkJointTypesHaveRequiredAxis(Robot robot) {
		if (!robot.joint.filter[j | j.type.getName.equals("revolute") || j.type.getName.equals("prismatic")].forall[j | j.decorator.axis != null])
		error("A Joint of type revolute or prismatic must have an Axis defined", 
        		MyURDFPackage.Literals.NAMED_ELEMENT__NAME)
	}
	
	
	//An Axis may have only one active vector...
	@Check
	def checkAxisSettingIsValidOnlyOneActiveVector(Axis axis) {
		if(axis.x.value + axis.y.value + axis.z.value != 1)
		error("Only one of the vectors of an Axis may be set to 1 (= active). The other two vectors must be set to 0", 
        		MyURDFPackage.Literals.NAMED_ELEMENT__NAME)	
	}
	
	@Check
	//CANNOT BE TESTED BEFORE IMPLEMENTATION OF REUSE!!
	def onlyPossibleToReuseIfNotAlreadyReused(ReUseAble reuser) {
		if(reuser.isReuseOf.isReuseOf != null) 
			error("Not legal to reuse from instance, that is already made from reuse", 
        		MyURDFPackage.Literals.NAMED_ELEMENT__NAME)
	}	
	
	@Check
	//CANNOT BE TESTED BEFORE IMPLEMENTATION OF REUSE!! 
	def onlyPossibleToReuseIfSameType(ReUseAble reuser) {
		if(reuser.eClass != reuser.isReuseOf.eClass) 
			error("Not legal to reuse from instance, that is not of the same type", 
        		MyURDFPackage.Literals.NAMED_ELEMENT__NAME)
	}	
}