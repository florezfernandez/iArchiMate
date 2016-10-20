/**
 */
package iArchimate.impl;

import iArchimate.Fact;
import iArchimate.IArchimatePackage;
import iArchimate.Observation;

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
 * An implementation of the model object '<em><b>Fact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iArchimate.impl.FactImpl#getIsFactOf <em>Is Fact Of</em>}</li>
 *   <li>{@link iArchimate.impl.FactImpl#getIdFact <em>Id Fact</em>}</li>
 *   <li>{@link iArchimate.impl.FactImpl#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FactImpl extends EObjectImpl implements Fact
{
  /**
   * The cached value of the '{@link #getIsFactOf() <em>Is Fact Of</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsFactOf()
   * @generated
   * @ordered
   */
  protected EList<Observation> isFactOf;

  /**
   * The default value of the '{@link #getIdFact() <em>Id Fact</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdFact()
   * @generated
   * @ordered
   */
  protected static final String ID_FACT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdFact() <em>Id Fact</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdFact()
   * @generated
   * @ordered
   */
  protected String idFact = ID_FACT_EDEFAULT;

  /**
   * The default value of the '{@link #getElement() <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected static final String ELEMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected String element = ELEMENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FactImpl()
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
    return IArchimatePackage.Literals.FACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Observation> getIsFactOf()
  {
    if (isFactOf == null)
    {
      isFactOf = new EObjectWithInverseResolvingEList.ManyInverse<Observation>(Observation.class, this, IArchimatePackage.FACT__IS_FACT_OF, IArchimatePackage.OBSERVATION__OBSERVATION_FACTS);
    }
    return isFactOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdFact()
  {
    return idFact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdFact(String newIdFact)
  {
    String oldIdFact = idFact;
    idFact = newIdFact;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.FACT__ID_FACT, oldIdFact, idFact));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(String newElement)
  {
    String oldElement = element;
    element = newElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.FACT__ELEMENT, oldElement, element));
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
      case IArchimatePackage.FACT__IS_FACT_OF:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsFactOf()).basicAdd(otherEnd, msgs);
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
      case IArchimatePackage.FACT__IS_FACT_OF:
        return ((InternalEList<?>)getIsFactOf()).basicRemove(otherEnd, msgs);
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
      case IArchimatePackage.FACT__IS_FACT_OF:
        return getIsFactOf();
      case IArchimatePackage.FACT__ID_FACT:
        return getIdFact();
      case IArchimatePackage.FACT__ELEMENT:
        return getElement();
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
      case IArchimatePackage.FACT__IS_FACT_OF:
        getIsFactOf().clear();
        getIsFactOf().addAll((Collection<? extends Observation>)newValue);
        return;
      case IArchimatePackage.FACT__ID_FACT:
        setIdFact((String)newValue);
        return;
      case IArchimatePackage.FACT__ELEMENT:
        setElement((String)newValue);
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
      case IArchimatePackage.FACT__IS_FACT_OF:
        getIsFactOf().clear();
        return;
      case IArchimatePackage.FACT__ID_FACT:
        setIdFact(ID_FACT_EDEFAULT);
        return;
      case IArchimatePackage.FACT__ELEMENT:
        setElement(ELEMENT_EDEFAULT);
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
      case IArchimatePackage.FACT__IS_FACT_OF:
        return isFactOf != null && !isFactOf.isEmpty();
      case IArchimatePackage.FACT__ID_FACT:
        return ID_FACT_EDEFAULT == null ? idFact != null : !ID_FACT_EDEFAULT.equals(idFact);
      case IArchimatePackage.FACT__ELEMENT:
        return ELEMENT_EDEFAULT == null ? element != null : !ELEMENT_EDEFAULT.equals(element);
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
    result.append(" (idFact: ");
    result.append(idFact);
    result.append(", element: ");
    result.append(element);
    result.append(')');
    return result.toString();
  }

} //FactImpl
