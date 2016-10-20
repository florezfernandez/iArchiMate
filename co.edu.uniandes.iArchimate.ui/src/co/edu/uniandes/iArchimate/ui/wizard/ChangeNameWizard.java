package co.edu.uniandes.iArchimate.ui.wizard;

import java.util.Collection;

import org.eclipse.jface.wizard.Wizard;

import co.edu.uniandes.iArchimate.ui.wizardPage.ChangeNameWizardPageOne;

public class ChangeNameWizard extends Wizard{

	private ChangeNameWizardPageOne changeInstanceNameWizardPage;
	private boolean cancel;
	
	public ChangeNameWizard(Collection<String> namesToSelect, String message) {
		
		this.setWindowTitle("Change name");
		
		changeInstanceNameWizardPage = new ChangeNameWizardPageOne(namesToSelect,message);
		changeInstanceNameWizardPage.setDescription(message);
		changeInstanceNameWizardPage.setTitle("Select a valid name");	
		
		cancel = false;
	}

	public void addPages() {	
		addPage(changeInstanceNameWizardPage);
	}

	public boolean performFinish() {	
		return true;
	}
	
	public boolean performCancel(){
		cancel = true;		
		this.changeInstanceNameWizardPage.setNewName(null);
		return cancel;
	}

	public ChangeNameWizardPageOne getChangeInstanceNameWizardPage() {
		return changeInstanceNameWizardPage;
	}

	public void setChangeInstanceNameWizardPage(
			ChangeNameWizardPageOne changeInstanceNameWizardPage) {
		this.changeInstanceNameWizardPage = changeInstanceNameWizardPage;
	}

	
	/*
	@Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
	     this.workbench=workbench;
	     this.selection=selection;
	     setNeedsProgressMonitor(true);
    }
    */
}
