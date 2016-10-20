package co.edu.uniandes.iArchimate.ui.view;

import java.util.ArrayList;

import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class Pie3DViewLauncher {

	@SuppressWarnings("deprecation")
	public static void launchView(String title, ArrayList<String[]> data) {
		try {
			Pie3DView pie3DView=null;
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("co.edu.uniandes.iArchimate.ui.views.pie3D");
			IViewPart[] views = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getViews();
			for(IViewPart view : views){
				if(view instanceof Pie3DView){
					pie3DView = (Pie3DView)view;
					break;
				}
			}
			pie3DView.updateView(title, data);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}
}
