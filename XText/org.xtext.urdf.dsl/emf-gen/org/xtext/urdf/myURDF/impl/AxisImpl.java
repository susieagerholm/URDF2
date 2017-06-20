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

import org.xtext.urdf.myURDF.Axis;
import org.xtext.urdf.myURDF.MyURDFPackage;
import org.xtext.urdf.myURDF.URDFAttrINT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.urdf.myURDF.impl.AxisImpl#getX <em>X</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.impl.AxisImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.impl.AxisImpl#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AxisImpl extends NamedElementImpl implements Axis {
	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected URDFAttrINT x;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected URDFAttrINT y;

	/**
	 * The cached value of the '{@link #getZ() <em>Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected URDFAttrINT z;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyURDFPackage.Literals.AXIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyURDFPackage.AXIS__X:
				return basicSetX(null, msgs);
			case MyURDFPackage.AXIS__Y:
				return basicSetY(null, msgs);
			case MyURDFPackage.AXIS__Z:
				return basicSetZ(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrINT getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetX(URDFAttrINT newX, NotificationChain msgs) {
		URDFAttrINT oldX = x;
		x = newX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyURDFPackage.AXIS__X, oldX, newX);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(URDFAttrINT newX) {
		if (newX != x) {
			NotificationChain msgs = null;
			if (x != null)
				msgs = ((InternalEObject)x).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyURDFPackage.AXIS__X, null, msgs);
			if (newX != null)
				msgs = ((InternalEObject)newX).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyURDFPackage.AXIS__X, null, msgs);
			msgs = basicSetX(newX, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyURDFPackage.AXIS__X, newX, newX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrINT getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetY(URDFAttrINT newY, NotificationChain msgs) {
		URDFAttrINT oldY = y;
		y = newY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyURDFPackage.AXIS__Y, oldY, newY);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(URDFAttrINT newY) {
		if (newY != y) {
			NotificationChain msgs = null;
			if (y != null)
				msgs = ((InternalEObject)y).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyURDFPackage.AXIS__Y, null, msgs);
			if (newY != null)
				msgs = ((InternalEObject)newY).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyURDFPackage.AXIS__Y, null, msgs);
			msgs = basicSetY(newY, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyURDFPackage.AXIS__Y, newY, newY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrINT getZ() {
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZ(URDFAttrINT newZ, NotificationChain msgs) {
		URDFAttrINT oldZ = z;
		z = newZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyURDFPackage.AXIS__Z, oldZ, newZ);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ(URDFAttrINT newZ) {
		if (newZ != z) {
			NotificationChain msgs = null;
			if (z != null)
				msgs = ((InternalEObject)z).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyURDFPackage.AXIS__Z, null, msgs);
			if (newZ != null)
				msgs = ((InternalEObject)newZ).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyURDFPackage.AXIS__Z, null, msgs);
			msgs = basicSetZ(newZ, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyURDFPackage.AXIS__Z, newZ, newZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyURDFPackage.AXIS__X:
				return getX();
			case MyURDFPackage.AXIS__Y:
				return getY();
			case MyURDFPackage.AXIS__Z:
				return getZ();
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
			case MyURDFPackage.AXIS__X:
				setX((URDFAttrINT)newValue);
				return;
			case MyURDFPackage.AXIS__Y:
				setY((URDFAttrINT)newValue);
				return;
			case MyURDFPackage.AXIS__Z:
				setZ((URDFAttrINT)newValue);
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
			case MyURDFPackage.AXIS__X:
				setX((URDFAttrINT)null);
				return;
			case MyURDFPackage.AXIS__Y:
				setY((URDFAttrINT)null);
				return;
			case MyURDFPackage.AXIS__Z:
				setZ((URDFAttrINT)null);
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
			case MyURDFPackage.AXIS__X:
				return x != null;
			case MyURDFPackage.AXIS__Y:
				return y != null;
			case MyURDFPackage.AXIS__Z:
				return z != null;
		}
		return super.eIsSet(featureID);
	}

} //AxisImpl