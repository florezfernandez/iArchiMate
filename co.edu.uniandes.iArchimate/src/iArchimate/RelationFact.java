/**
 */
package iArchimate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iArchimate.RelationFact#getRelName <em>Rel Name</em>}</li>
 *   <li>{@link iArchimate.RelationFact#getRelValue <em>Rel Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see iArchimate.IArchimatePackage#getRelationFact()
 * @model
 * @generated
 */
public interface RelationFact extends Fact
{
  /**
   * Returns the value of the '<em><b>Rel Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rel Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rel Name</em>' attribute.
   * @see #setRelName(String)
   * @see iArchimate.IArchimatePackage#getRelationFact_RelName()
   * @model required="true"
   * @generated
   */
  String getRelName();

  /**
   * Sets the value of the '{@link iArchimate.RelationFact#getRelName <em>Rel Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rel Name</em>' attribute.
   * @see #getRelName()
   * @generated
   */
  void setRelName(String value);

  /**
   * Returns the value of the '<em><b>Rel Value</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rel Value</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rel Value</em>' attribute list.
   * @see iArchimate.IArchimatePackage#getRelationFact_RelValue()
   * @model required="true"
   * @generated
   */
  EList<String> getRelValue();

} // RelationFact
