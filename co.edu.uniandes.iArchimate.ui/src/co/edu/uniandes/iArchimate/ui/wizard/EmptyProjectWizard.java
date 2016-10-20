package co.edu.uniandes.iArchimate.ui.wizard;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

import co.edu.uniandes.iArchimate.ui.wizardPage.EmptyProjectWizardPageOne;

public class EmptyProjectWizard extends Wizard implements IWorkbenchWizard {
	private EmptyProjectWizardPageOne pageOne;

	public EmptyProjectWizard() {
		super();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.setWindowTitle("iArchiMate Empty Project");
		this.setNeedsProgressMonitor(true);
	}

	public void addPages() {
		pageOne = new EmptyProjectWizardPageOne();
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
	}
}
