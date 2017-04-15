/**
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.domainmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.urdf.domainmodel.DomainmodelPackage;
import org.xtext.urdf.domainmodel.SafetyController;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Safety Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.urdf.domainmodel.impl.SafetyControllerImpl#getSoftLowerLimit <em>Soft Lower Limit</em>}</li>
 *   <li>{@link org.xtext.urdf.domainmodel.impl.SafetyControllerImpl#getSoftUpperLimit <em>Soft Upper Limit</em>}</li>
 *   <li>{@link org.xtext.urdf.domainmodel.impl.SafetyControllerImpl#getK_position <em>Kposition</em>}</li>
 *   <li>{@link org.xtext.urdf.domainmodel.impl.SafetyControllerImpl#getK_velocity <em>Kvelocity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SafetyControllerImpl extends MinimalEObjectImpl.Container implements SafetyController
{
  /**
   * The default value of the '{@link #getSoftLowerLimit() <em>Soft Lower Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSoftLowerLimit()
   * @generated
   * @ordered
   */
  protected static final int SOFT_LOWER_LIMIT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSoftLowerLimit() <em>Soft Lower Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSoftLowerLimit()
   * @generated
   * @ordered
   */
  protected int softLowerLimit = SOFT_LOWER_LIMIT_EDEFAULT;

  /**
   * The default value of the '{@link #getSoftUpperLimit() <em>Soft Upper Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSoftUpperLimit()
   * @generated
   * @ordered
   */
  protected static final int SOFT_UPPER_LIMIT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSoftUpperLimit() <em>Soft Upper Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSoftUpperLimit()
   * @generated
   * @ordered
   */
  protected int softUpperLimit = SOFT_UPPER_LIMIT_EDEFAULT;

  /**
   * The default value of the '{@link #getK_position() <em>Kposition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getK_position()
   * @generated
   * @ordered
   */
  protected static final int KPOSITION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getK_position() <em>Kposition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getK_position()
   * @generated
   * @ordered
   */
  protected int k_position = KPOSITION_EDEFAULT;

  /**
   * The default value of the '{@link #getK_velocity() <em>Kvelocity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getK_velocity()
   * @generated
   * @ordered
   */
  protected static final int KVELOCITY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getK_velocity() <em>Kvelocity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getK_velocity()
   * @generated
   * @ordered
   */
  protected int k_velocity = KVELOCITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SafetyControllerImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DomainmodelPackage.Literals.SAFETY_CONTROLLER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSoftLowerLimit()
  {
    return softLowerLimit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSoftLowerLimit(int newSoftLowerLimit)
  {
    int oldSoftLowerLimit = softLowerLimit;
    softLowerLimit = newSoftLowerLimit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.SAFETY_CONTROLLER__SOFT_LOWER_LIMIT, oldSoftLowerLimit, softLowerLimit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSoftUpperLimit()
  {
    return softUpperLimit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSoftUpperLimit(int newSoftUpperLimit)
  {
    int oldSoftUpperLimit = softUpperLimit;
    softUpperLimit = newSoftUpperLimit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.SAFETY_CONTROLLER__SOFT_UPPER_LIMIT, oldSoftUpperLimit, softUpperLimit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getK_position()
  {
    return k_position;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setK_position(int newK_position)
  {
    int oldK_position = k_position;
    k_position = newK_position;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.SAFETY_CONTROLLER__KPOSITION, oldK_position, k_position));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getK_velocity()
  {
    return k_velocity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setK_velocity(int newK_velocity)
  {
    int oldK_velocity = k_velocity;
    k_velocity = newK_velocity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.SAFETY_CONTROLLER__KVELOCITY, oldK_velocity, k_velocity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DomainmodelPackage.SAFETY_CONTROLLER__SOFT_LOWER_LIMIT:
        return getSoftLowerLimit();
      case DomainmodelPackage.SAFETY_CONTROLLER__SOFT_UPPER_LIMIT:
        return getSoftUpperLimit();
      case DomainmodelPackage.SAFETY_CONTROLLER__KPOSITION:
        return getK_position();
      case DomainmodelPackage.SAFETY_CONTROLLER__KVELOCITY:
        return getK_velocity();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DomainmodelPackage.SAFETY_CONTROLLER__SOFT_LOWER_LIMIT:
        setSoftLowerLimit((Integer)newValue);
        return;
      case DomainmodelPackage.SAFETY_CONTROLLER__SOFT_UPPER_LIMIT:
        setSoftUpperLimit((Integer)newValue);
        return;
      case DomainmodelPackage.SAFETY_CONTROLLER__KPOSITION:
        setK_position((Integer)newValue);
        return;
      case DomainmodelPackage.SAFETY_CONTROLLER__KVELOCITY:
        setK_velocity((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DomainmodelPackage.SAFETY_CONTROLLER__SOFT_LOWER_LIMIT:
        setSoftLowerLimit(SOFT_LOWER_LIMIT_EDEFAULT);
        return;
      case DomainmodelPackage.SAFETY_CONTROLLER__SOFT_UPPER_LIMIT:
        setSoftUpperLimit(SOFT_UPPER_LIMIT_EDEFAULT);
        return;
      case DomainmodelPackage.SAFETY_CONTROLLER__KPOSITION:
        setK_position(KPOSITION_EDEFAULT);
        return;
      case DomainmodelPackage.SAFETY_CONTROLLER__KVELOCITY:
        setK_velocity(KVELOCITY_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DomainmodelPackage.SAFETY_CONTROLLER__SOFT_LOWER_LIMIT:
        return softLowerLimit != SOFT_LOWER_LIMIT_EDEFAULT;
      case DomainmodelPackage.SAFETY_CONTROLLER__SOFT_UPPER_LIMIT:
        return softUpperLimit != SOFT_UPPER_LIMIT_EDEFAULT;
      case DomainmodelPackage.SAFETY_CONTROLLER__KPOSITION:
        return k_position != KPOSITION_EDEFAULT;
      case DomainmodelPackage.SAFETY_CONTROLLER__KVELOCITY:
        return k_velocity != KVELOCITY_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (SoftLowerLimit: ");
    result.append(softLowerLimit);
    result.append(", SoftUpperLimit: ");
    result.append(softUpperLimit);
    result.append(", k_position: ");
    result.append(k_position);
    result.append(", k_velocity: ");
    result.append(k_velocity);
    result.append(')');
    return result.toString();
  }

} //SafetyControllerImpl
