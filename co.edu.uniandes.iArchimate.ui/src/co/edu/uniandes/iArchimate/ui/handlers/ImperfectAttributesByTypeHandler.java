package co.edu.uniandes.iArchimate.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import co.edu.uniandes.iArchimate.analysis.imperfection.AnalysisMethodImperfection;
import co.edu.uniandes.iArchimate.analysis.imperfection.ImperfectAttributesByType;
import co.edu.uniandes.iArchimate.ui.view.AnalysisResultViewLauncher;
import co.edu.uniandes.iArchimate.ui.view.Bar3DViewLauncher;

public class ImperfectAttributesByTypeHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		AnalysisMethodImperfection analysisMethodImperfection = new ImperfectAttributesByType();
		analysisMethodImperfection.performAnalysisMethod();
		AnalysisResultViewLauncher.launchView("Imperfect Attributes by Element Type", analysisMethodImperfection.getAnalysisMethodReport());
		Bar3DViewLauncher.launchView("Imperfect Attributes by Element Type", "ArchiMate Element", "# Attributes", analysisMethodImperfection.getChartDataReport());
		return null;
	}
}

