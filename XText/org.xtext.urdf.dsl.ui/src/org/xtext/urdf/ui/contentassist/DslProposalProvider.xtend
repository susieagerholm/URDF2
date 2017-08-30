/*
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.ui.contentassist

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Group
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.xtext.urdf.myURDF.AssignNewValue
import org.xtext.urdf.myURDF.DotExpression
import org.xtext.urdf.myURDF.Joint
import org.xtext.urdf.myURDF.Link
import org.xtext.urdf.myURDF.Origin
import org.xtext.urdf.myURDF.ReUsableRef
import org.xtext.urdf.myURDF.Reuse
import org.xtext.urdf.myURDF.Visual
import org.xtext.urdf.services.DslGrammarAccess
import org.xtext.urdf.myURDF.Robot
import org.eclipse.xtext.EcoreUtil2
import org.xtext.urdf.myURDF.AddTo
import org.xtext.urdf.myURDF.Inertial
import org.xtext.urdf.myURDF.Collision
import org.xtext.urdf.myURDF.Axis
import org.xtext.urdf.myURDF.Limit
import org.xtext.urdf.myURDF.Dynamics
import org.xtext.urdf.myURDF.Calibration
import org.xtext.urdf.myURDF.SafetyController
import org.xtext.urdf.myURDF.ReUseAble
import org.xtext.urdf.myURDF.URDFAttrSignedNumeric
import org.xtext.urdf.myURDF.URDFAttrFloat
import org.xtext.urdf.myURDF.URDFAttrINT
import org.xtext.urdf.myURDF.URDFAttrNumeric
import org.xtext.urdf.myURDF.URDFAttrSTRING

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 * 
 * SPECIFICATION:
 * Multiple word keywords should be allowed													 DONE										 
 * Only suggest 'Add to link' / 'Add to joint' if an instance of link or joint is created    DONE
 * AssignNewValue: Only suggest relevant new value of correct type for an edit				 DONE
 * Optional containments in Joint - should only be suggested, if not already defined 	     DONE
 * Optional containments in Visual - should only be suggested, if not already defined		 DONE
 * Should only suggest add of relevant type when reusing a Link or Joint					 DONE
 * Should only suggest reuse if other Link/Joint exists                                      DONE
 * Only suggest to edit a reuse if reused Link/Joint has any attributes to edit				 DONE
 * Should only suggest another dot, if we are end of line									 DONE
 * Should not suggest self again after reuseable ref in DotExpression 						 TODO
 */
 
class DslProposalProvider extends AbstractDslProposalProvider {
	 @Inject extension DslGrammarAccess
	 	
	override completeKeyword(Keyword object, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		
		//Make sure that only the appropriate type of decoration is suggested in edit...
		 if(context.currentModel instanceof AssignNewValue) {
			val myassign = (context.currentModel) as AssignNewValue
			val myTag = object.getValue
			
			//No use in trying to edit the instance we're reusing
			if (myassign.getRef instanceof ReUsableRef) {
				if(!object.getValue.equals('=')) super.completeKeyword(object, context, acceptor)
			}
			
			//Make sure we have gotten to the assignment part...
			else if(context.lastCompleteNode.text.equals("=")) {
				//Make sure there is a tail expression in dot (not only the reused link referenced)
				if(myassign.getRef instanceof DotExpression && (myassign.getRef as DotExpression).tail != null) {
					//Make sure that only relevant type is suggested as assignment
					for (clazz : (myassign.getRef as DotExpression).tail.class.interfaces.toList) {
						if(clazz.simpleName.equals(myTag)) {
							super.completeKeyword(object, context, acceptor)
						}
					}
				}
				 	
			}
			
			else super.completeKeyword(object, context, acceptor)
					
		}
		
		else if (context.currentModel instanceof Reuse) {
			val myreuse = (context.currentModel) as Reuse
			val myTag = object.getValue
			val mycontext = myreuse.eContainer
			
			if(mycontext instanceof Link) {
				switch(myTag) {
					case myTag.equals("Visual") 			: super.completeKeyword(object, context, acceptor)
					case myTag.equals("Inertial") 			: super.completeKeyword(object, context, acceptor)
					case myTag.equals("Collision") 			: super.completeKeyword(object, context, acceptor)
				}
				
			}
			else if (mycontext instanceof Joint) {
				switch(myTag) {
					case myTag.equals("Origin") 			: super.completeKeyword(object, context, acceptor)
					case myTag.equals("Axis") 				: super.completeKeyword(object, context, acceptor)
					case myTag.equals("Limit") 				: super.completeKeyword(object, context, acceptor)
					case myTag.equals("Calibration") 		: super.completeKeyword(object, context, acceptor)
					case myTag.equals("Dynamics") 			: super.completeKeyword(object, context, acceptor)
					case myTag.equals("SafetyController")	: super.completeKeyword(object, context, acceptor)
				}
			}
			else super.completeKeyword(object, context, acceptor)
		}
		
			
		else if(context.currentModel instanceof Link) {
			val mylink = (context.currentModel) as Link
			val myrobot = EcoreUtil2.getContainerOfType(mylink, Robot)
			val myTag = object.getValue
			
			//Make sure Inertial is only suggested if not already defined
			if(myTag.equals("Inertial")) {
				if (mylink.inertial == null) super.completeKeyword(object, context, acceptor)
			}
			//Make sure reuse is not suggested if there is none to reuse from...
			else if(myTag.equals("reuse")) {
				if (myrobot.links.size > 1) super.completeKeyword(object, context, acceptor)
			}
			else super.completeKeyword(object, context, acceptor)
			
		}
		
		//Make sure, that all optional, single containment decorations in Joint are only suggested if not already defined
		else if(context.currentModel instanceof Joint) {
			val myjoint = (context.currentModel) as Joint
			val myTag = object.getValue
			
			switch(myTag) {
				case myTag.equals("reuse")				: if((myjoint.eContainer as Robot).joint.size > 1) super.completeKeyword(object, context, acceptor)
				case myTag.equals("Origin") 			: if(myjoint.origin == null) super.completeKeyword(object, context, acceptor)
			    case myTag.equals("Axis") 				: if(myjoint.axis == null) super.completeKeyword(object, context, acceptor)
				case myTag.equals("Limit") 				: if(myjoint.limit == null) super.completeKeyword(object, context, acceptor)
				case myTag.equals("Calibration") 		: if(myjoint.calibration == null) super.completeKeyword(object, context, acceptor)
				case myTag.equals("Dynamics") 			: if(myjoint.dynamics == null) super.completeKeyword(object, context, acceptor)
				case myTag.equals("SafetyController")	: if(myjoint.safetycontroller == null) super.completeKeyword(object, context, acceptor)
				default 								: super.completeKeyword(object, context, acceptor)
			}
		}
		
		//Only suggest dot if tail has contents to dot into...
		else if (context.currentModel instanceof DotExpression) {
			val mydot = (context.currentModel) as DotExpression
			val myTag = object.getValue
			val ref = mydot.ref
			
			if(myTag.equals('.')) {
				if ( !(mydot.tail instanceof URDFAttrSignedNumeric ||
					   mydot.tail instanceof URDFAttrFloat ||	
					   mydot.tail instanceof URDFAttrINT ||
					   mydot.tail instanceof URDFAttrNumeric ||
					   mydot.tail instanceof URDFAttrSTRING
					
				)) super.completeKeyword(object, context, acceptor)
			}
		}
		
		
		//Make sure, that all optional, single containment decorations in Visual are only suggested if not already defined
		else if (context.currentModel instanceof Visual) {
			val myvisual = (context.currentModel) as Visual
			val myTag = object.getValue
			
			switch(myTag) {
				case myTag.equals("Origin") 			: if(myvisual.origin == null) super.completeKeyword(object, context, acceptor)
				case myTag.equals("Material") 			: if(myvisual.material == null) super.completeKeyword(object, context, acceptor)
				default									: super.completeKeyword(object, context, acceptor)
			}
		}
		
		//Make sure, that yaw, pitch and roll are only suggested within Origin if not salready defined
		else if(context.currentModel instanceof Origin) {
			val myorigin = (context.currentModel) as Origin
			val myTag = object.getValue
			
			switch(myTag) {
				case myTag.equals("roll") 				: if(myorigin.roll == null) super.completeKeyword(object, context, acceptor)
			    case myTag.equals("pitch") 				: if(myorigin.pitch == null) super.completeKeyword(object, context, acceptor)
				case myTag.equals("yaw") 				: if(myorigin.yaw == null) super.completeKeyword(object, context, acceptor)
				default 								: super.completeKeyword(object, context, acceptor)
			}
		}
		else super.completeKeyword(object, context, acceptor);
		
		
	  }	
		
	
	
	//MULTIPLE WORDS - KEYWORDS...
	override complete_AddToLink(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    	
    	//Only suggest Add to Link from Topology if any Links instantiated from Topology 
    	if(model.eAllContents.filter(Link).filter[x | x.eGet(x.eClass().getEStructuralFeature("fromTopo")) == true].size > 0 ) {
    		addToLinkAccess.group.createKeywordProposalMultiple(context,acceptor, Link, true)
    	}
	}
	
	override complete_AddToJoint(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		
    	//Only suggest Add to Joint from Topology if any Joints instantiated from Topology
		if(model.eAllContents.filter(Joint).filter[x | x.eGet(x.eClass().getEStructuralFeature("fromTopo")) == true].size > 0 ) {
			addToJointAccess.group.createKeywordProposalMultiple(context,acceptor, Joint, true)
		}
	}
	
	override complete_AddToReuse(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		
		addToReuseAccess.group.createKeywordProposalMultiple(context,acceptor, Reuse, false)
	}
	
	override complete_EditReuse(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		//Only suggest edit reuse if reused has decoration to edit...
		val curr = context.currentModel 
		if (curr instanceof Link) {
			if(curr.isReuseOf.eAllContents.filter[x | 
				//test if x interfaces toset contains ReUseAble fails - why would that not work?
				x instanceof Visual || 
				x instanceof Inertial || 
				x instanceof Collision
			].size > 0) editReuseAccess.group.createKeywordProposalMultiple(context,acceptor, Reuse, false)
		}
		if(curr instanceof Joint) {
			if(curr.isReuseOf.eAllContents.filter[x | 
				x instanceof Origin || 
				x instanceof Axis || 
				x instanceof Limit ||
				x instanceof Dynamics ||
				x instanceof Calibration ||
				x instanceof SafetyController
				
			].size > 0) editReuseAccess.group.createKeywordProposalMultiple(context,acceptor, Reuse, false)
		}
		
	}
	
	//make sure consecutive keywords are presented as one string by content assist
   	//https://blogs.itemis.com/en/xtext-hint-content-assist-for-multiple-consecutive-keywords	
	def createKeywordProposalMultiple(Group group, ContentAssistContext context, ICompletionProposalAcceptor acceptor, Class<? extends EObject> obj, boolean guard) {
		//Only suggest Add To Link/Joint if any actually created
		if(guard == true) if (group == null || context.currentModel.eContents.filter(obj).empty) return null	
   		
    	val proposalString = group.elements.filter(Keyword).map[value].join(" ") + " "
    	acceptor.accept(createCompletionProposal(proposalString, proposalString, null, context))	
	}
	
}
