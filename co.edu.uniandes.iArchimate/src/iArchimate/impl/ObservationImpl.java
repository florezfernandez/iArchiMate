/**
 */
package iArchimate.impl;

import iArchimate.Fact;
import iArchimate.IArchimatePackage;
import iArchimate.Observation;
import iArchimate.Source;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iArchimate.impl.ObservationImpl#getIdObservation <em>Id Observation</em>}</li>
 *   <li>{@link iArchimate.impl.ObservationImpl#getReferenceDate <em>Reference Date</em>}</li>
 *   <li>{@link iArchimate.impl.ObservationImpl#getObservationFacts <em>Observation Facts</em>}</li>
 *   <li>{@link iArchimate.impl.ObservationImpl#getBelongsTo <em>Belongs To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObservationImpl extends EObjectImpl implements Observation
{
  /**
   * The default value of the '{@link #getIdObservation() <em>Id Observation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdObservation()
   * @generated
   * @ordered
   */
  protected static final String ID_OBSERVATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdObservation() <em>Id Observation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdObservation()
   * @generated
   * @ordered
   */
  protected String idObservation = ID_OBSERVATION_EDEFAULT;

  /**
   * The default value of the '{@link #getReferenceDate() <em>Reference Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceDate()
   * @generated
   * @ordered
   */
  protected static final Date REFERENCE_DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReferenceDate() <em>Reference Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceDate()
   * @generated
   * @ordered
   */
  protected Date referenceDate = REFERENCE_DATE_EDEFAULT;

  /**
   * The cached value of the '{@link #getObservationFacts() <em>Observation Facts</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObservationFacts()
   * @generated
   * @ordered
   */
  protected EList<Fact> observationFacts;

  /**
   * The cached value of the '{@link #getBelongsTo() <em>Belongs To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBelongsTo()
   * @generated
   * @ordered
   */
  protected Source belongsTo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObservationImpl()
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
    return IArchimatePackage.Literals.OBSERVATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdObservation()
  {
    return idObservation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdObservation(String newIdObservation)
  {
    String oldIdObservation = idObservation;
    idObservation = newIdObservation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.OBSERVATION__ID_OBSERVATION, oldIdObservation, idObservation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date getReferenceDate()
  {
    return referenceDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferenceDate(Date newReferenceDate)
  {
    Date oldReferenceDate = referenceDate;
    referenceDate = newReferenceDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.OBSERVATION__REFERENCE_DATE, oldReferenceDate, referenceDate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Fact> getObservationFacts()
  {
    if (observationFacts == null)
    {
      observationFacts = new EObjectWithInverseResolvingEList.ManyInverse<Fact>(Fact.class, this, IArchimatePackage.OBSERVATION__OBSERVATION_FACTS, IArchimatePackage.FACT__IS_FACT_OF);
    }
    return observationFacts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Source getBelongsTo()
  {
    if (belongsTo != null && belongsTo.eIsProxy())
    {
      InternalEObject oldBelongsTo = (InternalEObject)belongsTo;
      belongsTo = (Source)eResolveProxy(oldBelongsTo);
      if (belongsTo != oldBelongsTo)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IArchimatePackage.OBSERVATION__BELONGS_TO, oldBelongsTo, belongsTo));
      }
    }
    return belongsTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Source basicGetBelongsTo()
  {
    return belongsTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBelongsTo(Source newBelongsTo, NotificationChain msgs)
  {
    Source oldBelongsTo = belongsTo;
    belongsTo = newBelongsTo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IArchimatePackage.OBSERVATION__BELONGS_TO, oldBelongsTo, newBelongsTo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBelongsTo(Source newBelongsTo)
  {
    if (newBelongsTo != belongsTo)
    {
      NotificationChain msgs = null;
      if (belongsTo != null)
        msgs = ((InternalEObject)belongsTo).eInverseRemove(this, IArchimatePackage.SOURCE__SOURCE_OBSERVATIONS, Source.class, msgs);
      if (newBelongsTo != null)
        msgs = ((InternalEObject)newBelongsTo).eInverseAdd(this, IArchimatePackage.SOURCE__SOURCE_OBSERVATIONS, Source.class, msgs);
      msgs = basicSetBelongsTo(newBelongsTo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.OBSERVATION__BELONGS_TO, newBelongsTo, newBelongsTo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case IArchimatePackage.OBSERVATION__OBSERVATION_FACTS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getObservationFacts()).basicAdd(otherEnd, msgs);
      case IArchimatePackage.OBSERVATION__BELONGS_TO:
        if (belongsTo != null)
          msgs = ((InternalEObject)belongsTo).eInverseRemove(this, IArchimatePackage.SOURCE__SOURCE_OBSERVATIONS, Source.class, msgs);
        return basicSetBelongsTo((Source)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case IArchimatePackage.OBSERVATION__OBSERVATION_FACTS:
        return ((InternalEList<?>)getObservationFacts()).basicRemove(otherEnd, msgs);
      case IArchimatePackage.OBSERVATION__BELONGS_TO:
        return basicSetBelongsTo(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case IArchimatePackage.OBSERVATION__ID_OBSERVATION:
        return getIdObservation();
      case IArchimatePackage.OBSERVATION__REFERENCE_DATE:
        return getReferenceDate();
      case IArchimatePackage.OBSERVATION__OBSERVATION_FACTS:
        return getObservationFacts();
      case IArchimatePackage.OBSERVATION__BELONGS_TO:
        if (resolve) return getBelongsTo();
        return basicGetBelongsTo();
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
      case IArchimatePackage.OBSERVATION__ID_OBSERVATION:
        setIdObservation((String)newValue);
        return;
      case IArchimatePackage.OBSERVATION__REFERENCE_DATE:
        setReferenceDate((Date)newValue);
        return;
      case IArchimatePackage.OBSERVATION__OBSERVATION_FACTS:
        getObservationFacts().clear();
        getObservationFacts().addAll((Collection<? extends Fact>)newValue);
        return;
      case IArchimatePackage.OBSERVATION__BELONGS_TO:
        setBelongsTo((Source)newValue);
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
      case IArchimatePackage.OBSERVATION__ID_OBSERVATION:
        setIdObservation(ID_OBSERVATION_EDEFAULT);
        return;
      case IArchimatePackage.OBSERVATION__REFERENCE_DATE:
        setReferenceDate(REFERENCE_DATE_EDEFAULT);
        return;
      case IArchimatePackage.OBSERVATION__OBSERVATION_FACTS:
        getObservationFacts().clear();
        return;
      case IArchimatePackage.OBSERVATION__BELONGS_TO:
        setBelongsTo((Source)null);
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
      case IArchimatePackage.OBSERVATION__ID_OBSERVATION:
        return ID_OBSERVATION_EDEFAULT == null ? idObservation != null : !ID_OBSERVATION_EDEFAULT.equals(idObservation);
      case IArchimatePackage.OBSERVATION__REFERENCE_DATE:
        return REFERENCE_DATE_EDEFAULT == null ? referenceDate != null : !REFERENCE_DATE_EDEFAULT.equals(referenceDate);
      case IArchimatePackage.OBSERVATION__OBSERVATION_FACTS:
        return observationFacts != null && !observationFacts.isEmpty();
      case IArchimatePackage.OBSERVATION__BELONGS_TO:
        return belongsTo != null;
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
    result.append(" (idObservation: ");
    result.append(idObservation);
    result.append(", referenceDate: ");
    result.append(referenceDate);
    result.append(')');
    return result.toString();
  }

} //ObservationImpl
