package co.edu.uniandes.iArchimate.ui.view;

import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import co.edu.uniandes.iArchimate.indicators.IndicatorReport;

public class IndicatorViewLauncher {

	@SuppressWarnings("deprecation")
	public static void launchView(IndicatorReport indicatorReport) {
		try {
			IndicatorView indicatorView=null;
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("co.edu.uniandes.iArchimate.ui.views.indicator");
			IViewPart[] views = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getViews();
			for(IViewPart view : views){
				if(view instanceof IndicatorView){
					indicatorView = (IndicatorView)view;
					break;
				}
			}
			indicatorView.updateView(indicatorReport);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}
}
