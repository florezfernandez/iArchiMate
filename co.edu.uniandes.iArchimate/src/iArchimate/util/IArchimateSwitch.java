/**
 */
package iArchimate.util;

import iArchimate.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see iArchimate.IArchimatePackage
 * @generated
 */
public class IArchimateSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static IArchimatePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IArchimateSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = IArchimatePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case IArchimatePackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IArchimatePackage.COMPONENT:
      {
        Component component = (Component)theEObject;
        T result = caseComponent(component);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IArchimatePackage.GROUP:
      {
        Group group = (Group)theEObject;
        T result = caseGroup(group);
        if (result == null) result = caseComponent(group);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IArchimatePackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = caseComponent(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IArchimatePackage.ABSENT_ELEMENT:
      {
        AbsentElement absentElement = (AbsentElement)theEObject;
        T result = caseAbsentElement(absentElement);
        if (result == null) result = caseElement(absentElement);
        if (result == null) result = caseComponent(absentElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IArchimatePackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IArchimatePackage.IMPERFECT_ATTRIBUTE:
      {
        ImperfectAttribute imperfectAttribute = (ImperfectAttribute)theEObject;
        T result = caseImperfectAttribute(imperfectAttribute);
        if (result == null) result = caseAttribute(imperfectAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IArchimatePackage.RELATION:
      {
        Relation relation = (Relation)theEObject;
        T result = caseRelation(relation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IArchimatePackage.IMPERFECT_RELATION:
      {
        ImperfectRelation imperfectRelation = (ImperfectRelation)theEObject;
        T result = caseImperfectRelation(imperfectRelation);
        if (result == null) result = caseRelation(imperfectRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IArchimatePackage.DECISION_TRACE:
      {
        DecisionTrace decisionTrace = (DecisionTrace)theEObject;
        T result = caseDecisionTrace(decisionTrace);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IArchimatePackage.SOURCE:
      {
        Source source = (Source)theEObject;
        T result = caseSource(source);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IArchimatePackage.DIRECT_OBSERVATION:
      {
        DirectObservation directObservation = (DirectObservation)theEObject;
        T result = caseDirectObservation(directObservation);
        if (result == null) result = caseSource(directObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IArchimatePackage.MEETING:
      {
        Meeting meeting = (Meeting)theEObject;
        T result = caseMeeting(meeting);
        if (result == null) result = caseSource(meeting);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IArchimatePackage.DOCUMENT:
      {
        Document document = (Document)theEObject;
        T result = caseDocument(document);
        if (result == null) result = caseSource(document);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IArchimatePackage.PERSON:
      {
        Person person = (Person)theEObject;
        T result = casePerson(person);
        if (result == null) result = caseSource(person);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IArchimatePackage.OBSERVATION:
      {
        Observation observation = (Observation)theEObject;
        T result = caseObservation(observation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IArchimatePackage.FACT:
      {
        Fact fact = (Fact)theEObject;
        T result = caseFact(fact);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IArchimatePackage.INSTANCE_FACT:
      {
        InstanceFact instanceFact = (InstanceFact)theEObject;
        T result = caseInstanceFact(instanceFact);
        if (result == null) result = caseFact(instanceFact);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IArchimatePackage.ATTRIBUTE_FACT:
      {
        AttributeFact attributeFact = (AttributeFact)theEObject;
        T result = caseAttributeFact(attributeFact);
        if (result == null) result = caseFact(attributeFact);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IArchimatePackage.RELATION_FACT:
      {
        RelationFact relationFact = (RelationFact)theEObject;
        T result = caseRelationFact(relationFact);
        if (result == null) result = caseFact(relationFact);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IArchimatePackage.DECISION:
      {
        Decision decision = (Decision)theEObject;
        T result = caseDecision(decision);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponent(Component object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroup(Group object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Absent Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Absent Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbsentElement(AbsentElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imperfect Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imperfect Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImperfectAttribute(ImperfectAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelation(Relation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imperfect Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imperfect Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImperfectRelation(ImperfectRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decision Trace</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decision Trace</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecisionTrace(DecisionTrace object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Source</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSource(Source object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Direct Observation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Direct Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirectObservation(DirectObservation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Meeting</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Meeting</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMeeting(Meeting object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Document</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocument(Document object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Person</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePerson(Person object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObservation(Observation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fact</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fact</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFact(Fact object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance Fact</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance Fact</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstanceFact(InstanceFact object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Fact</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Fact</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeFact(AttributeFact object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation Fact</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation Fact</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationFact(RelationFact object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decision</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decision</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecision(Decision object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //IArchimateSwitch
