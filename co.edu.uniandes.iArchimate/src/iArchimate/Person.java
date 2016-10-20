/**
 */
package iArchimate;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iArchimate.Person#getOrganizationalUnit <em>Organizational Unit</em>}</li>
 *   <li>{@link iArchimate.Person#getRol <em>Rol</em>}</li>
 * </ul>
 * </p>
 *
 * @see iArchimate.IArchimatePackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends Source
{
  /**
   * Returns the value of the '<em><b>Organizational Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Organizational Unit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Organizational Unit</em>' attribute.
   * @see #setOrganizationalUnit(String)
   * @see iArchimate.IArchimatePackage#getPerson_OrganizationalUnit()
   * @model
   * @generated
   */
  String getOrganizationalUnit();

  /**
   * Sets the value of the '{@link iArchimate.Person#getOrganizationalUnit <em>Organizational Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Organizational Unit</em>' attribute.
   * @see #getOrganizationalUnit()
   * @generated
   */
  void setOrganizationalUnit(String value);

  /**
   * Returns the value of the '<em><b>Rol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rol</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rol</em>' attribute.
   * @see #setRol(String)
   * @see iArchimate.IArchimatePackage#getPerson_Rol()
   * @model
   * @generated
   */
  String getRol();

  /**
   * Sets the value of the '{@link iArchimate.Person#getRol <em>Rol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rol</em>' attribute.
   * @see #getRol()
   * @generated
   */
  void setRol(String value);

} // Person
