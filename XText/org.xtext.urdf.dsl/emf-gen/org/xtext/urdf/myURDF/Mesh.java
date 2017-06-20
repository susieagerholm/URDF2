/**
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.myURDF;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mesh</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.urdf.myURDF.Mesh#getPathToFile <em>Path To File</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.Mesh#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @see org.xtext.urdf.myURDF.MyURDFPackage#getMesh()
 * @model
 * @generated
 */
public interface Mesh extends Geometry, NamedElement {
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
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getMesh_PathToFile()
	 * @model containment="true" required="true"
	 * @generated
	 */
	URDFAttrSTRING getPathToFile();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Mesh#getPathToFile <em>Path To File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path To File</em>' containment reference.
	 * @see #getPathToFile()
	 * @generated
	 */
	void setPathToFile(URDFAttrSTRING value);

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' containment reference.
	 * @see #setDimension(Box)
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getMesh_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	Box getDimension();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Mesh#getDimension <em>Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' containment reference.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(Box value);

} // Mesh