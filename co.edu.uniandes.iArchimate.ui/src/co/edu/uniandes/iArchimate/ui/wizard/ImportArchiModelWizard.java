package co.edu.uniandes.iArchimate.ui.wizard;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import co.edu.uniandes.iArchimate.transformation.archi.Archi2iArchimateTransformation;
import co.edu.uniandes.iArchimate.ui.wizardPage.ImportArchiModelWizardPageOne;

public class ImportArchiModelWizard extends Wizard implements INewWizard {
	private ImportArchiModelWizardPageOne pageOne;
	//private IStructuredSelection selection;
	
	public ImportArchiModelWizard() {
		super();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.setWindowTitle("Import Archi Model");
		this.setNeedsProgressMonitor(true);
		//this.selection = selection;
	}

	public void addPages() {
		this.pageOne = new ImportArchiModelWizardPageOne(getAbsoluteWorkspacePath(), getCurrentlySelectedProjectFolder());
		addPage(pageOne);
	}


	
	@Override
	public boolean performFinish() {
		Archi2iArchimateTransformation archi2iArchimateTransformation = new Archi2iArchimateTransformation(); 
		String result = archi2iArchimateTransformation.transformArchiModel(this.pageOne.getTxtArchiFile().getText(), this.pageOne.getTxtTargetPath().getText());
		MessageDialog dialog = new MessageDialog(null, "Result of importing model", null, result, MessageDialog.INFORMATION, new String[] {"OK"}, 0);
		dialog.open();			
		return true;
	}

	public IProject getCurrentlySelectedProjectFolder(){
	    IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	    IProject project = null;
	    if (window != null)
	    {	    	
	        IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
	        Object firstElement = selection.getFirstElement();
	        if (firstElement instanceof IAdaptable)
	        {	
	        	if((IProject)((IAdaptable)firstElement).getAdapter(IProject.class) != null){
		            project = (IProject)((IAdaptable)firstElement).getAdapter(IProject.class);
	        	}else{
		        	IFolder fold = (IFolder)selection.getFirstElement();
		        	String projectName = fold.getProject().getName();
		        	project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
	        	}
	        }
	    }
	    return project;
	}	

	public String getAbsoluteWorkspacePath(){
		String path = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		return path;
	}

}
