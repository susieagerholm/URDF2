/**
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.myURDF;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cylinder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.urdf.myURDF.Cylinder#getRadius <em>Radius</em>}</li>
 * </ul>
 *
 * @see org.xtext.urdf.myURDF.MyURDFPackage#getCylinder()
 * @model
 * @generated
 */
public interface Cylinder extends Geometry {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' containment reference.
	 * @see #setRadius(URDFAttrNumeric)
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getCylinder_Radius()
	 * @model containment="true" required="true"
	 * @generated
	 */
	URDFAttrNumeric getRadius();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Cylinder#getRadius <em>Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' containment reference.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(URDFAttrNumeric value);

} // Cylinder
