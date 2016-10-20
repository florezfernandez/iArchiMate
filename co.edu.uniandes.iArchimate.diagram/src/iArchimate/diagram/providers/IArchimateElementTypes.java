/*
 * 
 */
package iArchimate.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class IArchimateElementTypes {

	/**
	 * @generated
	 */
	private IArchimateElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			iArchimate.diagram.part.IArchimateDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Model_1000 = getElementType("co.edu.uniandes.iArchimate.diagram.Model_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AbsentElement_2008 = getElementType("co.edu.uniandes.iArchimate.diagram.AbsentElement_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Group_2009 = getElementType("co.edu.uniandes.iArchimate.diagram.Group_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Element_2010 = getElementType("co.edu.uniandes.iArchimate.diagram.Element_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DecisionTrace_2011 = getElementType("co.edu.uniandes.iArchimate.diagram.DecisionTrace_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AbsentElement_3023 = getElementType("co.edu.uniandes.iArchimate.diagram.AbsentElement_3023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Group_3024 = getElementType("co.edu.uniandes.iArchimate.diagram.Group_3024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Element_3025 = getElementType("co.edu.uniandes.iArchimate.diagram.Element_3025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ImperfectRelation_4012 = getElementType("co.edu.uniandes.iArchimate.diagram.ImperfectRelation_4012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relation_4013 = getElementType("co.edu.uniandes.iArchimate.diagram.Relation_4013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ElementElementDecisionTrace_4015 = getElementType("co.edu.uniandes.iArchimate.diagram.ElementElementDecisionTrace_4015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Model_1000,
					iArchimate.IArchimatePackage.eINSTANCE.getModel());

			elements.put(AbsentElement_2008,
					iArchimate.IArchimatePackage.eINSTANCE.getAbsentElement());

			elements.put(Group_2009,
					iArchimate.IArchimatePackage.eINSTANCE.getGroup());

			elements.put(Element_2010,
					iArchimate.IArchimatePackage.eINSTANCE.getElement());

			elements.put(DecisionTrace_2011,
					iArchimate.IArchimatePackage.eINSTANCE.getDecisionTrace());

			elements.put(AbsentElement_3023,
					iArchimate.IArchimatePackage.eINSTANCE.getAbsentElement());

			elements.put(Group_3024,
					iArchimate.IArchimatePackage.eINSTANCE.getGroup());

			elements.put(Element_3025,
					iArchimate.IArchimatePackage.eINSTANCE.getElement());

			elements.put(ImperfectRelation_4012,
					iArchimate.IArchimatePackage.eINSTANCE
							.getImperfectRelation());

			elements.put(Relation_4013,
					iArchimate.IArchimatePackage.eINSTANCE.getRelation());

			elements.put(ElementElementDecisionTrace_4015,
					iArchimate.IArchimatePackage.eINSTANCE
							.getElement_ElementDecisionTrace());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Model_1000);
			KNOWN_ELEMENT_TYPES.add(AbsentElement_2008);
			KNOWN_ELEMENT_TYPES.add(Group_2009);
			KNOWN_ELEMENT_TYPES.add(Element_2010);
			KNOWN_ELEMENT_TYPES.add(DecisionTrace_2011);
			KNOWN_ELEMENT_TYPES.add(AbsentElement_3023);
			KNOWN_ELEMENT_TYPES.add(Group_3024);
			KNOWN_ELEMENT_TYPES.add(Element_3025);
			KNOWN_ELEMENT_TYPES.add(ImperfectRelation_4012);
			KNOWN_ELEMENT_TYPES.add(Relation_4013);
			KNOWN_ELEMENT_TYPES.add(ElementElementDecisionTrace_4015);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case iArchimate.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return Model_1000;
		case iArchimate.diagram.edit.parts.AbsentElementEditPart.VISUAL_ID:
			return AbsentElement_2008;
		case iArchimate.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return Group_2009;
		case iArchimate.diagram.edit.parts.ElementEditPart.VISUAL_ID:
			return Element_2010;
		case iArchimate.diagram.edit.parts.DecisionTraceEditPart.VISUAL_ID:
			return DecisionTrace_2011;
		case iArchimate.diagram.edit.parts.AbsentElement2EditPart.VISUAL_ID:
			return AbsentElement_3023;
		case iArchimate.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return Group_3024;
		case iArchimate.diagram.edit.parts.Element2EditPart.VISUAL_ID:
			return Element_3025;
		case iArchimate.diagram.edit.parts.ImperfectRelationEditPart.VISUAL_ID:
			return ImperfectRelation_4012;
		case iArchimate.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return Relation_4013;
		case iArchimate.diagram.edit.parts.ElementElementDecisionTraceEditPart.VISUAL_ID:
			return ElementElementDecisionTrace_4015;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return iArchimate.diagram.providers.IArchimateElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return iArchimate.diagram.providers.IArchimateElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return iArchimate.diagram.providers.IArchimateElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
