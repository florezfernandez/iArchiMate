package co.edu.uniandes.iArchimate.ui.wizardPage;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

import co.edu.uniandes.iArchimate.analysis.AdditionalAttribute;
import co.edu.uniandes.iArchimate.analysis.AdditionalRelation;
import co.edu.uniandes.iArchimate.analysis.AffectedConcept;
import co.edu.uniandes.iArchimate.analysis.methods.AnalysisMethod;
import co.edu.uniandes.iArchimate.analysis.methods.AnalysisMethodHelper;
import co.edu.uniandes.iArchimate.analysis.methods.ApplicationComponentAvailability;
import co.edu.uniandes.iArchimate.analysis.methods.BusinessProcessFaultSusceptibility;
import co.edu.uniandes.iArchimate.analysis.methods.RequirementImpactOverDevice;

import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;


public class SelectAnalysisChainWizardPageOne extends WizardPage{

	private Label lblEnabledAnalysisMethods;
	private Label lblSelectedAnalysisMethods;
	private Label lblDetails;
	private ScrolledComposite scrolledComposite;
	private Tree tree;
	private Composite compositeSelection;
	private Composite compositeRequirements;
	private Composite compositeButtons;
	private Button btnUnselect;
	private List listEnabledAnalysisMethods;
	private List listSelectedAnalysisMethods;


	public SelectAnalysisChainWizardPageOne() {
		super("wizardPage");
		setTitle("Select Analysis Methods for the Analysis Chain");
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);
		composite.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL | GridData.HORIZONTAL_ALIGN_FILL));
		composite.setSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		composite.setFont(parent.getFont());
		setControl(composite);

		compositeSelection = new Composite(composite, SWT.NONE);
		compositeSelection.setLayout(new GridLayout(3, false));
		GridData gd_compositeSelection = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_compositeSelection.heightHint = 150;
		gd_compositeSelection.widthHint = 600;
		compositeSelection.setLayoutData(gd_compositeSelection);

		lblEnabledAnalysisMethods = new Label(compositeSelection, SWT.NONE);
		lblEnabledAnalysisMethods.setText("Enabled Analysis Methods");
		new Label(compositeSelection, SWT.NONE);

		lblSelectedAnalysisMethods = new Label(compositeSelection, SWT.NONE);
		lblSelectedAnalysisMethods.setText("Selected Analysis Methods");

		ScrolledComposite scrolledCompositeEnabledAnalysisMethods = new ScrolledComposite(compositeSelection, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		GridData gd_scrolledCompositeEnabledAnalysisMethods = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_scrolledCompositeEnabledAnalysisMethods.heightHint = 100;
		gd_scrolledCompositeEnabledAnalysisMethods.widthHint = 250;
		scrolledCompositeEnabledAnalysisMethods.setLayoutData(gd_scrolledCompositeEnabledAnalysisMethods);
		scrolledCompositeEnabledAnalysisMethods.setExpandHorizontal(true);
		scrolledCompositeEnabledAnalysisMethods.setExpandVertical(true);

		listEnabledAnalysisMethods = new List(scrolledCompositeEnabledAnalysisMethods, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		scrolledCompositeEnabledAnalysisMethods.setContent(listEnabledAnalysisMethods);
		scrolledCompositeEnabledAnalysisMethods.setMinSize(listEnabledAnalysisMethods.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		listEnabledAnalysisMethods.setItems(AnalysisMethodHelper.CONCEPTS_PLUS_ANALYSIS_METHODS);

		compositeButtons = new Composite(compositeSelection, SWT.NONE);
		compositeButtons.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		compositeButtons.setLayout(new GridLayout(1, false));

		Button btnSelect = new Button(compositeButtons, SWT.NONE);
		btnSelect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				selectAnalysisMethod();
			}
		});
		btnSelect.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		btnSelect.setText(">");

		btnUnselect = new Button(compositeButtons, SWT.NONE);
		btnUnselect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				unselectAnalysisMethod();
			}
		});
		btnUnselect.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		btnUnselect.setText("<");

		ScrolledComposite scrolledCompositeSelectedAnalysisMethods = new ScrolledComposite(compositeSelection, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		GridData gd_scrolledCompositeSelectedAnalysisMethods = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_scrolledCompositeSelectedAnalysisMethods.heightHint = 100;
		gd_scrolledCompositeSelectedAnalysisMethods.widthHint = 250;
		scrolledCompositeSelectedAnalysisMethods.setLayoutData(gd_scrolledCompositeSelectedAnalysisMethods);
		scrolledCompositeSelectedAnalysisMethods.setExpandHorizontal(true);
		scrolledCompositeSelectedAnalysisMethods.setExpandVertical(true);

		listSelectedAnalysisMethods = new List(scrolledCompositeSelectedAnalysisMethods, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledCompositeSelectedAnalysisMethods.setContent(listSelectedAnalysisMethods);
		scrolledCompositeSelectedAnalysisMethods.setMinSize(listSelectedAnalysisMethods.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		compositeRequirements = new Composite(composite, SWT.NONE);
		compositeRequirements.setLayout(new GridLayout(1, false));
		GridData gd_compositeRequirements = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_compositeRequirements.heightHint = 180;
		gd_compositeRequirements.widthHint = 590;
		compositeRequirements.setLayoutData(gd_compositeRequirements);

		lblDetails = new Label(compositeRequirements, SWT.NONE);
		lblDetails.setText("Required Attributes and Relations");

		scrolledComposite = new ScrolledComposite(compositeRequirements, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		GridData gd_scrolledComposite = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_scrolledComposite.heightHint = 120;
		gd_scrolledComposite.widthHint = 560;
		scrolledComposite.setLayoutData(gd_scrolledComposite);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);

		tree = new Tree(scrolledComposite, SWT.BORDER);
		scrolledComposite.setContent(tree);
		scrolledComposite.setMinSize(tree.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	}

	protected void selectAnalysisMethod() {
		if(this.listEnabledAnalysisMethods.getSelectionIndex()!=-1){
			this.listSelectedAnalysisMethods.add(this.listEnabledAnalysisMethods.getItem(this.listEnabledAnalysisMethods.getSelectionIndex()));
			this.listEnabledAnalysisMethods.setItems(AnalysisMethodHelper.getPossibleAnalysisMethods(this.listEnabledAnalysisMethods.getItem(this.listEnabledAnalysisMethods.getSelectionIndex())));
			this.loadAnalysisMethodDetails();
		}
	}

	protected void unselectAnalysisMethod() {
		if(this.listSelectedAnalysisMethods.getItemCount()>0){
			this.listSelectedAnalysisMethods.remove(this.listSelectedAnalysisMethods.getItemCount()-1);
			if(this.listSelectedAnalysisMethods.getItemCount()>0){
				this.listEnabledAnalysisMethods.setItems(AnalysisMethodHelper.getPossibleAnalysisMethods(this.listSelectedAnalysisMethods.getItem(this.listSelectedAnalysisMethods.getItemCount()-1)));
			}else{
				this.listEnabledAnalysisMethods.setItems(AnalysisMethodHelper.CONCEPTS_PLUS_ANALYSIS_METHODS);	
			}
			this.loadAnalysisMethodDetails();
		}
	}

	protected void loadAnalysisMethodDetails() {
		setPageComplete(false);
		this.tree.removeAll();
		for(int i=0; i<this.listSelectedAnalysisMethods.getItemCount(); i++){
			String conceptAndAnalysisMethod[] = this.listSelectedAnalysisMethods.getItem(i).split("->");
			AnalysisMethod analysisMethod=null;
			if(conceptAndAnalysisMethod[0].equals(AnalysisMethodHelper.APPLICATION_COMPONENT) && conceptAndAnalysisMethod[1].equals(AnalysisMethodHelper.AVAILABILITY)){
				analysisMethod = new ApplicationComponentAvailability();    			
			}else if(conceptAndAnalysisMethod[0].equals(AnalysisMethodHelper.BUSINESS_PROCESS) && conceptAndAnalysisMethod[1].equals(AnalysisMethodHelper.FAULT_SUSCEPTIBILITY)){
				analysisMethod = new BusinessProcessFaultSusceptibility();
			}else if(conceptAndAnalysisMethod[0].equals(AnalysisMethodHelper.REQUIREMENT) && conceptAndAnalysisMethod[1].equals(AnalysisMethodHelper.IMPACT_OVER_DEVICE)){
				analysisMethod = new RequirementImpactOverDevice();    			
			}
			if(analysisMethod!=null){
				analysisMethod.initAffectedConcepts();
				this.setMessage(analysisMethod.getDescription());
				TreeItem treeItemConceptAndAnalysisMethod;
				treeItemConceptAndAnalysisMethod = new TreeItem(this.tree, SWT.NULL);
				treeItemConceptAndAnalysisMethod.setText("Concept: "+conceptAndAnalysisMethod[0]+". Analysis Method: "+conceptAndAnalysisMethod[1]+".");
				TreeItem treeItemConcept;
				for(AffectedConcept affectedConcept : analysisMethod.getAffectedConcepts()){
					treeItemConcept = new TreeItem(treeItemConceptAndAnalysisMethod, SWT.NULL);
					treeItemConcept.setText(affectedConcept.getTypeName());
					TreeItem treeItemAttribute;
					for(AdditionalAttribute additionalAttribute : affectedConcept.getAdditionalAttributes()){
						treeItemAttribute = new TreeItem(treeItemConcept, SWT.NULL);
						treeItemAttribute.setText("Attribute = " + additionalAttribute.getName() + ":" + additionalAttribute.getType()+"("+additionalAttribute.getCalculated()+")");    					
					}
					TreeItem treeItemRelation;
					for(AdditionalRelation additionalRelation : affectedConcept.getAdditionalRelations()){
						treeItemRelation = new TreeItem(treeItemConcept, SWT.NULL);
						treeItemRelation.setText("Relation = " + additionalRelation.getName());    					
					}
					treeItemConcept.setExpanded(true);
				}	
				treeItemConceptAndAnalysisMethod.setExpanded(true);
			}    		
		}		
	}


	@Override
	public boolean isPageComplete() {
		return this.validateSelectedAnalysisMethods();
	}

	private boolean validateSelectedAnalysisMethods(){
		this.setErrorMessage(null);
		if(this.listSelectedAnalysisMethods.getItemCount()<2){
			this.setErrorMessage("Select at least two analysis methods");
			return false;
		}
		return true;
	}

	public List getListSelectedAnalysisMethods() {
		return listSelectedAnalysisMethods;
	}
	
	
}
