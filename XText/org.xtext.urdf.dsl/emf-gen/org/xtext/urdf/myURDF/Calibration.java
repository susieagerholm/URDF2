/**
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.myURDF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calibration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.urdf.myURDF.Calibration#getRising <em>Rising</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.Calibration#getFalling <em>Falling</em>}</li>
 * </ul>
 *
 * @see org.xtext.urdf.myURDF.MyURDFPackage#getCalibration()
 * @model
 * @generated
 */
public interface Calibration extends ReUseAble, NamedElement {
	/**
	 * Returns the value of the '<em><b>Rising</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rising</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rising</em>' containment reference.
	 * @see #setRising(URDFAttrSignedNumeric)
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getCalibration_Rising()
	 * @model containment="true"
	 * @generated
	 */
	URDFAttrSignedNumeric getRising();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Calibration#getRising <em>Rising</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rising</em>' containment reference.
	 * @see #getRising()
	 * @generated
	 */
	void setRising(URDFAttrSignedNumeric value);

	/**
	 * Returns the value of the '<em><b>Falling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Falling</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Falling</em>' containment reference.
	 * @see #setFalling(URDFAttrSignedNumeric)
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getCalibration_Falling()
	 * @model containment="true"
	 * @generated
	 */
	URDFAttrSignedNumeric getFalling();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Calibration#getFalling <em>Falling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Falling</em>' containment reference.
	 * @see #getFalling()
	 * @generated
	 */
	void setFalling(URDFAttrSignedNumeric value);

} // Calibration
