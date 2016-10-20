/**
 */
package iArchimate.impl;

import iArchimate.Attribute;
import iArchimate.DecisionTrace;
import iArchimate.Element;
import iArchimate.ElementTypeName;
import iArchimate.IArchimatePackage;
import iArchimate.Relation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iArchimate.impl.ElementImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link iArchimate.impl.ElementImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link iArchimate.impl.ElementImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link iArchimate.impl.ElementImpl#getElementDecisionTrace <em>Element Decision Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementImpl extends ComponentImpl implements Element
{
  /**
   * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeName()
   * @generated
   * @ordered
   */
  protected static final ElementTypeName TYPE_NAME_EDEFAULT = ElementTypeName.NOT_SELECTED;

  /**
   * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeName()
   * @generated
   * @ordered
   */
  protected ElementTypeName typeName = TYPE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * The cached value of the '{@link #getRelations() <em>Relations</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelations()
   * @generated
   * @ordered
   */
  protected EList<Relation> relations;

  /**
   * The cached value of the '{@link #getElementDecisionTrace() <em>Element Decision Trace</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementDecisionTrace()
   * @generated
   * @ordered
   */
  protected DecisionTrace elementDecisionTrace;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementImpl()
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
    return IArchimatePackage.Literals.ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementTypeName getTypeName()
  {
    return typeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeName(ElementTypeName newTypeName)
  {
    ElementTypeName oldTypeName = typeName;
    typeName = newTypeName == null ? TYPE_NAME_EDEFAULT : newTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.ELEMENT__TYPE_NAME, oldTypeName, typeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, IArchimatePackage.ELEMENT__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Relation> getRelations()
  {
    if (relations == null)
    {
      relations = new EObjectWithInverseResolvingEList<Relation>(Relation.class, this, IArchimatePackage.ELEMENT__RELATIONS, IArchimatePackage.RELATION__SOURCE);
    }
    return relations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecisionTrace getElementDecisionTrace()
  {
    if (elementDecisionTrace != null && elementDecisionTrace.eIsProxy())
    {
      InternalEObject oldElementDecisionTrace = (InternalEObject)elementDecisionTrace;
      elementDecisionTrace = (DecisionTrace)eResolveProxy(oldElementDecisionTrace);
      if (elementDecisionTrace != oldElementDecisionTrace)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IArchimatePackage.ELEMENT__ELEMENT_DECISION_TRACE, oldElementDecisionTrace, elementDecisionTrace));
      }
    }
    return elementDecisionTrace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecisionTrace basicGetElementDecisionTrace()
  {
    return elementDecisionTrace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementDecisionTrace(DecisionTrace newElementDecisionTrace)
  {
    DecisionTrace oldElementDecisionTrace = elementDecisionTrace;
    elementDecisionTrace = newElementDecisionTrace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.ELEMENT__ELEMENT_DECISION_TRACE, oldElementDecisionTrace, elementDecisionTrace));
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
      case IArchimatePackage.ELEMENT__RELATIONS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelations()).basicAdd(otherEnd, msgs);
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
      case IArchimatePackage.ELEMENT__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case IArchimatePackage.ELEMENT__RELATIONS:
        return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
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
      case IArchimatePackage.ELEMENT__TYPE_NAME:
        return getTypeName();
      case IArchimatePackage.ELEMENT__ATTRIBUTES:
        return getAttributes();
      case IArchimatePackage.ELEMENT__RELATIONS:
        return getRelations();
      case IArchimatePackage.ELEMENT__ELEMENT_DECISION_TRACE:
        if (resolve) return getElementDecisionTrace();
        return basicGetElementDecisionTrace();
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
      case IArchimatePackage.ELEMENT__TYPE_NAME:
        setTypeName((ElementTypeName)newValue);
        return;
      case IArchimatePackage.ELEMENT__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case IArchimatePackage.ELEMENT__RELATIONS:
        getRelations().clear();
        getRelations().addAll((Collection<? extends Relation>)newValue);
        return;
      case IArchimatePackage.ELEMENT__ELEMENT_DECISION_TRACE:
        setElementDecisionTrace((DecisionTrace)newValue);
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
      case IArchimatePackage.ELEMENT__TYPE_NAME:
        setTypeName(TYPE_NAME_EDEFAULT);
        return;
      case IArchimatePackage.ELEMENT__ATTRIBUTES:
        getAttributes().clear();
        return;
      case IArchimatePackage.ELEMENT__RELATIONS:
        getRelations().clear();
        return;
      case IArchimatePackage.ELEMENT__ELEMENT_DECISION_TRACE:
        setElementDecisionTrace((DecisionTrace)null);
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
      case IArchimatePackage.ELEMENT__TYPE_NAME:
        return typeName != TYPE_NAME_EDEFAULT;
      case IArchimatePackage.ELEMENT__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case IArchimatePackage.ELEMENT__RELATIONS:
        return relations != null && !relations.isEmpty();
      case IArchimatePackage.ELEMENT__ELEMENT_DECISION_TRACE:
        return elementDecisionTrace != null;
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
    result.append(" (typeName: ");
    result.append(typeName);
    result.append(')');
    return result.toString();
  }

} //ElementImpl
