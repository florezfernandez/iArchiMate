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

public class ImperfectAttributesByTypeAndName extends AnalysisMethodImperfection {

	private EClass eClassElement;
	private EReference eReferenceAttributesInElement;
	private EEnum eEnumElementTypeName;
	private String[] elementTypes;
	private EAttribute eAttributeTypeNameInElement;
	private EClass eClassAttribute;
	private EAttribute eAttributeNameInAttribute; 

	public ImperfectAttributesByTypeAndName(){
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
			
			this.analysisMethodReport = new AnalysisMethodReport(new String[]{"Element","Attribute","Total","Imperfect","Percentage"});			
			double p;
			for(String elementType : this.elementTypes){
				ElementHelper elementHelper = elementHelpers.get(elementType);
				if(elementHelper!=null){
					for(String attributeName : elementHelper.getAttributeNames()){
						AttributeHelper attributeHelper = elementHelper.getAttributeHelpers().get(attributeName);
						this.registry=new String[this.analysisMethodReport.getTitles().length];
						this.registry[0]=elementType;
						this.registry[1]=attributeName;
						this.registry[2]=String.valueOf(attributeHelper.getTotalAttributes());
						this.registry[3]=String.valueOf(attributeHelper.getImperfectAttributes());
						p = ((double)attributeHelper.getImperfectAttributes()/(double)attributeHelper.getTotalAttributes())*100;
						p = Math.round(p*100);
						p/=100;
						this.registry[4]=String.valueOf(p);
						this.analysisMethodReport.addRegistry(this.registry);					
					}					
				}
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}		
}
