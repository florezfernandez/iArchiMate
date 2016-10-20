package co.edu.uniandes.iArchimate.ui.wizardPage;

import java.util.Collection;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class ChangeNameWizardPageOne extends WizardPage{

	private Combo cbPossibleNames;
	private String newName;
	private Boolean nameSelected;
	private Collection<String> namesToSelect;
	
	
	public ChangeNameWizardPageOne(Collection<String> namesToSelect, String pageMessage) {
		super(pageMessage);
		setNameSelected(false);
		this.newName = null;
		this.namesToSelect = namesToSelect;
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
		
        Label lbValidNames = new Label(composite, SWT.NONE);
        lbValidNames.setText("Valid names");
        lbValidNames.setFont(parent.getFont());


        cbPossibleNames = new Combo(composite, SWT.BORDER);
        GridData data = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL);
        data.widthHint = 250;
        cbPossibleNames.setLayoutData(data);
        cbPossibleNames.setFont(parent.getFont());
        String atts[] = (String[])namesToSelect.toArray(new String[0]);
        cbPossibleNames.setItems(atts);
        cbPossibleNames.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent e) {
                updateSelection();
            }
        });        
        cbPossibleNames.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) {
            	updateSelection();
            }
            public void keyReleased(KeyEvent e) { }
        });
        cbPossibleNames.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) { }
            public void focusLost(FocusEvent e) { }
        });
        
        setControl(composite);
	}
	
    
    @Override
    public boolean isPageComplete() {
    	return this.nameSelected;
    }
    
    private void updateSelection(){
    	setNewName(cbPossibleNames.getText());
    	setPageComplete(isPageComplete());
    	getContainer().updateButtons();
    }
    
    
	public String getNewName() {
		return newName;
	}

	public void setNewName(String newName) {
		this.newName = newName;
		setNameSelected(true);
	}

	public Boolean getNameSelected() {
		
		return nameSelected;
	}

	public void setNameSelected(Boolean nameSelected) {
		this.nameSelected = nameSelected;
	}

}
