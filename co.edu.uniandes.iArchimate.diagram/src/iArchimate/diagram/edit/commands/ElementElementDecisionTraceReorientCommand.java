/*
 * 
 */
package iArchimate.diagram.edit.commands;

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
public class ElementElementDecisionTraceReorientCommand extends
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
	public ElementElementDecisionTraceReorientCommand(
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
		if (false == referenceOwner instanceof iArchimate.Element) {
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
		if (!(oldEnd instanceof iArchimate.DecisionTrace && newEnd instanceof iArchimate.Element)) {
			return false;
		}
		return iArchimate.diagram.edit.policies.IArchimateBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistElementElementDecisionTrace_4015(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof iArchimate.DecisionTrace && newEnd instanceof iArchimate.DecisionTrace)) {
			return false;
		}
		return iArchimate.diagram.edit.policies.IArchimateBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistElementElementDecisionTrace_4015(
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
		getOldSource().setElementDecisionTrace(null);
		getNewSource().setElementDecisionTrace(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setElementDecisionTrace(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected iArchimate.Element getOldSource() {
		return (iArchimate.Element) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected iArchimate.Element getNewSource() {
		return (iArchimate.Element) newEnd;
	}

	/**
	 * @generated
	 */
	protected iArchimate.DecisionTrace getOldTarget() {
		return (iArchimate.DecisionTrace) oldEnd;
	}

	/**
	 * @generated
	 */
	protected iArchimate.DecisionTrace getNewTarget() {
		return (iArchimate.DecisionTrace) newEnd;
	}
}
