/**
 */
package iArchimate.tests;

import iArchimate.IArchimateFactory;
import iArchimate.InstanceFact;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Instance Fact</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstanceFactTest extends FactTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(InstanceFactTest.class);
  }

  /**
   * Constructs a new Instance Fact test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceFactTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Instance Fact test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected InstanceFact getFixture()
  {
    return (InstanceFact)fixture;
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
    setFixture(IArchimateFactory.eINSTANCE.createInstanceFact());
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

} //InstanceFactTest
