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

public class ImperfectComponentsByAttribute extends Indicator {
	
	public ImperfectComponentsByAttribute(){
		super();
	}
		
	@SuppressWarnings("unchecked")
	@Override
	public void calculateIndicator(){
		try {
			HashMap<String, ElementHelper> elementHelpers = new HashMap<String, ElementHelper>(); 
			ArrayList<String> elementNames = new ArrayList<String>();
			
			EClass elementClass = MetaModelUtilities.findEClass(this.intermediateMetaModel, "Element");
			EReference referenceOfAttributes = MetaModelUtilities.findEReference(elementClass, "attributes");
			EAttribute typeNameAttributeInElement = MetaModelUtilities.findEAttribute(elementClass, "typeName");

			EClass attributeClass = MetaModelUtilities.findEClass(this.intermediateMetaModel, "Attribute");
			EAttribute nameAttributeInAttribute = MetaModelUtilities.findEAttribute(attributeClass, "name");
			
			ArrayList<EObject> elements = new ArrayList<EObject>();
			OclHandler oclHandler = new OclHandler(activeModel);			
			elements = (ArrayList<EObject>)oclHandler.evaluate("Element.allInstances()->asSequence()");
			
			for(EObject element : elements){
				String elementName = element.eGet(typeNameAttributeInElement).toString();
				EList<EObject> attributesOfElement = (EList<EObject>)element.eGet(referenceOfAttributes);
				for(EObject attribute : attributesOfElement){
					String attributeName = attribute.eGet(nameAttributeInAttribute).toString();
					ElementHelper elementHelper = elementHelpers.get(elementName);
					if(elementHelper==null){
						ElementHelper newElementHelper = new ElementHelper(0);
						elementHelpers.put(elementName, newElementHelper);
						elementNames.add(elementName);
						newElementHelper.addAttribute(attributeName, attribute.eClass().getName().equals("ImperfectAttribute"));
					}else{
						elementHelper.addAttribute(attributeName, attribute.eClass().getName().equals("ImperfectAttribute"));
					}			
				}
			}
			
			this.indicatorReport = new IndicatorReport(new String[]{"Element","Attribute","Total","Imperfect","Percentage"});						
			for(String elementName : elementNames){
				ElementHelper elementHelper = elementHelpers.get(elementName);
				for(String attributeName : elementHelper.getAttributeNames()){
					AttributeHelper attributeHelper = elementHelper.getAttributeHelpers().get(attributeName);
					this.registry=new String[5];
					this.registry[0]=elementName;
					this.registry[1]=attributeName;
					this.registry[2]=String.valueOf(attributeHelper.getTotalAttributes());
					this.registry[3]=String.valueOf(attributeHelper.getImperfectAttributes());
					this.registry[4]=String.valueOf(((float)attributeHelper.getImperfectAttributes()/(float)attributeHelper.getTotalAttributes())*100);
					this.indicatorReport.addRegistry(this.registry);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
