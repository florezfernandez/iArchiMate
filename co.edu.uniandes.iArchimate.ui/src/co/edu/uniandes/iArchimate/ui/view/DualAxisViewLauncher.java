package co.edu.uniandes.iArchimate.ui.view;

import java.util.ArrayList;

import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class DualAxisViewLauncher {

	@SuppressWarnings("deprecation")
	public static void launchView(String title, String xLabel, ArrayList<String> multipleYLabels, ArrayList<ArrayList<String[]>> multipleData) {
		try {
			DualAxisView dualAxisView=null;
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("co.edu.uniandes.iArchimate.ui.views.dualAxis");
			IViewPart[] views = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getViews();
			for(IViewPart view : views){
				if(view instanceof DualAxisView){
					dualAxisView = (DualAxisView)view;
					break;
				}
			}
			dualAxisView.updateView(title, xLabel, multipleYLabels, multipleData);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}
}
