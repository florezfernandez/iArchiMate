package co.edu.uniandes.iArchimate.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import co.edu.uniandes.iArchimate.analysis.imperfection.AnalysisMethodImperfection;
import co.edu.uniandes.iArchimate.analysis.imperfection.ImperfectRelationsByTypeAndName;
import co.edu.uniandes.iArchimate.ui.view.AnalysisResultViewLauncher;

public class ImperfectRelationsByTypeAndNameHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		AnalysisMethodImperfection analysisMethodImperfection = new ImperfectRelationsByTypeAndName();
		analysisMethodImperfection.performAnalysisMethod();
		AnalysisResultViewLauncher.launchView("Imperfect Relations by Element Type and Relation Type", analysisMethodImperfection.getAnalysisMethodReport());
		return null;
	}
}

