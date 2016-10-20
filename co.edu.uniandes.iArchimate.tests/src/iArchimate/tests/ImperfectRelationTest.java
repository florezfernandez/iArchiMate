/**
 */
package iArchimate.tests;

import iArchimate.IArchimateFactory;
import iArchimate.ImperfectRelation;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Imperfect Relation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImperfectRelationTest extends RelationTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(ImperfectRelationTest.class);
  }

  /**
   * Constructs a new Imperfect Relation test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImperfectRelationTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Imperfect Relation test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected ImperfectRelation getFixture()
  {
    return (ImperfectRelation)fixture;
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
    setFixture(IArchimateFactory.eINSTANCE.createImperfectRelation());
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

} //ImperfectRelationTest
