package iArchimate.diagram.dt.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class IArchimateNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4008;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof iArchimate.diagram.dt.navigator.IArchimateNavigatorItem) {
			iArchimate.diagram.dt.navigator.IArchimateNavigatorItem item = (iArchimate.diagram.dt.navigator.IArchimateNavigatorItem) element;
			return iArchimate.diagram.dt.part.IArchimateVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
