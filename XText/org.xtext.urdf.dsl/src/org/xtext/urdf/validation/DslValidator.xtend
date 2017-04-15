/*
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.validation

import org.eclipse.xtext.validation.Check
import org.xtext.urdf.domainmodel.Robot
import org.xtext.urdf.domainmodel.DomainmodelPackage

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class DslValidator extends AbstractDslValidator {
	

	@Check
	def checkURDFComplete(Robot robot)
	{
		val constraints = new ConstraintsAdapter()
		
		if(!constraints.urdfComplete(robot))
		{
			//Todo: implement this!
			error("Joint relation not valid...", 
        		DomainmodelPackage.Literals.ROBOT__JOINT)
		} else {
			info("Robot is valid",DomainmodelPackage.Literals.ROBOT__NAME);
		}
		
	}
	
}
