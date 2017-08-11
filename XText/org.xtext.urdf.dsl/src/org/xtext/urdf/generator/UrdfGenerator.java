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
import org.eclipse.xtext.EcoreUtil2;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xtext.urdf.myURDF.Link;
import org.xtext.urdf.myURDF.MyURDFPackage;
import org.xtext.urdf.myURDF.Robot;
import org.xtext.urdf.myURDF.Topology;
import org.xtext.urdf.myURDF.URDFAttrFloat;
import org.xtext.urdf.myURDF.URDFAttrINT;
import org.xtext.urdf.myURDF.URDFAttrNumeric;
import org.xtext.urdf.myURDF.URDFAttrSTRING;
import org.xtext.urdf.myURDF.URDFAttrSignedNumeric;


public class UrdfGenerator
{
	
	//Todo:
	//Origin
	
	public Robot getRobot(Resource res)
	{
		return (Robot)EcoreUtil2.getObjectByType(res.getContents(),MyURDFPackage.eINSTANCE.getRobot());
	}
	
	
	public String generateURDF(Resource res)
	{
		String urdf = "";
		try {
			urdf = generate(getRobot(res));	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return urdf;
	}
	
	
	public String generate(Robot robot) throws Exception {
    
	  DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
	  Document doc = docBuilder.newDocument();
	  

	  
	  String type = robot.eClass().getName();
	  Element rootElement = doc.createElement(type);
	  doc.appendChild(rootElement);
	
	  EList<EObject> totalList = new BasicEList<EObject>(); 
	  totalList.addAll(robot.getLinks());
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
      
      generateGraphViz(robot.getTopologies());      

	  return source.toString();
	
	}
	
	private void generateGraphViz(EList<Topology> topologies) {
	      GraphViz gv = new GraphViz();
	      gv.addln(gv.start_graph());

	      for (int i = 0; i < topologies.size(); i++) {
			Topology topo = topologies.get(i);
			gv = getGraphVizFormat(topo, gv,gv.getLastJointNumber());
		  }
	      gv.addln(gv.end_graph());
		  System.out.println(gv.getDotSource());

	      String type = "png";
	      File out = new File(GraphViz.TEMP_DIR + "\\graphTest." + type);   
	      gv.writeGraphToFile( gv.getGraph( gv.getDotSource(), type ), out );
	}


	public EObject checkType(Field f, EObject entry) {
		
		EObject temp = null;
		if (entry.getClass().getPackage().getName().equals("org.xtext.urdf.myURDF.impl")) {
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
	          String type = entry.eClass().getName();
	          String superType = entry.getClass().getSuperclass().getSimpleName();
	          Field[] fields = entry.getClass().getDeclaredFields();
	          Field[] superfields = entry.getClass().getSuperclass().getDeclaredFields();
	          Field[] total = Stream.concat(Arrays.stream(fields), Arrays.stream(superfields)).toArray(Field[]::new);
	          
	          Element tag = null;
	          tag = doc.createElement(type);
	          
	          if(superType.equalsIgnoreCase("geometryimpl")) {
	        	  Element supertag = doc.createElement("Geometry");
		          destination.appendChild(supertag).appendChild(tag);
	          } else {
	        	  destination.appendChild(tag);
	          }
	          
	          for(Field f : total){
	        	 if (f.getName().contains("_EDEFAULT") || f.getName().equals(null) ) {
	        		// ignore
	        	 } else {
	        		f.setAccessible(true);
		        	if(/* f.getType().isAssignableFrom(EObject.class) || */ checkType(f, entry)!=null) {
		        		 //A link does not know whether it is a parent or child link - therefore parent/child tags has to be handled while traversing the joint
		        		if(type.equalsIgnoreCase("joint") && f.getType().isAssignableFrom(Link.class)) {
		        			Element e = null;
		        			if(f.getName().equalsIgnoreCase("childof")) {
		        				e = doc.createElement("child");
		        			} else if(f.getName().equalsIgnoreCase("parentof")) {
		        				e = doc.createElement("parent");
		        			}
	        				Link cLink = (Link)f.get(entry);
	        				e.setAttribute("link", cLink.getName());
	        				tag.appendChild(e);
		        		} else if(isAttr(f)) { 
	        				if(f.getName().equalsIgnoreCase("pathToFile")) {
	        					tag.setAttribute("filename",getAttributeValue(f,entry));
	        				} else {
	        					tag.setAttribute(f.getName(), getAttributeValue(f,entry));
	        				}
		        		} else {
		        			generateTag(doc, tag, (EObject)f.get(entry));
		        		}
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
	
	private boolean isAttr(Field f) {
		if(f.getType().isAssignableFrom(URDFAttrSignedNumeric.class) ||
		   f.getType().isAssignableFrom(URDFAttrNumeric.class) ||
		   f.getType().isAssignableFrom(URDFAttrSTRING.class) ||
		   f.getType().isAssignableFrom(URDFAttrFloat.class) ||
		   f.getType().isAssignableFrom(URDFAttrINT.class)) {
		  return true;	
		} else {
		  return false;
		}
	}
	
	private String getAttributeValue(Field field, EObject eo) {
			String temp = null;
			try {
				if(field.getType().isAssignableFrom(URDFAttrSignedNumeric.class)) {
					URDFAttrSignedNumeric aNum = (URDFAttrSignedNumeric)field.get(eo);
					temp = aNum.getValue();
					
				} else if(field.getType().isAssignableFrom(URDFAttrNumeric.class)) {
					URDFAttrNumeric aNum = (URDFAttrNumeric)field.get(eo);
					temp = aNum.getValue();
					
				}else if(field.getType().isAssignableFrom(URDFAttrSTRING.class)) {
					URDFAttrSTRING aStr = (URDFAttrSTRING)field.get(eo);
					temp = aStr.getValue();
					
				}else if(field.getType().isAssignableFrom(URDFAttrFloat.class)) {
					URDFAttrFloat aFloat = (URDFAttrFloat)field.get(eo);
					temp = ""+aFloat.getValue();
					
				}else if(field.getType().isAssignableFrom(URDFAttrINT.class)) {
					URDFAttrINT aInt = (URDFAttrINT)field.get(eo);
					temp = ""+aInt.getValue();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return temp;
	}

	private static GraphViz getGraphVizFormat(Topology topo, GraphViz gv, int count) {
		if(topo == null || topo.getParent() == null || topo.getChild() == null) {
			return gv;
		}
		
		gv.addln("Joint" + count + " -> " + topo.getParent().getName() + ";");
		
		if(topo.getChild() != null) {
			gv.addln("Joint" + count + " -> " + topo.getChild().getParent().getName() + ";");			
			gv = getGraphVizFormat(topo.getChild(), gv, count+=1);
		} 
		
		return gv;
	}
}
