package org.xtext.urdf;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.xtext.urdf.myURDF.URDFAttrNumeric;
import org.xtext.urdf.myURDF.URDFAttrSignedNumeric;

public class URDFQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
	public QualifiedName qualifiedName(URDFAttrSignedNumeric a) {
		//return a.eContainmentFeature().getName();
		return QualifiedName.create(a.eContainmentFeature().getName());
	}
}
