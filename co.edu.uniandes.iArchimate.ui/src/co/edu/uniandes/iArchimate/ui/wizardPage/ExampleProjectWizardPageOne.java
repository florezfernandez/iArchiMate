package co.edu.uniandes.iArchimate.ui.wizardPage;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class ExampleProjectWizardPageOne extends WizardPage 
{
	private Text txtProjectName;	
	private Composite container;

	public ExampleProjectWizardPageOne() {
		super("wizardPage");
		setTitle("Create an iArchiMate Project");
		setDescription("This wizard creates a new iArchiMate project");
	}

	@Override
	public void createControl(Composite parent) {
		this.container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		this.container.setLayout(layout);
		layout.numColumns = 2;
		layout.verticalSpacing = 10;		
		Label label = new Label(container, SWT.NULL);
		label.setText("&Project Name");
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		this.txtProjectName = new Text(container, SWT.BORDER | SWT.SINGLE);
		this.txtProjectName.setText("");
		this.txtProjectName.setLayoutData(gridData);
		this.txtProjectName.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		dialogChanged();
		setControl(container);
	}

	private void dialogChanged() {
		String projectName = getProjectName();		
		if(projectName.trim().equals("")) {
			setErrorMessage("The Project must have a name");
			setPageComplete(false);
			return;
		}else if(projectName.trim().endsWith(".")) {
			setErrorMessage("The Project must have a valid name");
			setPageComplete(false);
			return;
		}else if(existInvalidCharacters(projectName)) {
			setErrorMessage("The Project name can not contain next characters: , / | ! \" # $ % & / ( ) = + * { } [ ]");
			setPageComplete(false);
			return;
		}		
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for(IProject p : projects) {
			if(p.getName().equals(projectName.trim())) {
				setErrorMessage("A Project with the specified name already exists");
				setPageComplete(false);
				return;
			}
		}
		setErrorMessage(null);
		setPageComplete(true);
	}
	
	public boolean existInvalidCharacters(String stream){
		String characters [] = {",","/","|","!","\"","#","$","%","&","/","(",")","=","+","*","{","}","[","]"};
		for(int i=0; i<characters.length; i++){
			if(stream.contains(characters[i])){
				return true;
			}
		}
		return false;		
	}
	
	public String getProjectName() {
		return txtProjectName.getText();
	}	
}
