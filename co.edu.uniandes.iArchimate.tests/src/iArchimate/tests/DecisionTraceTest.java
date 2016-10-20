/**
 */
package iArchimate.tests;

import iArchimate.DecisionTrace;
import iArchimate.IArchimateFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Decision Trace</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DecisionTraceTest extends TestCase
{

  /**
   * The fixture for this Decision Trace test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DecisionTrace fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(DecisionTraceTest.class);
  }

  /**
   * Constructs a new Decision Trace test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecisionTraceTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Decision Trace test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(DecisionTrace fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Decision Trace test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DecisionTrace getFixture()
  {
    return fixture;
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
    setFixture(IArchimateFactory.eINSTANCE.createDecisionTrace());
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

} //DecisionTraceTest
