package org.xtext.urdf.generator;
import org.eclipse.emf.ecore.resource.Resource;
import org.xtext.urdf.domainmodel.Robot;

public class ScalaGeneratorAdapter
{
	
	public String generateScala(Resource res)
	{
		return new ScalaGenerator().generateURDF((Robot)res.getContents().get(0));
	}
}
