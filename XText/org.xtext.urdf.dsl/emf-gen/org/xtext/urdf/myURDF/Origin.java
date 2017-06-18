/**
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.myURDF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Origin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.urdf.myURDF.Origin#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.Origin#getX <em>X</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.Origin#getY <em>Y</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.Origin#getZ <em>Z</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.Origin#getRoll <em>Roll</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.Origin#getPitch <em>Pitch</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.Origin#getYaw <em>Yaw</em>}</li>
 * </ul>
 *
 * @see org.xtext.urdf.myURDF.MyURDFPackage#getOrigin()
 * @model
 * @generated
 */
public interface Origin extends EObject {
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
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getOrigin_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Origin#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' containment reference.
	 * @see #setX(URDFAttrSignedNumeric)
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getOrigin_X()
	 * @model containment="true" required="true"
	 * @generated
	 */
	URDFAttrSignedNumeric getX();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Origin#getX <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' containment reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(URDFAttrSignedNumeric value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' containment reference.
	 * @see #setY(URDFAttrSignedNumeric)
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getOrigin_Y()
	 * @model containment="true" required="true"
	 * @generated
	 */
	URDFAttrSignedNumeric getY();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Origin#getY <em>Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' containment reference.
	 * @see #getY()
	 * @generated
	 */
	void setY(URDFAttrSignedNumeric value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' containment reference.
	 * @see #setZ(URDFAttrSignedNumeric)
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getOrigin_Z()
	 * @model containment="true" required="true"
	 * @generated
	 */
	URDFAttrSignedNumeric getZ();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Origin#getZ <em>Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' containment reference.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(URDFAttrSignedNumeric value);

	/**
	 * Returns the value of the '<em><b>Roll</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roll</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roll</em>' containment reference.
	 * @see #setRoll(URDFAttrSignedNumeric)
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getOrigin_Roll()
	 * @model containment="true"
	 * @generated
	 */
	URDFAttrSignedNumeric getRoll();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Origin#getRoll <em>Roll</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll</em>' containment reference.
	 * @see #getRoll()
	 * @generated
	 */
	void setRoll(URDFAttrSignedNumeric value);

	/**
	 * Returns the value of the '<em><b>Pitch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pitch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pitch</em>' containment reference.
	 * @see #setPitch(URDFAttrSignedNumeric)
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getOrigin_Pitch()
	 * @model containment="true"
	 * @generated
	 */
	URDFAttrSignedNumeric getPitch();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Origin#getPitch <em>Pitch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pitch</em>' containment reference.
	 * @see #getPitch()
	 * @generated
	 */
	void setPitch(URDFAttrSignedNumeric value);

	/**
	 * Returns the value of the '<em><b>Yaw</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yaw</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yaw</em>' containment reference.
	 * @see #setYaw(URDFAttrSignedNumeric)
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getOrigin_Yaw()
	 * @model containment="true"
	 * @generated
	 */
	URDFAttrSignedNumeric getYaw();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Origin#getYaw <em>Yaw</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yaw</em>' containment reference.
	 * @see #getYaw()
	 * @generated
	 */
	void setYaw(URDFAttrSignedNumeric value);

} // Origin
