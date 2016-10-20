package iArchimate.diagram.dt.providers;

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
		if (editPart instanceof iArchimate.diagram.dt.edit.parts.DecisionTraceEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(9);
			types.add(iArchimate.diagram.dt.providers.IArchimateElementTypes.AttributeFact_2001);
			types.add(iArchimate.diagram.dt.providers.IArchimateElementTypes.InstanceFact_2002);
			types.add(iArchimate.diagram.dt.providers.IArchimateElementTypes.Decision_2003);
			types.add(iArchimate.diagram.dt.providers.IArchimateElementTypes.Meeting_2004);
			types.add(iArchimate.diagram.dt.providers.IArchimateElementTypes.RelationFact_2005);
			types.add(iArchimate.diagram.dt.providers.IArchimateElementTypes.Observation_2006);
			types.add(iArchimate.diagram.dt.providers.IArchimateElementTypes.DirectObservation_2007);
			types.add(iArchimate.diagram.dt.providers.IArchimateElementTypes.Person_2008);
			types.add(iArchimate.diagram.dt.providers.IArchimateElementTypes.Document_2009);
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
		if (sourceEditPart instanceof iArchimate.diagram.dt.edit.parts.DecisionEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.DecisionEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof iArchimate.diagram.dt.edit.parts.MeetingEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.MeetingEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof iArchimate.diagram.dt.edit.parts.ObservationEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.ObservationEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof iArchimate.diagram.dt.edit.parts.DirectObservationEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.DirectObservationEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof iArchimate.diagram.dt.edit.parts.PersonEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.PersonEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof iArchimate.diagram.dt.edit.parts.DocumentEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.DocumentEditPart) sourceEditPart)
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
		if (targetEditPart instanceof iArchimate.diagram.dt.edit.parts.AttributeFactEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.AttributeFactEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof iArchimate.diagram.dt.edit.parts.InstanceFactEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.InstanceFactEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof iArchimate.diagram.dt.edit.parts.RelationFactEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.RelationFactEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof iArchimate.diagram.dt.edit.parts.ObservationEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.ObservationEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof iArchimate.diagram.dt.edit.parts.PersonEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.PersonEditPart) targetEditPart)
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
		if (sourceEditPart instanceof iArchimate.diagram.dt.edit.parts.DecisionEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.DecisionEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof iArchimate.diagram.dt.edit.parts.MeetingEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.MeetingEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof iArchimate.diagram.dt.edit.parts.ObservationEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.ObservationEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof iArchimate.diagram.dt.edit.parts.DirectObservationEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.DirectObservationEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof iArchimate.diagram.dt.edit.parts.PersonEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.PersonEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof iArchimate.diagram.dt.edit.parts.DocumentEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.DocumentEditPart) sourceEditPart)
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
		if (targetEditPart instanceof iArchimate.diagram.dt.edit.parts.AttributeFactEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.AttributeFactEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof iArchimate.diagram.dt.edit.parts.InstanceFactEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.InstanceFactEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof iArchimate.diagram.dt.edit.parts.RelationFactEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.RelationFactEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof iArchimate.diagram.dt.edit.parts.ObservationEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.ObservationEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof iArchimate.diagram.dt.edit.parts.PersonEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.PersonEditPart) targetEditPart)
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
		if (sourceEditPart instanceof iArchimate.diagram.dt.edit.parts.DecisionEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.DecisionEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof iArchimate.diagram.dt.edit.parts.MeetingEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.MeetingEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof iArchimate.diagram.dt.edit.parts.ObservationEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.ObservationEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof iArchimate.diagram.dt.edit.parts.DirectObservationEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.DirectObservationEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof iArchimate.diagram.dt.edit.parts.PersonEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.PersonEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof iArchimate.diagram.dt.edit.parts.DocumentEditPart) {
			return ((iArchimate.diagram.dt.edit.parts.DocumentEditPart) sourceEditPart)
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
				iArchimate.diagram.dt.part.IArchimateDiagramEditorPlugin
						.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(iArchimate.diagram.dt.part.Messages.IArchimateModelingAssistantProviderMessage);
		dialog.setTitle(iArchimate.diagram.dt.part.Messages.IArchimateModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
