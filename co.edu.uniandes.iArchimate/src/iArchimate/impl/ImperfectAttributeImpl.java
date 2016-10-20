/**
 */
package iArchimate.impl;

import iArchimate.IArchimatePackage;
import iArchimate.ImperfectAttribute;
import iArchimate.ImperfectAttributeTypeValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imperfect Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iArchimate.impl.ImperfectAttributeImpl#getImperfectionType <em>Imperfection Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImperfectAttributeImpl extends AttributeImpl implements ImperfectAttribute
{
  /**
   * The default value of the '{@link #getImperfectionType() <em>Imperfection Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImperfectionType()
   * @generated
   * @ordered
   */
  protected static final ImperfectAttributeTypeValue IMPERFECTION_TYPE_EDEFAULT = ImperfectAttributeTypeValue.NUMERIC_RANGE;

  /**
   * The cached value of the '{@link #getImperfectionType() <em>Imperfection Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImperfectionType()
   * @generated
   * @ordered
   */
  protected ImperfectAttributeTypeValue imperfectionType = IMPERFECTION_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImperfectAttributeImpl()
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
    return IArchimatePackage.Literals.IMPERFECT_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImperfectAttributeTypeValue getImperfectionType()
  {
    return imperfectionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImperfectionType(ImperfectAttributeTypeValue newImperfectionType)
  {
    ImperfectAttributeTypeValue oldImperfectionType = imperfectionType;
    imperfectionType = newImperfectionType == null ? IMPERFECTION_TYPE_EDEFAULT : newImperfectionType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.IMPERFECT_ATTRIBUTE__IMPERFECTION_TYPE, oldImperfectionType, imperfectionType));
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
      case IArchimatePackage.IMPERFECT_ATTRIBUTE__IMPERFECTION_TYPE:
        return getImperfectionType();
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
      case IArchimatePackage.IMPERFECT_ATTRIBUTE__IMPERFECTION_TYPE:
        setImperfectionType((ImperfectAttributeTypeValue)newValue);
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
      case IArchimatePackage.IMPERFECT_ATTRIBUTE__IMPERFECTION_TYPE:
        setImperfectionType(IMPERFECTION_TYPE_EDEFAULT);
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
      case IArchimatePackage.IMPERFECT_ATTRIBUTE__IMPERFECTION_TYPE:
        return imperfectionType != IMPERFECTION_TYPE_EDEFAULT;
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
    result.append(')');
    return result.toString();
  }

} //ImperfectAttributeImpl
