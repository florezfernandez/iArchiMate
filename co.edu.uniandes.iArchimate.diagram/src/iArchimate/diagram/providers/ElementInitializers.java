/*
 * 
 */
package iArchimate.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = iArchimate.diagram.part.IArchimateDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			iArchimate.diagram.part.IArchimateDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
