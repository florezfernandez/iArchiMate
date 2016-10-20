/**
 */
package iArchimate;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imperfect Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iArchimate.ImperfectRelation#getImperfectionType <em>Imperfection Type</em>}</li>
 *   <li>{@link iArchimate.ImperfectRelation#getCertaintyDegree <em>Certainty Degree</em>}</li>
 * </ul>
 * </p>
 *
 * @see iArchimate.IArchimatePackage#getImperfectRelation()
 * @model annotation="gmf.link source='source' target='target' label='name' target.decoration='arrow' label.pattern='{0}' source.decoration='none' color='0,0,255'"
 * @generated
 */
public interface ImperfectRelation extends Relation
{
  /**
   * Returns the value of the '<em><b>Imperfection Type</b></em>' attribute.
   * The literals are from the enumeration {@link iArchimate.ImperfectRelationType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imperfection Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imperfection Type</em>' attribute.
   * @see iArchimate.ImperfectRelationType
   * @see #setImperfectionType(ImperfectRelationType)
   * @see iArchimate.IArchimatePackage#getImperfectRelation_ImperfectionType()
   * @model required="true"
   * @generated
   */
  ImperfectRelationType getImperfectionType();

  /**
   * Sets the value of the '{@link iArchimate.ImperfectRelation#getImperfectionType <em>Imperfection Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imperfection Type</em>' attribute.
   * @see iArchimate.ImperfectRelationType
   * @see #getImperfectionType()
   * @generated
   */
  void setImperfectionType(ImperfectRelationType value);

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
   * @see iArchimate.IArchimatePackage#getImperfectRelation_CertaintyDegree()
   * @model
   * @generated
   */
  double getCertaintyDegree();

  /**
   * Sets the value of the '{@link iArchimate.ImperfectRelation#getCertaintyDegree <em>Certainty Degree</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Certainty Degree</em>' attribute.
   * @see #getCertaintyDegree()
   * @generated
   */
  void setCertaintyDegree(double value);

} // ImperfectRelation
