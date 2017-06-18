/**
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.myURDF;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.urdf.myURDF.Collision#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.Collision#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.Collision#getOrigin <em>Origin</em>}</li>
 * </ul>
 *
 * @see org.xtext.urdf.myURDF.MyURDFPackage#getCollision()
 * @model
 * @generated
 */
public interface Collision extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getCollision_Name()
	 * @model extendedMetaData="wildcards='' name=''"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Collision#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.urdf.myURDF.Geometry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry</em>' containment reference list.
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getCollision_Geometry()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Geometry> getGeometry();

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference.
	 * @see #setOrigin(Origin)
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getCollision_Origin()
	 * @model containment="true"
	 * @generated
	 */
	Origin getOrigin();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Collision#getOrigin <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' containment reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Origin value);

} // Collision
