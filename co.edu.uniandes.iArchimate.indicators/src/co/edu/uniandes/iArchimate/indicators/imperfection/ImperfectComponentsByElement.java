package co.edu.uniandes.iArchimate.indicators.imperfection;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import co.edu.uniandes.iArchimate.indicators.Indicator;
import co.edu.uniandes.iArchimate.indicators.IndicatorReport;
import co.edu.uniandes.iArchimate.utilities.emf.MetaModelUtilities;
import co.edu.uniandes.iArchimate.utilities.ocl.OclHandler;

public class ImperfectComponentsByElement extends Indicator {
	
	public ImperfectComponentsByElement(){
		super();
	}
		
	@SuppressWarnings("unchecked")
	@Override
	public void calculateIndicator(){
		try {
			HashMap<String, ElementHelper> elementHelpers = new HashMap<String, ElementHelper>(); 
			ArrayList<String> elementNames = new ArrayList<String>();
			
			EClass elementClass = MetaModelUtilities.findEClass(intermediateMetaModel, "Element");
			EReference referenceOfAttributes = MetaModelUtilities.findEReference(elementClass, "attributes");
			EReference referenceOfRelations = MetaModelUtilities.findEReference(elementClass, "relations");
			EAttribute typeNameAttributeInElement = MetaModelUtilities.findEAttribute(elementClass, "typeName");

			ArrayList<EObject> elements = new ArrayList<EObject>();
			OclHandler oclHandler = new OclHandler(activeModel);			
			elements = (ArrayList<EObject>)oclHandler.evaluate("Element.allInstances()->asSequence()");
			
			for(EObject element : elements){
				String elementName = element.eGet(typeNameAttributeInElement).toString();
				EList<EObject> attributesOfElement = (EList<EObject>)element.eGet(referenceOfAttributes);
				EList<EObject> relationsOfElement = (EList<EObject>)element.eGet(referenceOfRelations);
				boolean isImperfectElement = hasImperfectAttributesOrRelations(attributesOfElement, relationsOfElement);

				ElementHelper elementHelper = elementHelpers.get(elementName);
				if(elementHelper==null){
					ElementHelper newElementHelper = new ElementHelper((isImperfectElement)?1:0);
					elementHelpers.put(elementName, newElementHelper);
					elementNames.add(elementName);
				}else{
					elementHelper.addTotalElements();
					if(isImperfectElement){
						elementHelper.addImperfectElements();
					}
				}			
			}
			
			this.indicatorReport = new IndicatorReport(new String[]{"Element","Total","Imperfect","Percentage"});						
			for(String elementName : elementNames){
				ElementHelper elementHelper = elementHelpers.get(elementName);
				this.registry=new String[4];
				this.registry[0]=elementName;
				this.registry[1]=String.valueOf(elementHelper.getTotalElements());
				this.registry[2]=String.valueOf(elementHelper.getImperfectElements());
				this.registry[3]=String.valueOf(((float)elementHelper.getImperfectElements()/(float)elementHelper.getTotalElements())*100);
				this.indicatorReport.addRegistry(this.registry);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private boolean hasImperfectAttributesOrRelations(EList<EObject> attributesOfElement, EList<EObject> relationsOfElement){
		for(int i=0; i<attributesOfElement.size(); i++){
			if(attributesOfElement.get(i).eClass().getName().equals("ImperfectAttribute")){
				return true;
			}
		}
		for(int i=0; i<relationsOfElement.size(); i++){
			if(relationsOfElement.get(i).eClass().getName().equals("ImperfectRelation")){
				return true;
			}
		}
		return false;
	}
}
