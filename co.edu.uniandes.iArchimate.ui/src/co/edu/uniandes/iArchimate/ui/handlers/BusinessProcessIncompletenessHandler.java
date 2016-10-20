package co.edu.uniandes.iArchimate.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import co.edu.uniandes.iArchimate.analysis.imperfection.AnalysisMethodImperfection;
import co.edu.uniandes.iArchimate.analysis.imperfection.BusinessProcessIncompleteness;
import co.edu.uniandes.iArchimate.ui.view.AnalysisResultViewLauncher;
import co.edu.uniandes.iArchimate.ui.view.Pie3DViewLauncher;

public class BusinessProcessIncompletenessHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		AnalysisMethodImperfection analysisMethodImperfection = new BusinessProcessIncompleteness();
		analysisMethodImperfection.performAnalysisMethod();
		AnalysisResultViewLauncher.launchView("Business Process Incompleteness", analysisMethodImperfection.getAnalysisMethodReport());
		Pie3DViewLauncher.launchView("Business Process Incompleteness", analysisMethodImperfection.getChartDataReport());
		return null;
	}
}

