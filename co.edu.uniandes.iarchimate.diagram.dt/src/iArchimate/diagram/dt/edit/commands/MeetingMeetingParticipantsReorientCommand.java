package iArchimate.diagram.dt.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class MeetingMeetingParticipantsReorientCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public MeetingMeetingParticipantsReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof iArchimate.Meeting) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof iArchimate.Person && newEnd instanceof iArchimate.Meeting)) {
			return false;
		}
		return iArchimate.diagram.dt.edit.policies.IArchimateBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistMeetingMeetingParticipants_4002(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof iArchimate.Person && newEnd instanceof iArchimate.Person)) {
			return false;
		}
		return iArchimate.diagram.dt.edit.policies.IArchimateBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistMeetingMeetingParticipants_4002(
						getOldSource(), getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getMeetingParticipants().remove(getOldTarget());
		getNewSource().getMeetingParticipants().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getMeetingParticipants().remove(getOldTarget());
		getOldSource().getMeetingParticipants().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected iArchimate.Meeting getOldSource() {
		return (iArchimate.Meeting) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected iArchimate.Meeting getNewSource() {
		return (iArchimate.Meeting) newEnd;
	}

	/**
	 * @generated
	 */
	protected iArchimate.Person getOldTarget() {
		return (iArchimate.Person) oldEnd;
	}

	/**
	 * @generated
	 */
	protected iArchimate.Person getNewTarget() {
		return (iArchimate.Person) newEnd;
	}
}
