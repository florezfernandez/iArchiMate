/**
 */
package iArchimate.tests;

import iArchimate.IArchimateFactory;
import iArchimate.RelationFact;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relation Fact</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationFactTest extends FactTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(RelationFactTest.class);
  }

  /**
   * Constructs a new Relation Fact test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationFactTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Relation Fact test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected RelationFact getFixture()
  {
    return (RelationFact)fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception
  {
    setFixture(IArchimateFactory.eINSTANCE.createRelationFact());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#tearDown()
   * @generated
   */
  @Override
  protected void tearDown() throws Exception
  {
    setFixture(null);
  }

} //RelationFactTest
