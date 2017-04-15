/**
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.domainmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.urdf.domainmodel.Collision;
import org.xtext.urdf.domainmodel.DomainmodelPackage;
import org.xtext.urdf.domainmodel.Geometry;
import org.xtext.urdf.domainmodel.Origin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.urdf.domainmodel.impl.CollisionImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link org.xtext.urdf.domainmodel.impl.CollisionImpl#getOrigin <em>Origin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollisionImpl extends MinimalEObjectImpl.Container implements Collision
{
  /**
   * The cached value of the '{@link #getGeometry() <em>Geometry</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeometry()
   * @generated
   * @ordered
   */
  protected Geometry geometry;

  /**
   * The cached value of the '{@link #getOrigin() <em>Origin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrigin()
   * @generated
   * @ordered
   */
  protected Origin origin;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CollisionImpl()
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
    return DomainmodelPackage.Literals.COLLISION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Geometry getGeometry()
  {
    return geometry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGeometry(Geometry newGeometry, NotificationChain msgs)
  {
    Geometry oldGeometry = geometry;
    geometry = newGeometry;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.COLLISION__GEOMETRY, oldGeometry, newGeometry);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGeometry(Geometry newGeometry)
  {
    if (newGeometry != geometry)
    {
      NotificationChain msgs = null;
      if (geometry != null)
        msgs = ((InternalEObject)geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.COLLISION__GEOMETRY, null, msgs);
      if (newGeometry != null)
        msgs = ((InternalEObject)newGeometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.COLLISION__GEOMETRY, null, msgs);
      msgs = basicSetGeometry(newGeometry, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.COLLISION__GEOMETRY, newGeometry, newGeometry));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Origin getOrigin()
  {
    return origin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrigin(Origin newOrigin, NotificationChain msgs)
  {
    Origin oldOrigin = origin;
    origin = newOrigin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.COLLISION__ORIGIN, oldOrigin, newOrigin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrigin(Origin newOrigin)
  {
    if (newOrigin != origin)
    {
      NotificationChain msgs = null;
      if (origin != null)
        msgs = ((InternalEObject)origin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.COLLISION__ORIGIN, null, msgs);
      if (newOrigin != null)
        msgs = ((InternalEObject)newOrigin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.COLLISION__ORIGIN, null, msgs);
      msgs = basicSetOrigin(newOrigin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.COLLISION__ORIGIN, newOrigin, newOrigin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DomainmodelPackage.COLLISION__GEOMETRY:
        return basicSetGeometry(null, msgs);
      case DomainmodelPackage.COLLISION__ORIGIN:
        return basicSetOrigin(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DomainmodelPackage.COLLISION__GEOMETRY:
        return getGeometry();
      case DomainmodelPackage.COLLISION__ORIGIN:
        return getOrigin();
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
      case DomainmodelPackage.COLLISION__GEOMETRY:
        setGeometry((Geometry)newValue);
        return;
      case DomainmodelPackage.COLLISION__ORIGIN:
        setOrigin((Origin)newValue);
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
      case DomainmodelPackage.COLLISION__GEOMETRY:
        setGeometry((Geometry)null);
        return;
      case DomainmodelPackage.COLLISION__ORIGIN:
        setOrigin((Origin)null);
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
      case DomainmodelPackage.COLLISION__GEOMETRY:
        return geometry != null;
      case DomainmodelPackage.COLLISION__ORIGIN:
        return origin != null;
    }
    return super.eIsSet(featureID);
  }

} //CollisionImpl
