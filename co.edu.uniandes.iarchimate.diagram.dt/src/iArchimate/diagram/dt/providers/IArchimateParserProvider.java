package iArchimate.diagram.dt.providers;

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
	private IParser attributeFactIdFact_5001Parser;

	/**
	 * @generated
	 */
	private IParser getAttributeFactIdFact_5001Parser() {
		if (attributeFactIdFact_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { iArchimate.IArchimatePackage.eINSTANCE
					.getFact_IdFact() };
			iArchimate.diagram.dt.parsers.MessageFormatParser parser = new iArchimate.diagram.dt.parsers.MessageFormatParser(
					features);
			attributeFactIdFact_5001Parser = parser;
		}
		return attributeFactIdFact_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser instanceFactIdFact_5002Parser;

	/**
	 * @generated
	 */
	private IParser getInstanceFactIdFact_5002Parser() {
		if (instanceFactIdFact_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { iArchimate.IArchimatePackage.eINSTANCE
					.getFact_IdFact() };
			iArchimate.diagram.dt.parsers.MessageFormatParser parser = new iArchimate.diagram.dt.parsers.MessageFormatParser(
					features);
			instanceFactIdFact_5002Parser = parser;
		}
		return instanceFactIdFact_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser decisionIdDecision_5003Parser;

	/**
	 * @generated
	 */
	private IParser getDecisionIdDecision_5003Parser() {
		if (decisionIdDecision_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { iArchimate.IArchimatePackage.eINSTANCE
					.getDecision_IdDecision() };
			iArchimate.diagram.dt.parsers.MessageFormatParser parser = new iArchimate.diagram.dt.parsers.MessageFormatParser(
					features);
			decisionIdDecision_5003Parser = parser;
		}
		return decisionIdDecision_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser meetingName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getMeetingName_5004Parser() {
		if (meetingName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { iArchimate.IArchimatePackage.eINSTANCE
					.getSource_Name() };
			iArchimate.diagram.dt.parsers.MessageFormatParser parser = new iArchimate.diagram.dt.parsers.MessageFormatParser(
					features);
			meetingName_5004Parser = parser;
		}
		return meetingName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser relationFactIdFact_5005Parser;

	/**
	 * @generated
	 */
	private IParser getRelationFactIdFact_5005Parser() {
		if (relationFactIdFact_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { iArchimate.IArchimatePackage.eINSTANCE
					.getFact_IdFact() };
			iArchimate.diagram.dt.parsers.MessageFormatParser parser = new iArchimate.diagram.dt.parsers.MessageFormatParser(
					features);
			relationFactIdFact_5005Parser = parser;
		}
		return relationFactIdFact_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser observationIdObservation_5006Parser;

	/**
	 * @generated
	 */
	private IParser getObservationIdObservation_5006Parser() {
		if (observationIdObservation_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { iArchimate.IArchimatePackage.eINSTANCE
					.getObservation_IdObservation() };
			iArchimate.diagram.dt.parsers.MessageFormatParser parser = new iArchimate.diagram.dt.parsers.MessageFormatParser(
					features);
			observationIdObservation_5006Parser = parser;
		}
		return observationIdObservation_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser directObservationName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getDirectObservationName_5007Parser() {
		if (directObservationName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { iArchimate.IArchimatePackage.eINSTANCE
					.getSource_Name() };
			iArchimate.diagram.dt.parsers.MessageFormatParser parser = new iArchimate.diagram.dt.parsers.MessageFormatParser(
					features);
			directObservationName_5007Parser = parser;
		}
		return directObservationName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser personName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getPersonName_5008Parser() {
		if (personName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { iArchimate.IArchimatePackage.eINSTANCE
					.getSource_Name() };
			iArchimate.diagram.dt.parsers.MessageFormatParser parser = new iArchimate.diagram.dt.parsers.MessageFormatParser(
					features);
			personName_5008Parser = parser;
		}
		return personName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser documentName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getDocumentName_5009Parser() {
		if (documentName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { iArchimate.IArchimatePackage.eINSTANCE
					.getSource_Name() };
			iArchimate.diagram.dt.parsers.MessageFormatParser parser = new iArchimate.diagram.dt.parsers.MessageFormatParser(
					features);
			documentName_5009Parser = parser;
		}
		return documentName_5009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case iArchimate.diagram.dt.edit.parts.AttributeFactIdFactEditPart.VISUAL_ID:
			return getAttributeFactIdFact_5001Parser();
		case iArchimate.diagram.dt.edit.parts.InstanceFactIdFactEditPart.VISUAL_ID:
			return getInstanceFactIdFact_5002Parser();
		case iArchimate.diagram.dt.edit.parts.DecisionIdDecisionEditPart.VISUAL_ID:
			return getDecisionIdDecision_5003Parser();
		case iArchimate.diagram.dt.edit.parts.MeetingNameEditPart.VISUAL_ID:
			return getMeetingName_5004Parser();
		case iArchimate.diagram.dt.edit.parts.RelationFactIdFactEditPart.VISUAL_ID:
			return getRelationFactIdFact_5005Parser();
		case iArchimate.diagram.dt.edit.parts.ObservationIdObservationEditPart.VISUAL_ID:
			return getObservationIdObservation_5006Parser();
		case iArchimate.diagram.dt.edit.parts.DirectObservationNameEditPart.VISUAL_ID:
			return getDirectObservationName_5007Parser();
		case iArchimate.diagram.dt.edit.parts.PersonNameEditPart.VISUAL_ID:
			return getPersonName_5008Parser();
		case iArchimate.diagram.dt.edit.parts.DocumentNameEditPart.VISUAL_ID:
			return getDocumentName_5009Parser();
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
			return getParser(iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
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
			if (iArchimate.diagram.dt.providers.IArchimateElementTypes
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
