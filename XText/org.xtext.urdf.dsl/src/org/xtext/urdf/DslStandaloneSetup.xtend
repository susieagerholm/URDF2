/*
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf

import com.google.inject.Injector
import org.eclipse.emf.ecore.EPackage

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DslStandaloneSetup extends DslStandaloneSetupGenerated {

	def static void doSetup() {
		new DslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
	
	
	//In order to execute JUnit tests standalone - this is necessary:
    override void register(Injector injector) {
        if (!EPackage.Registry.INSTANCE.containsKey("http://www.itu.dk/uRDF")) { 
            EPackage.Registry.INSTANCE.put("http://www.itu.dk/uRDF", org.xtext.urdf.myURDF.MyURDFPackage.eINSTANCE);
        }
        super.register(injector);
    }
}
