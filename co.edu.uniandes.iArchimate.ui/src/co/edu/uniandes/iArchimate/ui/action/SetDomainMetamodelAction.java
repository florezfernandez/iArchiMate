package co.edu.uniandes.iArchimate.ui.action;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.actions.ActionDelegate;

import co.edu.uniandes.iArchimate.utilities.persistance.PropertiesLoader;

public class SetDomainMetamodelAction extends ActionDelegate implements IActionDelegate {
	private IFile selectedFile;
	private File domainMM;
	private String domainMMAbsolutePath;
	private String domainMMRelativePath;

	public SetDomainMetamodelAction() {
	}

	/**{@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.ActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 * @generated
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selectedFile = ((IFile)((IStructuredSelection) selection).toList().get(0));
		this.domainMM = new File(selectedFile.getLocationURI());
	}

	/**{@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.ActionDelegate#run(org.eclipse.jface.action.IAction)
	 * @generated
	 */
	public void run(IAction action) {
		this.domainMMAbsolutePath = this.domainMM.toString(); 
		IWorkspace myWorkspace = ResourcesPlugin.getWorkspace(); 
		String myWorkspaceAbsolutePath = myWorkspace.getRoot().getLocation().toString(); 
		this.domainMMRelativePath = this.domainMMAbsolutePath.substring(myWorkspaceAbsolutePath.length()+1);
		String projectName = this.domainMMRelativePath.substring(0,this.domainMMRelativePath.indexOf("\\"));
		this.domainMMRelativePath = this.domainMMRelativePath.substring(projectName.length()+1);
		String propertiesPath = myWorkspaceAbsolutePath+"/"+projectName+"/iModeler.properties";		
		PropertiesLoader.storeDomainMMProperty(propertiesPath, this.domainMMRelativePath);

//		WorkflowUtilities workflowUtilities = new WorkflowUtilities();
//		if(workflowUtilities.runRulesWorkflow(this.domainMMAbsolutePath)){
//			String message = this.domainMMRelativePath + " has been set as domain metamodel and its rules have been updated";
//			MessageDialog dialog = new MessageDialog(Display.getDefault().getActiveShell(), "Update domain metamodel rules", null, message, MessageDialog.INFORMATION, new String[] {"OK"}, 0);
//			dialog.open();										
//		}else {
//			String message = this.domainMMRelativePath + " has been set as domain metamodel; however, its rules have not been updated\n" +
//					"Please, verify the domain metamodel and update the rules";
//			MessageDialog dialog = new MessageDialog(Display.getDefault().getActiveShell(), "Update domain metamodel rules", null, message, MessageDialog.ERROR, new String[] {"OK"}, 0);
//			dialog.open();							
//		}


	}	
}
