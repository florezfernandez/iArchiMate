package co.edu.uniandes.iArchimate.validation;

import iArchimate.diagram.part.ValidateAction;

import java.util.Collection;

import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocumentEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import co.edu.uniandes.iArchimate.ui.wizard.ChangeNameWizard;

public class OntologicalRulesValidationHelper {

	public String changeInstanceEClassName(Collection<String> validNames){		
		ChangeNameWizard wizard = new ChangeNameWizard(validNames, "Select a valid name for the Element");
	    WizardDialog dialog = new WizardDialog(null, wizard);
	    dialog.create();
	    dialog.getShell().setSize( Math.max(500, dialog.getShell().getSize().x) , 250 );

		try {
		    dialog.open();
		    String newName = wizard.getChangeInstanceNameWizardPage().getNewName();
		    return newName;	    
		} catch (Exception e) {
		    dialog.close();
			return null;
		}		
	}

	public String changeInstanceEAttributeName(Collection<String> validNames){		
		ChangeNameWizard wizard = new ChangeNameWizard(validNames, "Select a valid name for the Attribute");
	    WizardDialog dialog = new WizardDialog(null, wizard);
	    dialog.create();
	    dialog.getShell().setSize( Math.max(500, dialog.getShell().getSize().x) , 250 );

		try {
		    dialog.open();
		    String newName = wizard.getChangeInstanceNameWizardPage().getNewName();
		    return newName;	    
		} catch (Exception e) {
		    dialog.close();
			return null;
		}		
	}

	public String changeInstanceContEReferenceName(Collection<String> validNames, Collection<String> mmCrossERelationNames, String referenceName, String sourceClassName){
		ChangeNameWizard wizard = new ChangeNameWizard(validNames, "Select a valid name for the Containment Relation");
	    WizardDialog dialog = new WizardDialog(null, wizard);
	    dialog.create();
	    dialog.getShell().setSize( Math.max(500, dialog.getShell().getSize().x) , 250 );

		try {
		    dialog.open();
		    String newName = wizard.getChangeInstanceNameWizardPage().getNewName();
		    return newName;	    
		} catch (Exception e) {
		    dialog.close();
			return null;
		}		
	}
	
	public String changeInstanceCrossEReferenceName(Collection<String> validNames, Collection<String> mmCrossERelationNames, String referenceName, String sourceClassName){
		ChangeNameWizard wizard = new ChangeNameWizard(validNames, "Select a valid name for the Cross Relation");
	    WizardDialog dialog = new WizardDialog(null, wizard);
	    dialog.create();
	    dialog.getShell().setSize( Math.max(500, dialog.getShell().getSize().x) , 250 );

		try {
		    dialog.open();
		    String newName = wizard.getChangeInstanceNameWizardPage().getNewName();
		    return newName;	    
		} catch (Exception e) {
		    dialog.close();
			return null;
		}		
	}

	
	public void reValidate(){
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
	    IDocumentEditor ip= (IDocumentEditor)page.getActiveEditor();
	    IDocument doc = ip.getDocumentProvider().getDocument(page.getActiveEditor().getEditorInput());
	    ValidateAction.runValidation((View) doc.getContent());
	}

}
