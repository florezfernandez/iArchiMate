/**
 */
package iArchimate.impl;

import iArchimate.IArchimatePackage;
import iArchimate.Meeting;
import iArchimate.Person;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meeting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iArchimate.impl.MeetingImpl#getMinuteNumber <em>Minute Number</em>}</li>
 *   <li>{@link iArchimate.impl.MeetingImpl#getMeetingParticipants <em>Meeting Participants</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeetingImpl extends SourceImpl implements Meeting
{
  /**
   * The default value of the '{@link #getMinuteNumber() <em>Minute Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinuteNumber()
   * @generated
   * @ordered
   */
  protected static final int MINUTE_NUMBER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinuteNumber() <em>Minute Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinuteNumber()
   * @generated
   * @ordered
   */
  protected int minuteNumber = MINUTE_NUMBER_EDEFAULT;

  /**
   * The cached value of the '{@link #getMeetingParticipants() <em>Meeting Participants</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeetingParticipants()
   * @generated
   * @ordered
   */
  protected EList<Person> meetingParticipants;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MeetingImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return IArchimatePackage.Literals.MEETING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinuteNumber()
  {
    return minuteNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinuteNumber(int newMinuteNumber)
  {
    int oldMinuteNumber = minuteNumber;
    minuteNumber = newMinuteNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.MEETING__MINUTE_NUMBER, oldMinuteNumber, minuteNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Person> getMeetingParticipants()
  {
    if (meetingParticipants == null)
    {
      meetingParticipants = new EObjectResolvingEList<Person>(Person.class, this, IArchimatePackage.MEETING__MEETING_PARTICIPANTS);
    }
    return meetingParticipants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case IArchimatePackage.MEETING__MINUTE_NUMBER:
        return getMinuteNumber();
      case IArchimatePackage.MEETING__MEETING_PARTICIPANTS:
        return getMeetingParticipants();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IArchimatePackage.MEETING__MINUTE_NUMBER:
        setMinuteNumber((Integer)newValue);
        return;
      case IArchimatePackage.MEETING__MEETING_PARTICIPANTS:
        getMeetingParticipants().clear();
        getMeetingParticipants().addAll((Collection<? extends Person>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case IArchimatePackage.MEETING__MINUTE_NUMBER:
        setMinuteNumber(MINUTE_NUMBER_EDEFAULT);
        return;
      case IArchimatePackage.MEETING__MEETING_PARTICIPANTS:
        getMeetingParticipants().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case IArchimatePackage.MEETING__MINUTE_NUMBER:
        return minuteNumber != MINUTE_NUMBER_EDEFAULT;
      case IArchimatePackage.MEETING__MEETING_PARTICIPANTS:
        return meetingParticipants != null && !meetingParticipants.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (minuteNumber: ");
    result.append(minuteNumber);
    result.append(')');
    return result.toString();
  }

} //MeetingImpl
