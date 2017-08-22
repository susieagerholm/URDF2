package org.xtext.urdf;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;


public class URDFQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
	public QualifiedName qualifiedName(EObject x) {
	//public QualifiedName apply(EObject x) {
		if(x.eGet(x.eClass().getEStructuralFeature("name")) != null) {
			return QualifiedName.create((String)x.eGet(x.eClass().getEStructuralFeature("name")));
			 
		}
		else {
		    EReference myfeature = x.eContainmentFeature();
		    Object refff = x.eContainer().eGet(x.eContainmentFeature());
		    if (refff instanceof EObjectContainmentEList) {
				int no = ((EObjectContainmentEList) refff).indexOf(x);
				return QualifiedName.create(myfeature.getName() + "_" + no);
		    }
			else return QualifiedName.create(myfeature.getName());
		}
	
	}
}
