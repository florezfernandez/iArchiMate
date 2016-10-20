/**
 */
package iArchimate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iArchimate.AttributeFact#getAttName <em>Att Name</em>}</li>
 *   <li>{@link iArchimate.AttributeFact#getAttValue <em>Att Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see iArchimate.IArchimatePackage#getAttributeFact()
 * @model
 * @generated
 */
public interface AttributeFact extends Fact
{
  /**
   * Returns the value of the '<em><b>Att Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Att Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Att Name</em>' attribute.
   * @see #setAttName(String)
   * @see iArchimate.IArchimatePackage#getAttributeFact_AttName()
   * @model required="true"
   * @generated
   */
  String getAttName();

  /**
   * Sets the value of the '{@link iArchimate.AttributeFact#getAttName <em>Att Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Att Name</em>' attribute.
   * @see #getAttName()
   * @generated
   */
  void setAttName(String value);

  /**
   * Returns the value of the '<em><b>Att Value</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Att Value</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Att Value</em>' attribute list.
   * @see iArchimate.IArchimatePackage#getAttributeFact_AttValue()
   * @model required="true"
   * @generated
   */
  EList<String> getAttValue();

} // AttributeFact
