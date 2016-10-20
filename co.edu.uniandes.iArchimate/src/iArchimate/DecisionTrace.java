/**
 */
package iArchimate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iArchimate.DecisionTrace#getIdDecisionTrace <em>Id Decision Trace</em>}</li>
 *   <li>{@link iArchimate.DecisionTrace#getDecisions <em>Decisions</em>}</li>
 *   <li>{@link iArchimate.DecisionTrace#getFacts <em>Facts</em>}</li>
 *   <li>{@link iArchimate.DecisionTrace#getObservations <em>Observations</em>}</li>
 *   <li>{@link iArchimate.DecisionTrace#getSources <em>Sources</em>}</li>
 * </ul>
 * </p>
 *
 * @see iArchimate.IArchimatePackage#getDecisionTrace()
 * @model annotation="gmf.node figure='rounded' label.icon='true' label='idDecisionTrace' label.pattern='{0}' size='100,60'"
 * @generated
 */
public interface DecisionTrace extends EObject
{
  /**
   * Returns the value of the '<em><b>Id Decision Trace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id Decision Trace</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id Decision Trace</em>' attribute.
   * @see #setIdDecisionTrace(String)
   * @see iArchimate.IArchimatePackage#getDecisionTrace_IdDecisionTrace()
   * @model required="true"
   * @generated
   */
  String getIdDecisionTrace();

  /**
   * Sets the value of the '{@link iArchimate.DecisionTrace#getIdDecisionTrace <em>Id Decision Trace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id Decision Trace</em>' attribute.
   * @see #getIdDecisionTrace()
   * @generated
   */
  void setIdDecisionTrace(String value);

  /**
   * Returns the value of the '<em><b>Decisions</b></em>' containment reference list.
   * The list contents are of type {@link iArchimate.Decision}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decisions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decisions</em>' containment reference list.
   * @see iArchimate.IArchimatePackage#getDecisionTrace_Decisions()
   * @model containment="true"
   * @generated
   */
  EList<Decision> getDecisions();

  /**
   * Returns the value of the '<em><b>Facts</b></em>' containment reference list.
   * The list contents are of type {@link iArchimate.Fact}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Facts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Facts</em>' containment reference list.
   * @see iArchimate.IArchimatePackage#getDecisionTrace_Facts()
   * @model containment="true"
   * @generated
   */
  EList<Fact> getFacts();

  /**
   * Returns the value of the '<em><b>Observations</b></em>' containment reference list.
   * The list contents are of type {@link iArchimate.Observation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Observations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Observations</em>' containment reference list.
   * @see iArchimate.IArchimatePackage#getDecisionTrace_Observations()
   * @model containment="true"
   * @generated
   */
  EList<Observation> getObservations();

  /**
   * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
   * The list contents are of type {@link iArchimate.Source}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sources</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sources</em>' containment reference list.
   * @see iArchimate.IArchimatePackage#getDecisionTrace_Sources()
   * @model containment="true"
   * @generated
   */
  EList<Source> getSources();

} // DecisionTrace
