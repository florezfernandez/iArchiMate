/**
 */
package iArchimate.util;

import iArchimate.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see iArchimate.IArchimatePackage
 * @generated
 */
public class IArchimateAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static IArchimatePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IArchimateAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = IArchimatePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IArchimateSwitch<Adapter> modelSwitch =
    new IArchimateSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseComponent(Component object)
      {
        return createComponentAdapter();
      }
      @Override
      public Adapter caseGroup(Group object)
      {
        return createGroupAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseAbsentElement(AbsentElement object)
      {
        return createAbsentElementAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseImperfectAttribute(ImperfectAttribute object)
      {
        return createImperfectAttributeAdapter();
      }
      @Override
      public Adapter caseRelation(Relation object)
      {
        return createRelationAdapter();
      }
      @Override
      public Adapter caseImperfectRelation(ImperfectRelation object)
      {
        return createImperfectRelationAdapter();
      }
      @Override
      public Adapter caseDecisionTrace(DecisionTrace object)
      {
        return createDecisionTraceAdapter();
      }
      @Override
      public Adapter caseSource(Source object)
      {
        return createSourceAdapter();
      }
      @Override
      public Adapter caseDirectObservation(DirectObservation object)
      {
        return createDirectObservationAdapter();
      }
      @Override
      public Adapter caseMeeting(Meeting object)
      {
        return createMeetingAdapter();
      }
      @Override
      public Adapter caseDocument(Document object)
      {
        return createDocumentAdapter();
      }
      @Override
      public Adapter casePerson(Person object)
      {
        return createPersonAdapter();
      }
      @Override
      public Adapter caseObservation(Observation object)
      {
        return createObservationAdapter();
      }
      @Override
      public Adapter caseFact(Fact object)
      {
        return createFactAdapter();
      }
      @Override
      public Adapter caseInstanceFact(InstanceFact object)
      {
        return createInstanceFactAdapter();
      }
      @Override
      public Adapter caseAttributeFact(AttributeFact object)
      {
        return createAttributeFactAdapter();
      }
      @Override
      public Adapter caseRelationFact(RelationFact object)
      {
        return createRelationFactAdapter();
      }
      @Override
      public Adapter caseDecision(Decision object)
      {
        return createDecisionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link iArchimate.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see iArchimate.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link iArchimate.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see iArchimate.Component
   * @generated
   */
  public Adapter createComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link iArchimate.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see iArchimate.Group
   * @generated
   */
  public Adapter createGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link iArchimate.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see iArchimate.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link iArchimate.AbsentElement <em>Absent Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see iArchimate.AbsentElement
   * @generated
   */
  public Adapter createAbsentElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link iArchimate.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see iArchimate.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link iArchimate.ImperfectAttribute <em>Imperfect Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see iArchimate.ImperfectAttribute
   * @generated
   */
  public Adapter createImperfectAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link iArchimate.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see iArchimate.Relation
   * @generated
   */
  public Adapter createRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link iArchimate.ImperfectRelation <em>Imperfect Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see iArchimate.ImperfectRelation
   * @generated
   */
  public Adapter createImperfectRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link iArchimate.DecisionTrace <em>Decision Trace</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see iArchimate.DecisionTrace
   * @generated
   */
  public Adapter createDecisionTraceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link iArchimate.Source <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see iArchimate.Source
   * @generated
   */
  public Adapter createSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link iArchimate.DirectObservation <em>Direct Observation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see iArchimate.DirectObservation
   * @generated
   */
  public Adapter createDirectObservationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link iArchimate.Meeting <em>Meeting</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see iArchimate.Meeting
   * @generated
   */
  public Adapter createMeetingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link iArchimate.Document <em>Document</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see iArchimate.Document
   * @generated
   */
  public Adapter createDocumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link iArchimate.Person <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see iArchimate.Person
   * @generated
   */
  public Adapter createPersonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link iArchimate.Observation <em>Observation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see iArchimate.Observation
   * @generated
   */
  public Adapter createObservationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link iArchimate.Fact <em>Fact</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see iArchimate.Fact
   * @generated
   */
  public Adapter createFactAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link iArchimate.InstanceFact <em>Instance Fact</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see iArchimate.InstanceFact
   * @generated
   */
  public Adapter createInstanceFactAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link iArchimate.AttributeFact <em>Attribute Fact</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see iArchimate.AttributeFact
   * @generated
   */
  public Adapter createAttributeFactAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link iArchimate.RelationFact <em>Relation Fact</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see iArchimate.RelationFact
   * @generated
   */
  public Adapter createRelationFactAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link iArchimate.Decision <em>Decision</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see iArchimate.Decision
   * @generated
   */
  public Adapter createDecisionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //IArchimateAdapterFactory
