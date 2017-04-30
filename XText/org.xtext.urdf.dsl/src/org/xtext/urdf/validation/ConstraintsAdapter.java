package org.xtext.urdf.validation;

import org.eclipse.emf.ecore.EReference;

import scala.Tuple3;
import uRDF.Robot;

public class ConstraintsAdapter
{
	public Tuple3<Object,String,EReference> urdfComplete(Robot robot)
	{
		return new Constraints().urdfComplete(robot);
	}
	
	
}
