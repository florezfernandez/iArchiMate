package co.edu.uniandes.iArchimate.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import co.edu.uniandes.iArchimate.ui.wizard.SelectAnalysisMethodWizard;

public class SelectAnalysisMethodHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		SelectAnalysisMethodWizard wizard = new SelectAnalysisMethodWizard();
		WizardDialog wizardDialog = new WizardDialog(window.getShell(), wizard);
		wizardDialog.setPageSize(400,300);
		wizardDialog.open();
		return null;
	}
}
