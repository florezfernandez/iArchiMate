/*
 * 
 */
package iArchimate.diagram.edit.parts;

import iArchimate.Element;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import co.edu.uniandes.iArchimate.ui.diagramCustomization.ElementCustomization;

/**
 * @generated
 */
public class AbsentElement2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3023;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public AbsentElement2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new iArchimate.diagram.edit.policies.AbsentElement2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new AbsentElementFigure();
	}

	/**
	 * @generated
	 */
	public AbsentElementFigure getPrimaryShape() {
		return (AbsentElementFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof iArchimate.diagram.edit.parts.AbsentElementName2EditPart) {
			((iArchimate.diagram.edit.parts.AbsentElementName2EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureAbsentElementLabelFigure());
			return true;
		}
		if (childEditPart instanceof iArchimate.diagram.edit.parts.AbsentElementAbsentElementComponentsCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getAbsentElementComponentsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((iArchimate.diagram.edit.parts.AbsentElementAbsentElementComponentsCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof iArchimate.diagram.edit.parts.AbsentElementName2EditPart) {
			return true;
		}
		if (childEditPart instanceof iArchimate.diagram.edit.parts.AbsentElementAbsentElementComponentsCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getAbsentElementComponentsCompartmentFigure();
			pane.remove(((iArchimate.diagram.edit.parts.AbsentElementAbsentElementComponentsCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof iArchimate.diagram.edit.parts.AbsentElementAbsentElementComponentsCompartment2EditPart) {
			return getPrimaryShape()
					.getAbsentElementComponentsCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(140, 60);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(iArchimate.diagram.part.IArchimateVisualIDRegistry
				.getType(iArchimate.diagram.edit.parts.AbsentElementName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(iArchimate.diagram.providers.IArchimateElementTypes.ImperfectRelation_4012);
		types.add(iArchimate.diagram.providers.IArchimateElementTypes.Relation_4013);
		types.add(iArchimate.diagram.providers.IArchimateElementTypes.ElementElementDecisionTrace_4015);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof iArchimate.diagram.edit.parts.AbsentElementEditPart) {
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.ImperfectRelation_4012);
		}
		if (targetEditPart instanceof iArchimate.diagram.edit.parts.ElementEditPart) {
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.ImperfectRelation_4012);
		}
		if (targetEditPart instanceof iArchimate.diagram.edit.parts.AbsentElement2EditPart) {
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.ImperfectRelation_4012);
		}
		if (targetEditPart instanceof iArchimate.diagram.edit.parts.Element2EditPart) {
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.ImperfectRelation_4012);
		}
		if (targetEditPart instanceof iArchimate.diagram.edit.parts.AbsentElementEditPart) {
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.Relation_4013);
		}
		if (targetEditPart instanceof iArchimate.diagram.edit.parts.ElementEditPart) {
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.Relation_4013);
		}
		if (targetEditPart instanceof iArchimate.diagram.edit.parts.AbsentElement2EditPart) {
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.Relation_4013);
		}
		if (targetEditPart instanceof iArchimate.diagram.edit.parts.Element2EditPart) {
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.Relation_4013);
		}
		if (targetEditPart instanceof iArchimate.diagram.edit.parts.DecisionTraceEditPart) {
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.ElementElementDecisionTrace_4015);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == iArchimate.diagram.providers.IArchimateElementTypes.ImperfectRelation_4012) {
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.AbsentElement_2008);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.Element_2010);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.AbsentElement_3023);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.Element_3025);
		} else if (relationshipType == iArchimate.diagram.providers.IArchimateElementTypes.Relation_4013) {
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.AbsentElement_2008);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.Element_2010);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.AbsentElement_3023);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.Element_3025);
		} else if (relationshipType == iArchimate.diagram.providers.IArchimateElementTypes.ElementElementDecisionTrace_4015) {
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.DecisionTrace_2011);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(iArchimate.diagram.providers.IArchimateElementTypes.ImperfectRelation_4012);
		types.add(iArchimate.diagram.providers.IArchimateElementTypes.Relation_4013);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == iArchimate.diagram.providers.IArchimateElementTypes.ImperfectRelation_4012) {
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.AbsentElement_2008);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.Element_2010);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.AbsentElement_3023);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.Element_3025);
		} else if (relationshipType == iArchimate.diagram.providers.IArchimateElementTypes.Relation_4013) {
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.AbsentElement_2008);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.Element_2010);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.AbsentElement_3023);
			types.add(iArchimate.diagram.providers.IArchimateElementTypes.Element_3025);
		}
		return types;
	}

	protected void handleNotificationEvent(Notification event) {
		ElementCustomization.updateGraphicRepresentation(this.primaryShape,
				((Element) ((View) this.getModel()).getElement()).getTypeName()
						.toString());
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
						.equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	@Override
	public void refresh() {
		super.refresh();
		ElementCustomization.updateGraphicRepresentation(this.primaryShape,
				((Element) ((View) this.getModel()).getElement()).getTypeName()
						.toString());
	}

	/**
	 * @generated
	 */
	public class AbsentElementFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAbsentElementLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fAbsentElementComponentsCompartmentFigure;

		/**
		 * @generated
		 */
		public AbsentElementFigure() {
			this.setForegroundColor(THIS_FORE);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(140),
					getMapMode().DPtoLP(60)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureAbsentElementLabelFigure = new WrappingLabel();

			fFigureAbsentElementLabelFigure.setText("AbsentElement");
			fFigureAbsentElementLabelFigure.setMaximumSize(new Dimension(
					getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureAbsentElementLabelFigure);

			fAbsentElementComponentsCompartmentFigure = new RectangleFigure();

			fAbsentElementComponentsCompartmentFigure.setOutline(false);

			this.add(fAbsentElementComponentsCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAbsentElementLabelFigure() {
			return fFigureAbsentElementLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getAbsentElementComponentsCompartmentFigure() {
			return fAbsentElementComponentsCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 255);

}
