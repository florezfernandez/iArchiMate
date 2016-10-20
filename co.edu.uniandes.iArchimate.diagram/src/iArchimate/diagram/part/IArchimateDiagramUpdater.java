/*
 * 
 */
package iArchimate.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class IArchimateDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateNodeDescriptor> getSemanticChildren(
			View view) {
		switch (iArchimate.diagram.part.IArchimateVisualIDRegistry
				.getVisualID(view)) {
		case iArchimate.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getModel_1000SemanticChildren(view);
		case iArchimate.diagram.edit.parts.AbsentElementAbsentElementComponentsCompartmentEditPart.VISUAL_ID:
			return getAbsentElementAbsentElementComponentsCompartment_7018SemanticChildren(view);
		case iArchimate.diagram.edit.parts.AbsentElementAbsentElementComponentsCompartment2EditPart.VISUAL_ID:
			return getAbsentElementAbsentElementComponentsCompartment_7032SemanticChildren(view);
		case iArchimate.diagram.edit.parts.GroupGroupComponentsCompartmentEditPart.VISUAL_ID:
			return getGroupGroupComponentsCompartment_7034SemanticChildren(view);
		case iArchimate.diagram.edit.parts.ElementElementComponentsCompartmentEditPart.VISUAL_ID:
			return getElementElementComponentsCompartment_7035SemanticChildren(view);
		case iArchimate.diagram.edit.parts.GroupGroupComponentsCompartment2EditPart.VISUAL_ID:
			return getGroupGroupComponentsCompartment_7019SemanticChildren(view);
		case iArchimate.diagram.edit.parts.ElementElementComponentsCompartment2EditPart.VISUAL_ID:
			return getElementElementComponentsCompartment_7023SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateNodeDescriptor> getModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		iArchimate.Model modelElement = (iArchimate.Model) view.getElement();
		LinkedList<iArchimate.diagram.part.IArchimateNodeDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			iArchimate.Component childElement = (iArchimate.Component) it
					.next();
			int visualID = iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == iArchimate.diagram.edit.parts.AbsentElementEditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == iArchimate.diagram.edit.parts.GroupEditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == iArchimate.diagram.edit.parts.ElementEditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getDecisionTraces().iterator(); it
				.hasNext();) {
			iArchimate.DecisionTrace childElement = (iArchimate.DecisionTrace) it
					.next();
			int visualID = iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == iArchimate.diagram.edit.parts.DecisionTraceEditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateNodeDescriptor> getAbsentElementAbsentElementComponentsCompartment_7018SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		iArchimate.AbsentElement modelElement = (iArchimate.AbsentElement) containerView
				.getElement();
		LinkedList<iArchimate.diagram.part.IArchimateNodeDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			iArchimate.Component childElement = (iArchimate.Component) it
					.next();
			int visualID = iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == iArchimate.diagram.edit.parts.AbsentElement2EditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == iArchimate.diagram.edit.parts.Group2EditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == iArchimate.diagram.edit.parts.Element2EditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateNodeDescriptor> getAbsentElementAbsentElementComponentsCompartment_7032SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		iArchimate.AbsentElement modelElement = (iArchimate.AbsentElement) containerView
				.getElement();
		LinkedList<iArchimate.diagram.part.IArchimateNodeDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			iArchimate.Component childElement = (iArchimate.Component) it
					.next();
			int visualID = iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == iArchimate.diagram.edit.parts.AbsentElement2EditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == iArchimate.diagram.edit.parts.Group2EditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == iArchimate.diagram.edit.parts.Element2EditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateNodeDescriptor> getGroupGroupComponentsCompartment_7034SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		iArchimate.Group modelElement = (iArchimate.Group) containerView
				.getElement();
		LinkedList<iArchimate.diagram.part.IArchimateNodeDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			iArchimate.Component childElement = (iArchimate.Component) it
					.next();
			int visualID = iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == iArchimate.diagram.edit.parts.AbsentElement2EditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == iArchimate.diagram.edit.parts.Group2EditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == iArchimate.diagram.edit.parts.Element2EditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateNodeDescriptor> getElementElementComponentsCompartment_7035SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		iArchimate.Element modelElement = (iArchimate.Element) containerView
				.getElement();
		LinkedList<iArchimate.diagram.part.IArchimateNodeDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			iArchimate.Component childElement = (iArchimate.Component) it
					.next();
			int visualID = iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == iArchimate.diagram.edit.parts.AbsentElement2EditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == iArchimate.diagram.edit.parts.Group2EditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == iArchimate.diagram.edit.parts.Element2EditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateNodeDescriptor> getGroupGroupComponentsCompartment_7019SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		iArchimate.Group modelElement = (iArchimate.Group) containerView
				.getElement();
		LinkedList<iArchimate.diagram.part.IArchimateNodeDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			iArchimate.Component childElement = (iArchimate.Component) it
					.next();
			int visualID = iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == iArchimate.diagram.edit.parts.AbsentElement2EditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == iArchimate.diagram.edit.parts.Group2EditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == iArchimate.diagram.edit.parts.Element2EditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateNodeDescriptor> getElementElementComponentsCompartment_7023SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		iArchimate.Element modelElement = (iArchimate.Element) containerView
				.getElement();
		LinkedList<iArchimate.diagram.part.IArchimateNodeDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			iArchimate.Component childElement = (iArchimate.Component) it
					.next();
			int visualID = iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == iArchimate.diagram.edit.parts.AbsentElement2EditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == iArchimate.diagram.edit.parts.Group2EditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == iArchimate.diagram.edit.parts.Element2EditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getContainedLinks(
			View view) {
		switch (iArchimate.diagram.part.IArchimateVisualIDRegistry
				.getVisualID(view)) {
		case iArchimate.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getModel_1000ContainedLinks(view);
		case iArchimate.diagram.edit.parts.AbsentElementEditPart.VISUAL_ID:
			return getAbsentElement_2008ContainedLinks(view);
		case iArchimate.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return getGroup_2009ContainedLinks(view);
		case iArchimate.diagram.edit.parts.ElementEditPart.VISUAL_ID:
			return getElement_2010ContainedLinks(view);
		case iArchimate.diagram.edit.parts.DecisionTraceEditPart.VISUAL_ID:
			return getDecisionTrace_2011ContainedLinks(view);
		case iArchimate.diagram.edit.parts.AbsentElement2EditPart.VISUAL_ID:
			return getAbsentElement_3023ContainedLinks(view);
		case iArchimate.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return getGroup_3024ContainedLinks(view);
		case iArchimate.diagram.edit.parts.Element2EditPart.VISUAL_ID:
			return getElement_3025ContainedLinks(view);
		case iArchimate.diagram.edit.parts.ImperfectRelationEditPart.VISUAL_ID:
			return getImperfectRelation_4012ContainedLinks(view);
		case iArchimate.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getRelation_4013ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getIncomingLinks(
			View view) {
		switch (iArchimate.diagram.part.IArchimateVisualIDRegistry
				.getVisualID(view)) {
		case iArchimate.diagram.edit.parts.AbsentElementEditPart.VISUAL_ID:
			return getAbsentElement_2008IncomingLinks(view);
		case iArchimate.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return getGroup_2009IncomingLinks(view);
		case iArchimate.diagram.edit.parts.ElementEditPart.VISUAL_ID:
			return getElement_2010IncomingLinks(view);
		case iArchimate.diagram.edit.parts.DecisionTraceEditPart.VISUAL_ID:
			return getDecisionTrace_2011IncomingLinks(view);
		case iArchimate.diagram.edit.parts.AbsentElement2EditPart.VISUAL_ID:
			return getAbsentElement_3023IncomingLinks(view);
		case iArchimate.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return getGroup_3024IncomingLinks(view);
		case iArchimate.diagram.edit.parts.Element2EditPart.VISUAL_ID:
			return getElement_3025IncomingLinks(view);
		case iArchimate.diagram.edit.parts.ImperfectRelationEditPart.VISUAL_ID:
			return getImperfectRelation_4012IncomingLinks(view);
		case iArchimate.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getRelation_4013IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (iArchimate.diagram.part.IArchimateVisualIDRegistry
				.getVisualID(view)) {
		case iArchimate.diagram.edit.parts.AbsentElementEditPart.VISUAL_ID:
			return getAbsentElement_2008OutgoingLinks(view);
		case iArchimate.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return getGroup_2009OutgoingLinks(view);
		case iArchimate.diagram.edit.parts.ElementEditPart.VISUAL_ID:
			return getElement_2010OutgoingLinks(view);
		case iArchimate.diagram.edit.parts.DecisionTraceEditPart.VISUAL_ID:
			return getDecisionTrace_2011OutgoingLinks(view);
		case iArchimate.diagram.edit.parts.AbsentElement2EditPart.VISUAL_ID:
			return getAbsentElement_3023OutgoingLinks(view);
		case iArchimate.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return getGroup_3024OutgoingLinks(view);
		case iArchimate.diagram.edit.parts.Element2EditPart.VISUAL_ID:
			return getElement_3025OutgoingLinks(view);
		case iArchimate.diagram.edit.parts.ImperfectRelationEditPart.VISUAL_ID:
			return getImperfectRelation_4012OutgoingLinks(view);
		case iArchimate.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getRelation_4013OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getModel_1000ContainedLinks(
			View view) {
		iArchimate.Model modelElement = (iArchimate.Model) view.getElement();
		LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ImperfectRelation_4012(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Relation_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getAbsentElement_2008ContainedLinks(
			View view) {
		iArchimate.AbsentElement modelElement = (iArchimate.AbsentElement) view
				.getElement();
		LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Element_ElementDecisionTrace_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getGroup_2009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getElement_2010ContainedLinks(
			View view) {
		iArchimate.Element modelElement = (iArchimate.Element) view
				.getElement();
		LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Element_ElementDecisionTrace_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getDecisionTrace_2011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getAbsentElement_3023ContainedLinks(
			View view) {
		iArchimate.AbsentElement modelElement = (iArchimate.AbsentElement) view
				.getElement();
		LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Element_ElementDecisionTrace_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getGroup_3024ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getElement_3025ContainedLinks(
			View view) {
		iArchimate.Element modelElement = (iArchimate.Element) view
				.getElement();
		LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Element_ElementDecisionTrace_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getImperfectRelation_4012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getRelation_4013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getAbsentElement_2008IncomingLinks(
			View view) {
		iArchimate.AbsentElement modelElement = (iArchimate.AbsentElement) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ImperfectRelation_4012(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Relation_4013(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getGroup_2009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getElement_2010IncomingLinks(
			View view) {
		iArchimate.Element modelElement = (iArchimate.Element) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ImperfectRelation_4012(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Relation_4013(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getDecisionTrace_2011IncomingLinks(
			View view) {
		iArchimate.DecisionTrace modelElement = (iArchimate.DecisionTrace) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Element_ElementDecisionTrace_4015(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getAbsentElement_3023IncomingLinks(
			View view) {
		iArchimate.AbsentElement modelElement = (iArchimate.AbsentElement) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ImperfectRelation_4012(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Relation_4013(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getGroup_3024IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getElement_3025IncomingLinks(
			View view) {
		iArchimate.Element modelElement = (iArchimate.Element) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ImperfectRelation_4012(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Relation_4013(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getImperfectRelation_4012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getRelation_4013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getAbsentElement_2008OutgoingLinks(
			View view) {
		iArchimate.AbsentElement modelElement = (iArchimate.AbsentElement) view
				.getElement();
		LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ImperfectRelation_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Relation_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Element_ElementDecisionTrace_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getGroup_2009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getElement_2010OutgoingLinks(
			View view) {
		iArchimate.Element modelElement = (iArchimate.Element) view
				.getElement();
		LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ImperfectRelation_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Relation_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Element_ElementDecisionTrace_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getDecisionTrace_2011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getAbsentElement_3023OutgoingLinks(
			View view) {
		iArchimate.AbsentElement modelElement = (iArchimate.AbsentElement) view
				.getElement();
		LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ImperfectRelation_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Relation_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Element_ElementDecisionTrace_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getGroup_3024OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getElement_3025OutgoingLinks(
			View view) {
		iArchimate.Element modelElement = (iArchimate.Element) view
				.getElement();
		LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ImperfectRelation_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Relation_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Element_ElementDecisionTrace_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getImperfectRelation_4012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.part.IArchimateLinkDescriptor> getRelation_4013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<iArchimate.diagram.part.IArchimateLinkDescriptor> getContainedTypeModelFacetLinks_ImperfectRelation_4012(
			iArchimate.Model container) {
		LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor>();
		for (Iterator<?> links = container.getRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof iArchimate.ImperfectRelation) {
				continue;
			}
			iArchimate.ImperfectRelation link = (iArchimate.ImperfectRelation) linkObject;
			if (iArchimate.diagram.edit.parts.ImperfectRelationEditPart.VISUAL_ID != iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			iArchimate.Element dst = link.getTarget();
			iArchimate.Element src = link.getSource();
			result.add(new iArchimate.diagram.part.IArchimateLinkDescriptor(
					src,
					dst,
					link,
					iArchimate.diagram.providers.IArchimateElementTypes.ImperfectRelation_4012,
					iArchimate.diagram.edit.parts.ImperfectRelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<iArchimate.diagram.part.IArchimateLinkDescriptor> getContainedTypeModelFacetLinks_Relation_4013(
			iArchimate.Model container) {
		LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor>();
		for (Iterator<?> links = container.getRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof iArchimate.Relation) {
				continue;
			}
			iArchimate.Relation link = (iArchimate.Relation) linkObject;
			if (iArchimate.diagram.edit.parts.RelationEditPart.VISUAL_ID != iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			iArchimate.Element dst = link.getTarget();
			iArchimate.Element src = link.getSource();
			result.add(new iArchimate.diagram.part.IArchimateLinkDescriptor(
					src,
					dst,
					link,
					iArchimate.diagram.providers.IArchimateElementTypes.Relation_4013,
					iArchimate.diagram.edit.parts.RelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<iArchimate.diagram.part.IArchimateLinkDescriptor> getIncomingTypeModelFacetLinks_ImperfectRelation_4012(
			iArchimate.Element target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != iArchimate.IArchimatePackage.eINSTANCE
					.getRelation_Target()
					|| false == setting.getEObject() instanceof iArchimate.ImperfectRelation) {
				continue;
			}
			iArchimate.ImperfectRelation link = (iArchimate.ImperfectRelation) setting
					.getEObject();
			if (iArchimate.diagram.edit.parts.ImperfectRelationEditPart.VISUAL_ID != iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			iArchimate.Element src = link.getSource();
			result.add(new iArchimate.diagram.part.IArchimateLinkDescriptor(
					src,
					target,
					link,
					iArchimate.diagram.providers.IArchimateElementTypes.ImperfectRelation_4012,
					iArchimate.diagram.edit.parts.ImperfectRelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<iArchimate.diagram.part.IArchimateLinkDescriptor> getIncomingTypeModelFacetLinks_Relation_4013(
			iArchimate.Element target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != iArchimate.IArchimatePackage.eINSTANCE
					.getRelation_Target()
					|| false == setting.getEObject() instanceof iArchimate.Relation) {
				continue;
			}
			iArchimate.Relation link = (iArchimate.Relation) setting
					.getEObject();
			if (iArchimate.diagram.edit.parts.RelationEditPart.VISUAL_ID != iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			iArchimate.Element src = link.getSource();
			result.add(new iArchimate.diagram.part.IArchimateLinkDescriptor(
					src,
					target,
					link,
					iArchimate.diagram.providers.IArchimateElementTypes.Relation_4013,
					iArchimate.diagram.edit.parts.RelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<iArchimate.diagram.part.IArchimateLinkDescriptor> getIncomingFeatureModelFacetLinks_Element_ElementDecisionTrace_4015(
			iArchimate.DecisionTrace target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == iArchimate.IArchimatePackage.eINSTANCE
					.getElement_ElementDecisionTrace()) {
				result.add(new iArchimate.diagram.part.IArchimateLinkDescriptor(
						setting.getEObject(),
						target,
						iArchimate.diagram.providers.IArchimateElementTypes.ElementElementDecisionTrace_4015,
						iArchimate.diagram.edit.parts.ElementElementDecisionTraceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<iArchimate.diagram.part.IArchimateLinkDescriptor> getOutgoingTypeModelFacetLinks_ImperfectRelation_4012(
			iArchimate.Element source) {
		iArchimate.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof iArchimate.Model) {
				container = (iArchimate.Model) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor>();
		for (Iterator<?> links = container.getRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof iArchimate.ImperfectRelation) {
				continue;
			}
			iArchimate.ImperfectRelation link = (iArchimate.ImperfectRelation) linkObject;
			if (iArchimate.diagram.edit.parts.ImperfectRelationEditPart.VISUAL_ID != iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			iArchimate.Element dst = link.getTarget();
			iArchimate.Element src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new iArchimate.diagram.part.IArchimateLinkDescriptor(
					src,
					dst,
					link,
					iArchimate.diagram.providers.IArchimateElementTypes.ImperfectRelation_4012,
					iArchimate.diagram.edit.parts.ImperfectRelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<iArchimate.diagram.part.IArchimateLinkDescriptor> getOutgoingTypeModelFacetLinks_Relation_4013(
			iArchimate.Element source) {
		iArchimate.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof iArchimate.Model) {
				container = (iArchimate.Model) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor>();
		for (Iterator<?> links = container.getRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof iArchimate.Relation) {
				continue;
			}
			iArchimate.Relation link = (iArchimate.Relation) linkObject;
			if (iArchimate.diagram.edit.parts.RelationEditPart.VISUAL_ID != iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			iArchimate.Element dst = link.getTarget();
			iArchimate.Element src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new iArchimate.diagram.part.IArchimateLinkDescriptor(
					src,
					dst,
					link,
					iArchimate.diagram.providers.IArchimateElementTypes.Relation_4013,
					iArchimate.diagram.edit.parts.RelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<iArchimate.diagram.part.IArchimateLinkDescriptor> getOutgoingFeatureModelFacetLinks_Element_ElementDecisionTrace_4015(
			iArchimate.Element source) {
		LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.part.IArchimateLinkDescriptor>();
		iArchimate.DecisionTrace destination = source.getElementDecisionTrace();
		if (destination == null) {
			return result;
		}
		result.add(new iArchimate.diagram.part.IArchimateLinkDescriptor(
				source,
				destination,
				iArchimate.diagram.providers.IArchimateElementTypes.ElementElementDecisionTrace_4015,
				iArchimate.diagram.edit.parts.ElementElementDecisionTraceEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<iArchimate.diagram.part.IArchimateNodeDescriptor> getSemanticChildren(
				View view) {
			return IArchimateDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<iArchimate.diagram.part.IArchimateLinkDescriptor> getContainedLinks(
				View view) {
			return IArchimateDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<iArchimate.diagram.part.IArchimateLinkDescriptor> getIncomingLinks(
				View view) {
			return IArchimateDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<iArchimate.diagram.part.IArchimateLinkDescriptor> getOutgoingLinks(
				View view) {
			return IArchimateDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
