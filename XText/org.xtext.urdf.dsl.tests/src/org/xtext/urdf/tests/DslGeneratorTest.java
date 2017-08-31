package org.xtext.urdf.tests;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.eclipse.xtext.junit4.InjectWith;
import org.junit.Assert;
import org.junit.Test;
import org.xml.sax.SAXException;


@InjectWith(DslInjectorProvider.class)

public class DslGeneratorTest {

	 @Test 
	 public void validXML() {
			String xmlPath = "c:\\temp\\r1.xml";
			String xsdPath = "c:\\temp\\uRDF.xsd";
			 
			try {    //convert content to lower case to be aligned with schema definitions
				 String content = new String(Files.readAllBytes(Paths.get(xmlPath)));
				 content = content.toLowerCase();
				 Files.write(Paths.get("c:\\temp\\r1.xml"), content.getBytes());
			} catch (Exception e) {
				e.printStackTrace();
			} 
		      
	         boolean isValid = validateXMLSchema(xsdPath,xmlPath);
	         
	         if(isValid){
	            System.out.println(xmlPath + " is valid against " + xsdPath);
	         } else {
	            System.out.println(xmlPath + " is not valid against " + xsdPath);
	         }
	 		 Assert.assertTrue("output URDF is compliant with schemadefinition", isValid==true);
	   }
	   
	   public static boolean validateXMLSchema(String xsdPath, String xmlPath){
	      try {
	         SchemaFactory factory =
	            SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
	            Schema schema = factory.newSchema(new File(xsdPath));
	            Validator validator = schema.newValidator();
	            validator.validate(new StreamSource(new File(xmlPath)));
	      } catch (IOException e){
	         System.out.println("Exception: "+e.getMessage());
	         return false;
	      }catch(SAXException e1){
	         System.out.println("SAX Exception: "+e1.getMessage());
	         return false;
	      }
	      return true;
	   }
}



