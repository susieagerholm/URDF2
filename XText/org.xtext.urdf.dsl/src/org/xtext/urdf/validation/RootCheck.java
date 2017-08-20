package org.xtext.urdf.validation;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.xtext.urdf.myURDF.Topology;

public class RootCheck {
	
	boolean validationError = false;
	EList<Topology> potentialRoots = null;
	ArrayList<String> prettyPrint = null;
	
	public boolean isValidationError() {
		return validationError;
	}
	public void setValidationError(boolean validationError) {
		this.validationError = validationError;
	}
	public EList<Topology> getPotentialRoots() {
		return potentialRoots;
	}
	public void setPotentialRoots(EList<Topology> potentialRoots) {
		this.potentialRoots = potentialRoots;
	}
	public ArrayList<String> getPrettyPrint() {
		return prettyPrint;
	}
	public void addPrettyPrintLine(String line) {
		if(prettyPrint == null) {
			prettyPrint = new ArrayList<String>();
		}
		prettyPrint.add(line);
	}
	
	public String toString() {
		String temp = "";
		for (int i = 0; i < prettyPrint.size(); i++) {
			temp = temp + prettyPrint.get(i) + "\n";
		}
		return temp;
	}
	
}
