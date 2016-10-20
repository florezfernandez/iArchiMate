package co.edu.uniandes.iArchimate.ui.handlers;

import java.util.ArrayList;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import co.edu.uniandes.iArchimate.analysis.AnalysisMethodReport;
import co.edu.uniandes.iArchimate.analysis.methods.AnalysisMethod;
import co.edu.uniandes.iArchimate.analysis.methods.AnalysisMethodHelper;
import co.edu.uniandes.iArchimate.analysis.methods.ApplicationComponentAvailability;
import co.edu.uniandes.iArchimate.analysis.methods.BusinessProcessFaultSusceptibility;
import co.edu.uniandes.iArchimate.analysis.methods.BusinessRoleParticipationInBusinessProcess;
import co.edu.uniandes.iArchimate.analysis.methods.RequirementImpactOverDevice;
import co.edu.uniandes.iArchimate.ui.view.AnalysisResultViewLauncher;

public class PerformAnalysisChainHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		String numberOfAnalysisMethods = AnalysisMethodHelper.loadAnalysisProperty("numberOfAnalysisMethods");
		String message="";
		String title="";
		AnalysisMethod analysisMethod=null;
		if(numberOfAnalysisMethods!=null){
			int numOfAnalysisMethods=Integer.parseInt(numberOfAnalysisMethods);
			String []attributes=new String[numOfAnalysisMethods*2];
			for(int i=0; i<numOfAnalysisMethods; i++){
				attributes[2*i]="concept"+i;
				attributes[(2*i)+1]="analysisMethod"+i;				
			}
			String[] selectedAnalysisMethod = AnalysisMethodHelper.loadAnalysisProperties(attributes);			
			ArrayList<AnalysisMethodReport> analysisMethodReports = new ArrayList<AnalysisMethodReport>();
			AnalysisMethodReport analysisMethodReport = new AnalysisMethodReport(new String[]{"Element Name","Element Type","Attribute Name","Value","Associated Elements","Action"});
			String elementType="";
			String attributeAnalyzed="";
			for(int i=0; i<numOfAnalysisMethods; i++){
				if(selectedAnalysisMethod[2*i].equals(AnalysisMethodHelper.APPLICATION_COMPONENT) && selectedAnalysisMethod[(2*i)+1].equals(AnalysisMethodHelper.AVAILABILITY)){
					analysisMethod = new ApplicationComponentAvailability();
					title += "Concept: "+AnalysisMethodHelper.APPLICATION_COMPONENT+". Method: "+AnalysisMethodHelper.AVAILABILITY;
					elementType=AnalysisMethodHelper.APPLICATION_COMPONENT;
					attributeAnalyzed="Availability";
				}else if(selectedAnalysisMethod[2*i].equals(AnalysisMethodHelper.BUSINESS_PROCESS) && selectedAnalysisMethod[(2*i)+1].equals(AnalysisMethodHelper.FAULT_SUSCEPTIBILITY)){
					analysisMethod = new BusinessProcessFaultSusceptibility();
					title = "Concept: "+AnalysisMethodHelper.BUSINESS_PROCESS+". Method: "+AnalysisMethodHelper.FAULT_SUSCEPTIBILITY;
					elementType=AnalysisMethodHelper.BUSINESS_PROCESS;
					attributeAnalyzed="FaultSusceptibility";
				}else if(selectedAnalysisMethod[2*i].equals(AnalysisMethodHelper.BUSINESS_ROLE) && selectedAnalysisMethod[(2*i)+1].equals(AnalysisMethodHelper.PARTICIPATION_IN_BUSINESS_PROCESS)){
					analysisMethod = new BusinessRoleParticipationInBusinessProcess();
					title = "Concept: "+AnalysisMethodHelper.BUSINESS_ROLE+". Method: "+AnalysisMethodHelper.PARTICIPATION_IN_BUSINESS_PROCESS;
					elementType=AnalysisMethodHelper.BUSINESS_ROLE;
					attributeAnalyzed="";
				}else if(selectedAnalysisMethod[2*i].equals(AnalysisMethodHelper.REQUIREMENT) && selectedAnalysisMethod[(2*i)+1].equals(AnalysisMethodHelper.IMPACT_OVER_DEVICE)){
					analysisMethod = new RequirementImpactOverDevice();
					title = "Concept: "+AnalysisMethodHelper.REQUIREMENT+". Method: "+AnalysisMethodHelper.IMPACT_OVER_DEVICE;
					elementType=AnalysisMethodHelper.REQUIREMENT;
					attributeAnalyzed="";
				}else{
					message="Error loading the analysis chain. Please, select one analysis chain again";
					break;
				}
				message+=analysisMethod.performAnalysisMethod()+"\n";
				analysisMethodReports.add(analysisMethod.getAnalysisMethodReport());

				for(String []registry : analysisMethod.getAnalysisMethodReport().getRegistries()){
					String []newRegistry = new String[6];
					newRegistry[0]=registry[0]; 
					newRegistry[1]=elementType;
					newRegistry[2]=attributeAnalyzed;
					newRegistry[3]=registry[1];
					newRegistry[4]=registry[2];
					newRegistry[5]=registry[3];
					analysisMethodReport.addRegistry(newRegistry);
				}
			}
			AnalysisResultViewLauncher.launchView(title, analysisMethodReport);
		}else{
			message="No analysis chain selected. Please, select one analysis method";
		}
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog dialog = new MessageDialog(window.getShell(), "Result of performing analysis method", null, message, MessageDialog.INFORMATION, new String[] {"OK"}, 0);
		dialog.open();		
		return null;
	}


	public Object execute2(ExecutionEvent event) throws ExecutionException {
		String numberOfAnalysisMethods = AnalysisMethodHelper.loadAnalysisProperty("numberOfAnalysisMethods");
		String message="";
		if(numberOfAnalysisMethods==null){
			String []attributes={"concept","analysisMethod"};
			String[] selectedAnalysisMethod = AnalysisMethodHelper.loadAnalysisProperties(attributes);			
			String title="";
			AnalysisMethod analysisMethod=null;
			if(!selectedAnalysisMethod[0].equals("null") && !selectedAnalysisMethod[1].equals("null")){
				if(selectedAnalysisMethod[0].equals(AnalysisMethodHelper.APPLICATION_COMPONENT) && selectedAnalysisMethod[1].equals(AnalysisMethodHelper.AVAILABILITY)){
					analysisMethod = new ApplicationComponentAvailability();
					title = "Concept: "+AnalysisMethodHelper.APPLICATION_COMPONENT+". Method: "+AnalysisMethodHelper.AVAILABILITY;
				}else if(selectedAnalysisMethod[0].equals(AnalysisMethodHelper.BUSINESS_PROCESS) && selectedAnalysisMethod[1].equals(AnalysisMethodHelper.FAULT_SUSCEPTIBILITY)){
					analysisMethod = new BusinessProcessFaultSusceptibility();
					title = "Concept: "+AnalysisMethodHelper.BUSINESS_PROCESS+". Method: "+AnalysisMethodHelper.FAULT_SUSCEPTIBILITY;
				}else if(selectedAnalysisMethod[0].equals(AnalysisMethodHelper.BUSINESS_ROLE) && selectedAnalysisMethod[1].equals(AnalysisMethodHelper.PARTICIPATION_IN_BUSINESS_PROCESS)){
					analysisMethod = new BusinessRoleParticipationInBusinessProcess();
					title = "Concept: "+AnalysisMethodHelper.BUSINESS_ROLE+". Method: "+AnalysisMethodHelper.PARTICIPATION_IN_BUSINESS_PROCESS;
				}else if(selectedAnalysisMethod[0].equals(AnalysisMethodHelper.REQUIREMENT) && selectedAnalysisMethod[1].equals(AnalysisMethodHelper.IMPACT_OVER_DEVICE)){
					analysisMethod = new RequirementImpactOverDevice();
					title = "Concept: "+AnalysisMethodHelper.REQUIREMENT+". Method: "+AnalysisMethodHelper.IMPACT_OVER_DEVICE;
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
