/**
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.myURDF;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.urdf.myURDF.MyURDFPackage
 * @generated
 */
public interface MyURDFFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MyURDFFactory eINSTANCE = org.xtext.urdf.myURDF.impl.MyURDFFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot</em>'.
	 * @generated
	 */
	Robot createRobot();

	/**
	 * Returns a new object of class '<em>Topology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topology</em>'.
	 * @generated
	 */
	Topology createTopology();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Link Decorator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Decorator</em>'.
	 * @generated
	 */
	LinkDecorator createLinkDecorator();

	/**
	 * Returns a new object of class '<em>Link Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Ref</em>'.
	 * @generated
	 */
	LinkRef createLinkRef();

	/**
	 * Returns a new object of class '<em>Joint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Joint</em>'.
	 * @generated
	 */
	Joint createJoint();

	/**
	 * Returns a new object of class '<em>Joint Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Joint Ref</em>'.
	 * @generated
	 */
	JointRef createJointRef();

	/**
	 * Returns a new object of class '<em>Inertial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inertial</em>'.
	 * @generated
	 */
	Inertial createInertial();

	/**
	 * Returns a new object of class '<em>Visual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visual</em>'.
	 * @generated
	 */
	Visual createVisual();

	/**
	 * Returns a new object of class '<em>Collision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collision</em>'.
	 * @generated
	 */
	Collision createCollision();

	/**
	 * Returns a new object of class '<em>Origin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Origin</em>'.
	 * @generated
	 */
	Origin createOrigin();

	/**
	 * Returns a new object of class '<em>Mass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mass</em>'.
	 * @generated
	 */
	Mass createMass();

	/**
	 * Returns a new object of class '<em>URDF Attr Signed Numeric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>URDF Attr Signed Numeric</em>'.
	 * @generated
	 */
	URDFAttrSignedNumeric createURDFAttrSignedNumeric();

	/**
	 * Returns a new object of class '<em>URDF Attr Float</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>URDF Attr Float</em>'.
	 * @generated
	 */
	URDFAttrFloat createURDFAttrFloat();

	/**
	 * Returns a new object of class '<em>URDF Attr INT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>URDF Attr INT</em>'.
	 * @generated
	 */
	URDFAttrINT createURDFAttrINT();

	/**
	 * Returns a new object of class '<em>URDF Attr Numeric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>URDF Attr Numeric</em>'.
	 * @generated
	 */
	URDFAttrNumeric createURDFAttrNumeric();

	/**
	 * Returns a new object of class '<em>URDF Attr STRING</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>URDF Attr STRING</em>'.
	 * @generated
	 */
	URDFAttrSTRING createURDFAttrSTRING();

	/**
	 * Returns a new object of class '<em>Inertia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inertia</em>'.
	 * @generated
	 */
	Inertia createInertia();

	/**
	 * Returns a new object of class '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Color</em>'.
	 * @generated
	 */
	Color createColor();

	/**
	 * Returns a new object of class '<em>Texture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Texture</em>'.
	 * @generated
	 */
	Texture createTexture();

	/**
	 * Returns a new object of class '<em>Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Box</em>'.
	 * @generated
	 */
	Box createBox();

	/**
	 * Returns a new object of class '<em>Cylinder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cylinder</em>'.
	 * @generated
	 */
	Cylinder createCylinder();

	/**
	 * Returns a new object of class '<em>Mesh</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mesh</em>'.
	 * @generated
	 */
	Mesh createMesh();

	/**
	 * Returns a new object of class '<em>Sphere</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sphere</em>'.
	 * @generated
	 */
	Sphere createSphere();

	/**
	 * Returns a new object of class '<em>Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Limit</em>'.
	 * @generated
	 */
	Limit createLimit();

	/**
	 * Returns a new object of class '<em>Axis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Axis</em>'.
	 * @generated
	 */
	Axis createAxis();

	/**
	 * Returns a new object of class '<em>Joint Decorator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Joint Decorator</em>'.
	 * @generated
	 */
	JointDecorator createJointDecorator();

	/**
	 * Returns a new object of class '<em>Calibration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calibration</em>'.
	 * @generated
	 */
	Calibration createCalibration();

	/**
	 * Returns a new object of class '<em>Dynamics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamics</em>'.
	 * @generated
	 */
	Dynamics createDynamics();

	/**
	 * Returns a new object of class '<em>Safety Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Safety Controller</em>'.
	 * @generated
	 */
	SafetyController createSafetyController();

	/**
	 * Returns a new object of class '<em>Joint Deco Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Joint Deco Ref</em>'.
	 * @generated
	 */
	JointDecoRef createJointDecoRef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MyURDFPackage getMyURDFPackage();

} //MyURDFFactory
