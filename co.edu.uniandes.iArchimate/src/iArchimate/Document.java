/**
 */
package iArchimate;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iArchimate.Document#getVersion <em>Version</em>}</li>
 *   <li>{@link iArchimate.Document#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see iArchimate.IArchimatePackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends Source
{
  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(double)
   * @see iArchimate.IArchimatePackage#getDocument_Version()
   * @model
   * @generated
   */
  double getVersion();

  /**
   * Sets the value of the '{@link iArchimate.Document#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(double value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see iArchimate.IArchimatePackage#getDocument_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link iArchimate.Document#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // Document
