/*
 * 
 */
package iArchimate.diagram.edit.parts;

import iArchimate.ImperfectRelation;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
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
public class ImperfectRelationEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4012;

	/**
	 * @generated
	 */
	public ImperfectRelationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new iArchimate.diagram.edit.policies.ImperfectRelationItemSemanticEditPolicy());
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
		return new ImperfectRelationFigure();
	}

	/**
	 * @generated
	 */
	public ImperfectRelationFigure getPrimaryShape() {
		return (ImperfectRelationFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ImperfectRelationFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public ImperfectRelationFigure() {
			this.setForegroundColor(THIS_FORE);

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

	}
	
	@Override
	public void refresh() {
		super.refresh();
		String typeName = ((ImperfectRelation) ((View) this.getModel()).getElement())
				.getTypeName().toString();
		((ImperfectRelationFigure) this.figure)
				.setSourceDecoration(RelationCustomization
						.updateSourceDecoration((View) this.getModel(),
								getMapMode(), typeName));
		((ImperfectRelationFigure) this.figure)
				.setTargetDecoration(RelationCustomization
						.updateTargetDecoration((View) this.getModel(),
								getMapMode(), typeName));
		((ImperfectRelationFigure) this.figure).setLineStyle(RelationCustomization
				.updateLineStyle(typeName));
	}

	@Override
	protected void handleNotificationEvent(Notification event) {
		String typeName = ((ImperfectRelation) ((View) this.getModel()).getElement())
				.getTypeName().toString();
		((ImperfectRelationFigure) this.figure)
				.setSourceDecoration(RelationCustomization
						.updateSourceDecoration((View) this.getModel(),
								getMapMode(), typeName));
		((ImperfectRelationFigure) this.figure)
				.setTargetDecoration(RelationCustomization
						.updateTargetDecoration((View) this.getModel(),
								getMapMode(), typeName));
		((ImperfectRelationFigure) this.figure).setLineStyle(RelationCustomization
				.updateLineStyle(typeName));
		super.handleNotificationEvent(event);
	}


	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 255);

}
