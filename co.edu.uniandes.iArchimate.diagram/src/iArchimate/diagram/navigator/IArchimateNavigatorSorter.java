/*
 * 
 */
package iArchimate.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class IArchimateNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7037;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7036;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof iArchimate.diagram.navigator.IArchimateNavigatorItem) {
			iArchimate.diagram.navigator.IArchimateNavigatorItem item = (iArchimate.diagram.navigator.IArchimateNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return iArchimate.diagram.part.IArchimateVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
