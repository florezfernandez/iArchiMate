/**
 */
package iArchimate;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see iArchimate.IArchimatePackage
 * @generated
 */
public interface IArchimateFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  IArchimateFactory eINSTANCE = iArchimate.impl.IArchimateFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group</em>'.
   * @generated
   */
  Group createGroup();

  /**
   * Returns a new object of class '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element</em>'.
   * @generated
   */
  Element createElement();

  /**
   * Returns a new object of class '<em>Absent Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Absent Element</em>'.
   * @generated
   */
  AbsentElement createAbsentElement();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Imperfect Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Imperfect Attribute</em>'.
   * @generated
   */
  ImperfectAttribute createImperfectAttribute();

  /**
   * Returns a new object of class '<em>Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relation</em>'.
   * @generated
   */
  Relation createRelation();

  /**
   * Returns a new object of class '<em>Imperfect Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Imperfect Relation</em>'.
   * @generated
   */
  ImperfectRelation createImperfectRelation();

  /**
   * Returns a new object of class '<em>Decision Trace</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decision Trace</em>'.
   * @generated
   */
  DecisionTrace createDecisionTrace();

  /**
   * Returns a new object of class '<em>Direct Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Direct Observation</em>'.
   * @generated
   */
  DirectObservation createDirectObservation();

  /**
   * Returns a new object of class '<em>Meeting</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Meeting</em>'.
   * @generated
   */
  Meeting createMeeting();

  /**
   * Returns a new object of class '<em>Document</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Document</em>'.
   * @generated
   */
  Document createDocument();

  /**
   * Returns a new object of class '<em>Person</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Person</em>'.
   * @generated
   */
  Person createPerson();

  /**
   * Returns a new object of class '<em>Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Observation</em>'.
   * @generated
   */
  Observation createObservation();

  /**
   * Returns a new object of class '<em>Fact</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fact</em>'.
   * @generated
   */
  Fact createFact();

  /**
   * Returns a new object of class '<em>Instance Fact</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instance Fact</em>'.
   * @generated
   */
  InstanceFact createInstanceFact();

  /**
   * Returns a new object of class '<em>Attribute Fact</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Fact</em>'.
   * @generated
   */
  AttributeFact createAttributeFact();

  /**
   * Returns a new object of class '<em>Relation Fact</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relation Fact</em>'.
   * @generated
   */
  RelationFact createRelationFact();

  /**
   * Returns a new object of class '<em>Decision</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decision</em>'.
   * @generated
   */
  Decision createDecision();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  IArchimatePackage getIArchimatePackage();

} //IArchimateFactory
