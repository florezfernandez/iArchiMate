/*
 * 
 */
package iArchimate.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class IArchimateEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getVisualID(view)) {

			case iArchimate.diagram.edit.parts.ModelEditPart.VISUAL_ID:
				return new iArchimate.diagram.edit.parts.ModelEditPart(view);

			case iArchimate.diagram.edit.parts.AbsentElementEditPart.VISUAL_ID:
				return new iArchimate.diagram.edit.parts.AbsentElementEditPart(
						view);

			case iArchimate.diagram.edit.parts.AbsentElementNameEditPart.VISUAL_ID:
				return new iArchimate.diagram.edit.parts.AbsentElementNameEditPart(
						view);

			case iArchimate.diagram.edit.parts.GroupEditPart.VISUAL_ID:
				return new iArchimate.diagram.edit.parts.GroupEditPart(view);

			case iArchimate.diagram.edit.parts.GroupNameEditPart.VISUAL_ID:
				return new iArchimate.diagram.edit.parts.GroupNameEditPart(view);

			case iArchimate.diagram.edit.parts.ElementEditPart.VISUAL_ID:
				return new iArchimate.diagram.edit.parts.ElementEditPart(view);

			case iArchimate.diagram.edit.parts.ElementNameEditPart.VISUAL_ID:
				return new iArchimate.diagram.edit.parts.ElementNameEditPart(
						view);

			case iArchimate.diagram.edit.parts.DecisionTraceEditPart.VISUAL_ID:
				return new iArchimate.diagram.edit.parts.DecisionTraceEditPart(
						view);

			case iArchimate.diagram.edit.parts.DecisionTraceIdDecisionTraceEditPart.VISUAL_ID:
				return new iArchimate.diagram.edit.parts.DecisionTraceIdDecisionTraceEditPart(
						view);

			case iArchimate.diagram.edit.parts.AbsentElement2EditPart.VISUAL_ID:
				return new iArchimate.diagram.edit.parts.AbsentElement2EditPart(
						view);

			case iArchimate.diagram.edit.parts.AbsentElementName2EditPart.VISUAL_ID:
				return new iArchimate.diagram.edit.parts.AbsentElementName2EditPart(
						view);

			case iArchimate.diagram.edit.parts.Group2EditPart.VISUAL_ID:
				return new iArchimate.diagram.edit.parts.Group2EditPart(view);

			case iArchimate.diagram.edit.parts.GroupName2EditPart.VISUAL_ID:
				return new iArchimate.diagram.edit.parts.GroupName2EditPart(
						view);

			case iArchimate.diagram.edit.parts.Element2EditPart.VISUAL_ID:
				return new iArchimate.diagram.edit.parts.Element2EditPart(view);

			case iArchimate.diagram.edit.parts.ElementName2EditPart.VISUAL_ID:
				return new iArchimate.diagram.edit.parts.ElementName2EditPart(
						view);

			case iArchimate.diagram.edit.parts.AbsentElementAbsentElementComponentsCompartmentEditPart.VISUAL_ID:
				return new iArchimate.diagram.edit.parts.AbsentElementAbsentElementComponentsCompartmentEditPart(
						view);

			case iArchimate.diagram.edit.parts.AbsentElementAbsentElementComponentsCompartment2EditPart.VISUAL_ID:
				return new iArchimate.diagram.edit.parts.AbsentElementAbsentElementComponentsCompartment2EditPart(
						view);

			case iArchimate.diagram.edit.parts.GroupGroupComponentsCompartmentEditPart.VISUAL_ID:
				return new iArchimate.diagram.edit.parts.GroupGroupComponentsCompartmentEditPart(
						view);

			case iArchimate.diagram.edit.parts.ElementElementComponentsCompartmentEditPart.VISUAL_ID:
				return new iArchimate.diagram.edit.parts.ElementElementComponentsCompartmentEditPart(
						view);

			case iArchimate.diagram.edit.parts.GroupGroupComponentsCompartment2EditPart.VISUAL_ID:
				return new iArchimate.diagram.edit.parts.GroupGroupComponentsCompartment2EditPart(
						view);

			case iArchimate.diagram.edit.parts.ElementElementComponentsCompartment2EditPart.VISUAL_ID:
				return new iArchimate.diagram.edit.parts.ElementElementComponentsCompartment2EditPart(
						view);

			case iArchimate.diagram.edit.parts.ImperfectRelationEditPart.VISUAL_ID:
				return new iArchimate.diagram.edit.parts.ImperfectRelationEditPart(
						view);

			case iArchimate.diagram.edit.parts.ImperfectRelationNameEditPart.VISUAL_ID:
				return new iArchimate.diagram.edit.parts.ImperfectRelationNameEditPart(
						view);

			case iArchimate.diagram.edit.parts.RelationEditPart.VISUAL_ID:
				return new iArchimate.diagram.edit.parts.RelationEditPart(view);

			case iArchimate.diagram.edit.parts.RelationNameEditPart.VISUAL_ID:
				return new iArchimate.diagram.edit.parts.RelationNameEditPart(
						view);

			case iArchimate.diagram.edit.parts.ElementElementDecisionTraceEditPart.VISUAL_ID:
				return new iArchimate.diagram.edit.parts.ElementElementDecisionTraceEditPart(
						view);

			case iArchimate.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new iArchimate.diagram.edit.parts.WrappingLabelEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
