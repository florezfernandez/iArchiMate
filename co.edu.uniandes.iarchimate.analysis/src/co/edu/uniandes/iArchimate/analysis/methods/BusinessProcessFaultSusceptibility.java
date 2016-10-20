package co.edu.uniandes.iArchimate.analysis.methods;

import iArchimate.Attribute;
import iArchimate.AttributeTypeValue;
import iArchimate.Component;
import iArchimate.IArchimateFactory;
import iArchimate.Relation;
import iArchimate.impl.ElementImpl;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import co.edu.uniandes.iArchimate.analysis.AdditionalAttribute;
import co.edu.uniandes.iArchimate.analysis.AffectedConcept;
import co.edu.uniandes.iArchimate.analysis.AnalysisMethodReport;

public class BusinessProcessFaultSusceptibility extends AnalysisMethod {

	public BusinessProcessFaultSusceptibility() {
		super();
		this.concept=AnalysisMethodHelper.BUSINESS_PROCESS;
		this.analysisMethod=AnalysisMethodHelper.FAULT_SUSCEPTIBILITY;
		this.validationFileName=AnalysisMethodHelper.BUSINESS_PROCESS_FAULT_SUSCEPTIBILITY;
	}

	@Override
	public String getDescription() {
		return "Calculates the level of fault susceptibility of all business processes based on the availability of the application components and application services that support it. "
				+ "The availability value of application services is calculated if possible.";
	}

	@Override
	public void initAffectedConcepts() {
		AffectedConcept affectedConcept;
		affectedConcept = new AffectedConcept("BusinessProcess");
		affectedConcept.addAttribute("faultSusceptibility", AdditionalAttribute.DOUBLE, "> 0 and < 1", AdditionalAttribute.CALCULATED);
		this.affectedConcepts.add(affectedConcept);
		affectedConcept = new AffectedConcept("ApplicationComponent");
		affectedConcept.addAttribute("availability", AdditionalAttribute.DOUBLE, "> 0 and < 1", AdditionalAttribute.MANDATORY);
		this.affectedConcepts.add(affectedConcept);
		affectedConcept = new AffectedConcept("ApplicationService");
		affectedConcept.addAttribute("availability", AdditionalAttribute.DOUBLE, "> 0 and < 1", AdditionalAttribute.CALCULATED_IF_POSSIBLE);
		this.affectedConcepts.add(affectedConcept);
	}

	@Override
	public String performAnalysisMethod() {
		try {
			ArrayList<ElementImpl> businessProcesses = findArrayOfElementImpl("BusinessProcess");
			ArrayList<ElementImpl> applicationComponents = findArrayOfElementImpl("ApplicationComponent");
			ArrayList<ElementImpl> applicationServices = findArrayOfElementImpl("ApplicationService");
			this.analysisMethodReport = new AnalysisMethodReport(new String[]{"Component Type","Name","Attribute=Value","Associated Components","Action"});			
			ArrayList<ArrayList<ElementImpl>> collectionOfSources = new ArrayList<ArrayList<ElementImpl>>();
			collectionOfSources.add(applicationComponents);
			calculateAndCreateDoubleAttribute(applicationServices, collectionOfSources, AnalysisMethodHelper.ATT_AVAILABILITY, AnalysisMethodHelper.ATT_AVAILABILITY);
			collectionOfSources.add(applicationServices);
			this.calculateAndCreateDoubleAttribute(businessProcesses, collectionOfSources, AnalysisMethodHelper.ATT_FAULT_SUCSEPTIBILITY, AnalysisMethodHelper.ATT_AVAILABILITY);			
			ArrayList<ElementImpl> rootBusinessProcesses = findArrayOfRootElementImpl("BusinessProcess");
			this.calculateAttributeInRecursiveBusinessProcesses(rootBusinessProcesses, AnalysisMethodHelper.ATT_FAULT_SUCSEPTIBILITY);
			return this.concept + " " + this.analysisMethod + "\n  The analysis method was executed correctly.\n  See the iArchiMate Analysis Results view for more details"; 
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	public void calculateAttributeInRecursiveBusinessProcesses(ArrayList<ElementImpl> businessProcesses, String attributeName){
		for(ElementImpl businessProcess : businessProcesses){
			EList<Component> subComponents = businessProcess.getComponents();
			ArrayList<ElementImpl> subBusinessProcesses = new ArrayList<ElementImpl>();				
			for(Component subComponent : subComponents){
				if(subComponent instanceof ElementImpl){
					ElementImpl subBusinessProcess = (ElementImpl)subComponent;
					if(subBusinessProcess.getTypeName().getName().equals("BusinessProcess")){
						subBusinessProcesses.add(subBusinessProcess);
					}
				}
			}
			EList<Relation> businessProcessRelations = businessProcess.getRelations();
			for(Relation businessProcessRelation : businessProcessRelations){
				if(businessProcessRelation.getTypeName().getName().equals("Composition")){
					if(businessProcessRelation.getTarget().getTypeName().equals("BusinessProcess")){
						ElementImpl subBusinessProcess = (ElementImpl)businessProcessRelation.getTarget();
						if(subBusinessProcesses.contains(subBusinessProcess)){
							subBusinessProcesses.add(subBusinessProcess);													
						}
					}
				}
			}
			
			if(subBusinessProcesses.size()>0){
				this.calculateAttributeInRecursiveBusinessProcesses(subBusinessProcesses, attributeName);							
			}
			
			double attributeValue = 0;
			int numberOfSources = 0;
			String associatedSources="";
			for(ElementImpl subBusinessProcess : subBusinessProcesses){
				Attribute attribute = getAttributeInElement(subBusinessProcess, attributeName);
				if(attribute != null){
					double attributeInSubBusinessProcess = Double.parseDouble(attribute.getValue());
					attributeValue += Double.parseDouble(attribute.getValue());
					numberOfSources++;
					associatedSources+=subBusinessProcess.getName()+":"+attributeName+"="+attributeInSubBusinessProcess+". ";							
				}
			}
			if(attributeValue != 0){
				attributeValue=(double)(Math.round(attributeValue*10000))/10000;
				Attribute newAttribute = IArchimateFactory.eINSTANCE.createAttribute();
				newAttribute.setName(attributeName);
				newAttribute.setType(AttributeTypeValue.EDOUBLE);
				newAttribute.setValue(String.valueOf(attributeValue));			
				String []registry = new String[this.analysisMethodReport.getTitles().length];
				registry[0]=businessProcess.getTypeName().getName();
				registry[1]=businessProcess.getName();
				registry[2]=String.valueOf(attributeValue);
				registry[3]="("+numberOfSources+") "+associatedSources;
				registry[4]=createOrUpdateAttributeInElementImpl(businessProcess, newAttribute);
				this.analysisMethodReport.addRegistry(registry);								
			}
		}
	}

	private Attribute getAttributeInElement(ElementImpl subBusinessProcess, String attributeName) {
		for(Attribute attribute : subBusinessProcess.getAttributes()){
			if(attribute.getName().equals(attributeName)){
				return attribute;
			}
		}
		return null;
	}

}
