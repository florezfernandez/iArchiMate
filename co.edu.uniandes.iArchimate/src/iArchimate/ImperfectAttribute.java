/**
 */
package iArchimate;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imperfect Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iArchimate.ImperfectAttribute#getImperfectionType <em>Imperfection Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see iArchimate.IArchimatePackage#getImperfectAttribute()
 * @model
 * @generated
 */
public interface ImperfectAttribute extends Attribute
{
  /**
   * Returns the value of the '<em><b>Imperfection Type</b></em>' attribute.
   * The literals are from the enumeration {@link iArchimate.ImperfectAttributeTypeValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imperfection Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imperfection Type</em>' attribute.
   * @see iArchimate.ImperfectAttributeTypeValue
   * @see #setImperfectionType(ImperfectAttributeTypeValue)
   * @see iArchimate.IArchimatePackage#getImperfectAttribute_ImperfectionType()
   * @model required="true"
   * @generated
   */
  ImperfectAttributeTypeValue getImperfectionType();

  /**
   * Sets the value of the '{@link iArchimate.ImperfectAttribute#getImperfectionType <em>Imperfection Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imperfection Type</em>' attribute.
   * @see iArchimate.ImperfectAttributeTypeValue
   * @see #getImperfectionType()
   * @generated
   */
  void setImperfectionType(ImperfectAttributeTypeValue value);

} // ImperfectAttribute
