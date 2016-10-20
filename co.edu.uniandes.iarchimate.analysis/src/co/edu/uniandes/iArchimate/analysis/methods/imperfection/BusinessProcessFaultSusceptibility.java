package co.edu.uniandes.iArchimate.analysis.methods.imperfection;

import iArchimate.Attribute;
import iArchimate.ImperfectAttribute;
import iArchimate.Relation;
import iArchimate.impl.ElementImpl;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ListSelectionDialog;

import co.edu.uniandes.iArchimate.analysis.AdditionalAttribute;
import co.edu.uniandes.iArchimate.analysis.AffectedConcept;
import co.edu.uniandes.iArchimate.analysis.AnalysisMethodReport;
import co.edu.uniandes.iArchimate.analysis.methods.AnalysisMethod;
import co.edu.uniandes.iArchimate.analysis.methods.AnalysisMethodHelper;
import co.edu.uniandes.iArchimate.analysis.methods.imperfection.helper.DeltaResult;
import co.edu.uniandes.iArchimate.analysis.methods.imperfection.helper.ScenarioResult;
import co.edu.uniandes.iArchimate.analysis.methods.imperfection.helper.SpecificScenarioResult;

public class BusinessProcessFaultSusceptibility extends AnalysisMethod {
	private HashMap<String, String> parameters = new HashMap<String, String>();
	private ArrayList<String[]> availabilities;
	private ArrayList<ScenarioResult> scenarioResults = new ArrayList<ScenarioResult>();
	private ArrayList<DeltaResult> deltaResults = new ArrayList<DeltaResult>();
	
	public BusinessProcessFaultSusceptibility() {
		super();
		this.concept=AnalysisMethodHelper.APPLICATION_COMPONENT;
		this.analysisMethod=AnalysisMethodHelper.AVAILABILITY;
		this.validationFileName=AnalysisMethodHelper.APPLICATION_COMPONENT_AVAILABILITY;
	}
	
	@Override
	public String getDescription() {
		return "Calculates the availability of all application components based on the availability of the devices, system softwares, and infrastructure services that support it. "
				+ "The availability value of system softwares and infrastructure services are calculated if possible.";
	}

	@Override
	public void initAffectedConcepts() {
		AffectedConcept affectedConcept;
		affectedConcept = new AffectedConcept("ApplicationComponent");
		affectedConcept.addAttribute("availability", AdditionalAttribute.DOUBLE, "> 0 and < 1", AdditionalAttribute.CALCULATED);
		this.affectedConcepts.add(affectedConcept);
		affectedConcept = new AffectedConcept("Device");
		affectedConcept.addAttribute("availability", AdditionalAttribute.DOUBLE, "> 0 and < 1", AdditionalAttribute.MANDATORY);
		this.affectedConcepts.add(affectedConcept);
		affectedConcept = new AffectedConcept("SystemSoftware");
		affectedConcept.addAttribute("availability", AdditionalAttribute.DOUBLE, "> 0 and < 1", AdditionalAttribute.CALCULATED_IF_POSSIBLE);
		this.affectedConcepts.add(affectedConcept);
		affectedConcept = new AffectedConcept("InfrastructureService");
		affectedConcept.addAttribute("availability", AdditionalAttribute.DOUBLE, "> 0 and < 1", AdditionalAttribute.CALCULATED_IF_POSSIBLE);
		this.affectedConcepts.add(affectedConcept);
	}

	@Override
	public String performAnalysisMethod() {
		try {
			ArrayList<ElementImpl> businessProcesses = findArrayOfElementImpl("BusinessProcess");
			ArrayList<ElementImpl> applicationServices = findArrayOfElementImpl("ApplicationService");
			this.analysisMethodReport = new AnalysisMethodReport(new String[]{"Element Name"," ","Fault Succeptibility"});			
			ArrayList<ArrayList<ElementImpl>> collectionOfSources = new ArrayList<ArrayList<ElementImpl>>();
			collectionOfSources.add(applicationServices);
			calculateAvailability(businessProcesses, collectionOfSources);
			createPolarChart(applicationServices);
			createStackedBar3dChart(businessProcesses, applicationServices);
			return this.concept + " " + this.analysisMethod + "\n  The analysis method was executed correctly.\n  See the iArchiMate Analysis Results view for more details"; 
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage(); 
		}
	}

	private void createStackedBar3dChart(ArrayList<ElementImpl> businessProcesses, ArrayList<ElementImpl> applicationServices) {
		calculateAllDelta(applicationServices);
		HashMap<String, ArrayList<DeltaResult>> allResultsPerService = new HashMap<String, ArrayList<DeltaResult>>();
		for(ElementImpl applicationService : applicationServices){
			ArrayList<DeltaResult> resultsPerService = new ArrayList<DeltaResult>();
			for(DeltaResult deltaResult : this.deltaResults){
				if(applicationService.getName().equals(deltaResult.getSourceName())){
					resultsPerService.add(deltaResult);
				}
			}			
			allResultsPerService.put(applicationService.getName(), resultsPerService);
		}
				
		for(ElementImpl businessProcess : businessProcesses){
			for(ElementImpl applicationService : applicationServices){				
				String []attributes = getAttributeValues(applicationService.getName());
				double delta=0;
				if(attributes!=null){
					double []evaluationValues = new double[attributes.length]; 
					for(int i=0; i<attributes.length; i++){
						evaluationValues[i]= getEvaluationValue(allResultsPerService.get(applicationService.getName()), businessProcess.getName(), Double.parseDouble(attributes[i]));					
					}
					double minValue = 1;
					double maxValue = 0;
					for(int i=0; i<evaluationValues.length; i++){
						if(evaluationValues[i] < minValue){
							minValue = evaluationValues[i];
						}
						if(evaluationValues[i] > maxValue){
							maxValue = evaluationValues[i];
						}
					}
					delta = Math.round((maxValue-minValue)*1000);
					delta/=1000;					
				}
				if(delta!=0){
					String[] chartRegistry = new String[3];
					chartRegistry[0]=String.valueOf(delta);
					chartRegistry[1]=applicationService.getName();
					chartRegistry[2]=businessProcess.getName();
					this.stackedBarChartDataReport.add(chartRegistry);					
				}
			}
		}
		
	}

	private void createPolarChart(ArrayList<ElementImpl> applicationServices) {
		ArrayList<String> options = new ArrayList<String>();
		for(ElementImpl service : applicationServices){
			if(service.getRelations().size()>1 && hasImperfectAttribute(service, AnalysisMethodHelper.ATT_AVAILABILITY)){
				options.add(service.getName());				
			}
			
		}
		String []applicationServicesOptions = new String[options.size()];
		for(int i=0; i<options.size(); i++){
			applicationServicesOptions[i]=options.get(i);				
		}
		ListSelectionDialog listDialog = new ListSelectionDialog(Display.getCurrent().getActiveShell(), applicationServicesOptions, new ArrayContentProvider(), new LabelProvider(), "Select the services, for creating the polar chart");
	    listDialog.setTitle("Selection for Polar Chart");
	    listDialog.open();
	    Object[] dialogResult=listDialog.getResult();	    
		for(int i=0; i<dialogResult.length; i++){
			calculatePolarChartResults(dialogResult[i].toString());
		}
	}

	private boolean hasImperfectAttribute(ElementImpl element, String attributeName) {
		for(Attribute attribute : element.getAttributes()){
			if(attribute.getName().equals(attributeName)){
				if(attribute instanceof ImperfectAttribute){
					return true;
				}
			}
		}
		return false;
	}
	
	private void calculatePolarChartResults(String applicationServiceName) {
		ArrayList<SpecificScenarioResult> scenariosPerApplicationService = new ArrayList<SpecificScenarioResult>();
		for(ScenarioResult scenarioResult : this.scenarioResults){
			for(int i=0; i<scenarioResult.getSourcesNames().size(); i++){
				if(scenarioResult.getSourcesNames().get(i).equals(applicationServiceName)){
					scenariosPerApplicationService.add(new SpecificScenarioResult(scenarioResult.getSourcesNames().get(i), Double.parseDouble(scenarioResult.getSourcesAttributeValues().get(i)), scenarioResult.getTargetName(), scenarioResult.getTargetAttributeValue()));
				}
			}
		}
		calculateDelta(scenariosPerApplicationService, applicationServiceName);
	}

	private void calculateAllDelta(ArrayList<ElementImpl> applicationServices){
		ArrayList<SpecificScenarioResult> scenariosPerApplicationService;		
		for(ElementImpl service : applicationServices){
			scenariosPerApplicationService  = new ArrayList<SpecificScenarioResult>();
			for(ScenarioResult scenarioResult : this.scenarioResults){
				for(int i=0; i<scenarioResult.getSourcesNames().size(); i++){
					if(scenarioResult.getSourcesNames().get(i).equals(service.getName())){
						scenariosPerApplicationService.add(new SpecificScenarioResult(scenarioResult.getSourcesNames().get(i), Double.parseDouble(scenarioResult.getSourcesAttributeValues().get(i)), scenarioResult.getTargetName(), scenarioResult.getTargetAttributeValue()));
					}					
				}
			}
			ArrayList<DeltaResult> resultsPerAvailability = new ArrayList<DeltaResult>();
			for(SpecificScenarioResult specificScenarioResult : scenariosPerApplicationService){
				boolean alreadyExist=false;
				for(DeltaResult result : resultsPerAvailability){
					if(result.getSourceAttributeValue()==specificScenarioResult.getSourceAttributeValue() && result.getTargetName().equals(specificScenarioResult.getTargetName())){
						if(specificScenarioResult.getTargetAttributeValue()<result.getTargetMinAttributeValue()){
							result.setTargetMinAttributeValue(specificScenarioResult.getTargetAttributeValue());
						}
						if(specificScenarioResult.getTargetAttributeValue()>result.getTargetMaxAttributeValue()){
							result.setTargetMaxAttributeValue(specificScenarioResult.getTargetAttributeValue());
						}
						alreadyExist=true;
					}
				}
				if(!alreadyExist){
					resultsPerAvailability.add(new DeltaResult(specificScenarioResult.getSourceName(), specificScenarioResult.getTargetName(), specificScenarioResult.getSourceAttributeValue(), specificScenarioResult.getTargetAttributeValue(), specificScenarioResult.getTargetAttributeValue()));
				}
			}
			this.deltaResults.addAll(resultsPerAvailability);
		}
	}
	
	private void calculateDelta(ArrayList<SpecificScenarioResult> scenariosPerApplicationService, String applicationServiceName) {
		ArrayList<DeltaResult> resultsPerService = new ArrayList<DeltaResult>();
		ArrayList<String> ticks = new ArrayList<String>();
		for(SpecificScenarioResult specificScenarioResult : scenariosPerApplicationService){
			boolean alreadyExist=false;
			for(DeltaResult result : resultsPerService){
				if(result.getSourceAttributeValue()==specificScenarioResult.getSourceAttributeValue() && result.getTargetName().equals(specificScenarioResult.getTargetName())){
					if(specificScenarioResult.getTargetAttributeValue()<result.getTargetMinAttributeValue()){
						result.setTargetMinAttributeValue(specificScenarioResult.getTargetAttributeValue());
					}
					if(specificScenarioResult.getTargetAttributeValue()>result.getTargetMaxAttributeValue()){
						result.setTargetMaxAttributeValue(specificScenarioResult.getTargetAttributeValue());
					}
					alreadyExist=true;
				}
			}
			if(!alreadyExist){
				resultsPerService.add(new DeltaResult(specificScenarioResult.getSourceName(), specificScenarioResult.getTargetName(), specificScenarioResult.getSourceAttributeValue(), specificScenarioResult.getTargetAttributeValue(), specificScenarioResult.getTargetAttributeValue()));
				if(!ticks.contains(specificScenarioResult.getTargetName())){
					ticks.add(specificScenarioResult.getTargetName());	
				}
				
			}
		}
		String []attributeValues = getAttributeValues(applicationServiceName);
		ArrayList<String[]> polarChartDataReport = new ArrayList<String[]>();
		for(int i=0; i<attributeValues.length; i++){
			String []registry = new String[ticks.size()];
			for(int j=0; j<ticks.size(); j++){
				double value = getEvaluationValue(resultsPerService, ticks.get(j), Double.parseDouble(attributeValues[i]));
				registry[j] = String.valueOf(value);
			}
			polarChartDataReport.add(registry);
		}
		this.multipleTicks.add(ticks);
		this.multiplePolarChartDataReport.add(polarChartDataReport);
		this.multiplePolarTitles.add(applicationServiceName);
		this.multipleSeries.add(attributeValues);
	}


	private double getEvaluationValue(ArrayList<DeltaResult> resultsPerService, String targetName, double attributeValue) {
		for(DeltaResult deltaResult : resultsPerService){
			if(deltaResult.getSourceAttributeValue()==attributeValue && deltaResult.getTargetName().equals(targetName)){
				//double value=Math.round((deltaResult.getTargetMaxAttributeValue()-deltaResult.getTargetMinAttributeValue())*1000); //Delta
				double value=Math.round(deltaResult.getTargetMinAttributeValue()*1000); //Min
				//double value=Math.round(deltaResult.getTargetMaxAttributeValue()*1000); //Max
				value/=1000;
				return value;
			}
		}
		return 0;
	}

	private String[] getAttributeValues(String applicationServiceName) {
		ElementImpl applicationService = findElementImpl("ApplicationService", applicationServiceName);
		for(Attribute attribute : applicationService.getAttributes()){
			if(attribute instanceof ImperfectAttribute){
				if(attribute.getName().equals("availability")){				
					if(((ImperfectAttribute)attribute).getImperfectionType().getName().equals(AnalysisMethodHelper.NUMERIC_RANGE)){
						String []values = attribute.getValue().substring(1,attribute.getValue().length()-1).split("-");
						return values;
					}else if(((ImperfectAttribute)attribute).getImperfectionType().getName().equals(AnalysisMethodHelper.NUMERIC_SET)){
						String []values = attribute.getValue().substring(1,attribute.getValue().length()-1).split(",");
						return values;
					}
				}				
			}
		}
		return null;
	}

	private void calculateAvailability(ArrayList<ElementImpl> businessProcesses, ArrayList<ArrayList<ElementImpl>> collectionOfSources) {
		for (ElementImpl businessProcess : businessProcesses){
			this.availabilities = new ArrayList<String[]>();
			for(ArrayList<ElementImpl> sources : collectionOfSources){
				for(ElementImpl source : sources){
					EList<Relation> sourceRelations = source.getRelations();
					for(Relation sourceRelation : sourceRelations){
						if(sourceRelation.getTarget().getName().equals(businessProcess.getName())){
							EList<Attribute> attributesInRelation = sourceRelation.getAttributes();
							String importanceLevel = null;
							for(Attribute attributeInRelation : attributesInRelation){
								if(attributeInRelation.getName().equals(AnalysisMethodHelper.ATT_IMPORTANCE_LEVEL)){
									importanceLevel=attributeInRelation.getValue();
								}
							}
							
							EList<Attribute> attributesInSource = source.getAttributes();
							for(Attribute attributeInSource : attributesInSource){
								if(attributeInSource.getName().equals(AnalysisMethodHelper.ATT_AVAILABILITY)){
									String attributeInSourceValue = attributeInSource.getValue();
									if(attributeInSource instanceof ImperfectAttribute){
										String imperfectionType = ((ImperfectAttribute)attributeInSource).getImperfectionType().toString();
										if(imperfectionType.equals(AnalysisMethodHelper.LINGUISTIC_VALUE) || imperfectionType.equals(AnalysisMethodHelper.NO_VALUE)){
											String parameter = requestParameter(source.getName(),imperfectionType,attributeInSourceValue);
											String []availabilityInSource = new String [5];
											availabilityInSource[0]=source.getName();
											availabilityInSource[1]=parameter;
											availabilityInSource[2]=imperfectionType;
											availabilityInSource[3]=attributeInSourceValue;
											availabilityInSource[4]=importanceLevel;
											this.availabilities.add(availabilityInSource);											
										}else{
											String []availabilityInSource = new String [5];
											availabilityInSource[0]=source.getName();
											availabilityInSource[1]=attributeInSourceValue;
											availabilityInSource[2]=imperfectionType;
											availabilityInSource[4]=importanceLevel;
											this.availabilities.add(availabilityInSource);											
										}
									}else{
										String []availabilityInSource = new String [5];
										availabilityInSource[0]=source.getName();
										availabilityInSource[1]=attributeInSourceValue;
										availabilityInSource[4]=importanceLevel;
										this.availabilities.add(availabilityInSource);
									}
								}
							}	
						}						
					}
				}				
			}
			if(this.availabilities.size()>0){
				calculateFaultSucceptibility(businessProcess);				
			}
		}
	}

	private void calculateFaultSucceptibility(ElementImpl businessProcess) {
		ScenarioResult scenarioResult;
		this.chartDataReport = new ArrayList<String[]>();
		String chartXLabel="";
		
		String associatedElements = "";
		for(String []sourceAvailability : this.availabilities){
			chartXLabel+=sourceAvailability[0]+". ";
			associatedElements+=sourceAvailability[0]+", availability="+sourceAvailability[1];
			if(sourceAvailability[2]!=null){
				if(sourceAvailability[3]!=null){
					associatedElements+=" ("+sourceAvailability[2]+":"+sourceAvailability[3]+"). ";					
				}else{
					associatedElements+=" ("+sourceAvailability[2]+"). ";
				}
			}else{
				associatedElements+=". ";
			}
		}
		String []registry = new String[this.analysisMethodReport.getTitles().length];
		String []chartRegistry = new String[this.analysisMethodReport.getTitles().length];
		registry[0]=businessProcess.getName();
		registry[1]="Associated elements. "+associatedElements;
		registry[2]="";
		this.analysisMethodReport.addRegistry(registry);
		
		ArrayList<String[]> individualAvailabilities = new ArrayList<String[]>();
		for(String []sourceAvailability : this.availabilities){
			if(sourceAvailability[2]==null || sourceAvailability[2].equals(AnalysisMethodHelper.NO_VALUE)){
				if(sourceAvailability[1].contains("[")){
					String []values = sourceAvailability[1].substring(1,sourceAvailability[1].length()-1).split("-");
					individualAvailabilities.add(values);								
				}else{
					String []values = {sourceAvailability[1]};
					individualAvailabilities.add(values);			
				}
			}else if(sourceAvailability[2].equals(AnalysisMethodHelper.NUMERIC_RANGE) || sourceAvailability[2].equals(AnalysisMethodHelper.LINGUISTIC_VALUE)){
				String []values = sourceAvailability[1].substring(1,sourceAvailability[1].length()-1).split("-");
				individualAvailabilities.add(values);								
			}else if(sourceAvailability[2].equals(AnalysisMethodHelper.NUMERIC_SET)){
				String []values = sourceAvailability[1].substring(1,sourceAvailability[1].length()-1).split(",");
				individualAvailabilities.add(values);					
			}
		}
		
		double totalAvailability[]=new double[individualAvailabilities.get(0).length];
		String scenarioElements[]=new String[individualAvailabilities.get(0).length]; 
		String chartAvailabilityLabel[]=new String[individualAvailabilities.get(0).length];
		for(int i=0; i<totalAvailability.length; i++){
			totalAvailability[i]=Double.parseDouble(individualAvailabilities.get(0)[i])*Double.parseDouble(this.availabilities.get(0)[4]);
			scenarioElements[i]=this.availabilities.get(0)[0]+", availability="+individualAvailabilities.get(0)[i]+". ";
			chartAvailabilityLabel[i]=individualAvailabilities.get(0)[i]+". ";
		}
		 
		for(int i=1; i<individualAvailabilities.size(); i++){
			totalAvailability = multiplyAvailability(totalAvailability, individualAvailabilities.get(i), this.availabilities.get(i)[4]);
			scenarioElements = concatDescription(scenarioElements, this.availabilities.get(i), individualAvailabilities.get(i));
			chartAvailabilityLabel = concatAvailabilitiesLabel(chartAvailabilityLabel, individualAvailabilities.get(i));
		}
		
		double totalImportanceLevel = 0;
		for(String[] availability : this.availabilities){
			totalImportanceLevel+=Double.parseDouble(availability[4]);			
		}
		for(int i=0; i<totalAvailability.length; i++){
			totalAvailability[i]/=totalImportanceLevel;
		}
		
		for(int i=0; i<totalAvailability.length; i++){
			int number=i+1;
			double value=Math.round((1-totalAvailability[i])*1000);
			value/=1000;
			registry = new String[this.analysisMethodReport.getTitles().length];
			registry[0]="";
			registry[1]="Scenario "+number+". "+scenarioElements[i];
			registry[2]=String.valueOf(value);
			this.analysisMethodReport.addRegistry(registry);	
			chartRegistry = new String[3];
			chartRegistry[0]=String.valueOf(value);
			chartRegistry[1]=chartXLabel;
			chartRegistry[2]="S"+number;
			this.chartDataReport.add(chartRegistry);
			
			scenarioResult = new ScenarioResult();
			String[] sources = scenarioElements[i].split("\\. ");
			for(int j=0; j<sources.length; j++){
				String[] sourceDetails = sources[j].split(",");
				scenarioResult.getSourcesNames().add(sourceDetails[0]);
				String availabilityValue = sourceDetails[1].substring(sourceDetails[1].lastIndexOf("=")+1); 
				scenarioResult.getSourcesAttributeValues().add(availabilityValue);
				scenarioResult.setTargetName(businessProcess.getName());
				scenarioResult.setTargetAttributeValue(value);
			}
			this.scenarioResults.add(scenarioResult);
		}
		registry = new String[this.analysisMethodReport.getTitles().length];
		registry[0]="";
		registry[1]="";
		registry[2]="";
		this.analysisMethodReport.addRegistry(registry);
		if(this.chartDataReport.size()>1){
			this.multipleYLabels.add(businessProcess.getName());
			this.multipleLineChartDataReport.add(this.chartDataReport);
		}
	}

	private String[] concatAvailabilitiesLabel(String[] chartAvailabilityLabel, String[] availabilities) {
		String []results = new String[chartAvailabilityLabel.length*availabilities.length];
		for(int i=0; i<chartAvailabilityLabel.length; i++){
			for(int j=0; j<availabilities.length; j++){
				results[(i*availabilities.length)+j]=chartAvailabilityLabel[i]+ Double.parseDouble(availabilities[j])+". ";
			}
		}		
		return results;
	}

	private String[] concatDescription(String[] scenarioElements, String[] elements, String[] availabilities) {
		String []results = new String[scenarioElements.length*availabilities.length];
		for(int i=0; i<scenarioElements.length; i++){
			for(int j=0; j<availabilities.length; j++){
				results[(i*availabilities.length)+j]=scenarioElements[i]+""+elements[0]+", availability="+ Double.parseDouble(availabilities[j])+". ";
			}
		}		
		return results;
	}

	private double[] multiplyAvailability(double[] totalAvailability, String[] availabilities, String importanceLevel) {
		double []results=new double[totalAvailability.length*availabilities.length];
		for(int i=0; i<totalAvailability.length; i++){
			for(int j=0; j<availabilities.length; j++){
				results[(i*availabilities.length)+j]=totalAvailability[i]+(Double.parseDouble(availabilities[j])*Double.parseDouble(importanceLevel));
			}
		}		
		return results;
	}

	private String requestParameter(String name, String imperfectionType, String attributeInSourceValue ) {
		String predefinedParameter = parameters.get(name);
		if(predefinedParameter==null){
			String message;
			if(imperfectionType.equals(AnalysisMethodHelper.LINGUISTIC_VALUE)){
				message="Set double value or a range of double values for the linguistic attribute availability in the element "+name+". The attribute has the value "+attributeInSourceValue;
			}else{
				message="Set a double value or a range of double values for the attribute availability in the element "+name;
			}
			String parameter = JOptionPane.showInputDialog(null, message, "Parameter");
			parameters.put(name, parameter);
			return parameter;
		}else{
			return predefinedParameter;
		}
	}
	
}
