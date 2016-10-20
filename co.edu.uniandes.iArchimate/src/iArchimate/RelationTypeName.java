/**
 */
package iArchimate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Relation Type Name</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see iArchimate.IArchimatePackage#getRelationTypeName()
 * @model
 * @generated
 */
public enum RelationTypeName implements Enumerator
{
  /**
   * The '<em><b>Not Selected</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOT_SELECTED_VALUE
   * @generated
   * @ordered
   */
  NOT_SELECTED(0, "NotSelected", "NotSelected"),

  /**
   * The '<em><b>Composition</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMPOSITION_VALUE
   * @generated
   * @ordered
   */
  COMPOSITION(1, "Composition", "Composition"),

  /**
   * The '<em><b>Aggregation</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AGGREGATION_VALUE
   * @generated
   * @ordered
   */
  AGGREGATION(2, "Aggregation", "Aggregation"),

  /**
   * The '<em><b>Assignment</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ASSIGNMENT_VALUE
   * @generated
   * @ordered
   */
  ASSIGNMENT(3, "Assignment", "Assignment"),

  /**
   * The '<em><b>Realization</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REALIZATION_VALUE
   * @generated
   * @ordered
   */
  REALIZATION(4, "Realization", "Realization"),

  /**
   * The '<em><b>Used By</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #USED_BY_VALUE
   * @generated
   * @ordered
   */
  USED_BY(5, "UsedBy", "UsedBy"),

  /**
   * The '<em><b>Access</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ACCESS_VALUE
   * @generated
   * @ordered
   */
  ACCESS(6, "Access", "Access"),

  /**
   * The '<em><b>Association</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ASSOCIATION_VALUE
   * @generated
   * @ordered
   */
  ASSOCIATION(7, "Association", "Association"),

  /**
   * The '<em><b>Triggering</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TRIGGERING_VALUE
   * @generated
   * @ordered
   */
  TRIGGERING(8, "Triggering", "Triggering"),

  /**
   * The '<em><b>Flow</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FLOW_VALUE
   * @generated
   * @ordered
   */
  FLOW(9, "Flow", "Flow"),

  /**
   * The '<em><b>Specialization</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SPECIALIZATION_VALUE
   * @generated
   * @ordered
   */
  SPECIALIZATION(10, "Specialization", "Specialization");

  /**
   * The '<em><b>Not Selected</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Not Selected</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NOT_SELECTED
   * @model name="NotSelected"
   * @generated
   * @ordered
   */
  public static final int NOT_SELECTED_VALUE = 0;

  /**
   * The '<em><b>Composition</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Composition</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COMPOSITION
   * @model name="Composition"
   * @generated
   * @ordered
   */
  public static final int COMPOSITION_VALUE = 1;

  /**
   * The '<em><b>Aggregation</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Aggregation</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AGGREGATION
   * @model name="Aggregation"
   * @generated
   * @ordered
   */
  public static final int AGGREGATION_VALUE = 2;

  /**
   * The '<em><b>Assignment</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Assignment</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ASSIGNMENT
   * @model name="Assignment"
   * @generated
   * @ordered
   */
  public static final int ASSIGNMENT_VALUE = 3;

  /**
   * The '<em><b>Realization</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Realization</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REALIZATION
   * @model name="Realization"
   * @generated
   * @ordered
   */
  public static final int REALIZATION_VALUE = 4;

  /**
   * The '<em><b>Used By</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Used By</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #USED_BY
   * @model name="UsedBy"
   * @generated
   * @ordered
   */
  public static final int USED_BY_VALUE = 5;

  /**
   * The '<em><b>Access</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Access</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ACCESS
   * @model name="Access"
   * @generated
   * @ordered
   */
  public static final int ACCESS_VALUE = 6;

  /**
   * The '<em><b>Association</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Association</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ASSOCIATION
   * @model name="Association"
   * @generated
   * @ordered
   */
  public static final int ASSOCIATION_VALUE = 7;

  /**
   * The '<em><b>Triggering</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Triggering</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TRIGGERING
   * @model name="Triggering"
   * @generated
   * @ordered
   */
  public static final int TRIGGERING_VALUE = 8;

  /**
   * The '<em><b>Flow</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Flow</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FLOW
   * @model name="Flow"
   * @generated
   * @ordered
   */
  public static final int FLOW_VALUE = 9;

  /**
   * The '<em><b>Specialization</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Specialization</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SPECIALIZATION
   * @model name="Specialization"
   * @generated
   * @ordered
   */
  public static final int SPECIALIZATION_VALUE = 10;

  /**
   * An array of all the '<em><b>Relation Type Name</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final RelationTypeName[] VALUES_ARRAY =
    new RelationTypeName[]
    {
      NOT_SELECTED,
      COMPOSITION,
      AGGREGATION,
      ASSIGNMENT,
      REALIZATION,
      USED_BY,
      ACCESS,
      ASSOCIATION,
      TRIGGERING,
      FLOW,
      SPECIALIZATION,
    };

  /**
   * A public read-only list of all the '<em><b>Relation Type Name</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<RelationTypeName> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Relation Type Name</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RelationTypeName get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RelationTypeName result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Relation Type Name</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RelationTypeName getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RelationTypeName result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Relation Type Name</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RelationTypeName get(int value)
  {
    switch (value)
    {
      case NOT_SELECTED_VALUE: return NOT_SELECTED;
      case COMPOSITION_VALUE: return COMPOSITION;
      case AGGREGATION_VALUE: return AGGREGATION;
      case ASSIGNMENT_VALUE: return ASSIGNMENT;
      case REALIZATION_VALUE: return REALIZATION;
      case USED_BY_VALUE: return USED_BY;
      case ACCESS_VALUE: return ACCESS;
      case ASSOCIATION_VALUE: return ASSOCIATION;
      case TRIGGERING_VALUE: return TRIGGERING;
      case FLOW_VALUE: return FLOW;
      case SPECIALIZATION_VALUE: return SPECIALIZATION;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private RelationTypeName(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //RelationTypeName
