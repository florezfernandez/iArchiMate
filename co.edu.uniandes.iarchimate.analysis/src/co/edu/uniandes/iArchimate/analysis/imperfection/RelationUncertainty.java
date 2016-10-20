package co.edu.uniandes.iArchimate.analysis.imperfection;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ListDialog;
import org.eclipse.ui.dialogs.ListSelectionDialog;

import co.edu.uniandes.iArchimate.analysis.AnalysisMethodReport;
import co.edu.uniandes.iArchimate.utilities.emf.MetaModelUtilities;
import co.edu.uniandes.iArchimate.utilities.emf.ModelUtilities;

public class RelationUncertainty extends AnalysisMethodImperfection {

	private EClass eClassElement;
	private EReference eReferenceRelationsInElement;
	private EClass eClassRelation;
	private EAttribute eAttributeNameInElement;
	private EClass eClassImperfectRelation;
	private EAttribute eAttributeCertaintyDegreeInImperfectRelation;
	private EAttribute eAttributeTypeNameInRelation;
	private EEnum enumElementType;
	
	public RelationUncertainty(){
		super();
	}

	@SuppressWarnings("unchecked")
	@Override
	public void performAnalysisMethod(){
		try {
			this.eClassElement = MetaModelUtilities.findEClass(this.intermediateMetaModel, "Element");
			this.eClassRelation = MetaModelUtilities.findEClass(this.intermediateMetaModel, "Relation");
			this.eClassImperfectRelation = MetaModelUtilities.findEClass(this.intermediateMetaModel, "ImperfectRelation");
			this.eAttributeCertaintyDegreeInImperfectRelation = MetaModelUtilities.findEAttribute(eClassImperfectRelation, "certaintyDegree");
			this.eAttributeNameInElement = MetaModelUtilities.findEAttribute(eClassElement, "name");
			this.eReferenceRelationsInElement = MetaModelUtilities.findEReference(eClassElement, "relations");						
			this.eAttributeTypeNameInRelation = MetaModelUtilities.findEAttribute(eClassRelation, "typeName");
			
			this.enumElementType = MetaModelUtilities.findEEnum(this.intermediateMetaModel, "ElementTypeName");
			EList<EEnumLiteral> elementTypeLiterals = this.enumElementType.getELiterals(); 
			
			String []elementsOptions = new String[elementTypeLiterals.size()];
			for(int i=0; i<elementTypeLiterals.size(); i++){
				elementsOptions[i]=elementTypeLiterals.get(i).getName();				
			}
			
			this.enumElementType = MetaModelUtilities.findEEnum(this.intermediateMetaModel, "RelationTypeName");
			EList<EEnumLiteral> relationTypeLiterals = this.enumElementType.getELiterals(); 
			
			String []relationsOptions = new String[relationTypeLiterals.size()];
			for(int i=0; i<relationTypeLiterals.size(); i++){
				relationsOptions[i]=relationTypeLiterals.get(i).getName();				
			}

			ListDialog listDialog;
			listDialog = new ListDialog(Display.getCurrent().getActiveShell());			
			listDialog.setContentProvider(new ArrayContentProvider());
			listDialog.setLabelProvider(new LabelProvider());
			listDialog.setMessage("Select the source element Type, for evaluating the method");
		    listDialog.setTitle("Select source element Type");
		    listDialog.setInput(elementsOptions);
		    listDialog.open();
		    String selectedSource=listDialog.getResult()[0].toString();	    

//			listDialog = new ListSelectionDialog(Display.getCurrent().getActiveShell(), elementsOptions, new ArrayContentProvider(), new LabelProvider(), "Select the target element Type, for evaluating the method");
//		    listDialog.setTitle("Select target element Type");
//		    listDialog.open();
//		    String selectedTarget=listDialog.getResult()[0].toString();	    

			listDialog = new ListDialog(Display.getCurrent().getActiveShell());			
			listDialog.setContentProvider(new ArrayContentProvider());
			listDialog.setLabelProvider(new LabelProvider());
			listDialog.setMessage("Select the relation Type, for evaluating the method");
		    listDialog.setTitle("Select relation Type");
		    listDialog.setInput(relationsOptions);
		    listDialog.open();
		    String selectedRelation=listDialog.getResult()[0].toString();	    
		    
			this.analysisMethodReport = new AnalysisMethodReport(new String[]{"Element","# Relations","# Imperfect","% Imperfect", "# Imperfect over 0.9","% Imperfect over 0.9"});			
			ArrayList<EObject> sourceElements = ModelUtilities.getElementsByTypeName(this.activeModel, selectedSource);
			for(EObject sourceElement : sourceElements){
				int amountOfRelations=0;
				int amountOfImperfectRelations=0;
				int amountOfImperfectRelationsOver09=0;
				
				EList<EObject> relationsOfElement = (EList<EObject>)sourceElement.eGet(this.eReferenceRelationsInElement);
				for(EObject relation : relationsOfElement){
					amountOfRelations++;
					if(relation.eGet(this.eAttributeTypeNameInRelation).toString().equals(selectedRelation)){
						if(relation.eClass() == this.eClassImperfectRelation){
							amountOfImperfectRelations++;
							double certaintyDegree = Double.parseDouble(relation.eGet(this.eAttributeCertaintyDegreeInImperfectRelation).toString());
							if(certaintyDegree>=0.9){
								amountOfImperfectRelationsOver09++;
							}
						}						
					}
				}
				double p;
				if(amountOfImperfectRelations>0){
					this.registry=new String[this.analysisMethodReport.getTitles().length];
					this.registry[0]=sourceElement.eGet(this.eAttributeNameInElement).toString();
					this.registry[1]=String.valueOf(amountOfRelations);
					this.registry[2]=String.valueOf(amountOfImperfectRelations);
					p = ((double)amountOfImperfectRelations/(double)amountOfRelations)*100;
					p = Math.round(p*100);
					p/=100;
					this.registry[3]=String.valueOf(p);
					this.registry[4]=String.valueOf(amountOfImperfectRelationsOver09);					
					p = ((double)amountOfImperfectRelationsOver09/(double)amountOfRelations)*100;
					p = Math.round(p*100);
					p/=100;
					this.registry[5]=String.valueOf(p);					
					this.analysisMethodReport.addRegistry(this.registry);					
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
