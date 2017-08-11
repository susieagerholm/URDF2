package org.xtext.urdf.tests;

import java.io.InputStream;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.eclipse.xtext.junit4.InjectWith;
import org.junit.Assert;
import org.junit.Test;
import org.xtext.urdf.myURDF.Robot;
import org.xtext.urdf.validation.CyclesValidator;

@InjectWith(DslInjectorProvider.class)

public class DslGeneratorTest{
	

	@Test 
	public static boolean validateAgainstXSD(InputStream xml, InputStream xsd)
	{
	    try
	    {
	        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
	        Schema schema = factory.newSchema(new StreamSource(xsd));
	        Validator validator = schema.newValidator();
	        validator.validate(new StreamSource(xml));
	        return true;
	    }
	    catch(Exception ex)
	    {
	        return false;
	    }
	}
	
	@Test 
	public void cycles() {
		Robot robo = TestAdapter.createTestUrdf();
		String[] result = new CyclesValidator().cycles(robo);
		Assert.assertTrue("cycle detected - but not expected", result[0]=="FALSE");
	}
	

}
