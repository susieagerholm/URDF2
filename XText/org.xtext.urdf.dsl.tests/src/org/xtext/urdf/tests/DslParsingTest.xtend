/*
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.urdf.myURDF.Robot

@RunWith(XtextRunner)
@InjectWith(typeof(DslInjectorProvider))

class DslParsingTest  {
	//Robot robo
	
	@Inject extension ParseHelper<Robot>
//	ParseHelper<Robot> parseHelper

	/*
	 * Are elements created as expected by their respective default constructor in grammar 
	 * Are elements created as expected by Topology and iDerivedStateComputer
	 * Are elements based on Reuse created as expected
	 * Are Decorations created as expected
	 */


	@Test
	def void loadRobot() {   
		
		val result = '''
			Robot r1
				Link l1 def Inertial in Inertia it ixx 6 ixy 4 ixz 7 iyy 2 iyz 1 izz 4 Mass massKilogram 6 Visual v1 Geometry Sphere s1 radius 2
		'''.parse

		Assert.assertNotNull(result.links)
	}
	

}
