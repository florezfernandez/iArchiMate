/**
 */
package iArchimate.impl;

import iArchimate.AttributeFact;
import iArchimate.IArchimatePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Fact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iArchimate.impl.AttributeFactImpl#getAttName <em>Att Name</em>}</li>
 *   <li>{@link iArchimate.impl.AttributeFactImpl#getAttValue <em>Att Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeFactImpl extends FactImpl implements AttributeFact
{
  /**
   * The default value of the '{@link #getAttName() <em>Att Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttName()
   * @generated
   * @ordered
   */
  protected static final String ATT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttName() <em>Att Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttName()
   * @generated
   * @ordered
   */
  protected String attName = ATT_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAttValue() <em>Att Value</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttValue()
   * @generated
   * @ordered
   */
  protected EList<String> attValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeFactImpl()
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
    return IArchimatePackage.Literals.ATTRIBUTE_FACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAttName()
  {
    return attName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttName(String newAttName)
  {
    String oldAttName = attName;
    attName = newAttName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.ATTRIBUTE_FACT__ATT_NAME, oldAttName, attName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getAttValue()
  {
    if (attValue == null)
    {
      attValue = new EDataTypeUniqueEList<String>(String.class, this, IArchimatePackage.ATTRIBUTE_FACT__ATT_VALUE);
    }
    return attValue;
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
      case IArchimatePackage.ATTRIBUTE_FACT__ATT_NAME:
        return getAttName();
      case IArchimatePackage.ATTRIBUTE_FACT__ATT_VALUE:
        return getAttValue();
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
      case IArchimatePackage.ATTRIBUTE_FACT__ATT_NAME:
        setAttName((String)newValue);
        return;
      case IArchimatePackage.ATTRIBUTE_FACT__ATT_VALUE:
        getAttValue().clear();
        getAttValue().addAll((Collection<? extends String>)newValue);
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
      case IArchimatePackage.ATTRIBUTE_FACT__ATT_NAME:
        setAttName(ATT_NAME_EDEFAULT);
        return;
      case IArchimatePackage.ATTRIBUTE_FACT__ATT_VALUE:
        getAttValue().clear();
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
      case IArchimatePackage.ATTRIBUTE_FACT__ATT_NAME:
        return ATT_NAME_EDEFAULT == null ? attName != null : !ATT_NAME_EDEFAULT.equals(attName);
      case IArchimatePackage.ATTRIBUTE_FACT__ATT_VALUE:
        return attValue != null && !attValue.isEmpty();
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
    result.append(" (attName: ");
    result.append(attName);
    result.append(", attValue: ");
    result.append(attValue);
    result.append(')');
    return result.toString();
  }

} //AttributeFactImpl
