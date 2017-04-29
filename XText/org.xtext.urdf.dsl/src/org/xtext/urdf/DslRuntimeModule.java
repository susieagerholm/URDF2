package org.xtext.urdf;


import org.eclipse.xtext.linking.ILinkingService;

public class DslRuntimeModule extends AbstractDslRuntimeModule {
	@Override
	public Class<? extends ILinkingService> bindILinkingService() {
		return UrdfLinkingService.class;
	}
	


}