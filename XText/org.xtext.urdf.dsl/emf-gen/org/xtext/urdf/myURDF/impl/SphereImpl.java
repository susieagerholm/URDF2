/**
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.myURDF.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.urdf.myURDF.MyURDFPackage;
import org.xtext.urdf.myURDF.NamedElement;
import org.xtext.urdf.myURDF.Sphere;
import org.xtext.urdf.myURDF.URDFAttrNumeric;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sphere</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.urdf.myURDF.impl.SphereImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.impl.SphereImpl#getRadius <em>Radius</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SphereImpl extends GeometryImpl implements Sphere {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected URDFAttrNumeric radius;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SphereImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyURDFPackage.Literals.SPHERE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyURDFPackage.SPHERE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrNumeric getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRadius(URDFAttrNumeric newRadius, NotificationChain msgs) {
		URDFAttrNumeric oldRadius = radius;
		radius = newRadius;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyURDFPackage.SPHERE__RADIUS, oldRadius, newRadius);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(URDFAttrNumeric newRadius) {
		if (newRadius != radius) {
			NotificationChain msgs = null;
			if (radius != null)
				msgs = ((InternalEObject)radius).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyURDFPackage.SPHERE__RADIUS, null, msgs);
			if (newRadius != null)
				msgs = ((InternalEObject)newRadius).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyURDFPackage.SPHERE__RADIUS, null, msgs);
			msgs = basicSetRadius(newRadius, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyURDFPackage.SPHERE__RADIUS, newRadius, newRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyURDFPackage.SPHERE__RADIUS:
				return basicSetRadius(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyURDFPackage.SPHERE__NAME:
				return getName();
			case MyURDFPackage.SPHERE__RADIUS:
				return getRadius();
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
			case MyURDFPackage.SPHERE__NAME:
				setName((String)newValue);
				return;
			case MyURDFPackage.SPHERE__RADIUS:
				setRadius((URDFAttrNumeric)newValue);
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
			case MyURDFPackage.SPHERE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MyURDFPackage.SPHERE__RADIUS:
				setRadius((URDFAttrNumeric)null);
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
			case MyURDFPackage.SPHERE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MyURDFPackage.SPHERE__RADIUS:
				return radius != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case MyURDFPackage.SPHERE__NAME: return MyURDFPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case MyURDFPackage.NAMED_ELEMENT__NAME: return MyURDFPackage.SPHERE__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SphereImpl
