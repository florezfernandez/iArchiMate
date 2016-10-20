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

public class RequirementImpactOverITElements extends AnalysisMethod {
	public static String CONDITION_ATTRIBUTE = "conditionAttribute";
	public static String CONDITION_OPERATION = "conditionOperation";
	public static String CONDITION_VALUE = "conditionValue";
	public static String TARGET_ELEMENTS = "targetElements";

	public static String IMPACT = "impact";

	public RequirementImpactOverITElements() {
		super();
		this.concept=AnalysisMethodHelper.REQUIREMENT;
		this.analysisMethod=AnalysisMethodHelper.IMPACT_OVER_IT_ELEMENTS;
		this.validationFileName=AnalysisMethodHelper.REQUIREMENT_IMPACT_OVER_IT_ELEMENTS;
	}
	
	@Override
	public String getDescription() {
		return "Creates an association relation between requirements and IT elements specified in each requirement that fit with the requirements attributes";
	}

	@Override
	public void initAffectedConcepts() {
		AffectedConcept affectedConcept;
		affectedConcept = new AffectedConcept(AnalysisMethodHelper.REQUIREMENT);
		affectedConcept.addAttribute(CONDITION_ATTRIBUTE, AdditionalAttribute.STRING, "", AdditionalAttribute.MANDATORY);
		affectedConcept.addAttribute(CONDITION_OPERATION, AdditionalAttribute.STRING, "'<=' or '==' or '>='", AdditionalAttribute.MANDATORY);
		affectedConcept.addAttribute(CONDITION_VALUE, AdditionalAttribute.DOUBLE, "> 0 and < 1", AdditionalAttribute.MANDATORY);
		affectedConcept.addAttribute(TARGET_ELEMENTS, AdditionalAttribute.STRING, "Separeted by ';'", AdditionalAttribute.MANDATORY);
		affectedConcept.addRelation(IMPACT, AdditionalRelation.ASSOCIATION, "<<"+TARGET_ELEMENTS+">>");
		this.affectedConcepts.add(affectedConcept);
		affectedConcept = new AffectedConcept("<<"+TARGET_ELEMENTS+">>");
		affectedConcept.addAttribute("<<"+CONDITION_ATTRIBUTE+">>.value", AdditionalAttribute.DOUBLE, "> 0 and < 1", AdditionalAttribute.MANDATORY);
		this.affectedConcepts.add(affectedConcept);		
	}

	@Override
	public String performAnalysisMethod() {
		try {
			ArrayList<ElementImpl> requirements = findArrayOfElementImpl(AnalysisMethodHelper.REQUIREMENT);
			this.analysisMethodReport = new AnalysisMethodReport(new String[]{"Requirement Name","Requiremet Attributes","Associated Elements","Associated Element Type","Condition Attribute","Action"});			
			for(ElementImpl requirement : requirements){
				EList<Attribute> requirementAttributes = requirement.getAttributes();
				String conditionAttribute=getAttributeValue(requirementAttributes,CONDITION_ATTRIBUTE);
				String conditionOperation=getAttributeValue(requirementAttributes,CONDITION_OPERATION);
				String conditionValueString=getAttributeValue(requirementAttributes,CONDITION_VALUE);
				String targetElementString = getAttributeValue(requirementAttributes,TARGET_ELEMENTS);
				if(conditionAttribute!=null && conditionOperation!=null && conditionValueString!="" && targetElementString!=null){
					double conditionValue=Double.parseDouble(conditionValueString);
					String []targetElementsString = targetElementString.split(";");
					ArrayList<ElementImpl> targetElements = new ArrayList<ElementImpl>();
					for(int i=0; i<targetElementsString.length; i++){
						targetElements.addAll(findArrayOfElementImpl(targetElementsString[i].trim()));
					}					
					createOrUpdateRelations(requirement,targetElements,conditionAttribute,conditionOperation,conditionValue);
				}
			}
			return this.concept + " " + this.analysisMethod + "\n  The analysis method was executed correctly.\n  See the iArchiMate Analysis Results view for more details"; 
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	private void createOrUpdateRelations(ElementImpl requirement, ArrayList<ElementImpl> targetElements, String conditionAttribute, String conditionOperation, double conditionValue) {
		int numRegistries=3;
		if(targetElements.size()>numRegistries){
			numRegistries=targetElements.size();
		}
		int i=0;
		for(ElementImpl targetElement : targetElements){
			EList<Attribute> targetElementAttributes = targetElement.getAttributes();
			String targetElementAttributeValueString = getAttributeValue(targetElementAttributes,conditionAttribute);
			String []registry = new String[this.analysisMethodReport.getTitles().length];
			registry[0]="";
			registry[1]="";
			registry[2]="";
			registry[3]="";
			registry[4]="";
			registry[5]="";
			if(i==0){
				registry[0]=requirement.getName();					
				registry[1]=CONDITION_ATTRIBUTE+"='"+conditionAttribute+"'";					
			}else if(i==1){
				registry[1]=CONDITION_OPERATION+"='"+conditionOperation+"'";
			}else if(i==2){
				registry[1]=CONDITION_VALUE+"='"+conditionValue+"'";
			}
			registry[2]=targetElement.getName();
			registry[3]=targetElement.getTypeName().getName();
			if(targetElementAttributeValueString == null ||
					conditionOperation.equals("<=") && Double.valueOf(targetElementAttributeValueString)>conditionValue ||
					conditionOperation.equals("==") && Double.valueOf(targetElementAttributeValueString)!=conditionValue ||
					conditionOperation.equals(">=") && Double.valueOf(targetElementAttributeValueString)<conditionValue){				
				
				if(targetElementAttributeValueString==null){
					registry[4]="Not defined";	
				}else{
					registry[4]=conditionAttribute+"="+targetElementAttributeValueString;
				}
				
				if(!existRelation(requirement, targetElement)){
					Relation newRelation = IArchimateFactory.eINSTANCE.createRelation();
					newRelation.setName(IMPACT);
					try {
						newRelation.setSource(requirement);							
					} catch (Exception e) {
					}
					try {
						newRelation.setTarget(targetElement);							
					} catch (Exception e) {
					}
					newRelation.setTypeName(RelationTypeName.ASSOCIATION);
					createRelationBetweenElementImpl(requirement, targetElement, newRelation);
					registry[5]="Relation Created";
				}else{
					registry[5]="Relation Already Exists";					
				}
			}else if(existRelation(requirement, targetElement)){
				deleteRelationBetweenElementImpl(requirement, targetElement, IMPACT);
				registry[4]=conditionAttribute+"="+targetElementAttributeValueString;
				registry[5]="Relation Deleted";					
			}else{
				registry[4]=conditionAttribute+"="+targetElementAttributeValueString;
				registry[5]="None";									
			}
			this.analysisMethodReport.addRegistry(registry);
			i++;
		}
		String []registry = new String[this.analysisMethodReport.getTitles().length];
		registry[0]="";
		registry[1]="";
		registry[2]="";
		registry[3]="";
		registry[4]="";
		registry[5]="";
		this.analysisMethodReport.addRegistry(registry);
	}

	private boolean existRelation(ElementImpl requirement, ElementImpl targetElement) {
		for(Relation relation : requirement.getRelations()){
			if(relation.getName()!=null){
				if(relation.getName().equals(IMPACT) && relation.getTarget()==targetElement){ 
					return true;
				}				
			}
		}		
		return false;
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


