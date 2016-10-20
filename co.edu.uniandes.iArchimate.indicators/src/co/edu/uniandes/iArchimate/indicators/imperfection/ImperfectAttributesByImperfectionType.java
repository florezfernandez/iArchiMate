package co.edu.uniandes.iArchimate.indicators.imperfection;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import co.edu.uniandes.iArchimate.indicators.Indicator;
import co.edu.uniandes.iArchimate.indicators.IndicatorReport;
import co.edu.uniandes.iArchimate.utilities.emf.MetaModelUtilities;
import co.edu.uniandes.iArchimate.utilities.ocl.OclHandler;

public class ImperfectAttributesByImperfectionType extends Indicator {

	public ImperfectAttributesByImperfectionType(){
		super();
	}

	@SuppressWarnings("unchecked")
	@Override
	public void calculateIndicator(){
		try {
			String []imperfectAttributeTypes = {"NumericRange","NumericSet","StringSet","NumericValueCertaintyDegree","StringValueCertaintyDegree","LinguisticValue","NoValue"};
			int []imperfectAttributesByType = new int[imperfectAttributeTypes.length];
			EClass attributeClass = MetaModelUtilities.findEClass(this.intermediateMetaModel, "ImperfectAttribute");
			EAttribute imperfectAttributeType = MetaModelUtilities.findEAttribute(attributeClass, "imperfectionType");

			ArrayList<EObject> imperfectAttributes = new ArrayList<EObject>();
			OclHandler oclHandler = new OclHandler(activeModel);			
			imperfectAttributes = (ArrayList<EObject>)oclHandler.evaluate("ImperfectAttribute.allInstances()->asSequence()");
			for(EObject imperfectAttribute : imperfectAttributes){
				String tempType = imperfectAttribute.eGet(imperfectAttributeType).toString();
				for(int i=0; i<imperfectAttributeTypes.length; i++){					
					if(tempType.equals(imperfectAttributeTypes[i])){
						imperfectAttributesByType[i]++;
						break;
					}
				}
			}
			
			this.indicatorReport = new IndicatorReport(new String[]{"Imperfection Type","Imperfect Attributes"});						
			
			for(int i=0; i<imperfectAttributeTypes.length; i++){
				this.registry=new String[2];
				this.registry[0]=imperfectAttributeTypes[i];
				this.registry[1]=String.valueOf(imperfectAttributesByType[i]);				
				this.indicatorReport.addRegistry(this.registry);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
