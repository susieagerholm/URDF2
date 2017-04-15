/**
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.domainmodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.urdf.domainmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.urdf.domainmodel.DomainmodelPackage
 * @generated
 */
public class DomainmodelSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DomainmodelPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainmodelSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DomainmodelPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DomainmodelPackage.ROBOT:
      {
        Robot robot = (Robot)theEObject;
        T result = caseRobot(robot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.MATERIAL:
      {
        Material material = (Material)theEObject;
        T result = caseMaterial(material);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.GEOMETRY:
      {
        Geometry geometry = (Geometry)theEObject;
        T result = caseGeometry(geometry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.LINK:
      {
        Link link = (Link)theEObject;
        T result = caseLink(link);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.JOINT:
      {
        Joint joint = (Joint)theEObject;
        T result = caseJoint(joint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.INERTIAL:
      {
        Inertial inertial = (Inertial)theEObject;
        T result = caseInertial(inertial);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.VISUAL:
      {
        Visual visual = (Visual)theEObject;
        T result = caseVisual(visual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.COLLISION:
      {
        Collision collision = (Collision)theEObject;
        T result = caseCollision(collision);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.ORIGIN:
      {
        Origin origin = (Origin)theEObject;
        T result = caseOrigin(origin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.MASS:
      {
        Mass mass = (Mass)theEObject;
        T result = caseMass(mass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.INERTIA:
      {
        Inertia inertia = (Inertia)theEObject;
        T result = caseInertia(inertia);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.COLOR:
      {
        Color color = (Color)theEObject;
        T result = caseColor(color);
        if (result == null) result = caseMaterial(color);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.TEXTURE:
      {
        Texture texture = (Texture)theEObject;
        T result = caseTexture(texture);
        if (result == null) result = caseMaterial(texture);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.BOX:
      {
        Box box = (Box)theEObject;
        T result = caseBox(box);
        if (result == null) result = caseGeometry(box);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.CYLINDER:
      {
        Cylinder cylinder = (Cylinder)theEObject;
        T result = caseCylinder(cylinder);
        if (result == null) result = caseGeometry(cylinder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.MESH:
      {
        Mesh mesh = (Mesh)theEObject;
        T result = caseMesh(mesh);
        if (result == null) result = caseGeometry(mesh);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.SPHERE:
      {
        Sphere sphere = (Sphere)theEObject;
        T result = caseSphere(sphere);
        if (result == null) result = caseGeometry(sphere);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.LIMIT:
      {
        Limit limit = (Limit)theEObject;
        T result = caseLimit(limit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.AXIS:
      {
        Axis axis = (Axis)theEObject;
        T result = caseAxis(axis);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.CALLIBRATION:
      {
        Callibration callibration = (Callibration)theEObject;
        T result = caseCallibration(callibration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.DYNAMICS:
      {
        Dynamics dynamics = (Dynamics)theEObject;
        T result = caseDynamics(dynamics);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.MIMIC:
      {
        Mimic mimic = (Mimic)theEObject;
        T result = caseMimic(mimic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.SAFETY_CONTROLLER:
      {
        SafetyController safetyController = (SafetyController)theEObject;
        T result = caseSafetyController(safetyController);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Robot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Robot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRobot(Robot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Material</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Material</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMaterial(Material object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Geometry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Geometry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeometry(Geometry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLink(Link object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Joint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Joint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJoint(Joint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inertial</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inertial</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInertial(Inertial object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Visual</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Visual</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVisual(Visual object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collision</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collision</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollision(Collision object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Origin</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Origin</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrigin(Origin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mass</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mass</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMass(Mass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inertia</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inertia</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInertia(Inertia object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColor(Color object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Texture</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Texture</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTexture(Texture object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Box</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Box</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBox(Box object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cylinder</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cylinder</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCylinder(Cylinder object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mesh</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mesh</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMesh(Mesh object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sphere</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sphere</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSphere(Sphere object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Limit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Limit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLimit(Limit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Axis</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Axis</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAxis(Axis object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Callibration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Callibration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCallibration(Callibration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dynamics</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dynamics</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDynamics(Dynamics object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mimic</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mimic</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMimic(Mimic object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Safety Controller</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Safety Controller</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSafetyController(SafetyController object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DomainmodelSwitch
