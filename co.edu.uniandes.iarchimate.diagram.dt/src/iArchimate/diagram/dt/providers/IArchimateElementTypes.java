package iArchimate.diagram.dt.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class IArchimateElementTypes {

	/**
	 * @generated
	 */
	private IArchimateElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			iArchimate.diagram.dt.part.IArchimateDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType DecisionTrace_1000 = getElementType("co.edu.uniandes.iArchimate.diagram.dt.DecisionTrace_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AttributeFact_2001 = getElementType("co.edu.uniandes.iArchimate.diagram.dt.AttributeFact_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InstanceFact_2002 = getElementType("co.edu.uniandes.iArchimate.diagram.dt.InstanceFact_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Decision_2003 = getElementType("co.edu.uniandes.iArchimate.diagram.dt.Decision_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Meeting_2004 = getElementType("co.edu.uniandes.iArchimate.diagram.dt.Meeting_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RelationFact_2005 = getElementType("co.edu.uniandes.iArchimate.diagram.dt.RelationFact_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Observation_2006 = getElementType("co.edu.uniandes.iArchimate.diagram.dt.Observation_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DirectObservation_2007 = getElementType("co.edu.uniandes.iArchimate.diagram.dt.DirectObservation_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Person_2008 = getElementType("co.edu.uniandes.iArchimate.diagram.dt.Person_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Document_2009 = getElementType("co.edu.uniandes.iArchimate.diagram.dt.Document_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SourceSourceObservations_4005 = getElementType("co.edu.uniandes.iArchimate.diagram.dt.SourceSourceObservations_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MeetingMeetingParticipants_4002 = getElementType("co.edu.uniandes.iArchimate.diagram.dt.MeetingMeetingParticipants_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ObservationObservationFacts_4006 = getElementType("co.edu.uniandes.iArchimate.diagram.dt.ObservationObservationFacts_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DecisionDecisionFacts_4003 = getElementType("co.edu.uniandes.iArchimate.diagram.dt.DecisionDecisionFacts_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(DecisionTrace_1000,
					iArchimate.IArchimatePackage.eINSTANCE.getDecisionTrace());

			elements.put(AttributeFact_2001,
					iArchimate.IArchimatePackage.eINSTANCE.getAttributeFact());

			elements.put(InstanceFact_2002,
					iArchimate.IArchimatePackage.eINSTANCE.getInstanceFact());

			elements.put(Decision_2003,
					iArchimate.IArchimatePackage.eINSTANCE.getDecision());

			elements.put(Meeting_2004,
					iArchimate.IArchimatePackage.eINSTANCE.getMeeting());

			elements.put(RelationFact_2005,
					iArchimate.IArchimatePackage.eINSTANCE.getRelationFact());

			elements.put(Observation_2006,
					iArchimate.IArchimatePackage.eINSTANCE.getObservation());

			elements.put(DirectObservation_2007,
					iArchimate.IArchimatePackage.eINSTANCE
							.getDirectObservation());

			elements.put(Person_2008,
					iArchimate.IArchimatePackage.eINSTANCE.getPerson());

			elements.put(Document_2009,
					iArchimate.IArchimatePackage.eINSTANCE.getDocument());

			elements.put(SourceSourceObservations_4005,
					iArchimate.IArchimatePackage.eINSTANCE
							.getSource_SourceObservations());

			elements.put(MeetingMeetingParticipants_4002,
					iArchimate.IArchimatePackage.eINSTANCE
							.getMeeting_MeetingParticipants());

			elements.put(ObservationObservationFacts_4006,
					iArchimate.IArchimatePackage.eINSTANCE
							.getObservation_ObservationFacts());

			elements.put(DecisionDecisionFacts_4003,
					iArchimate.IArchimatePackage.eINSTANCE
							.getDecision_DecisionFacts());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(DecisionTrace_1000);
			KNOWN_ELEMENT_TYPES.add(AttributeFact_2001);
			KNOWN_ELEMENT_TYPES.add(InstanceFact_2002);
			KNOWN_ELEMENT_TYPES.add(Decision_2003);
			KNOWN_ELEMENT_TYPES.add(Meeting_2004);
			KNOWN_ELEMENT_TYPES.add(RelationFact_2005);
			KNOWN_ELEMENT_TYPES.add(Observation_2006);
			KNOWN_ELEMENT_TYPES.add(DirectObservation_2007);
			KNOWN_ELEMENT_TYPES.add(Person_2008);
			KNOWN_ELEMENT_TYPES.add(Document_2009);
			KNOWN_ELEMENT_TYPES.add(SourceSourceObservations_4005);
			KNOWN_ELEMENT_TYPES.add(MeetingMeetingParticipants_4002);
			KNOWN_ELEMENT_TYPES.add(ObservationObservationFacts_4006);
			KNOWN_ELEMENT_TYPES.add(DecisionDecisionFacts_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case iArchimate.diagram.dt.edit.parts.DecisionTraceEditPart.VISUAL_ID:
			return DecisionTrace_1000;
		case iArchimate.diagram.dt.edit.parts.AttributeFactEditPart.VISUAL_ID:
			return AttributeFact_2001;
		case iArchimate.diagram.dt.edit.parts.InstanceFactEditPart.VISUAL_ID:
			return InstanceFact_2002;
		case iArchimate.diagram.dt.edit.parts.DecisionEditPart.VISUAL_ID:
			return Decision_2003;
		case iArchimate.diagram.dt.edit.parts.MeetingEditPart.VISUAL_ID:
			return Meeting_2004;
		case iArchimate.diagram.dt.edit.parts.RelationFactEditPart.VISUAL_ID:
			return RelationFact_2005;
		case iArchimate.diagram.dt.edit.parts.ObservationEditPart.VISUAL_ID:
			return Observation_2006;
		case iArchimate.diagram.dt.edit.parts.DirectObservationEditPart.VISUAL_ID:
			return DirectObservation_2007;
		case iArchimate.diagram.dt.edit.parts.PersonEditPart.VISUAL_ID:
			return Person_2008;
		case iArchimate.diagram.dt.edit.parts.DocumentEditPart.VISUAL_ID:
			return Document_2009;
		case iArchimate.diagram.dt.edit.parts.SourceSourceObservationsEditPart.VISUAL_ID:
			return SourceSourceObservations_4005;
		case iArchimate.diagram.dt.edit.parts.MeetingMeetingParticipantsEditPart.VISUAL_ID:
			return MeetingMeetingParticipants_4002;
		case iArchimate.diagram.dt.edit.parts.ObservationObservationFactsEditPart.VISUAL_ID:
			return ObservationObservationFacts_4006;
		case iArchimate.diagram.dt.edit.parts.DecisionDecisionFactsEditPart.VISUAL_ID:
			return DecisionDecisionFacts_4003;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return iArchimate.diagram.dt.providers.IArchimateElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return iArchimate.diagram.dt.providers.IArchimateElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return iArchimate.diagram.dt.providers.IArchimateElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
