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

import org.xtext.urdf.myURDF.Dynamics;
import org.xtext.urdf.myURDF.MyURDFPackage;
import org.xtext.urdf.myURDF.NamedElement;
import org.xtext.urdf.myURDF.URDFAttrSignedNumeric;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.urdf.myURDF.impl.DynamicsImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.impl.DynamicsImpl#getFriction <em>Friction</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.impl.DynamicsImpl#getDamping <em>Damping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicsImpl extends ReUseAbleImpl implements Dynamics {
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
	 * The cached value of the '{@link #getFriction() <em>Friction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriction()
	 * @generated
	 * @ordered
	 */
	protected URDFAttrSignedNumeric friction;

	/**
	 * The cached value of the '{@link #getDamping() <em>Damping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamping()
	 * @generated
	 * @ordered
	 */
	protected URDFAttrSignedNumeric damping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyURDFPackage.Literals.DYNAMICS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyURDFPackage.DYNAMICS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrSignedNumeric getFriction() {
		return friction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFriction(URDFAttrSignedNumeric newFriction, NotificationChain msgs) {
		URDFAttrSignedNumeric oldFriction = friction;
		friction = newFriction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyURDFPackage.DYNAMICS__FRICTION, oldFriction, newFriction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFriction(URDFAttrSignedNumeric newFriction) {
		if (newFriction != friction) {
			NotificationChain msgs = null;
			if (friction != null)
				msgs = ((InternalEObject)friction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyURDFPackage.DYNAMICS__FRICTION, null, msgs);
			if (newFriction != null)
				msgs = ((InternalEObject)newFriction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyURDFPackage.DYNAMICS__FRICTION, null, msgs);
			msgs = basicSetFriction(newFriction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyURDFPackage.DYNAMICS__FRICTION, newFriction, newFriction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrSignedNumeric getDamping() {
		return damping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDamping(URDFAttrSignedNumeric newDamping, NotificationChain msgs) {
		URDFAttrSignedNumeric oldDamping = damping;
		damping = newDamping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyURDFPackage.DYNAMICS__DAMPING, oldDamping, newDamping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDamping(URDFAttrSignedNumeric newDamping) {
		if (newDamping != damping) {
			NotificationChain msgs = null;
			if (damping != null)
				msgs = ((InternalEObject)damping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyURDFPackage.DYNAMICS__DAMPING, null, msgs);
			if (newDamping != null)
				msgs = ((InternalEObject)newDamping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyURDFPackage.DYNAMICS__DAMPING, null, msgs);
			msgs = basicSetDamping(newDamping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyURDFPackage.DYNAMICS__DAMPING, newDamping, newDamping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyURDFPackage.DYNAMICS__FRICTION:
				return basicSetFriction(null, msgs);
			case MyURDFPackage.DYNAMICS__DAMPING:
				return basicSetDamping(null, msgs);
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
			case MyURDFPackage.DYNAMICS__NAME:
				return getName();
			case MyURDFPackage.DYNAMICS__FRICTION:
				return getFriction();
			case MyURDFPackage.DYNAMICS__DAMPING:
				return getDamping();
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
			case MyURDFPackage.DYNAMICS__NAME:
				setName((String)newValue);
				return;
			case MyURDFPackage.DYNAMICS__FRICTION:
				setFriction((URDFAttrSignedNumeric)newValue);
				return;
			case MyURDFPackage.DYNAMICS__DAMPING:
				setDamping((URDFAttrSignedNumeric)newValue);
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
			case MyURDFPackage.DYNAMICS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MyURDFPackage.DYNAMICS__FRICTION:
				setFriction((URDFAttrSignedNumeric)null);
				return;
			case MyURDFPackage.DYNAMICS__DAMPING:
				setDamping((URDFAttrSignedNumeric)null);
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
			case MyURDFPackage.DYNAMICS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MyURDFPackage.DYNAMICS__FRICTION:
				return friction != null;
			case MyURDFPackage.DYNAMICS__DAMPING:
				return damping != null;
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
				case MyURDFPackage.DYNAMICS__NAME: return MyURDFPackage.NAMED_ELEMENT__NAME;
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
				case MyURDFPackage.NAMED_ELEMENT__NAME: return MyURDFPackage.DYNAMICS__NAME;
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

} //DynamicsImpl
