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

public class ImperfectComponentsByRelation extends Indicator {
	
	public ImperfectComponentsByRelation(){
		super();
	}
		
	@SuppressWarnings("unchecked")
	@Override
	public void calculateIndicator(){
		try {
			HashMap<String, ElementHelper> elementHelpers = new HashMap<String, ElementHelper>(); 
			ArrayList<String> elementNames = new ArrayList<String>();
			
			EClass elementClass = MetaModelUtilities.findEClass(this.intermediateMetaModel, "Element");
			EReference referenceOfRelations = MetaModelUtilities.findEReference(elementClass, "relations");
			EAttribute typeNameAttributeInElement = MetaModelUtilities.findEAttribute(elementClass, "typeName");

			EClass relationClass = MetaModelUtilities.findEClass(this.intermediateMetaModel, "Relation");
			EAttribute typeNameAttributeInRelation = MetaModelUtilities.findEAttribute(relationClass, "typeName");
			
			ArrayList<EObject> elements = new ArrayList<EObject>();
			OclHandler oclHandler = new OclHandler(activeModel);			
			elements = (ArrayList<EObject>)oclHandler.evaluate("Element.allInstances()->asSequence()");
			
			for(EObject element : elements){
				String elementName = element.eGet(typeNameAttributeInElement).toString();
				EList<EObject> relationsOfElement = (EList<EObject>)element.eGet(referenceOfRelations);
				for(EObject relation : relationsOfElement){
					String relationTypeName = relation.eGet(typeNameAttributeInRelation).toString();
					ElementHelper elementHelper = elementHelpers.get(elementName);
					if(elementHelper==null){
						ElementHelper newElementHelper = new ElementHelper(0);
						elementHelpers.put(elementName, newElementHelper);
						elementNames.add(elementName);
						newElementHelper.addRelation(relationTypeName, relation.eClass().getName().equals("ImperfectRelation"));
					}else{
						elementHelper.addRelation(relationTypeName, relation.eClass().getName().equals("ImperfectRelation"));
					}			
				}
			}
			
			this.indicatorReport = new IndicatorReport(new String[]{"Element","Relation","Total","Imperfect","Percentage"});						
			for(String elementName : elementNames){
				ElementHelper elementHelper = elementHelpers.get(elementName);
				for(String relationTypeName : elementHelper.getRelationTypeNames()){
					RelationHelper relationHelper = elementHelper.getRelationHelpers().get(relationTypeName);
					this.registry=new String[5];
					this.registry[0]=elementName;
					this.registry[1]=relationTypeName;
					this.registry[2]=String.valueOf(relationHelper.getTotalRelations());
					this.registry[3]=String.valueOf(relationHelper.getImperfectRelatinos());
					this.registry[4]=String.valueOf(((float)relationHelper.getImperfectRelatinos()/(float)relationHelper.getTotalRelations())*100);
					this.indicatorReport.addRegistry(this.registry);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
