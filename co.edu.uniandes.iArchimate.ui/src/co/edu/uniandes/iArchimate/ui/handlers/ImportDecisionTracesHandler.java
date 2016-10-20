package co.edu.uniandes.iArchimate.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import co.edu.uniandes.iArchimate.transformation.decisionTrace.DecisionTraceTransformation;
import co.edu.uniandes.iArchimate.ui.dialog.SelectFromTreeDialog;
import co.edu.uniandes.iArchimate.utilities.emf.ModelingUtilities;

public class ImportDecisionTracesHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);		
		SelectFromTreeDialog selectDialog = new SelectFromTreeDialog();
		String filePath = selectDialog.querySingleFileToImport("Project: " + ModelingUtilities.getProjectName(), "Select a file with extension .iarchimate_dt:", ModelingUtilities.getCurrentSelectedProject());
		DecisionTraceTransformation dtt = new DecisionTraceTransformation(); 
		MessageDialog dialog = new MessageDialog(window.getShell(), "Result of exporting Decision Trace", null, dtt.importDecisionTrace(filePath), MessageDialog.INFORMATION, new String[] {"OK"}, 0);
		dialog.open();		
		return null;
	}
	

}
