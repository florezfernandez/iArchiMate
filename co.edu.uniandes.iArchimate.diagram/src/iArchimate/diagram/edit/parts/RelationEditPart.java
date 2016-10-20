/*
 * 
 */
package iArchimate.diagram.edit.parts;

import iArchimate.Relation;

import org.eclipse.draw2d.Connection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import co.edu.uniandes.iArchimate.ui.diagramCustomization.RelationCustomization;

/**
 * @generated
 */
public class RelationEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4013;

	/**
	 * @generated
	 */
	public RelationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new iArchimate.diagram.edit.policies.RelationItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new RelationFigure();
	}

	/**
	 * @generated
	 */
	public RelationFigure getPrimaryShape() {
		return (RelationFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class RelationFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public RelationFigure() {
			this.setForegroundColor(THIS_FORE);

		}

	}

	@Override
	public void refresh() {
		super.refresh();
		String typeName = ((Relation) ((View) this.getModel()).getElement())
				.getTypeName().toString();
		((RelationFigure) this.figure)
				.setSourceDecoration(RelationCustomization
						.updateSourceDecoration((View) this.getModel(),
								getMapMode(), typeName));
		((RelationFigure) this.figure)
				.setTargetDecoration(RelationCustomization
						.updateTargetDecoration((View) this.getModel(),
								getMapMode(), typeName));
		((RelationFigure) this.figure).setLineStyle(RelationCustomization
				.updateLineStyle(typeName));
	}

	@Override
	protected void handleNotificationEvent(Notification event) {
		String typeName = ((Relation) ((View) this.getModel()).getElement())
				.getTypeName().toString();
		((RelationFigure) this.figure)
				.setSourceDecoration(RelationCustomization
						.updateSourceDecoration((View) this.getModel(),
								getMapMode(), typeName));
		((RelationFigure) this.figure)
				.setTargetDecoration(RelationCustomization
						.updateTargetDecoration((View) this.getModel(),
								getMapMode(), typeName));
		((RelationFigure) this.figure).setLineStyle(RelationCustomization
				.updateLineStyle(typeName));
		super.handleNotificationEvent(event);
	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 0);

}
