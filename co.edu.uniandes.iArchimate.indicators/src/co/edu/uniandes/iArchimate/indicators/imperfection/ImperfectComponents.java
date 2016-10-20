package co.edu.uniandes.iArchimate.indicators.imperfection;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;

import co.edu.uniandes.iArchimate.indicators.Indicator;
import co.edu.uniandes.iArchimate.indicators.IndicatorReport;
import co.edu.uniandes.iArchimate.utilities.emf.ModelUtilities;

public class ImperfectComponents extends Indicator {

	public ImperfectComponents(){
		super();
	}

	@Override
	public void calculateIndicator(){
		this.indicatorReport = new IndicatorReport(new String[]{"Component","Total","Imperfect","Percentage"});			
		ArrayList<EObject> attributes = ModelUtilities.getAttributes(this.activeModel);
		ArrayList<EObject> imperfectAttributes = ModelUtilities.getImperfectAttributes(this.activeModel);
		ArrayList<EObject> relations = ModelUtilities.getRelations(this.activeModel);
		ArrayList<EObject> imperfectRelations = ModelUtilities.getImperfectRelations(this.activeModel);

		this.registry=new String[4];
		this.registry[0]="Arttribute";
		this.registry[1]=String.valueOf(attributes.size());
		this.registry[2]=String.valueOf(imperfectAttributes.size());
		this.registry[3]=String.valueOf(((float)imperfectAttributes.size()/(float)attributes.size())*100);
		this.indicatorReport.addRegistry(this.registry);

		this.registry=new String[4];
		this.registry[0]="Relation";
		this.registry[1]=String.valueOf(relations.size());
		this.registry[2]=String.valueOf(imperfectRelations.size());
		this.registry[3]=String.valueOf(((float)imperfectRelations.size()/(float)relations.size())*100);
		this.indicatorReport.addRegistry(this.registry);								
	}
}
