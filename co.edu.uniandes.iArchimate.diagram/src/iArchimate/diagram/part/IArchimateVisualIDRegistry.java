/*
 * 
 */
package iArchimate.diagram.part;

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
	private static final String DEBUG_KEY = "co.edu.uniandes.iArchimate.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (iArchimate.diagram.edit.parts.ModelEditPart.MODEL_ID
					.equals(view.getType())) {
				return iArchimate.diagram.edit.parts.ModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return iArchimate.diagram.part.IArchimateVisualIDRegistry
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
				iArchimate.diagram.part.IArchimateDiagramEditorPlugin
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
		if (iArchimate.IArchimatePackage.eINSTANCE.getModel().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((iArchimate.Model) domainElement)) {
			return iArchimate.diagram.edit.parts.ModelEditPart.VISUAL_ID;
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
		String containerModelID = iArchimate.diagram.part.IArchimateVisualIDRegistry
				.getModelID(containerView);
		if (!iArchimate.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"iarchimate".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (iArchimate.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = iArchimate.diagram.edit.parts.ModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case iArchimate.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			if (iArchimate.IArchimatePackage.eINSTANCE.getAbsentElement()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.edit.parts.AbsentElementEditPart.VISUAL_ID;
			}
			if (iArchimate.IArchimatePackage.eINSTANCE.getGroup()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.edit.parts.GroupEditPart.VISUAL_ID;
			}
			if (iArchimate.IArchimatePackage.eINSTANCE.getElement()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.edit.parts.ElementEditPart.VISUAL_ID;
			}
			if (iArchimate.IArchimatePackage.eINSTANCE.getDecisionTrace()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.edit.parts.DecisionTraceEditPart.VISUAL_ID;
			}
			break;
		case iArchimate.diagram.edit.parts.AbsentElementAbsentElementComponentsCompartmentEditPart.VISUAL_ID:
			if (iArchimate.IArchimatePackage.eINSTANCE.getAbsentElement()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.edit.parts.AbsentElement2EditPart.VISUAL_ID;
			}
			if (iArchimate.IArchimatePackage.eINSTANCE.getGroup()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.edit.parts.Group2EditPart.VISUAL_ID;
			}
			if (iArchimate.IArchimatePackage.eINSTANCE.getElement()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.edit.parts.Element2EditPart.VISUAL_ID;
			}
			break;
		case iArchimate.diagram.edit.parts.AbsentElementAbsentElementComponentsCompartment2EditPart.VISUAL_ID:
			if (iArchimate.IArchimatePackage.eINSTANCE.getAbsentElement()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.edit.parts.AbsentElement2EditPart.VISUAL_ID;
			}
			if (iArchimate.IArchimatePackage.eINSTANCE.getGroup()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.edit.parts.Group2EditPart.VISUAL_ID;
			}
			if (iArchimate.IArchimatePackage.eINSTANCE.getElement()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.edit.parts.Element2EditPart.VISUAL_ID;
			}
			break;
		case iArchimate.diagram.edit.parts.GroupGroupComponentsCompartmentEditPart.VISUAL_ID:
			if (iArchimate.IArchimatePackage.eINSTANCE.getAbsentElement()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.edit.parts.AbsentElement2EditPart.VISUAL_ID;
			}
			if (iArchimate.IArchimatePackage.eINSTANCE.getGroup()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.edit.parts.Group2EditPart.VISUAL_ID;
			}
			if (iArchimate.IArchimatePackage.eINSTANCE.getElement()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.edit.parts.Element2EditPart.VISUAL_ID;
			}
			break;
		case iArchimate.diagram.edit.parts.ElementElementComponentsCompartmentEditPart.VISUAL_ID:
			if (iArchimate.IArchimatePackage.eINSTANCE.getAbsentElement()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.edit.parts.AbsentElement2EditPart.VISUAL_ID;
			}
			if (iArchimate.IArchimatePackage.eINSTANCE.getGroup()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.edit.parts.Group2EditPart.VISUAL_ID;
			}
			if (iArchimate.IArchimatePackage.eINSTANCE.getElement()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.edit.parts.Element2EditPart.VISUAL_ID;
			}
			break;
		case iArchimate.diagram.edit.parts.GroupGroupComponentsCompartment2EditPart.VISUAL_ID:
			if (iArchimate.IArchimatePackage.eINSTANCE.getAbsentElement()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.edit.parts.AbsentElement2EditPart.VISUAL_ID;
			}
			if (iArchimate.IArchimatePackage.eINSTANCE.getGroup()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.edit.parts.Group2EditPart.VISUAL_ID;
			}
			if (iArchimate.IArchimatePackage.eINSTANCE.getElement()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.edit.parts.Element2EditPart.VISUAL_ID;
			}
			break;
		case iArchimate.diagram.edit.parts.ElementElementComponentsCompartment2EditPart.VISUAL_ID:
			if (iArchimate.IArchimatePackage.eINSTANCE.getAbsentElement()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.edit.parts.AbsentElement2EditPart.VISUAL_ID;
			}
			if (iArchimate.IArchimatePackage.eINSTANCE.getGroup()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.edit.parts.Group2EditPart.VISUAL_ID;
			}
			if (iArchimate.IArchimatePackage.eINSTANCE.getElement()
					.isSuperTypeOf(domainElement.eClass())) {
				return iArchimate.diagram.edit.parts.Element2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = iArchimate.diagram.part.IArchimateVisualIDRegistry
				.getModelID(containerView);
		if (!iArchimate.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"iarchimate".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (iArchimate.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = iArchimate.diagram.edit.parts.ModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case iArchimate.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			if (iArchimate.diagram.edit.parts.AbsentElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.edit.parts.GroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.edit.parts.ElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.edit.parts.DecisionTraceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case iArchimate.diagram.edit.parts.AbsentElementEditPart.VISUAL_ID:
			if (iArchimate.diagram.edit.parts.AbsentElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.edit.parts.AbsentElementAbsentElementComponentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case iArchimate.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			if (iArchimate.diagram.edit.parts.GroupNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.edit.parts.GroupGroupComponentsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case iArchimate.diagram.edit.parts.ElementEditPart.VISUAL_ID:
			if (iArchimate.diagram.edit.parts.ElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.edit.parts.ElementElementComponentsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case iArchimate.diagram.edit.parts.DecisionTraceEditPart.VISUAL_ID:
			if (iArchimate.diagram.edit.parts.DecisionTraceIdDecisionTraceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case iArchimate.diagram.edit.parts.AbsentElement2EditPart.VISUAL_ID:
			if (iArchimate.diagram.edit.parts.AbsentElementName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.edit.parts.AbsentElementAbsentElementComponentsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case iArchimate.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			if (iArchimate.diagram.edit.parts.GroupName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.edit.parts.GroupGroupComponentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case iArchimate.diagram.edit.parts.Element2EditPart.VISUAL_ID:
			if (iArchimate.diagram.edit.parts.ElementName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.edit.parts.ElementElementComponentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case iArchimate.diagram.edit.parts.AbsentElementAbsentElementComponentsCompartmentEditPart.VISUAL_ID:
			if (iArchimate.diagram.edit.parts.AbsentElement2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.edit.parts.Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.edit.parts.Element2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case iArchimate.diagram.edit.parts.AbsentElementAbsentElementComponentsCompartment2EditPart.VISUAL_ID:
			if (iArchimate.diagram.edit.parts.AbsentElement2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.edit.parts.Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.edit.parts.Element2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case iArchimate.diagram.edit.parts.GroupGroupComponentsCompartmentEditPart.VISUAL_ID:
			if (iArchimate.diagram.edit.parts.AbsentElement2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.edit.parts.Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.edit.parts.Element2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case iArchimate.diagram.edit.parts.ElementElementComponentsCompartmentEditPart.VISUAL_ID:
			if (iArchimate.diagram.edit.parts.AbsentElement2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.edit.parts.Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.edit.parts.Element2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case iArchimate.diagram.edit.parts.GroupGroupComponentsCompartment2EditPart.VISUAL_ID:
			if (iArchimate.diagram.edit.parts.AbsentElement2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.edit.parts.Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.edit.parts.Element2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case iArchimate.diagram.edit.parts.ElementElementComponentsCompartment2EditPart.VISUAL_ID:
			if (iArchimate.diagram.edit.parts.AbsentElement2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.edit.parts.Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (iArchimate.diagram.edit.parts.Element2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case iArchimate.diagram.edit.parts.ImperfectRelationEditPart.VISUAL_ID:
			if (iArchimate.diagram.edit.parts.ImperfectRelationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case iArchimate.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			if (iArchimate.diagram.edit.parts.RelationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case iArchimate.diagram.edit.parts.ElementElementDecisionTraceEditPart.VISUAL_ID:
			if (iArchimate.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
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
		if (iArchimate.IArchimatePackage.eINSTANCE.getImperfectRelation()
				.isSuperTypeOf(domainElement.eClass())) {
			return iArchimate.diagram.edit.parts.ImperfectRelationEditPart.VISUAL_ID;
		}
		if (iArchimate.IArchimatePackage.eINSTANCE.getRelation().isSuperTypeOf(
				domainElement.eClass())) {
			return iArchimate.diagram.edit.parts.RelationEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(iArchimate.Model element) {
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
		switch (visualID) {
		case iArchimate.diagram.edit.parts.AbsentElementAbsentElementComponentsCompartmentEditPart.VISUAL_ID:
		case iArchimate.diagram.edit.parts.AbsentElementAbsentElementComponentsCompartment2EditPart.VISUAL_ID:
		case iArchimate.diagram.edit.parts.GroupGroupComponentsCompartmentEditPart.VISUAL_ID:
		case iArchimate.diagram.edit.parts.ElementElementComponentsCompartmentEditPart.VISUAL_ID:
		case iArchimate.diagram.edit.parts.GroupGroupComponentsCompartment2EditPart.VISUAL_ID:
		case iArchimate.diagram.edit.parts.ElementElementComponentsCompartment2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case iArchimate.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return false;
		case iArchimate.diagram.edit.parts.DecisionTraceEditPart.VISUAL_ID:
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
			return iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return iArchimate.diagram.part.IArchimateVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return iArchimate.diagram.part.IArchimateVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return iArchimate.diagram.part.IArchimateVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
