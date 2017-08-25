package org.xtext.urdf;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.xtext.urdf.myURDF.AddTo;
import org.xtext.urdf.myURDF.Axis;
import org.xtext.urdf.myURDF.Calibration;
import org.xtext.urdf.myURDF.Collision;
import org.xtext.urdf.myURDF.Dynamics;
import org.xtext.urdf.myURDF.Inertial;
import org.xtext.urdf.myURDF.Joint;
import org.xtext.urdf.myURDF.JointRef;
import org.xtext.urdf.myURDF.JointType;
import org.xtext.urdf.myURDF.Limit;
import org.xtext.urdf.myURDF.Link;
import org.xtext.urdf.myURDF.MyURDFFactory;
import org.xtext.urdf.myURDF.MyURDFPackage;
import org.xtext.urdf.myURDF.NamedElement;
import org.xtext.urdf.myURDF.Origin;
import org.xtext.urdf.myURDF.ReUseAble;
import org.xtext.urdf.myURDF.Robot;
import org.xtext.urdf.myURDF.SafetyController;
import org.xtext.urdf.myURDF.Topology;
import org.xtext.urdf.myURDF.Visual;
import org.xtext.urdf.myURDF.impl.RobotImpl;

class UrdfDerivedStateComputer implements IDerivedStateComputer {
	
	
	@Override
	public void discardDerivedState(DerivedStateAwareResource resource) {
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
		//how to discard: remove all ref to demanded links and edges from topo?
		TreeIterator<EObject> temp = resource.getAllContents();
		while (temp.hasNext()) {
			EObject obj = temp.next();
			if (obj instanceof Topology) {
//				obj.eContents().clear(); //Topology object does not support clear()

				//When we set the objects below to null it impacts the topology objects in the resourceset when 
				//derivedstate is called based on a SAVE event. Parent and child are null and therefore derivedstate
				//is not installed as expected. Validation is dependent on derivedState (uses the topology chains)  
				//which means validations fails. The generator is only called when validation succeeds. 
				
				//When we receive a change event - discard is not called and therefore derivedstate works as expected

				//For transient objects (those not to be persisted) like Topology the intention with discard is probably to
				//remove them before the generator persists. However that is not viable in our case as that would make validation
				//fail. The question is whether 'disabling' discard has other sideeffects.
				
//				Topology topo = (Topology)obj;
//				topo.setParent(null);
//				topo.setChild(null);
//				topo.setJoint(null);
			}
			if (obj instanceof AddTo) {
				//Should we set the object null - what happens in the UI?
			}			
		}
	}
	
	@Override
	public void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		//Calling resource.isLoaded() seems to fix the invalid start validation state issue - mentioned in the cycles method in CyclesValidation
		if  (!preLinkingPhase && resource.isLoaded()) {   
			installTopology(resource);
		}
	}
	
	public void installTopology(DerivedStateAwareResource resource) {
				Robot rob = (Robot)EcoreUtil2.getObjectByType(resource.getContents(),MyURDFPackage.eINSTANCE.getRobot());
				if(rob==null) {
					return;
				}
				TreeIterator<EObject> eo = rob.eAllContents();
				while(eo.hasNext()) {
					EObject top = eo.next();
					if( top instanceof Joint) {
						createStandardJointsInTopology((Joint)top,rob);
					}
					if( top instanceof AddTo) {
						manageAddToProperties((AddTo)top,rob);
					}

					if (top instanceof Topology) {
						Topology topo = (Topology)top;
						//When saving - parent/child is null, and therefore we don't install topology as expected -> solution: we don't use discard derived state
						if(topo.getChild() != null && topo.getParent() != null) {
//							switch (getLastEntry(top)) {
//							case " ": // we havent finished writing
//								return;  //careful - we end installTopology
//							case "\n": //ok
//								break;
//							default:
//								break;
//							}
							manageTopology(rob,topo);
						}
					}
				}
			
		
	}
	
	private void addTopoLinkToRobot(Topology topo, Robot robo) {
		Link newLink = MyURDFFactory.eINSTANCE.createLink();
		newLink.setName(getNodeText(topo, 1));
		robo.getLinks().add(newLink);
	}
	
	private boolean isNameFound(EList<Link> links, Topology topo) {
		boolean temp = false;
		for (Link l : links) {
			if(l.getName().equals(getNodeText(topo, 1))) {
				temp = true;
				break;
			}
		}
		return temp;
	}
	
	private void manageTopology(Robot rob, Topology topo) {
		//We receive one call per Topology object, so we don't need to traverse the whole topology chain
		
		if(!isNameFound(rob.getLinks(),topo)) {
			addTopoLinkToRobot(topo, rob);
		}
		
		if(!isNameFound(rob.getLinks(),topo.getChild())) {
			addTopoLinkToRobot(topo.getChild(), rob);
		}
		
		Joint aJoint = MyURDFFactory.eINSTANCE.createJoint();
		//MAYBE CHILD AND PARENT SHOULD CHANGE SIDE!!
		//Vi skal være super obs paa at bruge child/parent på samme maade alle steder!! 
		aJoint.setName(topo.getParent().getName() + "_" + getNodeText(topo.getChild(), 1));
		//MAYBE CHILD AND PARENT SHOULD CHANGE SIDE!!
		//Vi skal være super obs paa at bruge child/parent på samme maade alle steder!! 
		aJoint.setChildOf(topo.getParent());
		aJoint.setParentOf(topo.getChild().getParent());
		aJoint.setType(getJointType(topo.getJoint()));
		rob.getJoint().add(aJoint);
	}

	private EObject rename(EObject root) {
		EStructuralFeature ft = root.eClass().getEStructuralFeature("name");
		String rootName = (String)root.eGet(ft);
    	root.eSet(ft,"_"+rootName);

		TreeIterator<EObject> allContents = root.eAllContents();
		while(allContents.hasNext()) {
			EObject obj = allContents.next();
			if(obj instanceof NamedElement) {
				EStructuralFeature ft2 = obj.eClass().getEStructuralFeature("name");
			    Object name = obj.eGet(ft2);
			    if(name != null) {
			    	obj.eSet(ft2,"_"+name);
			    }
			}		    
		}
		return root;
	}
	
	private void manageAddToProperties(AddTo add, Robot robot) {
		
		Link parentLink = null;
		Joint parentJoint = null;
		if(add.getAdd() == null) {
			return;
		}
		
		if(add.getLink() != null) {
		 parentLink = (Link)getObjectByName(robot.getLinks(),add.getLink().getName());
		}
		if(add.getJoint() != null) {
		 parentJoint = (Joint)getObjectByName(robot.getJoint(),add.getJoint().getName());
		}

		//We need to work on a copy object - otherwise the required 'add' feature in class AddToImpl is removed
		//when we try to set it on the 'real' urdf object. 
		//When we copy an EObject - all names will conflict with the parent object (a name has to be unique)
		//Therefore we have to rename all names - prefix with an underscore. 
		ReUseAble newObj = EcoreUtil.copy(add.getAdd());
		newObj = (ReUseAble)rename(newObj);
		
		if(parentLink!=null) {
			manageAddToLink(parentLink,newObj,add);
		} else if(parentJoint != null) {
			manageAddToJoint(parentJoint,newObj,add);
		} else {
			return;
		}
	}
	
	private void manageAddToJoint(Joint parentJoint, ReUseAble newObj, AddTo add) {
		if(newObj instanceof Axis) {
			parentJoint.setAxis((Axis)newObj);
		} else if(newObj instanceof Calibration) {
			parentJoint.setCalibration((Calibration)newObj);
		} else if(newObj instanceof Dynamics) {
			parentJoint.setDynamics((Dynamics)newObj);
		} else if(newObj instanceof Limit) {
			parentJoint.setLimit((Limit)newObj);
		} else if(newObj instanceof SafetyController) {
			parentJoint.setSafetycontroller((SafetyController)newObj);
		} else if(newObj instanceof Origin) {
			parentJoint.setOrigin((Origin)newObj);
		} 
		
	}

	private void manageAddToLink(Link parentLink, ReUseAble newObj, AddTo add) {
		if(newObj instanceof Visual) {
			parentLink.getVisual().add((Visual)newObj);
		} else if(add.getAdd() instanceof Collision) {
			parentLink.getCollision().add((Collision)newObj);
		} else if(add.getAdd() instanceof Inertial) {
			parentLink.setInertial((Inertial)newObj);
		}
	}
	
	private void createStandardJointsInTopology(Joint joint, Robot robot) {
		//Here we create Topology objects based on standard joints. 
		//We use the 'isTopoFlag' to filter relevant joints
		
		String ruleName = getRuleName(joint);
		if(ruleName != null && ruleName.equalsIgnoreCase("Joint") /* && !joint.isFromTopo() */) {
			Topology topoParent = MyURDFFactory.eINSTANCE.createTopology();
			// Cyclic resolution of lazy links : Joint.childOf->Joint.childOf
			// Vi sætter link objectet på et topologi object, og linket er i forvejen knyttet til et joint
//			topoParent.setParent(joint.getChildOf());
			
			topoParent.setJoint(getJointRef(joint));

			Topology topoChild = MyURDFFactory.eINSTANCE.createTopology();
			// Cyclic resolution of lazy links : Joint.parentOf->Joint.parentOf
//			topoChild.setParent(joint.getParentOf());
			
			topoParent.setChild(topoChild);
			if(robot.getTopologies()==null) {
				// This is experimental - don't know whether this conflicts when a topology is created in the UI
				  EList<EObject> newList = new BasicEList<EObject>();					
				  ((RobotImpl)robot).eSet(MyURDFPackage.TOPOLOGY, newList);
			} 
			robot.getTopologies().add(topoParent);
		}
	}

	@SuppressWarnings("unused")
	private String getLastEntry(EObject obj) {
		if (NodeModelUtils.getNode(obj) != null) {
			String text = NodeModelUtils.getNode(obj).getRootNode().getText();
			char temp = text.toCharArray()[text.length()-1];
			return String.valueOf(temp);
		}
		return null;
	}

	private String getNodeText(EObject obj, int no) {
   	  if (NodeModelUtils.getNode(obj) != null) {
		  Iterable<ILeafNode> it = NodeModelUtils.getNode(obj).getLeafNodes();
		  int i = 0;
		  for(ILeafNode s: it){
			  if (i==no) {
				return s.getText();
			  }
			  i++;
	      }
   	  }
	  return "";
	}

	private String getRuleName(EObject obj) {
	  String ruleName = null;
	  if (NodeModelUtils.getNode(obj) != null) {
			  ICompositeNode iNode = NodeModelUtils.getNode(obj);
			  EObject grammarElement = iNode.getGrammarElement();
			  if (grammarElement instanceof RuleCall) {
		            AbstractRule rule = ((RuleCall) grammarElement).getRule();
		            ruleName = rule.getName();
			  }
	  }
	  return ruleName;
	}
	
	//From standard to Topo
	private JointRef getJointRef(Joint joint) {
		JointRef jointRef = MyURDFFactory.eINSTANCE.createJointRef();
		if (joint.getType() != null) {
			switch (joint.getType()) {
			case PRISMATIC : jointRef.setPris(JointType.PRISMATIC.toString()); 
			case REVOLUTE : jointRef.setRev(JointType.REVOLUTE.toString()); 
			case FIXED : jointRef.setFix(JointType.FIXED.toString()); 
			case CONTINUOUS : jointRef.setCont(JointType.CONTINUOUS.toString()); 
			}
		}
		return jointRef;
	}

	//From Topo to standard
	private JointType getJointType(JointRef ref) {
		if (ref.getCont() != null) {
			return JointType.CONTINUOUS;
		} else if(ref.getPris() != null) {
			return JointType.PRISMATIC;
		} else if(ref.getFix() != null) {
			return JointType.FIXED;
		} else if(ref.getRev()!=null) {
			return JointType.REVOLUTE;
		} else {
			return null;
		}
	}
	
	private <T extends NamedElement> EObject getObjectByName(EList<T> list,String name) {
		EObject temp = null;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				 temp = list.get(i);
				 break;
			}
		}
		return temp;
	}
	
}