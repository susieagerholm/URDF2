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
//		TreeIterator<EObject> temp = resource.getAllContents();
		//Only uninstall those objects we have installed as derived
//		while (temp.hasNext()) {
//			EObject obj = temp.next();
//			if(obj instanceof Joint && ((Joint) obj).getName().contains("__")) {
//				obj = null;
//			}
//			if (obj instanceof Topology) {
//				obj = null;
//			} 
//		}
	}
	
	@Override
	public void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		//Calling resource.isLoaded() seems to fix the invalid start validation state issue - mentioned in the cycles method in CyclesValidation
		//On save we get 2 calls to install derived state. Between the calls state is discarded. 
		//We uninstall/discard topology. Topology objects are available after validation in the generator
		
		//On change we get 1 call
		
		if  (!preLinkingPhase && resource.isLoaded() ) {   
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
				createTopologyFromStandardJoints((Joint)top,rob);
			}
			if( top instanceof AddTo) {
				manageAddToProperties((AddTo)top,rob);
			}

			if (top instanceof Topology) {
				Topology topo = (Topology)top;
				//When saving - parent/child is null, and therefore we don't install topology as expected -> solution: we don't use discard derived state
				if(topo.getChild() != null && topo.getParent() != null) {
					manageTopology(rob,topo);
				}
			}
		}
	}
	
	private void addTopoLinkToRobot(String name, Robot robo) {
		Link newLink = MyURDFFactory.eINSTANCE.createLink();
		newLink.setName(name);
		robo.getLinks().add(newLink);
	}
	
	private boolean isLinkInRobot(Robot robot, Link link) {
		if(link == null) 
			return true;  //we return true to avoid creation of a 'null-link'
		
		EList<Link> list = robot.getLinks();

		for (Link aLink : list) {
			if(aLink.getName().equals(link.getName())) {
				return true;
			} 
		}
		return false;
	}
	
	private boolean isJointInRobot(EList<Joint> list, Link parent, Link child) {
		//We have to check for existing joints based on links
		for (Joint aJoint : list) {
			if(aJoint.getChildOf() != null
				&& aJoint.getChildOf().getName() != null	
				&& aJoint.getChildOf().getName().equals(parent.getName())
				&& aJoint.getParentOf() != null
				&& aJoint.getParentOf().getName() != null	
				&& aJoint.getParentOf().getName().equals(child.getName())) {
				return true;
			} 
		}
		return false;
	}
	
	private void checkAndCreateLinks(Robot robot, Topology topo) {
		if(!isLinkInRobot(robot, topo.getParent())) {
			addTopoLinkToRobot(topo.getParent().getName(), robot);
		}
		if(topo.getChild() != null) {
			checkAndCreateLinks(robot, topo.getChild());
		}
	}

	private void checkAndCreateJoints(Robot robot, Topology topo) {
		if(topo.getParent() == null || topo.getChild() == null || topo.getChild().getParent() == null) {
			return;
		}
		if(!isJointInRobot(robot.getJoint(), topo.getParent(), topo.getChild().getParent())) {
			robot = workAroundJointCheck(robot, topo.getParent(), topo.getChild().getParent());
			addTopoJointToRobot(robot, topo.getParent(), topo.getChild().getParent(),topo.getJoint());
		}
		checkAndCreateJoints(robot, topo.getChild());
	}
	
	private Robot workAroundJointCheck(Robot robot,Link parent,Link child) {
		EList<Joint> newList = new BasicEList<Joint>();
		boolean found = false;
		for (Joint aJoint : robot.getJoint()) {
			//Sometimes parent/child ref. are 'lost' while saving which is causing a duplicate joint -> suspect this
			//is a sync problem. 
			if(aJoint.getName().equals(parent.getName()+"_"+child.getName())) {
				found = true;
			} else {
				newList.add(aJoint);
			}
		}
		if(found) {
			EStructuralFeature ft = robot.eClass().getEStructuralFeature("joint");
	    	robot.eSet(ft,newList);
		}
		return robot;
	}
	
	private void addTopoJointToRobot(Robot rob, Link parent, Link child, JointRef ref) {
		Joint aJoint = MyURDFFactory.eINSTANCE.createJoint();
		aJoint.setName(parent.getName() + "_" + child.getName());
		aJoint.setChildOf(parent);
		aJoint.setParentOf(child);
		aJoint.setType(getJointType(ref));
		aJoint.setFromTopo(true);
		rob.getJoint().add(aJoint);
	}
	
	
	private void manageTopology(Robot rob, Topology topo) {
		//Here we add links and joints based on Topology chains
	
		handleProxies(topo);
		
		checkAndCreateLinks(rob, topo);
		
		//When we previously have created Topology objects (method createStandardJointsInTopology)
		//for example due to creation af classic joints in the ui we will start receiving calls in
		//this method due to the topology object.
		//Scenario: define 2 classic joints in the UI. When the second joint is entered we would create
		//a new Joint based on an existing topology object - a Joint which is already created automatically
		//in the AST. Therefore we have to filter out these Joints and test whether they are already in the AST
		checkAndCreateJoints(rob, topo);
	}

	private Topology handleProxies(Topology topo) {
		if(topo.getParent() != null && topo.getParent().eIsProxy()) {
			topo.getParent().setName(getNodeText(topo, 1));
		} 
		if (topo.getChild() != null){
			topo = handleProxies(topo.getChild());
		}
		return topo;
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
	
	private void createTopologyFromStandardJoints(Joint joint, Robot robot) {
		//Here we create Topology objects based on standard joints. 
		//We use the 'isTopoFlag' to filter relevant joints
		
		if(joint == null || joint.getParentOf() == null || joint.getChildOf() == null) {
			return;
		}
		
		String ruleName = getRuleName(joint);
		if(ruleName != null && ruleName.equalsIgnoreCase("Joint") && !joint.isFromTopo()) {
			Topology topoParent = MyURDFFactory.eINSTANCE.createTopology();
			topoParent.setParent(joint.getChildOf());
			topoParent.setJoint(getJointRef(joint));
			Topology topoChild = MyURDFFactory.eINSTANCE.createTopology();
			topoChild.setParent(joint.getParentOf());
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