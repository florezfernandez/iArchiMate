package co.edu.uniandes.iArchimate.utilities.emf;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

public class ModelingUtilities {
	public static String EiMM_URI="platform:/plugin/co.edu.uniandes.iArchimate/model/iArchimate.ecore";
	public static String ArchimateMM_URI="platform:/plugin/co.edu.uniandes.iArchimate/model/Archimate.ecore";
	public static String ArchiMM_URI="platform:/plugin/co.edu.uniandes.iArchimate/model/Archi.ecore";

	public static String MWE_EVL_RULES_URI="platform:/plugin/co.edu.uniandes.iArchimate.rulesGenerator/src/co/edu/uniandes/iArchimate/rulesGenerator/workflows/EVLRules.mwe";
	public static String EVL_RULES_URI="platform:/plugin/co.edu.uniandes.iArchimate.validation/rules/ontologicalRules.evl";
	//public static String TEMP_DOMAINMM_URI="platform:/plugin/co.edu.uniandes.enar.iModeler.rulesGenerator/temporalDomainMM/temp.ecore";
	
	public static String getModelDiagramPath(){
		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow window = wb.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		IEditorPart editor = page.getActiveEditor();
		IEditorInput input = editor.getEditorInput();
		FileEditorInput fileInput = (FileEditorInput) input;
		return fileInput.getPath().toString();
	}

	public static IEditorPart getModelEditorPart(){
		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow window = wb.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		return page.getActiveEditor();
	}

	public static void saveActiveDiagram(){
		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow window = wb.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		IEditorPart editor = page.getActiveEditor();
		page.saveEditor(editor, false);
		page.saveAllEditors(false);
	}

	public static String getWorkspaceAbsolutePath(){
		IWorkspace myWorkspace = ResourcesPlugin.getWorkspace(); 
		return myWorkspace.getRoot().getLocation().toString(); 		
	}
	
	
	
	public static String getProjectName(){
		IEditorPart  editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if(editorPart  != null){
			IFileEditorInput input = (IFileEditorInput)editorPart.getEditorInput();
			IFile file = input.getFile();
			IProject activeProject = file.getProject();
			return activeProject.getName();
		}else{
			return null;
		}				
	}

	public static String getActiveModelName(){
		String modelDiagramPath = ModelingUtilities.getModelDiagramPath();
		return  modelDiagramPath.substring(modelDiagramPath.lastIndexOf("/")+1, modelDiagramPath.lastIndexOf("."));
	}

	public static String getModelPath(){
		String modelDiagramPath = ModelingUtilities.getModelDiagramPath();
		String modelPath = modelDiagramPath.substring(0, modelDiagramPath.lastIndexOf("."));
		modelPath = modelPath.replace("/diagrams/", "/models/"); 
		return modelPath+".iarchimate";
	}

	public static String getRelativeModelPath(){
		String modelPath = ModelingUtilities.getModelPath();
		String projectName = ModelingUtilities.getProjectName();
		modelPath = modelPath.substring(modelPath.lastIndexOf(projectName), modelPath.length());
		return "/"+modelPath;
	}

	public static String getArchimateMetamodelAbsolutePath() throws MalformedURLException, IOException {
		URL url = FileLocator.toFileURL(new URL(ModelingUtilities.ArchimateMM_URI));
		return url.getPath();
	}
	
	public static String getAbsoluteWorkspacePath(){
		return ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
	}
	
	public static String getAbsolutProjectPath(){
		return ModelingUtilities.getWorkspaceAbsolutePath()+"/"+ModelingUtilities.getProjectName();		
	}

	public static IProject getCurrentSelectedProject(){
		IWorkspaceRoot workspace = ResourcesPlugin.getWorkspace().getRoot();
		return workspace.getProject(ModelingUtilities.getProjectName());
	}	

	
}
