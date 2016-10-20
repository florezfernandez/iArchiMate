/**
 */
package iArchimate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iArchimate.Source#getName <em>Name</em>}</li>
 *   <li>{@link iArchimate.Source#getReliability <em>Reliability</em>}</li>
 *   <li>{@link iArchimate.Source#getCertaintyDegree <em>Certainty Degree</em>}</li>
 *   <li>{@link iArchimate.Source#getSourceObservations <em>Source Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @see iArchimate.IArchimatePackage#getSource()
 * @model abstract="true"
 * @generated
 */
public interface Source extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see iArchimate.IArchimatePackage#getSource_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link iArchimate.Source#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Reliability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reliability</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reliability</em>' attribute.
   * @see #setReliability(double)
   * @see iArchimate.IArchimatePackage#getSource_Reliability()
   * @model
   * @generated
   */
  double getReliability();

  /**
   * Sets the value of the '{@link iArchimate.Source#getReliability <em>Reliability</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reliability</em>' attribute.
   * @see #getReliability()
   * @generated
   */
  void setReliability(double value);

  /**
   * Returns the value of the '<em><b>Certainty Degree</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Certainty Degree</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Certainty Degree</em>' attribute.
   * @see #setCertaintyDegree(double)
   * @see iArchimate.IArchimatePackage#getSource_CertaintyDegree()
   * @model
   * @generated
   */
  double getCertaintyDegree();

  /**
   * Sets the value of the '{@link iArchimate.Source#getCertaintyDegree <em>Certainty Degree</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Certainty Degree</em>' attribute.
   * @see #getCertaintyDegree()
   * @generated
   */
  void setCertaintyDegree(double value);

  /**
   * Returns the value of the '<em><b>Source Observations</b></em>' reference list.
   * The list contents are of type {@link iArchimate.Observation}.
   * It is bidirectional and its opposite is '{@link iArchimate.Observation#getBelongsTo <em>Belongs To</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Observations</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Observations</em>' reference list.
   * @see iArchimate.IArchimatePackage#getSource_SourceObservations()
   * @see iArchimate.Observation#getBelongsTo
   * @model opposite="belongsTo"
   * @generated
   */
  EList<Observation> getSourceObservations();

} // Source
