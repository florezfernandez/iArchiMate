/**
 */
package iArchimate.impl;

import iArchimate.IArchimatePackage;
import iArchimate.Person;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iArchimate.impl.PersonImpl#getOrganizationalUnit <em>Organizational Unit</em>}</li>
 *   <li>{@link iArchimate.impl.PersonImpl#getRol <em>Rol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends SourceImpl implements Person
{
  /**
   * The default value of the '{@link #getOrganizationalUnit() <em>Organizational Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrganizationalUnit()
   * @generated
   * @ordered
   */
  protected static final String ORGANIZATIONAL_UNIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOrganizationalUnit() <em>Organizational Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrganizationalUnit()
   * @generated
   * @ordered
   */
  protected String organizationalUnit = ORGANIZATIONAL_UNIT_EDEFAULT;

  /**
   * The default value of the '{@link #getRol() <em>Rol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRol()
   * @generated
   * @ordered
   */
  protected static final String ROL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRol() <em>Rol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRol()
   * @generated
   * @ordered
   */
  protected String rol = ROL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PersonImpl()
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
    return IArchimatePackage.Literals.PERSON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOrganizationalUnit()
  {
    return organizationalUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrganizationalUnit(String newOrganizationalUnit)
  {
    String oldOrganizationalUnit = organizationalUnit;
    organizationalUnit = newOrganizationalUnit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.PERSON__ORGANIZATIONAL_UNIT, oldOrganizationalUnit, organizationalUnit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRol()
  {
    return rol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRol(String newRol)
  {
    String oldRol = rol;
    rol = newRol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.PERSON__ROL, oldRol, rol));
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
      case IArchimatePackage.PERSON__ORGANIZATIONAL_UNIT:
        return getOrganizationalUnit();
      case IArchimatePackage.PERSON__ROL:
        return getRol();
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
      case IArchimatePackage.PERSON__ORGANIZATIONAL_UNIT:
        setOrganizationalUnit((String)newValue);
        return;
      case IArchimatePackage.PERSON__ROL:
        setRol((String)newValue);
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
      case IArchimatePackage.PERSON__ORGANIZATIONAL_UNIT:
        setOrganizationalUnit(ORGANIZATIONAL_UNIT_EDEFAULT);
        return;
      case IArchimatePackage.PERSON__ROL:
        setRol(ROL_EDEFAULT);
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
      case IArchimatePackage.PERSON__ORGANIZATIONAL_UNIT:
        return ORGANIZATIONAL_UNIT_EDEFAULT == null ? organizationalUnit != null : !ORGANIZATIONAL_UNIT_EDEFAULT.equals(organizationalUnit);
      case IArchimatePackage.PERSON__ROL:
        return ROL_EDEFAULT == null ? rol != null : !ROL_EDEFAULT.equals(rol);
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
    result.append(" (organizationalUnit: ");
    result.append(organizationalUnit);
    result.append(", rol: ");
    result.append(rol);
    result.append(')');
    return result.toString();
  }

} //PersonImpl
