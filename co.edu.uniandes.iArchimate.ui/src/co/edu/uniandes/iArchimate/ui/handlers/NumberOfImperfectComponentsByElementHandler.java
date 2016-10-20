package co.edu.uniandes.iArchimate.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import co.edu.uniandes.iArchimate.indicators.Indicator;
import co.edu.uniandes.iArchimate.indicators.imperfection.ImperfectComponentsByElement;
import co.edu.uniandes.iArchimate.ui.view.IndicatorViewLauncher;

public class NumberOfImperfectComponentsByElementHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		Indicator indicator = new ImperfectComponentsByElement();
		indicator.calculateIndicator();
		IndicatorViewLauncher.launchView(indicator.getIndicatorReport());

		return null;
	}
}

