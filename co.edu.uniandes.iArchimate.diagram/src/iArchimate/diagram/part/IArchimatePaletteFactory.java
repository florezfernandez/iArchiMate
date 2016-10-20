/*
 * 
 */
package iArchimate.diagram.part;

import java.util.ArrayList;
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
		paletteRoot.add(createComponentsofImperfection3Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				iArchimate.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createDecisionTrace1CreationTool());
		paletteContainer.add(createElement2CreationTool());
		paletteContainer.add(createGroup3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				iArchimate.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createElementDecisionTrace1CreationTool());
		paletteContainer.add(createRelation2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Components of Imperfection" palette tool group
	 * @generated
	 */
	private PaletteContainer createComponentsofImperfection3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				iArchimate.diagram.part.Messages.ComponentsofImperfection3Group_title);
		paletteContainer.setId("createComponentsofImperfection3Group"); //$NON-NLS-1$
		paletteContainer.add(createAbsentElement1CreationTool());
		paletteContainer.add(createImperfectRelation2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDecisionTrace1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				iArchimate.diagram.part.Messages.DecisionTrace1CreationTool_title,
				iArchimate.diagram.part.Messages.DecisionTrace1CreationTool_desc,
				Collections
						.singletonList(iArchimate.diagram.providers.IArchimateElementTypes.DecisionTrace_2011));
		entry.setId("createDecisionTrace1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(iArchimate.diagram.providers.IArchimateElementTypes
				.getImageDescriptor(iArchimate.diagram.providers.IArchimateElementTypes.DecisionTrace_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createElement2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(iArchimate.diagram.providers.IArchimateElementTypes.Element_3025);
		types.add(iArchimate.diagram.providers.IArchimateElementTypes.Element_2010);
		NodeToolEntry entry = new NodeToolEntry(
				iArchimate.diagram.part.Messages.Element2CreationTool_title,
				iArchimate.diagram.part.Messages.Element2CreationTool_desc,
				types);
		entry.setId("createElement2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(iArchimate.diagram.providers.IArchimateElementTypes
				.getImageDescriptor(iArchimate.diagram.providers.IArchimateElementTypes.Element_3025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGroup3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(iArchimate.diagram.providers.IArchimateElementTypes.Group_3024);
		types.add(iArchimate.diagram.providers.IArchimateElementTypes.Group_2009);
		NodeToolEntry entry = new NodeToolEntry(
				iArchimate.diagram.part.Messages.Group3CreationTool_title,
				iArchimate.diagram.part.Messages.Group3CreationTool_desc, types);
		entry.setId("createGroup3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(iArchimate.diagram.providers.IArchimateElementTypes
				.getImageDescriptor(iArchimate.diagram.providers.IArchimateElementTypes.Group_3024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createElementDecisionTrace1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				iArchimate.diagram.part.Messages.ElementDecisionTrace1CreationTool_title,
				iArchimate.diagram.part.Messages.ElementDecisionTrace1CreationTool_desc,
				Collections
						.singletonList(iArchimate.diagram.providers.IArchimateElementTypes.ElementElementDecisionTrace_4015));
		entry.setId("createElementDecisionTrace1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(iArchimate.diagram.providers.IArchimateElementTypes
				.getImageDescriptor(iArchimate.diagram.providers.IArchimateElementTypes.ElementElementDecisionTrace_4015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelation2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				iArchimate.diagram.part.Messages.Relation2CreationTool_title,
				iArchimate.diagram.part.Messages.Relation2CreationTool_desc,
				Collections
						.singletonList(iArchimate.diagram.providers.IArchimateElementTypes.Relation_4013));
		entry.setId("createRelation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(iArchimate.diagram.providers.IArchimateElementTypes
				.getImageDescriptor(iArchimate.diagram.providers.IArchimateElementTypes.Relation_4013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAbsentElement1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(iArchimate.diagram.providers.IArchimateElementTypes.AbsentElement_2008);
		types.add(iArchimate.diagram.providers.IArchimateElementTypes.AbsentElement_3023);
		NodeToolEntry entry = new NodeToolEntry(
				iArchimate.diagram.part.Messages.AbsentElement1CreationTool_title,
				iArchimate.diagram.part.Messages.AbsentElement1CreationTool_desc,
				types);
		entry.setId("createAbsentElement1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(iArchimate.diagram.providers.IArchimateElementTypes
				.getImageDescriptor(iArchimate.diagram.providers.IArchimateElementTypes.AbsentElement_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createImperfectRelation2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				iArchimate.diagram.part.Messages.ImperfectRelation2CreationTool_title,
				iArchimate.diagram.part.Messages.ImperfectRelation2CreationTool_desc,
				Collections
						.singletonList(iArchimate.diagram.providers.IArchimateElementTypes.ImperfectRelation_4012));
		entry.setId("createImperfectRelation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(iArchimate.diagram.providers.IArchimateElementTypes
				.getImageDescriptor(iArchimate.diagram.providers.IArchimateElementTypes.ImperfectRelation_4012));
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
