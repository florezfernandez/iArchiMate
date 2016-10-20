/*
 * 
 */
package iArchimate.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class IArchimateNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		iArchimate.diagram.part.IArchimateDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		iArchimate.diagram.part.IArchimateDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof iArchimate.diagram.navigator.IArchimateNavigatorItem
				&& !isOwnView(((iArchimate.diagram.navigator.IArchimateNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof iArchimate.diagram.navigator.IArchimateNavigatorGroup) {
			iArchimate.diagram.navigator.IArchimateNavigatorGroup group = (iArchimate.diagram.navigator.IArchimateNavigatorGroup) element;
			return iArchimate.diagram.part.IArchimateDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof iArchimate.diagram.navigator.IArchimateNavigatorItem) {
			iArchimate.diagram.navigator.IArchimateNavigatorItem navigatorItem = (iArchimate.diagram.navigator.IArchimateNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (iArchimate.diagram.part.IArchimateVisualIDRegistry
				.getVisualID(view)) {
		case iArchimate.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://co/edu/uniandes/iArchimate?Model", iArchimate.diagram.providers.IArchimateElementTypes.Model_1000); //$NON-NLS-1$
		case iArchimate.diagram.edit.parts.AbsentElementEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://co/edu/uniandes/iArchimate?AbsentElement", iArchimate.diagram.providers.IArchimateElementTypes.AbsentElement_2008); //$NON-NLS-1$
		case iArchimate.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://co/edu/uniandes/iArchimate?Group", iArchimate.diagram.providers.IArchimateElementTypes.Group_2009); //$NON-NLS-1$
		case iArchimate.diagram.edit.parts.ElementEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://co/edu/uniandes/iArchimate?Element", iArchimate.diagram.providers.IArchimateElementTypes.Element_2010); //$NON-NLS-1$
		case iArchimate.diagram.edit.parts.DecisionTraceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://co/edu/uniandes/iArchimate?DecisionTrace", iArchimate.diagram.providers.IArchimateElementTypes.DecisionTrace_2011); //$NON-NLS-1$
		case iArchimate.diagram.edit.parts.AbsentElement2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://co/edu/uniandes/iArchimate?AbsentElement", iArchimate.diagram.providers.IArchimateElementTypes.AbsentElement_3023); //$NON-NLS-1$
		case iArchimate.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://co/edu/uniandes/iArchimate?Group", iArchimate.diagram.providers.IArchimateElementTypes.Group_3024); //$NON-NLS-1$
		case iArchimate.diagram.edit.parts.Element2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://co/edu/uniandes/iArchimate?Element", iArchimate.diagram.providers.IArchimateElementTypes.Element_3025); //$NON-NLS-1$
		case iArchimate.diagram.edit.parts.ImperfectRelationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://co/edu/uniandes/iArchimate?ImperfectRelation", iArchimate.diagram.providers.IArchimateElementTypes.ImperfectRelation_4012); //$NON-NLS-1$
		case iArchimate.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://co/edu/uniandes/iArchimate?Relation", iArchimate.diagram.providers.IArchimateElementTypes.Relation_4013); //$NON-NLS-1$
		case iArchimate.diagram.edit.parts.ElementElementDecisionTraceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://co/edu/uniandes/iArchimate?Element?elementDecisionTrace", iArchimate.diagram.providers.IArchimateElementTypes.ElementElementDecisionTrace_4015); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = iArchimate.diagram.part.IArchimateDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& iArchimate.diagram.providers.IArchimateElementTypes
						.isKnownElementType(elementType)) {
			image = iArchimate.diagram.providers.IArchimateElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof iArchimate.diagram.navigator.IArchimateNavigatorGroup) {
			iArchimate.diagram.navigator.IArchimateNavigatorGroup group = (iArchimate.diagram.navigator.IArchimateNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof iArchimate.diagram.navigator.IArchimateNavigatorItem) {
			iArchimate.diagram.navigator.IArchimateNavigatorItem navigatorItem = (iArchimate.diagram.navigator.IArchimateNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (iArchimate.diagram.part.IArchimateVisualIDRegistry
				.getVisualID(view)) {
		case iArchimate.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getModel_1000Text(view);
		case iArchimate.diagram.edit.parts.AbsentElementEditPart.VISUAL_ID:
			return getAbsentElement_2008Text(view);
		case iArchimate.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return getGroup_2009Text(view);
		case iArchimate.diagram.edit.parts.ElementEditPart.VISUAL_ID:
			return getElement_2010Text(view);
		case iArchimate.diagram.edit.parts.DecisionTraceEditPart.VISUAL_ID:
			return getDecisionTrace_2011Text(view);
		case iArchimate.diagram.edit.parts.AbsentElement2EditPart.VISUAL_ID:
			return getAbsentElement_3023Text(view);
		case iArchimate.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return getGroup_3024Text(view);
		case iArchimate.diagram.edit.parts.Element2EditPart.VISUAL_ID:
			return getElement_3025Text(view);
		case iArchimate.diagram.edit.parts.ImperfectRelationEditPart.VISUAL_ID:
			return getImperfectRelation_4012Text(view);
		case iArchimate.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getRelation_4013Text(view);
		case iArchimate.diagram.edit.parts.ElementElementDecisionTraceEditPart.VISUAL_ID:
			return getElementElementDecisionTrace_4015Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getModel_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAbsentElement_2008Text(View view) {
		IParser parser = iArchimate.diagram.providers.IArchimateParserProvider
				.getParser(
						iArchimate.diagram.providers.IArchimateElementTypes.AbsentElement_2008,
						view.getElement() != null ? view.getElement() : view,
						iArchimate.diagram.part.IArchimateVisualIDRegistry
								.getType(iArchimate.diagram.edit.parts.AbsentElementNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			iArchimate.diagram.part.IArchimateDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGroup_2009Text(View view) {
		IParser parser = iArchimate.diagram.providers.IArchimateParserProvider
				.getParser(
						iArchimate.diagram.providers.IArchimateElementTypes.Group_2009,
						view.getElement() != null ? view.getElement() : view,
						iArchimate.diagram.part.IArchimateVisualIDRegistry
								.getType(iArchimate.diagram.edit.parts.GroupNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			iArchimate.diagram.part.IArchimateDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getElement_2010Text(View view) {
		IParser parser = iArchimate.diagram.providers.IArchimateParserProvider
				.getParser(
						iArchimate.diagram.providers.IArchimateElementTypes.Element_2010,
						view.getElement() != null ? view.getElement() : view,
						iArchimate.diagram.part.IArchimateVisualIDRegistry
								.getType(iArchimate.diagram.edit.parts.ElementNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			iArchimate.diagram.part.IArchimateDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDecisionTrace_2011Text(View view) {
		IParser parser = iArchimate.diagram.providers.IArchimateParserProvider
				.getParser(
						iArchimate.diagram.providers.IArchimateElementTypes.DecisionTrace_2011,
						view.getElement() != null ? view.getElement() : view,
						iArchimate.diagram.part.IArchimateVisualIDRegistry
								.getType(iArchimate.diagram.edit.parts.DecisionTraceIdDecisionTraceEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			iArchimate.diagram.part.IArchimateDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAbsentElement_3023Text(View view) {
		IParser parser = iArchimate.diagram.providers.IArchimateParserProvider
				.getParser(
						iArchimate.diagram.providers.IArchimateElementTypes.AbsentElement_3023,
						view.getElement() != null ? view.getElement() : view,
						iArchimate.diagram.part.IArchimateVisualIDRegistry
								.getType(iArchimate.diagram.edit.parts.AbsentElementName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			iArchimate.diagram.part.IArchimateDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGroup_3024Text(View view) {
		IParser parser = iArchimate.diagram.providers.IArchimateParserProvider
				.getParser(
						iArchimate.diagram.providers.IArchimateElementTypes.Group_3024,
						view.getElement() != null ? view.getElement() : view,
						iArchimate.diagram.part.IArchimateVisualIDRegistry
								.getType(iArchimate.diagram.edit.parts.GroupName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			iArchimate.diagram.part.IArchimateDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getElement_3025Text(View view) {
		IParser parser = iArchimate.diagram.providers.IArchimateParserProvider
				.getParser(
						iArchimate.diagram.providers.IArchimateElementTypes.Element_3025,
						view.getElement() != null ? view.getElement() : view,
						iArchimate.diagram.part.IArchimateVisualIDRegistry
								.getType(iArchimate.diagram.edit.parts.ElementName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			iArchimate.diagram.part.IArchimateDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getImperfectRelation_4012Text(View view) {
		IParser parser = iArchimate.diagram.providers.IArchimateParserProvider
				.getParser(
						iArchimate.diagram.providers.IArchimateElementTypes.ImperfectRelation_4012,
						view.getElement() != null ? view.getElement() : view,
						iArchimate.diagram.part.IArchimateVisualIDRegistry
								.getType(iArchimate.diagram.edit.parts.ImperfectRelationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			iArchimate.diagram.part.IArchimateDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelation_4013Text(View view) {
		IParser parser = iArchimate.diagram.providers.IArchimateParserProvider
				.getParser(
						iArchimate.diagram.providers.IArchimateElementTypes.Relation_4013,
						view.getElement() != null ? view.getElement() : view,
						iArchimate.diagram.part.IArchimateVisualIDRegistry
								.getType(iArchimate.diagram.edit.parts.RelationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			iArchimate.diagram.part.IArchimateDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getElementElementDecisionTrace_4015Text(View view) {
		IParser parser = iArchimate.diagram.providers.IArchimateParserProvider
				.getParser(
						iArchimate.diagram.providers.IArchimateElementTypes.ElementElementDecisionTrace_4015,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			iArchimate.diagram.part.IArchimateDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return iArchimate.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(iArchimate.diagram.part.IArchimateVisualIDRegistry
						.getModelID(view));
	}

}
