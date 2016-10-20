/**
 */
package iArchimate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iArchimate.Element#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link iArchimate.Element#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link iArchimate.Element#getRelations <em>Relations</em>}</li>
 *   <li>{@link iArchimate.Element#getElementDecisionTrace <em>Element Decision Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see iArchimate.IArchimatePackage#getElement()
 * @model annotation="gmf.node figure='rounded' label.icon='true' label='name' label.pattern='{0}' size='140,60' border.color='0,0,0'"
 * @generated
 */
public interface Element extends Component
{
  /**
   * Returns the value of the '<em><b>Type Name</b></em>' attribute.
   * The literals are from the enumeration {@link iArchimate.ElementTypeName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Name</em>' attribute.
   * @see iArchimate.ElementTypeName
   * @see #setTypeName(ElementTypeName)
   * @see iArchimate.IArchimatePackage#getElement_TypeName()
   * @model required="true"
   * @generated
   */
  ElementTypeName getTypeName();

  /**
   * Sets the value of the '{@link iArchimate.Element#getTypeName <em>Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Name</em>' attribute.
   * @see iArchimate.ElementTypeName
   * @see #getTypeName()
   * @generated
   */
  void setTypeName(ElementTypeName value);

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
   * @see iArchimate.IArchimatePackage#getElement_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Relations</b></em>' reference list.
   * The list contents are of type {@link iArchimate.Relation}.
   * It is bidirectional and its opposite is '{@link iArchimate.Relation#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relations</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relations</em>' reference list.
   * @see iArchimate.IArchimatePackage#getElement_Relations()
   * @see iArchimate.Relation#getSource
   * @model opposite="source"
   * @generated
   */
  EList<Relation> getRelations();

  /**
   * Returns the value of the '<em><b>Element Decision Trace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Decision Trace</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Decision Trace</em>' reference.
   * @see #setElementDecisionTrace(DecisionTrace)
   * @see iArchimate.IArchimatePackage#getElement_ElementDecisionTrace()
   * @model annotation="gmf.link target.decoration='arrow' source.decoration='filledsquare' style='dash' color='0,0,255'"
   * @generated
   */
  DecisionTrace getElementDecisionTrace();

  /**
   * Sets the value of the '{@link iArchimate.Element#getElementDecisionTrace <em>Element Decision Trace</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Decision Trace</em>' reference.
   * @see #getElementDecisionTrace()
   * @generated
   */
  void setElementDecisionTrace(DecisionTrace value);

} // Element
