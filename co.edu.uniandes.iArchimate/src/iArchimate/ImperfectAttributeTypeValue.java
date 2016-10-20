/**
 */
package iArchimate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Imperfect Attribute Type Value</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see iArchimate.IArchimatePackage#getImperfectAttributeTypeValue()
 * @model
 * @generated
 */
public enum ImperfectAttributeTypeValue implements Enumerator
{
  /**
   * The '<em><b>Numeric Range</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NUMERIC_RANGE_VALUE
   * @generated
   * @ordered
   */
  NUMERIC_RANGE(0, "NumericRange", "NumericRange"),

  /**
   * The '<em><b>Numeric Set</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NUMERIC_SET_VALUE
   * @generated
   * @ordered
   */
  NUMERIC_SET(1, "NumericSet", "NumericSet"),

  /**
   * The '<em><b>String Set</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_SET_VALUE
   * @generated
   * @ordered
   */
  STRING_SET(2, "StringSet", "StringSet"),

  /**
   * The '<em><b>Numeric Value Certainty Degree</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NUMERIC_VALUE_CERTAINTY_DEGREE_VALUE
   * @generated
   * @ordered
   */
  NUMERIC_VALUE_CERTAINTY_DEGREE(3, "NumericValueCertaintyDegree", "NumericValueCertaintyDegree"),

  /**
   * The '<em><b>String Value Certainty Degree</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_VALUE_CERTAINTY_DEGREE_VALUE
   * @generated
   * @ordered
   */
  STRING_VALUE_CERTAINTY_DEGREE(4, "StringValueCertaintyDegree", "StringValueCertaintyDegree"),

  /**
   * The '<em><b>Linguistic Value</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LINGUISTIC_VALUE_VALUE
   * @generated
   * @ordered
   */
  LINGUISTIC_VALUE(5, "LinguisticValue", "LinguisticValue"),

  /**
   * The '<em><b>No Value</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NO_VALUE_VALUE
   * @generated
   * @ordered
   */
  NO_VALUE(6, "NoValue", "NoValue");

  /**
   * The '<em><b>Numeric Range</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Numeric Range</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NUMERIC_RANGE
   * @model name="NumericRange"
   * @generated
   * @ordered
   */
  public static final int NUMERIC_RANGE_VALUE = 0;

  /**
   * The '<em><b>Numeric Set</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Numeric Set</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NUMERIC_SET
   * @model name="NumericSet"
   * @generated
   * @ordered
   */
  public static final int NUMERIC_SET_VALUE = 1;

  /**
   * The '<em><b>String Set</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>String Set</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STRING_SET
   * @model name="StringSet"
   * @generated
   * @ordered
   */
  public static final int STRING_SET_VALUE = 2;

  /**
   * The '<em><b>Numeric Value Certainty Degree</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Numeric Value Certainty Degree</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NUMERIC_VALUE_CERTAINTY_DEGREE
   * @model name="NumericValueCertaintyDegree"
   * @generated
   * @ordered
   */
  public static final int NUMERIC_VALUE_CERTAINTY_DEGREE_VALUE = 3;

  /**
   * The '<em><b>String Value Certainty Degree</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>String Value Certainty Degree</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STRING_VALUE_CERTAINTY_DEGREE
   * @model name="StringValueCertaintyDegree"
   * @generated
   * @ordered
   */
  public static final int STRING_VALUE_CERTAINTY_DEGREE_VALUE = 4;

  /**
   * The '<em><b>Linguistic Value</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Linguistic Value</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LINGUISTIC_VALUE
   * @model name="LinguisticValue"
   * @generated
   * @ordered
   */
  public static final int LINGUISTIC_VALUE_VALUE = 5;

  /**
   * The '<em><b>No Value</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>No Value</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NO_VALUE
   * @model name="NoValue"
   * @generated
   * @ordered
   */
  public static final int NO_VALUE_VALUE = 6;

  /**
   * An array of all the '<em><b>Imperfect Attribute Type Value</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ImperfectAttributeTypeValue[] VALUES_ARRAY =
    new ImperfectAttributeTypeValue[]
    {
      NUMERIC_RANGE,
      NUMERIC_SET,
      STRING_SET,
      NUMERIC_VALUE_CERTAINTY_DEGREE,
      STRING_VALUE_CERTAINTY_DEGREE,
      LINGUISTIC_VALUE,
      NO_VALUE,
    };

  /**
   * A public read-only list of all the '<em><b>Imperfect Attribute Type Value</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ImperfectAttributeTypeValue> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Imperfect Attribute Type Value</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ImperfectAttributeTypeValue get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ImperfectAttributeTypeValue result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Imperfect Attribute Type Value</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ImperfectAttributeTypeValue getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ImperfectAttributeTypeValue result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Imperfect Attribute Type Value</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ImperfectAttributeTypeValue get(int value)
  {
    switch (value)
    {
      case NUMERIC_RANGE_VALUE: return NUMERIC_RANGE;
      case NUMERIC_SET_VALUE: return NUMERIC_SET;
      case STRING_SET_VALUE: return STRING_SET;
      case NUMERIC_VALUE_CERTAINTY_DEGREE_VALUE: return NUMERIC_VALUE_CERTAINTY_DEGREE;
      case STRING_VALUE_CERTAINTY_DEGREE_VALUE: return STRING_VALUE_CERTAINTY_DEGREE;
      case LINGUISTIC_VALUE_VALUE: return LINGUISTIC_VALUE;
      case NO_VALUE_VALUE: return NO_VALUE;
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
  private ImperfectAttributeTypeValue(int value, String name, String literal)
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
  
} //ImperfectAttributeTypeValue
