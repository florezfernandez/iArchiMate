package co.edu.uniandes.iArchimate.ui.wizard;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

import co.edu.uniandes.iArchimate.ui.wizardPage.ExampleProjectWizardPageOne;

public class ExampleProjectWizard extends Wizard implements IWorkbenchWizard {
	private ExampleProjectWizardPageOne pageOne;

	public ExampleProjectWizard() {
		super();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.setWindowTitle("New iArchiMate Project");
		this.setNeedsProgressMonitor(true);
	}

	public void addPages() {
		pageOne = new ExampleProjectWizardPageOne();
		addPage(pageOne);
	}

	@Override
	public boolean performFinish() {
		final String projectName = this.pageOne.getProjectName();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(projectName, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} catch (IOException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};		
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}

	private void doFinish(String projectName, IProgressMonitor monitor) throws CoreException, IOException  {
		monitor.beginTask("Creating iArchiMate Project" + projectName, 1);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		createIArchimateProject(projectName, root, monitor);
	}

	private void createIArchimateProject(String projectName, IWorkspaceRoot root, IProgressMonitor monitor) throws CoreException, IOException {
		IProject projectContainer = root.getProject(projectName);
		projectContainer.create(monitor);
		projectContainer.open(monitor);		
		IProjectDescription projDescr = projectContainer.getDescription();
//		projDescr.setNatureIds(new String[]{JavaCore.NATURE_ID});
//		ICommand com = projDescr.newCommand();
//		com.setBuilderName("org.eclipse.jdt.core.javabuilder");
//		projDescr.setBuildSpec(new ICommand[]{com});
		projectContainer.setDescription(projDescr, monitor);

		IFolder folder;
		folder = projectContainer.getFolder(new Path("views"));
		folder.create(true, true, monitor);		
		folder = projectContainer.getFolder(new Path("views/models"));
		folder.create(true, true, monitor);		
		folder = projectContainer.getFolder(new Path("views/diagrams"));
		folder.create(true, true, monitor);		

//		IJavaProject iModelerProject = JavaCore.create(projectContainer);
//		Path jrePath = new Path("org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.6");
//		IClasspathEntry jreEntry [] = {JavaCore.newContainerEntry(JavaCore.newContainerEntry(jrePath).getPath())};
//		iModelerProject.setRawClasspath(jreEntry, null);		
		final URL url = FileLocator.toFileURL(new URL("platform:/plugin/co.edu.uniandes.iArchimate.ui/exampleModels/models"));
		File exampleFolder = new File(url.getPath());
		File[] files = exampleFolder.listFiles();		
		for(File file : files){
			this.createFileIntoProject(projectContainer.getFile(new Path("/views/models/"+file.getName())), monitor, fileContentStream("platform:/plugin/co.edu.uniandes.iArchimate.ui/exampleModels/models/"+file.getName()));		
			this.createFileIntoProject(projectContainer.getFile(new Path("/views/diagrams/"+file.getName()+"_diagram")), monitor, fileContentStream("platform:/plugin/co.edu.uniandes.iArchimate.ui/exampleModels/diagrams/"+file.getName()+"_diagram"));	
		}
		
	}

	private void createFileIntoProject(IFile file, IProgressMonitor monitor, InputStream stream) throws CoreException{
		try {
			if (file.exists()) {
				file.setContents(stream, true, true, monitor);
			} else {
				file.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
//	private InputStream propertiesContentStream() {
//		Date date=new Date();
//		String contents = "#\n" +
//				"#" + date.toString() + " \n" + 
//				"domainMetamodel=metamodels\\example.ecore";
//		return new ByteArrayInputStream(contents.getBytes());	
//	}

	private InputStream fileContentStream(String pluginPath) throws IOException {
		final URL url = FileLocator.toFileURL(new URL(pluginPath));
		String path = url.getPath();
		BufferedReader br = new BufferedReader(new FileReader(path));
		String line;
		String contents="";
		while((line=br.readLine())!=null){
			contents+=line+"\n";
		}
		br.close();
		return new ByteArrayInputStream(contents.getBytes());	
	}

//	public void loadProperties(){  
//		props = new Properties();
//		try {
//			final URL url = FileLocator.toFileURL(new URL(propertiesPath));
//			String path = url.getPath();
//			props.load(new FileInputStream(path));
//		} catch (IOException ex) {
//			System.out.println("Error: "+ex);
//		}  
//	}

}
