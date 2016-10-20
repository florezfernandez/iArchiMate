package co.edu.uniandes.iArchimate.analysis.imperfection;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import co.edu.uniandes.iArchimate.analysis.AnalysisMethodReport;
import co.edu.uniandes.iArchimate.utilities.emf.MetaModelUtilities;
import co.edu.uniandes.iArchimate.utilities.emf.ModelUtilities;

public class ImperfectAttributesByType extends AnalysisMethodImperfection {

	private EClass eClassElement;
	private EReference eReferenceAttributesInElement;
	private EEnum eEnumElementTypeName;
	private String[] elementTypes;
	private EAttribute eAttributeTypeNameInElement;
	private EClass eClassAttribute;
	private EAttribute eAttributeNameInAttribute; 

	public ImperfectAttributesByType(){
		super();
	}

	@SuppressWarnings("unchecked")
	@Override
	public void performAnalysisMethod(){
		try {
			this.eClassElement = MetaModelUtilities.findEClass(this.intermediateMetaModel, "Element");
			this.eClassAttribute = MetaModelUtilities.findEClass(this.intermediateMetaModel, "Attribute");
			this.eAttributeTypeNameInElement = MetaModelUtilities.findEAttribute(eClassElement, "typeName");						
			this.eReferenceAttributesInElement = MetaModelUtilities.findEReference(eClassElement, "attributes");						
			this.eAttributeNameInAttribute = MetaModelUtilities.findEAttribute(eClassAttribute, "name");						
			this.eEnumElementTypeName = MetaModelUtilities.findEEnum(this.intermediateMetaModel, "ElementTypeName");
			
			HashMap<String, ElementHelper> elementHelpers = new HashMap<String, ElementHelper>(); 
			this.elementTypes = new String[this.eEnumElementTypeName.eContents().size()-1];  
			for(int i=0; i<this.elementTypes.length; i++){
				this.elementTypes[i]=MetaModelUtilities.findEEnumLiteral(this.eEnumElementTypeName, i).getName();
			}

			ArrayList<EObject> elements =  ModelUtilities.getElements(this.activeModel);
			
			for(EObject element : elements){
				String elementName = element.eGet(this.eAttributeTypeNameInElement).toString();
				EList<EObject> attributesOfElement = (EList<EObject>)element.eGet(this.eReferenceAttributesInElement);
				for(EObject attribute : attributesOfElement){
					String attributeName = attribute.eGet(this.eAttributeNameInAttribute).toString();
					ElementHelper elementHelper = elementHelpers.get(elementName);
					if(elementHelper==null){
						ElementHelper newElementHelper = new ElementHelper(0);
						elementHelpers.put(elementName, newElementHelper);
						newElementHelper.addAttribute(attributeName, attribute.eClass().getName().equals("ImperfectAttribute"));
					}else{
						elementHelper.addAttribute(attributeName, attribute.eClass().getName().equals("ImperfectAttribute"));
					}			
				}
			}
			
			this.analysisMethodReport = new AnalysisMethodReport(new String[]{"Element","Total","Imperfect","Percentage"});			
			String [] chartRegistry; 
			double p;
			for(String elementType : this.elementTypes){
				int numOfAttributes=0;
				int numOfImperfectAttributes=0;
				ElementHelper elementHelper = elementHelpers.get(elementType);
				if(elementHelper!=null){
					for(String attributeName : elementHelper.getAttributeNames()){
						AttributeHelper attributeHelper = elementHelper.getAttributeHelpers().get(attributeName);
						numOfAttributes+=attributeHelper.getTotalAttributes();
						numOfImperfectAttributes+=attributeHelper.getImperfectAttributes();
					}					
				}
				if(numOfAttributes>0){
					this.registry=new String[this.analysisMethodReport.getTitles().length];
					this.registry[0]=elementType;
					this.registry[1]=String.valueOf(numOfAttributes);
					this.registry[2]=String.valueOf(numOfImperfectAttributes);
					p = ((double)numOfImperfectAttributes/(double)numOfAttributes)*100;
					p = Math.round(p*100);
					p/=100;
					this.registry[3]=String.valueOf(p);
					this.analysisMethodReport.addRegistry(this.registry);										
					chartRegistry = new String[3];
					chartRegistry[0] = String.valueOf(numOfAttributes);
					chartRegistry[1] = "Total";
					chartRegistry[2] = elementType;
					this.chartDataReport.add(chartRegistry);							
					chartRegistry = new String[3];
					chartRegistry[0] = String.valueOf(numOfImperfectAttributes);
					chartRegistry[1] = "Imperfect";
					chartRegistry[2] = elementType;
					this.chartDataReport.add(chartRegistry);							
				}
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}		
}
