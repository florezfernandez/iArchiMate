package co.edu.uniandes.iArchimate.analysis.imperfection;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import co.edu.uniandes.iArchimate.analysis.AnalysisMethodReport;
import co.edu.uniandes.iArchimate.utilities.emf.MetaModelUtilities;
import co.edu.uniandes.iArchimate.utilities.emf.ModelUtilities;

public class ImperfectElementsByType extends AnalysisMethodImperfection {

	private EClass eClassElement;
	private EClass eClassAbsentElement;
	private EClass eClassImperfectAttribute;
	private EClass eClassImperfectRelation;
	private EReference eReferenceAttributesInElement;
	private EReference eReferenceRelationsInElement;
	private EEnum eEnumElementTypeName;
	private String[] elementTypes;
	private EAttribute eAttributeTypeNameInElement;

	public ImperfectElementsByType(){
		super();
	}

	@Override
	public void performAnalysisMethod(){
		try {
			this.eClassElement = MetaModelUtilities.findEClass(this.intermediateMetaModel, "Element");
			this.eClassAbsentElement = MetaModelUtilities.findEClass(this.intermediateMetaModel, "AbsentElement");
			this.eClassImperfectAttribute = MetaModelUtilities.findEClass(this.intermediateMetaModel, "ImperfectAttribute");
			this.eClassImperfectRelation = MetaModelUtilities.findEClass(this.intermediateMetaModel, "ImperfectRelation");
			this.eAttributeTypeNameInElement = MetaModelUtilities.findEAttribute(eClassElement, "typeName");						
			this.eReferenceAttributesInElement = MetaModelUtilities.findEReference(eClassElement, "attributes");						
			this.eReferenceRelationsInElement = MetaModelUtilities.findEReference(eClassElement, "relations");						
			this.eEnumElementTypeName = MetaModelUtilities.findEEnum(this.intermediateMetaModel, "ElementTypeName");
			ArrayList<EObject> elements = ModelUtilities.getElements(this.activeModel);
			this.elementTypes = new String[this.eEnumElementTypeName.eContents().size()-1];  
			int [][]amountOfElementsByType = new int[this.eEnumElementTypeName.eContents().size()-1][2];
			for(int i=0; i<this.elementTypes.length; i++){
				this.elementTypes[i]=MetaModelUtilities.findEEnumLiteral(this.eEnumElementTypeName, i).getName();
			}
			for(EObject element : elements){
				Object typeNameInElement = element.eGet(this.eAttributeTypeNameInElement);
				int index = findIndexOfElementType(typeNameInElement.toString());
				amountOfElementsByType[index][0]++;
				if(isImperfectElement(element)){
					amountOfElementsByType[index][1]++;
				}
			}			

			this.analysisMethodReport = new AnalysisMethodReport(new String[]{"Element","Total","Imperfect","Percentage"});			
			double p;
			for(int i=0; i<this.elementTypes.length; i++){
				this.registry=new String[this.analysisMethodReport.getTitles().length];
				if(amountOfElementsByType[i][0]>0){
					this.registry[0]=this.elementTypes[i];
					this.registry[1]=String.valueOf(amountOfElementsByType[i][0]);				
					this.registry[2]=String.valueOf(amountOfElementsByType[i][1]);				
					p = ((double)amountOfElementsByType[i][1]/(double)amountOfElementsByType[i][0])*100;
					p = Math.round(p*100);
					p/=100;
					this.registry[3]=String.valueOf(p);								
					this.analysisMethodReport.addRegistry(this.registry);					
				}
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	private int findIndexOfElementType(String elementType){
		for(int i=0; i<this.elementTypes.length; i++){
			if(this.elementTypes[i].equals(elementType)){
				return i;
			}
		}
		return 0;
	}
	
	@SuppressWarnings("unchecked")
	private boolean isImperfectElement(EObject element) {
		if(element.eClass() == this.eClassAbsentElement){
			return true;
		}
		List<EObject> attributes = (List<EObject>)element.eGet(eReferenceAttributesInElement);
		for(EObject attribute : attributes){
			if(attribute.eClass() == this.eClassImperfectAttribute){
				return true;
			}
		}
		List<EObject> relations = (List<EObject>)element.eGet(eReferenceRelationsInElement);
		for(EObject relation : relations){
			if(relation.eClass() == this.eClassImperfectRelation){
				return true;
			}
		}
		return false;
	}
}
