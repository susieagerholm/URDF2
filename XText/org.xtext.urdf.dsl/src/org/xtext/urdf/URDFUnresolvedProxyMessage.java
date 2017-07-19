package org.xtext.urdf;

import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.diagnostics.DiagnosticMessage;
import org.eclipse.xtext.linking.ILinkingDiagnosticMessageProvider;
import org.eclipse.xtext.linking.impl.IllegalNodeException;

public class URDFUnresolvedProxyMessage implements ILinkingDiagnosticMessageProvider {

	@Override
	public DiagnosticMessage getUnresolvedProxyMessage(ILinkingDiagnosticContext context) {
		// Instantiation by instance allowed - so return null
		return null;
	}

}
