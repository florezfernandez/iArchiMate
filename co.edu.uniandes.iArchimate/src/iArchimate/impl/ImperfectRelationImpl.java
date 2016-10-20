/**
 */
package iArchimate.impl;

import iArchimate.IArchimatePackage;
import iArchimate.ImperfectRelation;
import iArchimate.ImperfectRelationType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imperfect Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iArchimate.impl.ImperfectRelationImpl#getImperfectionType <em>Imperfection Type</em>}</li>
 *   <li>{@link iArchimate.impl.ImperfectRelationImpl#getCertaintyDegree <em>Certainty Degree</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImperfectRelationImpl extends RelationImpl implements ImperfectRelation
{
  /**
   * The default value of the '{@link #getImperfectionType() <em>Imperfection Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImperfectionType()
   * @generated
   * @ordered
   */
  protected static final ImperfectRelationType IMPERFECTION_TYPE_EDEFAULT = ImperfectRelationType.INSTANCE_CERTAINTY_DEGREE;

  /**
   * The cached value of the '{@link #getImperfectionType() <em>Imperfection Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImperfectionType()
   * @generated
   * @ordered
   */
  protected ImperfectRelationType imperfectionType = IMPERFECTION_TYPE_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImperfectRelationImpl()
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
    return IArchimatePackage.Literals.IMPERFECT_RELATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImperfectRelationType getImperfectionType()
  {
    return imperfectionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImperfectionType(ImperfectRelationType newImperfectionType)
  {
    ImperfectRelationType oldImperfectionType = imperfectionType;
    imperfectionType = newImperfectionType == null ? IMPERFECTION_TYPE_EDEFAULT : newImperfectionType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.IMPERFECT_RELATION__IMPERFECTION_TYPE, oldImperfectionType, imperfectionType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.IMPERFECT_RELATION__CERTAINTY_DEGREE, oldCertaintyDegree, certaintyDegree));
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
      case IArchimatePackage.IMPERFECT_RELATION__IMPERFECTION_TYPE:
        return getImperfectionType();
      case IArchimatePackage.IMPERFECT_RELATION__CERTAINTY_DEGREE:
        return getCertaintyDegree();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IArchimatePackage.IMPERFECT_RELATION__IMPERFECTION_TYPE:
        setImperfectionType((ImperfectRelationType)newValue);
        return;
      case IArchimatePackage.IMPERFECT_RELATION__CERTAINTY_DEGREE:
        setCertaintyDegree((Double)newValue);
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
      case IArchimatePackage.IMPERFECT_RELATION__IMPERFECTION_TYPE:
        setImperfectionType(IMPERFECTION_TYPE_EDEFAULT);
        return;
      case IArchimatePackage.IMPERFECT_RELATION__CERTAINTY_DEGREE:
        setCertaintyDegree(CERTAINTY_DEGREE_EDEFAULT);
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
      case IArchimatePackage.IMPERFECT_RELATION__IMPERFECTION_TYPE:
        return imperfectionType != IMPERFECTION_TYPE_EDEFAULT;
      case IArchimatePackage.IMPERFECT_RELATION__CERTAINTY_DEGREE:
        return certaintyDegree != CERTAINTY_DEGREE_EDEFAULT;
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
    result.append(" (imperfectionType: ");
    result.append(imperfectionType);
    result.append(", certaintyDegree: ");
    result.append(certaintyDegree);
    result.append(')');
    return result.toString();
  }

} //ImperfectRelationImpl
