package iArchimate.diagram.dt.part;

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
	public static List<iArchimate.diagram.dt.part.IArchimateNodeDescriptor> getSemanticChildren(
			View view) {
		switch (iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
				.getVisualID(view)) {
		case iArchimate.diagram.dt.edit.parts.DecisionTraceEditPart.VISUAL_ID:
			return getDecisionTrace_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateNodeDescriptor> getDecisionTrace_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		iArchimate.DecisionTrace modelElement = (iArchimate.DecisionTrace) view
				.getElement();
		LinkedList<iArchimate.diagram.dt.part.IArchimateNodeDescriptor> result = new LinkedList<iArchimate.diagram.dt.part.IArchimateNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFacts().iterator(); it.hasNext();) {
			iArchimate.Fact childElement = (iArchimate.Fact) it.next();
			int visualID = iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == iArchimate.diagram.dt.edit.parts.AttributeFactEditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.dt.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == iArchimate.diagram.dt.edit.parts.InstanceFactEditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.dt.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == iArchimate.diagram.dt.edit.parts.RelationFactEditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.dt.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getDecisions().iterator(); it
				.hasNext();) {
			iArchimate.Decision childElement = (iArchimate.Decision) it.next();
			int visualID = iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == iArchimate.diagram.dt.edit.parts.DecisionEditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.dt.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSources().iterator(); it
				.hasNext();) {
			iArchimate.Source childElement = (iArchimate.Source) it.next();
			int visualID = iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == iArchimate.diagram.dt.edit.parts.MeetingEditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.dt.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == iArchimate.diagram.dt.edit.parts.DirectObservationEditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.dt.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == iArchimate.diagram.dt.edit.parts.PersonEditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.dt.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == iArchimate.diagram.dt.edit.parts.DocumentEditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.dt.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getObservations().iterator(); it
				.hasNext();) {
			iArchimate.Observation childElement = (iArchimate.Observation) it
					.next();
			int visualID = iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == iArchimate.diagram.dt.edit.parts.ObservationEditPart.VISUAL_ID) {
				result.add(new iArchimate.diagram.dt.part.IArchimateNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getContainedLinks(
			View view) {
		switch (iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
				.getVisualID(view)) {
		case iArchimate.diagram.dt.edit.parts.DecisionTraceEditPart.VISUAL_ID:
			return getDecisionTrace_1000ContainedLinks(view);
		case iArchimate.diagram.dt.edit.parts.AttributeFactEditPart.VISUAL_ID:
			return getAttributeFact_2001ContainedLinks(view);
		case iArchimate.diagram.dt.edit.parts.InstanceFactEditPart.VISUAL_ID:
			return getInstanceFact_2002ContainedLinks(view);
		case iArchimate.diagram.dt.edit.parts.DecisionEditPart.VISUAL_ID:
			return getDecision_2003ContainedLinks(view);
		case iArchimate.diagram.dt.edit.parts.MeetingEditPart.VISUAL_ID:
			return getMeeting_2004ContainedLinks(view);
		case iArchimate.diagram.dt.edit.parts.RelationFactEditPart.VISUAL_ID:
			return getRelationFact_2005ContainedLinks(view);
		case iArchimate.diagram.dt.edit.parts.ObservationEditPart.VISUAL_ID:
			return getObservation_2006ContainedLinks(view);
		case iArchimate.diagram.dt.edit.parts.DirectObservationEditPart.VISUAL_ID:
			return getDirectObservation_2007ContainedLinks(view);
		case iArchimate.diagram.dt.edit.parts.PersonEditPart.VISUAL_ID:
			return getPerson_2008ContainedLinks(view);
		case iArchimate.diagram.dt.edit.parts.DocumentEditPart.VISUAL_ID:
			return getDocument_2009ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getIncomingLinks(
			View view) {
		switch (iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
				.getVisualID(view)) {
		case iArchimate.diagram.dt.edit.parts.AttributeFactEditPart.VISUAL_ID:
			return getAttributeFact_2001IncomingLinks(view);
		case iArchimate.diagram.dt.edit.parts.InstanceFactEditPart.VISUAL_ID:
			return getInstanceFact_2002IncomingLinks(view);
		case iArchimate.diagram.dt.edit.parts.DecisionEditPart.VISUAL_ID:
			return getDecision_2003IncomingLinks(view);
		case iArchimate.diagram.dt.edit.parts.MeetingEditPart.VISUAL_ID:
			return getMeeting_2004IncomingLinks(view);
		case iArchimate.diagram.dt.edit.parts.RelationFactEditPart.VISUAL_ID:
			return getRelationFact_2005IncomingLinks(view);
		case iArchimate.diagram.dt.edit.parts.ObservationEditPart.VISUAL_ID:
			return getObservation_2006IncomingLinks(view);
		case iArchimate.diagram.dt.edit.parts.DirectObservationEditPart.VISUAL_ID:
			return getDirectObservation_2007IncomingLinks(view);
		case iArchimate.diagram.dt.edit.parts.PersonEditPart.VISUAL_ID:
			return getPerson_2008IncomingLinks(view);
		case iArchimate.diagram.dt.edit.parts.DocumentEditPart.VISUAL_ID:
			return getDocument_2009IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
				.getVisualID(view)) {
		case iArchimate.diagram.dt.edit.parts.AttributeFactEditPart.VISUAL_ID:
			return getAttributeFact_2001OutgoingLinks(view);
		case iArchimate.diagram.dt.edit.parts.InstanceFactEditPart.VISUAL_ID:
			return getInstanceFact_2002OutgoingLinks(view);
		case iArchimate.diagram.dt.edit.parts.DecisionEditPart.VISUAL_ID:
			return getDecision_2003OutgoingLinks(view);
		case iArchimate.diagram.dt.edit.parts.MeetingEditPart.VISUAL_ID:
			return getMeeting_2004OutgoingLinks(view);
		case iArchimate.diagram.dt.edit.parts.RelationFactEditPart.VISUAL_ID:
			return getRelationFact_2005OutgoingLinks(view);
		case iArchimate.diagram.dt.edit.parts.ObservationEditPart.VISUAL_ID:
			return getObservation_2006OutgoingLinks(view);
		case iArchimate.diagram.dt.edit.parts.DirectObservationEditPart.VISUAL_ID:
			return getDirectObservation_2007OutgoingLinks(view);
		case iArchimate.diagram.dt.edit.parts.PersonEditPart.VISUAL_ID:
			return getPerson_2008OutgoingLinks(view);
		case iArchimate.diagram.dt.edit.parts.DocumentEditPart.VISUAL_ID:
			return getDocument_2009OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getDecisionTrace_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getAttributeFact_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getInstanceFact_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getDecision_2003ContainedLinks(
			View view) {
		iArchimate.Decision modelElement = (iArchimate.Decision) view
				.getElement();
		LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Decision_DecisionFacts_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getMeeting_2004ContainedLinks(
			View view) {
		iArchimate.Meeting modelElement = (iArchimate.Meeting) view
				.getElement();
		LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Source_SourceObservations_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Meeting_MeetingParticipants_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getRelationFact_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getObservation_2006ContainedLinks(
			View view) {
		iArchimate.Observation modelElement = (iArchimate.Observation) view
				.getElement();
		LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Observation_ObservationFacts_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getDirectObservation_2007ContainedLinks(
			View view) {
		iArchimate.DirectObservation modelElement = (iArchimate.DirectObservation) view
				.getElement();
		LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Source_SourceObservations_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getPerson_2008ContainedLinks(
			View view) {
		iArchimate.Person modelElement = (iArchimate.Person) view.getElement();
		LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Source_SourceObservations_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getDocument_2009ContainedLinks(
			View view) {
		iArchimate.Document modelElement = (iArchimate.Document) view
				.getElement();
		LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Source_SourceObservations_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getAttributeFact_2001IncomingLinks(
			View view) {
		iArchimate.AttributeFact modelElement = (iArchimate.AttributeFact) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Observation_ObservationFacts_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Decision_DecisionFacts_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getInstanceFact_2002IncomingLinks(
			View view) {
		iArchimate.InstanceFact modelElement = (iArchimate.InstanceFact) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Observation_ObservationFacts_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Decision_DecisionFacts_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getDecision_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getMeeting_2004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getRelationFact_2005IncomingLinks(
			View view) {
		iArchimate.RelationFact modelElement = (iArchimate.RelationFact) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Observation_ObservationFacts_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Decision_DecisionFacts_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getObservation_2006IncomingLinks(
			View view) {
		iArchimate.Observation modelElement = (iArchimate.Observation) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Source_SourceObservations_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getDirectObservation_2007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getPerson_2008IncomingLinks(
			View view) {
		iArchimate.Person modelElement = (iArchimate.Person) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Meeting_MeetingParticipants_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getDocument_2009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getAttributeFact_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getInstanceFact_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getDecision_2003OutgoingLinks(
			View view) {
		iArchimate.Decision modelElement = (iArchimate.Decision) view
				.getElement();
		LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Decision_DecisionFacts_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getMeeting_2004OutgoingLinks(
			View view) {
		iArchimate.Meeting modelElement = (iArchimate.Meeting) view
				.getElement();
		LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Source_SourceObservations_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Meeting_MeetingParticipants_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getRelationFact_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getObservation_2006OutgoingLinks(
			View view) {
		iArchimate.Observation modelElement = (iArchimate.Observation) view
				.getElement();
		LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Observation_ObservationFacts_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getDirectObservation_2007OutgoingLinks(
			View view) {
		iArchimate.DirectObservation modelElement = (iArchimate.DirectObservation) view
				.getElement();
		LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Source_SourceObservations_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getPerson_2008OutgoingLinks(
			View view) {
		iArchimate.Person modelElement = (iArchimate.Person) view.getElement();
		LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Source_SourceObservations_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getDocument_2009OutgoingLinks(
			View view) {
		iArchimate.Document modelElement = (iArchimate.Document) view
				.getElement();
		LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Source_SourceObservations_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getIncomingFeatureModelFacetLinks_Source_SourceObservations_4005(
			iArchimate.Observation target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == iArchimate.IArchimatePackage.eINSTANCE
					.getSource_SourceObservations()) {
				result.add(new iArchimate.diagram.dt.part.IArchimateLinkDescriptor(
						setting.getEObject(),
						target,
						iArchimate.diagram.dt.providers.IArchimateElementTypes.SourceSourceObservations_4005,
						iArchimate.diagram.dt.edit.parts.SourceSourceObservationsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getIncomingFeatureModelFacetLinks_Meeting_MeetingParticipants_4002(
			iArchimate.Person target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == iArchimate.IArchimatePackage.eINSTANCE
					.getMeeting_MeetingParticipants()) {
				result.add(new iArchimate.diagram.dt.part.IArchimateLinkDescriptor(
						setting.getEObject(),
						target,
						iArchimate.diagram.dt.providers.IArchimateElementTypes.MeetingMeetingParticipants_4002,
						iArchimate.diagram.dt.edit.parts.MeetingMeetingParticipantsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getIncomingFeatureModelFacetLinks_Observation_ObservationFacts_4006(
			iArchimate.Fact target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == iArchimate.IArchimatePackage.eINSTANCE
					.getObservation_ObservationFacts()) {
				result.add(new iArchimate.diagram.dt.part.IArchimateLinkDescriptor(
						setting.getEObject(),
						target,
						iArchimate.diagram.dt.providers.IArchimateElementTypes.ObservationObservationFacts_4006,
						iArchimate.diagram.dt.edit.parts.ObservationObservationFactsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getIncomingFeatureModelFacetLinks_Decision_DecisionFacts_4003(
			iArchimate.Fact target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == iArchimate.IArchimatePackage.eINSTANCE
					.getDecision_DecisionFacts()) {
				result.add(new iArchimate.diagram.dt.part.IArchimateLinkDescriptor(
						setting.getEObject(),
						target,
						iArchimate.diagram.dt.providers.IArchimateElementTypes.DecisionDecisionFacts_4003,
						iArchimate.diagram.dt.edit.parts.DecisionDecisionFactsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getOutgoingFeatureModelFacetLinks_Source_SourceObservations_4005(
			iArchimate.Source source) {
		LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor>();
		for (Iterator<?> destinations = source.getSourceObservations()
				.iterator(); destinations.hasNext();) {
			iArchimate.Observation destination = (iArchimate.Observation) destinations
					.next();
			result.add(new iArchimate.diagram.dt.part.IArchimateLinkDescriptor(
					source,
					destination,
					iArchimate.diagram.dt.providers.IArchimateElementTypes.SourceSourceObservations_4005,
					iArchimate.diagram.dt.edit.parts.SourceSourceObservationsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getOutgoingFeatureModelFacetLinks_Meeting_MeetingParticipants_4002(
			iArchimate.Meeting source) {
		LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor>();
		for (Iterator<?> destinations = source.getMeetingParticipants()
				.iterator(); destinations.hasNext();) {
			iArchimate.Person destination = (iArchimate.Person) destinations
					.next();
			result.add(new iArchimate.diagram.dt.part.IArchimateLinkDescriptor(
					source,
					destination,
					iArchimate.diagram.dt.providers.IArchimateElementTypes.MeetingMeetingParticipants_4002,
					iArchimate.diagram.dt.edit.parts.MeetingMeetingParticipantsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getOutgoingFeatureModelFacetLinks_Observation_ObservationFacts_4006(
			iArchimate.Observation source) {
		LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor>();
		for (Iterator<?> destinations = source.getObservationFacts().iterator(); destinations
				.hasNext();) {
			iArchimate.Fact destination = (iArchimate.Fact) destinations.next();
			result.add(new iArchimate.diagram.dt.part.IArchimateLinkDescriptor(
					source,
					destination,
					iArchimate.diagram.dt.providers.IArchimateElementTypes.ObservationObservationFacts_4006,
					iArchimate.diagram.dt.edit.parts.ObservationObservationFactsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getOutgoingFeatureModelFacetLinks_Decision_DecisionFacts_4003(
			iArchimate.Decision source) {
		LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> result = new LinkedList<iArchimate.diagram.dt.part.IArchimateLinkDescriptor>();
		for (Iterator<?> destinations = source.getDecisionFacts().iterator(); destinations
				.hasNext();) {
			iArchimate.Fact destination = (iArchimate.Fact) destinations.next();
			result.add(new iArchimate.diagram.dt.part.IArchimateLinkDescriptor(
					source,
					destination,
					iArchimate.diagram.dt.providers.IArchimateElementTypes.DecisionDecisionFacts_4003,
					iArchimate.diagram.dt.edit.parts.DecisionDecisionFactsEditPart.VISUAL_ID));
		}
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
		public List<iArchimate.diagram.dt.part.IArchimateNodeDescriptor> getSemanticChildren(
				View view) {
			return IArchimateDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getContainedLinks(
				View view) {
			return IArchimateDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getIncomingLinks(
				View view) {
			return IArchimateDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<iArchimate.diagram.dt.part.IArchimateLinkDescriptor> getOutgoingLinks(
				View view) {
			return IArchimateDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
