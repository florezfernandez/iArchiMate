/**
 */
package iArchimate.impl;

import iArchimate.Component;
import iArchimate.DecisionTrace;
import iArchimate.IArchimatePackage;
import iArchimate.Model;
import iArchimate.Relation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iArchimate.impl.ModelImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link iArchimate.impl.ModelImpl#getDecisionTraces <em>Decision Traces</em>}</li>
 *   <li>{@link iArchimate.impl.ModelImpl#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends EObjectImpl implements Model
{
  /**
   * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelations()
   * @generated
   * @ordered
   */
  protected EList<Relation> relations;

  /**
   * The cached value of the '{@link #getDecisionTraces() <em>Decision Traces</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecisionTraces()
   * @generated
   * @ordered
   */
  protected EList<DecisionTrace> decisionTraces;

  /**
   * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponents()
   * @generated
   * @ordered
   */
  protected EList<Component> components;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return IArchimatePackage.Literals.MODEL;
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
      relations = new EObjectContainmentEList<Relation>(Relation.class, this, IArchimatePackage.MODEL__RELATIONS);
    }
    return relations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DecisionTrace> getDecisionTraces()
  {
    if (decisionTraces == null)
    {
      decisionTraces = new EObjectContainmentEList<DecisionTrace>(DecisionTrace.class, this, IArchimatePackage.MODEL__DECISION_TRACES);
    }
    return decisionTraces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Component> getComponents()
  {
    if (components == null)
    {
      components = new EObjectContainmentEList<Component>(Component.class, this, IArchimatePackage.MODEL__COMPONENTS);
    }
    return components;
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
      case IArchimatePackage.MODEL__RELATIONS:
        return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
      case IArchimatePackage.MODEL__DECISION_TRACES:
        return ((InternalEList<?>)getDecisionTraces()).basicRemove(otherEnd, msgs);
      case IArchimatePackage.MODEL__COMPONENTS:
        return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
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
      case IArchimatePackage.MODEL__RELATIONS:
        return getRelations();
      case IArchimatePackage.MODEL__DECISION_TRACES:
        return getDecisionTraces();
      case IArchimatePackage.MODEL__COMPONENTS:
        return getComponents();
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
      case IArchimatePackage.MODEL__RELATIONS:
        getRelations().clear();
        getRelations().addAll((Collection<? extends Relation>)newValue);
        return;
      case IArchimatePackage.MODEL__DECISION_TRACES:
        getDecisionTraces().clear();
        getDecisionTraces().addAll((Collection<? extends DecisionTrace>)newValue);
        return;
      case IArchimatePackage.MODEL__COMPONENTS:
        getComponents().clear();
        getComponents().addAll((Collection<? extends Component>)newValue);
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
      case IArchimatePackage.MODEL__RELATIONS:
        getRelations().clear();
        return;
      case IArchimatePackage.MODEL__DECISION_TRACES:
        getDecisionTraces().clear();
        return;
      case IArchimatePackage.MODEL__COMPONENTS:
        getComponents().clear();
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
      case IArchimatePackage.MODEL__RELATIONS:
        return relations != null && !relations.isEmpty();
      case IArchimatePackage.MODEL__DECISION_TRACES:
        return decisionTraces != null && !decisionTraces.isEmpty();
      case IArchimatePackage.MODEL__COMPONENTS:
        return components != null && !components.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
