package co.edu.uniandes.iArchimate.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import co.edu.uniandes.iArchimate.analysis.imperfection.AnalysisMethodImperfection;
import co.edu.uniandes.iArchimate.analysis.imperfection.OverallModelImperfection;
import co.edu.uniandes.iArchimate.ui.view.AnalysisResultViewLauncher;

public class OverallModelImperfectionHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		AnalysisMethodImperfection analysisMethodImperfection = new OverallModelImperfection();
		analysisMethodImperfection.performAnalysisMethod();
		AnalysisResultViewLauncher.launchView("Overall Model Imperfection", analysisMethodImperfection.getAnalysisMethodReport());
		return null;
	}
}

