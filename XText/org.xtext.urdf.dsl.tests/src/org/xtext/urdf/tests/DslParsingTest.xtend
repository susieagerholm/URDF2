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
import org.xtext.urdf.domainmodel.Robot

@RunWith(XtextRunner)
@InjectWith(DslInjectorProvider)
class DslParsingTest{

	@Inject
	ParseHelper<Robot> parseHelper

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}
