package co.edu.uniandes.iArchimate.ui.view;

import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import co.edu.uniandes.iArchimate.analysis.AnalysisMethodReport;

public class AnalysisResultViewLauncher {

	@SuppressWarnings("deprecation")
	public static void launchView(String title, AnalysisMethodReport analysisMethodReport) {
		try {
			AnalysisResultView analysisResultView=null;
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("co.edu.uniandes.iArchimate.ui.views.analysisResult");
			IViewPart[] views = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getViews();
			for(IViewPart view : views){
				if(view instanceof AnalysisResultView){
					analysisResultView = (AnalysisResultView)view;
					break;
				}
			}
			analysisResultView.updateView(title, analysisMethodReport);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}
}
