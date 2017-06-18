/**
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.myURDF.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.urdf.myURDF.Box;
import org.xtext.urdf.myURDF.Mesh;
import org.xtext.urdf.myURDF.MyURDFPackage;
import org.xtext.urdf.myURDF.URDFAttrSTRING;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mesh</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.urdf.myURDF.impl.MeshImpl#getPathToFile <em>Path To File</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.impl.MeshImpl#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeshImpl extends GeometryImpl implements Mesh {
	/**
	 * The cached value of the '{@link #getPathToFile() <em>Path To File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathToFile()
	 * @generated
	 * @ordered
	 */
	protected URDFAttrSTRING pathToFile;

	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected Box dimension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeshImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyURDFPackage.Literals.MESH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrSTRING getPathToFile() {
		return pathToFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPathToFile(URDFAttrSTRING newPathToFile, NotificationChain msgs) {
		URDFAttrSTRING oldPathToFile = pathToFile;
		pathToFile = newPathToFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyURDFPackage.MESH__PATH_TO_FILE, oldPathToFile, newPathToFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathToFile(URDFAttrSTRING newPathToFile) {
		if (newPathToFile != pathToFile) {
			NotificationChain msgs = null;
			if (pathToFile != null)
				msgs = ((InternalEObject)pathToFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyURDFPackage.MESH__PATH_TO_FILE, null, msgs);
			if (newPathToFile != null)
				msgs = ((InternalEObject)newPathToFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyURDFPackage.MESH__PATH_TO_FILE, null, msgs);
			msgs = basicSetPathToFile(newPathToFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyURDFPackage.MESH__PATH_TO_FILE, newPathToFile, newPathToFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Box getDimension() {
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimension(Box newDimension, NotificationChain msgs) {
		Box oldDimension = dimension;
		dimension = newDimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyURDFPackage.MESH__DIMENSION, oldDimension, newDimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimension(Box newDimension) {
		if (newDimension != dimension) {
			NotificationChain msgs = null;
			if (dimension != null)
				msgs = ((InternalEObject)dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyURDFPackage.MESH__DIMENSION, null, msgs);
			if (newDimension != null)
				msgs = ((InternalEObject)newDimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyURDFPackage.MESH__DIMENSION, null, msgs);
			msgs = basicSetDimension(newDimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyURDFPackage.MESH__DIMENSION, newDimension, newDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyURDFPackage.MESH__PATH_TO_FILE:
				return basicSetPathToFile(null, msgs);
			case MyURDFPackage.MESH__DIMENSION:
				return basicSetDimension(null, msgs);
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
			case MyURDFPackage.MESH__PATH_TO_FILE:
				return getPathToFile();
			case MyURDFPackage.MESH__DIMENSION:
				return getDimension();
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
			case MyURDFPackage.MESH__PATH_TO_FILE:
				setPathToFile((URDFAttrSTRING)newValue);
				return;
			case MyURDFPackage.MESH__DIMENSION:
				setDimension((Box)newValue);
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
			case MyURDFPackage.MESH__PATH_TO_FILE:
				setPathToFile((URDFAttrSTRING)null);
				return;
			case MyURDFPackage.MESH__DIMENSION:
				setDimension((Box)null);
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
			case MyURDFPackage.MESH__PATH_TO_FILE:
				return pathToFile != null;
			case MyURDFPackage.MESH__DIMENSION:
				return dimension != null;
		}
		return super.eIsSet(featureID);
	}

} //MeshImpl
