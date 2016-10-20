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
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ImperfectRelationReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

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
	public ImperfectRelationReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof iArchimate.ImperfectRelation) {
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
		if (!(oldEnd instanceof iArchimate.Element && newEnd instanceof iArchimate.Element)) {
			return false;
		}
		iArchimate.Element target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof iArchimate.Model)) {
			return false;
		}
		iArchimate.Model container = (iArchimate.Model) getLink().eContainer();
		return iArchimate.diagram.edit.policies.IArchimateBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistImperfectRelation_4012(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof iArchimate.Element && newEnd instanceof iArchimate.Element)) {
			return false;
		}
		iArchimate.Element source = getLink().getSource();
		if (!(getLink().eContainer() instanceof iArchimate.Model)) {
			return false;
		}
		iArchimate.Model container = (iArchimate.Model) getLink().eContainer();
		return iArchimate.diagram.edit.policies.IArchimateBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistImperfectRelation_4012(container,
						getLink(), source, getNewTarget());
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
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected iArchimate.ImperfectRelation getLink() {
		return (iArchimate.ImperfectRelation) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected iArchimate.Element getOldSource() {
		return (iArchimate.Element) oldEnd;
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
	protected iArchimate.Element getOldTarget() {
		return (iArchimate.Element) oldEnd;
	}

	/**
	 * @generated
	 */
	protected iArchimate.Element getNewTarget() {
		return (iArchimate.Element) newEnd;
	}
}
