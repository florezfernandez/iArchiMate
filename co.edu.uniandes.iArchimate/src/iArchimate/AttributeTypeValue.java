/**
 */
package iArchimate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Attribute Type Value</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see iArchimate.IArchimatePackage#getAttributeTypeValue()
 * @model
 * @generated
 */
public enum AttributeTypeValue implements Enumerator
{
  /**
   * The '<em><b>EInt</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EINT_VALUE
   * @generated
   * @ordered
   */
  EINT(0, "EInt", "EInt"),

  /**
   * The '<em><b>EDouble</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EDOUBLE_VALUE
   * @generated
   * @ordered
   */
  EDOUBLE(1, "EDouble", "EDouble"),

  /**
   * The '<em><b>EString</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ESTRING_VALUE
   * @generated
   * @ordered
   */
  ESTRING(2, "EString", "EString"),

  /**
   * The '<em><b>EBoolean</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EBOOLEAN_VALUE
   * @generated
   * @ordered
   */
  EBOOLEAN(3, "EBoolean", "EBoolean"),

  /**
   * The '<em><b>EDate</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EDATE_VALUE
   * @generated
   * @ordered
   */
  EDATE(4, "EDate", "EDate");

  /**
   * The '<em><b>EInt</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EInt</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EINT
   * @model name="EInt"
   * @generated
   * @ordered
   */
  public static final int EINT_VALUE = 0;

  /**
   * The '<em><b>EDouble</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EDouble</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EDOUBLE
   * @model name="EDouble"
   * @generated
   * @ordered
   */
  public static final int EDOUBLE_VALUE = 1;

  /**
   * The '<em><b>EString</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EString</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ESTRING
   * @model name="EString"
   * @generated
   * @ordered
   */
  public static final int ESTRING_VALUE = 2;

  /**
   * The '<em><b>EBoolean</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EBoolean</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EBOOLEAN
   * @model name="EBoolean"
   * @generated
   * @ordered
   */
  public static final int EBOOLEAN_VALUE = 3;

  /**
   * The '<em><b>EDate</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EDate</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EDATE
   * @model name="EDate"
   * @generated
   * @ordered
   */
  public static final int EDATE_VALUE = 4;

  /**
   * An array of all the '<em><b>Attribute Type Value</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final AttributeTypeValue[] VALUES_ARRAY =
    new AttributeTypeValue[]
    {
      EINT,
      EDOUBLE,
      ESTRING,
      EBOOLEAN,
      EDATE,
    };

  /**
   * A public read-only list of all the '<em><b>Attribute Type Value</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<AttributeTypeValue> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Attribute Type Value</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AttributeTypeValue get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AttributeTypeValue result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Attribute Type Value</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AttributeTypeValue getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AttributeTypeValue result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Attribute Type Value</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AttributeTypeValue get(int value)
  {
    switch (value)
    {
      case EINT_VALUE: return EINT;
      case EDOUBLE_VALUE: return EDOUBLE;
      case ESTRING_VALUE: return ESTRING;
      case EBOOLEAN_VALUE: return EBOOLEAN;
      case EDATE_VALUE: return EDATE;
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
  private AttributeTypeValue(int value, String name, String literal)
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
  
} //AttributeTypeValue
