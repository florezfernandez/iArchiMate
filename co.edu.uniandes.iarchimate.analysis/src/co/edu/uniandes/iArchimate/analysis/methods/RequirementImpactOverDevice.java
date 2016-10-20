package co.edu.uniandes.iArchimate.analysis.methods;

import iArchimate.Attribute;
import iArchimate.IArchimateFactory;
import iArchimate.Relation;
import iArchimate.RelationTypeName;
import iArchimate.impl.ElementImpl;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import co.edu.uniandes.iArchimate.analysis.AdditionalAttribute;
import co.edu.uniandes.iArchimate.analysis.AdditionalRelation;
import co.edu.uniandes.iArchimate.analysis.AffectedConcept;
import co.edu.uniandes.iArchimate.analysis.AnalysisMethodReport;

public class RequirementImpactOverDevice extends AnalysisMethod {

	public RequirementImpactOverDevice() {
		super();
		this.concept=AnalysisMethodHelper.REQUIREMENT;
		this.analysisMethod=AnalysisMethodHelper.IMPACT_OVER_DEVICE;
		this.validationFileName=AnalysisMethodHelper.REQUIREMENT_IMPACT_OVER_DEVICE;
	}
	
	@Override
	public String getDescription() {
		return "Creates a relation between Requirements and Devices that fit with the requirements attributes";
	}

	@Override
	public void initAffectedConcepts() {
		AffectedConcept affectedConcept;
		affectedConcept = new AffectedConcept("Requirement");
		affectedConcept.addAttribute("conditionAttribute", AdditionalAttribute.STRING, "", AdditionalAttribute.MANDATORY);
		affectedConcept.addAttribute("conditionOperation", AdditionalAttribute.STRING, "", AdditionalAttribute.MANDATORY);
		affectedConcept.addAttribute("conditionValue", AdditionalAttribute.DOUBLE, "> 0 and < 1", AdditionalAttribute.MANDATORY);
		affectedConcept.addRelation("affects", AdditionalRelation.ASSOCIATION, "Device");
		this.affectedConcepts.add(affectedConcept);
		affectedConcept = new AffectedConcept("ApplicationComponent");
		affectedConcept.addAttribute("conditionAttribute.value", AdditionalAttribute.DOUBLE, "> 0 and < 1", AdditionalAttribute.MANDATORY);
		this.affectedConcepts.add(affectedConcept);		
	}

	@Override
	public String performAnalysisMethod() {
		try {
			String title="REQUIREMENT IMPACT OVER DEVICE\n";
			String messageRelationsCreated="The following relations were created:\n";
			ArrayList<ElementImpl> requirements = findArrayOfElementImpl("Requirement");
			ArrayList<ElementImpl> devices = findArrayOfElementImpl("Device");
			this.analysisMethodReport = new AnalysisMethodReport(new String[]{"Requirement Name","Asociation to Device","Action","Availability"});			
			for(ElementImpl requirement : requirements){
				EList<Attribute> requirementAttributes = requirement.getAttributes();
				String conditionAttribute=getAttributeValue(requirementAttributes,"conditionAttribute");
				String conditionOperation=getAttributeValue(requirementAttributes,"conditionOperation");
				double conditionValue=Double.valueOf(getAttributeValue(requirementAttributes,"conditionValue"));
				for(ElementImpl device : devices){
					EList<Attribute> deviceAttributes = device.getAttributes();
					String deviceAttributeValueString = getAttributeValue(deviceAttributes,conditionAttribute);
					if(deviceAttributeValueString == null ||
							conditionOperation.equals("lessThan") && Double.valueOf(deviceAttributeValueString)<conditionValue ||
							conditionOperation.equals("equals") && Double.valueOf(deviceAttributeValueString)==conditionValue ||
							conditionOperation.equals("greaterThan") && Double.valueOf(deviceAttributeValueString)>conditionValue){
						boolean existRelation=false;
						String []registry = new String[4];
						registry[0]=requirement.getName();
						registry[1]=device.getName();
						for(Relation relation : requirement.getRelations()){
							if(relation.getName().equals(requirement.getName()+" Affects") &&
									relation.getTarget()==device){ 
								existRelation=true;
								registry[2]="Relation already exist";
								break;
							}
						}
														
						if(!existRelation){
							Relation newRelation = IArchimateFactory.eINSTANCE.createRelation();
							newRelation.setName(requirement.getName()+" Affects");
							try {
								newRelation.setSource(requirement);							
							} catch (Exception e) {
							}
							try {
								newRelation.setTarget(device);							
							} catch (Exception e) {
							}
							newRelation.setTypeName(RelationTypeName.ASSOCIATION);
							createRelationBetweenElementImpl(requirement, device, newRelation);
							messageRelationsCreated+="  - From "+requirement.getName()+" to "+device.getName()+"\n";							
							registry[2]="Relation created";
						}
						if(deviceAttributeValueString==null){
							registry[3]="Not defined";	
						}else{
							registry[3]=deviceAttributeValueString;
						}
						
						this.analysisMethodReport.addRegistry(registry);
					}						
				}
			}
			return title+messageRelationsCreated;
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	private String getAttributeValue(EList<Attribute> attributes,String attributeName) {
		for(Attribute attribute : attributes){
			if(attribute.getName().equals(attributeName)){
				return attribute.getValue();
			}
		}
		return null;
	}
}


