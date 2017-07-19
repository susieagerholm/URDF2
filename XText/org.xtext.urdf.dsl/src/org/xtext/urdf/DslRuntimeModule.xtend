package org.xtext.urdf


import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer
import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.xtext.resource.DerivedStateAwareResourceDescriptionManager
import org.eclipse.xtext.linking.ILinkingDiagnosticMessageProvider
import org.eclipse.xtext.naming.IQualifiedNameProvider

class DslRuntimeModule extends AbstractDslRuntimeModule {
	
	
	//Binding for overriding IQualifiedNameProvider. Used to reference nameless elements like attributes in ReUse scenario. 
 	@Override
    override Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
        URDFQualifiedNameProvider;
    }
	
	//Bindings for overriding UnresolvedProxyMessage. Used to allow instantiation by reference in Topology 
	def Class<? extends ILinkingDiagnosticMessageProvider> bindILinkingDiagnosticMessageProvider() {
			URDFUnresolvedProxyMessage
	}
	
	//Bindings for iDerivedStateComputer. Used to update AST with Topology definitions	
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
