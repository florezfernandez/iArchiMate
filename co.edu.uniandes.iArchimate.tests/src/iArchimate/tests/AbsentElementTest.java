/**
 */
package iArchimate.tests;

import iArchimate.AbsentElement;
import iArchimate.IArchimateFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Absent Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbsentElementTest extends ElementTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(AbsentElementTest.class);
  }

  /**
   * Constructs a new Absent Element test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbsentElementTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Absent Element test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected AbsentElement getFixture()
  {
    return (AbsentElement)fixture;
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
    setFixture(IArchimateFactory.eINSTANCE.createAbsentElement());
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

} //AbsentElementTest
