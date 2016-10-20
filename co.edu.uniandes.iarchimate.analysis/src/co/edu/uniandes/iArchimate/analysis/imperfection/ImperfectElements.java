package co.edu.uniandes.iArchimate.analysis.imperfection;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import co.edu.uniandes.iArchimate.analysis.AnalysisMethodReport;
import co.edu.uniandes.iArchimate.utilities.emf.MetaModelUtilities;
import co.edu.uniandes.iArchimate.utilities.emf.ModelUtilities;

public class ImperfectElements extends AnalysisMethodImperfection {

	private EClass eClassElement;
	private EClass eClassAbsentElement;
	private EClass eClassImperfectAttribute;
	private EClass eClassImperfectRelation;
	private EReference eReferenceAttributesInElement;
	private EReference eReferenceRelationsInElement;

	public ImperfectElements(){
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
			ArrayList<EObject> elements = ModelUtilities.getElements(this.activeModel);
			String []imperfectElementTypes = {"Absent Elements","Elements with Imperfect Attributes","Elements with Imperfect Relations"};
			int []imperfectElementsByType = new int[imperfectElementTypes.length];
			for(EObject element : elements){
				if(isAbsentElement(element)){
					imperfectElementsByType[0]++;
				}
				if(hasImperfectAttributes(element)){
					imperfectElementsByType[1]++;
				}
				if(hasImperfectRelations(element)){
					imperfectElementsByType[2]++;
				}
			}			
			this.analysisMethodReport = new AnalysisMethodReport(new String[]{"Imperfect Element Type","Imperfect Elements","Percentage"});			
			double p;
			for(int i=0; i<imperfectElementTypes.length; i++){
				this.registry=new String[this.analysisMethodReport.getTitles().length];
				this.registry[0]=imperfectElementTypes[i];
				this.registry[1]=String.valueOf(imperfectElementsByType[i]);				
				p = ((double)imperfectElementsByType[i]/(double)elements.size())*100;
				p = Math.round(p*100);
				p/=100;
				this.registry[2]=String.valueOf(p);								
				this.analysisMethodReport.addRegistry(this.registry);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private boolean isAbsentElement(EObject element) {
		if(element.eClass() == this.eClassAbsentElement){
			return true;
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	private boolean hasImperfectAttributes(EObject element) {
		List<EObject> attributes = (List<EObject>)element.eGet(eReferenceAttributesInElement);
		for(EObject attribute : attributes){
			if(attribute.eClass() == this.eClassImperfectAttribute){
				return true;
			}
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	private boolean hasImperfectRelations(EObject element) {
		List<EObject> relations = (List<EObject>)element.eGet(eReferenceRelationsInElement);
		for(EObject relation : relations){
			if(relation.eClass() == this.eClassImperfectRelation){
				return true;
			}
		}
		return false;
	}
	
}
