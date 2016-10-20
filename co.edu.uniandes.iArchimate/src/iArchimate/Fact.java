/**
 */
package iArchimate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iArchimate.Fact#getIsFactOf <em>Is Fact Of</em>}</li>
 *   <li>{@link iArchimate.Fact#getIdFact <em>Id Fact</em>}</li>
 *   <li>{@link iArchimate.Fact#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see iArchimate.IArchimatePackage#getFact()
 * @model
 * @generated
 */
public interface Fact extends EObject
{
  /**
   * Returns the value of the '<em><b>Is Fact Of</b></em>' reference list.
   * The list contents are of type {@link iArchimate.Observation}.
   * It is bidirectional and its opposite is '{@link iArchimate.Observation#getObservationFacts <em>Observation Facts</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Fact Of</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Fact Of</em>' reference list.
   * @see iArchimate.IArchimatePackage#getFact_IsFactOf()
   * @see iArchimate.Observation#getObservationFacts
   * @model opposite="observationFacts" required="true"
   * @generated
   */
  EList<Observation> getIsFactOf();

  /**
   * Returns the value of the '<em><b>Id Fact</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id Fact</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id Fact</em>' attribute.
   * @see #setIdFact(String)
   * @see iArchimate.IArchimatePackage#getFact_IdFact()
   * @model required="true"
   * @generated
   */
  String getIdFact();

  /**
   * Sets the value of the '{@link iArchimate.Fact#getIdFact <em>Id Fact</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id Fact</em>' attribute.
   * @see #getIdFact()
   * @generated
   */
  void setIdFact(String value);

  /**
   * Returns the value of the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' attribute.
   * @see #setElement(String)
   * @see iArchimate.IArchimatePackage#getFact_Element()
   * @model required="true"
   * @generated
   */
  String getElement();

  /**
   * Sets the value of the '{@link iArchimate.Fact#getElement <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' attribute.
   * @see #getElement()
   * @generated
   */
  void setElement(String value);

} // Fact
