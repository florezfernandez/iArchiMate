package iArchimate.diagram.dt.providers;

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
		ElementInitializers cached = iArchimate.diagram.dt.part.IArchimateDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			iArchimate.diagram.dt.part.IArchimateDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
