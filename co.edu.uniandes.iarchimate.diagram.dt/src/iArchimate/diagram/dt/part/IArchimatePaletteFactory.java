package iArchimate.diagram.dt.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class IArchimatePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
		paletteRoot.add(createFacts3Group());
		paletteRoot.add(createSources4Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				iArchimate.diagram.dt.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createDecision1CreationTool());
		paletteContainer.add(createObservation2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				iArchimate.diagram.dt.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createDecisionFacts1CreationTool());
		paletteContainer.add(createMeetingParticipants2CreationTool());
		paletteContainer.add(createObservationFacts3CreationTool());
		paletteContainer.add(createSourceObservations4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Facts" palette tool group
	 * @generated
	 */
	private PaletteContainer createFacts3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				iArchimate.diagram.dt.part.Messages.Facts3Group_title);
		paletteContainer.setId("createFacts3Group"); //$NON-NLS-1$
		paletteContainer.add(createInstanceFact1CreationTool());
		paletteContainer.add(createAttributeFact2CreationTool());
		paletteContainer.add(createRelationFact3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Sources" palette tool group
	 * @generated
	 */
	private PaletteContainer createSources4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				iArchimate.diagram.dt.part.Messages.Sources4Group_title);
		paletteContainer.setId("createSources4Group"); //$NON-NLS-1$
		paletteContainer.add(createDocument1CreationTool());
		paletteContainer.add(createMeeting2CreationTool());
		paletteContainer.add(createPerson3CreationTool());
		paletteContainer.add(createDirectObservation4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDecision1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				iArchimate.diagram.dt.part.Messages.Decision1CreationTool_title,
				iArchimate.diagram.dt.part.Messages.Decision1CreationTool_desc,
				Collections
						.singletonList(iArchimate.diagram.dt.providers.IArchimateElementTypes.Decision_2003));
		entry.setId("createDecision1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(iArchimate.diagram.dt.providers.IArchimateElementTypes
				.getImageDescriptor(iArchimate.diagram.dt.providers.IArchimateElementTypes.Decision_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createObservation2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				iArchimate.diagram.dt.part.Messages.Observation2CreationTool_title,
				iArchimate.diagram.dt.part.Messages.Observation2CreationTool_desc,
				Collections
						.singletonList(iArchimate.diagram.dt.providers.IArchimateElementTypes.Observation_2006));
		entry.setId("createObservation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(iArchimate.diagram.dt.providers.IArchimateElementTypes
				.getImageDescriptor(iArchimate.diagram.dt.providers.IArchimateElementTypes.Observation_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDecisionFacts1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				iArchimate.diagram.dt.part.Messages.DecisionFacts1CreationTool_title,
				iArchimate.diagram.dt.part.Messages.DecisionFacts1CreationTool_desc,
				Collections
						.singletonList(iArchimate.diagram.dt.providers.IArchimateElementTypes.DecisionDecisionFacts_4003));
		entry.setId("createDecisionFacts1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(iArchimate.diagram.dt.providers.IArchimateElementTypes
				.getImageDescriptor(iArchimate.diagram.dt.providers.IArchimateElementTypes.DecisionDecisionFacts_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMeetingParticipants2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				iArchimate.diagram.dt.part.Messages.MeetingParticipants2CreationTool_title,
				iArchimate.diagram.dt.part.Messages.MeetingParticipants2CreationTool_desc,
				Collections
						.singletonList(iArchimate.diagram.dt.providers.IArchimateElementTypes.MeetingMeetingParticipants_4002));
		entry.setId("createMeetingParticipants2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(iArchimate.diagram.dt.providers.IArchimateElementTypes
				.getImageDescriptor(iArchimate.diagram.dt.providers.IArchimateElementTypes.MeetingMeetingParticipants_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createObservationFacts3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				iArchimate.diagram.dt.part.Messages.ObservationFacts3CreationTool_title,
				iArchimate.diagram.dt.part.Messages.ObservationFacts3CreationTool_desc,
				Collections
						.singletonList(iArchimate.diagram.dt.providers.IArchimateElementTypes.ObservationObservationFacts_4006));
		entry.setId("createObservationFacts3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(iArchimate.diagram.dt.providers.IArchimateElementTypes
				.getImageDescriptor(iArchimate.diagram.dt.providers.IArchimateElementTypes.ObservationObservationFacts_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSourceObservations4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				iArchimate.diagram.dt.part.Messages.SourceObservations4CreationTool_title,
				iArchimate.diagram.dt.part.Messages.SourceObservations4CreationTool_desc,
				Collections
						.singletonList(iArchimate.diagram.dt.providers.IArchimateElementTypes.SourceSourceObservations_4005));
		entry.setId("createSourceObservations4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(iArchimate.diagram.dt.providers.IArchimateElementTypes
				.getImageDescriptor(iArchimate.diagram.dt.providers.IArchimateElementTypes.SourceSourceObservations_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInstanceFact1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				iArchimate.diagram.dt.part.Messages.InstanceFact1CreationTool_title,
				iArchimate.diagram.dt.part.Messages.InstanceFact1CreationTool_desc,
				Collections
						.singletonList(iArchimate.diagram.dt.providers.IArchimateElementTypes.InstanceFact_2002));
		entry.setId("createInstanceFact1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(iArchimate.diagram.dt.providers.IArchimateElementTypes
				.getImageDescriptor(iArchimate.diagram.dt.providers.IArchimateElementTypes.InstanceFact_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttributeFact2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				iArchimate.diagram.dt.part.Messages.AttributeFact2CreationTool_title,
				iArchimate.diagram.dt.part.Messages.AttributeFact2CreationTool_desc,
				Collections
						.singletonList(iArchimate.diagram.dt.providers.IArchimateElementTypes.AttributeFact_2001));
		entry.setId("createAttributeFact2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(iArchimate.diagram.dt.providers.IArchimateElementTypes
				.getImageDescriptor(iArchimate.diagram.dt.providers.IArchimateElementTypes.AttributeFact_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationFact3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				iArchimate.diagram.dt.part.Messages.RelationFact3CreationTool_title,
				iArchimate.diagram.dt.part.Messages.RelationFact3CreationTool_desc,
				Collections
						.singletonList(iArchimate.diagram.dt.providers.IArchimateElementTypes.RelationFact_2005));
		entry.setId("createRelationFact3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(iArchimate.diagram.dt.providers.IArchimateElementTypes
				.getImageDescriptor(iArchimate.diagram.dt.providers.IArchimateElementTypes.RelationFact_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDocument1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				iArchimate.diagram.dt.part.Messages.Document1CreationTool_title,
				iArchimate.diagram.dt.part.Messages.Document1CreationTool_desc,
				Collections
						.singletonList(iArchimate.diagram.dt.providers.IArchimateElementTypes.Document_2009));
		entry.setId("createDocument1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(iArchimate.diagram.dt.providers.IArchimateElementTypes
				.getImageDescriptor(iArchimate.diagram.dt.providers.IArchimateElementTypes.Document_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMeeting2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				iArchimate.diagram.dt.part.Messages.Meeting2CreationTool_title,
				iArchimate.diagram.dt.part.Messages.Meeting2CreationTool_desc,
				Collections
						.singletonList(iArchimate.diagram.dt.providers.IArchimateElementTypes.Meeting_2004));
		entry.setId("createMeeting2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(iArchimate.diagram.dt.providers.IArchimateElementTypes
				.getImageDescriptor(iArchimate.diagram.dt.providers.IArchimateElementTypes.Meeting_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPerson3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				iArchimate.diagram.dt.part.Messages.Person3CreationTool_title,
				iArchimate.diagram.dt.part.Messages.Person3CreationTool_desc,
				Collections
						.singletonList(iArchimate.diagram.dt.providers.IArchimateElementTypes.Person_2008));
		entry.setId("createPerson3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(iArchimate.diagram.dt.providers.IArchimateElementTypes
				.getImageDescriptor(iArchimate.diagram.dt.providers.IArchimateElementTypes.Person_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDirectObservation4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				iArchimate.diagram.dt.part.Messages.DirectObservation4CreationTool_title,
				iArchimate.diagram.dt.part.Messages.DirectObservation4CreationTool_desc,
				Collections
						.singletonList(iArchimate.diagram.dt.providers.IArchimateElementTypes.DirectObservation_2007));
		entry.setId("createDirectObservation4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(iArchimate.diagram.dt.providers.IArchimateElementTypes
				.getImageDescriptor(iArchimate.diagram.dt.providers.IArchimateElementTypes.DirectObservation_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
