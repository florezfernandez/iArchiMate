package co.edu.uniandes.iArchimate.ui.wizard;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import co.edu.uniandes.iArchimate.analysis.methods.AnalysisChain;
import co.edu.uniandes.iArchimate.analysis.methods.AnalysisMethod;
import co.edu.uniandes.iArchimate.analysis.methods.AnalysisMethodHelper;
import co.edu.uniandes.iArchimate.analysis.methods.ApplicationComponentAvailability;
import co.edu.uniandes.iArchimate.analysis.methods.BusinessProcessFaultSusceptibility;
import co.edu.uniandes.iArchimate.analysis.methods.BusinessRoleParticipationInBusinessProcess;
import co.edu.uniandes.iArchimate.analysis.methods.RequirementImpactOverDevice;
import co.edu.uniandes.iArchimate.ui.wizardPage.SelectAnalysisChainWizardPageOne;

public class SelectAnalysisChainWizard extends Wizard implements INewWizard {
	private SelectAnalysisChainWizardPageOne pageOne;
	//private IStructuredSelection selection;

	public SelectAnalysisChainWizard() {
		super();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.setWindowTitle("Import Archi Model");
		this.setNeedsProgressMonitor(true);
		//this.selection = selection;
	}

	public void addPages() {
		this.pageOne = new SelectAnalysisChainWizardPageOne();
		addPage(pageOne);
	}

	@Override
	public boolean performFinish() {
		AnalysisMethod analysisMethod=null;
		AnalysisChain analysisChain = new AnalysisChain();
		for(int i=0; i<this.pageOne.getListSelectedAnalysisMethods().getItemCount(); i++){
			String []conceptAndAnalysisMethod = this.pageOne.getListSelectedAnalysisMethods().getItem(i).split("->");
			if(conceptAndAnalysisMethod[0].equals(AnalysisMethodHelper.APPLICATION_COMPONENT)){
				if(conceptAndAnalysisMethod[1].equals(AnalysisMethodHelper.AVAILABILITY)){
					analysisMethod = new ApplicationComponentAvailability();
				}
			}else if(conceptAndAnalysisMethod[0].equals(AnalysisMethodHelper.BUSINESS_PROCESS)){
				if(conceptAndAnalysisMethod[1].equals(AnalysisMethodHelper.FAULT_SUSCEPTIBILITY)){
					analysisMethod = new BusinessProcessFaultSusceptibility();
				}
			}else if(conceptAndAnalysisMethod[0].equals(AnalysisMethodHelper.BUSINESS_ROLE)){
				if(conceptAndAnalysisMethod[1].equals(AnalysisMethodHelper.PARTICIPATION_IN_BUSINESS_PROCESS)){
					analysisMethod = new BusinessRoleParticipationInBusinessProcess();
				}
			}else if(conceptAndAnalysisMethod[0].equals(AnalysisMethodHelper.REQUIREMENT)){
				if(conceptAndAnalysisMethod[1].equals(AnalysisMethodHelper.IMPACT_OVER_DEVICE)){
					analysisMethod = new RequirementImpactOverDevice();
				}
			}
			analysisChain.addAnalysisMethod(analysisMethod);
		}
		MessageDialog dialog = new MessageDialog(null, "Result of selecting analysis method", null, analysisChain.selectAnalysisChain(), MessageDialog.INFORMATION, new String[] {"OK"}, 0);
		dialog.open();		
		return true;
	}
}
