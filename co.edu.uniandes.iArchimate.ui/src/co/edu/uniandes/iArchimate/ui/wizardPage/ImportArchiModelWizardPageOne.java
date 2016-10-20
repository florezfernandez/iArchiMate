package co.edu.uniandes.iArchimate.ui.wizardPage;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.internal.wizards.datatransfer.DataTransferMessages;

import co.edu.uniandes.iArchimate.ui.dialog.SelectFromTreeDialog;


@SuppressWarnings("restriction")
public class ImportArchiModelWizardPageOne extends WizardPage implements Listener {

	private Label lblArchiFile;
	private Button btnArchiFileBrowser;
	private Label lblTargetPath;
	private Button btnTargetPathBrowser;
	
	private String searchPath;
	private IProject input;
	private SelectFromTreeDialog selectDialog;
	private Text txtTargetPath;
	private Text txtArchiFile;
	
	
	public ImportArchiModelWizardPageOne(String searchPath, IProject input) {
		super("wizardPage");
		setTitle("Select an Archi model and target path");
		this.searchPath = searchPath;
		this.input = input;
		this.selectDialog = new SelectFromTreeDialog();
		
	}

	public Text getTxtTargetPath() {
		return txtTargetPath;
	}

	public void setTxtTargetPath(Text txtTargetPath) {
		this.txtTargetPath = txtTargetPath;
	}

	public Text getTxtArchiFile() {
		return txtArchiFile;
	}

	public void setTxtArchiFile(Text txtArchiFile) {
		this.txtArchiFile = txtArchiFile;
	}

	@Override
	public void handleEvent(Event event) {
        if (event.widget == btnArchiFileBrowser) {
        	handleArchiFileBrowseButton();
		}else if (event.widget == btnTargetPathBrowser) {
        	handleTargetPathBrowseButton();
		}
        setPageComplete(this.isPageComplete());
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.numColumns = 3;
        composite.setLayout(layout);
		composite.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL | GridData.HORIZONTAL_ALIGN_FILL));
		composite.setSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		composite.setFont(parent.getFont());
		
        lblArchiFile = new Label(composite, SWT.NONE);
        lblArchiFile.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblArchiFile.setText("Archi File:");
        
        txtArchiFile = new Text(composite, SWT.BORDER);
        txtArchiFile.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        txtArchiFile.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) {
            	setPageComplete(isPageComplete());
            }
            public void keyReleased(KeyEvent e) { }
        });

        // source browse button
        btnArchiFileBrowser = new Button(composite, SWT.PUSH);
        btnArchiFileBrowser.setText(DataTransferMessages.DataTransfer_browse);
        btnArchiFileBrowser.addListener(SWT.Selection, this);
        btnArchiFileBrowser.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
        
        lblTargetPath = new Label(composite, SWT.NONE);
        lblTargetPath.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblTargetPath.setText("Target Path");
        
        txtTargetPath = new Text(composite, SWT.BORDER);
        txtTargetPath.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        txtTargetPath.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) {
            	setPageComplete(isPageComplete());
            }
            public void keyReleased(KeyEvent e) { }
        });
        
        btnTargetPathBrowser = new Button(composite, SWT.PUSH);
        btnTargetPathBrowser.setText(DataTransferMessages.DataTransfer_browse);
        btnTargetPathBrowser.addListener(SWT.Selection, this);
        btnTargetPathBrowser.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
        setControl(composite);
	}
	
	private void handleArchiFileBrowseButton(){
		try{
			String filePath = selectDialog.querySingleFileToImport("Project: " + this.input.getName(), "Select a Archi file with extension .archimate:", this.input);
			if( filePath != null)
				this.txtArchiFile.setText(filePath);			
		}catch(Exception e){
			MessageDialog dialog = new MessageDialog(null, "Import Archi", null, "This operation must be performed in one project", MessageDialog.ERROR, new String[] {"OK"}, 0);
			dialog.open();		
		}
	}

	private void handleTargetPathBrowseButton(){
		try {
			String filePath = selectDialog.querySingleFileToImport("Project: " + this.input.getName(), "Select a target path:", this.input);
			if( filePath != null)
				this.txtTargetPath.setText(filePath);			
		} catch (Exception e) {
			MessageDialog dialog = new MessageDialog(null, "Import Archi", null, "This operation must be performed in one project", MessageDialog.ERROR, new String[] {"OK"}, 0);			
			dialog.open();		
		}
	}
   
    @Override
    public boolean isPageComplete() {
    	return !this.txtArchiFile.getText().equals("") & !this.txtTargetPath.getText().equals("") & validate();
    }
    
    private boolean validate(){
    	setErrorMessage(null);
    	return this.validateArchiFile() && this.validateTargetPath();
    }
    private boolean validateArchiFile(){
    	String archiFilePath = this.txtArchiFile.getText();
    	String fileExtension = archiFilePath.substring(archiFilePath.lastIndexOf("/") + 1, archiFilePath.length());
    	if(!fileExtension.contains(".")){
    		setErrorMessage("You must select a file");
    	}else{
        	fileExtension = fileExtension.substring(fileExtension.lastIndexOf(".") + 1, fileExtension.length());
        	if (new File( this.searchPath + archiFilePath ).exists()) {
        		if(fileExtension.equals("archimate")){
        			return true;
        		}
        		setErrorMessage("Invalid extension.");
        	}else{
        		setErrorMessage(DataTransferMessages.FileImport_invalidSource);	
        	}    		
    	}    	
        return false;
    }

    private boolean validateTargetPath(){
    	setErrorMessage(null);
    	if(this.txtTargetPath.getText().contains(".")){
    		setErrorMessage("You must select a folder as target path");
    		return false;
    	}
    	return true;
    }
    

}
