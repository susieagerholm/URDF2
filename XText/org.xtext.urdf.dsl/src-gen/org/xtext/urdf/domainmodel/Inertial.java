/**
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.domainmodel;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.xtext.urdf.domainmodel.Inertial#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.xtext.urdf.domainmodel.Inertial#getMass <em>Mass</em>}</li>
 *   <li>{@link org.xtext.urdf.domainmodel.Inertial#getInertia <em>Inertia</em>}</li>
 * </ul>
 *
 * @see org.xtext.urdf.domainmodel.DomainmodelPackage#getInertial()
 * @model
 * @generated
 */
public interface Inertial extends EObject
{
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
   * @see org.xtext.urdf.domainmodel.DomainmodelPackage#getInertial_Origin()
   * @model containment="true"
   * @generated
   */
  Origin getOrigin();

  /**
   * Sets the value of the '{@link org.xtext.urdf.domainmodel.Inertial#getOrigin <em>Origin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Origin</em>' containment reference.
   * @see #getOrigin()
   * @generated
   */
  void setOrigin(Origin value);

  /**
   * Returns the value of the '<em><b>Mass</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.urdf.domainmodel.Mass}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mass</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mass</em>' containment reference list.
   * @see org.xtext.urdf.domainmodel.DomainmodelPackage#getInertial_Mass()
   * @model containment="true"
   * @generated
   */
  EList<Mass> getMass();

  /**
   * Returns the value of the '<em><b>Inertia</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.urdf.domainmodel.Inertia}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inertia</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inertia</em>' containment reference list.
   * @see org.xtext.urdf.domainmodel.DomainmodelPackage#getInertial_Inertia()
   * @model containment="true"
   * @generated
   */
  EList<Inertia> getInertia();

} // Inertial
