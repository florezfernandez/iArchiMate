package co.edu.uniandes.iArchimate.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import co.edu.uniandes.iArchimate.analysis.imperfection.AnalysisMethodImperfection;
import co.edu.uniandes.iArchimate.analysis.imperfection.ImperfectAttributesByTypeAndName;
import co.edu.uniandes.iArchimate.ui.view.AnalysisResultViewLauncher;

public class ImperfectAttributesByTypeAndNameHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		AnalysisMethodImperfection analysisMethodImperfection = new ImperfectAttributesByTypeAndName();
		analysisMethodImperfection.performAnalysisMethod();
		AnalysisResultViewLauncher.launchView("Imperfect Attributes by Element Type and Attribute Name", analysisMethodImperfection.getAnalysisMethodReport());
		return null;
	}
}

