/**
 */
package iArchimate.provider;


import iArchimate.DecisionTrace;
import iArchimate.IArchimateFactory;
import iArchimate.IArchimatePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link iArchimate.DecisionTrace} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DecisionTraceItemProvider
  extends ItemProviderAdapter
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecisionTraceItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addIdDecisionTracePropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Id Decision Trace feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addIdDecisionTracePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_DecisionTrace_idDecisionTrace_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_DecisionTrace_idDecisionTrace_feature", "_UI_DecisionTrace_type"),
         IArchimatePackage.Literals.DECISION_TRACE__ID_DECISION_TRACE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(IArchimatePackage.Literals.DECISION_TRACE__DECISIONS);
      childrenFeatures.add(IArchimatePackage.Literals.DECISION_TRACE__FACTS);
      childrenFeatures.add(IArchimatePackage.Literals.DECISION_TRACE__OBSERVATIONS);
      childrenFeatures.add(IArchimatePackage.Literals.DECISION_TRACE__SOURCES);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns DecisionTrace.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/DecisionTrace"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object)
  {
    String label = ((DecisionTrace)object).getIdDecisionTrace();
    return label == null || label.length() == 0 ?
      getString("_UI_DecisionTrace_type") :
      getString("_UI_DecisionTrace_type") + " " + label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(DecisionTrace.class))
    {
      case IArchimatePackage.DECISION_TRACE__ID_DECISION_TRACE:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case IArchimatePackage.DECISION_TRACE__DECISIONS:
      case IArchimatePackage.DECISION_TRACE__FACTS:
      case IArchimatePackage.DECISION_TRACE__OBSERVATIONS:
      case IArchimatePackage.DECISION_TRACE__SOURCES:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add
      (createChildParameter
        (IArchimatePackage.Literals.DECISION_TRACE__DECISIONS,
         IArchimateFactory.eINSTANCE.createDecision()));

    newChildDescriptors.add
      (createChildParameter
        (IArchimatePackage.Literals.DECISION_TRACE__FACTS,
         IArchimateFactory.eINSTANCE.createFact()));

    newChildDescriptors.add
      (createChildParameter
        (IArchimatePackage.Literals.DECISION_TRACE__FACTS,
         IArchimateFactory.eINSTANCE.createInstanceFact()));

    newChildDescriptors.add
      (createChildParameter
        (IArchimatePackage.Literals.DECISION_TRACE__FACTS,
         IArchimateFactory.eINSTANCE.createAttributeFact()));

    newChildDescriptors.add
      (createChildParameter
        (IArchimatePackage.Literals.DECISION_TRACE__FACTS,
         IArchimateFactory.eINSTANCE.createRelationFact()));

    newChildDescriptors.add
      (createChildParameter
        (IArchimatePackage.Literals.DECISION_TRACE__OBSERVATIONS,
         IArchimateFactory.eINSTANCE.createObservation()));

    newChildDescriptors.add
      (createChildParameter
        (IArchimatePackage.Literals.DECISION_TRACE__SOURCES,
         IArchimateFactory.eINSTANCE.createDirectObservation()));

    newChildDescriptors.add
      (createChildParameter
        (IArchimatePackage.Literals.DECISION_TRACE__SOURCES,
         IArchimateFactory.eINSTANCE.createMeeting()));

    newChildDescriptors.add
      (createChildParameter
        (IArchimatePackage.Literals.DECISION_TRACE__SOURCES,
         IArchimateFactory.eINSTANCE.createDocument()));

    newChildDescriptors.add
      (createChildParameter
        (IArchimatePackage.Literals.DECISION_TRACE__SOURCES,
         IArchimateFactory.eINSTANCE.createPerson()));
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    return IArchimateEditPlugin.INSTANCE;
  }

}
