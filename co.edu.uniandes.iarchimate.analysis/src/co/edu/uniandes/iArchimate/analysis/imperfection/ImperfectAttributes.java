package co.edu.uniandes.iArchimate.analysis.imperfection;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import co.edu.uniandes.iArchimate.analysis.AnalysisMethodReport;
import co.edu.uniandes.iArchimate.utilities.emf.MetaModelUtilities;
import co.edu.uniandes.iArchimate.utilities.emf.ModelUtilities;

public class ImperfectAttributes extends AnalysisMethodImperfection {


	public ImperfectAttributes(){
		super();
	}

	@Override
	public void performAnalysisMethod(){
		try {
			ArrayList<EObject> attributes = ModelUtilities.getAttributes(this.activeModel);
			String []imperfectAttributeTypes = {"Imprecise","Inconsistent","Uncertain","Vague","Incomplete"};
			int []imperfectAttributesByType = new int[imperfectAttributeTypes.length];
			EClass imperfectAttributeClass = MetaModelUtilities.findEClass(this.intermediateMetaModel, "ImperfectAttribute");
			EAttribute imperfectAttributeType = MetaModelUtilities.findEAttribute(imperfectAttributeClass, "imperfectionType");
			ArrayList<EObject> imperfectAttributes = ModelUtilities.getImperfectAttributes(this.activeModel);
			for(EObject imperfectAttribute : imperfectAttributes){
				String imperfectionType = imperfectAttribute.eGet(imperfectAttributeType).toString();
				if(imperfectionType.equals("NumericRange")){
					imperfectAttributesByType[0]++;
				}else if(imperfectionType.equals("NumericSet") || imperfectionType.equals("StringSet")){
					imperfectAttributesByType[1]++;
				}else if(imperfectionType.equals("NumericValueCertaintyDegree") || imperfectionType.equals("StringValueCertaintyDegree")){
					imperfectAttributesByType[2]++;
				}else if(imperfectionType.equals("LinguisticValue")){
					imperfectAttributesByType[3]++;
				}else if(imperfectionType.equals("NoValue")){
					imperfectAttributesByType[4]++;
				}
			}
			double p;
			String [] chartRegistry = new String[2]; 
			p = ((double)(attributes.size()-imperfectAttributes.size())/(double)attributes.size())*100;
			p = Math.round(p*100);
			p/=100;
			chartRegistry[0] = "Non Imperfect Attributes\n"+"Amount: "+(attributes.size()-imperfectAttributes.size())+"\nPercentage: "+p+"%";
			chartRegistry[1] = String.valueOf(attributes.size()-imperfectAttributes.size());
			this.chartDataReport.add(chartRegistry);							
			this.analysisMethodReport = new AnalysisMethodReport(new String[]{"Imperfect Attribute Type","Imperfect Attributes","Percentage"});			
			for(int i=0; i<imperfectAttributeTypes.length; i++){
				this.registry=new String[this.analysisMethodReport.getTitles().length];
				this.registry[0]=imperfectAttributeTypes[i];
				this.registry[1]=String.valueOf(imperfectAttributesByType[i]);				
				p = ((double)imperfectAttributesByType[i]/(double)attributes.size())*100;
				p = Math.round(p*100);
				p/=100;
				this.registry[2]=String.valueOf(p);								
				this.analysisMethodReport.addRegistry(this.registry);
				chartRegistry = new String[2];
				chartRegistry[0] = imperfectAttributeTypes[i] + " Attributes\n"+"Amount: "+imperfectAttributesByType[i]+"\nPercentage: "+p+"%";
				chartRegistry[1] = String.valueOf(imperfectAttributesByType[i]);
				this.chartDataReport.add(chartRegistry);							
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
