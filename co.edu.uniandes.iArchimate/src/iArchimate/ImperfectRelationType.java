/**
 */
package iArchimate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Imperfect Relation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see iArchimate.IArchimatePackage#getImperfectRelationType()
 * @model
 * @generated
 */
public enum ImperfectRelationType implements Enumerator
{
  /**
   * The '<em><b>Instance Certainty Degree</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INSTANCE_CERTAINTY_DEGREE_VALUE
   * @generated
   * @ordered
   */
  INSTANCE_CERTAINTY_DEGREE(0, "InstanceCertaintyDegree", "InstanceCertaintyDegree"),

  /**
   * The '<em><b>Instance Set</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INSTANCE_SET_VALUE
   * @generated
   * @ordered
   */
  INSTANCE_SET(1, "InstanceSet", "InstanceSet"),

  /**
   * The '<em><b>Absent Instance</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ABSENT_INSTANCE_VALUE
   * @generated
   * @ordered
   */
  ABSENT_INSTANCE(2, "AbsentInstance", "AbsentInstance");

  /**
   * The '<em><b>Instance Certainty Degree</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Instance Certainty Degree</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INSTANCE_CERTAINTY_DEGREE
   * @model name="InstanceCertaintyDegree"
   * @generated
   * @ordered
   */
  public static final int INSTANCE_CERTAINTY_DEGREE_VALUE = 0;

  /**
   * The '<em><b>Instance Set</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Instance Set</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INSTANCE_SET
   * @model name="InstanceSet"
   * @generated
   * @ordered
   */
  public static final int INSTANCE_SET_VALUE = 1;

  /**
   * The '<em><b>Absent Instance</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Absent Instance</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ABSENT_INSTANCE
   * @model name="AbsentInstance"
   * @generated
   * @ordered
   */
  public static final int ABSENT_INSTANCE_VALUE = 2;

  /**
   * An array of all the '<em><b>Imperfect Relation Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ImperfectRelationType[] VALUES_ARRAY =
    new ImperfectRelationType[]
    {
      INSTANCE_CERTAINTY_DEGREE,
      INSTANCE_SET,
      ABSENT_INSTANCE,
    };

  /**
   * A public read-only list of all the '<em><b>Imperfect Relation Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ImperfectRelationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Imperfect Relation Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ImperfectRelationType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ImperfectRelationType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Imperfect Relation Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ImperfectRelationType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ImperfectRelationType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Imperfect Relation Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ImperfectRelationType get(int value)
  {
    switch (value)
    {
      case INSTANCE_CERTAINTY_DEGREE_VALUE: return INSTANCE_CERTAINTY_DEGREE;
      case INSTANCE_SET_VALUE: return INSTANCE_SET;
      case ABSENT_INSTANCE_VALUE: return ABSENT_INSTANCE;
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
  private ImperfectRelationType(int value, String name, String literal)
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
  
} //ImperfectRelationType
