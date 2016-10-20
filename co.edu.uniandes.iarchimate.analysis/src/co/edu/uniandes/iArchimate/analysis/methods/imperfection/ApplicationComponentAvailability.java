package co.edu.uniandes.iArchimate.analysis.methods.imperfection;

import iArchimate.Attribute;
import iArchimate.AttributeTypeValue;
import iArchimate.IArchimateFactory;
import iArchimate.ImperfectAttribute;
import iArchimate.ImperfectAttributeTypeValue;
import iArchimate.Relation;
import iArchimate.impl.ElementImpl;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

import co.edu.uniandes.iArchimate.analysis.AdditionalAttribute;
import co.edu.uniandes.iArchimate.analysis.AffectedConcept;
import co.edu.uniandes.iArchimate.analysis.AnalysisMethodReport;
import co.edu.uniandes.iArchimate.analysis.methods.AnalysisMethod;
import co.edu.uniandes.iArchimate.analysis.methods.AnalysisMethodHelper;

public class ApplicationComponentAvailability extends AnalysisMethod {
	private HashMap<String, String> parameters = new HashMap<String, String>();
	private ArrayList<String[]> availabilities;
	
	public ApplicationComponentAvailability() {
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
			ArrayList<ElementImpl> applicationComponents = findArrayOfElementImpl("ApplicationComponent");
			ArrayList<ElementImpl> applicationServices = findArrayOfElementImpl("ApplicationService");
			ArrayList<ElementImpl> systemSoftwares = findArrayOfElementImpl("SystemSoftware");
			ArrayList<ElementImpl> infrastructureServices = findArrayOfElementImpl("InfrastructureService");
			this.analysisMethodReport = new AnalysisMethodReport(new String[]{"Element Name"," ","Availability "});			
			ArrayList<ArrayList<ElementImpl>> collectionOfSources = new ArrayList<ArrayList<ElementImpl>>();
			collectionOfSources.add(systemSoftwares);
			collectionOfSources.add(infrastructureServices);
			calculateAvailability(applicationComponents, collectionOfSources);
			createAvailabilityDirectly(applicationServices, systemSoftwares);
			return this.concept + " " + this.analysisMethod + "\n  The analysis method was executed correctly.\n  See the iArchiMate Analysis Results view for more details"; 
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage(); 
		}
	}

	private void createAvailabilityDirectly(ArrayList<ElementImpl> applicationServices, ArrayList<ElementImpl> systemSoftwares) {
		for(ElementImpl systemSoftware : systemSoftwares){
			EList<Relation> relations = systemSoftware.getRelations();
			for(Relation relation : relations){
				for(ElementImpl applicationService : applicationServices){
					if(relation.getTarget()==applicationService){
						EList<Attribute> attributes = systemSoftware.getAttributes();
						for(Attribute attribute : attributes){
							if(attribute.getName().equals(AnalysisMethodHelper.ATT_AVAILABILITY)){
								double totalAvailability[] = new double[2];
								if(attribute instanceof ImperfectAttribute){
									String []values = attribute.getValue().substring(1,attribute.getValue().length()-1).split("-");
									totalAvailability[0]=Double.parseDouble(values[0]);
									totalAvailability[1]=Double.parseDouble(values[1]);									
								}else{
									totalAvailability[0]=Double.parseDouble(attribute.getValue());
									totalAvailability[1]=Double.parseDouble(attribute.getValue());
								}
								createAvailabilityInApplicationElement(applicationService, totalAvailability, 0);
							}
						}
					}
				}				
			}
		}
		
	}

	private void calculateAvailability(ArrayList<ElementImpl> applicationComponents, ArrayList<ArrayList<ElementImpl>> collectionOfSources) {
		boolean dialog = MessageDialog.openQuestion(Display.getCurrent().getActiveShell(), "Type of results", "Do you want to include in the results a range of values instead of a set of value?");
		int optionIndex=0;
		if(!dialog){
			optionIndex=1;
		}
		for (ElementImpl applicationComponent : applicationComponents){
			this.availabilities = new ArrayList<String[]>();
			for(ArrayList<ElementImpl> sources : collectionOfSources){
				for(ElementImpl source : sources){
					EList<Relation> sourceRelations = source.getRelations();
					for(Relation sourceRelation : sourceRelations){
						if(sourceRelation.getTarget().getName().equals(applicationComponent.getName())){
							EList<Attribute> attributesInSource = source.getAttributes();
							for(Attribute attributeInSource : attributesInSource){
								if(attributeInSource.getName().equals(AnalysisMethodHelper.ATT_AVAILABILITY)){
									String attributeInSourceValue = attributeInSource.getValue();
									if(attributeInSource instanceof ImperfectAttribute){
										String imperfectionType = ((ImperfectAttribute)attributeInSource).getImperfectionType().toString();
										if(imperfectionType.equals(AnalysisMethodHelper.LINGUISTIC_VALUE) || imperfectionType.equals(AnalysisMethodHelper.NO_VALUE)){
											String parameter = requestParameter(source.getName(),imperfectionType,attributeInSourceValue);
											String []availabilityInSource = new String [4];
											availabilityInSource[0]=source.getName();
											availabilityInSource[1]=parameter;
											availabilityInSource[2]=imperfectionType;
											availabilityInSource[3]=attributeInSourceValue;
											this.availabilities.add(availabilityInSource);											
										}else{
											String []availabilityInSource = new String [4];
											availabilityInSource[0]=source.getName();
											availabilityInSource[1]=attributeInSourceValue;
											availabilityInSource[2]=imperfectionType;
											this.availabilities.add(availabilityInSource);											
										}
									}else{
										String []availabilityInSource = new String [4];
										availabilityInSource[0]=source.getName();
										availabilityInSource[1]=attributeInSourceValue;
										this.availabilities.add(availabilityInSource);
									}
								}
							}	
						}						
					}
				}				
			}
			if(this.availabilities.size()>0){
				calculateAvailability(applicationComponent, optionIndex);				
			}
		}
	}

	private void calculateAvailability(ElementImpl applicationComponent, int optionIndex) {
		this.chartDataReport = new ArrayList<String[]>();
		this.multipleYLabels.add(applicationComponent.getName());
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
		registry[0]=applicationComponent.getName();
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
		//String chartAvailabilityLabel[]=new String[individualAvailabilities.get(0).length];
		for(int i=0; i<totalAvailability.length; i++){
			totalAvailability[i]=Double.parseDouble(individualAvailabilities.get(0)[i]);
			scenarioElements[i]=this.availabilities.get(0)[0]+", availability="+individualAvailabilities.get(0)[i]+". ";
			//chartAvailabilityLabel[i]=individualAvailabilities.get(0)[i]+". ";
		}
		 
		for(int i=1; i<individualAvailabilities.size(); i++){
			totalAvailability = multiplyAvailability(totalAvailability, individualAvailabilities.get(i));
			scenarioElements = concatDescription(scenarioElements, this.availabilities.get(i), individualAvailabilities.get(i));
			//chartAvailabilityLabel = concatAvailabilitiesLabel(chartAvailabilityLabel, individualAvailabilities.get(i));
		}
		
		for(int i=0; i<totalAvailability.length; i++){
			int number=i+1;
			double value= Math.round(totalAvailability[i]*1000);
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
			//chartRegistry[2]=chartAvailabilityLabel[i];
			this.chartDataReport.add(chartRegistry);
		}
		registry = new String[this.analysisMethodReport.getTitles().length];
		registry[0]="";
		registry[1]="";
		registry[2]="";
		this.analysisMethodReport.addRegistry(registry);
		this.multipleLineChartDataReport.add(this.chartDataReport);
		createAvailabilityInApplicationElement(applicationComponent, totalAvailability, optionIndex);
		ArrayList<ElementImpl> applicationServices = findArrayOfElementImpl("ApplicationService");
		for(ElementImpl applicationService : applicationServices){
			EList<Relation> applicationComponentRelations = applicationComponent.getRelations();
			for(Relation applicationComponentRelation : applicationComponentRelations){
				if(applicationComponentRelation.getTarget() == applicationService){
					createAvailabilityInApplicationElement(applicationService, totalAvailability, optionIndex);
				}
			}
		}
	}

	private void createAvailabilityInApplicationElement(ElementImpl applicationElement, double[] totalAvailability, int optionIndex) {
		removeAttributeAvailability(applicationElement.getAttributes());
		if(totalAvailability.length==1){
			createAttributeAvailability(applicationElement.getAttributes(), totalAvailability[0]);
		}else{
			double highest=0;
			double lowest=1;
			for(int i=0; i<totalAvailability.length; i++){
				if(totalAvailability[i]>highest){
					highest=totalAvailability[i];
				}
				if(totalAvailability[i]<lowest){
					lowest=totalAvailability[i];
				}
			}
			if(highest-lowest<=0.05){
				double average=(highest+lowest)/2;
				average=Math.round(average*1000);
				average/=1000;
				createAttributeAvailability(applicationElement.getAttributes(), average);
			}else{
				String setOfValues="";
				for(int i=0; i<totalAvailability.length; i++){
					double value = Math.round(totalAvailability[i]*1000);
					value/=1000;
					setOfValues+=value+",";
				}
				setOfValues = setOfValues.substring(0, setOfValues.length()-1);
				if(optionIndex==0){
					lowest=Math.round(lowest*1000);
					lowest/=1000;
					highest=Math.round(highest*1000);
					highest/=1000;
					createImperfectAttributeAvailability(applicationElement.getAttributes(), "["+lowest+"-"+highest+"]", AnalysisMethodHelper.NUMERIC_RANGE);										
				}else if(optionIndex==1){
					createImperfectAttributeAvailability(applicationElement.getAttributes(), "("+setOfValues+")", AnalysisMethodHelper.NUMERIC_SET);					
				}
			}
		}
	}

	private void createAttributeAvailability(EList<Attribute> attributes, double value) {
		Attribute newAttribute = IArchimateFactory.eINSTANCE.createAttribute();
		newAttribute.setName("availability");
		newAttribute.setType(AttributeTypeValue.EDOUBLE);
		newAttribute.setValue(String.valueOf(value));			
		try {
			attributes.add(newAttribute);
		} catch (Exception e) {	
		}
	}

	private void createImperfectAttributeAvailability(EList<Attribute> attributes, String value, String imperfectionType) {
		ImperfectAttribute newImperfectAttribute = IArchimateFactory.eINSTANCE.createImperfectAttribute();
		newImperfectAttribute.setName("availability");
		newImperfectAttribute.setType(AttributeTypeValue.ESTRING);
		newImperfectAttribute.setValue(String.valueOf(value));
		
		if(imperfectionType.equals(AnalysisMethodHelper.NUMERIC_RANGE)){
			newImperfectAttribute.setImperfectionType(ImperfectAttributeTypeValue.NUMERIC_RANGE);
		}else if(imperfectionType.equals(AnalysisMethodHelper.NUMERIC_SET)){
			newImperfectAttribute.setImperfectionType(ImperfectAttributeTypeValue.NUMERIC_SET);
		}
		try {
			attributes.add(newImperfectAttribute);
		} catch (Exception e) {	
		}
	}

	private void removeAttributeAvailability(EList<Attribute> attributes) {
		for(Attribute attribute : attributes){
			if(attribute.getName().equals("availability")){
				try {
					attributes.remove(attribute);
				} catch (Exception e) {
					return;
				}
			}
		}
	}

//	private String[] concatAvailabilitiesLabel(String[] chartAvailabilityLabel, String[] availabilities) {
//		String []results = new String[chartAvailabilityLabel.length*availabilities.length];
//		for(int i=0; i<chartAvailabilityLabel.length; i++){
//			for(int j=0; j<availabilities.length; j++){
//				results[(i*availabilities.length)+j]=chartAvailabilityLabel[i]+ Double.parseDouble(availabilities[j])+". ";
//			}
//		}		
//		return results;
//	}

	private String[] concatDescription(String[] scenarioElements, String[] elements, String[] availabilities) {
		String []results = new String[scenarioElements.length*availabilities.length];
		for(int i=0; i<scenarioElements.length; i++){
			for(int j=0; j<availabilities.length; j++){
				results[(i*availabilities.length)+j]=scenarioElements[i]+""+elements[0]+", availability="+ Double.parseDouble(availabilities[j])+". ";
			}
		}		
		return results;
	}

	private double[] multiplyAvailability(double[] totalAvailability, String[] availabilities) {
		double []results=new double[totalAvailability.length*availabilities.length];
		for(int i=0; i<totalAvailability.length; i++){
			for(int j=0; j<availabilities.length; j++){
				results[(i*availabilities.length)+j]=totalAvailability[i]*Double.parseDouble(availabilities[j]);
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
			
			InputDialog dialog = new InputDialog(Display.getCurrent().getActiveShell(), "Input", message, "", null);
			dialog.open();
			parameters.put(name, dialog.getValue());
			return dialog.getValue();
		}else{
			return predefinedParameter;
		}
	}
	
}
