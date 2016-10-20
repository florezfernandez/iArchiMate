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

public class ImperfectRelationsByType extends AnalysisMethodImperfection {

	private EClass eClassElement;
	private EReference eReferenceRelationsInElement;
	private EEnum eEnumElementTypeName;
	private String[] elementTypes;
	private EAttribute eAttributeTypeNameInElement;
	private EClass eClassRelation;
	private EAttribute eAttributeTypeNameInRelation; 

	public ImperfectRelationsByType(){
		super();
	}

	@SuppressWarnings("unchecked")
	@Override
	public void performAnalysisMethod(){
		try {
			this.eClassElement = MetaModelUtilities.findEClass(this.intermediateMetaModel, "Element");
			this.eClassRelation = MetaModelUtilities.findEClass(this.intermediateMetaModel, "Relation");
			this.eAttributeTypeNameInElement = MetaModelUtilities.findEAttribute(eClassElement, "typeName");						
			this.eReferenceRelationsInElement = MetaModelUtilities.findEReference(eClassElement, "relations");						
			this.eAttributeTypeNameInRelation = MetaModelUtilities.findEAttribute(eClassRelation, "typeName");						
			this.eEnumElementTypeName = MetaModelUtilities.findEEnum(this.intermediateMetaModel, "ElementTypeName");
			
			HashMap<String, ElementHelper> elementHelpers = new HashMap<String, ElementHelper>(); 
			this.elementTypes = new String[this.eEnumElementTypeName.eContents().size()-1];  
			for(int i=0; i<this.elementTypes.length; i++){
				this.elementTypes[i]=MetaModelUtilities.findEEnumLiteral(this.eEnumElementTypeName, i).getName();
			}

			ArrayList<EObject> elements =  ModelUtilities.getElements(this.activeModel);
			
			for(EObject element : elements){
				String elementName = element.eGet(this.eAttributeTypeNameInElement).toString();
				EList<EObject> relationsOfElement = (EList<EObject>)element.eGet(this.eReferenceRelationsInElement);
				for(EObject relation : relationsOfElement){
					String relationTypeName = relation.eGet(this.eAttributeTypeNameInRelation).toString();
					ElementHelper elementHelper = elementHelpers.get(elementName);
					if(elementHelper==null){
						ElementHelper newElementHelper = new ElementHelper(0);
						elementHelpers.put(elementName, newElementHelper);
						newElementHelper.addRelation(relationTypeName, relation.eClass().getName().equals("ImperfectRelation"));
					}else{
						elementHelper.addRelation(relationTypeName, relation.eClass().getName().equals("ImperfectRelation"));
					}			
				}
			}
			
			this.analysisMethodReport = new AnalysisMethodReport(new String[]{"Element","Total","Imperfect","Percentage"});			
			double p;
			for(String elementType : this.elementTypes){
				int numOfRelations=0;
				int numOfImperfectRelations=0;
				ElementHelper elementHelper = elementHelpers.get(elementType);
				if(elementHelper!=null){
					for(String relationTypeName : elementHelper.getRelationTypeNames()){
						RelationHelper relationHelper = elementHelper.getRelationHelpers().get(relationTypeName);
						numOfRelations+=relationHelper.getTotalRelations();
						numOfImperfectRelations+=relationHelper.getImperfectRelations();
					}					
				}
				if(numOfRelations>0){
					this.registry=new String[this.analysisMethodReport.getTitles().length];
					this.registry[0]=elementType;
					this.registry[1]=String.valueOf(numOfRelations);
					this.registry[2]=String.valueOf(numOfImperfectRelations);
					p = ((double)numOfImperfectRelations/(double)numOfRelations)*100;
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
}
