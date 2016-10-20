package iArchimate.diagram.dt.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class SourceSourceObservationsItemSemanticEditPolicy
		extends
		iArchimate.diagram.dt.edit.policies.IArchimateBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SourceSourceObservationsItemSemanticEditPolicy() {
		super(
				iArchimate.diagram.dt.providers.IArchimateElementTypes.SourceSourceObservations_4005);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
