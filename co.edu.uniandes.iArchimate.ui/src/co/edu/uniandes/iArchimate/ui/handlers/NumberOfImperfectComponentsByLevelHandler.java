package co.edu.uniandes.iArchimate.ui.handlers;

//import iModeler.diagram.part.IModelerDiagramEditor;

import java.util.ArrayList;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import co.edu.uniandes.iArchimate.utilities.emf.MetaModelUtilities;
import co.edu.uniandes.iArchimate.utilities.emf.ModelUtilities;
import co.edu.uniandes.iArchimate.utilities.emf.ModelingUtilities;
import co.edu.uniandes.iArchimate.utilities.persistance.ModelLoader;

public class NumberOfImperfectComponentsByLevelHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {

		try {			
			EPackage domainMetaModel = ModelLoader.loadMetaModel(ModelingUtilities.getArchimateMetamodelAbsolutePath());
			ArrayList<EClass> possibleRoots = MetaModelUtilities.findRootEClass(domainMetaModel);	  
//			if(possibleRoots.size()!=1){
//				IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
//				MessageDialog dialog = new MessageDialog(window.getShell(), "Number of Imperfect Components by Level", null, "The domain metamodel has more or less than one root EClass. Validate the domain metamodel.", MessageDialog.ERROR, new String[] {"OK"}, 0);
//				dialog.open();						
//				return null;
//			}
			EClass domainMetaModelRoot = possibleRoots.get(0);
			EPackage intermediateMetaModel = ModelLoader.loadMetaModel(URI.createURI(ModelingUtilities.EiMM_URI));
			EObject activeModel = ModelLoader.loadModel(ModelingUtilities.getModelPath(), intermediateMetaModel); 
			ArrayList<Integer> results = ModelUtilities.numberOfImperfectComponentsByLevel(intermediateMetaModel, domainMetaModel, domainMetaModelRoot, activeModel);
			String message="Number of imperfect components by level\n";
			for(int i=0; i<results.size(); i++){
				message+="\tLevel "+i+":\t"+results.get(i)+"\n";
			}
			IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			MessageDialog dialog = new MessageDialog(window.getShell(), "Number of Imperfect Components by Level", null, message, MessageDialog.INFORMATION, new String[] {"OK"}, 0);
			dialog.open();		
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return null;
	}	
} 