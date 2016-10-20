/**
 */
package iArchimate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meeting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iArchimate.Meeting#getMinuteNumber <em>Minute Number</em>}</li>
 *   <li>{@link iArchimate.Meeting#getMeetingParticipants <em>Meeting Participants</em>}</li>
 * </ul>
 * </p>
 *
 * @see iArchimate.IArchimatePackage#getMeeting()
 * @model
 * @generated
 */
public interface Meeting extends Source
{
  /**
   * Returns the value of the '<em><b>Minute Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minute Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Minute Number</em>' attribute.
   * @see #setMinuteNumber(int)
   * @see iArchimate.IArchimatePackage#getMeeting_MinuteNumber()
   * @model
   * @generated
   */
  int getMinuteNumber();

  /**
   * Sets the value of the '{@link iArchimate.Meeting#getMinuteNumber <em>Minute Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Minute Number</em>' attribute.
   * @see #getMinuteNumber()
   * @generated
   */
  void setMinuteNumber(int value);

  /**
   * Returns the value of the '<em><b>Meeting Participants</b></em>' reference list.
   * The list contents are of type {@link iArchimate.Person}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meeting Participants</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meeting Participants</em>' reference list.
   * @see iArchimate.IArchimatePackage#getMeeting_MeetingParticipants()
   * @model lower="2"
   * @generated
   */
  EList<Person> getMeetingParticipants();

} // Meeting
