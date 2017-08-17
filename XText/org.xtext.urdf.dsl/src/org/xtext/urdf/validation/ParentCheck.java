package org.xtext.urdf.validation;

import java.util.HashMap;

import org.xtext.urdf.myURDF.Link;

public class ParentCheck {
	
	boolean validationError = false;
	HashMap<String, String> checker = null;
	Link errorLink = null;
	
	public boolean isValidationError() {
		return validationError;
	}
	public void setValidationError(boolean validationError) {
		this.validationError = validationError;
	}
	public HashMap<String, String> getChecker() {
		return checker;
	}
	public void setChecker(HashMap<String, String> checker) {
		this.checker = checker;
	}
	public Link getErrorLink() {
		return errorLink;
	}
	public void setErrorLink(Link errorLink) {
		this.errorLink = errorLink;
	}
}
