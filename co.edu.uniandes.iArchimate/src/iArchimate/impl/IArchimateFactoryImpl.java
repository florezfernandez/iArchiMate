/**
 */
package iArchimate.impl;

import iArchimate.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IArchimateFactoryImpl extends EFactoryImpl implements IArchimateFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static IArchimateFactory init()
  {
    try
    {
      IArchimateFactory theIArchimateFactory = (IArchimateFactory)EPackage.Registry.INSTANCE.getEFactory(IArchimatePackage.eNS_URI);
      if (theIArchimateFactory != null)
      {
        return theIArchimateFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new IArchimateFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IArchimateFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case IArchimatePackage.MODEL: return createModel();
      case IArchimatePackage.GROUP: return createGroup();
      case IArchimatePackage.ELEMENT: return createElement();
      case IArchimatePackage.ABSENT_ELEMENT: return createAbsentElement();
      case IArchimatePackage.ATTRIBUTE: return createAttribute();
      case IArchimatePackage.IMPERFECT_ATTRIBUTE: return createImperfectAttribute();
      case IArchimatePackage.RELATION: return createRelation();
      case IArchimatePackage.IMPERFECT_RELATION: return createImperfectRelation();
      case IArchimatePackage.DECISION_TRACE: return createDecisionTrace();
      case IArchimatePackage.DIRECT_OBSERVATION: return createDirectObservation();
      case IArchimatePackage.MEETING: return createMeeting();
      case IArchimatePackage.DOCUMENT: return createDocument();
      case IArchimatePackage.PERSON: return createPerson();
      case IArchimatePackage.OBSERVATION: return createObservation();
      case IArchimatePackage.FACT: return createFact();
      case IArchimatePackage.INSTANCE_FACT: return createInstanceFact();
      case IArchimatePackage.ATTRIBUTE_FACT: return createAttributeFact();
      case IArchimatePackage.RELATION_FACT: return createRelationFact();
      case IArchimatePackage.DECISION: return createDecision();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case IArchimatePackage.ATTRIBUTE_TYPE_VALUE:
        return createAttributeTypeValueFromString(eDataType, initialValue);
      case IArchimatePackage.IMPERFECT_ATTRIBUTE_TYPE_VALUE:
        return createImperfectAttributeTypeValueFromString(eDataType, initialValue);
      case IArchimatePackage.IMPERFECT_RELATION_TYPE:
        return createImperfectRelationTypeFromString(eDataType, initialValue);
      case IArchimatePackage.ELEMENT_TYPE_NAME:
        return createElementTypeNameFromString(eDataType, initialValue);
      case IArchimatePackage.RELATION_TYPE_NAME:
        return createRelationTypeNameFromString(eDataType, initialValue);
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
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case IArchimatePackage.ATTRIBUTE_TYPE_VALUE:
        return convertAttributeTypeValueToString(eDataType, instanceValue);
      case IArchimatePackage.IMPERFECT_ATTRIBUTE_TYPE_VALUE:
        return convertImperfectAttributeTypeValueToString(eDataType, instanceValue);
      case IArchimatePackage.IMPERFECT_RELATION_TYPE:
        return convertImperfectRelationTypeToString(eDataType, instanceValue);
      case IArchimatePackage.ELEMENT_TYPE_NAME:
        return convertElementTypeNameToString(eDataType, instanceValue);
      case IArchimatePackage.RELATION_TYPE_NAME:
        return convertRelationTypeNameToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Group createGroup()
  {
    GroupImpl group = new GroupImpl();
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbsentElement createAbsentElement()
  {
    AbsentElementImpl absentElement = new AbsentElementImpl();
    return absentElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImperfectAttribute createImperfectAttribute()
  {
    ImperfectAttributeImpl imperfectAttribute = new ImperfectAttributeImpl();
    return imperfectAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relation createRelation()
  {
    RelationImpl relation = new RelationImpl();
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImperfectRelation createImperfectRelation()
  {
    ImperfectRelationImpl imperfectRelation = new ImperfectRelationImpl();
    return imperfectRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecisionTrace createDecisionTrace()
  {
    DecisionTraceImpl decisionTrace = new DecisionTraceImpl();
    return decisionTrace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirectObservation createDirectObservation()
  {
    DirectObservationImpl directObservation = new DirectObservationImpl();
    return directObservation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Meeting createMeeting()
  {
    MeetingImpl meeting = new MeetingImpl();
    return meeting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Document createDocument()
  {
    DocumentImpl document = new DocumentImpl();
    return document;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Person createPerson()
  {
    PersonImpl person = new PersonImpl();
    return person;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Observation createObservation()
  {
    ObservationImpl observation = new ObservationImpl();
    return observation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fact createFact()
  {
    FactImpl fact = new FactImpl();
    return fact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceFact createInstanceFact()
  {
    InstanceFactImpl instanceFact = new InstanceFactImpl();
    return instanceFact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeFact createAttributeFact()
  {
    AttributeFactImpl attributeFact = new AttributeFactImpl();
    return attributeFact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationFact createRelationFact()
  {
    RelationFactImpl relationFact = new RelationFactImpl();
    return relationFact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Decision createDecision()
  {
    DecisionImpl decision = new DecisionImpl();
    return decision;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeTypeValue createAttributeTypeValueFromString(EDataType eDataType, String initialValue)
  {
    AttributeTypeValue result = AttributeTypeValue.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAttributeTypeValueToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImperfectAttributeTypeValue createImperfectAttributeTypeValueFromString(EDataType eDataType, String initialValue)
  {
    ImperfectAttributeTypeValue result = ImperfectAttributeTypeValue.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertImperfectAttributeTypeValueToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImperfectRelationType createImperfectRelationTypeFromString(EDataType eDataType, String initialValue)
  {
    ImperfectRelationType result = ImperfectRelationType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertImperfectRelationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementTypeName createElementTypeNameFromString(EDataType eDataType, String initialValue)
  {
    ElementTypeName result = ElementTypeName.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertElementTypeNameToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationTypeName createRelationTypeNameFromString(EDataType eDataType, String initialValue)
  {
    RelationTypeName result = RelationTypeName.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRelationTypeNameToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IArchimatePackage getIArchimatePackage()
  {
    return (IArchimatePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static IArchimatePackage getPackage()
  {
    return IArchimatePackage.eINSTANCE;
  }

} //IArchimateFactoryImpl
