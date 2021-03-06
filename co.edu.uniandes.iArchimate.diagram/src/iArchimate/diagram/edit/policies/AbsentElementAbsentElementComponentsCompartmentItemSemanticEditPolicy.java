/*
 * 
 */
package iArchimate.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class AbsentElementAbsentElementComponentsCompartmentItemSemanticEditPolicy
		extends
		iArchimate.diagram.edit.policies.IArchimateBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AbsentElementAbsentElementComponentsCompartmentItemSemanticEditPolicy() {
		super(
				iArchimate.diagram.providers.IArchimateElementTypes.AbsentElement_2008);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (iArchimate.diagram.providers.IArchimateElementTypes.AbsentElement_3023 == req
				.getElementType()) {
			return getGEFWrapper(new iArchimate.diagram.edit.commands.AbsentElement2CreateCommand(
					req));
		}
		if (iArchimate.diagram.providers.IArchimateElementTypes.Group_3024 == req
				.getElementType()) {
			return getGEFWrapper(new iArchimate.diagram.edit.commands.Group2CreateCommand(
					req));
		}
		if (iArchimate.diagram.providers.IArchimateElementTypes.Element_3025 == req
				.getElementType()) {
			return getGEFWrapper(new iArchimate.diagram.edit.commands.Element2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
