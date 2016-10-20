/**
 */
package iArchimate;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iArchimate.InstanceFact#isExist <em>Exist</em>}</li>
 * </ul>
 * </p>
 *
 * @see iArchimate.IArchimatePackage#getInstanceFact()
 * @model
 * @generated
 */
public interface InstanceFact extends Fact
{
  /**
   * Returns the value of the '<em><b>Exist</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exist</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exist</em>' attribute.
   * @see #setExist(boolean)
   * @see iArchimate.IArchimatePackage#getInstanceFact_Exist()
   * @model required="true"
   * @generated
   */
  boolean isExist();

  /**
   * Sets the value of the '{@link iArchimate.InstanceFact#isExist <em>Exist</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exist</em>' attribute.
   * @see #isExist()
   * @generated
   */
  void setExist(boolean value);

} // InstanceFact
