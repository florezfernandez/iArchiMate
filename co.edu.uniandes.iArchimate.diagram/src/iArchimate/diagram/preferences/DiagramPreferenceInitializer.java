/*
 * 
 */
package iArchimate.diagram.preferences;

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
		iArchimate.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		iArchimate.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		iArchimate.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		iArchimate.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		iArchimate.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return iArchimate.diagram.part.IArchimateDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
