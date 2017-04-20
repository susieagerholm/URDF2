package org.xtext.urdf.validation;

import uRDF.Robot;

public class ConstraintsAdapter
{
	public boolean urdfComplete(Robot robot)
	{
		return new Constraints().urdfComplete(robot);
	}
	
	
}
