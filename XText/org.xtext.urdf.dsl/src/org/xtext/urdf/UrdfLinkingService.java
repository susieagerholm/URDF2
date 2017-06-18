package org.xtext.urdf;


import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.nodemodel.INode;

import org.xtext.urdf.myURDF.Link;
import org.xtext.urdf.myURDF.MyURDFFactory;
import org.xtext.urdf.myURDF.impl.MyURDFFactoryImpl;

public class UrdfLinkingService extends DefaultLinkingService {
	
	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference ref, INode node) throws IllegalNodeException {

		List<EObject> list = super.getLinkedObjects(context, ref, node);

		if (!list.isEmpty()) {
			return list;
		}
		
		String name = node.getText();
		// create a dummy URI with the DSL's file extension
		URI uri = URI.createURI("dummy:/" + name + ".urdf");
		ResourceSet resourceSet = context.eResource().getResourceSet();
		Resource resource = resourceSet.getResource(uri, false);
		Link link;

		if (resource == null) {
			MyURDFFactory eINSTANCE = MyURDFFactoryImpl.init();
			link = eINSTANCE.createLink();
			link.setName(name);
			resource = resourceSet.createResource(uri);
			List<EObject> contents = resource.getContents();
			contents.add(link);
		} else {
			link = (Link) resource.getContents().get(0);
		}

		return Collections.singletonList((EObject)link);
	}
}
