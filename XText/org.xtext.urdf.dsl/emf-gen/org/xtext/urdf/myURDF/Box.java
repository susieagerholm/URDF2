/**
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.myURDF;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.urdf.myURDF.Box#getWidth <em>Width</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.Box#getLength <em>Length</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.Box#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @see org.xtext.urdf.myURDF.MyURDFPackage#getBox()
 * @model
 * @generated
 */
public interface Box extends Geometry, NamedElement {
	/**
	 * Returns the value of the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' containment reference.
	 * @see #setHeight(URDFAttrNumeric)
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getBox_Height()
	 * @model containment="true" required="true"
	 * @generated
	 */
	URDFAttrNumeric getHeight();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Box#getHeight <em>Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' containment reference.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(URDFAttrNumeric value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' containment reference.
	 * @see #setWidth(URDFAttrNumeric)
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getBox_Width()
	 * @model containment="true" required="true"
	 * @generated
	 */
	URDFAttrNumeric getWidth();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Box#getWidth <em>Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' containment reference.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(URDFAttrNumeric value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' containment reference.
	 * @see #setLength(URDFAttrNumeric)
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getBox_Length()
	 * @model containment="true" required="true"
	 * @generated
	 */
	URDFAttrNumeric getLength();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Box#getLength <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' containment reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(URDFAttrNumeric value);

} // Box
