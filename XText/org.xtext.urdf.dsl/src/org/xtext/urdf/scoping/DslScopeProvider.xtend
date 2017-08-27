/*
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.scoping

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.xtext.urdf.myURDF.DotExpression
import org.xtext.urdf.myURDF.Joint
import org.xtext.urdf.myURDF.Link
import org.xtext.urdf.myURDF.ReUsableRef
import org.xtext.urdf.myURDF.ReUseAble
import org.xtext.urdf.myURDF.Reuse
import org.xtext.urdf.myURDF.Robot

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 * 
 * SPECIFICATION:
 * 
 * Topology (parent): Able to see links defined below in document (default?)		?
 * Topology (parent): Not see links already used in this topology chain?			? 
 * Link (isReuse): Only see links that are not already made from reuse or self		DONE
 * Link (isReuse): Also see links defined below in document (default?)				?
 * Link (isReuse): Also see links made from Topology (default)						DONE
 * AddToLink (link): Should only see links made from Topology?						TODO
 * AddToJoint (joint): Should only suggest joints made from Topology?				TODO
 * DotExpr (tail): Only available in context										? 
 * ReUseAble (reuseable): Only current being reused									? 
 * Joint (isReuseOf): Only see joints that are not already made from reuse or self	DONE
 * Joint childOf: Any further restrictions needed?									?	THIS IS VALIDATION/PROPOSAL PROVIDER
 * Joint (parentOf): Should only see links that do not already have a parent 		?   THIS IS VALIDATION/PROPOSAL PROVIDER
 * Joint (parentOf): Should only see links that is not already child of this 		DONE
 * SHOULD WE LIMIT VISIBILITY OF VISUAL TO LINK (reuse name)
 * 
 */
 
class DslScopeProvider extends AbstractDslScopeProvider {
	@Inject IQualifiedNameProvider URDFQualifiedNameProvider;
	
	override IScope getScope(EObject context, EReference reference) {
	
		
		//GET ROBOT REFERENCE FOR FURTHER USE BELOW
		val robot = EcoreUtil2.getContainerOfType(context, Robot)
		
		//FIRST TIME PARENT REF IN TOPOLOGY IS TRIGGERED IT WILL BE FROM THE CONTEXT OF ROBOT!
		//Topology (parent): Able to see links defined below in document (default?)
		if (context instanceof Robot) {
			val test = context 
			if(reference.name.equals("parent")) {
				if (robot.links.empty) return IScope::NULLSCOPE
				else Scopes.scopeFor(robot.links)
			}
			else super.getScope(context, reference)
			
		}

		// LINK (isReuse): ONLY SEE LINKS THAT ARE NOT ALREADY MADE FROM REUSE OR SELF		
		if (context instanceof Link) {
			if (reference.name.equals("isReuseOf")) {
				return Scopes.scopeFor(robot.links.
					//EXCLUDE CURRENT LINK
					filter[x | !x.name.equals(context.name)].
					//REMEMBER ALSO TO EXCLUDE LINKS MADE FROM REUSE
					filter[y | y.isReuseOf == null]
				)
			}
		}
		
		//JOINT (isReuseOf): ONLY SEE JOINTS THAT ARE NOT ALREADY MADE FROM REUSE OR SELF
		if (context instanceof Joint) {
			//ONLY SUGGEST JOINTS FOR REUSE THAT IS NOT SELF OR MADE FROM REUSE
			if (reference.name.equals("isReuseOf")) {
				return Scopes.scopeFor(robot.joint.
				//EXCLUDE CURRENT JOINT
				filter[x | !x.name.equals(context.name)].
				//REMEMBER ALSO TO EXCLUDE JOINTS MADE FROM REUSE
				filter[y | y.isReuseOf == null]
				)
			}
			else super.getScope(context, reference)
			
		}
		
		//RETURN PROPER SCOPE FOR EDIT REUSE	= THE LINK OR JOINT CURRENTLY REUSED
		if (context instanceof Reuse) {		
			if (context.eContainer instanceof Link) {
				val curr = EcoreUtil2.getContainerOfType(context, Link)
				return Scopes.scopeFor(newArrayList(curr.isReuseOf).toList)
			} else {
				val curr = EcoreUtil2.getContainerOfType(context, Joint)
				return Scopes.scopeFor(newArrayList(curr.isReuseOf).toList)
			}
			
	    }
	    
 		else if (context instanceof DotExpression) {
			val head = context.ref
		 	switch (head) {
		 		//FIRST ITERATION ON DOT - JUST RETURN CONTENTS OF REUSED
            	ReUsableRef : {
            		val iii = head.reuseable.eContents.toList
            	Scopes::scopeFor(head.reuseable.eContents, URDFQualifiedNameProvider 
                					, IScope::NULLSCOPE)
                }		               					
 
            	DotExpression : {
                	val tail = head.tail
                	if (tail != null) {
                		switch (tail) {
         					ReUseAble :  Scopes::scopeFor(tail.eContents,  
                						URDFQualifiedNameProvider, 
                						IScope::NULLSCOPE)
                		    default: IScope::NULLSCOPE
                		}
                	} 
                	else Scopes::scopeFor(head.eContents) 
             	}
        	}   
 		}
		
		//IF NO CUSTOM RULE APPLIES - DELEGATE TO DEFAULT IMPL....
		else super.getScope(context, reference)

	}
	
}
