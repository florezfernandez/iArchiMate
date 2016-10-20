/**
 */
package iArchimate.impl;

import iArchimate.IArchimatePackage;
import iArchimate.RelationFact;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Fact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iArchimate.impl.RelationFactImpl#getRelName <em>Rel Name</em>}</li>
 *   <li>{@link iArchimate.impl.RelationFactImpl#getRelValue <em>Rel Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationFactImpl extends FactImpl implements RelationFact
{
  /**
   * The default value of the '{@link #getRelName() <em>Rel Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelName()
   * @generated
   * @ordered
   */
  protected static final String REL_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRelName() <em>Rel Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelName()
   * @generated
   * @ordered
   */
  protected String relName = REL_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getRelValue() <em>Rel Value</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelValue()
   * @generated
   * @ordered
   */
  protected EList<String> relValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationFactImpl()
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
    return IArchimatePackage.Literals.RELATION_FACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRelName()
  {
    return relName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelName(String newRelName)
  {
    String oldRelName = relName;
    relName = newRelName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.RELATION_FACT__REL_NAME, oldRelName, relName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getRelValue()
  {
    if (relValue == null)
    {
      relValue = new EDataTypeUniqueEList<String>(String.class, this, IArchimatePackage.RELATION_FACT__REL_VALUE);
    }
    return relValue;
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
      case IArchimatePackage.RELATION_FACT__REL_NAME:
        return getRelName();
      case IArchimatePackage.RELATION_FACT__REL_VALUE:
        return getRelValue();
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
      case IArchimatePackage.RELATION_FACT__REL_NAME:
        setRelName((String)newValue);
        return;
      case IArchimatePackage.RELATION_FACT__REL_VALUE:
        getRelValue().clear();
        getRelValue().addAll((Collection<? extends String>)newValue);
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
      case IArchimatePackage.RELATION_FACT__REL_NAME:
        setRelName(REL_NAME_EDEFAULT);
        return;
      case IArchimatePackage.RELATION_FACT__REL_VALUE:
        getRelValue().clear();
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
      case IArchimatePackage.RELATION_FACT__REL_NAME:
        return REL_NAME_EDEFAULT == null ? relName != null : !REL_NAME_EDEFAULT.equals(relName);
      case IArchimatePackage.RELATION_FACT__REL_VALUE:
        return relValue != null && !relValue.isEmpty();
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
    result.append(" (relName: ");
    result.append(relName);
    result.append(", relValue: ");
    result.append(relValue);
    result.append(')');
    return result.toString();
  }

} //RelationFactImpl
