package co.edu.uniandes.iArchimate.indicators.business;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import co.edu.uniandes.iArchimate.indicators.Indicator;
import co.edu.uniandes.iArchimate.indicators.IndicatorReport;
import co.edu.uniandes.iArchimate.utilities.emf.MetaModelUtilities;
import co.edu.uniandes.iArchimate.utilities.ocl.OclHandler;

public class BusinessProcessRelevance extends Indicator {
	private String []relevanceValues = {"Critique","Important","Medium","NotSignificant"};
	
	public BusinessProcessRelevance(){
		super();
	}
		
	@SuppressWarnings("unchecked")
	@Override
	public void calculateIndicator(){
		try {
			ArrayList<EObject> businessProcesses = new ArrayList<EObject>();
			EClass eClassElement = MetaModelUtilities.findEClass(this.intermediateMetaModel, "Element");
			EReference eReferenceAttributesInElement = MetaModelUtilities.findEReference(eClassElement, "attributes");			
			EClass eClassAttribute = MetaModelUtilities.findEClass(this.intermediateMetaModel, "Attribute");
			EAttribute eAttributeNameInAttribute = MetaModelUtilities.findEAttribute(eClassAttribute, "name");
			EAttribute eAttributeValueInAttribute = MetaModelUtilities.findEAttribute(eClassAttribute, "value");
			int []results = new int[this.relevanceValues.length];
			OclHandler oclHandler = new OclHandler(activeModel);			
			businessProcesses = (ArrayList<EObject>)oclHandler.evaluate("Element.allInstances()->asSequence()->select(e:Element | e.typeName=ElementTypeName::BusinessProcess)");
			int total=0;
			for(EObject businessProcess : businessProcesses){
				EList<EObject> attributes = (EList<EObject>)businessProcess.eGet(eReferenceAttributesInElement);
				for(EObject attribute : attributes){
					if(attribute.eGet(eAttributeNameInAttribute).toString().equals("Relevance")){
						results[indexOfRelevanceValue(attribute.eGet(eAttributeValueInAttribute).toString())]++;		
						total++;
					}
				}
			}
			this.indicatorReport = new IndicatorReport(new String[]{"Value","Total","Percentage"});			
			for(int i=0; i<this.relevanceValues.length; i++){
				this.registry=new String[3];
				this.registry[0]=this.relevanceValues[i];
				this.registry[1]=String.valueOf(results[i]);
				this.registry[2]=String.valueOf(((float)results[i]/(float)total)*100);			
				this.indicatorReport.addRegistry(this.registry);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private int indexOfRelevanceValue(String value){
		for(int i=0; i<this.relevanceValues.length; i++){
			if(value.equalsIgnoreCase(this.relevanceValues[i])){
				return i;
			}
		}
		return this.relevanceValues.length-1;
	}	
}
