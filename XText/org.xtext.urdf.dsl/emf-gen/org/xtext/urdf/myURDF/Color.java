/**
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.myURDF;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.urdf.myURDF.Color#getRed <em>Red</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.Color#getGreen <em>Green</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.Color#getBlue <em>Blue</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.Color#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.Color#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.urdf.myURDF.MyURDFPackage#getColor()
 * @model
 * @generated
 */
public interface Color extends Material {
	/**
	 * Returns the value of the '<em><b>Red</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Red</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red</em>' containment reference.
	 * @see #setRed(URDFAttrFloat)
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getColor_Red()
	 * @model containment="true" required="true"
	 * @generated
	 */
	URDFAttrFloat getRed();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Color#getRed <em>Red</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red</em>' containment reference.
	 * @see #getRed()
	 * @generated
	 */
	void setRed(URDFAttrFloat value);

	/**
	 * Returns the value of the '<em><b>Green</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Green</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green</em>' containment reference.
	 * @see #setGreen(URDFAttrFloat)
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getColor_Green()
	 * @model containment="true" required="true"
	 * @generated
	 */
	URDFAttrFloat getGreen();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Color#getGreen <em>Green</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green</em>' containment reference.
	 * @see #getGreen()
	 * @generated
	 */
	void setGreen(URDFAttrFloat value);

	/**
	 * Returns the value of the '<em><b>Blue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blue</em>' containment reference.
	 * @see #setBlue(URDFAttrFloat)
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getColor_Blue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	URDFAttrFloat getBlue();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Color#getBlue <em>Blue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue</em>' containment reference.
	 * @see #getBlue()
	 * @generated
	 */
	void setBlue(URDFAttrFloat value);

	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' containment reference.
	 * @see #setAlpha(URDFAttrFloat)
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getColor_Alpha()
	 * @model containment="true" required="true"
	 * @generated
	 */
	URDFAttrFloat getAlpha();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Color#getAlpha <em>Alpha</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' containment reference.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(URDFAttrFloat value);

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
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getColor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Color#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Color
