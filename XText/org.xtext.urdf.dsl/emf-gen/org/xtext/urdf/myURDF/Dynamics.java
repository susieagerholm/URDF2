/**
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.myURDF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.urdf.myURDF.Dynamics#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.Dynamics#getFriction <em>Friction</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.Dynamics#getDamping <em>Damping</em>}</li>
 * </ul>
 *
 * @see org.xtext.urdf.myURDF.MyURDFPackage#getDynamics()
 * @model
 * @generated
 */
public interface Dynamics extends EObject {
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
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getDynamics_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Dynamics#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Friction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Friction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friction</em>' containment reference.
	 * @see #setFriction(URDFAttrSignedNumeric)
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getDynamics_Friction()
	 * @model containment="true"
	 * @generated
	 */
	URDFAttrSignedNumeric getFriction();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Dynamics#getFriction <em>Friction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Friction</em>' containment reference.
	 * @see #getFriction()
	 * @generated
	 */
	void setFriction(URDFAttrSignedNumeric value);

	/**
	 * Returns the value of the '<em><b>Damping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Damping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Damping</em>' containment reference.
	 * @see #setDamping(URDFAttrSignedNumeric)
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getDynamics_Damping()
	 * @model containment="true"
	 * @generated
	 */
	URDFAttrSignedNumeric getDamping();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Dynamics#getDamping <em>Damping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damping</em>' containment reference.
	 * @see #getDamping()
	 * @generated
	 */
	void setDamping(URDFAttrSignedNumeric value);

} // Dynamics
