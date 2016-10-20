/**
 */
package iArchimate.impl;

import iArchimate.IArchimatePackage;
import iArchimate.Observation;
import iArchimate.Source;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iArchimate.impl.SourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link iArchimate.impl.SourceImpl#getReliability <em>Reliability</em>}</li>
 *   <li>{@link iArchimate.impl.SourceImpl#getCertaintyDegree <em>Certainty Degree</em>}</li>
 *   <li>{@link iArchimate.impl.SourceImpl#getSourceObservations <em>Source Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SourceImpl extends EObjectImpl implements Source
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getReliability() <em>Reliability</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReliability()
   * @generated
   * @ordered
   */
  protected static final double RELIABILITY_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getReliability() <em>Reliability</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReliability()
   * @generated
   * @ordered
   */
  protected double reliability = RELIABILITY_EDEFAULT;

  /**
   * The default value of the '{@link #getCertaintyDegree() <em>Certainty Degree</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCertaintyDegree()
   * @generated
   * @ordered
   */
  protected static final double CERTAINTY_DEGREE_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getCertaintyDegree() <em>Certainty Degree</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCertaintyDegree()
   * @generated
   * @ordered
   */
  protected double certaintyDegree = CERTAINTY_DEGREE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSourceObservations() <em>Source Observations</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceObservations()
   * @generated
   * @ordered
   */
  protected EList<Observation> sourceObservations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SourceImpl()
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
    return IArchimatePackage.Literals.SOURCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.SOURCE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getReliability()
  {
    return reliability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReliability(double newReliability)
  {
    double oldReliability = reliability;
    reliability = newReliability;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.SOURCE__RELIABILITY, oldReliability, reliability));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getCertaintyDegree()
  {
    return certaintyDegree;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCertaintyDegree(double newCertaintyDegree)
  {
    double oldCertaintyDegree = certaintyDegree;
    certaintyDegree = newCertaintyDegree;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.SOURCE__CERTAINTY_DEGREE, oldCertaintyDegree, certaintyDegree));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Observation> getSourceObservations()
  {
    if (sourceObservations == null)
    {
      sourceObservations = new EObjectWithInverseResolvingEList<Observation>(Observation.class, this, IArchimatePackage.SOURCE__SOURCE_OBSERVATIONS, IArchimatePackage.OBSERVATION__BELONGS_TO);
    }
    return sourceObservations;
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
      case IArchimatePackage.SOURCE__SOURCE_OBSERVATIONS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getSourceObservations()).basicAdd(otherEnd, msgs);
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
      case IArchimatePackage.SOURCE__SOURCE_OBSERVATIONS:
        return ((InternalEList<?>)getSourceObservations()).basicRemove(otherEnd, msgs);
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
      case IArchimatePackage.SOURCE__NAME:
        return getName();
      case IArchimatePackage.SOURCE__RELIABILITY:
        return getReliability();
      case IArchimatePackage.SOURCE__CERTAINTY_DEGREE:
        return getCertaintyDegree();
      case IArchimatePackage.SOURCE__SOURCE_OBSERVATIONS:
        return getSourceObservations();
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
      case IArchimatePackage.SOURCE__NAME:
        setName((String)newValue);
        return;
      case IArchimatePackage.SOURCE__RELIABILITY:
        setReliability((Double)newValue);
        return;
      case IArchimatePackage.SOURCE__CERTAINTY_DEGREE:
        setCertaintyDegree((Double)newValue);
        return;
      case IArchimatePackage.SOURCE__SOURCE_OBSERVATIONS:
        getSourceObservations().clear();
        getSourceObservations().addAll((Collection<? extends Observation>)newValue);
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
      case IArchimatePackage.SOURCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IArchimatePackage.SOURCE__RELIABILITY:
        setReliability(RELIABILITY_EDEFAULT);
        return;
      case IArchimatePackage.SOURCE__CERTAINTY_DEGREE:
        setCertaintyDegree(CERTAINTY_DEGREE_EDEFAULT);
        return;
      case IArchimatePackage.SOURCE__SOURCE_OBSERVATIONS:
        getSourceObservations().clear();
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
      case IArchimatePackage.SOURCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IArchimatePackage.SOURCE__RELIABILITY:
        return reliability != RELIABILITY_EDEFAULT;
      case IArchimatePackage.SOURCE__CERTAINTY_DEGREE:
        return certaintyDegree != CERTAINTY_DEGREE_EDEFAULT;
      case IArchimatePackage.SOURCE__SOURCE_OBSERVATIONS:
        return sourceObservations != null && !sourceObservations.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", reliability: ");
    result.append(reliability);
    result.append(", certaintyDegree: ");
    result.append(certaintyDegree);
    result.append(')');
    return result.toString();
  }

} //SourceImpl
