/**
 */
package iArchimate;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iArchimate.Observation#getIdObservation <em>Id Observation</em>}</li>
 *   <li>{@link iArchimate.Observation#getReferenceDate <em>Reference Date</em>}</li>
 *   <li>{@link iArchimate.Observation#getObservationFacts <em>Observation Facts</em>}</li>
 *   <li>{@link iArchimate.Observation#getBelongsTo <em>Belongs To</em>}</li>
 * </ul>
 * </p>
 *
 * @see iArchimate.IArchimatePackage#getObservation()
 * @model
 * @generated
 */
public interface Observation extends EObject
{
  /**
   * Returns the value of the '<em><b>Id Observation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id Observation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id Observation</em>' attribute.
   * @see #setIdObservation(String)
   * @see iArchimate.IArchimatePackage#getObservation_IdObservation()
   * @model required="true"
   * @generated
   */
  String getIdObservation();

  /**
   * Sets the value of the '{@link iArchimate.Observation#getIdObservation <em>Id Observation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id Observation</em>' attribute.
   * @see #getIdObservation()
   * @generated
   */
  void setIdObservation(String value);

  /**
   * Returns the value of the '<em><b>Reference Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference Date</em>' attribute.
   * @see #setReferenceDate(Date)
   * @see iArchimate.IArchimatePackage#getObservation_ReferenceDate()
   * @model
   * @generated
   */
  Date getReferenceDate();

  /**
   * Sets the value of the '{@link iArchimate.Observation#getReferenceDate <em>Reference Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference Date</em>' attribute.
   * @see #getReferenceDate()
   * @generated
   */
  void setReferenceDate(Date value);

  /**
   * Returns the value of the '<em><b>Observation Facts</b></em>' reference list.
   * The list contents are of type {@link iArchimate.Fact}.
   * It is bidirectional and its opposite is '{@link iArchimate.Fact#getIsFactOf <em>Is Fact Of</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Observation Facts</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Observation Facts</em>' reference list.
   * @see iArchimate.IArchimatePackage#getObservation_ObservationFacts()
   * @see iArchimate.Fact#getIsFactOf
   * @model opposite="isFactOf"
   * @generated
   */
  EList<Fact> getObservationFacts();

  /**
   * Returns the value of the '<em><b>Belongs To</b></em>' reference.
   * It is bidirectional and its opposite is '{@link iArchimate.Source#getSourceObservations <em>Source Observations</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Belongs To</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Belongs To</em>' reference.
   * @see #setBelongsTo(Source)
   * @see iArchimate.IArchimatePackage#getObservation_BelongsTo()
   * @see iArchimate.Source#getSourceObservations
   * @model opposite="sourceObservations" required="true"
   * @generated
   */
  Source getBelongsTo();

  /**
   * Sets the value of the '{@link iArchimate.Observation#getBelongsTo <em>Belongs To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Belongs To</em>' reference.
   * @see #getBelongsTo()
   * @generated
   */
  void setBelongsTo(Source value);

} // Observation
