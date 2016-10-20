package iArchimate.diagram.dt.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class IArchimateNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		iArchimate.diagram.dt.part.IArchimateDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		iArchimate.diagram.dt.part.IArchimateDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof iArchimate.diagram.dt.navigator.IArchimateNavigatorItem
				&& !isOwnView(((iArchimate.diagram.dt.navigator.IArchimateNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup) {
			iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup group = (iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup) element;
			return iArchimate.diagram.dt.part.IArchimateDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof iArchimate.diagram.dt.navigator.IArchimateNavigatorItem) {
			iArchimate.diagram.dt.navigator.IArchimateNavigatorItem navigatorItem = (iArchimate.diagram.dt.navigator.IArchimateNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
				.getVisualID(view)) {
		case iArchimate.diagram.dt.edit.parts.DecisionTraceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://co/edu/uniandes/iArchimate?DecisionTrace", iArchimate.diagram.dt.providers.IArchimateElementTypes.DecisionTrace_1000); //$NON-NLS-1$
		case iArchimate.diagram.dt.edit.parts.AttributeFactEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://co/edu/uniandes/iArchimate?AttributeFact", iArchimate.diagram.dt.providers.IArchimateElementTypes.AttributeFact_2001); //$NON-NLS-1$
		case iArchimate.diagram.dt.edit.parts.InstanceFactEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://co/edu/uniandes/iArchimate?InstanceFact", iArchimate.diagram.dt.providers.IArchimateElementTypes.InstanceFact_2002); //$NON-NLS-1$
		case iArchimate.diagram.dt.edit.parts.DecisionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://co/edu/uniandes/iArchimate?Decision", iArchimate.diagram.dt.providers.IArchimateElementTypes.Decision_2003); //$NON-NLS-1$
		case iArchimate.diagram.dt.edit.parts.MeetingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://co/edu/uniandes/iArchimate?Meeting", iArchimate.diagram.dt.providers.IArchimateElementTypes.Meeting_2004); //$NON-NLS-1$
		case iArchimate.diagram.dt.edit.parts.RelationFactEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://co/edu/uniandes/iArchimate?RelationFact", iArchimate.diagram.dt.providers.IArchimateElementTypes.RelationFact_2005); //$NON-NLS-1$
		case iArchimate.diagram.dt.edit.parts.ObservationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://co/edu/uniandes/iArchimate?Observation", iArchimate.diagram.dt.providers.IArchimateElementTypes.Observation_2006); //$NON-NLS-1$
		case iArchimate.diagram.dt.edit.parts.DirectObservationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://co/edu/uniandes/iArchimate?DirectObservation", iArchimate.diagram.dt.providers.IArchimateElementTypes.DirectObservation_2007); //$NON-NLS-1$
		case iArchimate.diagram.dt.edit.parts.PersonEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://co/edu/uniandes/iArchimate?Person", iArchimate.diagram.dt.providers.IArchimateElementTypes.Person_2008); //$NON-NLS-1$
		case iArchimate.diagram.dt.edit.parts.DocumentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://co/edu/uniandes/iArchimate?Document", iArchimate.diagram.dt.providers.IArchimateElementTypes.Document_2009); //$NON-NLS-1$
		case iArchimate.diagram.dt.edit.parts.MeetingMeetingParticipantsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://co/edu/uniandes/iArchimate?Meeting?meetingParticipants", iArchimate.diagram.dt.providers.IArchimateElementTypes.MeetingMeetingParticipants_4002); //$NON-NLS-1$
		case iArchimate.diagram.dt.edit.parts.DecisionDecisionFactsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://co/edu/uniandes/iArchimate?Decision?decisionFacts", iArchimate.diagram.dt.providers.IArchimateElementTypes.DecisionDecisionFacts_4003); //$NON-NLS-1$
		case iArchimate.diagram.dt.edit.parts.SourceSourceObservationsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://co/edu/uniandes/iArchimate?Source?sourceObservations", iArchimate.diagram.dt.providers.IArchimateElementTypes.SourceSourceObservations_4005); //$NON-NLS-1$
		case iArchimate.diagram.dt.edit.parts.ObservationObservationFactsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://co/edu/uniandes/iArchimate?Observation?observationFacts", iArchimate.diagram.dt.providers.IArchimateElementTypes.ObservationObservationFacts_4006); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = iArchimate.diagram.dt.part.IArchimateDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& iArchimate.diagram.dt.providers.IArchimateElementTypes
						.isKnownElementType(elementType)) {
			image = iArchimate.diagram.dt.providers.IArchimateElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup) {
			iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup group = (iArchimate.diagram.dt.navigator.IArchimateNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof iArchimate.diagram.dt.navigator.IArchimateNavigatorItem) {
			iArchimate.diagram.dt.navigator.IArchimateNavigatorItem navigatorItem = (iArchimate.diagram.dt.navigator.IArchimateNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
				.getVisualID(view)) {
		case iArchimate.diagram.dt.edit.parts.DecisionTraceEditPart.VISUAL_ID:
			return getDecisionTrace_1000Text(view);
		case iArchimate.diagram.dt.edit.parts.AttributeFactEditPart.VISUAL_ID:
			return getAttributeFact_2001Text(view);
		case iArchimate.diagram.dt.edit.parts.InstanceFactEditPart.VISUAL_ID:
			return getInstanceFact_2002Text(view);
		case iArchimate.diagram.dt.edit.parts.DecisionEditPart.VISUAL_ID:
			return getDecision_2003Text(view);
		case iArchimate.diagram.dt.edit.parts.MeetingEditPart.VISUAL_ID:
			return getMeeting_2004Text(view);
		case iArchimate.diagram.dt.edit.parts.RelationFactEditPart.VISUAL_ID:
			return getRelationFact_2005Text(view);
		case iArchimate.diagram.dt.edit.parts.ObservationEditPart.VISUAL_ID:
			return getObservation_2006Text(view);
		case iArchimate.diagram.dt.edit.parts.DirectObservationEditPart.VISUAL_ID:
			return getDirectObservation_2007Text(view);
		case iArchimate.diagram.dt.edit.parts.PersonEditPart.VISUAL_ID:
			return getPerson_2008Text(view);
		case iArchimate.diagram.dt.edit.parts.DocumentEditPart.VISUAL_ID:
			return getDocument_2009Text(view);
		case iArchimate.diagram.dt.edit.parts.MeetingMeetingParticipantsEditPart.VISUAL_ID:
			return getMeetingMeetingParticipants_4002Text(view);
		case iArchimate.diagram.dt.edit.parts.DecisionDecisionFactsEditPart.VISUAL_ID:
			return getDecisionDecisionFacts_4003Text(view);
		case iArchimate.diagram.dt.edit.parts.SourceSourceObservationsEditPart.VISUAL_ID:
			return getSourceSourceObservations_4005Text(view);
		case iArchimate.diagram.dt.edit.parts.ObservationObservationFactsEditPart.VISUAL_ID:
			return getObservationObservationFacts_4006Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getDecisionTrace_1000Text(View view) {
		iArchimate.DecisionTrace domainModelElement = (iArchimate.DecisionTrace) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getIdDecisionTrace();
		} else {
			iArchimate.diagram.dt.part.IArchimateDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttributeFact_2001Text(View view) {
		IParser parser = iArchimate.diagram.dt.providers.IArchimateParserProvider
				.getParser(
						iArchimate.diagram.dt.providers.IArchimateElementTypes.AttributeFact_2001,
						view.getElement() != null ? view.getElement() : view,
						iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
								.getType(iArchimate.diagram.dt.edit.parts.AttributeFactIdFactEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			iArchimate.diagram.dt.part.IArchimateDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInstanceFact_2002Text(View view) {
		IParser parser = iArchimate.diagram.dt.providers.IArchimateParserProvider
				.getParser(
						iArchimate.diagram.dt.providers.IArchimateElementTypes.InstanceFact_2002,
						view.getElement() != null ? view.getElement() : view,
						iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
								.getType(iArchimate.diagram.dt.edit.parts.InstanceFactIdFactEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			iArchimate.diagram.dt.part.IArchimateDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDecision_2003Text(View view) {
		IParser parser = iArchimate.diagram.dt.providers.IArchimateParserProvider
				.getParser(
						iArchimate.diagram.dt.providers.IArchimateElementTypes.Decision_2003,
						view.getElement() != null ? view.getElement() : view,
						iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
								.getType(iArchimate.diagram.dt.edit.parts.DecisionIdDecisionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			iArchimate.diagram.dt.part.IArchimateDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMeeting_2004Text(View view) {
		IParser parser = iArchimate.diagram.dt.providers.IArchimateParserProvider
				.getParser(
						iArchimate.diagram.dt.providers.IArchimateElementTypes.Meeting_2004,
						view.getElement() != null ? view.getElement() : view,
						iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
								.getType(iArchimate.diagram.dt.edit.parts.MeetingNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			iArchimate.diagram.dt.part.IArchimateDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelationFact_2005Text(View view) {
		IParser parser = iArchimate.diagram.dt.providers.IArchimateParserProvider
				.getParser(
						iArchimate.diagram.dt.providers.IArchimateElementTypes.RelationFact_2005,
						view.getElement() != null ? view.getElement() : view,
						iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
								.getType(iArchimate.diagram.dt.edit.parts.RelationFactIdFactEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			iArchimate.diagram.dt.part.IArchimateDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getObservation_2006Text(View view) {
		IParser parser = iArchimate.diagram.dt.providers.IArchimateParserProvider
				.getParser(
						iArchimate.diagram.dt.providers.IArchimateElementTypes.Observation_2006,
						view.getElement() != null ? view.getElement() : view,
						iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
								.getType(iArchimate.diagram.dt.edit.parts.ObservationIdObservationEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			iArchimate.diagram.dt.part.IArchimateDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDirectObservation_2007Text(View view) {
		IParser parser = iArchimate.diagram.dt.providers.IArchimateParserProvider
				.getParser(
						iArchimate.diagram.dt.providers.IArchimateElementTypes.DirectObservation_2007,
						view.getElement() != null ? view.getElement() : view,
						iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
								.getType(iArchimate.diagram.dt.edit.parts.DirectObservationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			iArchimate.diagram.dt.part.IArchimateDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPerson_2008Text(View view) {
		IParser parser = iArchimate.diagram.dt.providers.IArchimateParserProvider
				.getParser(
						iArchimate.diagram.dt.providers.IArchimateElementTypes.Person_2008,
						view.getElement() != null ? view.getElement() : view,
						iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
								.getType(iArchimate.diagram.dt.edit.parts.PersonNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			iArchimate.diagram.dt.part.IArchimateDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDocument_2009Text(View view) {
		IParser parser = iArchimate.diagram.dt.providers.IArchimateParserProvider
				.getParser(
						iArchimate.diagram.dt.providers.IArchimateElementTypes.Document_2009,
						view.getElement() != null ? view.getElement() : view,
						iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
								.getType(iArchimate.diagram.dt.edit.parts.DocumentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			iArchimate.diagram.dt.part.IArchimateDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMeetingMeetingParticipants_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDecisionDecisionFacts_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSourceSourceObservations_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getObservationObservationFacts_4006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return iArchimate.diagram.dt.edit.parts.DecisionTraceEditPart.MODEL_ID
				.equals(iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
						.getModelID(view));
	}

}
