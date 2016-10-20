/*
 * 
 */
package iArchimate.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Element2ItemSemanticEditPolicy extends
		iArchimate.diagram.edit.policies.IArchimateBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Element2ItemSemanticEditPolicy() {
		super(iArchimate.diagram.providers.IArchimateElementTypes.Element_3025);
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
			if (iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getVisualID(incomingLink) == iArchimate.diagram.edit.parts.ImperfectRelationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getVisualID(incomingLink) == iArchimate.diagram.edit.parts.RelationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getVisualID(outgoingLink) == iArchimate.diagram.edit.parts.ImperfectRelationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getVisualID(outgoingLink) == iArchimate.diagram.edit.parts.RelationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getVisualID(outgoingLink) == iArchimate.diagram.edit.parts.ElementElementDecisionTraceEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
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
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getVisualID(node)) {
			case iArchimate.diagram.edit.parts.ElementElementComponentsCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (iArchimate.diagram.part.IArchimateVisualIDRegistry
							.getVisualID(cnode)) {
					case iArchimate.diagram.edit.parts.AbsentElement2EditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it
								.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (iArchimate.diagram.part.IArchimateVisualIDRegistry
									.getVisualID(incomingLink) == iArchimate.diagram.edit.parts.ImperfectRelationEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (iArchimate.diagram.part.IArchimateVisualIDRegistry
									.getVisualID(incomingLink) == iArchimate.diagram.edit.parts.RelationEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
						}
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it
								.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (iArchimate.diagram.part.IArchimateVisualIDRegistry
									.getVisualID(outgoingLink) == iArchimate.diagram.edit.parts.ImperfectRelationEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (iArchimate.diagram.part.IArchimateVisualIDRegistry
									.getVisualID(outgoingLink) == iArchimate.diagram.edit.parts.RelationEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (iArchimate.diagram.part.IArchimateVisualIDRegistry
									.getVisualID(outgoingLink) == iArchimate.diagram.edit.parts.ElementElementDecisionTraceEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										outgoingLink.getSource().getElement(),
										null, outgoingLink.getTarget()
												.getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case iArchimate.diagram.edit.parts.Group2EditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case iArchimate.diagram.edit.parts.Element2EditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it
								.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (iArchimate.diagram.part.IArchimateVisualIDRegistry
									.getVisualID(incomingLink) == iArchimate.diagram.edit.parts.ImperfectRelationEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (iArchimate.diagram.part.IArchimateVisualIDRegistry
									.getVisualID(incomingLink) == iArchimate.diagram.edit.parts.RelationEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
						}
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it
								.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (iArchimate.diagram.part.IArchimateVisualIDRegistry
									.getVisualID(outgoingLink) == iArchimate.diagram.edit.parts.ImperfectRelationEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (iArchimate.diagram.part.IArchimateVisualIDRegistry
									.getVisualID(outgoingLink) == iArchimate.diagram.edit.parts.RelationEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (iArchimate.diagram.part.IArchimateVisualIDRegistry
									.getVisualID(outgoingLink) == iArchimate.diagram.edit.parts.ElementElementDecisionTraceEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										outgoingLink.getSource().getElement(),
										null, outgoingLink.getTarget()
												.getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
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
		if (iArchimate.diagram.providers.IArchimateElementTypes.ImperfectRelation_4012 == req
				.getElementType()) {
			return getGEFWrapper(new iArchimate.diagram.edit.commands.ImperfectRelationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (iArchimate.diagram.providers.IArchimateElementTypes.Relation_4013 == req
				.getElementType()) {
			return getGEFWrapper(new iArchimate.diagram.edit.commands.RelationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (iArchimate.diagram.providers.IArchimateElementTypes.ElementElementDecisionTrace_4015 == req
				.getElementType()) {
			return getGEFWrapper(new iArchimate.diagram.edit.commands.ElementElementDecisionTraceCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (iArchimate.diagram.providers.IArchimateElementTypes.ImperfectRelation_4012 == req
				.getElementType()) {
			return getGEFWrapper(new iArchimate.diagram.edit.commands.ImperfectRelationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (iArchimate.diagram.providers.IArchimateElementTypes.Relation_4013 == req
				.getElementType()) {
			return getGEFWrapper(new iArchimate.diagram.edit.commands.RelationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (iArchimate.diagram.providers.IArchimateElementTypes.ElementElementDecisionTrace_4015 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case iArchimate.diagram.edit.parts.ImperfectRelationEditPart.VISUAL_ID:
			return getGEFWrapper(new iArchimate.diagram.edit.commands.ImperfectRelationReorientCommand(
					req));
		case iArchimate.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getGEFWrapper(new iArchimate.diagram.edit.commands.RelationReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
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
		case iArchimate.diagram.edit.parts.ElementElementDecisionTraceEditPart.VISUAL_ID:
			return getGEFWrapper(new iArchimate.diagram.edit.commands.ElementElementDecisionTraceReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
