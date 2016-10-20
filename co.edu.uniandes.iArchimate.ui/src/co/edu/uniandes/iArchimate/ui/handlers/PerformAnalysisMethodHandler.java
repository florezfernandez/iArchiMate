package co.edu.uniandes.iArchimate.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

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
import co.edu.uniandes.iArchimate.ui.view.AnalysisResultViewLauncher;

public class PerformAnalysisMethodHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		String numberOfAnalysisMethods = AnalysisMethodHelper.loadAnalysisProperty("numberOfAnalysisMethods");
		String message="";
		if(numberOfAnalysisMethods==null){
			String []attributes={"concept","analysisMethod"};
			String[] selectedAnalysisMethod = AnalysisMethodHelper.loadAnalysisProperties(attributes);			
			String title="";
			AnalysisMethod analysisMethod=null;
			if(!selectedAnalysisMethod[0].equals("null") && !selectedAnalysisMethod[1].equals("null")){
				title = "Concept: "+selectedAnalysisMethod[0]+". Method: "+selectedAnalysisMethod[1];
				if(selectedAnalysisMethod[0].equals(AnalysisMethodHelper.MODEL) && selectedAnalysisMethod[1].equals(AnalysisMethodHelper.IMPACT_OF_REMOVING_ELEMENTS)){
					analysisMethod = new ModelImpactOfRemovingElements();
				}else if(selectedAnalysisMethod[0].equals(AnalysisMethodHelper.APPLICATION_COMPONENT) && selectedAnalysisMethod[1].equals(AnalysisMethodHelper.AVAILABILITY)){
					analysisMethod = new ApplicationComponentAvailability();
				}else if(selectedAnalysisMethod[0].equals(AnalysisMethodHelper.APPLICATION_COMPONENT) && selectedAnalysisMethod[1].equals(AnalysisMethodHelper.IMPORTANCE_LEVEL)){
					analysisMethod = new ApplicationComponentImportanceLevel();
				}else if(selectedAnalysisMethod[0].equals(AnalysisMethodHelper.BUSINESS_PROCESS) && selectedAnalysisMethod[1].equals(AnalysisMethodHelper.FAULT_SUSCEPTIBILITY)){
					analysisMethod = new BusinessProcessFaultSusceptibility();
				}else if(selectedAnalysisMethod[0].equals(AnalysisMethodHelper.BUSINESS_PROCESS) && selectedAnalysisMethod[1].equals(AnalysisMethodHelper.PARTICIPATS)){
					analysisMethod = new BusinessProcessParticipants();
				}else if(selectedAnalysisMethod[0].equals(AnalysisMethodHelper.BUSINESS_ROLE) && selectedAnalysisMethod[1].equals(AnalysisMethodHelper.PARTICIPATION_IN_BUSINESS_PROCESS)){
					analysisMethod = new BusinessRoleParticipationInBusinessProcess();
				}else if(selectedAnalysisMethod[0].equals(AnalysisMethodHelper.DEVICE) && selectedAnalysisMethod[1].equals(AnalysisMethodHelper.STORAGE_AVAILABILITY)){
					analysisMethod = new DeviceStorageAvailability();
				}else if(selectedAnalysisMethod[0].equals(AnalysisMethodHelper.REQUIREMENT) && selectedAnalysisMethod[1].equals(AnalysisMethodHelper.IMPACT_OVER_IT_ELEMENTS)){
					analysisMethod = new RequirementImpactOverITElements();
				}			
				if (analysisMethod!=null){
					message=analysisMethod.performAnalysisMethod();
					AnalysisResultViewLauncher.launchView(title, analysisMethod.getAnalysisMethodReport());
				}else{
					message="Error loading the analysis method. Please, select one analysis method again";
				}
			}else{
				message="No analysis method selected. Please, select one analysis method";
			}
		}else{
			message="Analysis chain selected. Please, select one analysis method";
		}
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog dialog = new MessageDialog(window.getShell(), "Result of performing analysis method", null, message, MessageDialog.INFORMATION, new String[] {"OK"}, 0);
		dialog.open();		
		return null;
	}
}
