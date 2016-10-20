package co.edu.uniandes.iArchimate.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import co.edu.uniandes.iArchimate.analysis.methods.AnalysisMethod;
import co.edu.uniandes.iArchimate.analysis.methods.imperfection.ApplicationComponentAvailability;
import co.edu.uniandes.iArchimate.ui.view.AnalysisResultViewLauncher;
import co.edu.uniandes.iArchimate.ui.view.DualAxisViewLauncher;

public class ApplicationComponentAvailabilityImperfectionHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		AnalysisMethod analysisMethod = new ApplicationComponentAvailability();
		analysisMethod.performAnalysisMethod();
		AnalysisResultViewLauncher.launchView("Application Component Availability", analysisMethod.getAnalysisMethodReport());
		//DualAxisViewLauncher.test();
		DualAxisViewLauncher.launchView("Application Component Availability", "Availability", analysisMethod.getMultipleYLabels(), analysisMethod.getMultipleLineChartDataReport());
		return null;
	}
}

