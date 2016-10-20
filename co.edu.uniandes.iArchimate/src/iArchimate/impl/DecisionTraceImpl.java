/**
 */
package iArchimate.impl;

import iArchimate.Decision;
import iArchimate.DecisionTrace;
import iArchimate.Fact;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iArchimate.impl.DecisionTraceImpl#getIdDecisionTrace <em>Id Decision Trace</em>}</li>
 *   <li>{@link iArchimate.impl.DecisionTraceImpl#getDecisions <em>Decisions</em>}</li>
 *   <li>{@link iArchimate.impl.DecisionTraceImpl#getFacts <em>Facts</em>}</li>
 *   <li>{@link iArchimate.impl.DecisionTraceImpl#getObservations <em>Observations</em>}</li>
 *   <li>{@link iArchimate.impl.DecisionTraceImpl#getSources <em>Sources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecisionTraceImpl extends EObjectImpl implements DecisionTrace
{
  /**
   * The default value of the '{@link #getIdDecisionTrace() <em>Id Decision Trace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdDecisionTrace()
   * @generated
   * @ordered
   */
  protected static final String ID_DECISION_TRACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdDecisionTrace() <em>Id Decision Trace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdDecisionTrace()
   * @generated
   * @ordered
   */
  protected String idDecisionTrace = ID_DECISION_TRACE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDecisions() <em>Decisions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecisions()
   * @generated
   * @ordered
   */
  protected EList<Decision> decisions;

  /**
   * The cached value of the '{@link #getFacts() <em>Facts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFacts()
   * @generated
   * @ordered
   */
  protected EList<Fact> facts;

  /**
   * The cached value of the '{@link #getObservations() <em>Observations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObservations()
   * @generated
   * @ordered
   */
  protected EList<Observation> observations;

  /**
   * The cached value of the '{@link #getSources() <em>Sources</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSources()
   * @generated
   * @ordered
   */
  protected EList<Source> sources;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DecisionTraceImpl()
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
    return IArchimatePackage.Literals.DECISION_TRACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdDecisionTrace()
  {
    return idDecisionTrace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdDecisionTrace(String newIdDecisionTrace)
  {
    String oldIdDecisionTrace = idDecisionTrace;
    idDecisionTrace = newIdDecisionTrace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.DECISION_TRACE__ID_DECISION_TRACE, oldIdDecisionTrace, idDecisionTrace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Decision> getDecisions()
  {
    if (decisions == null)
    {
      decisions = new EObjectContainmentEList<Decision>(Decision.class, this, IArchimatePackage.DECISION_TRACE__DECISIONS);
    }
    return decisions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Fact> getFacts()
  {
    if (facts == null)
    {
      facts = new EObjectContainmentEList<Fact>(Fact.class, this, IArchimatePackage.DECISION_TRACE__FACTS);
    }
    return facts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Observation> getObservations()
  {
    if (observations == null)
    {
      observations = new EObjectContainmentEList<Observation>(Observation.class, this, IArchimatePackage.DECISION_TRACE__OBSERVATIONS);
    }
    return observations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Source> getSources()
  {
    if (sources == null)
    {
      sources = new EObjectContainmentEList<Source>(Source.class, this, IArchimatePackage.DECISION_TRACE__SOURCES);
    }
    return sources;
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
      case IArchimatePackage.DECISION_TRACE__DECISIONS:
        return ((InternalEList<?>)getDecisions()).basicRemove(otherEnd, msgs);
      case IArchimatePackage.DECISION_TRACE__FACTS:
        return ((InternalEList<?>)getFacts()).basicRemove(otherEnd, msgs);
      case IArchimatePackage.DECISION_TRACE__OBSERVATIONS:
        return ((InternalEList<?>)getObservations()).basicRemove(otherEnd, msgs);
      case IArchimatePackage.DECISION_TRACE__SOURCES:
        return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
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
      case IArchimatePackage.DECISION_TRACE__ID_DECISION_TRACE:
        return getIdDecisionTrace();
      case IArchimatePackage.DECISION_TRACE__DECISIONS:
        return getDecisions();
      case IArchimatePackage.DECISION_TRACE__FACTS:
        return getFacts();
      case IArchimatePackage.DECISION_TRACE__OBSERVATIONS:
        return getObservations();
      case IArchimatePackage.DECISION_TRACE__SOURCES:
        return getSources();
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
      case IArchimatePackage.DECISION_TRACE__ID_DECISION_TRACE:
        setIdDecisionTrace((String)newValue);
        return;
      case IArchimatePackage.DECISION_TRACE__DECISIONS:
        getDecisions().clear();
        getDecisions().addAll((Collection<? extends Decision>)newValue);
        return;
      case IArchimatePackage.DECISION_TRACE__FACTS:
        getFacts().clear();
        getFacts().addAll((Collection<? extends Fact>)newValue);
        return;
      case IArchimatePackage.DECISION_TRACE__OBSERVATIONS:
        getObservations().clear();
        getObservations().addAll((Collection<? extends Observation>)newValue);
        return;
      case IArchimatePackage.DECISION_TRACE__SOURCES:
        getSources().clear();
        getSources().addAll((Collection<? extends Source>)newValue);
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
      case IArchimatePackage.DECISION_TRACE__ID_DECISION_TRACE:
        setIdDecisionTrace(ID_DECISION_TRACE_EDEFAULT);
        return;
      case IArchimatePackage.DECISION_TRACE__DECISIONS:
        getDecisions().clear();
        return;
      case IArchimatePackage.DECISION_TRACE__FACTS:
        getFacts().clear();
        return;
      case IArchimatePackage.DECISION_TRACE__OBSERVATIONS:
        getObservations().clear();
        return;
      case IArchimatePackage.DECISION_TRACE__SOURCES:
        getSources().clear();
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
      case IArchimatePackage.DECISION_TRACE__ID_DECISION_TRACE:
        return ID_DECISION_TRACE_EDEFAULT == null ? idDecisionTrace != null : !ID_DECISION_TRACE_EDEFAULT.equals(idDecisionTrace);
      case IArchimatePackage.DECISION_TRACE__DECISIONS:
        return decisions != null && !decisions.isEmpty();
      case IArchimatePackage.DECISION_TRACE__FACTS:
        return facts != null && !facts.isEmpty();
      case IArchimatePackage.DECISION_TRACE__OBSERVATIONS:
        return observations != null && !observations.isEmpty();
      case IArchimatePackage.DECISION_TRACE__SOURCES:
        return sources != null && !sources.isEmpty();
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
    result.append(" (idDecisionTrace: ");
    result.append(idDecisionTrace);
    result.append(')');
    return result.toString();
  }

} //DecisionTraceImpl
