package org.xtext.urdf

import org.eclipse.xtext.linking.ILinkingService
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer
import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.xtext.resource.DerivedStateAwareResourceDescriptionManager

class DslRuntimeModule extends AbstractDslRuntimeModule {
	override Class<? extends ILinkingService> bindILinkingService() {
		return UrdfLinkingService
	}
	
	 override bindXtextResource() {
	     DerivedStateAwareResource   
	}   
	
	def  Class<? extends IDerivedStateComputer> bindIDerivedStateComputer() {     
	     UrdfDerivedStateComputer   
	}   

	def  Class<? extends IResourceDescription.Manager> bindIResourceDescriptionManager() {
	     DerivedStateAwareResourceDescriptionManager   
	} 	
	
	
}
