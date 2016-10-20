/*
 * 
 */
package iArchimate.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class IArchimateParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser absentElementName_5025Parser;

	/**
	 * @generated
	 */
	private IParser getAbsentElementName_5025Parser() {
		if (absentElementName_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { iArchimate.IArchimatePackage.eINSTANCE
					.getComponent_Name() };
			iArchimate.diagram.parsers.MessageFormatParser parser = new iArchimate.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			absentElementName_5025Parser = parser;
		}
		return absentElementName_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser groupName_5029Parser;

	/**
	 * @generated
	 */
	private IParser getGroupName_5029Parser() {
		if (groupName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { iArchimate.IArchimatePackage.eINSTANCE
					.getComponent_Name() };
			iArchimate.diagram.parsers.MessageFormatParser parser = new iArchimate.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			groupName_5029Parser = parser;
		}
		return groupName_5029Parser;
	}

	/**
	 * @generated
	 */
	private IParser elementName_5030Parser;

	/**
	 * @generated
	 */
	private IParser getElementName_5030Parser() {
		if (elementName_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { iArchimate.IArchimatePackage.eINSTANCE
					.getComponent_Name() };
			iArchimate.diagram.parsers.MessageFormatParser parser = new iArchimate.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			elementName_5030Parser = parser;
		}
		return elementName_5030Parser;
	}

	/**
	 * @generated
	 */
	private IParser decisionTraceIdDecisionTrace_5036Parser;

	/**
	 * @generated
	 */
	private IParser getDecisionTraceIdDecisionTrace_5036Parser() {
		if (decisionTraceIdDecisionTrace_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { iArchimate.IArchimatePackage.eINSTANCE
					.getDecisionTrace_IdDecisionTrace() };
			iArchimate.diagram.parsers.MessageFormatParser parser = new iArchimate.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			decisionTraceIdDecisionTrace_5036Parser = parser;
		}
		return decisionTraceIdDecisionTrace_5036Parser;
	}

	/**
	 * @generated
	 */
	private IParser absentElementName_5035Parser;

	/**
	 * @generated
	 */
	private IParser getAbsentElementName_5035Parser() {
		if (absentElementName_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { iArchimate.IArchimatePackage.eINSTANCE
					.getComponent_Name() };
			iArchimate.diagram.parsers.MessageFormatParser parser = new iArchimate.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			absentElementName_5035Parser = parser;
		}
		return absentElementName_5035Parser;
	}

	/**
	 * @generated
	 */
	private IParser groupName_5034Parser;

	/**
	 * @generated
	 */
	private IParser getGroupName_5034Parser() {
		if (groupName_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { iArchimate.IArchimatePackage.eINSTANCE
					.getComponent_Name() };
			iArchimate.diagram.parsers.MessageFormatParser parser = new iArchimate.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			groupName_5034Parser = parser;
		}
		return groupName_5034Parser;
	}

	/**
	 * @generated
	 */
	private IParser elementName_5033Parser;

	/**
	 * @generated
	 */
	private IParser getElementName_5033Parser() {
		if (elementName_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { iArchimate.IArchimatePackage.eINSTANCE
					.getComponent_Name() };
			iArchimate.diagram.parsers.MessageFormatParser parser = new iArchimate.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			elementName_5033Parser = parser;
		}
		return elementName_5033Parser;
	}

	/**
	 * @generated
	 */
	private IParser imperfectRelationName_6012Parser;

	/**
	 * @generated
	 */
	private IParser getImperfectRelationName_6012Parser() {
		if (imperfectRelationName_6012Parser == null) {
			EAttribute[] features = new EAttribute[] { iArchimate.IArchimatePackage.eINSTANCE
					.getRelation_Name() };
			iArchimate.diagram.parsers.MessageFormatParser parser = new iArchimate.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			imperfectRelationName_6012Parser = parser;
		}
		return imperfectRelationName_6012Parser;
	}

	/**
	 * @generated
	 */
	private IParser relationName_6013Parser;

	/**
	 * @generated
	 */
	private IParser getRelationName_6013Parser() {
		if (relationName_6013Parser == null) {
			EAttribute[] features = new EAttribute[] { iArchimate.IArchimatePackage.eINSTANCE
					.getRelation_Name() };
			iArchimate.diagram.parsers.MessageFormatParser parser = new iArchimate.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			relationName_6013Parser = parser;
		}
		return relationName_6013Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case iArchimate.diagram.edit.parts.AbsentElementNameEditPart.VISUAL_ID:
			return getAbsentElementName_5025Parser();
		case iArchimate.diagram.edit.parts.GroupNameEditPart.VISUAL_ID:
			return getGroupName_5029Parser();
		case iArchimate.diagram.edit.parts.ElementNameEditPart.VISUAL_ID:
			return getElementName_5030Parser();
		case iArchimate.diagram.edit.parts.DecisionTraceIdDecisionTraceEditPart.VISUAL_ID:
			return getDecisionTraceIdDecisionTrace_5036Parser();
		case iArchimate.diagram.edit.parts.AbsentElementName2EditPart.VISUAL_ID:
			return getAbsentElementName_5035Parser();
		case iArchimate.diagram.edit.parts.GroupName2EditPart.VISUAL_ID:
			return getGroupName_5034Parser();
		case iArchimate.diagram.edit.parts.ElementName2EditPart.VISUAL_ID:
			return getElementName_5033Parser();
		case iArchimate.diagram.edit.parts.ImperfectRelationNameEditPart.VISUAL_ID:
			return getImperfectRelationName_6012Parser();
		case iArchimate.diagram.edit.parts.RelationNameEditPart.VISUAL_ID:
			return getRelationName_6013Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (iArchimate.diagram.providers.IArchimateElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
