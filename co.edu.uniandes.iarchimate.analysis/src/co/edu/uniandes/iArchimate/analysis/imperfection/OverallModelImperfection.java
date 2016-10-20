package co.edu.uniandes.iArchimate.analysis.imperfection;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import co.edu.uniandes.iArchimate.analysis.AnalysisMethodReport;
import co.edu.uniandes.iArchimate.utilities.emf.MetaModelUtilities;
import co.edu.uniandes.iArchimate.utilities.emf.ModelUtilities;

public class OverallModelImperfection extends AnalysisMethodImperfection {

	private EClass eClassElement;
	private EClass eClassAbsentElement;
	private EClass eClassImperfectAttribute;
	private EClass eClassImperfectRelation;
	private EReference eReferenceAttributesInElement;
	private EReference eReferenceRelationsInElement;

	public OverallModelImperfection(){
		super();
	}

	@Override
	public void performAnalysisMethod(){
		try {
			this.eClassElement = MetaModelUtilities.findEClass(this.intermediateMetaModel, "Element");
			this.eClassAbsentElement = MetaModelUtilities.findEClass(this.intermediateMetaModel, "AbsentElement");
			this.eClassImperfectAttribute = MetaModelUtilities.findEClass(this.intermediateMetaModel, "ImperfectAttribute");
			this.eClassImperfectRelation = MetaModelUtilities.findEClass(this.intermediateMetaModel, "ImperfectRelation");
			this.eReferenceAttributesInElement = MetaModelUtilities.findEReference(eClassElement, "attributes");						
			this.eReferenceRelationsInElement = MetaModelUtilities.findEReference(eClassElement, "relations");						
			this.analysisMethodReport = new AnalysisMethodReport(new String[]{"Component","Total","Imperfect","Percentage"});			
			ArrayList<EObject> attributes = ModelUtilities.getAttributes(this.activeModel);
			ArrayList<EObject> imperfectAttributes = ModelUtilities.getImperfectAttributes(this.activeModel);
			ArrayList<EObject> relations = ModelUtilities.getRelations(this.activeModel);
			ArrayList<EObject> imperfectRelations = ModelUtilities.getImperfectRelations(this.activeModel);
			ArrayList<EObject> elements = ModelUtilities.getElements(this.activeModel);

			double p;
			this.registry=new String[this.analysisMethodReport.getTitles().length];
			this.registry[0]="Arttribute";
			this.registry[1]=String.valueOf(attributes.size());
			this.registry[2]=String.valueOf(imperfectAttributes.size());
			p = ((double)imperfectAttributes.size()/(double)attributes.size())*100;
			p = Math.round(p*100);
			p/=100;
			this.registry[3]=String.valueOf(p);
			this.analysisMethodReport.addRegistry(this.registry);

			this.registry=new String[this.analysisMethodReport.getTitles().length];
			this.registry[0]="Relation";
			this.registry[1]=String.valueOf(relations.size());
			this.registry[2]=String.valueOf(imperfectRelations.size());
			p = ((double)imperfectRelations.size()/(double)relations.size())*100;
			p = Math.round(p*100);
			p/=100;
			this.registry[3]=String.valueOf(p);
			this.analysisMethodReport.addRegistry(this.registry);								

			int numImperfectElements = 0;
			for(EObject element : elements){
				if(isImperfectElement(element)){
					numImperfectElements++;
				}
			}			

			this.registry=new String[this.analysisMethodReport.getTitles().length];
			this.registry[0]="Element";
			this.registry[1]=String.valueOf(elements.size());
			this.registry[2]=String.valueOf(numImperfectElements);
			p = ((double)numImperfectElements/(double)elements.size())*100;
			p = Math.round(p*100);
			p/=100;
			this.registry[3]=String.valueOf(p);
			this.analysisMethodReport.addRegistry(this.registry);								

		} catch (Exception e) {
			e.printStackTrace();
		}
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
