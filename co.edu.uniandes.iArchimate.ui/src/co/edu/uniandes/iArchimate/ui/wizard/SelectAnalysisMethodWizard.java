package co.edu.uniandes.iArchimate.ui.wizard;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import co.edu.uniandes.iArchimate.analysis.methods.AnalysisMethod;
import co.edu.uniandes.iArchimate.analysis.methods.AnalysisMethodHelper;
import co.edu.uniandes.iArchimate.analysis.methods.ApplicationComponentAvailability;
import co.edu.uniandes.iArchimate.analysis.methods.ApplicationComponentImportanceLevel;
import co.edu.uniandes.iArchimate.analysis.methods.BusinessProcessFaultSusceptibility;
import co.edu.uniandes.iArchimate.analysis.methods.BusinessProcessParticipants;
import co.edu.uniandes.iArchimate.analysis.methods.BusinessRoleParticipationInBusinessProcess;
import co.edu.uniandes.iArchimate.analysis.methods.DeviceStorageAvailability;
import co.edu.uniandes.iArchimate.analysis.methods.ModelImpactOfRemovingElements;
import co.edu.uniandes.iArchimate.analysis.methods.RequirementImpactOverITElements;
import co.edu.uniandes.iArchimate.ui.wizardPage.SelectAnalysisMethodWizardPageOne;

public class SelectAnalysisMethodWizard extends Wizard implements INewWizard {
	private SelectAnalysisMethodWizardPageOne pageOne;
	//private IStructuredSelection selection;
	
	public SelectAnalysisMethodWizard() {
		super();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.setWindowTitle("Import Archi Model");
		this.setNeedsProgressMonitor(true);
		//this.selection = selection;
	}

	public void addPages() {
		this.pageOne = new SelectAnalysisMethodWizardPageOne();
		addPage(pageOne);
	}


	
	@Override
	public boolean performFinish() {
		AnalysisMethod analysisMethod=null;
		if(this.pageOne.getConcept().equals(AnalysisMethodHelper.MODEL)){
			if(this.pageOne.getAnalysisMethod().equals(AnalysisMethodHelper.IMPACT_OF_REMOVING_ELEMENTS)){
				analysisMethod = new ModelImpactOfRemovingElements();
			}
		}else if(this.pageOne.getConcept().equals(AnalysisMethodHelper.APPLICATION_COMPONENT)){
			if(this.pageOne.getAnalysisMethod().equals(AnalysisMethodHelper.AVAILABILITY)){
				analysisMethod = new ApplicationComponentAvailability();
			}else if(this.pageOne.getAnalysisMethod().equals(AnalysisMethodHelper.IMPORTANCE_LEVEL)){
				analysisMethod = new ApplicationComponentImportanceLevel();
			}
		}else if(this.pageOne.getConcept().equals(AnalysisMethodHelper.BUSINESS_PROCESS)){
			if(this.pageOne.getAnalysisMethod().equals(AnalysisMethodHelper.FAULT_SUSCEPTIBILITY)){
				analysisMethod = new BusinessProcessFaultSusceptibility();
			}else if(this.pageOne.getAnalysisMethod().equals(AnalysisMethodHelper.PARTICIPATS)){
				analysisMethod = new BusinessProcessParticipants();
			}
		}else if(this.pageOne.getConcept().equals(AnalysisMethodHelper.BUSINESS_ROLE)){
			if(this.pageOne.getAnalysisMethod().equals(AnalysisMethodHelper.PARTICIPATION_IN_BUSINESS_PROCESS)){
				analysisMethod = new BusinessRoleParticipationInBusinessProcess();
			}
		}else if(this.pageOne.getConcept().equals(AnalysisMethodHelper.DEVICE)){
			if(this.pageOne.getAnalysisMethod().equals(AnalysisMethodHelper.STORAGE_AVAILABILITY)){
				analysisMethod = new DeviceStorageAvailability();
			}
		}else if(this.pageOne.getConcept().equals(AnalysisMethodHelper.REQUIREMENT)){
			if(this.pageOne.getAnalysisMethod().equals(AnalysisMethodHelper.IMPACT_OVER_IT_ELEMENTS)){
				analysisMethod = new RequirementImpactOverITElements();
			}
		}
		if(analysisMethod!=null){
			MessageDialog dialog = new MessageDialog(null, "Result of selecting analysis method", null, analysisMethod.selectAnalysisMethod(), MessageDialog.INFORMATION, new String[] {"OK"}, 0);
			dialog.open();		
		}
		return true;
	}
}
