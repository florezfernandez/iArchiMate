package iArchimate.diagram.dt.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

/**
 * @generated
 */
public class IArchimateEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public IArchimateEditPartProvider() {
		super(
				new iArchimate.diagram.dt.edit.parts.IArchimateEditPartFactory(),
				iArchimate.diagram.dt.part.IArchimateVisualIDRegistry.TYPED_INSTANCE,
				iArchimate.diagram.dt.edit.parts.DecisionTraceEditPart.MODEL_ID);
	}

}
