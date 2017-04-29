package org.xtext.urdf

import org.eclipse.xtext.linking.ILinkingService

class UrdfRuntimeModule extends AbstractDslRuntimeModule {
	override Class<? extends ILinkingService> bindILinkingService() {
		return UrdfLinkingService
	}
}
