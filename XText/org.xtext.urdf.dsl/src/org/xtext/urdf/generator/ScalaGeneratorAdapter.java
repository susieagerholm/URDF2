package org.xtext.urdf.generator;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import uRDF.Robot;


public class ScalaGeneratorAdapter
{
	
	public String getResourceName(Resource res)
	{
		return ((uRDF.Robot)res.getContents().get(0)).getName() + ".xml";
	}
	
	
	public String generateURDF(Resource res)
	{
		String urdf = "";
		try {
			urdf = generate((uRDF.Robot)res.getContents().get(0));	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return urdf;
		
	//	return new ScalaGenerator().generateURDF((uRDF.Robot)res.getContents().get(0),getResourceName(res));
	}
	
	
	public String generate(Robot robot) throws Exception {
    
	  DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
	  Document doc = docBuilder.newDocument();
	  String type = robot.getClass().getInterfaces()[0].getSimpleName();
	  Element rootElement = doc.createElement(type);
	  doc.appendChild(rootElement);
	
	  EList<EObject> totalList = new BasicEList<EObject>(); 
	  totalList.addAll(robot.getLink());
	  totalList.addAll(robot.getJoint());
	  Iterator<EObject> it = totalList.iterator();
	  
      while (it.hasNext()) {
          EObject entry = (EObject) it.next();
          generateTag(doc, rootElement ,entry);
//          destination.appendChild(doc.createTextNode(entry.eContainingFeature().toString()));
      }
   
      TransformerFactory transformerFactory = TransformerFactory.newInstance();
      DOMSource source = new DOMSource(doc);
      StreamResult result = new StreamResult(new File("c:\\temp\\" + robot.getName() + ".xml"));

      Transformer transformer = transformerFactory.newTransformer();
      transformer.setOutputProperty(OutputKeys.INDENT, "yes");
      transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
      transformer.transform(source, result);

	  return "ok";
	
	}

	public EObject checkType(Field f, EObject entry) {
		 EObject temp = null;
		 if(f.getType().isInterface() && f.getType().getTypeName().startsWith("uRDF.")) {
			 try {
    			 temp = (EObject)f.get(entry);
			} catch (Exception e) {
				// ignore
			}
		 }
		 return temp;
	}
	
	
	@SuppressWarnings("unchecked")
	public Element generateTag(Document doc, Element destination, EObject entry) throws Exception {
	          String type = entry.getClass().getInterfaces()[0].getSimpleName();
	          Field[] fields = entry.getClass().getDeclaredFields();
	          Field[] superfields = entry.getClass().getSuperclass().getDeclaredFields();
	          Field[] total = Stream.concat(Arrays.stream(fields), Arrays.stream(superfields)).toArray(Field[]::new);
	          
	          Element tag = null;
	          tag = doc.createElement(type);
	          destination.appendChild(tag);
	          for(Field f : total){
	        	 if (f.getName().contains("_EDEFAULT") || f.getName().equals(null) ) {
	        		// ignore
	        	 } else {
	        		f.setAccessible(true);
		        		if(f.getType().isAssignableFrom(EObject.class) || checkType(f, entry)!=null) {
	        			generateTag(doc, tag, (EObject)f.get(entry));
	        		} else if (f.getType().isAssignableFrom(EList.class)) {
	        			EList<EObject> list = (EList<EObject>)f.get(entry);
	        			if(list != null) {
		        			for (int i = 0; i < list.size(); i++) {
		        				if(list.get(i) != null) {
		        					generateTag(doc,tag ,list.get(i));
		        				}
							}
	        			}
	        		} else {
	        			if((""+f.get(entry)).equalsIgnoreCase("null")) {
	        				//ignore null attributes
	        			} else {
	        				tag.setAttribute(f.getName(),""+f.get(entry));
	        			}
	        		}
	        	 }
	          }
	          return destination;
	}
	
}
