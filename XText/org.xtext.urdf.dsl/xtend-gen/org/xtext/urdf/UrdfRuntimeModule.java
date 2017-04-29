package org.xtext.urdf;

import org.eclipse.xtext.linking.ILinkingService;
import org.xtext.urdf.AbstractDslRuntimeModule;
import org.xtext.urdf.UrdfLinkingService;

@SuppressWarnings("all")
public class UrdfRuntimeModule extends AbstractDslRuntimeModule {
  @Override
  public Class<? extends ILinkingService> bindILinkingService() {
    return UrdfLinkingService.class;
  }
}
