package co.edu.uniandes.iArchimate.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import co.edu.uniandes.iArchimate.analysis.methods.AnalysisMethod;
import co.edu.uniandes.iArchimate.analysis.methods.imperfection.BusinessProcessFaultSusceptibility;
import co.edu.uniandes.iArchimate.ui.view.AnalysisResultViewLauncher;
import co.edu.uniandes.iArchimate.ui.view.DualAxisViewLauncher;
import co.edu.uniandes.iArchimate.ui.view.PolarViewLauncher;
import co.edu.uniandes.iArchimate.ui.view.StackedBar3DViewLauncher;

public class BusinessProcessFaultSusceptibilityImperfectionHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		AnalysisMethod analysisMethod = new BusinessProcessFaultSusceptibility();
		analysisMethod.performAnalysisMethod();
		AnalysisResultViewLauncher.launchView("Business Process Fault Susceptibility", analysisMethod.getAnalysisMethodReport());
		//DualAxisViewLauncher.test();
		DualAxisViewLauncher.launchView("Business Process Fault Susceptibility", "Availability", analysisMethod.getMultipleYLabels(), analysisMethod.getMultipleLineChartDataReport());
		PolarViewLauncher.launchView(analysisMethod.getMultipleTitles(), analysisMethod.getMultipleTicks(), analysisMethod.getMultiplePolarChartDataReport(), analysisMethod.getMultipleSeries());
		StackedBar3DViewLauncher.launchView("Business Process Fault Susceptibility", "Business Processes", "Fault Susceptibility", analysisMethod.getStackedBarChartDataReport());
		//PolarViewLauncher.launchTest();
		return null;
	}
}

