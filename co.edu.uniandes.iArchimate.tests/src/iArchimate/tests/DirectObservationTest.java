/**
 */
package iArchimate.tests;

import iArchimate.DirectObservation;
import iArchimate.IArchimateFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Direct Observation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DirectObservationTest extends SourceTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(DirectObservationTest.class);
  }

  /**
   * Constructs a new Direct Observation test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirectObservationTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Direct Observation test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected DirectObservation getFixture()
  {
    return (DirectObservation)fixture;
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
    setFixture(IArchimateFactory.eINSTANCE.createDirectObservation());
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

} //DirectObservationTest
