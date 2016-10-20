package iArchimate.diagram.dt.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class DecisionTraceItemSemanticEditPolicy
		extends
		iArchimate.diagram.dt.edit.policies.IArchimateBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DecisionTraceItemSemanticEditPolicy() {
		super(
				iArchimate.diagram.dt.providers.IArchimateElementTypes.DecisionTrace_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (iArchimate.diagram.dt.providers.IArchimateElementTypes.AttributeFact_2001 == req
				.getElementType()) {
			return getGEFWrapper(new iArchimate.diagram.dt.edit.commands.AttributeFactCreateCommand(
					req));
		}
		if (iArchimate.diagram.dt.providers.IArchimateElementTypes.InstanceFact_2002 == req
				.getElementType()) {
			return getGEFWrapper(new iArchimate.diagram.dt.edit.commands.InstanceFactCreateCommand(
					req));
		}
		if (iArchimate.diagram.dt.providers.IArchimateElementTypes.Decision_2003 == req
				.getElementType()) {
			return getGEFWrapper(new iArchimate.diagram.dt.edit.commands.DecisionCreateCommand(
					req));
		}
		if (iArchimate.diagram.dt.providers.IArchimateElementTypes.Meeting_2004 == req
				.getElementType()) {
			return getGEFWrapper(new iArchimate.diagram.dt.edit.commands.MeetingCreateCommand(
					req));
		}
		if (iArchimate.diagram.dt.providers.IArchimateElementTypes.RelationFact_2005 == req
				.getElementType()) {
			return getGEFWrapper(new iArchimate.diagram.dt.edit.commands.RelationFactCreateCommand(
					req));
		}
		if (iArchimate.diagram.dt.providers.IArchimateElementTypes.Observation_2006 == req
				.getElementType()) {
			return getGEFWrapper(new iArchimate.diagram.dt.edit.commands.ObservationCreateCommand(
					req));
		}
		if (iArchimate.diagram.dt.providers.IArchimateElementTypes.DirectObservation_2007 == req
				.getElementType()) {
			return getGEFWrapper(new iArchimate.diagram.dt.edit.commands.DirectObservationCreateCommand(
					req));
		}
		if (iArchimate.diagram.dt.providers.IArchimateElementTypes.Person_2008 == req
				.getElementType()) {
			return getGEFWrapper(new iArchimate.diagram.dt.edit.commands.PersonCreateCommand(
					req));
		}
		if (iArchimate.diagram.dt.providers.IArchimateElementTypes.Document_2009 == req
				.getElementType()) {
			return getGEFWrapper(new iArchimate.diagram.dt.edit.commands.DocumentCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
