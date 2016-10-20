/**
 */
package iArchimate.tests;

import iArchimate.IArchimateFactory;
import iArchimate.ImperfectAttribute;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Imperfect Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImperfectAttributeTest extends AttributeTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(ImperfectAttributeTest.class);
  }

  /**
   * Constructs a new Imperfect Attribute test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImperfectAttributeTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Imperfect Attribute test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected ImperfectAttribute getFixture()
  {
    return (ImperfectAttribute)fixture;
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
    setFixture(IArchimateFactory.eINSTANCE.createImperfectAttribute());
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

} //ImperfectAttributeTest
