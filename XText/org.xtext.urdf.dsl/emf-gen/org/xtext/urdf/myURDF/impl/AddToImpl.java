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

import org.xtext.urdf.myURDF.AddTo;
import org.xtext.urdf.myURDF.Joint;
import org.xtext.urdf.myURDF.Link;
import org.xtext.urdf.myURDF.MyURDFPackage;
import org.xtext.urdf.myURDF.ReUseAble;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add To</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.urdf.myURDF.impl.AddToImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.impl.AddToImpl#getJoint <em>Joint</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.impl.AddToImpl#getAdd <em>Add</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddToImpl extends MinimalEObjectImpl.Container implements AddTo {
	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected Link link;

	/**
	 * The cached value of the '{@link #getJoint() <em>Joint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoint()
	 * @generated
	 * @ordered
	 */
	protected Joint joint;

	/**
	 * The cached value of the '{@link #getAdd() <em>Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdd()
	 * @generated
	 * @ordered
	 */
	protected ReUseAble add;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyURDFPackage.Literals.ADD_TO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link getLink() {
		if (link != null && link.eIsProxy()) {
			InternalEObject oldLink = (InternalEObject)link;
			link = (Link)eResolveProxy(oldLink);
			if (link != oldLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyURDFPackage.ADD_TO__LINK, oldLink, link));
			}
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link basicGetLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(Link newLink) {
		Link oldLink = link;
		link = newLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyURDFPackage.ADD_TO__LINK, oldLink, link));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Joint getJoint() {
		if (joint != null && joint.eIsProxy()) {
			InternalEObject oldJoint = (InternalEObject)joint;
			joint = (Joint)eResolveProxy(oldJoint);
			if (joint != oldJoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyURDFPackage.ADD_TO__JOINT, oldJoint, joint));
			}
		}
		return joint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Joint basicGetJoint() {
		return joint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoint(Joint newJoint) {
		Joint oldJoint = joint;
		joint = newJoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyURDFPackage.ADD_TO__JOINT, oldJoint, joint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReUseAble getAdd() {
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdd(ReUseAble newAdd, NotificationChain msgs) {
		ReUseAble oldAdd = add;
		add = newAdd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyURDFPackage.ADD_TO__ADD, oldAdd, newAdd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdd(ReUseAble newAdd) {
		if (newAdd != add) {
			NotificationChain msgs = null;
			if (add != null)
				msgs = ((InternalEObject)add).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyURDFPackage.ADD_TO__ADD, null, msgs);
			if (newAdd != null)
				msgs = ((InternalEObject)newAdd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyURDFPackage.ADD_TO__ADD, null, msgs);
			msgs = basicSetAdd(newAdd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyURDFPackage.ADD_TO__ADD, newAdd, newAdd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyURDFPackage.ADD_TO__ADD:
				return basicSetAdd(null, msgs);
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
			case MyURDFPackage.ADD_TO__LINK:
				if (resolve) return getLink();
				return basicGetLink();
			case MyURDFPackage.ADD_TO__JOINT:
				if (resolve) return getJoint();
				return basicGetJoint();
			case MyURDFPackage.ADD_TO__ADD:
				return getAdd();
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
			case MyURDFPackage.ADD_TO__LINK:
				setLink((Link)newValue);
				return;
			case MyURDFPackage.ADD_TO__JOINT:
				setJoint((Joint)newValue);
				return;
			case MyURDFPackage.ADD_TO__ADD:
				setAdd((ReUseAble)newValue);
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
			case MyURDFPackage.ADD_TO__LINK:
				setLink((Link)null);
				return;
			case MyURDFPackage.ADD_TO__JOINT:
				setJoint((Joint)null);
				return;
			case MyURDFPackage.ADD_TO__ADD:
				setAdd((ReUseAble)null);
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
			case MyURDFPackage.ADD_TO__LINK:
				return link != null;
			case MyURDFPackage.ADD_TO__JOINT:
				return joint != null;
			case MyURDFPackage.ADD_TO__ADD:
				return add != null;
		}
		return super.eIsSet(featureID);
	}

} //AddToImpl
