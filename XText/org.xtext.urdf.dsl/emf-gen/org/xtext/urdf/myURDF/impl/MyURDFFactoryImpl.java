/**
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.myURDF.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.urdf.myURDF.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyURDFFactoryImpl extends EFactoryImpl implements MyURDFFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MyURDFFactory init() {
		try {
			MyURDFFactory theMyURDFFactory = (MyURDFFactory)EPackage.Registry.INSTANCE.getEFactory(MyURDFPackage.eNS_URI);
			if (theMyURDFFactory != null) {
				return theMyURDFFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MyURDFFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyURDFFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MyURDFPackage.ROBOT: return createRobot();
			case MyURDFPackage.TOPOLOGY: return createTopology();
			case MyURDFPackage.LINK: return createLink();
			case MyURDFPackage.LINK_DECORATOR: return createLinkDecorator();
			case MyURDFPackage.LINK_REF: return createLinkRef();
			case MyURDFPackage.JOINT: return createJoint();
			case MyURDFPackage.JOINT_REF: return createJointRef();
			case MyURDFPackage.INERTIAL: return createInertial();
			case MyURDFPackage.INERTIA: return createInertia();
			case MyURDFPackage.VISUAL: return createVisual();
			case MyURDFPackage.BOX: return createBox();
			case MyURDFPackage.CYLINDER: return createCylinder();
			case MyURDFPackage.COLLISION: return createCollision();
			case MyURDFPackage.ORIGIN: return createOrigin();
			case MyURDFPackage.MASS: return createMass();
			case MyURDFPackage.URDF_ATTR_SIGNED_NUMERIC: return createURDFAttrSignedNumeric();
			case MyURDFPackage.URDF_ATTR_FLOAT: return createURDFAttrFloat();
			case MyURDFPackage.URDF_ATTR_INT: return createURDFAttrINT();
			case MyURDFPackage.URDF_ATTR_NUMERIC: return createURDFAttrNumeric();
			case MyURDFPackage.URDF_ATTR_STRING: return createURDFAttrSTRING();
			case MyURDFPackage.MESH: return createMesh();
			case MyURDFPackage.SPHERE: return createSphere();
			case MyURDFPackage.COLOR: return createColor();
			case MyURDFPackage.TEXTURE: return createTexture();
			case MyURDFPackage.LIMIT: return createLimit();
			case MyURDFPackage.AXIS: return createAxis();
			case MyURDFPackage.JOINT_DECORATOR: return createJointDecorator();
			case MyURDFPackage.CALIBRATION: return createCalibration();
			case MyURDFPackage.DYNAMICS: return createDynamics();
			case MyURDFPackage.SAFETY_CONTROLLER: return createSafetyController();
			case MyURDFPackage.JOINT_DECO_REF: return createJointDecoRef();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MyURDFPackage.JOINT_TYPE:
				return createJointTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MyURDFPackage.JOINT_TYPE:
				return convertJointTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robot createRobot() {
		RobotImpl robot = new RobotImpl();
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topology createTopology() {
		TopologyImpl topology = new TopologyImpl();
		return topology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkDecorator createLinkDecorator() {
		LinkDecoratorImpl linkDecorator = new LinkDecoratorImpl();
		return linkDecorator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkRef createLinkRef() {
		LinkRefImpl linkRef = new LinkRefImpl();
		return linkRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Joint createJoint() {
		JointImpl joint = new JointImpl();
		return joint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointRef createJointRef() {
		JointRefImpl jointRef = new JointRefImpl();
		return jointRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inertial createInertial() {
		InertialImpl inertial = new InertialImpl();
		return inertial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visual createVisual() {
		VisualImpl visual = new VisualImpl();
		return visual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collision createCollision() {
		CollisionImpl collision = new CollisionImpl();
		return collision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Origin createOrigin() {
		OriginImpl origin = new OriginImpl();
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mass createMass() {
		MassImpl mass = new MassImpl();
		return mass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrSignedNumeric createURDFAttrSignedNumeric() {
		URDFAttrSignedNumericImpl urdfAttrSignedNumeric = new URDFAttrSignedNumericImpl();
		return urdfAttrSignedNumeric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrFloat createURDFAttrFloat() {
		URDFAttrFloatImpl urdfAttrFloat = new URDFAttrFloatImpl();
		return urdfAttrFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrINT createURDFAttrINT() {
		URDFAttrINTImpl urdfAttrINT = new URDFAttrINTImpl();
		return urdfAttrINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrNumeric createURDFAttrNumeric() {
		URDFAttrNumericImpl urdfAttrNumeric = new URDFAttrNumericImpl();
		return urdfAttrNumeric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrSTRING createURDFAttrSTRING() {
		URDFAttrSTRINGImpl urdfAttrSTRING = new URDFAttrSTRINGImpl();
		return urdfAttrSTRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inertia createInertia() {
		InertiaImpl inertia = new InertiaImpl();
		return inertia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColor() {
		ColorImpl color = new ColorImpl();
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Texture createTexture() {
		TextureImpl texture = new TextureImpl();
		return texture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Box createBox() {
		BoxImpl box = new BoxImpl();
		return box;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cylinder createCylinder() {
		CylinderImpl cylinder = new CylinderImpl();
		return cylinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mesh createMesh() {
		MeshImpl mesh = new MeshImpl();
		return mesh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sphere createSphere() {
		SphereImpl sphere = new SphereImpl();
		return sphere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Limit createLimit() {
		LimitImpl limit = new LimitImpl();
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis createAxis() {
		AxisImpl axis = new AxisImpl();
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointDecorator createJointDecorator() {
		JointDecoratorImpl jointDecorator = new JointDecoratorImpl();
		return jointDecorator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calibration createCalibration() {
		CalibrationImpl calibration = new CalibrationImpl();
		return calibration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dynamics createDynamics() {
		DynamicsImpl dynamics = new DynamicsImpl();
		return dynamics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyController createSafetyController() {
		SafetyControllerImpl safetyController = new SafetyControllerImpl();
		return safetyController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointDecoRef createJointDecoRef() {
		JointDecoRefImpl jointDecoRef = new JointDecoRefImpl();
		return jointDecoRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointType createJointTypeFromString(EDataType eDataType, String initialValue) {
		JointType result = JointType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJointTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyURDFPackage getMyURDFPackage() {
		return (MyURDFPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MyURDFPackage getPackage() {
		return MyURDFPackage.eINSTANCE;
	}

} //MyURDFFactoryImpl