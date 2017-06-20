/**
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.myURDF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inertial</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.urdf.myURDF.Inertial#getInertia <em>Inertia</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.Inertial#getMass <em>Mass</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.Inertial#getOrigin <em>Origin</em>}</li>
 * </ul>
 *
 * @see org.xtext.urdf.myURDF.MyURDFPackage#getInertial()
 * @model
 * @generated
 */
public interface Inertial extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Inertia</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inertia</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inertia</em>' containment reference.
	 * @see #setInertia(Inertia)
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getInertial_Inertia()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Inertia getInertia();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Inertial#getInertia <em>Inertia</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inertia</em>' containment reference.
	 * @see #getInertia()
	 * @generated
	 */
	void setInertia(Inertia value);

	/**
	 * Returns the value of the '<em><b>Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass</em>' containment reference.
	 * @see #setMass(Mass)
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getInertial_Mass()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Mass getMass();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Inertial#getMass <em>Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass</em>' containment reference.
	 * @see #getMass()
	 * @generated
	 */
	void setMass(Mass value);

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
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getInertial_Origin()
	 * @model containment="true"
	 * @generated
	 */
	Origin getOrigin();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Inertial#getOrigin <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' containment reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Origin value);

} // Inertial