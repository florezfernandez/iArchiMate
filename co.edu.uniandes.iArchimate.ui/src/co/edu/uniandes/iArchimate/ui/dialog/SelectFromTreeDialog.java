package co.edu.uniandes.iArchimate.ui.dialog;

import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

public class SelectFromTreeDialog{

	public String querySingleFileToImport( String title, String message, Object inputPath){
    	
    	ElementTreeSelectionDialog dialog1 = new ElementTreeSelectionDialog(null, new WorkbenchLabelProvider(), new BaseWorkbenchContentProvider());
    	dialog1.setTitle(title);
    	dialog1.setAllowMultiple(false);
    	dialog1.setMessage(message);
    	dialog1.setInput(inputPath);
    	dialog1.setSize(30, 10);
    	dialog1.open();
    	    	
    	String filePath = null;
    	
    	if(dialog1.getFirstResult() != null){ 
    		filePath = dialog1.getFirstResult().toString();
    		filePath = filePath.substring( filePath.indexOf("/") );
    	}

    	return filePath;
    }
	
	public String querySelectDirectory(String text , String message){
	    Shell shell = new Shell();
	    shell.setSize(30,10);
		DirectoryDialog dialog = new DirectoryDialog(shell);
		dialog.setText(text);
        dialog.setMessage("Select a directory");        
        String dir = dialog.open();	// null if user cancels
        return dir;
	}	
	
}
