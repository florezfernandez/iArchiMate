package co.edu.uniandes.iArchimate.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import co.edu.uniandes.iArchimate.analysis.imperfection.AnalysisMethodImperfection;
import co.edu.uniandes.iArchimate.analysis.imperfection.RelationUncertainty;
import co.edu.uniandes.iArchimate.ui.view.AnalysisResultViewLauncher;

public class RelationUncertaintyHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		AnalysisMethodImperfection analysisMethodImperfection = new RelationUncertainty();
		analysisMethodImperfection.performAnalysisMethod();
		AnalysisResultViewLauncher.launchView("Application Component Availability", analysisMethodImperfection.getAnalysisMethodReport());
		//Pie3DViewLauncher.launchView("Application Component Realization Uncertainty", analysisMethodImperfection.getChartDataReport());
		return null;
	}
}

