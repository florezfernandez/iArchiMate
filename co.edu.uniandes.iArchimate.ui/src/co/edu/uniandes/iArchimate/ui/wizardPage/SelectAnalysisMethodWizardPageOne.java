package co.edu.uniandes.iArchimate.ui.wizardPage;

import java.util.Arrays;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TreeItem;

import co.edu.uniandes.iArchimate.analysis.AdditionalAttribute;
import co.edu.uniandes.iArchimate.analysis.AdditionalRelation;
import co.edu.uniandes.iArchimate.analysis.AffectedConcept;
import co.edu.uniandes.iArchimate.analysis.methods.AnalysisMethod;
import co.edu.uniandes.iArchimate.analysis.methods.AnalysisMethodHelper;
import co.edu.uniandes.iArchimate.analysis.methods.ApplicationComponentAvailability;
import co.edu.uniandes.iArchimate.analysis.methods.ApplicationComponentImportanceLevel;
import co.edu.uniandes.iArchimate.analysis.methods.BusinessProcessFaultSusceptibility;
import co.edu.uniandes.iArchimate.analysis.methods.BusinessProcessParticipants;
import co.edu.uniandes.iArchimate.analysis.methods.DeviceStorageAvailability;
import co.edu.uniandes.iArchimate.analysis.methods.ModelImpactOfRemovingElements;
import co.edu.uniandes.iArchimate.analysis.methods.RequirementImpactOverDevice;
import co.edu.uniandes.iArchimate.analysis.methods.RequirementImpactOverITElements;

import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.Text;


public class SelectAnalysisMethodWizardPageOne extends WizardPage{

	private Label lblConcept;
	private Label lblAnalysisMethod;
	
	private Combo cboxConcept;
	private Combo cboxAnalysisMethod;
	private Label lblDetails;
	private ScrolledComposite scrolledComposite;
	private Tree tree;
	private Label lblDescription;
	private Text txtDescription;
	
	
	public SelectAnalysisMethodWizardPageOne() {
		super("wizardPage");
		setTitle("Select Analysis Method");
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.numColumns = 2;
        composite.setLayout(layout);
		composite.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL | GridData.HORIZONTAL_ALIGN_FILL));
		composite.setSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		composite.setFont(parent.getFont());
		
        lblConcept = new Label(composite, SWT.NONE);
        lblConcept.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblConcept.setText("Concept:");
        
        cboxConcept = new Combo(composite, SWT.NONE);
        cboxConcept.addModifyListener(new ModifyListener() {
        	public void modifyText(ModifyEvent e) {
        		loadAnalysisMethods();
        	}
        });
        cboxConcept.setItems(AnalysisMethodHelper.CONCEPTS);
        cboxConcept.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        
        lblAnalysisMethod = new Label(composite, SWT.NONE);
        lblAnalysisMethod.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblAnalysisMethod.setText("Analysis Method:");
        setControl(composite);
        
        cboxAnalysisMethod = new Combo(composite, SWT.NONE);
        cboxAnalysisMethod.addModifyListener(new ModifyListener() {
        	public void modifyText(ModifyEvent e) {
        		loadAnalysisMethodDetails();
        	}
        });
        cboxAnalysisMethod.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        
        lblDescription = new Label(composite, SWT.NONE);
        lblDescription.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblDescription.setText("Description");
        
        txtDescription = new Text(composite, SWT.MULTI | SWT.WRAP | SWT.BORDER | SWT.V_SCROLL);
        txtDescription.setEditable(false);
        txtDescription.setText("Description");
        GridData gd_txtDescription = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
        gd_txtDescription.heightHint = 60;
        txtDescription.setLayoutData(gd_txtDescription);
        new Label(composite, SWT.NONE);
        
        lblDetails = new Label(composite, SWT.NONE);
        lblDetails.setText("Required Attributes and Relations");
        new Label(composite, SWT.NONE);
        
        scrolledComposite = new ScrolledComposite(composite, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
        GridData gd_scrolledComposite = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
        scrolledComposite.setLayoutData(gd_scrolledComposite);
        scrolledComposite.setExpandHorizontal(true);
        scrolledComposite.setExpandVertical(true);
        
        tree = new Tree(scrolledComposite, SWT.BORDER | SWT.WRAP);
        tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        scrolledComposite.setContent(tree);
	}
	
   
    protected void loadAnalysisMethodDetails() {
		setPageComplete(false);
    	if(this.validateAnalysisMethodSelection()){
    		this.tree.removeAll();
    		AnalysisMethod analysisMethod=null;
    		if(this.cboxConcept.getText().equals(AnalysisMethodHelper.MODEL) && this.cboxAnalysisMethod.getText().equals(AnalysisMethodHelper.IMPACT_OF_REMOVING_ELEMENTS)){
    			analysisMethod = new ModelImpactOfRemovingElements();    			
    		}else if(this.cboxConcept.getText().equals(AnalysisMethodHelper.APPLICATION_COMPONENT) && this.cboxAnalysisMethod.getText().equals(AnalysisMethodHelper.AVAILABILITY)){
    			analysisMethod = new ApplicationComponentAvailability();    			
    		}else if(this.cboxConcept.getText().equals(AnalysisMethodHelper.APPLICATION_COMPONENT) && this.cboxAnalysisMethod.getText().equals(AnalysisMethodHelper.IMPORTANCE_LEVEL)){
        		analysisMethod = new ApplicationComponentImportanceLevel();    			
    		}else if(this.cboxConcept.getText().equals(AnalysisMethodHelper.BUSINESS_PROCESS) && this.cboxAnalysisMethod.getText().equals(AnalysisMethodHelper.FAULT_SUSCEPTIBILITY)){
    			analysisMethod = new BusinessProcessFaultSusceptibility();
    		}else if(this.cboxConcept.getText().equals(AnalysisMethodHelper.BUSINESS_PROCESS) && this.cboxAnalysisMethod.getText().equals(AnalysisMethodHelper.PARTICIPATS)){
    			analysisMethod = new BusinessProcessParticipants();
    		}else if(this.cboxConcept.getText().equals(AnalysisMethodHelper.DEVICE) && this.cboxAnalysisMethod.getText().equals(AnalysisMethodHelper.STORAGE_AVAILABILITY)){
    			analysisMethod = new DeviceStorageAvailability();    			
    		}else if(this.cboxConcept.getText().equals(AnalysisMethodHelper.REQUIREMENT) && this.cboxAnalysisMethod.getText().equals(AnalysisMethodHelper.IMPACT_OVER_DEVICE)){
    			analysisMethod = new RequirementImpactOverDevice();    			
    		}else if(this.cboxConcept.getText().equals(AnalysisMethodHelper.REQUIREMENT) && this.cboxAnalysisMethod.getText().equals(AnalysisMethodHelper.IMPACT_OVER_IT_ELEMENTS)){
    			analysisMethod = new RequirementImpactOverITElements();    			
    		}
    		if(analysisMethod!=null){
    			analysisMethod.initAffectedConcepts();
    			this.txtDescription.setText(analysisMethod.getDescription());
    			this.setMessage(analysisMethod.getConcept()+": "+analysisMethod.getAnalysisMethod());
    			TreeItem treeItemConcept;
    			for(AffectedConcept affectedConcept : analysisMethod.getAffectedConcepts()){
    				treeItemConcept = new TreeItem(this.tree, SWT.NULL);
    				treeItemConcept.setText(affectedConcept.getTypeName());
    				TreeItem treeItemAttribute;
    				for(AdditionalAttribute additionalAttribute : affectedConcept.getAdditionalAttributes()){
    					treeItemAttribute = new TreeItem(treeItemConcept, SWT.NULL);
    					treeItemAttribute.setText("Attribute = " + additionalAttribute.getName() + ":" + additionalAttribute.getType()+" ("+additionalAttribute.getCalculated()+")");    					
    				}
    				TreeItem treeItemRelation;
    				for(AdditionalRelation additionalRelation : affectedConcept.getAdditionalRelations()){
    					treeItemRelation = new TreeItem(treeItemConcept, SWT.NULL);
    					treeItemRelation.setText("Relation = " + additionalRelation.getName() + ":" + additionalRelation.getType() + ". Target: "+additionalRelation.getTarget());    					
    				}
    				treeItemConcept.setExpanded(true);
    			}	
    		}    		
    		setPageComplete(true);
    	}		
	}

	protected void loadAnalysisMethods() {
		setPageComplete(true);
		if(this.tree!=null){
			this.tree.removeAll();
		}
		if(this.validateConceptSelection()){
    		this.cboxAnalysisMethod.setItems(AnalysisMethodHelper.ANALYSIS_METHODS[this.cboxConcept.getSelectionIndex()]);
    	}
	}

	@Override
    public boolean isPageComplete() {
		return this.validateConceptSelection() && validateAnalysisMethodSelection();
	}
    
	private boolean validateConceptSelection(){
		this.setErrorMessage(null);
    	if(!Arrays.asList(this.cboxConcept.getItems()).contains(this.cboxConcept.getText())){
    		this.setErrorMessage("Invalid selected concept");
    		return false;
    	}
    	return true;
	}

	private boolean validateAnalysisMethodSelection(){
		this.setErrorMessage(null);
    	if(!Arrays.asList(this.cboxAnalysisMethod.getItems()).contains(this.cboxAnalysisMethod.getText())){
    		this.setErrorMessage("Invalid selected analysis method");
    		return false;
    	}
    	return true;
	}
	
	public String getConcept(){
		return this.cboxConcept.getText();
	}

	public String getAnalysisMethod(){
		return this.cboxAnalysisMethod.getText();
	}

}
