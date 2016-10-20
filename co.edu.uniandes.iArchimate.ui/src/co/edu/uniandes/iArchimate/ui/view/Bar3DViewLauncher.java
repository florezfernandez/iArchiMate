package co.edu.uniandes.iArchimate.ui.view;

import java.util.ArrayList;

import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class Bar3DViewLauncher {

	@SuppressWarnings("deprecation")
	public static void launchView(String title, String xLabel, String yLabel, ArrayList<String[]> data) {
		try {
			Bar3DView bar3DView=null;
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("co.edu.uniandes.iArchimate.ui.views.bar3D");
			IViewPart[] views = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getViews();
			for(IViewPart view : views){
				if(view instanceof Bar3DView){
					bar3DView = (Bar3DView)view;
					break;
				}
			}
			bar3DView.updateView(title, xLabel, yLabel, data);;
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}
}
