package co.edu.uniandes.iArchimate.ui.view;

import java.util.ArrayList;

import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class XYViewLauncher {

	@SuppressWarnings("deprecation")
	public static void launchView(String title, String xLabel, ArrayList<String> multipleYLabels, ArrayList<ArrayList<String[]>> multipleData) {
		try {
			XYView scatterPlotView=null;
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("co.edu.uniandes.iArchimate.ui.views.scatterPlot");
			IViewPart[] views = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getViews();
			for(IViewPart view : views){
				if(view instanceof StackedBar3DView){
					scatterPlotView = (XYView)view;
					break;
				}
			}
			scatterPlotView.updateView(title, xLabel, multipleYLabels, multipleData);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}
}
