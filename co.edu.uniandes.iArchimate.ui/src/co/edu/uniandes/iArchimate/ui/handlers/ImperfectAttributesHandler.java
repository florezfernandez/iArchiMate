package co.edu.uniandes.iArchimate.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import co.edu.uniandes.iArchimate.analysis.imperfection.AnalysisMethodImperfection;
import co.edu.uniandes.iArchimate.analysis.imperfection.ImperfectAttributes;
import co.edu.uniandes.iArchimate.ui.view.AnalysisResultViewLauncher;
import co.edu.uniandes.iArchimate.ui.view.Pie3DViewLauncher;

public class ImperfectAttributesHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		AnalysisMethodImperfection analysisMethodImperfection = new ImperfectAttributes();
		analysisMethodImperfection.performAnalysisMethod();
		AnalysisResultViewLauncher.launchView("Imperfect Attributes", analysisMethodImperfection.getAnalysisMethodReport());		
		Pie3DViewLauncher.launchView("Imperfect Attributes", analysisMethodImperfection.getChartDataReport());
		return null;
	}
}

