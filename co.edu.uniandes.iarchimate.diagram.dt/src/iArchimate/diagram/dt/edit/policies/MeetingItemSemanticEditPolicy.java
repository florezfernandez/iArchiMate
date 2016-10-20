package iArchimate.diagram.dt.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class MeetingItemSemanticEditPolicy
		extends
		iArchimate.diagram.dt.edit.policies.IArchimateBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MeetingItemSemanticEditPolicy() {
		super(
				iArchimate.diagram.dt.providers.IArchimateElementTypes.Meeting_2004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
					.getVisualID(outgoingLink) == iArchimate.diagram.dt.edit.parts.SourceSourceObservationsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
					.getVisualID(outgoingLink) == iArchimate.diagram.dt.edit.parts.MeetingMeetingParticipantsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (iArchimate.diagram.dt.providers.IArchimateElementTypes.SourceSourceObservations_4005 == req
				.getElementType()) {
			return getGEFWrapper(new iArchimate.diagram.dt.edit.commands.SourceSourceObservationsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (iArchimate.diagram.dt.providers.IArchimateElementTypes.MeetingMeetingParticipants_4002 == req
				.getElementType()) {
			return getGEFWrapper(new iArchimate.diagram.dt.edit.commands.MeetingMeetingParticipantsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (iArchimate.diagram.dt.providers.IArchimateElementTypes.SourceSourceObservations_4005 == req
				.getElementType()) {
			return null;
		}
		if (iArchimate.diagram.dt.providers.IArchimateElementTypes.MeetingMeetingParticipants_4002 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case iArchimate.diagram.dt.edit.parts.SourceSourceObservationsEditPart.VISUAL_ID:
			return getGEFWrapper(new iArchimate.diagram.dt.edit.commands.SourceSourceObservationsReorientCommand(
					req));
		case iArchimate.diagram.dt.edit.parts.MeetingMeetingParticipantsEditPart.VISUAL_ID:
			return getGEFWrapper(new iArchimate.diagram.dt.edit.commands.MeetingMeetingParticipantsReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
