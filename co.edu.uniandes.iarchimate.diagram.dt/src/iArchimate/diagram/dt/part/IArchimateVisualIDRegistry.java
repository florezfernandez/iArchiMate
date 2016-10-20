package iArchimate.diagram.dt.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class IArchimateVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "co.edu.uniandes.iArchimate.diagram.dt/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (iArchimate.diagram.dt.edit.parts.DecisionTraceEditPart.MODEL_ID
					.equals(view.getType())) {
				return iArchimate.diagram.dt.edit.parts.DecisionTraceEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				iArchimate.diagram.dt.part.IArchimateDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (iArchimate.IArchimatePackage.eINSTANCE.getDecisionTrace()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((iArchimate.DecisionTrace) domainElement)) {
			return iArchimate.diagram.dt.edit.parts.DecisionTraceEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
				.getModelID(containerView);
		if (!iArchimate.diagram.dt.edit.parts.DecisionTraceEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (iArchimate.diagram.dt.edit.parts.DecisionTraceEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = iArchimate.diagram.dt.edit.parts.DecisionTraceEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case iArchimate.diagram.dt.edit.parts.DecisionTraceEditPart.VISUAL_ID:
			if (iArchimate.IArchimatePackage.eINSTANCE.getAttributeFact()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.dt.edit.parts.AttributeFactEditPart.VISUAL_ID;
			}
			if (iArchimate.IArchimatePackage.eINSTANCE.getInstanceFact()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.dt.edit.parts.InstanceFactEditPart.VISUAL_ID;
			}
			if (iArchimate.IArchimatePackage.eINSTANCE.getDecision()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.dt.edit.parts.DecisionEditPart.VISUAL_ID;
			}
			if (iArchimate.IArchimatePackage.eINSTANCE.getMeeting()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.dt.edit.parts.MeetingEditPart.VISUAL_ID;
			}
			if (iArchimate.IArchimatePackage.eINSTANCE.getRelationFact()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.dt.edit.parts.RelationFactEditPart.VISUAL_ID;
			}
			if (iArchimate.IArchimatePackage.eINSTANCE.getObservation()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.dt.edit.parts.ObservationEditPart.VISUAL_ID;
			}
			if (iArchimate.IArchimatePackage.eINSTANCE.getDirectObservation()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.dt.edit.parts.DirectObservationEditPart.VISUAL_ID;
			}
			if (iArchimate.IArchimatePackage.eINSTANCE.getPerson()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.dt.edit.parts.PersonEditPart.VISUAL_ID;
			}
			if (iArchimate.IArchimatePackage.eINSTANCE.getDocument()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.dt.edit.parts.DocumentEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
				.getModelID(containerView);
		if (!iArchimate.diagram.dt.edit.parts.DecisionTraceEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (iArchimate.diagram.dt.edit.parts.DecisionTraceEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = iArchimate.diagram.dt.edit.parts.DecisionTraceEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case iArchimate.diagram.dt.edit.parts.DecisionTraceEditPart.VISUAL_ID:
			if (iArchimate.diagram.dt.edit.parts.AttributeFactEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.dt.edit.parts.InstanceFactEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.dt.edit.parts.DecisionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.dt.edit.parts.MeetingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.dt.edit.parts.RelationFactEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.dt.edit.parts.ObservationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.dt.edit.parts.DirectObservationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.dt.edit.parts.PersonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.dt.edit.parts.DocumentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case iArchimate.diagram.dt.edit.parts.AttributeFactEditPart.VISUAL_ID:
			if (iArchimate.diagram.dt.edit.parts.AttributeFactIdFactEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case iArchimate.diagram.dt.edit.parts.InstanceFactEditPart.VISUAL_ID:
			if (iArchimate.diagram.dt.edit.parts.InstanceFactIdFactEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case iArchimate.diagram.dt.edit.parts.DecisionEditPart.VISUAL_ID:
			if (iArchimate.diagram.dt.edit.parts.DecisionIdDecisionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case iArchimate.diagram.dt.edit.parts.MeetingEditPart.VISUAL_ID:
			if (iArchimate.diagram.dt.edit.parts.MeetingNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case iArchimate.diagram.dt.edit.parts.RelationFactEditPart.VISUAL_ID:
			if (iArchimate.diagram.dt.edit.parts.RelationFactIdFactEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case iArchimate.diagram.dt.edit.parts.ObservationEditPart.VISUAL_ID:
			if (iArchimate.diagram.dt.edit.parts.ObservationIdObservationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case iArchimate.diagram.dt.edit.parts.DirectObservationEditPart.VISUAL_ID:
			if (iArchimate.diagram.dt.edit.parts.DirectObservationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case iArchimate.diagram.dt.edit.parts.PersonEditPart.VISUAL_ID:
			if (iArchimate.diagram.dt.edit.parts.PersonNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case iArchimate.diagram.dt.edit.parts.DocumentEditPart.VISUAL_ID:
			if (iArchimate.diagram.dt.edit.parts.DocumentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(iArchimate.DecisionTrace element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case iArchimate.diagram.dt.edit.parts.DecisionTraceEditPart.VISUAL_ID:
			return false;
		case iArchimate.diagram.dt.edit.parts.AttributeFactEditPart.VISUAL_ID:
		case iArchimate.diagram.dt.edit.parts.InstanceFactEditPart.VISUAL_ID:
		case iArchimate.diagram.dt.edit.parts.DecisionEditPart.VISUAL_ID:
		case iArchimate.diagram.dt.edit.parts.MeetingEditPart.VISUAL_ID:
		case iArchimate.diagram.dt.edit.parts.RelationFactEditPart.VISUAL_ID:
		case iArchimate.diagram.dt.edit.parts.ObservationEditPart.VISUAL_ID:
		case iArchimate.diagram.dt.edit.parts.DirectObservationEditPart.VISUAL_ID:
		case iArchimate.diagram.dt.edit.parts.PersonEditPart.VISUAL_ID:
		case iArchimate.diagram.dt.edit.parts.DocumentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
