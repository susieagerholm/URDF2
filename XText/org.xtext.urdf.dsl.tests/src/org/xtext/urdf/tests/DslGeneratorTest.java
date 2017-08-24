package org.xtext.urdf.tests;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.eclipse.xtext.junit4.InjectWith;
import org.junit.Assert;
import org.junit.Test;



@InjectWith(DslInjectorProvider.class)

public class DslGeneratorTest {
	

	@Test 
	public void validateAgainstXSD() 	{
		//Validate generated URDF xml against a xml schema
		InputStream xml = null;
		InputStream xsd = null;
		try {
			xml = new FileInputStream(new File("c:\\temp\\r1.xml"));
			xsd = new FileInputStream(new File("c:\\temp\\uRDF.xsd"));
	        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
	        Schema schema = factory.newSchema(new StreamSource(xsd));
	        Validator validator = schema.newValidator();
	        validator.validate(new StreamSource(xml));
	        Assert.assertEquals("true","true");
	        
		} catch (Exception e) {
			e.printStackTrace();
	        Assert.assertEquals("true","false");
		}
	}

}


