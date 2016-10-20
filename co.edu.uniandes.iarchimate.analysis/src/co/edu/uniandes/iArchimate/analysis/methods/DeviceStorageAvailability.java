package co.edu.uniandes.iArchimate.analysis.methods;

import iArchimate.Attribute;
import iArchimate.Relation;
import iArchimate.impl.ElementImpl;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import co.edu.uniandes.iArchimate.analysis.AdditionalAttribute;
import co.edu.uniandes.iArchimate.analysis.AffectedConcept;
import co.edu.uniandes.iArchimate.analysis.AnalysisMethodReport;

public class DeviceStorageAvailability extends AnalysisMethod {

	public DeviceStorageAvailability() {
		super();
		this.concept=AnalysisMethodHelper.DEVICE;
		this.analysisMethod=AnalysisMethodHelper.STORAGE_AVAILABILITY;
		this.validationFileName=AnalysisMethodHelper.DEVICE_STORAGE_AVAILABILITY;
	}

	@Override
	public String getDescription() {
		return "Calculates the storage availability in different slots of time of devices based on all related system softwares, "
				+ "infrastructure services and application components.";
	}

	@Override
	public void initAffectedConcepts() {
		AffectedConcept affectedConcept;
		affectedConcept = new AffectedConcept(AnalysisMethodHelper.DEVICE);
		affectedConcept.addAttribute(AnalysisMethodHelper.ATT_STORAGE_CAPACITY, AdditionalAttribute.DOUBLE, "Value in GBytes", AdditionalAttribute.MANDATORY);
		this.affectedConcepts.add(affectedConcept);
		affectedConcept = new AffectedConcept(AnalysisMethodHelper.SYSTEM_SOFTWARE);
		affectedConcept.addAttribute(AnalysisMethodHelper.ATT_STORAGE_USED, AdditionalAttribute.DOUBLE, "Value in GBytes", AdditionalAttribute.MANDATORY);
		affectedConcept.addAttribute(AnalysisMethodHelper.ATT_STORAGE_INCREMENT_PER_MONTH, AdditionalAttribute.DOUBLE, "Value in GBytes", AdditionalAttribute.OPTIONAL);
		this.affectedConcepts.add(affectedConcept);
		affectedConcept = new AffectedConcept(AnalysisMethodHelper.INFRASTRUCTURE_SERVICE);
		affectedConcept.addAttribute(AnalysisMethodHelper.ATT_STORAGE_USED, AdditionalAttribute.DOUBLE, "Value in GBytes", AdditionalAttribute.MANDATORY);
		affectedConcept.addAttribute(AnalysisMethodHelper.ATT_STORAGE_INCREMENT_PER_MONTH, AdditionalAttribute.DOUBLE, "Value in GBytes", AdditionalAttribute.OPTIONAL);
		this.affectedConcepts.add(affectedConcept);
		affectedConcept = new AffectedConcept(AnalysisMethodHelper.APPLICATION_COMPONENT);
		affectedConcept.addAttribute(AnalysisMethodHelper.ATT_STORAGE_USED, AdditionalAttribute.DOUBLE, "Value in GBytes", AdditionalAttribute.MANDATORY);
		affectedConcept.addAttribute(AnalysisMethodHelper.ATT_STORAGE_INCREMENT_PER_MONTH, AdditionalAttribute.DOUBLE, "Value in GBytes", AdditionalAttribute.OPTIONAL);
		this.affectedConcepts.add(affectedConcept);
	}

	@Override
	public String performAnalysisMethod() {
		try {
			ArrayList<ElementImpl> devices = findArrayOfElementImpl(AnalysisMethodHelper.DEVICE);
			this.analysisMethodReport = new AnalysisMethodReport(new String[]{"Device Name","Storage Capacity","Storage Availability","Associated Elements","Associated Elements Attributes"});			
			for(ElementImpl device : devices){
				ArrayList<ElementImpl> systemSoftwares = new ArrayList<ElementImpl>();
				ArrayList<ElementImpl> infrastructureServices = new ArrayList<ElementImpl>();
				ArrayList<ElementImpl> applicationComponents = new ArrayList<ElementImpl>();
				EList<Relation> deviceRelations = device.getRelations();
				for(Relation deviceRelation : deviceRelations){
					if(deviceRelation.getTarget().getTypeName().getName().equals(AnalysisMethodHelper.SYSTEM_SOFTWARE)){
						systemSoftwares.add((ElementImpl) deviceRelation.getTarget());
					}else if(deviceRelation.getTarget().getTypeName().getName().equals(AnalysisMethodHelper.INFRASTRUCTURE_SERVICE)){
						infrastructureServices.add((ElementImpl) deviceRelation.getTarget());
					}else if(deviceRelation.getTarget().getTypeName().getName().equals(AnalysisMethodHelper.APPLICATION_COMPONENT)){
						applicationComponents.add((ElementImpl) deviceRelation.getTarget());
					}
				}
				for(ElementImpl systemSoftware : systemSoftwares){
					EList<Relation> systemSoftwareRelations = systemSoftware.getRelations();
					for(Relation systemSoftwareRelation : systemSoftwareRelations){
						if(systemSoftwareRelation.getTarget().getTypeName().getName().equals(AnalysisMethodHelper.APPLICATION_COMPONENT)){
							ElementImpl applicationComponent = (ElementImpl) systemSoftwareRelation.getTarget();
							if(!applicationComponents.contains(applicationComponent)){
								applicationComponents.add(applicationComponent);
							}
						}						
					}
				}
				for(ElementImpl intrastructureService : infrastructureServices){
					EList<Relation> intrastructureServiceRelations = intrastructureService.getRelations();
					for(Relation intrastructureServiceRelation : intrastructureServiceRelations){
						if(intrastructureServiceRelation.getTarget().getTypeName().getName().equals(AnalysisMethodHelper.APPLICATION_COMPONENT)){
							ElementImpl applicationComponent = (ElementImpl) intrastructureServiceRelation.getTarget();
							if(!applicationComponents.contains(applicationComponent)){
								applicationComponents.add(applicationComponent);
							}
						}						
					}
				}
				double []totalStorage=new double[2];
				double []totalStoragePerElementType;
				ArrayList<String> associatedElements=new ArrayList<String>();
				ArrayList<String> associatedElementsAttributes=new ArrayList<String>();
				totalStoragePerElementType=calculateStorage(systemSoftwares,associatedElements,associatedElementsAttributes);
				totalStorage[0]+=totalStoragePerElementType[0];
				totalStorage[1]+=totalStoragePerElementType[1];
				totalStoragePerElementType=calculateStorage(infrastructureServices,associatedElements,associatedElementsAttributes);
				totalStorage[0]+=totalStoragePerElementType[0];
				totalStorage[1]+=totalStoragePerElementType[1];
				totalStoragePerElementType=calculateStorage(applicationComponents,associatedElements,associatedElementsAttributes);
				totalStorage[0]+=totalStoragePerElementType[0];
				totalStorage[1]+=totalStoragePerElementType[1];

				double []storageCapacity = getDeviceStorage(device);
				ArrayList<String> storageAvailability=new ArrayList<String>();
				double currentAvailability = ((storageCapacity[0] - storageCapacity[1] - totalStorage[0])/storageCapacity[0])*100;
				if(currentAvailability<=0){
					currentAvailability=0;
					storageAvailability.add("Current: "+(double)(Math.round(currentAvailability*100))/100+"%.");					
				}else{
					storageAvailability.add("Current: "+(double)(Math.round(currentAvailability*100))/100+"%.");					
					double availability12Months = ((storageCapacity[0] - storageCapacity[1] - totalStorage[0] - (totalStorage[1]*12))/storageCapacity[0])*100;
					if(availability12Months<=0){
						availability12Months=0;
						storageAvailability.add("12 Months: "+(double)(Math.round(availability12Months*100))/100+"%.");
					}else{
						storageAvailability.add("12 Months: "+(double)(Math.round(availability12Months*100))/100+"%");
						double availability24Months = ((storageCapacity[0] - storageCapacity[1] - totalStorage[0] - (totalStorage[1]*24))/storageCapacity[0])*100;
						if(availability24Months<=0){
							availability24Months=0;
							storageAvailability.add("24 Months: "+(double)(Math.round(availability24Months*100))/100+"%.");
						}else{
							storageAvailability.add("24 Months: "+(double)(Math.round(availability24Months*100))/100+"%.");
							double availability36Months = ((storageCapacity[0] - storageCapacity[1] - totalStorage[0] - (totalStorage[1]*36))/storageCapacity[0])*100;
							if(availability36Months<=0){
								availability36Months=0;
								storageAvailability.add("36 Months: "+(double)(Math.round(availability36Months*100))/100+"%.");								
							}else{
								storageAvailability.add("36 Months: "+(double)(Math.round(availability36Months*100))/100+"%.");
								double availability48Months = ((storageCapacity[0] - storageCapacity[1] - totalStorage[0] - (totalStorage[1]*48))/storageCapacity[0])*100;
								if(availability48Months<=0){
									availability48Months=0;
									storageAvailability.add("48 Months: "+(double)(Math.round(availability48Months*100))/100+"%.");								
								}else{
									storageAvailability.add("48 Months: "+(double)(Math.round(availability48Months*100))/100+"%.");
								}
							}
						}
						
					}
				}
				int maxSize = storageAvailability.size();
				if(associatedElements.size()>maxSize){
					maxSize=associatedElements.size();
				}
				for(int i=0; i<=maxSize; i++){
					String []registry = new String[this.analysisMethodReport.getTitles().length];
					registry[0]="";
					registry[1]="";
					registry[2]="";
					registry[3]="";
					registry[4]="";
					if(i==0){
						registry[0]=device.getName();						
						registry[1]=String.valueOf(Math.round(storageCapacity[0]))+" GBytes";						
					}
					if(i<maxSize){
						if(i<storageAvailability.size()){
							registry[2]=storageAvailability.get(i);						
						}
						if(i<associatedElements.size()){
							registry[3]=associatedElements.get(i);
							registry[4]=associatedElementsAttributes.get(i);
						}						
					}
					this.analysisMethodReport.addRegistry(registry);									
				}
			}
			return this.concept + " " + this.analysisMethod + "\n  The analysis method was executed correctly.\n  See the iArchiMate Analysis Results view for more details"; 
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	private double[] getDeviceStorage(ElementImpl device) {
		EList<Attribute> attributesInDevice = device.getAttributes();
		double []deviceStorage=new double[2];
		for(Attribute attributeInDevice : attributesInDevice){
			if(attributeInDevice.getName().equals(AnalysisMethodHelper.ATT_STORAGE_CAPACITY)){
				deviceStorage[0] = Double.parseDouble(attributeInDevice.getValue());
			}else if(attributeInDevice.getName().equals(AnalysisMethodHelper.ATT_STORAGE_USED)){
				deviceStorage[1]+=Double.parseDouble(attributeInDevice.getValue());
			}
		}
		return deviceStorage;
	}

	private double[] calculateStorage(ArrayList<ElementImpl> elements, ArrayList<String> associatedElements, ArrayList<String> associatedElementsAttributes) {
		double []totalStorage=new double[2];
		for(ElementImpl element : elements){
			associatedElements.add(element.getName()+" ("+element.getTypeName().getName()+"). ");
			EList<Attribute> attributesInElement = element.getAttributes();
			String associatedAttributes="";
			for(Attribute attributeInElement : attributesInElement){
				if(attributeInElement.getName().equals(AnalysisMethodHelper.ATT_STORAGE_USED)){
					totalStorage[0]+=Double.parseDouble(attributeInElement.getValue());
					associatedAttributes+=attributeInElement.getName()+"="+attributeInElement.getValue()+" GB. ";
				}else if(attributeInElement.getName().equals(AnalysisMethodHelper.ATT_STORAGE_INCREMENT_PER_MONTH)){
					totalStorage[1]+=Double.parseDouble(attributeInElement.getValue());
					associatedAttributes+=attributeInElement.getName()+"="+attributeInElement.getValue()+" GB. ";
				}
			}
			associatedElementsAttributes.add(associatedAttributes);
		}
		return totalStorage;
	}
}
