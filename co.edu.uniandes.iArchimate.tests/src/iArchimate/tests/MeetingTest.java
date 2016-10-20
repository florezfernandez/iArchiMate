/**
 */
package iArchimate.tests;

import iArchimate.IArchimateFactory;
import iArchimate.Meeting;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Meeting</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeetingTest extends SourceTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(MeetingTest.class);
  }

  /**
   * Constructs a new Meeting test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MeetingTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Meeting test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Meeting getFixture()
  {
    return (Meeting)fixture;
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
    setFixture(IArchimateFactory.eINSTANCE.createMeeting());
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

} //MeetingTest
