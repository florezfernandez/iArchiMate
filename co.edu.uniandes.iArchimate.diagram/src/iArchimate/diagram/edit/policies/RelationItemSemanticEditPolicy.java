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
public class RelationItemSemanticEditPolicy extends
		iArchimate.diagram.edit.policies.IArchimateBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RelationItemSemanticEditPolicy() {
		super(iArchimate.diagram.providers.IArchimateElementTypes.Relation_4013);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
