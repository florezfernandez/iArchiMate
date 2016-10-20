package co.edu.uniandes.iArchimate.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import co.edu.uniandes.iArchimate.indicators.Indicator;
import co.edu.uniandes.iArchimate.indicators.imperfection.ImperfectComponents;
import co.edu.uniandes.iArchimate.ui.view.IndicatorViewLauncher;

public class NumberOfImperfectComponentsHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		Indicator indicator = new ImperfectComponents();
		indicator.calculateIndicator();
		IndicatorViewLauncher.launchView(indicator.getIndicatorReport());
		return null;
	}
}

