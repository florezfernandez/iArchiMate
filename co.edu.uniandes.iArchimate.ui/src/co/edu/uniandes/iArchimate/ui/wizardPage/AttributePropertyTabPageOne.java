package co.edu.uniandes.iArchimate.ui.wizardPage;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import co.edu.uniandes.iArchimate.ui.propertySection.AttributesPropertySection;
import co.edu.uniandes.iArchimate.ui.wizard.AttributePropertyTabWizard;

public class AttributePropertyTabPageOne extends WizardPage{
	
	private int operationType;
	private int typeOfPropertySection;
	
	private Text txtName;
	private Combo cbType;
	private Text txtValue;
	private Combo cbImperfectionType;
	
	private String newName;
	private String newType;
	private String newValue;
	private String newImperfectionType;

	public AttributePropertyTabPageOne(int operationType, int typeOfPropertySection) {
		super("wizardPage");
		this.operationType = operationType;
		this.typeOfPropertySection = typeOfPropertySection;
		if(this.operationType==AttributePropertyTabWizard.ADD){
			this.setTitle("Add a new attribute");
		}else if(this.operationType==AttributePropertyTabWizard.EDIT){
			this.setTitle("Edit selected attribute");
		}
		this.setDescription("Introduce all information required");
		this.setPageComplete(false);
	}

	
	public String getNewName() {
		return newName;
	}

	public String getNewType() {
		return newType;
	}

	public String getNewValue() {
		return newValue;
	}

	public String getNewImperfectionType() {
		return newImperfectionType;
	}

	public void fillFields(TableItem selectedAttribute){
		this.txtName.setText(selectedAttribute.getText(0));
		this.cbType.setText(selectedAttribute.getText(1));
		this.txtValue.setText(selectedAttribute.getText(2));
		if(this.typeOfPropertySection==AttributesPropertySection.ELEMENT_IMPERFECT_ATTRIBUTES || this.typeOfPropertySection==AttributesPropertySection.RELATION_IMPERFECT_ATTRIBUTES){
			this.cbImperfectionType.setText(selectedAttribute.getText(3));
		}
	}
	
	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
        composite.setLayout(new GridLayout(2,false));
		composite.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL | GridData.HORIZONTAL_ALIGN_FILL));
		composite.setSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
        this.setControl(composite);
		
        Label lbName = new Label(composite, SWT.NONE);
        lbName.setText("Name");
        
        this.txtName = new Text(composite, SWT.BORDER);
        this.txtName.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL));
        this.txtName.addKeyListener(new KeyListener() {
			@Override
			public void keyReleased(KeyEvent e) {
				validate();
			}
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
        
        Label lbType = new Label(composite, SWT.NONE);
        lbType.setText("Type");

        this.cbType = new Combo(composite, SWT.READ_ONLY | SWT.BORDER);
        this.cbType.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL));
        String types[] = {"EInt","EDouble","EString","EBoolean","EDate"};
        this.cbType.setItems(types);
        this.cbType.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent e) {
                validate();
            }
        });        
        
        Label lbValue = new Label(composite, SWT.NONE);
        lbValue.setText("Value");
        
        this.txtValue = new Text(composite, SWT.BORDER);
        this.txtValue.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL));
        this.txtValue.addKeyListener(new KeyListener() {
			@Override
			public void keyReleased(KeyEvent e) {
				validate();
			}
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});

        if(this.typeOfPropertySection==AttributesPropertySection.ELEMENT_IMPERFECT_ATTRIBUTES || this.typeOfPropertySection==AttributesPropertySection.RELATION_IMPERFECT_ATTRIBUTES){
            Label lbImperfectType = new Label(composite, SWT.NONE);
            lbImperfectType.setText("Imperfection Type");

            this.cbImperfectionType = new Combo(composite, SWT.READ_ONLY | SWT.BORDER);
            this.cbImperfectionType.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL));
            String imperfectTypes[] = {"NumericRange","NumericSet","StringSet","NumericValueCertaintyDegree","StringValueCertaintyDegree","LinguisticValue","NoValue"};
            this.cbImperfectionType.setItems(imperfectTypes);
            this.cbImperfectionType.addSelectionListener(new SelectionAdapter() {
                public void widgetSelected(SelectionEvent e) {
                    validate();
                }
            });        
        }
	}
	
    
	protected void validate() {
    	if(this.typeOfPropertySection==AttributesPropertySection.ELEMENT_ATTRIBUTES || this.typeOfPropertySection==AttributesPropertySection.RELATION_ATTRIBUTES){
    		this.validateRegularAttributes();
    	}else if(this.typeOfPropertySection==AttributesPropertySection.ELEMENT_IMPERFECT_ATTRIBUTES || this.typeOfPropertySection==AttributesPropertySection.RELATION_IMPERFECT_ATTRIBUTES){
    		this.validateImperfectAttributes();
    	}
	}
    
    @SuppressWarnings("unused")
	protected void validateRegularAttributes() {
    	if(this.cbType.getSelectionIndex()!=-1 && !this.txtValue.getText().equals("")){
    		if(this.cbType.getText().equals("EInt")){
    			try {
					int value = Integer.parseInt(this.txtValue.getText());
					this.setErrorMessage(null);
				} catch (Exception e) {
					this.setErrorMessage("Value must be int");
					this.setPageComplete(false);
					return;
				}
    		}else if(this.cbType.getText().equals("EDouble")){
    			try {
					double value = Double.parseDouble(this.txtValue.getText());
					this.setErrorMessage(null);
				} catch (Exception e) {
					this.setErrorMessage("Value must be double");
					this.setPageComplete(false);
					return;
				}
    		}else if(this.cbType.getText().equals("EBoolean")){
    			if(this.txtValue.getText().equals("true") || this.txtValue.getText().equals("false")){
    				this.setErrorMessage(null);    				
    			}else{
					this.setErrorMessage("Value must be true or false");
					this.setPageComplete(false);
					return;
    			}
    		}
		}else {
			this.setPageComplete(false);
			return;
		}
    	if(!this.txtName.getText().equals("")){
    		this.newName=this.txtName.getText();
    		this.newType=this.cbType.getText();
    		this.newValue=this.txtValue.getText();
    		this.setPageComplete(true);
		}else {
			this.setPageComplete(false);
		}
	}

 	protected void validateImperfectAttributes() {
     	if(!this.txtName.getText().equals("") && this.cbType.getSelectionIndex()!=-1 && !this.txtValue.getText().equals("") && this.cbImperfectionType.getSelectionIndex()!=-1){
     		this.newName=this.txtName.getText();
     		this.newType=this.cbType.getText();
     		this.newValue=this.txtValue.getText();
 			this.newImperfectionType=this.cbImperfectionType.getText();
     		this.setPageComplete(true);
     	}else{
     		this.setPageComplete(false);
     	}
 	}
}
