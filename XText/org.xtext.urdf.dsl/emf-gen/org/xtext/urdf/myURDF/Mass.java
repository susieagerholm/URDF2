/**
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.myURDF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.urdf.myURDF.Mass#getMassValueInKilograms <em>Mass Value In Kilograms</em>}</li>
 * </ul>
 *
 * @see org.xtext.urdf.myURDF.MyURDFPackage#getMass()
 * @model
 * @generated
 */
public interface Mass extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Mass Value In Kilograms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mass Value In Kilograms</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Value In Kilograms</em>' containment reference.
	 * @see #setMassValueInKilograms(URDFAttrNumeric)
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getMass_MassValueInKilograms()
	 * @model containment="true" required="true"
	 * @generated
	 */
	URDFAttrNumeric getMassValueInKilograms();

	/**
	 * Sets the value of the '{@link org.xtext.urdf.myURDF.Mass#getMassValueInKilograms <em>Mass Value In Kilograms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Value In Kilograms</em>' containment reference.
	 * @see #getMassValueInKilograms()
	 * @generated
	 */
	void setMassValueInKilograms(URDFAttrNumeric value);

} // Mass