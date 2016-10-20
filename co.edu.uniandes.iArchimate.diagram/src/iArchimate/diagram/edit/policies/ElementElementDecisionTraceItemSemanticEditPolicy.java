/*
 * 
 */
package iArchimate.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ElementElementDecisionTraceItemSemanticEditPolicy extends
		iArchimate.diagram.edit.policies.IArchimateBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ElementElementDecisionTraceItemSemanticEditPolicy() {
		super(
				iArchimate.diagram.providers.IArchimateElementTypes.ElementElementDecisionTrace_4015);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
