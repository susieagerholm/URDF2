package org.xtext.urdf.validation;

import org.xtext.urdf.domainmodel.*;


public class ConstraintsAdapter
{
	public boolean urdfComplete(Robot robot)
	{
		return new Constraints().urdfComplete(robot);
	}
	
	
}
