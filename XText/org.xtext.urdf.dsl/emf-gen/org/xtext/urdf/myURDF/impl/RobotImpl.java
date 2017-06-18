/**
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.myURDF.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.urdf.myURDF.Joint;
import org.xtext.urdf.myURDF.Link;
import org.xtext.urdf.myURDF.LinkRef;
import org.xtext.urdf.myURDF.MyURDFPackage;
import org.xtext.urdf.myURDF.Robot;
import org.xtext.urdf.myURDF.Topology;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.urdf.myURDF.impl.RobotImpl#getTopologies <em>Topologies</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.impl.RobotImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.impl.RobotImpl#getJoint <em>Joint</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.impl.RobotImpl#getLinkrefs <em>Linkrefs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotImpl extends NamedElementImpl implements Robot {
	/**
	 * The cached value of the '{@link #getTopologies() <em>Topologies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologies()
	 * @generated
	 * @ordered
	 */
	protected EList<Topology> topologies;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> link;

	/**
	 * The cached value of the '{@link #getJoint() <em>Joint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Joint> joint;

	/**
	 * The cached value of the '{@link #getLinkrefs() <em>Linkrefs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkrefs()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkRef> linkrefs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyURDFPackage.Literals.ROBOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Topology> getTopologies() {
		if (topologies == null) {
			topologies = new EObjectContainmentEList<Topology>(Topology.class, this, MyURDFPackage.ROBOT__TOPOLOGIES);
		}
		return topologies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Link>(Link.class, this, MyURDFPackage.ROBOT__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Joint> getJoint() {
		if (joint == null) {
			joint = new EObjectContainmentEList<Joint>(Joint.class, this, MyURDFPackage.ROBOT__JOINT);
		}
		return joint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkRef> getLinkrefs() {
		if (linkrefs == null) {
			linkrefs = new EObjectContainmentEList<LinkRef>(LinkRef.class, this, MyURDFPackage.ROBOT__LINKREFS);
		}
		return linkrefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyURDFPackage.ROBOT__TOPOLOGIES:
				return ((InternalEList<?>)getTopologies()).basicRemove(otherEnd, msgs);
			case MyURDFPackage.ROBOT__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case MyURDFPackage.ROBOT__JOINT:
				return ((InternalEList<?>)getJoint()).basicRemove(otherEnd, msgs);
			case MyURDFPackage.ROBOT__LINKREFS:
				return ((InternalEList<?>)getLinkrefs()).basicRemove(otherEnd, msgs);
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
			case MyURDFPackage.ROBOT__TOPOLOGIES:
				return getTopologies();
			case MyURDFPackage.ROBOT__LINK:
				return getLink();
			case MyURDFPackage.ROBOT__JOINT:
				return getJoint();
			case MyURDFPackage.ROBOT__LINKREFS:
				return getLinkrefs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MyURDFPackage.ROBOT__TOPOLOGIES:
				getTopologies().clear();
				getTopologies().addAll((Collection<? extends Topology>)newValue);
				return;
			case MyURDFPackage.ROBOT__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case MyURDFPackage.ROBOT__JOINT:
				getJoint().clear();
				getJoint().addAll((Collection<? extends Joint>)newValue);
				return;
			case MyURDFPackage.ROBOT__LINKREFS:
				getLinkrefs().clear();
				getLinkrefs().addAll((Collection<? extends LinkRef>)newValue);
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
			case MyURDFPackage.ROBOT__TOPOLOGIES:
				getTopologies().clear();
				return;
			case MyURDFPackage.ROBOT__LINK:
				getLink().clear();
				return;
			case MyURDFPackage.ROBOT__JOINT:
				getJoint().clear();
				return;
			case MyURDFPackage.ROBOT__LINKREFS:
				getLinkrefs().clear();
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
			case MyURDFPackage.ROBOT__TOPOLOGIES:
				return topologies != null && !topologies.isEmpty();
			case MyURDFPackage.ROBOT__LINK:
				return link != null && !link.isEmpty();
			case MyURDFPackage.ROBOT__JOINT:
				return joint != null && !joint.isEmpty();
			case MyURDFPackage.ROBOT__LINKREFS:
				return linkrefs != null && !linkrefs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RobotImpl
