package org.xtext.urdf.validation;

import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.xtext.urdf.myURDF.AddTo;
import org.xtext.urdf.myURDF.Axis;
import org.xtext.urdf.myURDF.Calibration;
import org.xtext.urdf.myURDF.DotExpression;
import org.xtext.urdf.myURDF.Dynamics;
import org.xtext.urdf.myURDF.Inertial;
import org.xtext.urdf.myURDF.Joint;
import org.xtext.urdf.myURDF.Limit;
import org.xtext.urdf.myURDF.Link;
import org.xtext.urdf.myURDF.Origin;
import org.xtext.urdf.myURDF.ReUseAble;
import org.xtext.urdf.myURDF.Reuse;
import org.xtext.urdf.myURDF.Robot;
import org.xtext.urdf.myURDF.SafetyController;

public class OverwriteValidator {

	public boolean overwrite(Link link) {
		//We compare attribute name, eg length,height 
		EList<Reuse> list = link.getReuse();
		String attrName = null;
		for (Reuse reuse : list) {
			if(reuse.getEdit() != null && reuse.getEdit().getGetRef() !=null) {
	  			EObject parent = ((DotExpression)reuse.getEdit().getGetRef()).getTail();
	  			if(attrName == null) {
	  			 attrName = parent.eContainingFeature().getName();
	  			} else if(parent.eContainingFeature().getName().equalsIgnoreCase(attrName)) {
	  				return true;
	  			}
			}
		}
		return false; 
  }

	public boolean overwriteInertial(Link link) {
		EList<Reuse> list = link.getReuse();
		int inertialCount = 0;
		for (Reuse reuse : list) {
			if(reuse.getAdd() == null) {
				continue;
			} 
			if(reuse.getAdd() instanceof Inertial && link.getIsReuseOf() != null && link.getIsReuseOf().getInertial()!=null) {
				return true;
			} else if(reuse.getAdd() instanceof Inertial) {
				inertialCount++;
				if(inertialCount>1) {
					return true;
				}
			}
		} 
		return false; 
    }


	public boolean overwriteJoint(Joint joint) {
		EList<Reuse> list = joint.getReuse();
		String type = null;
		for (Reuse reuse : list) {
			if(reuse.getAdd() != null) {
				if(type == null) {
					//If we get the feature resolved in the object we are reusing from - there is an overwrite
					type = getJointPropertyType(reuse.getAdd());
					EStructuralFeature ft = joint.eClass().getEStructuralFeature(type.toLowerCase());
					if(joint.getIsReuseOf() != null) {
						Object temp = joint.getIsReuseOf().eGet(ft);
						if(temp!=null)
							return true;
					}
				} else {
					if(type.equals(getJointPropertyType(reuse.getAdd()))) {
						return true;
					}
				}
			}
		}
		return false;
	}

	  private String getJointPropertyType(ReUseAble reUseAble) {
		if(reUseAble instanceof Origin) {
			return "origin";
		} else if(reUseAble instanceof Limit) { 
			return "limit";
		} else if(reUseAble instanceof Axis) {
			return "axis";
		} else if(reUseAble instanceof Dynamics) {
			return "dynamics";
		} else if(reUseAble instanceof Calibration) {
			return "calibration";
		} else if(reUseAble instanceof SafetyController) {
			return "safetyController";
		}
		return null;
	  }
  
	  public boolean overwriteInertialFromTopo(Robot robot) {
		  EList<AddTo> addToList = robot.getAddto();
		  HashMap<EObject, EObject> map = new HashMap<>();
		  for (AddTo anAdd : addToList) {
			  if(anAdd.getLink() != null && anAdd.getAdd() instanceof Inertial && !map.containsKey(anAdd.getLink())) {
				  map.put(anAdd.getLink(), anAdd.getAdd());
			  } else if(anAdd.getLink() != null && map.containsKey(anAdd.getLink())) {
				  EObject property = map.get(anAdd.getLink());
				  if(property.eClass().getName().equals(anAdd.getAdd().eClass().getName())) {
					  return true;
				  }
			  }
		  }
		  return false;
	  }
	  
	  public boolean overwriteJointTypesFromTopo(Robot robot) {
		  EList<AddTo> addToList = robot.getAddto();
		  HashMap<EObject, EObject> map = new HashMap<>();
		  for (AddTo anAdd : addToList) {
			  if(anAdd.getJoint() != null && !map.containsKey(anAdd.getJoint())) {
				  map.put(anAdd.getJoint(), anAdd.getAdd());
			  } else if(anAdd.getJoint() != null && map.containsKey(anAdd.getJoint())) {
				  EObject property = map.get(anAdd.getJoint());
				  if(property.eClass().getName().equals(anAdd.getAdd().eClass().getName())) {
					  return true;
				  }
			  }
		  }
		  return false;
	  }

}