/*
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.urdf.myURDF.AddTo
import org.xtext.urdf.myURDF.Axis
import org.xtext.urdf.myURDF.Collision
import org.xtext.urdf.myURDF.Geometry
import org.xtext.urdf.myURDF.Joint
import org.xtext.urdf.myURDF.Limit
import org.xtext.urdf.myURDF.Link
import org.xtext.urdf.myURDF.Robot
import org.xtext.urdf.myURDF.Topology
import org.xtext.urdf.myURDF.Visual
import org.xtext.urdf.services.DslGrammarAccess

//SPECIFICATION
// TODO: format HiddenRegions around keywords, attributes, cross references, etc.
		//add newline and no space after robot
		//robot.prepend[setNewLines(1, 1, 2); noSpace]
		//robot.regionFor.feature(MyURDFPackage.Literals.NAMED_ELEMENT__NAME).append[newLine]

class DslFormatter extends AbstractFormatter2 {
	@Inject extension DslGrammarAccess
	
	def dispatch void format(Robot robot, extension IFormattableDocument document) {
		
		robot.interior[indent]
		robot.regionFor.keyword('Topology').prepend[setNewLines(1, 1, 2); noSpace]
		
		for (Link link : robot.getLinks) { link.format.prepend[setNewLines(1, 1, 2); noSpace] }
		for (Joint joint : robot.getJoint) { joint.format.prepend[setNewLines(1, 1, 2); noSpace] }	
		for (AddTo add: robot.addto) { add.format.prepend[setNewLines(1, 1, 2); noSpace] }	
	}
	
	
	def dispatch void format(Link link, extension IFormattableDocument document) {
    // TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		link.interior[indent]
		
		for (Visual v : link.visual) { v.format.prepend [setNewLines(1, 1, 2); noSpace] }
		for (Collision c : link.collision) { c.format.prepend [setNewLines(1, 1, 2); noSpace] }
		link.inertial.format.prepend [setNewLines(1, 1, 2); noSpace]
		
    }
    
    def dispatch void format(Visual visual, extension IFormattableDocument document) {
		//visual.format.prepend[setNewLines(1, 1, 2); noSpace]
		visual.interior[indent]
		
		visual.geometry.format.prepend[setNewLines(1, 1, 2); noSpace]
		visual.origin.format.prepend[setNewLines(1, 1, 2); noSpace]
		visual.material.format.prepend[setNewLines(1, 1, 2); noSpace]
	}
	
	def dispatch void format(Geometry geo, extension IFormattableDocument document) {
		geo.interior[indent]
	
    }
    
    def dispatch void format(Joint joint, extension IFormattableDocument document) {
		joint.interior[indent]
		
		joint.childOf.format.prepend[setNewLines(1, 1, 2); noSpace]
		joint.parentOf.format.prepend[setNewLines(1, 1, 2); noSpace]
		joint.limit.format.prepend[setNewLines(1, 1, 2); noSpace]
		joint.axis.format.prepend[setNewLines(1, 1, 2); noSpace]
		joint.origin.format.prepend[setNewLines(1, 1, 2); noSpace]
		joint.dynamics.format.prepend[setNewLines(1, 1, 2); noSpace]
		joint.calibration.format.prepend[setNewLines(1, 1, 2); noSpace]
		joint.safetycontroller.format.prepend[setNewLines(1, 1, 2); noSpace]
		//joint.mimic.format.prepend[setNewLines(1, 1, 2); noSpace]
		
	}
	
	def dispatch void format(Limit limit, extension IFormattableDocument document) {
		limit.interior[indent]
	}
	
	def dispatch void format(Axis axis, extension IFormattableDocument document) {
		axis.interior[indent]
	}
	
}
