/**
 */
package iArchimate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see iArchimate.IArchimateFactory
 * @model kind="package"
 *        annotation="gmf foo='bar'"
 * @generated
 */
public interface IArchimatePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "iArchimate";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://co/edu/uniandes/iArchimate";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "co.edu.uniandes.iArchimate";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  IArchimatePackage eINSTANCE = iArchimate.impl.IArchimatePackageImpl.init();

  /**
   * The meta object id for the '{@link iArchimate.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iArchimate.impl.ModelImpl
   * @see iArchimate.impl.IArchimatePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__RELATIONS = 0;

  /**
   * The feature id for the '<em><b>Decision Traces</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DECISION_TRACES = 1;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__COMPONENTS = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link iArchimate.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iArchimate.impl.ComponentImpl
   * @see iArchimate.impl.IArchimatePackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__COMPONENTS = 1;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link iArchimate.impl.GroupImpl <em>Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iArchimate.impl.GroupImpl
   * @see iArchimate.impl.IArchimatePackageImpl#getGroup()
   * @generated
   */
  int GROUP = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__NAME = COMPONENT__NAME;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__COMPONENTS = COMPONENT__COMPONENTS;

  /**
   * The number of structural features of the '<em>Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link iArchimate.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iArchimate.impl.ElementImpl
   * @see iArchimate.impl.IArchimatePackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__NAME = COMPONENT__NAME;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__COMPONENTS = COMPONENT__COMPONENTS;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__TYPE_NAME = COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__ATTRIBUTES = COMPONENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Relations</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__RELATIONS = COMPONENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Element Decision Trace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__ELEMENT_DECISION_TRACE = COMPONENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link iArchimate.impl.AbsentElementImpl <em>Absent Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iArchimate.impl.AbsentElementImpl
   * @see iArchimate.impl.IArchimatePackageImpl#getAbsentElement()
   * @generated
   */
  int ABSENT_ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSENT_ELEMENT__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSENT_ELEMENT__COMPONENTS = ELEMENT__COMPONENTS;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSENT_ELEMENT__TYPE_NAME = ELEMENT__TYPE_NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSENT_ELEMENT__ATTRIBUTES = ELEMENT__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Relations</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSENT_ELEMENT__RELATIONS = ELEMENT__RELATIONS;

  /**
   * The feature id for the '<em><b>Element Decision Trace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSENT_ELEMENT__ELEMENT_DECISION_TRACE = ELEMENT__ELEMENT_DECISION_TRACE;

  /**
   * The number of structural features of the '<em>Absent Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSENT_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link iArchimate.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iArchimate.impl.AttributeImpl
   * @see iArchimate.impl.IArchimatePackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__VALUE = 2;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link iArchimate.impl.ImperfectAttributeImpl <em>Imperfect Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iArchimate.impl.ImperfectAttributeImpl
   * @see iArchimate.impl.IArchimatePackageImpl#getImperfectAttribute()
   * @generated
   */
  int IMPERFECT_ATTRIBUTE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPERFECT_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPERFECT_ATTRIBUTE__TYPE = ATTRIBUTE__TYPE;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPERFECT_ATTRIBUTE__VALUE = ATTRIBUTE__VALUE;

  /**
   * The feature id for the '<em><b>Imperfection Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPERFECT_ATTRIBUTE__IMPERFECTION_TYPE = ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Imperfect Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPERFECT_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link iArchimate.impl.RelationImpl <em>Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iArchimate.impl.RelationImpl
   * @see iArchimate.impl.IArchimatePackageImpl#getRelation()
   * @generated
   */
  int RELATION = 7;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__TARGET = 1;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__TYPE_NAME = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__NAME = 3;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__ATTRIBUTES = 4;

  /**
   * The number of structural features of the '<em>Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link iArchimate.impl.ImperfectRelationImpl <em>Imperfect Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iArchimate.impl.ImperfectRelationImpl
   * @see iArchimate.impl.IArchimatePackageImpl#getImperfectRelation()
   * @generated
   */
  int IMPERFECT_RELATION = 8;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPERFECT_RELATION__SOURCE = RELATION__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPERFECT_RELATION__TARGET = RELATION__TARGET;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPERFECT_RELATION__TYPE_NAME = RELATION__TYPE_NAME;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPERFECT_RELATION__NAME = RELATION__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPERFECT_RELATION__ATTRIBUTES = RELATION__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Imperfection Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPERFECT_RELATION__IMPERFECTION_TYPE = RELATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Certainty Degree</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPERFECT_RELATION__CERTAINTY_DEGREE = RELATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Imperfect Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPERFECT_RELATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link iArchimate.impl.DecisionTraceImpl <em>Decision Trace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iArchimate.impl.DecisionTraceImpl
   * @see iArchimate.impl.IArchimatePackageImpl#getDecisionTrace()
   * @generated
   */
  int DECISION_TRACE = 9;

  /**
   * The feature id for the '<em><b>Id Decision Trace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TRACE__ID_DECISION_TRACE = 0;

  /**
   * The feature id for the '<em><b>Decisions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TRACE__DECISIONS = 1;

  /**
   * The feature id for the '<em><b>Facts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TRACE__FACTS = 2;

  /**
   * The feature id for the '<em><b>Observations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TRACE__OBSERVATIONS = 3;

  /**
   * The feature id for the '<em><b>Sources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TRACE__SOURCES = 4;

  /**
   * The number of structural features of the '<em>Decision Trace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TRACE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link iArchimate.impl.SourceImpl <em>Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iArchimate.impl.SourceImpl
   * @see iArchimate.impl.IArchimatePackageImpl#getSource()
   * @generated
   */
  int SOURCE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Reliability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE__RELIABILITY = 1;

  /**
   * The feature id for the '<em><b>Certainty Degree</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE__CERTAINTY_DEGREE = 2;

  /**
   * The feature id for the '<em><b>Source Observations</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE__SOURCE_OBSERVATIONS = 3;

  /**
   * The number of structural features of the '<em>Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link iArchimate.impl.DirectObservationImpl <em>Direct Observation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iArchimate.impl.DirectObservationImpl
   * @see iArchimate.impl.IArchimatePackageImpl#getDirectObservation()
   * @generated
   */
  int DIRECT_OBSERVATION = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_OBSERVATION__NAME = SOURCE__NAME;

  /**
   * The feature id for the '<em><b>Reliability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_OBSERVATION__RELIABILITY = SOURCE__RELIABILITY;

  /**
   * The feature id for the '<em><b>Certainty Degree</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_OBSERVATION__CERTAINTY_DEGREE = SOURCE__CERTAINTY_DEGREE;

  /**
   * The feature id for the '<em><b>Source Observations</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_OBSERVATION__SOURCE_OBSERVATIONS = SOURCE__SOURCE_OBSERVATIONS;

  /**
   * The number of structural features of the '<em>Direct Observation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_OBSERVATION_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link iArchimate.impl.MeetingImpl <em>Meeting</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iArchimate.impl.MeetingImpl
   * @see iArchimate.impl.IArchimatePackageImpl#getMeeting()
   * @generated
   */
  int MEETING = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEETING__NAME = SOURCE__NAME;

  /**
   * The feature id for the '<em><b>Reliability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEETING__RELIABILITY = SOURCE__RELIABILITY;

  /**
   * The feature id for the '<em><b>Certainty Degree</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEETING__CERTAINTY_DEGREE = SOURCE__CERTAINTY_DEGREE;

  /**
   * The feature id for the '<em><b>Source Observations</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEETING__SOURCE_OBSERVATIONS = SOURCE__SOURCE_OBSERVATIONS;

  /**
   * The feature id for the '<em><b>Minute Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEETING__MINUTE_NUMBER = SOURCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Meeting Participants</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEETING__MEETING_PARTICIPANTS = SOURCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Meeting</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEETING_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link iArchimate.impl.DocumentImpl <em>Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iArchimate.impl.DocumentImpl
   * @see iArchimate.impl.IArchimatePackageImpl#getDocument()
   * @generated
   */
  int DOCUMENT = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__NAME = SOURCE__NAME;

  /**
   * The feature id for the '<em><b>Reliability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__RELIABILITY = SOURCE__RELIABILITY;

  /**
   * The feature id for the '<em><b>Certainty Degree</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__CERTAINTY_DEGREE = SOURCE__CERTAINTY_DEGREE;

  /**
   * The feature id for the '<em><b>Source Observations</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__SOURCE_OBSERVATIONS = SOURCE__SOURCE_OBSERVATIONS;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__VERSION = SOURCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__DESCRIPTION = SOURCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link iArchimate.impl.PersonImpl <em>Person</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iArchimate.impl.PersonImpl
   * @see iArchimate.impl.IArchimatePackageImpl#getPerson()
   * @generated
   */
  int PERSON = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__NAME = SOURCE__NAME;

  /**
   * The feature id for the '<em><b>Reliability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__RELIABILITY = SOURCE__RELIABILITY;

  /**
   * The feature id for the '<em><b>Certainty Degree</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__CERTAINTY_DEGREE = SOURCE__CERTAINTY_DEGREE;

  /**
   * The feature id for the '<em><b>Source Observations</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__SOURCE_OBSERVATIONS = SOURCE__SOURCE_OBSERVATIONS;

  /**
   * The feature id for the '<em><b>Organizational Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__ORGANIZATIONAL_UNIT = SOURCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__ROL = SOURCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Person</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link iArchimate.impl.ObservationImpl <em>Observation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iArchimate.impl.ObservationImpl
   * @see iArchimate.impl.IArchimatePackageImpl#getObservation()
   * @generated
   */
  int OBSERVATION = 15;

  /**
   * The feature id for the '<em><b>Id Observation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBSERVATION__ID_OBSERVATION = 0;

  /**
   * The feature id for the '<em><b>Reference Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBSERVATION__REFERENCE_DATE = 1;

  /**
   * The feature id for the '<em><b>Observation Facts</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBSERVATION__OBSERVATION_FACTS = 2;

  /**
   * The feature id for the '<em><b>Belongs To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBSERVATION__BELONGS_TO = 3;

  /**
   * The number of structural features of the '<em>Observation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBSERVATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link iArchimate.impl.FactImpl <em>Fact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iArchimate.impl.FactImpl
   * @see iArchimate.impl.IArchimatePackageImpl#getFact()
   * @generated
   */
  int FACT = 16;

  /**
   * The feature id for the '<em><b>Is Fact Of</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT__IS_FACT_OF = 0;

  /**
   * The feature id for the '<em><b>Id Fact</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT__ID_FACT = 1;

  /**
   * The feature id for the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT__ELEMENT = 2;

  /**
   * The number of structural features of the '<em>Fact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link iArchimate.impl.InstanceFactImpl <em>Instance Fact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iArchimate.impl.InstanceFactImpl
   * @see iArchimate.impl.IArchimatePackageImpl#getInstanceFact()
   * @generated
   */
  int INSTANCE_FACT = 17;

  /**
   * The feature id for the '<em><b>Is Fact Of</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_FACT__IS_FACT_OF = FACT__IS_FACT_OF;

  /**
   * The feature id for the '<em><b>Id Fact</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_FACT__ID_FACT = FACT__ID_FACT;

  /**
   * The feature id for the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_FACT__ELEMENT = FACT__ELEMENT;

  /**
   * The feature id for the '<em><b>Exist</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_FACT__EXIST = FACT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Instance Fact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_FACT_FEATURE_COUNT = FACT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link iArchimate.impl.AttributeFactImpl <em>Attribute Fact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iArchimate.impl.AttributeFactImpl
   * @see iArchimate.impl.IArchimatePackageImpl#getAttributeFact()
   * @generated
   */
  int ATTRIBUTE_FACT = 18;

  /**
   * The feature id for the '<em><b>Is Fact Of</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FACT__IS_FACT_OF = FACT__IS_FACT_OF;

  /**
   * The feature id for the '<em><b>Id Fact</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FACT__ID_FACT = FACT__ID_FACT;

  /**
   * The feature id for the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FACT__ELEMENT = FACT__ELEMENT;

  /**
   * The feature id for the '<em><b>Att Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FACT__ATT_NAME = FACT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Att Value</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FACT__ATT_VALUE = FACT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Attribute Fact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FACT_FEATURE_COUNT = FACT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link iArchimate.impl.RelationFactImpl <em>Relation Fact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iArchimate.impl.RelationFactImpl
   * @see iArchimate.impl.IArchimatePackageImpl#getRelationFact()
   * @generated
   */
  int RELATION_FACT = 19;

  /**
   * The feature id for the '<em><b>Is Fact Of</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_FACT__IS_FACT_OF = FACT__IS_FACT_OF;

  /**
   * The feature id for the '<em><b>Id Fact</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_FACT__ID_FACT = FACT__ID_FACT;

  /**
   * The feature id for the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_FACT__ELEMENT = FACT__ELEMENT;

  /**
   * The feature id for the '<em><b>Rel Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_FACT__REL_NAME = FACT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rel Value</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_FACT__REL_VALUE = FACT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Relation Fact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_FACT_FEATURE_COUNT = FACT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link iArchimate.impl.DecisionImpl <em>Decision</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iArchimate.impl.DecisionImpl
   * @see iArchimate.impl.IArchimatePackageImpl#getDecision()
   * @generated
   */
  int DECISION = 20;

  /**
   * The feature id for the '<em><b>Id Decision</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION__ID_DECISION = 0;

  /**
   * The feature id for the '<em><b>Result</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION__RESULT = 1;

  /**
   * The feature id for the '<em><b>Decision Facts</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION__DECISION_FACTS = 2;

  /**
   * The number of structural features of the '<em>Decision</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link iArchimate.AttributeTypeValue <em>Attribute Type Value</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iArchimate.AttributeTypeValue
   * @see iArchimate.impl.IArchimatePackageImpl#getAttributeTypeValue()
   * @generated
   */
  int ATTRIBUTE_TYPE_VALUE = 21;

  /**
   * The meta object id for the '{@link iArchimate.ImperfectAttributeTypeValue <em>Imperfect Attribute Type Value</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iArchimate.ImperfectAttributeTypeValue
   * @see iArchimate.impl.IArchimatePackageImpl#getImperfectAttributeTypeValue()
   * @generated
   */
  int IMPERFECT_ATTRIBUTE_TYPE_VALUE = 22;

  /**
   * The meta object id for the '{@link iArchimate.ImperfectRelationType <em>Imperfect Relation Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iArchimate.ImperfectRelationType
   * @see iArchimate.impl.IArchimatePackageImpl#getImperfectRelationType()
   * @generated
   */
  int IMPERFECT_RELATION_TYPE = 23;

  /**
   * The meta object id for the '{@link iArchimate.ElementTypeName <em>Element Type Name</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iArchimate.ElementTypeName
   * @see iArchimate.impl.IArchimatePackageImpl#getElementTypeName()
   * @generated
   */
  int ELEMENT_TYPE_NAME = 24;

  /**
   * The meta object id for the '{@link iArchimate.RelationTypeName <em>Relation Type Name</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iArchimate.RelationTypeName
   * @see iArchimate.impl.IArchimatePackageImpl#getRelationTypeName()
   * @generated
   */
  int RELATION_TYPE_NAME = 25;


  /**
   * Returns the meta object for class '{@link iArchimate.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see iArchimate.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link iArchimate.Model#getRelations <em>Relations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relations</em>'.
   * @see iArchimate.Model#getRelations()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Relations();

  /**
   * Returns the meta object for the containment reference list '{@link iArchimate.Model#getDecisionTraces <em>Decision Traces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decision Traces</em>'.
   * @see iArchimate.Model#getDecisionTraces()
   * @see #getModel()
   * @generated
   */
  EReference getModel_DecisionTraces();

  /**
   * Returns the meta object for the containment reference list '{@link iArchimate.Model#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see iArchimate.Model#getComponents()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Components();

  /**
   * Returns the meta object for class '{@link iArchimate.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see iArchimate.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the attribute '{@link iArchimate.Component#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see iArchimate.Component#getName()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Name();

  /**
   * Returns the meta object for the containment reference list '{@link iArchimate.Component#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see iArchimate.Component#getComponents()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Components();

  /**
   * Returns the meta object for class '{@link iArchimate.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group</em>'.
   * @see iArchimate.Group
   * @generated
   */
  EClass getGroup();

  /**
   * Returns the meta object for class '{@link iArchimate.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see iArchimate.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the attribute '{@link iArchimate.Element#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Name</em>'.
   * @see iArchimate.Element#getTypeName()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_TypeName();

  /**
   * Returns the meta object for the containment reference list '{@link iArchimate.Element#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see iArchimate.Element#getAttributes()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Attributes();

  /**
   * Returns the meta object for the reference list '{@link iArchimate.Element#getRelations <em>Relations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Relations</em>'.
   * @see iArchimate.Element#getRelations()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Relations();

  /**
   * Returns the meta object for the reference '{@link iArchimate.Element#getElementDecisionTrace <em>Element Decision Trace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element Decision Trace</em>'.
   * @see iArchimate.Element#getElementDecisionTrace()
   * @see #getElement()
   * @generated
   */
  EReference getElement_ElementDecisionTrace();

  /**
   * Returns the meta object for class '{@link iArchimate.AbsentElement <em>Absent Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Absent Element</em>'.
   * @see iArchimate.AbsentElement
   * @generated
   */
  EClass getAbsentElement();

  /**
   * Returns the meta object for class '{@link iArchimate.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see iArchimate.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link iArchimate.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see iArchimate.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link iArchimate.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see iArchimate.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link iArchimate.Attribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see iArchimate.Attribute#getValue()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Value();

  /**
   * Returns the meta object for class '{@link iArchimate.ImperfectAttribute <em>Imperfect Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Imperfect Attribute</em>'.
   * @see iArchimate.ImperfectAttribute
   * @generated
   */
  EClass getImperfectAttribute();

  /**
   * Returns the meta object for the attribute '{@link iArchimate.ImperfectAttribute#getImperfectionType <em>Imperfection Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imperfection Type</em>'.
   * @see iArchimate.ImperfectAttribute#getImperfectionType()
   * @see #getImperfectAttribute()
   * @generated
   */
  EAttribute getImperfectAttribute_ImperfectionType();

  /**
   * Returns the meta object for class '{@link iArchimate.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation</em>'.
   * @see iArchimate.Relation
   * @generated
   */
  EClass getRelation();

  /**
   * Returns the meta object for the reference '{@link iArchimate.Relation#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see iArchimate.Relation#getSource()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Source();

  /**
   * Returns the meta object for the reference '{@link iArchimate.Relation#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see iArchimate.Relation#getTarget()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Target();

  /**
   * Returns the meta object for the attribute '{@link iArchimate.Relation#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Name</em>'.
   * @see iArchimate.Relation#getTypeName()
   * @see #getRelation()
   * @generated
   */
  EAttribute getRelation_TypeName();

  /**
   * Returns the meta object for the attribute '{@link iArchimate.Relation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see iArchimate.Relation#getName()
   * @see #getRelation()
   * @generated
   */
  EAttribute getRelation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link iArchimate.Relation#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see iArchimate.Relation#getAttributes()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Attributes();

  /**
   * Returns the meta object for class '{@link iArchimate.ImperfectRelation <em>Imperfect Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Imperfect Relation</em>'.
   * @see iArchimate.ImperfectRelation
   * @generated
   */
  EClass getImperfectRelation();

  /**
   * Returns the meta object for the attribute '{@link iArchimate.ImperfectRelation#getImperfectionType <em>Imperfection Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imperfection Type</em>'.
   * @see iArchimate.ImperfectRelation#getImperfectionType()
   * @see #getImperfectRelation()
   * @generated
   */
  EAttribute getImperfectRelation_ImperfectionType();

  /**
   * Returns the meta object for the attribute '{@link iArchimate.ImperfectRelation#getCertaintyDegree <em>Certainty Degree</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Certainty Degree</em>'.
   * @see iArchimate.ImperfectRelation#getCertaintyDegree()
   * @see #getImperfectRelation()
   * @generated
   */
  EAttribute getImperfectRelation_CertaintyDegree();

  /**
   * Returns the meta object for class '{@link iArchimate.DecisionTrace <em>Decision Trace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decision Trace</em>'.
   * @see iArchimate.DecisionTrace
   * @generated
   */
  EClass getDecisionTrace();

  /**
   * Returns the meta object for the attribute '{@link iArchimate.DecisionTrace#getIdDecisionTrace <em>Id Decision Trace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id Decision Trace</em>'.
   * @see iArchimate.DecisionTrace#getIdDecisionTrace()
   * @see #getDecisionTrace()
   * @generated
   */
  EAttribute getDecisionTrace_IdDecisionTrace();

  /**
   * Returns the meta object for the containment reference list '{@link iArchimate.DecisionTrace#getDecisions <em>Decisions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decisions</em>'.
   * @see iArchimate.DecisionTrace#getDecisions()
   * @see #getDecisionTrace()
   * @generated
   */
  EReference getDecisionTrace_Decisions();

  /**
   * Returns the meta object for the containment reference list '{@link iArchimate.DecisionTrace#getFacts <em>Facts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Facts</em>'.
   * @see iArchimate.DecisionTrace#getFacts()
   * @see #getDecisionTrace()
   * @generated
   */
  EReference getDecisionTrace_Facts();

  /**
   * Returns the meta object for the containment reference list '{@link iArchimate.DecisionTrace#getObservations <em>Observations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Observations</em>'.
   * @see iArchimate.DecisionTrace#getObservations()
   * @see #getDecisionTrace()
   * @generated
   */
  EReference getDecisionTrace_Observations();

  /**
   * Returns the meta object for the containment reference list '{@link iArchimate.DecisionTrace#getSources <em>Sources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sources</em>'.
   * @see iArchimate.DecisionTrace#getSources()
   * @see #getDecisionTrace()
   * @generated
   */
  EReference getDecisionTrace_Sources();

  /**
   * Returns the meta object for class '{@link iArchimate.Source <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Source</em>'.
   * @see iArchimate.Source
   * @generated
   */
  EClass getSource();

  /**
   * Returns the meta object for the attribute '{@link iArchimate.Source#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see iArchimate.Source#getName()
   * @see #getSource()
   * @generated
   */
  EAttribute getSource_Name();

  /**
   * Returns the meta object for the attribute '{@link iArchimate.Source#getReliability <em>Reliability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reliability</em>'.
   * @see iArchimate.Source#getReliability()
   * @see #getSource()
   * @generated
   */
  EAttribute getSource_Reliability();

  /**
   * Returns the meta object for the attribute '{@link iArchimate.Source#getCertaintyDegree <em>Certainty Degree</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Certainty Degree</em>'.
   * @see iArchimate.Source#getCertaintyDegree()
   * @see #getSource()
   * @generated
   */
  EAttribute getSource_CertaintyDegree();

  /**
   * Returns the meta object for the reference list '{@link iArchimate.Source#getSourceObservations <em>Source Observations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Source Observations</em>'.
   * @see iArchimate.Source#getSourceObservations()
   * @see #getSource()
   * @generated
   */
  EReference getSource_SourceObservations();

  /**
   * Returns the meta object for class '{@link iArchimate.DirectObservation <em>Direct Observation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Direct Observation</em>'.
   * @see iArchimate.DirectObservation
   * @generated
   */
  EClass getDirectObservation();

  /**
   * Returns the meta object for class '{@link iArchimate.Meeting <em>Meeting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Meeting</em>'.
   * @see iArchimate.Meeting
   * @generated
   */
  EClass getMeeting();

  /**
   * Returns the meta object for the attribute '{@link iArchimate.Meeting#getMinuteNumber <em>Minute Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minute Number</em>'.
   * @see iArchimate.Meeting#getMinuteNumber()
   * @see #getMeeting()
   * @generated
   */
  EAttribute getMeeting_MinuteNumber();

  /**
   * Returns the meta object for the reference list '{@link iArchimate.Meeting#getMeetingParticipants <em>Meeting Participants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Meeting Participants</em>'.
   * @see iArchimate.Meeting#getMeetingParticipants()
   * @see #getMeeting()
   * @generated
   */
  EReference getMeeting_MeetingParticipants();

  /**
   * Returns the meta object for class '{@link iArchimate.Document <em>Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document</em>'.
   * @see iArchimate.Document
   * @generated
   */
  EClass getDocument();

  /**
   * Returns the meta object for the attribute '{@link iArchimate.Document#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see iArchimate.Document#getVersion()
   * @see #getDocument()
   * @generated
   */
  EAttribute getDocument_Version();

  /**
   * Returns the meta object for the attribute '{@link iArchimate.Document#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see iArchimate.Document#getDescription()
   * @see #getDocument()
   * @generated
   */
  EAttribute getDocument_Description();

  /**
   * Returns the meta object for class '{@link iArchimate.Person <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Person</em>'.
   * @see iArchimate.Person
   * @generated
   */
  EClass getPerson();

  /**
   * Returns the meta object for the attribute '{@link iArchimate.Person#getOrganizationalUnit <em>Organizational Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Organizational Unit</em>'.
   * @see iArchimate.Person#getOrganizationalUnit()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_OrganizationalUnit();

  /**
   * Returns the meta object for the attribute '{@link iArchimate.Person#getRol <em>Rol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rol</em>'.
   * @see iArchimate.Person#getRol()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_Rol();

  /**
   * Returns the meta object for class '{@link iArchimate.Observation <em>Observation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Observation</em>'.
   * @see iArchimate.Observation
   * @generated
   */
  EClass getObservation();

  /**
   * Returns the meta object for the attribute '{@link iArchimate.Observation#getIdObservation <em>Id Observation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id Observation</em>'.
   * @see iArchimate.Observation#getIdObservation()
   * @see #getObservation()
   * @generated
   */
  EAttribute getObservation_IdObservation();

  /**
   * Returns the meta object for the attribute '{@link iArchimate.Observation#getReferenceDate <em>Reference Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference Date</em>'.
   * @see iArchimate.Observation#getReferenceDate()
   * @see #getObservation()
   * @generated
   */
  EAttribute getObservation_ReferenceDate();

  /**
   * Returns the meta object for the reference list '{@link iArchimate.Observation#getObservationFacts <em>Observation Facts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Observation Facts</em>'.
   * @see iArchimate.Observation#getObservationFacts()
   * @see #getObservation()
   * @generated
   */
  EReference getObservation_ObservationFacts();

  /**
   * Returns the meta object for the reference '{@link iArchimate.Observation#getBelongsTo <em>Belongs To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Belongs To</em>'.
   * @see iArchimate.Observation#getBelongsTo()
   * @see #getObservation()
   * @generated
   */
  EReference getObservation_BelongsTo();

  /**
   * Returns the meta object for class '{@link iArchimate.Fact <em>Fact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fact</em>'.
   * @see iArchimate.Fact
   * @generated
   */
  EClass getFact();

  /**
   * Returns the meta object for the reference list '{@link iArchimate.Fact#getIsFactOf <em>Is Fact Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Is Fact Of</em>'.
   * @see iArchimate.Fact#getIsFactOf()
   * @see #getFact()
   * @generated
   */
  EReference getFact_IsFactOf();

  /**
   * Returns the meta object for the attribute '{@link iArchimate.Fact#getIdFact <em>Id Fact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id Fact</em>'.
   * @see iArchimate.Fact#getIdFact()
   * @see #getFact()
   * @generated
   */
  EAttribute getFact_IdFact();

  /**
   * Returns the meta object for the attribute '{@link iArchimate.Fact#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Element</em>'.
   * @see iArchimate.Fact#getElement()
   * @see #getFact()
   * @generated
   */
  EAttribute getFact_Element();

  /**
   * Returns the meta object for class '{@link iArchimate.InstanceFact <em>Instance Fact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Fact</em>'.
   * @see iArchimate.InstanceFact
   * @generated
   */
  EClass getInstanceFact();

  /**
   * Returns the meta object for the attribute '{@link iArchimate.InstanceFact#isExist <em>Exist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exist</em>'.
   * @see iArchimate.InstanceFact#isExist()
   * @see #getInstanceFact()
   * @generated
   */
  EAttribute getInstanceFact_Exist();

  /**
   * Returns the meta object for class '{@link iArchimate.AttributeFact <em>Attribute Fact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Fact</em>'.
   * @see iArchimate.AttributeFact
   * @generated
   */
  EClass getAttributeFact();

  /**
   * Returns the meta object for the attribute '{@link iArchimate.AttributeFact#getAttName <em>Att Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Att Name</em>'.
   * @see iArchimate.AttributeFact#getAttName()
   * @see #getAttributeFact()
   * @generated
   */
  EAttribute getAttributeFact_AttName();

  /**
   * Returns the meta object for the attribute list '{@link iArchimate.AttributeFact#getAttValue <em>Att Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Att Value</em>'.
   * @see iArchimate.AttributeFact#getAttValue()
   * @see #getAttributeFact()
   * @generated
   */
  EAttribute getAttributeFact_AttValue();

  /**
   * Returns the meta object for class '{@link iArchimate.RelationFact <em>Relation Fact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Fact</em>'.
   * @see iArchimate.RelationFact
   * @generated
   */
  EClass getRelationFact();

  /**
   * Returns the meta object for the attribute '{@link iArchimate.RelationFact#getRelName <em>Rel Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rel Name</em>'.
   * @see iArchimate.RelationFact#getRelName()
   * @see #getRelationFact()
   * @generated
   */
  EAttribute getRelationFact_RelName();

  /**
   * Returns the meta object for the attribute list '{@link iArchimate.RelationFact#getRelValue <em>Rel Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Rel Value</em>'.
   * @see iArchimate.RelationFact#getRelValue()
   * @see #getRelationFact()
   * @generated
   */
  EAttribute getRelationFact_RelValue();

  /**
   * Returns the meta object for class '{@link iArchimate.Decision <em>Decision</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decision</em>'.
   * @see iArchimate.Decision
   * @generated
   */
  EClass getDecision();

  /**
   * Returns the meta object for the attribute '{@link iArchimate.Decision#getIdDecision <em>Id Decision</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id Decision</em>'.
   * @see iArchimate.Decision#getIdDecision()
   * @see #getDecision()
   * @generated
   */
  EAttribute getDecision_IdDecision();

  /**
   * Returns the meta object for the attribute list '{@link iArchimate.Decision#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Result</em>'.
   * @see iArchimate.Decision#getResult()
   * @see #getDecision()
   * @generated
   */
  EAttribute getDecision_Result();

  /**
   * Returns the meta object for the reference list '{@link iArchimate.Decision#getDecisionFacts <em>Decision Facts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Decision Facts</em>'.
   * @see iArchimate.Decision#getDecisionFacts()
   * @see #getDecision()
   * @generated
   */
  EReference getDecision_DecisionFacts();

  /**
   * Returns the meta object for enum '{@link iArchimate.AttributeTypeValue <em>Attribute Type Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Attribute Type Value</em>'.
   * @see iArchimate.AttributeTypeValue
   * @generated
   */
  EEnum getAttributeTypeValue();

  /**
   * Returns the meta object for enum '{@link iArchimate.ImperfectAttributeTypeValue <em>Imperfect Attribute Type Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Imperfect Attribute Type Value</em>'.
   * @see iArchimate.ImperfectAttributeTypeValue
   * @generated
   */
  EEnum getImperfectAttributeTypeValue();

  /**
   * Returns the meta object for enum '{@link iArchimate.ImperfectRelationType <em>Imperfect Relation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Imperfect Relation Type</em>'.
   * @see iArchimate.ImperfectRelationType
   * @generated
   */
  EEnum getImperfectRelationType();

  /**
   * Returns the meta object for enum '{@link iArchimate.ElementTypeName <em>Element Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Element Type Name</em>'.
   * @see iArchimate.ElementTypeName
   * @generated
   */
  EEnum getElementTypeName();

  /**
   * Returns the meta object for enum '{@link iArchimate.RelationTypeName <em>Relation Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Relation Type Name</em>'.
   * @see iArchimate.RelationTypeName
   * @generated
   */
  EEnum getRelationTypeName();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  IArchimateFactory getIArchimateFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link iArchimate.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iArchimate.impl.ModelImpl
     * @see iArchimate.impl.IArchimatePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__RELATIONS = eINSTANCE.getModel_Relations();

    /**
     * The meta object literal for the '<em><b>Decision Traces</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DECISION_TRACES = eINSTANCE.getModel_DecisionTraces();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__COMPONENTS = eINSTANCE.getModel_Components();

    /**
     * The meta object literal for the '{@link iArchimate.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iArchimate.impl.ComponentImpl
     * @see iArchimate.impl.IArchimatePackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__COMPONENTS = eINSTANCE.getComponent_Components();

    /**
     * The meta object literal for the '{@link iArchimate.impl.GroupImpl <em>Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iArchimate.impl.GroupImpl
     * @see iArchimate.impl.IArchimatePackageImpl#getGroup()
     * @generated
     */
    EClass GROUP = eINSTANCE.getGroup();

    /**
     * The meta object literal for the '{@link iArchimate.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iArchimate.impl.ElementImpl
     * @see iArchimate.impl.IArchimatePackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__TYPE_NAME = eINSTANCE.getElement_TypeName();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__ATTRIBUTES = eINSTANCE.getElement_Attributes();

    /**
     * The meta object literal for the '<em><b>Relations</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__RELATIONS = eINSTANCE.getElement_Relations();

    /**
     * The meta object literal for the '<em><b>Element Decision Trace</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__ELEMENT_DECISION_TRACE = eINSTANCE.getElement_ElementDecisionTrace();

    /**
     * The meta object literal for the '{@link iArchimate.impl.AbsentElementImpl <em>Absent Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iArchimate.impl.AbsentElementImpl
     * @see iArchimate.impl.IArchimatePackageImpl#getAbsentElement()
     * @generated
     */
    EClass ABSENT_ELEMENT = eINSTANCE.getAbsentElement();

    /**
     * The meta object literal for the '{@link iArchimate.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iArchimate.impl.AttributeImpl
     * @see iArchimate.impl.IArchimatePackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

    /**
     * The meta object literal for the '{@link iArchimate.impl.ImperfectAttributeImpl <em>Imperfect Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iArchimate.impl.ImperfectAttributeImpl
     * @see iArchimate.impl.IArchimatePackageImpl#getImperfectAttribute()
     * @generated
     */
    EClass IMPERFECT_ATTRIBUTE = eINSTANCE.getImperfectAttribute();

    /**
     * The meta object literal for the '<em><b>Imperfection Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPERFECT_ATTRIBUTE__IMPERFECTION_TYPE = eINSTANCE.getImperfectAttribute_ImperfectionType();

    /**
     * The meta object literal for the '{@link iArchimate.impl.RelationImpl <em>Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iArchimate.impl.RelationImpl
     * @see iArchimate.impl.IArchimatePackageImpl#getRelation()
     * @generated
     */
    EClass RELATION = eINSTANCE.getRelation();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__SOURCE = eINSTANCE.getRelation_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__TARGET = eINSTANCE.getRelation_Target();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION__TYPE_NAME = eINSTANCE.getRelation_TypeName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION__NAME = eINSTANCE.getRelation_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__ATTRIBUTES = eINSTANCE.getRelation_Attributes();

    /**
     * The meta object literal for the '{@link iArchimate.impl.ImperfectRelationImpl <em>Imperfect Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iArchimate.impl.ImperfectRelationImpl
     * @see iArchimate.impl.IArchimatePackageImpl#getImperfectRelation()
     * @generated
     */
    EClass IMPERFECT_RELATION = eINSTANCE.getImperfectRelation();

    /**
     * The meta object literal for the '<em><b>Imperfection Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPERFECT_RELATION__IMPERFECTION_TYPE = eINSTANCE.getImperfectRelation_ImperfectionType();

    /**
     * The meta object literal for the '<em><b>Certainty Degree</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPERFECT_RELATION__CERTAINTY_DEGREE = eINSTANCE.getImperfectRelation_CertaintyDegree();

    /**
     * The meta object literal for the '{@link iArchimate.impl.DecisionTraceImpl <em>Decision Trace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iArchimate.impl.DecisionTraceImpl
     * @see iArchimate.impl.IArchimatePackageImpl#getDecisionTrace()
     * @generated
     */
    EClass DECISION_TRACE = eINSTANCE.getDecisionTrace();

    /**
     * The meta object literal for the '<em><b>Id Decision Trace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECISION_TRACE__ID_DECISION_TRACE = eINSTANCE.getDecisionTrace_IdDecisionTrace();

    /**
     * The meta object literal for the '<em><b>Decisions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECISION_TRACE__DECISIONS = eINSTANCE.getDecisionTrace_Decisions();

    /**
     * The meta object literal for the '<em><b>Facts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECISION_TRACE__FACTS = eINSTANCE.getDecisionTrace_Facts();

    /**
     * The meta object literal for the '<em><b>Observations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECISION_TRACE__OBSERVATIONS = eINSTANCE.getDecisionTrace_Observations();

    /**
     * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECISION_TRACE__SOURCES = eINSTANCE.getDecisionTrace_Sources();

    /**
     * The meta object literal for the '{@link iArchimate.impl.SourceImpl <em>Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iArchimate.impl.SourceImpl
     * @see iArchimate.impl.IArchimatePackageImpl#getSource()
     * @generated
     */
    EClass SOURCE = eINSTANCE.getSource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOURCE__NAME = eINSTANCE.getSource_Name();

    /**
     * The meta object literal for the '<em><b>Reliability</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOURCE__RELIABILITY = eINSTANCE.getSource_Reliability();

    /**
     * The meta object literal for the '<em><b>Certainty Degree</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOURCE__CERTAINTY_DEGREE = eINSTANCE.getSource_CertaintyDegree();

    /**
     * The meta object literal for the '<em><b>Source Observations</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOURCE__SOURCE_OBSERVATIONS = eINSTANCE.getSource_SourceObservations();

    /**
     * The meta object literal for the '{@link iArchimate.impl.DirectObservationImpl <em>Direct Observation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iArchimate.impl.DirectObservationImpl
     * @see iArchimate.impl.IArchimatePackageImpl#getDirectObservation()
     * @generated
     */
    EClass DIRECT_OBSERVATION = eINSTANCE.getDirectObservation();

    /**
     * The meta object literal for the '{@link iArchimate.impl.MeetingImpl <em>Meeting</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iArchimate.impl.MeetingImpl
     * @see iArchimate.impl.IArchimatePackageImpl#getMeeting()
     * @generated
     */
    EClass MEETING = eINSTANCE.getMeeting();

    /**
     * The meta object literal for the '<em><b>Minute Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEETING__MINUTE_NUMBER = eINSTANCE.getMeeting_MinuteNumber();

    /**
     * The meta object literal for the '<em><b>Meeting Participants</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEETING__MEETING_PARTICIPANTS = eINSTANCE.getMeeting_MeetingParticipants();

    /**
     * The meta object literal for the '{@link iArchimate.impl.DocumentImpl <em>Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iArchimate.impl.DocumentImpl
     * @see iArchimate.impl.IArchimatePackageImpl#getDocument()
     * @generated
     */
    EClass DOCUMENT = eINSTANCE.getDocument();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT__VERSION = eINSTANCE.getDocument_Version();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT__DESCRIPTION = eINSTANCE.getDocument_Description();

    /**
     * The meta object literal for the '{@link iArchimate.impl.PersonImpl <em>Person</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iArchimate.impl.PersonImpl
     * @see iArchimate.impl.IArchimatePackageImpl#getPerson()
     * @generated
     */
    EClass PERSON = eINSTANCE.getPerson();

    /**
     * The meta object literal for the '<em><b>Organizational Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__ORGANIZATIONAL_UNIT = eINSTANCE.getPerson_OrganizationalUnit();

    /**
     * The meta object literal for the '<em><b>Rol</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__ROL = eINSTANCE.getPerson_Rol();

    /**
     * The meta object literal for the '{@link iArchimate.impl.ObservationImpl <em>Observation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iArchimate.impl.ObservationImpl
     * @see iArchimate.impl.IArchimatePackageImpl#getObservation()
     * @generated
     */
    EClass OBSERVATION = eINSTANCE.getObservation();

    /**
     * The meta object literal for the '<em><b>Id Observation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBSERVATION__ID_OBSERVATION = eINSTANCE.getObservation_IdObservation();

    /**
     * The meta object literal for the '<em><b>Reference Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBSERVATION__REFERENCE_DATE = eINSTANCE.getObservation_ReferenceDate();

    /**
     * The meta object literal for the '<em><b>Observation Facts</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBSERVATION__OBSERVATION_FACTS = eINSTANCE.getObservation_ObservationFacts();

    /**
     * The meta object literal for the '<em><b>Belongs To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBSERVATION__BELONGS_TO = eINSTANCE.getObservation_BelongsTo();

    /**
     * The meta object literal for the '{@link iArchimate.impl.FactImpl <em>Fact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iArchimate.impl.FactImpl
     * @see iArchimate.impl.IArchimatePackageImpl#getFact()
     * @generated
     */
    EClass FACT = eINSTANCE.getFact();

    /**
     * The meta object literal for the '<em><b>Is Fact Of</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACT__IS_FACT_OF = eINSTANCE.getFact_IsFactOf();

    /**
     * The meta object literal for the '<em><b>Id Fact</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACT__ID_FACT = eINSTANCE.getFact_IdFact();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACT__ELEMENT = eINSTANCE.getFact_Element();

    /**
     * The meta object literal for the '{@link iArchimate.impl.InstanceFactImpl <em>Instance Fact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iArchimate.impl.InstanceFactImpl
     * @see iArchimate.impl.IArchimatePackageImpl#getInstanceFact()
     * @generated
     */
    EClass INSTANCE_FACT = eINSTANCE.getInstanceFact();

    /**
     * The meta object literal for the '<em><b>Exist</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE_FACT__EXIST = eINSTANCE.getInstanceFact_Exist();

    /**
     * The meta object literal for the '{@link iArchimate.impl.AttributeFactImpl <em>Attribute Fact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iArchimate.impl.AttributeFactImpl
     * @see iArchimate.impl.IArchimatePackageImpl#getAttributeFact()
     * @generated
     */
    EClass ATTRIBUTE_FACT = eINSTANCE.getAttributeFact();

    /**
     * The meta object literal for the '<em><b>Att Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_FACT__ATT_NAME = eINSTANCE.getAttributeFact_AttName();

    /**
     * The meta object literal for the '<em><b>Att Value</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_FACT__ATT_VALUE = eINSTANCE.getAttributeFact_AttValue();

    /**
     * The meta object literal for the '{@link iArchimate.impl.RelationFactImpl <em>Relation Fact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iArchimate.impl.RelationFactImpl
     * @see iArchimate.impl.IArchimatePackageImpl#getRelationFact()
     * @generated
     */
    EClass RELATION_FACT = eINSTANCE.getRelationFact();

    /**
     * The meta object literal for the '<em><b>Rel Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION_FACT__REL_NAME = eINSTANCE.getRelationFact_RelName();

    /**
     * The meta object literal for the '<em><b>Rel Value</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION_FACT__REL_VALUE = eINSTANCE.getRelationFact_RelValue();

    /**
     * The meta object literal for the '{@link iArchimate.impl.DecisionImpl <em>Decision</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iArchimate.impl.DecisionImpl
     * @see iArchimate.impl.IArchimatePackageImpl#getDecision()
     * @generated
     */
    EClass DECISION = eINSTANCE.getDecision();

    /**
     * The meta object literal for the '<em><b>Id Decision</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECISION__ID_DECISION = eINSTANCE.getDecision_IdDecision();

    /**
     * The meta object literal for the '<em><b>Result</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECISION__RESULT = eINSTANCE.getDecision_Result();

    /**
     * The meta object literal for the '<em><b>Decision Facts</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECISION__DECISION_FACTS = eINSTANCE.getDecision_DecisionFacts();

    /**
     * The meta object literal for the '{@link iArchimate.AttributeTypeValue <em>Attribute Type Value</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iArchimate.AttributeTypeValue
     * @see iArchimate.impl.IArchimatePackageImpl#getAttributeTypeValue()
     * @generated
     */
    EEnum ATTRIBUTE_TYPE_VALUE = eINSTANCE.getAttributeTypeValue();

    /**
     * The meta object literal for the '{@link iArchimate.ImperfectAttributeTypeValue <em>Imperfect Attribute Type Value</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iArchimate.ImperfectAttributeTypeValue
     * @see iArchimate.impl.IArchimatePackageImpl#getImperfectAttributeTypeValue()
     * @generated
     */
    EEnum IMPERFECT_ATTRIBUTE_TYPE_VALUE = eINSTANCE.getImperfectAttributeTypeValue();

    /**
     * The meta object literal for the '{@link iArchimate.ImperfectRelationType <em>Imperfect Relation Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iArchimate.ImperfectRelationType
     * @see iArchimate.impl.IArchimatePackageImpl#getImperfectRelationType()
     * @generated
     */
    EEnum IMPERFECT_RELATION_TYPE = eINSTANCE.getImperfectRelationType();

    /**
     * The meta object literal for the '{@link iArchimate.ElementTypeName <em>Element Type Name</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iArchimate.ElementTypeName
     * @see iArchimate.impl.IArchimatePackageImpl#getElementTypeName()
     * @generated
     */
    EEnum ELEMENT_TYPE_NAME = eINSTANCE.getElementTypeName();

    /**
     * The meta object literal for the '{@link iArchimate.RelationTypeName <em>Relation Type Name</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iArchimate.RelationTypeName
     * @see iArchimate.impl.IArchimatePackageImpl#getRelationTypeName()
     * @generated
     */
    EEnum RELATION_TYPE_NAME = eINSTANCE.getRelationTypeName();

  }

} //IArchimatePackage
