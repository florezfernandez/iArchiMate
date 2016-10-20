package co.edu.uniandes.iArchimate.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import co.edu.uniandes.iArchimate.analysis.methods.AnalysisMethodHelper;

public class SelectedAnalysisMethodHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		String numberOfAnalysisMethods = AnalysisMethodHelper.loadAnalysisProperty("numberOfAnalysisMethods");
		String message="";
		if(numberOfAnalysisMethods==null){
			String []attributes={"concept","analysisMethod"};
			String[] selectedAnalysisMethod = AnalysisMethodHelper.loadAnalysisProperties(attributes);			
			if(!selectedAnalysisMethod[0].equals("null")){
				message+="ANALYSIS METHOD\n";
				message+=" - Concept: "+selectedAnalysisMethod[0]+"\n - Analysis Method: "+selectedAnalysisMethod[1];
			}else{
				message="Not Selected Analysis method";
			}
		}else{
			int numOfAnalysisMethods=Integer.parseInt(numberOfAnalysisMethods);
			String []attributes=new String[numOfAnalysisMethods*2];
			for(int i=0; i<numOfAnalysisMethods; i++){
				attributes[2*i]="concept"+i;
				attributes[(2*i)+1]="analysisMethod"+i;				
			}
			String[] selectedAnalysisMethod = AnalysisMethodHelper.loadAnalysisProperties(attributes);			
			message+="ANALYSIS CHAIN\n";
			for(int i=0; i<numOfAnalysisMethods; i++){
				message+=" - ANALYSIS METHOD "+(i+1)+"\n";
				message+="   - Concept: "+selectedAnalysisMethod[2*i]+"\n   - Analysis Method: "+selectedAnalysisMethod[(2*i)+1]+"\n";
			}
		}
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog dialog = new MessageDialog(window.getShell(), "Selected analysis method", null, message, MessageDialog.INFORMATION, new String[] {"OK"}, 0);
		dialog.open();		
		return null;
	}
}
