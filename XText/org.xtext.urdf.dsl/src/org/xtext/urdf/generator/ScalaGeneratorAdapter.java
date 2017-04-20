package org.xtext.urdf.generator;
import org.eclipse.emf.ecore.resource.Resource;



public class ScalaGeneratorAdapter
{
	
	public String getResourceName(Resource res)
	{
		return ((uRDF.Robot)res.getContents().get(0)).getName() + ".xml";
	}
	
	
	public String generateURDF(Resource res)
	{
		return new ScalaGenerator().generateURDF((uRDF.Robot)res.getContents().get(0),getResourceName(res));
	}
}
