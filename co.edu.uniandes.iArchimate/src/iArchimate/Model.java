/**
 */
package iArchimate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iArchimate.Model#getRelations <em>Relations</em>}</li>
 *   <li>{@link iArchimate.Model#getDecisionTraces <em>Decision Traces</em>}</li>
 *   <li>{@link iArchimate.Model#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see iArchimate.IArchimatePackage#getModel()
 * @model annotation="gmf.diagram model.extension='iarchimate' diagram.extension='iarchimate_diagram'"
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
   * The list contents are of type {@link iArchimate.Relation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relations</em>' containment reference list.
   * @see iArchimate.IArchimatePackage#getModel_Relations()
   * @model containment="true"
   * @generated
   */
  EList<Relation> getRelations();

  /**
   * Returns the value of the '<em><b>Decision Traces</b></em>' containment reference list.
   * The list contents are of type {@link iArchimate.DecisionTrace}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decision Traces</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decision Traces</em>' containment reference list.
   * @see iArchimate.IArchimatePackage#getModel_DecisionTraces()
   * @model containment="true"
   * @generated
   */
  EList<DecisionTrace> getDecisionTraces();

  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link iArchimate.Component}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see iArchimate.IArchimatePackage#getModel_Components()
   * @model containment="true"
   * @generated
   */
  EList<Component> getComponents();

} // Model
