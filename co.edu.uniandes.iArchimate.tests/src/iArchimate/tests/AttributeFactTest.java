/**
 */
package iArchimate.tests;

import iArchimate.AttributeFact;
import iArchimate.IArchimateFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attribute Fact</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeFactTest extends FactTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(AttributeFactTest.class);
  }

  /**
   * Constructs a new Attribute Fact test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeFactTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Attribute Fact test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected AttributeFact getFixture()
  {
    return (AttributeFact)fixture;
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
    setFixture(IArchimateFactory.eINSTANCE.createAttributeFact());
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

} //AttributeFactTest
