package iArchimate.diagram.dt.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		iArchimate.diagram.dt.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		iArchimate.diagram.dt.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		iArchimate.diagram.dt.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		iArchimate.diagram.dt.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		iArchimate.diagram.dt.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return iArchimate.diagram.dt.part.IArchimateDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
