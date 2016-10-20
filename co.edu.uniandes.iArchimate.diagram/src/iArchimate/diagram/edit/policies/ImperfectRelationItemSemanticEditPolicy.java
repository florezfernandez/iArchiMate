/*
 * 
 */
package iArchimate.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class ImperfectRelationItemSemanticEditPolicy extends
		iArchimate.diagram.edit.policies.IArchimateBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ImperfectRelationItemSemanticEditPolicy() {
		super(
				iArchimate.diagram.providers.IArchimateElementTypes.ImperfectRelation_4012);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
