/*
 * 
 */
package iArchimate.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class IArchimateModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof iArchimate.diagram.edit.parts.ModelEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.AbsentElement_2008);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.Group_2009);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.Element_2010);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.DecisionTrace_2011);
			return types;
		}
		if (editPart instanceof iArchimate.diagram.edit.parts.AbsentElementAbsentElementComponentsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.AbsentElement_3023);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.Group_3024);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.Element_3025);
			return types;
		}
		if (editPart instanceof iArchimate.diagram.edit.parts.AbsentElementAbsentElementComponentsCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.AbsentElement_3023);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.Group_3024);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.Element_3025);
			return types;
		}
		if (editPart instanceof iArchimate.diagram.edit.parts.GroupGroupComponentsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.AbsentElement_3023);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.Group_3024);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.Element_3025);
			return types;
		}
		if (editPart instanceof iArchimate.diagram.edit.parts.ElementElementComponentsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.AbsentElement_3023);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.Group_3024);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.Element_3025);
			return types;
		}
		if (editPart instanceof iArchimate.diagram.edit.parts.GroupGroupComponentsCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.AbsentElement_3023);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.Group_3024);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.Element_3025);
			return types;
		}
		if (editPart instanceof iArchimate.diagram.edit.parts.ElementElementComponentsCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.AbsentElement_3023);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.Group_3024);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.Element_3025);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof iArchimate.diagram.edit.parts.AbsentElementEditPart) {
			return ((iArchimate.diagram.edit.parts.AbsentElementEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof iArchimate.diagram.edit.parts.ElementEditPart) {
			return ((iArchimate.diagram.edit.parts.ElementEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof iArchimate.diagram.edit.parts.AbsentElement2EditPart) {
			return ((iArchimate.diagram.edit.parts.AbsentElement2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof iArchimate.diagram.edit.parts.Element2EditPart) {
			return ((iArchimate.diagram.edit.parts.Element2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof iArchimate.diagram.edit.parts.AbsentElementEditPart) {
			return ((iArchimate.diagram.edit.parts.AbsentElementEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof iArchimate.diagram.edit.parts.ElementEditPart) {
			return ((iArchimate.diagram.edit.parts.ElementEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof iArchimate.diagram.edit.parts.DecisionTraceEditPart) {
			return ((iArchimate.diagram.edit.parts.DecisionTraceEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof iArchimate.diagram.edit.parts.AbsentElement2EditPart) {
			return ((iArchimate.diagram.edit.parts.AbsentElement2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof iArchimate.diagram.edit.parts.Element2EditPart) {
			return ((iArchimate.diagram.edit.parts.Element2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof iArchimate.diagram.edit.parts.AbsentElementEditPart) {
			return ((iArchimate.diagram.edit.parts.AbsentElementEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof iArchimate.diagram.edit.parts.ElementEditPart) {
			return ((iArchimate.diagram.edit.parts.ElementEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof iArchimate.diagram.edit.parts.AbsentElement2EditPart) {
			return ((iArchimate.diagram.edit.parts.AbsentElement2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof iArchimate.diagram.edit.parts.Element2EditPart) {
			return ((iArchimate.diagram.edit.parts.Element2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof iArchimate.diagram.edit.parts.AbsentElementEditPart) {
			return ((iArchimate.diagram.edit.parts.AbsentElementEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof iArchimate.diagram.edit.parts.ElementEditPart) {
			return ((iArchimate.diagram.edit.parts.ElementEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof iArchimate.diagram.edit.parts.DecisionTraceEditPart) {
			return ((iArchimate.diagram.edit.parts.DecisionTraceEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof iArchimate.diagram.edit.parts.AbsentElement2EditPart) {
			return ((iArchimate.diagram.edit.parts.AbsentElement2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof iArchimate.diagram.edit.parts.Element2EditPart) {
			return ((iArchimate.diagram.edit.parts.Element2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof iArchimate.diagram.edit.parts.AbsentElementEditPart) {
			return ((iArchimate.diagram.edit.parts.AbsentElementEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof iArchimate.diagram.edit.parts.ElementEditPart) {
			return ((iArchimate.diagram.edit.parts.ElementEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof iArchimate.diagram.edit.parts.AbsentElement2EditPart) {
			return ((iArchimate.diagram.edit.parts.AbsentElement2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof iArchimate.diagram.edit.parts.Element2EditPart) {
			return ((iArchimate.diagram.edit.parts.Element2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				iArchimate.diagram.part.IArchimateDiagramEditorPlugin
						.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(iArchimate.diagram.part.Messages.IArchimateModelingAssistantProviderMessage);
		dialog.setTitle(iArchimate.diagram.part.Messages.IArchimateModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
