package co.edu.uniandes.iArchimate.analysis.imperfection;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import co.edu.uniandes.iArchimate.analysis.AnalysisMethodReport;
import co.edu.uniandes.iArchimate.utilities.emf.MetaModelUtilities;
import co.edu.uniandes.iArchimate.utilities.emf.ModelUtilities;

public class ImperfectRelations extends AnalysisMethodImperfection {

	public ImperfectRelations(){
		super();
	}

	@Override
	public void performAnalysisMethod(){
		try {
			ArrayList<EObject> relations = ModelUtilities.getRelations(this.activeModel);
			String []imperfectRelationTypes = {"Inconsistent","Uncertain"};
			int []imperfectRelationsByType = new int[imperfectRelationTypes.length];
			EClass imperfectRelationClass = MetaModelUtilities.findEClass(this.intermediateMetaModel, "ImperfectRelation");
			EAttribute imperfectRelationType = MetaModelUtilities.findEAttribute(imperfectRelationClass, "imperfectionType");
			ArrayList<EObject> imperfectRelations = ModelUtilities.getImperfectRelations(this.activeModel);
			for(EObject imperfectRelation : imperfectRelations){
				String imperfectionType = imperfectRelation.eGet(imperfectRelationType).toString();
				if(imperfectionType.equals("InstanceSet")){
					imperfectRelationsByType[0]++;
				}else if(imperfectionType.equals("InstanceCertaintyDegree")){
					imperfectRelationsByType[1]++;
				}
			}
			
			this.analysisMethodReport = new AnalysisMethodReport(new String[]{"Imperfect Relation Type","Imperfect Relations","Percentage"});			
			double p;
			for(int i=0; i<imperfectRelationTypes.length; i++){
				this.registry=new String[this.analysisMethodReport.getTitles().length];
				this.registry[0]=imperfectRelationTypes[i];
				this.registry[1]=String.valueOf(imperfectRelationsByType[i]);				
				p = ((double)imperfectRelationsByType[i]/(double)relations.size())*100;
				p = Math.round(p*100);
				p/=100;
				this.registry[2]=String.valueOf(p);								
				this.analysisMethodReport.addRegistry(this.registry);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
