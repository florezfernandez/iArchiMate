package co.edu.uniandes.iArchimate.ui.propertySection;

import iArchimate.Attribute;
import iArchimate.AttributeTypeValue;
import iArchimate.IArchimateFactory;
import iArchimate.ImperfectAttribute;
import iArchimate.ImperfectAttributeTypeValue;
import iArchimate.diagram.edit.parts.ImperfectRelationEditPart;
import iArchimate.diagram.edit.parts.RelationEditPart;
import iArchimate.impl.ElementImpl;
import iArchimate.impl.ImperfectAttributeImpl;
import iArchimate.impl.RelationImpl;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.notation.impl.EdgeImpl;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import co.edu.uniandes.iArchimate.ui.wizard.AttributePropertyTabWizard;
import co.edu.uniandes.iArchimate.utilities.emf.ModelUtilities;
import co.edu.uniandes.iArchimate.utilities.emf.ModelingUtilities;

public abstract class AttributesPropertySection extends AbstractPropertySection {
	public static int ELEMENT_ATTRIBUTES=1; 
	public static int ELEMENT_IMPERFECT_ATTRIBUTES=2; 
	public static int RELATION_ATTRIBUTES=3; 
	public static int RELATION_IMPERFECT_ATTRIBUTES=4; 	
	public static int IMPERFECT_RELATION_ATTRIBUTES=5; 
	public static int IMPERFECT_RELATION_IMPERFECT_ATTRIBUTES=6; 	

	private int typeOfPropertySection;
	private ElementImpl selectedElement;
	private Table table;
	private Button buttonAddAttribute;
	private Button buttonRemoveAttribute;
	private Button buttonEditAttribute;
	private EList<Attribute> selectedElementOrRelation_Attributes;
	private ArrayList<Attribute> filteredAttributes = new ArrayList<Attribute>();


	public AttributesPropertySection(int typeOfPropertySection) {
		this.typeOfPropertySection = typeOfPropertySection;

	}

	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		parent.setLayout(new RowLayout(SWT.HORIZONTAL));

		Composite compositeForTable = getWidgetFactory().createComposite(parent);
		compositeForTable.setLayout(new GridLayout());

		Composite compositeForButtons = getWidgetFactory().createComposite(parent);
		compositeForButtons.setLayout(new RowLayout(SWT.VERTICAL));

		this.table = getWidgetFactory().createTable(compositeForTable, SWT.SINGLE | SWT.BORDER | SWT.FULL_SELECTION);
		this.table.setLinesVisible (true);
		this.table.setHeaderVisible (true);
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);		
		gridData.heightHint = 100;
		gridData.widthHint = 600;
		this.table.setLayoutData(gridData);
		ArrayList<String> titles = new ArrayList<String>();
		titles.add("Name");
		titles.add("Type");
		titles.add("Value");		
		if(this.typeOfPropertySection==AttributesPropertySection.ELEMENT_IMPERFECT_ATTRIBUTES || this.typeOfPropertySection==AttributesPropertySection.RELATION_IMPERFECT_ATTRIBUTES || this.typeOfPropertySection==AttributesPropertySection.IMPERFECT_RELATION_IMPERFECT_ATTRIBUTES){
			titles.add("ImperfectionType");			
		}
		for (String title : titles) {
			TableColumn column = new TableColumn (this.table, SWT.NONE);
			column.setWidth(150);
			column.setText (title);
		}
		RowData rowData = new RowData();
		rowData.width=80;
		this.buttonAddAttribute = getWidgetFactory().createButton(compositeForButtons, "Add", SWT.PUSH);
		this.buttonAddAttribute.setLayoutData(rowData);		
		this.buttonAddAttribute.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				buttonAddAttributePressed();
			}
		});

		this.buttonRemoveAttribute = getWidgetFactory().createButton(compositeForButtons, "Remove", SWT.PUSH);
		this.buttonRemoveAttribute.setLayoutData(rowData);
		this.buttonRemoveAttribute.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				buttonRemoveAttributePressed();
			}
		});

		this.buttonEditAttribute = getWidgetFactory().createButton(compositeForButtons, "Edit", SWT.PUSH);
		this.buttonEditAttribute.setLayoutData(rowData);
		this.buttonEditAttribute.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				buttonEditAttributePressed();
			}
		});
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		this.table.setVisible(true);
		this.buttonAddAttribute.setVisible(true);
		this.buttonRemoveAttribute.setVisible(true);
		this.buttonEditAttribute.setVisible(true);		
		this.filteredAttributes.clear();
		if(this.typeOfPropertySection==AttributesPropertySection.ELEMENT_ATTRIBUTES || this.typeOfPropertySection==AttributesPropertySection.ELEMENT_IMPERFECT_ATTRIBUTES){
			this.setInputForElementAttributes(selection);
		}else if(this.typeOfPropertySection==AttributesPropertySection.RELATION_ATTRIBUTES || this.typeOfPropertySection==AttributesPropertySection.RELATION_IMPERFECT_ATTRIBUTES){
			this.setInputForRelationAttributes(selection);
		}
	}
	
	private void setInputForElementAttributes(ISelection selection){
		try {
			ShapeNodeEditPart selectedElementEditPart = (ShapeNodeEditPart)((IStructuredSelection) selection).getFirstElement();
			this.selectedElement = (ElementImpl)((NodeImpl)selectedElementEditPart.getModel()).getElement(); 
			this.selectedElementOrRelation_Attributes = this.selectedElement.getAttributes();
			this.table.removeAll();
			for(Attribute attribute : this.selectedElementOrRelation_Attributes){
				if(this.typeOfPropertySection==AttributesPropertySection.ELEMENT_ATTRIBUTES && !(attribute instanceof ImperfectAttributeImpl)){
					TableItem item = new TableItem (this.table, SWT.NONE);
					if(attribute.getName()!=null) item.setText (0, attribute.getName());
					item.setText (1, attribute.getType().getLiteral());
					if(attribute.getValue()!=null) item.setText (2, attribute.getValue());				
					this.filteredAttributes.add(attribute);
				}else if (this.typeOfPropertySection==AttributesPropertySection.ELEMENT_IMPERFECT_ATTRIBUTES && attribute instanceof ImperfectAttributeImpl){
					TableItem item = new TableItem (this.table, SWT.NONE);
					if(attribute.getName()!=null) item.setText (0, attribute.getName());
					item.setText (1, attribute.getType().getLiteral());
					if(attribute.getValue()!=null) item.setText (2, attribute.getValue());				
					item.setText (3, ((ImperfectAttribute) attribute).getImperfectionType().getLiteral());
					this.filteredAttributes.add(attribute);
				}
			}			
		} catch (Exception e) {
			this.table.setVisible(false);
			this.buttonAddAttribute.setVisible(false);
			this.buttonRemoveAttribute.setVisible(false);
			this.buttonEditAttribute.setVisible(false);
		}		
	}
	
	private void setInputForRelationAttributes(ISelection selection){
		try {
			RelationImpl selectedRelation;
			
			if(((IStructuredSelection) selection).getFirstElement() instanceof RelationEditPart){
				RelationEditPart selectedRelationEditPart = (RelationEditPart)((IStructuredSelection) selection).getFirstElement();
				selectedRelation = (RelationImpl)((EdgeImpl)selectedRelationEditPart.getModel()).getElement();
			}else{
				ImperfectRelationEditPart selectedRelationEditPart = (ImperfectRelationEditPart)((IStructuredSelection) selection).getFirstElement();
				selectedRelation = (RelationImpl)((EdgeImpl)selectedRelationEditPart.getModel()).getElement();
			}
			this.selectedElementOrRelation_Attributes = selectedRelation.getAttributes();
			this.table.removeAll();
			for(Attribute attribute : this.selectedElementOrRelation_Attributes){
				if(this.typeOfPropertySection==AttributesPropertySection.RELATION_ATTRIBUTES && !(attribute instanceof ImperfectAttributeImpl)){
					TableItem item = new TableItem (this.table, SWT.NONE);
					if(attribute.getName()!=null) item.setText (0, attribute.getName());
					item.setText (1, attribute.getType().getLiteral());
					if(attribute.getValue()!=null) item.setText (2, attribute.getValue());				
					this.filteredAttributes.add(attribute);
				}else if (this.typeOfPropertySection==AttributesPropertySection.RELATION_IMPERFECT_ATTRIBUTES && attribute instanceof ImperfectAttributeImpl){
					TableItem item = new TableItem (this.table, SWT.NONE);
					if(attribute.getName()!=null) item.setText (0, attribute.getName());
					item.setText (1, attribute.getType().getLiteral());
					if(attribute.getValue()!=null) item.setText (2, attribute.getValue());				
					item.setText (3, ((ImperfectAttribute) attribute).getImperfectionType().getLiteral());
					this.filteredAttributes.add(attribute);
				}
			}			
		} catch (Exception e) {
			e.printStackTrace();
			this.table.setVisible(false);
			this.buttonAddAttribute.setVisible(false);
			this.buttonRemoveAttribute.setVisible(false);
			this.buttonEditAttribute.setVisible(false);
		}		
	}

	protected void buttonAddAttributePressed() {		
		Attribute newAttribute = this.addOrEditAttributeUsingWizard(false);
		if(newAttribute!=null){
			this.filteredAttributes.add(newAttribute);
			try {
				this.selectedElementOrRelation_Attributes.add(newAttribute);
			} catch (Exception e) {
			}			
			ModelingUtilities.saveActiveDiagram();
			ModelUtilities.createAttributeFromOtherModelDiagram(this.selectedElement.getTypeName().getName(), this.selectedElement.getName(), newAttribute);
		}
	}

	protected void buttonRemoveAttributePressed() {
		if(isRowSelected()){
			int selectedIndexInTable = this.table.getSelectionIndex();
			Attribute selectedAttribute = this.filteredAttributes.get(selectedIndexInTable);				
			int attributePositionInEList = this.selectedElementOrRelation_Attributes.indexOf(selectedAttribute);
			TableItem selectedRow = this.table.getSelection()[0];
			MessageBox dialog = new MessageBox(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), SWT.ICON_ERROR | SWT.OK | SWT.CANCEL);
			dialog.setText("Remove Attribute");
			String message = "Remove the attribute:\nName:\t"+selectedRow.getText(0)+"\nType:\t"+selectedRow.getText(1)+"\nValue:\t"+selectedRow.getText(2);
			if(this.typeOfPropertySection==AttributesPropertySection.ELEMENT_ATTRIBUTES){
				message = "Remove the attribute:\nName:\t"+selectedRow.getText(0)+"\nType:\t"+selectedRow.getText(1)+"\nValue:\t"+selectedRow.getText(2);
			}else if(this.typeOfPropertySection==AttributesPropertySection.ELEMENT_IMPERFECT_ATTRIBUTES){
				message = "Remove the attribute:\nName:\t\t"+selectedRow.getText(0)+"\nType:\t\t"+selectedRow.getText(1)+"\nValue:\t\t"+selectedRow.getText(2)+"\nImperfection Type:\t"+selectedRow.getText(3);
			}
			dialog.setMessage(message);
			if(dialog.open()==SWT.OK){
				try {
					this.filteredAttributes.remove(selectedIndexInTable);
					this.table.remove(selectedIndexInTable);					
					this.selectedElementOrRelation_Attributes.remove(attributePositionInEList);
				} catch (Exception e) {
				}
				ModelingUtilities.saveActiveDiagram();
			}
		}		
	}

	protected void buttonEditAttributePressed() {
		if(isRowSelected()){
			Attribute selectedAttribute = this.filteredAttributes.get(this.table.getSelectionIndex());				
			int attributePositionInEList = this.selectedElementOrRelation_Attributes.indexOf(selectedAttribute);
			Attribute newAttribute = this.addOrEditAttributeUsingWizard(true);
			if(newAttribute!=null){
				try {
					this.selectedElementOrRelation_Attributes.remove(attributePositionInEList);	
				} catch (Exception e) {
				}
				try {
					this.selectedElementOrRelation_Attributes.add(attributePositionInEList, newAttribute);	
				} catch (Exception e) {
				}				
				ModelingUtilities.saveActiveDiagram();
				//ModelUtilities.createAttributeFromOtherModelDiagram(this.selectedElement.getTypeName().getName(), this.selectedElement.getName(), newAttribute);
			}
		}		
	}

	private boolean isRowSelected(){
		if(this.table.getSelectionIndex()==-1){
			MessageBox dialog = new MessageBox(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), SWT.ICON_ERROR | SWT.OK );
			dialog.setText("Attribute");
			dialog.setMessage("One attribute must be selected to perforn this operation");
			dialog.open();
			return false;
		}else{
			return true;
		}
	}

	private Attribute addOrEditAttributeUsingWizard(boolean initialValues){
		AttributePropertyTabWizard wizard = new AttributePropertyTabWizard((initialValues)?AttributePropertyTabWizard.EDIT:AttributePropertyTabWizard.ADD, this.typeOfPropertySection);
		WizardDialog dialog = new WizardDialog(null, wizard);
		dialog.create();
		if(initialValues){
			wizard.getAttributePropertyTabAddPageOne().fillFields(this.table.getSelection()[0]);			
		}		
		int myWidth = 300;
		int myHeight = 330;
		Rectangle currentBounds = dialog.getShell().getBounds();	    
		Rectangle newBounds = new Rectangle(currentBounds.x+((currentBounds.width-myWidth)/2), currentBounds.y+((currentBounds.height-myHeight)/2), myWidth, myHeight); 
		dialog.getShell().setBounds(newBounds);
		dialog.open();
		if(wizard.isPerformedFinish()){
			TableItem item = new TableItem (this.table, SWT.NONE);
			if(initialValues){
				item = this.table.getSelection()[0];				
			}
			String newName = wizard.getAttributePropertyTabAddPageOne().getNewName();
			String newType = wizard.getAttributePropertyTabAddPageOne().getNewType();
			String newValue = wizard.getAttributePropertyTabAddPageOne().getNewValue();
			item.setText (0, newName);
			item.setText (1, newType);
			item.setText (2, newValue);
			String newImperfectType=null;
			if(this.typeOfPropertySection==AttributesPropertySection.ELEMENT_IMPERFECT_ATTRIBUTES || this.typeOfPropertySection==AttributesPropertySection.RELATION_IMPERFECT_ATTRIBUTES){
				newImperfectType= wizard.getAttributePropertyTabAddPageOne().getNewImperfectionType();
				item.setText (3, newImperfectType);				
			}
			Attribute newAttribute=null;
			if(this.typeOfPropertySection==AttributesPropertySection.ELEMENT_ATTRIBUTES || this.typeOfPropertySection==AttributesPropertySection.RELATION_ATTRIBUTES){
				newAttribute = IArchimateFactory.eINSTANCE.createAttribute();				
			}else if(this.typeOfPropertySection==AttributesPropertySection.ELEMENT_IMPERFECT_ATTRIBUTES || this.typeOfPropertySection==AttributesPropertySection.RELATION_IMPERFECT_ATTRIBUTES){
				newAttribute = IArchimateFactory.eINSTANCE.createImperfectAttribute();
			}
			newAttribute.setName(newName);
			if(newType.equals("EInt")){
				newAttribute.setType(AttributeTypeValue.EINT);
			}else if(newType.equals("EDouble")){
				newAttribute.setType(AttributeTypeValue.EDOUBLE);
			}else if(newType.equals("EString")){
				newAttribute.setType(AttributeTypeValue.ESTRING);
			}else if(newType.equals("EBoolean")){
				newAttribute.setType(AttributeTypeValue.EBOOLEAN);
			}else if(newType.equals("EDate")){
				newAttribute.setType(AttributeTypeValue.EDATE);
			} 
			newAttribute.setValue(newValue);
			if(this.typeOfPropertySection==AttributesPropertySection.ELEMENT_IMPERFECT_ATTRIBUTES || this.typeOfPropertySection==AttributesPropertySection.RELATION_IMPERFECT_ATTRIBUTES){
				if(newImperfectType.equals("NumericRange")){
					((ImperfectAttribute)newAttribute).setImperfectionType(ImperfectAttributeTypeValue.NUMERIC_RANGE);									
				}else if(newImperfectType.equals("NumericSet")){
					((ImperfectAttribute)newAttribute).setImperfectionType(ImperfectAttributeTypeValue.NUMERIC_SET);									
				}else if(newImperfectType.equals("StringSet")){
					((ImperfectAttribute)newAttribute).setImperfectionType(ImperfectAttributeTypeValue.STRING_SET);									
				}else if(newImperfectType.equals("NumericValueCertaintyDegree")){
					((ImperfectAttribute)newAttribute).setImperfectionType(ImperfectAttributeTypeValue.NUMERIC_VALUE_CERTAINTY_DEGREE);									
				}else if(newImperfectType.equals("StringValueCertaintyDegree")){
					((ImperfectAttribute)newAttribute).setImperfectionType(ImperfectAttributeTypeValue.STRING_VALUE_CERTAINTY_DEGREE);									
				}else if(newImperfectType.equals("LinguisticValue")){
					((ImperfectAttribute)newAttribute).setImperfectionType(ImperfectAttributeTypeValue.LINGUISTIC_VALUE);									
				}else if(newImperfectType.equals("NoValue")){
					((ImperfectAttribute)newAttribute).setImperfectionType(ImperfectAttributeTypeValue.NO_VALUE);									
				}
			}
			return newAttribute;
		}
		return null;
	}
}
