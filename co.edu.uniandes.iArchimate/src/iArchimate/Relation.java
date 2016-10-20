/**
 */
package iArchimate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iArchimate.Relation#getSource <em>Source</em>}</li>
 *   <li>{@link iArchimate.Relation#getTarget <em>Target</em>}</li>
 *   <li>{@link iArchimate.Relation#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link iArchimate.Relation#getName <em>Name</em>}</li>
 *   <li>{@link iArchimate.Relation#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see iArchimate.IArchimatePackage#getRelation()
 * @model annotation="gmf.link source='source' target='target' label='name' label.pattern='{0}' color='0,0,0'"
 * @generated
 */
public interface Relation extends EObject
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * It is bidirectional and its opposite is '{@link iArchimate.Element#getRelations <em>Relations</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(Element)
   * @see iArchimate.IArchimatePackage#getRelation_Source()
   * @see iArchimate.Element#getRelations
   * @model opposite="relations" required="true"
   * @generated
   */
  Element getSource();

  /**
   * Sets the value of the '{@link iArchimate.Relation#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Element value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Element)
   * @see iArchimate.IArchimatePackage#getRelation_Target()
   * @model required="true"
   * @generated
   */
  Element getTarget();

  /**
   * Sets the value of the '{@link iArchimate.Relation#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Element value);

  /**
   * Returns the value of the '<em><b>Type Name</b></em>' attribute.
   * The literals are from the enumeration {@link iArchimate.RelationTypeName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Name</em>' attribute.
   * @see iArchimate.RelationTypeName
   * @see #setTypeName(RelationTypeName)
   * @see iArchimate.IArchimatePackage#getRelation_TypeName()
   * @model required="true"
   * @generated
   */
  RelationTypeName getTypeName();

  /**
   * Sets the value of the '{@link iArchimate.Relation#getTypeName <em>Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Name</em>' attribute.
   * @see iArchimate.RelationTypeName
   * @see #getTypeName()
   * @generated
   */
  void setTypeName(RelationTypeName value);

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
   * @see iArchimate.IArchimatePackage#getRelation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link iArchimate.Relation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link iArchimate.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see iArchimate.IArchimatePackage#getRelation_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

} // Relation
