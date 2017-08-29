package org.xtext.urdf.generator;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.xtext.EcoreUtil2;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xtext.urdf.myURDF.AssignNewValue;
import org.xtext.urdf.myURDF.Collision;
import org.xtext.urdf.myURDF.DotExpression;
import org.xtext.urdf.myURDF.Inertial;
import org.xtext.urdf.myURDF.Link;
import org.xtext.urdf.myURDF.MyURDFPackage;
import org.xtext.urdf.myURDF.NamedElement;
import org.xtext.urdf.myURDF.ReUseAble;
import org.xtext.urdf.myURDF.Reuse;
import org.xtext.urdf.myURDF.Robot;
import org.xtext.urdf.myURDF.Topology;
import org.xtext.urdf.myURDF.URDFAttrFloat;
import org.xtext.urdf.myURDF.URDFAttrINT;
import org.xtext.urdf.myURDF.URDFAttrNumeric;
import org.xtext.urdf.myURDF.URDFAttrSTRING;
import org.xtext.urdf.myURDF.URDFAttrSignedNumeric;
import org.xtext.urdf.myURDF.Visual;
import org.xtext.urdf.validation.CyclesValidator;
import org.xtext.urdf.validation.GenericTree;
import org.xtext.urdf.validation.GenericTreeNode;


public class UrdfGenerator
{
	
	List<String> originList = Arrays.asList("x","y","z","roll","pitch","yaw");
	HashMap<String,String> originKeyValues = new HashMap<String,String>();;
	
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
          try {
              generateTag(doc, rootElement ,entry);			
		} catch (Exception e) {
			e.printStackTrace();
		}

//          destination.appendChild(doc.createTextNode(entry.eContainingFeature().toString()));
      }
   
      TransformerFactory transformerFactory = TransformerFactory.newInstance();
      DOMSource source = new DOMSource(doc);
      StreamResult result = new StreamResult(new File("c:\\temp\\" + robot.getName() + ".xml"));

      Transformer transformer = transformerFactory.newTransformer();
      transformer.setOutputProperty(OutputKeys.INDENT, "yes");
      transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
      transformer.transform(source, result);
      
      //This requires a Graphviz installation on the OS. 
      generateGraphViz(robot.getTopologies());      

	  return source.toString();
	
	}
	
	private void generateGraphViz(EList<Topology> topologies) {
	      GraphViz gv = new GraphViz();
	      gv.addln(gv.start_graph());
	      //gv.addln("rankdir=LR"); this gives a horizontal graph. Display is better top-down. 
	      
	      GenericTree<String> tree = getTree(topologies);
	      for (GenericTreeNode<String> node : tree.getAllNodes()) {
	    	  if(tree.getRoot().equals(node)) {
	    		  continue;
	    	  } else {
	    		  gv.addln(node.getParent() + " [shape=box, color=black]");
	    		  gv.addln(node.getParent() + "_" + node.getData() + " [shape=ellipse, color=blue]");
	    		  gv.addln(node.getParent()  + " -> " + node.getParent()+"_"+node.getData() + ";");
	    		  if(tree.isLeafNode(node)) {
		    		  gv.addln(node.getData() + " [shape=box, color=black]");
	    		  } 
	    		  gv.addln(node.getParent()+"_"+node.getData()  + " -> " + node.getData() + ";");	    		  
	    	  }
		  }

	      gv.addln(gv.end_graph());

	      System.out.println(gv.getDotSource());

	      String type = "png";
	      File out = new File(GraphViz.TEMP_DIR + "\\urdfGraph." + type);   
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
	          
	          entry = revertToOriginalName(entry);
	          
             if(superType != null && superType.equalsIgnoreCase("reuseableimpl") && hasFeature(entry,"isReuseOf")) {
            	  EStructuralFeature ft = entry.eClass().getEStructuralFeature("isReuseOf");
	        	  EObject aReuseAble = (EObject)entry.eGet(ft);
	        	  if(aReuseAble != null) {
	        		  EObject merged = mergeURDFObject(entry,aReuseAble);
	        		  generateTag(doc, destination, merged);
	        		  return null;
	        	  }
	          }
	          
              manageInterfaceTypes(doc,superType,destination,tag);
	          
	          for(Field f : total){
	        	 if (f.getName().contains("_EDEFAULT") || 
	        		 f.getName().equals(null) ||
	        		 f.getName().equals("fromTopo")) {
	        		// ignore
	        	 } else {
	        		f.setAccessible(true);
		        	if(checkType(f, entry)!=null) {
		        		 //A link does not know whether it is a parent or child link - therefore parent/child
		        		 // tags has to be handled while traversing the joint
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
	        					tag.setAttribute("filename", getAttributeValue(f,entry).replace("\t", "\\t"));
	        				} else {
	        					if(type.equalsIgnoreCase("origin")) {
	        						manageOriginFields(tag,f,entry);
	        					} else {
	        						tag.setAttribute(f.getName(), getAttributeValue(f,entry));
	        					}
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
	
	private EObject revertToOriginalName(EObject entry) {
        if(entry instanceof NamedElement && ((NamedElement)entry).getName() != null && ((NamedElement)entry).getName().startsWith("_")) {
  		 //revert to original name after renaming in derived state
      	  ((NamedElement)entry).setName(((NamedElement)entry).getName().substring(1));
        }
		return entry;
	}


	private void manageInterfaceTypes(Document doc, String superType, Element destination, Element tag) {
		String pureName = superType.toLowerCase().replace("impl", "");
		List<String> interfaceList = Arrays.asList("geometry","material");
		if(interfaceList.contains(pureName)) {
			pureName = Character.toString(pureName.charAt(0)).toUpperCase()+pureName.substring(1);
     	    Element supertag = doc.createElement(pureName);
	        destination.appendChild(supertag).appendChild(tag);
		} else {
	       	destination.appendChild(tag);
		}
	}


	@SuppressWarnings("unchecked")
	private EObject mergeURDFObject(EObject entry, EObject aReuseAble) {
		//aReuseAble = the object to be reused from
		//entry = the object that reuses

		Link reuseCopy = null;
		if(aReuseAble instanceof Link) {
		  reuseCopy = (Link)EcoreUtil2.copy(aReuseAble);
		}
		//Avoid going into reuse mode in 'generateTag' with the new copy object - by setting null in isreuseof   
		reuseCopy.setIsReuseOf(null);
		((NamedElement)reuseCopy).setName(((NamedElement)entry).getName());
	  	EStructuralFeature ft = entry.eClass().getEStructuralFeature("reuse");
	  	  
	  	//Now add or edit the properties/features from the entry object to the reuseCopy object
	  	EObjectContainmentEList<Reuse> reuseList = (EObjectContainmentEList<Reuse>)entry.eGet(ft);
   	    if(reuseList == null || reuseList.isEmpty()) {
  		  //nothing to add or edit
  		  return reuseCopy;
  	    } else {
	  		for (Reuse reuse : reuseList) {
	  		    //Add:
	  			ReUseAble reUseAbleAdd = reuse.getAdd();
	  			if(reUseAbleAdd != null) { 
	  				EObject merged = addProperties(reUseAbleAdd,reuseCopy);
		  			return merged;
	  			}
	  			//Edit:  
	  			AssignNewValue newValue = reuse.getEdit();
	  			
	  			//For debugging
	  			//String value = ((URDFAttrSignedNumericImpl)newValue.getNewReuseable()).getValue();

	  			DotExpression expr  = (DotExpression)newValue.getGetRef();
	  			
	  			//For debugging: MassInKiloGrams
	  			//String name = expr.getTail().eContainingFeature().getName();

	  			//Now we compare the object id for the container object/parent object of entry (which holds the new value that we want to assign) with the container object of in the Object we reuse from
	  			EObject parent = expr.getTail().eContainer();
	  			//We have to use the container object to compare with - as URDFAttr objects has different id in entry and aReUseable
	  			List<EObject> list = (List<EObject>)EcoreUtil2.getAllContentsOfType(aReuseAble, expr.getTail().eContainer().getClass());
	  			for (EObject obj : list) {
	  				//Parent holds the new value
	  				//obj holds the old value
					if(obj == parent) {
						//temp hold old value
						EStructuralFeature aFeature = expr.getTail().eContainingFeature();
						EObject oldValue = (EObject)obj.eGet(aFeature);
						//Set new value
						obj.eSet(aFeature, newValue.getNewReuseable());
						
						reuseCopy = (Link)EcoreUtil2.copy(aReuseAble);
						reuseCopy.setIsReuseOf(null);
						((NamedElement)reuseCopy).setName(((NamedElement)entry).getName());
						
						//Put the old value back
						obj.eSet(aFeature, oldValue);
						return reuseCopy;
					}
				} 
 	  		}
  	    }
	    return null;
	}


	private EObject addProperties(ReUseAble addProperties, Link baseObject) {
		if(addProperties instanceof Inertial) {
			baseObject.setInertial((Inertial)addProperties);	
		} else if(addProperties instanceof Visual) {
			baseObject.getVisual().add((Visual)addProperties);	
		} else if(addProperties instanceof Collision) {
			baseObject.getCollision().add((Collision)addProperties);	
		} 
		return baseObject;
	}


	private void manageOriginFields(Element tag, Field f, EObject entry) {
		// consider using entry.hashCode() to make sure we work on the same origin object. 
		// it should not be a problem since this method only is called from generateTag which deals with one EObject at a time
		if(originList.contains(f.getName())) {
			originKeyValues.put(f.getName(), getAttributeValue(f,entry));
		} 
		if(originKeyValues.containsKey("x") && originKeyValues.containsKey("y") && originKeyValues.containsKey("z")) {
			tag.setAttribute("xyz",originKeyValues.get("x") + " " +  originKeyValues.get("y") + " " + originKeyValues.get("z"));
			originKeyValues.remove("x"); originKeyValues.remove("y"); originKeyValues.remove("z"); 
		}
		if(originKeyValues.containsKey("roll") && originKeyValues.containsKey("pitch") && originKeyValues.containsKey("yaw")) {
			tag.setAttribute("rpy",originKeyValues.get("roll") + " " +  originKeyValues.get("pitch") + " " + originKeyValues.get("yaw"));
			originKeyValues.remove("roll"); originKeyValues.remove("pitch"); originKeyValues.remove("yaw"); 
		}
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

	private boolean hasFeature(EObject obj, String featureName) {
		for(EStructuralFeature feature : obj.eClass().getEAllStructuralFeatures()) {
			if(feature.getName().equalsIgnoreCase(featureName)) {
				return true;
			}
		}
		return false;
	}
	
	public GenericTree<String> getTree(EList<Topology> topoList) {
	    GenericTree<String> tree = new GenericTree<String>();
	    CyclesValidator validator = new CyclesValidator(); 
	    
	    //Start to get the root topologies
	    EList<Topology> rootList = validator.getRootTopologies(topoList, false);
	    if(rootList == null) {
	    	return null;
	    }
	    
		for (Topology topo : rootList) {
			GenericTreeNode<String> node = validator.buildNodeChainFromTopology(topo, null);
			if(tree.getRoot() == null) {
				tree.setRoot(node.getTopNode());;
			} else if(tree.getRoot().equals(node.getTopNode())) {
				if(!node.getTopNode().getChildren().isEmpty()) {
					tree.getRoot().addChild(node.getTopNode().getChildAt(0));
				}
			} else {
				System.out.println("It should not be possible to end here");
			}
			System.out.println(tree.toStringWithDepth());
		}
		
		topoList.removeAll(rootList);

		//build rest of the tree
		for (Topology topo : topoList) {
			GenericTreeNode<String> parentNode = tree.find(topo.getParent().getName());
			validator.buildNodeChainFromTopology(topo.getChild(), parentNode);
			System.out.println(tree.toStringWithDepth());
		}
		
		return tree;
	}
	
}
