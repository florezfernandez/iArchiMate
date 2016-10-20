/**
 */
package iArchimate.impl;

import iArchimate.Decision;
import iArchimate.Fact;
import iArchimate.IArchimatePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iArchimate.impl.DecisionImpl#getIdDecision <em>Id Decision</em>}</li>
 *   <li>{@link iArchimate.impl.DecisionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link iArchimate.impl.DecisionImpl#getDecisionFacts <em>Decision Facts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecisionImpl extends EObjectImpl implements Decision
{
  /**
   * The default value of the '{@link #getIdDecision() <em>Id Decision</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdDecision()
   * @generated
   * @ordered
   */
  protected static final String ID_DECISION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdDecision() <em>Id Decision</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdDecision()
   * @generated
   * @ordered
   */
  protected String idDecision = ID_DECISION_EDEFAULT;

  /**
   * The cached value of the '{@link #getResult() <em>Result</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResult()
   * @generated
   * @ordered
   */
  protected EList<String> result;

  /**
   * The cached value of the '{@link #getDecisionFacts() <em>Decision Facts</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecisionFacts()
   * @generated
   * @ordered
   */
  protected EList<Fact> decisionFacts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DecisionImpl()
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
    return IArchimatePackage.Literals.DECISION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdDecision()
  {
    return idDecision;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdDecision(String newIdDecision)
  {
    String oldIdDecision = idDecision;
    idDecision = newIdDecision;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.DECISION__ID_DECISION, oldIdDecision, idDecision));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getResult()
  {
    if (result == null)
    {
      result = new EDataTypeUniqueEList<String>(String.class, this, IArchimatePackage.DECISION__RESULT);
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Fact> getDecisionFacts()
  {
    if (decisionFacts == null)
    {
      decisionFacts = new EObjectResolvingEList<Fact>(Fact.class, this, IArchimatePackage.DECISION__DECISION_FACTS);
    }
    return decisionFacts;
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
      case IArchimatePackage.DECISION__ID_DECISION:
        return getIdDecision();
      case IArchimatePackage.DECISION__RESULT:
        return getResult();
      case IArchimatePackage.DECISION__DECISION_FACTS:
        return getDecisionFacts();
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
      case IArchimatePackage.DECISION__ID_DECISION:
        setIdDecision((String)newValue);
        return;
      case IArchimatePackage.DECISION__RESULT:
        getResult().clear();
        getResult().addAll((Collection<? extends String>)newValue);
        return;
      case IArchimatePackage.DECISION__DECISION_FACTS:
        getDecisionFacts().clear();
        getDecisionFacts().addAll((Collection<? extends Fact>)newValue);
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
      case IArchimatePackage.DECISION__ID_DECISION:
        setIdDecision(ID_DECISION_EDEFAULT);
        return;
      case IArchimatePackage.DECISION__RESULT:
        getResult().clear();
        return;
      case IArchimatePackage.DECISION__DECISION_FACTS:
        getDecisionFacts().clear();
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
      case IArchimatePackage.DECISION__ID_DECISION:
        return ID_DECISION_EDEFAULT == null ? idDecision != null : !ID_DECISION_EDEFAULT.equals(idDecision);
      case IArchimatePackage.DECISION__RESULT:
        return result != null && !result.isEmpty();
      case IArchimatePackage.DECISION__DECISION_FACTS:
        return decisionFacts != null && !decisionFacts.isEmpty();
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
    result.append(" (idDecision: ");
    result.append(idDecision);
    result.append(", result: ");
    result.append(result);
    result.append(')');
    return result.toString();
  }

} //DecisionImpl
