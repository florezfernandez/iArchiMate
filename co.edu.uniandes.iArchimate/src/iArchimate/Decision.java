/**
 */
package iArchimate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iArchimate.Decision#getIdDecision <em>Id Decision</em>}</li>
 *   <li>{@link iArchimate.Decision#getResult <em>Result</em>}</li>
 *   <li>{@link iArchimate.Decision#getDecisionFacts <em>Decision Facts</em>}</li>
 * </ul>
 * </p>
 *
 * @see iArchimate.IArchimatePackage#getDecision()
 * @model
 * @generated
 */
public interface Decision extends EObject
{
  /**
   * Returns the value of the '<em><b>Id Decision</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id Decision</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id Decision</em>' attribute.
   * @see #setIdDecision(String)
   * @see iArchimate.IArchimatePackage#getDecision_IdDecision()
   * @model required="true"
   * @generated
   */
  String getIdDecision();

  /**
   * Sets the value of the '{@link iArchimate.Decision#getIdDecision <em>Id Decision</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id Decision</em>' attribute.
   * @see #getIdDecision()
   * @generated
   */
  void setIdDecision(String value);

  /**
   * Returns the value of the '<em><b>Result</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result</em>' attribute list.
   * @see iArchimate.IArchimatePackage#getDecision_Result()
   * @model required="true"
   * @generated
   */
  EList<String> getResult();

  /**
   * Returns the value of the '<em><b>Decision Facts</b></em>' reference list.
   * The list contents are of type {@link iArchimate.Fact}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decision Facts</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decision Facts</em>' reference list.
   * @see iArchimate.IArchimatePackage#getDecision_DecisionFacts()
   * @model required="true"
   * @generated
   */
  EList<Fact> getDecisionFacts();

} // Decision
