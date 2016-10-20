package co.edu.uniandes.iArchimate.ui.view;

import java.util.ArrayList;

import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class StackedBar3DViewLauncher {

	@SuppressWarnings("deprecation")
	public static void launchView(String title, String xLabel, String yLabel, ArrayList<String[]> data) {
		try {
			StackedBar3DView stackedBar3DView=null;
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("co.edu.uniandes.iArchimate.ui.views.stackedBar3D");
			IViewPart[] views = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getViews();
			for(IViewPart view : views){
				if(view instanceof StackedBar3DView){
					stackedBar3DView = (StackedBar3DView)view;
					break;
				}
			}
			stackedBar3DView.updateView(title, xLabel, yLabel, data);;
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}
}
