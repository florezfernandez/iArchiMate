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

public class ImperfectElementsByLayer extends AnalysisMethodImperfection {

	private EClass eClassElement;
	private EClass eClassAbsentElement;
	private EClass eClassImperfectAttribute;
	private EClass eClassImperfectRelation;
	private EReference eReferenceAttributesInElement;
	private EReference eReferenceRelationsInElement;
	private EEnum eEnumElementTypeName;
	private String[] elementTypes;
	private EAttribute eAttributeTypeNameInElement;

	public ImperfectElementsByLayer(){
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
			for(int i=0; i<this.elementTypes.length; i++){
				this.elementTypes[i]=MetaModelUtilities.findEEnumLiteral(this.eEnumElementTypeName, i).getName();
			}
			String []layers = {"Business","Application","Infrastructure","Motivation"};
			int [][]amountOfElementsByLayer = new int[layers.length][2];
			for(EObject element : elements){
				Object typeNameInElement = element.eGet(this.eAttributeTypeNameInElement);
				int index = findIndexOfElementType(typeNameInElement.toString());
				int layerIndex = 0;
				if(index>=16 && index<=22){
					layerIndex=1;
				}else if(index>=23 && index<=31){
					layerIndex=2;
				}else if(index>=32 && index<=42){
					layerIndex=3;
				}						
				amountOfElementsByLayer[layerIndex][0]++;
				if(isImperfectElement(element)){
					amountOfElementsByLayer[layerIndex][1]++;
				}
			}			

			this.analysisMethodReport = new AnalysisMethodReport(new String[]{"Layer","Total","Imperfect","Percentage"});			
			double p;
			for(int i=0; i<layers.length; i++){
				this.registry=new String[this.analysisMethodReport.getTitles().length];
				this.registry[0]=layers[i];
				this.registry[1]=String.valueOf(amountOfElementsByLayer[i][0]);				
				this.registry[2]=String.valueOf(amountOfElementsByLayer[i][1]);				
				p = ((double)amountOfElementsByLayer[i][1]/(double)amountOfElementsByLayer[i][0])*100;
				p = Math.round(p*100);
				p/=100;
				this.registry[3]=String.valueOf(p);								
				this.analysisMethodReport.addRegistry(this.registry);					
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
