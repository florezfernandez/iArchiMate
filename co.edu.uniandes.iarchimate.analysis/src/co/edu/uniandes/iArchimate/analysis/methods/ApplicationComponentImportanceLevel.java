package co.edu.uniandes.iArchimate.analysis.methods;

import iArchimate.Attribute;
import iArchimate.AttributeTypeValue;
import iArchimate.IArchimateFactory;
import iArchimate.Relation;
import iArchimate.impl.ElementImpl;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import co.edu.uniandes.iArchimate.analysis.AdditionalAttribute;
import co.edu.uniandes.iArchimate.analysis.AffectedConcept;
import co.edu.uniandes.iArchimate.analysis.AnalysisMethodReport;

public class ApplicationComponentImportanceLevel extends AnalysisMethod {

	public ApplicationComponentImportanceLevel() {
		super();
		this.concept=AnalysisMethodHelper.APPLICATION_COMPONENT;
		this.analysisMethod=AnalysisMethodHelper.IMPORTANCE_LEVEL;
		this.validationFileName=AnalysisMethodHelper.APPLICATION_COMPONENT_IMPORTANCE_LEVEL;
	}
	
	@Override
	public String getDescription() {
		return "Calculates the importance level of all application components and application services based on the ammount of business processes that they support. "
				+ "The importance level values of application components are calculated taking into account the importance level of all application services that they support.";
	}

	@Override
	public void initAffectedConcepts() {
		AffectedConcept affectedConcept;
		affectedConcept = new AffectedConcept("ApplicationComponent");
		affectedConcept.addAttribute("availability", AdditionalAttribute.DOUBLE, "> 0 and < 1", AdditionalAttribute.CALCULATED);
		this.affectedConcepts.add(affectedConcept);
		affectedConcept = new AffectedConcept("ApplicationService");
		affectedConcept.addAttribute("availability", AdditionalAttribute.DOUBLE, "> 0 and < 1", AdditionalAttribute.CALCULATED_IF_POSSIBLE);
		this.affectedConcepts.add(affectedConcept);
		affectedConcept = new AffectedConcept("BusinessProcess");
		this.affectedConcepts.add(affectedConcept);
	}

	@Override
	public String performAnalysisMethod() {
		try {
			ArrayList<ElementImpl> businessProcesses = findArrayOfElementImpl(AnalysisMethodHelper.BUSINESS_PROCESS);
			ArrayList<ElementImpl> applicationComponents = findArrayOfElementImpl(AnalysisMethodHelper.APPLICATION_COMPONENT);
			ArrayList<ElementImpl> applicationServices = findArrayOfElementImpl(AnalysisMethodHelper.APPLICATION_SERVICE);
			ArrayList<ElementImpl> involvedBusinessProcesses = new ArrayList<ElementImpl>(); 
			findInvolvedBusinessProcesses(businessProcesses, applicationComponents, involvedBusinessProcesses);
			findInvolvedBusinessProcesses(businessProcesses, applicationServices, involvedBusinessProcesses);
			this.analysisMethodReport = new AnalysisMethodReport(new String[]{"Component Type","Name","Attribute=Value","Associated Components","Action"});			
			calculateImportanceLevel(applicationComponents, involvedBusinessProcesses.size());
			return this.concept + " " + this.analysisMethod + "\n  The analysis method was executed correctly.\n  See the iArchiMate Analysis Results view for more details"; 
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	private void calculateImportanceLevel(ArrayList<ElementImpl> applicationComponents, int amountOfBusinessProcesses) {
		for(ElementImpl applicationComponent : applicationComponents){
			int amountOfBusinessProcessesInApplicationComponent=0;
			ArrayList<ElementImpl> associatedBusinessProcessesInApplicationComponent = new ArrayList<ElementImpl>();
			EList<Relation> applicationComponentRelations = applicationComponent.getRelations();
			for(Relation applicationComponentRelation : applicationComponentRelations){
				int amountOfBusinessProcessesInApplicationServices=0;
				ArrayList<ElementImpl> associatedBusinessProcessesInApplicationService = new ArrayList<ElementImpl>();
				if(applicationComponentRelation.getTarget().getTypeName().getName().equals(AnalysisMethodHelper.APPLICATION_SERVICE)){
					ElementImpl applicationService = (ElementImpl) applicationComponentRelation.getTarget();
					EList<Relation> applicationServiceRelations = applicationService.getRelations();
					for(Relation applicationServiceRelation : applicationServiceRelations){
						if(applicationServiceRelation.getTarget().getTypeName().getName().equals(AnalysisMethodHelper.BUSINESS_PROCESS)){
							ElementImpl businessProcess = (ElementImpl) applicationServiceRelation.getTarget();
							associatedBusinessProcessesInApplicationService.add(businessProcess);
							if(!associatedBusinessProcessesInApplicationComponent.contains(businessProcess)){
								associatedBusinessProcessesInApplicationComponent.add(businessProcess);
							}
							amountOfBusinessProcessesInApplicationServices++;
							amountOfBusinessProcessesInApplicationComponent++;
						}
					}
					addRegistry(applicationService, amountOfBusinessProcessesInApplicationServices, associatedBusinessProcessesInApplicationService, amountOfBusinessProcesses);
				}else if(applicationComponentRelation.getTarget().getTypeName().getName().equals(AnalysisMethodHelper.BUSINESS_PROCESS)){
					ElementImpl businessProcess = (ElementImpl) applicationComponentRelation.getTarget();
					associatedBusinessProcessesInApplicationComponent.add(businessProcess);
					amountOfBusinessProcessesInApplicationComponent++;
				}
			}			
			addRegistry(applicationComponent, amountOfBusinessProcessesInApplicationComponent, associatedBusinessProcessesInApplicationComponent, amountOfBusinessProcesses);
		}
	}

	private void addRegistry(ElementImpl applicationServiceOrComponent, int amountOfApplicationServicesOrComponents, ArrayList<ElementImpl> associatedBusinessProcesses, int amountOfBusinessProcesses) {
		double attributeValue = ((double)amountOfApplicationServicesOrComponents)/((double)amountOfBusinessProcesses); 
		attributeValue=(double)(Math.round(attributeValue*10000))/10000;
		Attribute newAttribute = IArchimateFactory.eINSTANCE.createAttribute();
		newAttribute.setName(AnalysisMethodHelper.ATT_IMPORTANCE_LEVEL);
		newAttribute.setType(AttributeTypeValue.EDOUBLE);
		newAttribute.setValue(String.valueOf(attributeValue));			
		String []registry = new String[this.analysisMethodReport.getTitles().length];
		registry[0]=applicationServiceOrComponent.getTypeName().getName();
		registry[1]=applicationServiceOrComponent.getName();
		registry[2]=AnalysisMethodHelper.ATT_IMPORTANCE_LEVEL+"="+String.valueOf(attributeValue);
		String associatedSources="";
		for(ElementImpl associatedBusinessProcess : associatedBusinessProcesses){
			associatedSources+=associatedBusinessProcess.getName()+", ";
		}
		if(associatedSources!=""){
			associatedSources=associatedSources.substring(0,associatedSources.length()-2);			
		}
		registry[3]="("+associatedBusinessProcesses.size()+") "+associatedSources;
		registry[4]=createOrUpdateAttributeInElementImpl(applicationServiceOrComponent, newAttribute);
		this.analysisMethodReport.addRegistry(registry);				

	}

	private ArrayList<ElementImpl> findInvolvedBusinessProcesses(ArrayList<ElementImpl> businessProcesses, ArrayList<ElementImpl> applicationComponentsOrServices, ArrayList<ElementImpl> involvedBusinessProcesses) {
		for(ElementImpl businessProcess : businessProcesses){
			for(ElementImpl applicationComponentOrService : applicationComponentsOrServices){
				EList<Relation> applicationComponentOrServiceRelations = applicationComponentOrService.getRelations();
				for(Relation applicationComponentOrServiceRelation : applicationComponentOrServiceRelations){
					if(applicationComponentOrServiceRelation.getTarget()==businessProcess){
						if(!involvedBusinessProcesses.contains(businessProcess)){
							involvedBusinessProcesses.add((ElementImpl) applicationComponentOrServiceRelation.getTarget());							
						}
					}
				}
			}
		}		
		return involvedBusinessProcesses;
	}
}
