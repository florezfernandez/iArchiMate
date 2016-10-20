package co.edu.uniandes.iArchimate.ui.wizard;

import org.eclipse.jface.wizard.Wizard;

import co.edu.uniandes.iArchimate.ui.wizardPage.AttributePropertyTabPageOne;

public class AttributePropertyTabWizard extends Wizard{
	private AttributePropertyTabPageOne attributePropertyTabAddPageOne;
	public static int ADD=1;
	public static int REMOVE=2;
	public static int EDIT=3;

	private boolean performedFinish=false;
	
	public AttributePropertyTabWizard(int operationType, int typeOfPropertySection) {
		this.setWindowTitle("Attribute Management");
		attributePropertyTabAddPageOne = new AttributePropertyTabPageOne(operationType, typeOfPropertySection);
	}

	public boolean isPerformedFinish() {
		return performedFinish;
	}

	public AttributePropertyTabPageOne getAttributePropertyTabAddPageOne() {
		return attributePropertyTabAddPageOne;
	}


	public void addPages() {	
		addPage(attributePropertyTabAddPageOne);
	}

	public boolean performFinish() {	
		this.performedFinish=true;
		return true;
	}
	
	public boolean performCancel(){
		return true;
	}

	public AttributePropertyTabPageOne getChangeInstanceNameWizardPage() {
		return attributePropertyTabAddPageOne;
	}

	public void setChangeInstanceNameWizardPage(
			AttributePropertyTabPageOne changeInstanceNameWizardPage) {
		this.attributePropertyTabAddPageOne = changeInstanceNameWizardPage;
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
