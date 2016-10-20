package iArchimate.diagram.dt.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class AttributeFactItemSemanticEditPolicy
		extends
		iArchimate.diagram.dt.edit.policies.IArchimateBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AttributeFactItemSemanticEditPolicy() {
		super(
				iArchimate.diagram.dt.providers.IArchimateElementTypes.AttributeFact_2001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
					.getVisualID(incomingLink) == iArchimate.diagram.dt.edit.parts.ObservationObservationFactsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
					.getVisualID(incomingLink) == iArchimate.diagram.dt.edit.parts.DecisionDecisionFactsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (iArchimate.diagram.dt.providers.IArchimateElementTypes.ObservationObservationFacts_4006 == req
				.getElementType()) {
			return null;
		}
		if (iArchimate.diagram.dt.providers.IArchimateElementTypes.DecisionDecisionFacts_4003 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (iArchimate.diagram.dt.providers.IArchimateElementTypes.ObservationObservationFacts_4006 == req
				.getElementType()) {
			return getGEFWrapper(new iArchimate.diagram.dt.edit.commands.ObservationObservationFactsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (iArchimate.diagram.dt.providers.IArchimateElementTypes.DecisionDecisionFacts_4003 == req
				.getElementType()) {
			return getGEFWrapper(new iArchimate.diagram.dt.edit.commands.DecisionDecisionFactsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case iArchimate.diagram.dt.edit.parts.ObservationObservationFactsEditPart.VISUAL_ID:
			return getGEFWrapper(new iArchimate.diagram.dt.edit.commands.ObservationObservationFactsReorientCommand(
					req));
		case iArchimate.diagram.dt.edit.parts.DecisionDecisionFactsEditPart.VISUAL_ID:
			return getGEFWrapper(new iArchimate.diagram.dt.edit.commands.DecisionDecisionFactsReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
