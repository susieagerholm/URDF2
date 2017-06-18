/**
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.myURDF.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.urdf.myURDF.MyURDFPackage;
import org.xtext.urdf.myURDF.SafetyController;
import org.xtext.urdf.myURDF.URDFAttrSignedNumeric;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Safety Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.urdf.myURDF.impl.SafetyControllerImpl#getK_velocity <em>Kvelocity</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.impl.SafetyControllerImpl#getK_position <em>Kposition</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.impl.SafetyControllerImpl#getSoftUpperLimit <em>Soft Upper Limit</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.impl.SafetyControllerImpl#getSoftLowerLimit <em>Soft Lower Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SafetyControllerImpl extends NamedElementImpl implements SafetyController {
	/**
	 * The cached value of the '{@link #getK_velocity() <em>Kvelocity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getK_velocity()
	 * @generated
	 * @ordered
	 */
	protected URDFAttrSignedNumeric k_velocity;

	/**
	 * The cached value of the '{@link #getK_position() <em>Kposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getK_position()
	 * @generated
	 * @ordered
	 */
	protected URDFAttrSignedNumeric k_position;

	/**
	 * The cached value of the '{@link #getSoftUpperLimit() <em>Soft Upper Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftUpperLimit()
	 * @generated
	 * @ordered
	 */
	protected URDFAttrSignedNumeric softUpperLimit;

	/**
	 * The cached value of the '{@link #getSoftLowerLimit() <em>Soft Lower Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftLowerLimit()
	 * @generated
	 * @ordered
	 */
	protected URDFAttrSignedNumeric softLowerLimit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SafetyControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyURDFPackage.Literals.SAFETY_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyURDFPackage.SAFETY_CONTROLLER__KVELOCITY:
				return basicSetK_velocity(null, msgs);
			case MyURDFPackage.SAFETY_CONTROLLER__KPOSITION:
				return basicSetK_position(null, msgs);
			case MyURDFPackage.SAFETY_CONTROLLER__SOFT_UPPER_LIMIT:
				return basicSetSoftUpperLimit(null, msgs);
			case MyURDFPackage.SAFETY_CONTROLLER__SOFT_LOWER_LIMIT:
				return basicSetSoftLowerLimit(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrSignedNumeric getSoftLowerLimit() {
		return softLowerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftLowerLimit(URDFAttrSignedNumeric newSoftLowerLimit, NotificationChain msgs) {
		URDFAttrSignedNumeric oldSoftLowerLimit = softLowerLimit;
		softLowerLimit = newSoftLowerLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyURDFPackage.SAFETY_CONTROLLER__SOFT_LOWER_LIMIT, oldSoftLowerLimit, newSoftLowerLimit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftLowerLimit(URDFAttrSignedNumeric newSoftLowerLimit) {
		if (newSoftLowerLimit != softLowerLimit) {
			NotificationChain msgs = null;
			if (softLowerLimit != null)
				msgs = ((InternalEObject)softLowerLimit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyURDFPackage.SAFETY_CONTROLLER__SOFT_LOWER_LIMIT, null, msgs);
			if (newSoftLowerLimit != null)
				msgs = ((InternalEObject)newSoftLowerLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyURDFPackage.SAFETY_CONTROLLER__SOFT_LOWER_LIMIT, null, msgs);
			msgs = basicSetSoftLowerLimit(newSoftLowerLimit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyURDFPackage.SAFETY_CONTROLLER__SOFT_LOWER_LIMIT, newSoftLowerLimit, newSoftLowerLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrSignedNumeric getSoftUpperLimit() {
		return softUpperLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftUpperLimit(URDFAttrSignedNumeric newSoftUpperLimit, NotificationChain msgs) {
		URDFAttrSignedNumeric oldSoftUpperLimit = softUpperLimit;
		softUpperLimit = newSoftUpperLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyURDFPackage.SAFETY_CONTROLLER__SOFT_UPPER_LIMIT, oldSoftUpperLimit, newSoftUpperLimit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftUpperLimit(URDFAttrSignedNumeric newSoftUpperLimit) {
		if (newSoftUpperLimit != softUpperLimit) {
			NotificationChain msgs = null;
			if (softUpperLimit != null)
				msgs = ((InternalEObject)softUpperLimit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyURDFPackage.SAFETY_CONTROLLER__SOFT_UPPER_LIMIT, null, msgs);
			if (newSoftUpperLimit != null)
				msgs = ((InternalEObject)newSoftUpperLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyURDFPackage.SAFETY_CONTROLLER__SOFT_UPPER_LIMIT, null, msgs);
			msgs = basicSetSoftUpperLimit(newSoftUpperLimit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyURDFPackage.SAFETY_CONTROLLER__SOFT_UPPER_LIMIT, newSoftUpperLimit, newSoftUpperLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrSignedNumeric getK_position() {
		return k_position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetK_position(URDFAttrSignedNumeric newK_position, NotificationChain msgs) {
		URDFAttrSignedNumeric oldK_position = k_position;
		k_position = newK_position;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyURDFPackage.SAFETY_CONTROLLER__KPOSITION, oldK_position, newK_position);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setK_position(URDFAttrSignedNumeric newK_position) {
		if (newK_position != k_position) {
			NotificationChain msgs = null;
			if (k_position != null)
				msgs = ((InternalEObject)k_position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyURDFPackage.SAFETY_CONTROLLER__KPOSITION, null, msgs);
			if (newK_position != null)
				msgs = ((InternalEObject)newK_position).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyURDFPackage.SAFETY_CONTROLLER__KPOSITION, null, msgs);
			msgs = basicSetK_position(newK_position, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyURDFPackage.SAFETY_CONTROLLER__KPOSITION, newK_position, newK_position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrSignedNumeric getK_velocity() {
		return k_velocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetK_velocity(URDFAttrSignedNumeric newK_velocity, NotificationChain msgs) {
		URDFAttrSignedNumeric oldK_velocity = k_velocity;
		k_velocity = newK_velocity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyURDFPackage.SAFETY_CONTROLLER__KVELOCITY, oldK_velocity, newK_velocity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setK_velocity(URDFAttrSignedNumeric newK_velocity) {
		if (newK_velocity != k_velocity) {
			NotificationChain msgs = null;
			if (k_velocity != null)
				msgs = ((InternalEObject)k_velocity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyURDFPackage.SAFETY_CONTROLLER__KVELOCITY, null, msgs);
			if (newK_velocity != null)
				msgs = ((InternalEObject)newK_velocity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyURDFPackage.SAFETY_CONTROLLER__KVELOCITY, null, msgs);
			msgs = basicSetK_velocity(newK_velocity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyURDFPackage.SAFETY_CONTROLLER__KVELOCITY, newK_velocity, newK_velocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyURDFPackage.SAFETY_CONTROLLER__KVELOCITY:
				return getK_velocity();
			case MyURDFPackage.SAFETY_CONTROLLER__KPOSITION:
				return getK_position();
			case MyURDFPackage.SAFETY_CONTROLLER__SOFT_UPPER_LIMIT:
				return getSoftUpperLimit();
			case MyURDFPackage.SAFETY_CONTROLLER__SOFT_LOWER_LIMIT:
				return getSoftLowerLimit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MyURDFPackage.SAFETY_CONTROLLER__KVELOCITY:
				setK_velocity((URDFAttrSignedNumeric)newValue);
				return;
			case MyURDFPackage.SAFETY_CONTROLLER__KPOSITION:
				setK_position((URDFAttrSignedNumeric)newValue);
				return;
			case MyURDFPackage.SAFETY_CONTROLLER__SOFT_UPPER_LIMIT:
				setSoftUpperLimit((URDFAttrSignedNumeric)newValue);
				return;
			case MyURDFPackage.SAFETY_CONTROLLER__SOFT_LOWER_LIMIT:
				setSoftLowerLimit((URDFAttrSignedNumeric)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case MyURDFPackage.SAFETY_CONTROLLER__KVELOCITY:
				setK_velocity((URDFAttrSignedNumeric)null);
				return;
			case MyURDFPackage.SAFETY_CONTROLLER__KPOSITION:
				setK_position((URDFAttrSignedNumeric)null);
				return;
			case MyURDFPackage.SAFETY_CONTROLLER__SOFT_UPPER_LIMIT:
				setSoftUpperLimit((URDFAttrSignedNumeric)null);
				return;
			case MyURDFPackage.SAFETY_CONTROLLER__SOFT_LOWER_LIMIT:
				setSoftLowerLimit((URDFAttrSignedNumeric)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MyURDFPackage.SAFETY_CONTROLLER__KVELOCITY:
				return k_velocity != null;
			case MyURDFPackage.SAFETY_CONTROLLER__KPOSITION:
				return k_position != null;
			case MyURDFPackage.SAFETY_CONTROLLER__SOFT_UPPER_LIMIT:
				return softUpperLimit != null;
			case MyURDFPackage.SAFETY_CONTROLLER__SOFT_LOWER_LIMIT:
				return softLowerLimit != null;
		}
		return super.eIsSet(featureID);
	}

} //SafetyControllerImpl
