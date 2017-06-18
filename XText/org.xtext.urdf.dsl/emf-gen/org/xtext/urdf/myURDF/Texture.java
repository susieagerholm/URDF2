/**
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.myURDF;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Texture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.urdf.myURDF.Texture#getPathToFile <em>Path To File</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.Texture#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.urdf.myURDF.MyURDFPackage#getTexture()
 * @model
 * @generated
 */
public interface Texture extends Material {
	/**
	 * Returns the value of the '<em><b>Path To File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path To File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path To File</em>' containment reference.
	 * @see #setPathToFile(URDFAttrSTRING)
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getTexture_PathToFile()
	 * @model containment="true" required="true"
	 * @generated
	 */
	URDFAttrSTRING getPathToFile();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Texture#getPathToFile <em>Path To File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path To File</em>' containment reference.
	 * @see #getPathToFile()
	 * @generated
	 */
	void setPathToFile(URDFAttrSTRING value);

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
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getTexture_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Texture#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Texture
