/**
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.myURDF;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.urdf.myURDF.Robot#getTopologies <em>Topologies</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.Robot#getLink <em>Link</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.Robot#getJoint <em>Joint</em>}</li>
 *   <li>{@link org.xtext.urdf.myURDF.Robot#getLinkrefs <em>Linkrefs</em>}</li>
 * </ul>
 *
 * @see org.xtext.urdf.myURDF.MyURDFPackage#getRobot()
 * @model
 * @generated
 */
public interface Robot extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Topologies</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.urdf.myURDF.Topology}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topologies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topologies</em>' containment reference list.
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getRobot_Topologies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Topology> getTopologies();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.urdf.myURDF.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getRobot_Link()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Joint</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.urdf.myURDF.Joint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Joint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joint</em>' containment reference list.
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getRobot_Joint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Joint> getJoint();

	/**
	 * Returns the value of the '<em><b>Linkrefs</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.urdf.myURDF.LinkRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linkrefs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linkrefs</em>' containment reference list.
	 * @see org.xtext.urdf.myURDF.MyURDFPackage#getRobot_Linkrefs()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkRef> getLinkrefs();

} // Robot
