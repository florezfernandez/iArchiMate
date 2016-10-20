/**
 */
package iArchimate.impl;

import iArchimate.AbsentElement;
import iArchimate.Attribute;
import iArchimate.AttributeFact;
import iArchimate.AttributeTypeValue;
import iArchimate.Component;
import iArchimate.Decision;
import iArchimate.DecisionTrace;
import iArchimate.DirectObservation;
import iArchimate.Document;
import iArchimate.Element;
import iArchimate.ElementTypeName;
import iArchimate.Fact;
import iArchimate.Group;
import iArchimate.IArchimateFactory;
import iArchimate.IArchimatePackage;
import iArchimate.ImperfectAttribute;
import iArchimate.ImperfectAttributeTypeValue;
import iArchimate.ImperfectRelation;
import iArchimate.ImperfectRelationType;
import iArchimate.InstanceFact;
import iArchimate.Meeting;
import iArchimate.Model;
import iArchimate.Observation;
import iArchimate.Person;
import iArchimate.Relation;
import iArchimate.RelationFact;
import iArchimate.RelationTypeName;
import iArchimate.Source;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IArchimatePackageImpl extends EPackageImpl implements IArchimatePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass absentElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imperfectAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imperfectRelationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass decisionTraceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass directObservationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass meetingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass documentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass personEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass observationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass factEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instanceFactEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeFactEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationFactEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass decisionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum attributeTypeValueEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum imperfectAttributeTypeValueEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum imperfectRelationTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum elementTypeNameEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum relationTypeNameEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see iArchimate.IArchimatePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private IArchimatePackageImpl()
  {
    super(eNS_URI, IArchimateFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link IArchimatePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static IArchimatePackage init()
  {
    if (isInited) return (IArchimatePackage)EPackage.Registry.INSTANCE.getEPackage(IArchimatePackage.eNS_URI);

    // Obtain or create and register package
    IArchimatePackageImpl theIArchimatePackage = (IArchimatePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IArchimatePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IArchimatePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theIArchimatePackage.createPackageContents();

    // Initialize created meta-data
    theIArchimatePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theIArchimatePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(IArchimatePackage.eNS_URI, theIArchimatePackage);
    return theIArchimatePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Relations()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_DecisionTraces()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Components()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponent()
  {
    return componentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponent_Name()
  {
    return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_Components()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroup()
  {
    return groupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElement()
  {
    return elementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElement_TypeName()
  {
    return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElement_Attributes()
  {
    return (EReference)elementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElement_Relations()
  {
    return (EReference)elementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElement_ElementDecisionTrace()
  {
    return (EReference)elementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbsentElement()
  {
    return absentElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Name()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Type()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Value()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImperfectAttribute()
  {
    return imperfectAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImperfectAttribute_ImperfectionType()
  {
    return (EAttribute)imperfectAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelation()
  {
    return relationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_Source()
  {
    return (EReference)relationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_Target()
  {
    return (EReference)relationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelation_TypeName()
  {
    return (EAttribute)relationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelation_Name()
  {
    return (EAttribute)relationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_Attributes()
  {
    return (EReference)relationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImperfectRelation()
  {
    return imperfectRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImperfectRelation_ImperfectionType()
  {
    return (EAttribute)imperfectRelationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImperfectRelation_CertaintyDegree()
  {
    return (EAttribute)imperfectRelationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDecisionTrace()
  {
    return decisionTraceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDecisionTrace_IdDecisionTrace()
  {
    return (EAttribute)decisionTraceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionTrace_Decisions()
  {
    return (EReference)decisionTraceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionTrace_Facts()
  {
    return (EReference)decisionTraceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionTrace_Observations()
  {
    return (EReference)decisionTraceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionTrace_Sources()
  {
    return (EReference)decisionTraceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSource()
  {
    return sourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSource_Name()
  {
    return (EAttribute)sourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSource_Reliability()
  {
    return (EAttribute)sourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSource_CertaintyDegree()
  {
    return (EAttribute)sourceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSource_SourceObservations()
  {
    return (EReference)sourceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDirectObservation()
  {
    return directObservationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMeeting()
  {
    return meetingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMeeting_MinuteNumber()
  {
    return (EAttribute)meetingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMeeting_MeetingParticipants()
  {
    return (EReference)meetingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocument()
  {
    return documentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocument_Version()
  {
    return (EAttribute)documentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocument_Description()
  {
    return (EAttribute)documentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPerson()
  {
    return personEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerson_OrganizationalUnit()
  {
    return (EAttribute)personEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerson_Rol()
  {
    return (EAttribute)personEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObservation()
  {
    return observationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObservation_IdObservation()
  {
    return (EAttribute)observationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObservation_ReferenceDate()
  {
    return (EAttribute)observationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObservation_ObservationFacts()
  {
    return (EReference)observationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObservation_BelongsTo()
  {
    return (EReference)observationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFact()
  {
    return factEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFact_IsFactOf()
  {
    return (EReference)factEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFact_IdFact()
  {
    return (EAttribute)factEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFact_Element()
  {
    return (EAttribute)factEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstanceFact()
  {
    return instanceFactEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstanceFact_Exist()
  {
    return (EAttribute)instanceFactEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeFact()
  {
    return attributeFactEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeFact_AttName()
  {
    return (EAttribute)attributeFactEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeFact_AttValue()
  {
    return (EAttribute)attributeFactEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationFact()
  {
    return relationFactEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationFact_RelName()
  {
    return (EAttribute)relationFactEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationFact_RelValue()
  {
    return (EAttribute)relationFactEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDecision()
  {
    return decisionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDecision_IdDecision()
  {
    return (EAttribute)decisionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDecision_Result()
  {
    return (EAttribute)decisionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecision_DecisionFacts()
  {
    return (EReference)decisionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAttributeTypeValue()
  {
    return attributeTypeValueEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getImperfectAttributeTypeValue()
  {
    return imperfectAttributeTypeValueEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getImperfectRelationType()
  {
    return imperfectRelationTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getElementTypeName()
  {
    return elementTypeNameEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getRelationTypeName()
  {
    return relationTypeNameEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IArchimateFactory getIArchimateFactory()
  {
    return (IArchimateFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__RELATIONS);
    createEReference(modelEClass, MODEL__DECISION_TRACES);
    createEReference(modelEClass, MODEL__COMPONENTS);

    componentEClass = createEClass(COMPONENT);
    createEAttribute(componentEClass, COMPONENT__NAME);
    createEReference(componentEClass, COMPONENT__COMPONENTS);

    groupEClass = createEClass(GROUP);

    elementEClass = createEClass(ELEMENT);
    createEAttribute(elementEClass, ELEMENT__TYPE_NAME);
    createEReference(elementEClass, ELEMENT__ATTRIBUTES);
    createEReference(elementEClass, ELEMENT__RELATIONS);
    createEReference(elementEClass, ELEMENT__ELEMENT_DECISION_TRACE);

    absentElementEClass = createEClass(ABSENT_ELEMENT);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__NAME);
    createEAttribute(attributeEClass, ATTRIBUTE__TYPE);
    createEAttribute(attributeEClass, ATTRIBUTE__VALUE);

    imperfectAttributeEClass = createEClass(IMPERFECT_ATTRIBUTE);
    createEAttribute(imperfectAttributeEClass, IMPERFECT_ATTRIBUTE__IMPERFECTION_TYPE);

    relationEClass = createEClass(RELATION);
    createEReference(relationEClass, RELATION__SOURCE);
    createEReference(relationEClass, RELATION__TARGET);
    createEAttribute(relationEClass, RELATION__TYPE_NAME);
    createEAttribute(relationEClass, RELATION__NAME);
    createEReference(relationEClass, RELATION__ATTRIBUTES);

    imperfectRelationEClass = createEClass(IMPERFECT_RELATION);
    createEAttribute(imperfectRelationEClass, IMPERFECT_RELATION__IMPERFECTION_TYPE);
    createEAttribute(imperfectRelationEClass, IMPERFECT_RELATION__CERTAINTY_DEGREE);

    decisionTraceEClass = createEClass(DECISION_TRACE);
    createEAttribute(decisionTraceEClass, DECISION_TRACE__ID_DECISION_TRACE);
    createEReference(decisionTraceEClass, DECISION_TRACE__DECISIONS);
    createEReference(decisionTraceEClass, DECISION_TRACE__FACTS);
    createEReference(decisionTraceEClass, DECISION_TRACE__OBSERVATIONS);
    createEReference(decisionTraceEClass, DECISION_TRACE__SOURCES);

    sourceEClass = createEClass(SOURCE);
    createEAttribute(sourceEClass, SOURCE__NAME);
    createEAttribute(sourceEClass, SOURCE__RELIABILITY);
    createEAttribute(sourceEClass, SOURCE__CERTAINTY_DEGREE);
    createEReference(sourceEClass, SOURCE__SOURCE_OBSERVATIONS);

    directObservationEClass = createEClass(DIRECT_OBSERVATION);

    meetingEClass = createEClass(MEETING);
    createEAttribute(meetingEClass, MEETING__MINUTE_NUMBER);
    createEReference(meetingEClass, MEETING__MEETING_PARTICIPANTS);

    documentEClass = createEClass(DOCUMENT);
    createEAttribute(documentEClass, DOCUMENT__VERSION);
    createEAttribute(documentEClass, DOCUMENT__DESCRIPTION);

    personEClass = createEClass(PERSON);
    createEAttribute(personEClass, PERSON__ORGANIZATIONAL_UNIT);
    createEAttribute(personEClass, PERSON__ROL);

    observationEClass = createEClass(OBSERVATION);
    createEAttribute(observationEClass, OBSERVATION__ID_OBSERVATION);
    createEAttribute(observationEClass, OBSERVATION__REFERENCE_DATE);
    createEReference(observationEClass, OBSERVATION__OBSERVATION_FACTS);
    createEReference(observationEClass, OBSERVATION__BELONGS_TO);

    factEClass = createEClass(FACT);
    createEReference(factEClass, FACT__IS_FACT_OF);
    createEAttribute(factEClass, FACT__ID_FACT);
    createEAttribute(factEClass, FACT__ELEMENT);

    instanceFactEClass = createEClass(INSTANCE_FACT);
    createEAttribute(instanceFactEClass, INSTANCE_FACT__EXIST);

    attributeFactEClass = createEClass(ATTRIBUTE_FACT);
    createEAttribute(attributeFactEClass, ATTRIBUTE_FACT__ATT_NAME);
    createEAttribute(attributeFactEClass, ATTRIBUTE_FACT__ATT_VALUE);

    relationFactEClass = createEClass(RELATION_FACT);
    createEAttribute(relationFactEClass, RELATION_FACT__REL_NAME);
    createEAttribute(relationFactEClass, RELATION_FACT__REL_VALUE);

    decisionEClass = createEClass(DECISION);
    createEAttribute(decisionEClass, DECISION__ID_DECISION);
    createEAttribute(decisionEClass, DECISION__RESULT);
    createEReference(decisionEClass, DECISION__DECISION_FACTS);

    // Create enums
    attributeTypeValueEEnum = createEEnum(ATTRIBUTE_TYPE_VALUE);
    imperfectAttributeTypeValueEEnum = createEEnum(IMPERFECT_ATTRIBUTE_TYPE_VALUE);
    imperfectRelationTypeEEnum = createEEnum(IMPERFECT_RELATION_TYPE);
    elementTypeNameEEnum = createEEnum(ELEMENT_TYPE_NAME);
    relationTypeNameEEnum = createEEnum(RELATION_TYPE_NAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    groupEClass.getESuperTypes().add(this.getComponent());
    elementEClass.getESuperTypes().add(this.getComponent());
    absentElementEClass.getESuperTypes().add(this.getElement());
    imperfectAttributeEClass.getESuperTypes().add(this.getAttribute());
    imperfectRelationEClass.getESuperTypes().add(this.getRelation());
    directObservationEClass.getESuperTypes().add(this.getSource());
    meetingEClass.getESuperTypes().add(this.getSource());
    documentEClass.getESuperTypes().add(this.getSource());
    personEClass.getESuperTypes().add(this.getSource());
    instanceFactEClass.getESuperTypes().add(this.getFact());
    attributeFactEClass.getESuperTypes().add(this.getFact());
    relationFactEClass.getESuperTypes().add(this.getFact());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Relations(), this.getRelation(), null, "relations", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_DecisionTraces(), this.getDecisionTrace(), null, "decisionTraces", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Components(), this.getComponent(), null, "components", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Components(), this.getComponent(), null, "components", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElement_TypeName(), this.getElementTypeName(), "typeName", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElement_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElement_Relations(), this.getRelation(), this.getRelation_Source(), "relations", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElement_ElementDecisionTrace(), this.getDecisionTrace(), null, "elementDecisionTrace", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(absentElementEClass, AbsentElement.class, "AbsentElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", "", 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Type(), this.getAttributeTypeValue(), "type", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Value(), ecorePackage.getEString(), "value", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(imperfectAttributeEClass, ImperfectAttribute.class, "ImperfectAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImperfectAttribute_ImperfectionType(), this.getImperfectAttributeTypeValue(), "imperfectionType", null, 1, 1, ImperfectAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelation_Source(), this.getElement(), this.getElement_Relations(), "source", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelation_Target(), this.getElement(), null, "target", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelation_TypeName(), this.getRelationTypeName(), "typeName", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelation_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(imperfectRelationEClass, ImperfectRelation.class, "ImperfectRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImperfectRelation_ImperfectionType(), this.getImperfectRelationType(), "imperfectionType", null, 1, 1, ImperfectRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImperfectRelation_CertaintyDegree(), ecorePackage.getEDouble(), "certaintyDegree", null, 0, 1, ImperfectRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(decisionTraceEClass, DecisionTrace.class, "DecisionTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDecisionTrace_IdDecisionTrace(), ecorePackage.getEString(), "idDecisionTrace", null, 1, 1, DecisionTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDecisionTrace_Decisions(), this.getDecision(), null, "decisions", null, 0, -1, DecisionTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDecisionTrace_Facts(), this.getFact(), null, "facts", null, 0, -1, DecisionTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDecisionTrace_Observations(), this.getObservation(), null, "observations", null, 0, -1, DecisionTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDecisionTrace_Sources(), this.getSource(), null, "sources", null, 0, -1, DecisionTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sourceEClass, Source.class, "Source", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSource_Name(), ecorePackage.getEString(), "name", null, 1, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSource_Reliability(), ecorePackage.getEDouble(), "reliability", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSource_CertaintyDegree(), ecorePackage.getEDouble(), "certaintyDegree", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSource_SourceObservations(), this.getObservation(), this.getObservation_BelongsTo(), "sourceObservations", null, 0, -1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(directObservationEClass, DirectObservation.class, "DirectObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(meetingEClass, Meeting.class, "Meeting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMeeting_MinuteNumber(), ecorePackage.getEInt(), "minuteNumber", null, 0, 1, Meeting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMeeting_MeetingParticipants(), this.getPerson(), null, "meetingParticipants", null, 2, -1, Meeting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDocument_Version(), ecorePackage.getEDouble(), "version", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocument_Description(), ecorePackage.getEString(), "description", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPerson_OrganizationalUnit(), ecorePackage.getEString(), "organizationalUnit", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerson_Rol(), ecorePackage.getEString(), "rol", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(observationEClass, Observation.class, "Observation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObservation_IdObservation(), ecorePackage.getEString(), "idObservation", null, 1, 1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getObservation_ReferenceDate(), ecorePackage.getEDate(), "referenceDate", null, 0, 1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObservation_ObservationFacts(), this.getFact(), this.getFact_IsFactOf(), "observationFacts", null, 0, -1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObservation_BelongsTo(), this.getSource(), this.getSource_SourceObservations(), "belongsTo", null, 1, 1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(factEClass, Fact.class, "Fact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFact_IsFactOf(), this.getObservation(), this.getObservation_ObservationFacts(), "isFactOf", null, 1, -1, Fact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFact_IdFact(), ecorePackage.getEString(), "idFact", null, 1, 1, Fact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFact_Element(), ecorePackage.getEString(), "element", null, 1, 1, Fact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instanceFactEClass, InstanceFact.class, "InstanceFact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstanceFact_Exist(), ecorePackage.getEBoolean(), "exist", null, 1, 1, InstanceFact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeFactEClass, AttributeFact.class, "AttributeFact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttributeFact_AttName(), ecorePackage.getEString(), "attName", null, 1, 1, AttributeFact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttributeFact_AttValue(), ecorePackage.getEString(), "attValue", null, 1, -1, AttributeFact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationFactEClass, RelationFact.class, "RelationFact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRelationFact_RelName(), ecorePackage.getEString(), "relName", null, 1, 1, RelationFact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelationFact_RelValue(), ecorePackage.getEString(), "relValue", null, 1, -1, RelationFact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(decisionEClass, Decision.class, "Decision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDecision_IdDecision(), ecorePackage.getEString(), "idDecision", null, 1, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDecision_Result(), ecorePackage.getEString(), "result", null, 1, -1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDecision_DecisionFacts(), this.getFact(), null, "decisionFacts", null, 1, -1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(attributeTypeValueEEnum, AttributeTypeValue.class, "AttributeTypeValue");
    addEEnumLiteral(attributeTypeValueEEnum, AttributeTypeValue.EINT);
    addEEnumLiteral(attributeTypeValueEEnum, AttributeTypeValue.EDOUBLE);
    addEEnumLiteral(attributeTypeValueEEnum, AttributeTypeValue.ESTRING);
    addEEnumLiteral(attributeTypeValueEEnum, AttributeTypeValue.EBOOLEAN);
    addEEnumLiteral(attributeTypeValueEEnum, AttributeTypeValue.EDATE);

    initEEnum(imperfectAttributeTypeValueEEnum, ImperfectAttributeTypeValue.class, "ImperfectAttributeTypeValue");
    addEEnumLiteral(imperfectAttributeTypeValueEEnum, ImperfectAttributeTypeValue.NUMERIC_RANGE);
    addEEnumLiteral(imperfectAttributeTypeValueEEnum, ImperfectAttributeTypeValue.NUMERIC_SET);
    addEEnumLiteral(imperfectAttributeTypeValueEEnum, ImperfectAttributeTypeValue.STRING_SET);
    addEEnumLiteral(imperfectAttributeTypeValueEEnum, ImperfectAttributeTypeValue.NUMERIC_VALUE_CERTAINTY_DEGREE);
    addEEnumLiteral(imperfectAttributeTypeValueEEnum, ImperfectAttributeTypeValue.STRING_VALUE_CERTAINTY_DEGREE);
    addEEnumLiteral(imperfectAttributeTypeValueEEnum, ImperfectAttributeTypeValue.LINGUISTIC_VALUE);
    addEEnumLiteral(imperfectAttributeTypeValueEEnum, ImperfectAttributeTypeValue.NO_VALUE);

    initEEnum(imperfectRelationTypeEEnum, ImperfectRelationType.class, "ImperfectRelationType");
    addEEnumLiteral(imperfectRelationTypeEEnum, ImperfectRelationType.INSTANCE_CERTAINTY_DEGREE);
    addEEnumLiteral(imperfectRelationTypeEEnum, ImperfectRelationType.INSTANCE_SET);
    addEEnumLiteral(imperfectRelationTypeEEnum, ImperfectRelationType.ABSENT_INSTANCE);

    initEEnum(elementTypeNameEEnum, ElementTypeName.class, "ElementTypeName");
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.NOT_SELECTED);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.BUSINESS_ACTOR);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.BUSINESS_ROLE);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.BUSINESS_COLLABORATION);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.BUSINESS_INTERFACE);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.LOCATION);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.BUSINESS_OBJECT);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.BUSINESS_PROCESS);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.BUSINESS_FUNCTION);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.BUSINESS_INTERACTION);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.BUSINESS_EVENT);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.BUSINESS_SERVICE);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.REPRESENTATION);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.MEANING);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.VALUE);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.PRODUCT);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.CONTRACT);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.APPLICATION_COMPONENT);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.APPLICATION_COLLABORATION);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.APPLICATION_INTERFACE);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.DATA_OBJECT);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.APPLICATION_FUNCTION);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.APPLICATION_INTERACTION);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.APPLICATION_SERVICE);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.NODE);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.DEVICE);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.SYSTEM_SOFTWARE);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.INFRASTRUCTURE_INTERFACE);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.NETWORK);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.COMMUNICATION_PATH);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.INFRASTRUCTURE_FUNCTION);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.INFRASTRUCTURE_SERVICE);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.ARTIFACT);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.STAKEHOLDER);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.DRIVER);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.ASSESSMENT);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.GOAL);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.REQUIREMENT);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.CONSTRAINT);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.PRINCIPLE);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.WORK_PACKAGE);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.DELIVERABLE);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.PLATEAU);
    addEEnumLiteral(elementTypeNameEEnum, ElementTypeName.GAP);

    initEEnum(relationTypeNameEEnum, RelationTypeName.class, "RelationTypeName");
    addEEnumLiteral(relationTypeNameEEnum, RelationTypeName.NOT_SELECTED);
    addEEnumLiteral(relationTypeNameEEnum, RelationTypeName.COMPOSITION);
    addEEnumLiteral(relationTypeNameEEnum, RelationTypeName.AGGREGATION);
    addEEnumLiteral(relationTypeNameEEnum, RelationTypeName.ASSIGNMENT);
    addEEnumLiteral(relationTypeNameEEnum, RelationTypeName.REALIZATION);
    addEEnumLiteral(relationTypeNameEEnum, RelationTypeName.USED_BY);
    addEEnumLiteral(relationTypeNameEEnum, RelationTypeName.ACCESS);
    addEEnumLiteral(relationTypeNameEEnum, RelationTypeName.ASSOCIATION);
    addEEnumLiteral(relationTypeNameEEnum, RelationTypeName.TRIGGERING);
    addEEnumLiteral(relationTypeNameEEnum, RelationTypeName.FLOW);
    addEEnumLiteral(relationTypeNameEEnum, RelationTypeName.SPECIALIZATION);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // gmf
    createGmfAnnotations();
    // gmf.diagram
    createGmf_1Annotations();
    // gmf.compartment
    createGmf_2Annotations();
    // gmf.node
    createGmf_3Annotations();
    // gmf.link
    createGmf_4Annotations();
  }

  /**
   * Initializes the annotations for <b>gmf</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmfAnnotations()
  {
    String source = "gmf";		
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });									
  }

  /**
   * Initializes the annotations for <b>gmf.diagram</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_1Annotations()
  {
    String source = "gmf.diagram";			
    addAnnotation
      (modelEClass, 
       source, 
       new String[] 
       {
       "model.extension", "iarchimate",
       "diagram.extension", "iarchimate_diagram"
       });								
  }

  /**
   * Initializes the annotations for <b>gmf.compartment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_2Annotations()
  {
    String source = "gmf.compartment";				
    addAnnotation
      (getComponent_Components(), 
       source, 
       new String[] 
       {
       "layout", "free"
       });							
  }

  /**
   * Initializes the annotations for <b>gmf.node</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_3Annotations()
  {
    String source = "gmf.node";					
    addAnnotation
      (groupEClass, 
       source, 
       new String[] 
       {
       "figure", "rounded",
       "label.icon", "true",
       "label", "name",
       "label.pattern", "{0}",
       "size", "600,200"
       });		
    addAnnotation
      (elementEClass, 
       source, 
       new String[] 
       {
       "figure", "rounded",
       "label.icon", "true",
       "label", "name",
       "label.pattern", "{0}",
       "size", "140,60",
       "border.color", "0,0,0"
       });			
    addAnnotation
      (absentElementEClass, 
       source, 
       new String[] 
       {
       "figure", "rectangle",
       "label.icon", "true",
       "label", "name",
       "label.pattern", "{0}",
       "size", "140,60",
       "border.color", "0,0,255"
       });				
    addAnnotation
      (decisionTraceEClass, 
       source, 
       new String[] 
       {
       "figure", "rounded",
       "label.icon", "true",
       "label", "idDecisionTrace",
       "label.pattern", "{0}",
       "size", "100,60"
       });
  }

  /**
   * Initializes the annotations for <b>gmf.link</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_4Annotations()
  {
    String source = "gmf.link";							
    addAnnotation
      (getElement_ElementDecisionTrace(), 
       source, 
       new String[] 
       {
       "target.decoration", "arrow",
       "source.decoration", "filledsquare",
       "style", "dash",
       "color", "0,0,255"
       });			
    addAnnotation
      (relationEClass, 
       source, 
       new String[] 
       {
       "source", "source",
       "target", "target",
       "label", "name",
       "label.pattern", "{0}",
       "color", "0,0,0"
       });		
    addAnnotation
      (imperfectRelationEClass, 
       source, 
       new String[] 
       {
       "source", "source",
       "target", "target",
       "label", "name",
       "target.decoration", "arrow",
       "label.pattern", "{0}",
       "source.decoration", "none",
       "color", "0,0,255"
       });	
  }

} //IArchimatePackageImpl
