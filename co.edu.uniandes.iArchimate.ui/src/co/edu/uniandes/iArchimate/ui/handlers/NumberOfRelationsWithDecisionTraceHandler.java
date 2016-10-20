package co.edu.uniandes.iArchimate.ui.handlers;

//import iModeler.diagram.part.IModelerDiagramEditor;

import java.util.ArrayList;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import co.edu.uniandes.iArchimate.utilities.emf.ModelUtilities;
import co.edu.uniandes.iArchimate.utilities.emf.ModelingUtilities;
import co.edu.uniandes.iArchimate.utilities.persistance.ModelLoader;

public class NumberOfRelationsWithDecisionTraceHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {

		try {			
			EPackage intermediateMetaModel = ModelLoader.loadMetaModel(URI.createURI(ModelingUtilities.EiMM_URI));
			EObject activeModel = ModelLoader.loadModel(ModelingUtilities.getModelPath(), intermediateMetaModel); 
			ArrayList<EObject> imperfectRelations = ModelUtilities.getImperfectRelations(activeModel);
			int imperfectContainmentWithDecisionTrace = ModelUtilities.numberOfImperfectContainmentRelationsWithDecisionTrace(intermediateMetaModel, activeModel);
			String message="Number of imperfect relations with desicion trace\n";
			message+="\tImperfect Containment Relations:\t"+imperfectRelations.size()+" \n\t\tWith Desicion Trace:\t\t"+imperfectContainmentWithDecisionTrace+"\n";
			IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			MessageDialog dialog = new MessageDialog(window.getShell(), "Number of Imperfect Relations with Desicion Trace", null, message, MessageDialog.INFORMATION, new String[] {"OK"}, 0);
			dialog.open();		
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return null;
	}
	
	
}

