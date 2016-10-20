/*
 * 
 */
package iArchimate.diagram.providers;

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
				new iArchimate.diagram.edit.parts.IArchimateEditPartFactory(),
				iArchimate.diagram.part.IArchimateVisualIDRegistry.TYPED_INSTANCE,
				iArchimate.diagram.edit.parts.ModelEditPart.MODEL_ID);
	}

}
