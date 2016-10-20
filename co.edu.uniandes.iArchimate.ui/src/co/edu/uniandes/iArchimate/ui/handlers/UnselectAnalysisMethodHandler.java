package co.edu.uniandes.iArchimate.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import co.edu.uniandes.iArchimate.analysis.methods.AnalysisMethodHelper;

public class UnselectAnalysisMethodHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		AnalysisMethodHelper.unselectAnalysisMethod();
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog dialog = new MessageDialog(window.getShell(), "Analysis Method", null, "Analysis Method Unselected", MessageDialog.INFORMATION, new String[] {"OK"}, 0);
		dialog.open();		
		return null;
	}
}
