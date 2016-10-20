package iArchimate.diagram.dt.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ObservationObservationFactsItemSemanticEditPolicy
		extends
		iArchimate.diagram.dt.edit.policies.IArchimateBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ObservationObservationFactsItemSemanticEditPolicy() {
		super(
				iArchimate.diagram.dt.providers.IArchimateElementTypes.ObservationObservationFacts_4006);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
