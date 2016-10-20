package iArchimate.diagram.dt.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class IArchimateEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
					.getVisualID(view)) {

			case iArchimate.diagram.dt.edit.parts.DecisionTraceEditPart.VISUAL_ID:
				return new iArchimate.diagram.dt.edit.parts.DecisionTraceEditPart(
						view);

			case iArchimate.diagram.dt.edit.parts.AttributeFactEditPart.VISUAL_ID:
				return new iArchimate.diagram.dt.edit.parts.AttributeFactEditPart(
						view);

			case iArchimate.diagram.dt.edit.parts.AttributeFactIdFactEditPart.VISUAL_ID:
				return new iArchimate.diagram.dt.edit.parts.AttributeFactIdFactEditPart(
						view);

			case iArchimate.diagram.dt.edit.parts.InstanceFactEditPart.VISUAL_ID:
				return new iArchimate.diagram.dt.edit.parts.InstanceFactEditPart(
						view);

			case iArchimate.diagram.dt.edit.parts.InstanceFactIdFactEditPart.VISUAL_ID:
				return new iArchimate.diagram.dt.edit.parts.InstanceFactIdFactEditPart(
						view);

			case iArchimate.diagram.dt.edit.parts.DecisionEditPart.VISUAL_ID:
				return new iArchimate.diagram.dt.edit.parts.DecisionEditPart(
						view);

			case iArchimate.diagram.dt.edit.parts.DecisionIdDecisionEditPart.VISUAL_ID:
				return new iArchimate.diagram.dt.edit.parts.DecisionIdDecisionEditPart(
						view);

			case iArchimate.diagram.dt.edit.parts.MeetingEditPart.VISUAL_ID:
				return new iArchimate.diagram.dt.edit.parts.MeetingEditPart(
						view);

			case iArchimate.diagram.dt.edit.parts.MeetingNameEditPart.VISUAL_ID:
				return new iArchimate.diagram.dt.edit.parts.MeetingNameEditPart(
						view);

			case iArchimate.diagram.dt.edit.parts.RelationFactEditPart.VISUAL_ID:
				return new iArchimate.diagram.dt.edit.parts.RelationFactEditPart(
						view);

			case iArchimate.diagram.dt.edit.parts.RelationFactIdFactEditPart.VISUAL_ID:
				return new iArchimate.diagram.dt.edit.parts.RelationFactIdFactEditPart(
						view);

			case iArchimate.diagram.dt.edit.parts.ObservationEditPart.VISUAL_ID:
				return new iArchimate.diagram.dt.edit.parts.ObservationEditPart(
						view);

			case iArchimate.diagram.dt.edit.parts.ObservationIdObservationEditPart.VISUAL_ID:
				return new iArchimate.diagram.dt.edit.parts.ObservationIdObservationEditPart(
						view);

			case iArchimate.diagram.dt.edit.parts.DirectObservationEditPart.VISUAL_ID:
				return new iArchimate.diagram.dt.edit.parts.DirectObservationEditPart(
						view);

			case iArchimate.diagram.dt.edit.parts.DirectObservationNameEditPart.VISUAL_ID:
				return new iArchimate.diagram.dt.edit.parts.DirectObservationNameEditPart(
						view);

			case iArchimate.diagram.dt.edit.parts.PersonEditPart.VISUAL_ID:
				return new iArchimate.diagram.dt.edit.parts.PersonEditPart(view);

			case iArchimate.diagram.dt.edit.parts.PersonNameEditPart.VISUAL_ID:
				return new iArchimate.diagram.dt.edit.parts.PersonNameEditPart(
						view);

			case iArchimate.diagram.dt.edit.parts.DocumentEditPart.VISUAL_ID:
				return new iArchimate.diagram.dt.edit.parts.DocumentEditPart(
						view);

			case iArchimate.diagram.dt.edit.parts.DocumentNameEditPart.VISUAL_ID:
				return new iArchimate.diagram.dt.edit.parts.DocumentNameEditPart(
						view);

			case iArchimate.diagram.dt.edit.parts.SourceSourceObservationsEditPart.VISUAL_ID:
				return new iArchimate.diagram.dt.edit.parts.SourceSourceObservationsEditPart(
						view);

			case iArchimate.diagram.dt.edit.parts.MeetingMeetingParticipantsEditPart.VISUAL_ID:
				return new iArchimate.diagram.dt.edit.parts.MeetingMeetingParticipantsEditPart(
						view);

			case iArchimate.diagram.dt.edit.parts.ObservationObservationFactsEditPart.VISUAL_ID:
				return new iArchimate.diagram.dt.edit.parts.ObservationObservationFactsEditPart(
						view);

			case iArchimate.diagram.dt.edit.parts.DecisionDecisionFactsEditPart.VISUAL_ID:
				return new iArchimate.diagram.dt.edit.parts.DecisionDecisionFactsEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
