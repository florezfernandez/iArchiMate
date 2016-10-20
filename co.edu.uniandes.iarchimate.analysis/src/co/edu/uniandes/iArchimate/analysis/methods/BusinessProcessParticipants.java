package co.edu.uniandes.iArchimate.analysis.methods;

import iArchimate.Component;
import iArchimate.Relation;
import iArchimate.impl.ElementImpl;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import co.edu.uniandes.iArchimate.analysis.AffectedConcept;
import co.edu.uniandes.iArchimate.analysis.AnalysisMethodReport;

public class BusinessProcessParticipants extends AnalysisMethod {

	public BusinessProcessParticipants() {
		super();
		this.concept=AnalysisMethodHelper.BUSINESS_PROCESS;
		this.analysisMethod=AnalysisMethodHelper.PARTICIPATS;
		this.validationFileName=AnalysisMethodHelper.BUSINESS_PROCESS_PARTICIPANTS;
	}

	@Override
	public String getDescription() {
		return "Calculates the business actors and business roles associated with all business processes. Actors and roles related"
				+ " with business interactions, collaboration and functions are included if they are on top of the third level.";
	}

	@Override
	public void initAffectedConcepts() {
		AffectedConcept affectedConcept;
		affectedConcept = new AffectedConcept(AnalysisMethodHelper.BUSINESS_PROCESS);
		this.affectedConcepts.add(affectedConcept);
		affectedConcept = new AffectedConcept(AnalysisMethodHelper.BUSINESS_ACTOR);
		this.affectedConcepts.add(affectedConcept);
		affectedConcept = new AffectedConcept(AnalysisMethodHelper.BUSINESS_ROLE);
		this.affectedConcepts.add(affectedConcept);
	}

	@Override
	public String performAnalysisMethod() {
		try {
			ArrayList<ElementImpl> businessProcesses = findArrayOfElementImpl(AnalysisMethodHelper.BUSINESS_PROCESS);
			ArrayList<ElementImpl> businessActors = findArrayOfElementImpl(AnalysisMethodHelper.BUSINESS_ACTOR);
			ArrayList<ElementImpl> businessRoles = findArrayOfElementImpl(AnalysisMethodHelper.BUSINESS_ROLE);
			this.analysisMethodReport = new AnalysisMethodReport(new String[]{"#","Business Process Name","Participant Name", "Participant Type", "Details"});			
			for(ElementImpl businessProcess : businessProcesses){
				this.findBusinessActorsOrRolesInBusinessElement(businessProcess, new ArrayList<ElementImpl>(), businessActors, 0);				
				this.findBusinessActorsOrRolesInBusinessElement(businessProcess, new ArrayList<ElementImpl>(), businessRoles, 0);				
				if(!hasRegistries(businessProcess)){
					addRegistry(businessProcess, new ArrayList<ElementImpl>(), null);
				}			
			}
			return this.concept + " " + this.analysisMethod + "\n  The analysis method was executed correctly.\n  See the iArchiMate Analysis Results view for more details"; 
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	private void findBusinessActorsOrRolesInBusinessElement(ElementImpl element, ArrayList<ElementImpl> parentElements, ArrayList<ElementImpl> businessActorsOrRoles, int recursiveLevel){
		if(recursiveLevel>3){
			return;
		}
		if(parentElements.size()==recursiveLevel){
			parentElements.add(recursiveLevel, element);	
		}else{
			parentElements.set(recursiveLevel, element);
			for(int i=parentElements.size()-1; i>recursiveLevel; i--){
				parentElements.remove(i);
			}
		}
		recursiveLevel++;
		for(ElementImpl businessActorOrRole : businessActorsOrRoles){
			if(areRelatedElements(element, businessActorOrRole)){
				addRegistry(element, parentElements, businessActorOrRole);
			}
		}
		ArrayList<ElementImpl> subElements = new ArrayList<ElementImpl>();
		if(element.getRelations().size()>0){			
			EList<Relation> elementRelations = element.getRelations();
			for(Relation elementRelation : elementRelations){
				String elementRelationName = elementRelation.getTarget().getTypeName().getName();
				if((elementRelationName.equals(AnalysisMethodHelper.BUSINESS_PROCESS) && elementRelation.getTypeName().getName().equals(AnalysisMethodHelper.COMPOSITION)) || 
					elementRelationName.equals(AnalysisMethodHelper.BUSINESS_COLLABORATION) ||
					elementRelationName.equals(AnalysisMethodHelper.BUSINESS_INTERACTION) ||
					elementRelationName.equals(AnalysisMethodHelper.BUSINESS_FUNCTION)){
					if(!elementIsParent((ElementImpl)elementRelation.getTarget(), parentElements)){						
						subElements.add((ElementImpl)elementRelation.getTarget());							
					}
				}
			}
		}
		ArrayList<ElementImpl> relatedElements = findArrayOfElementImplByTarget(element.getName());
		for(ElementImpl relatedElement : relatedElements){
			String elementRelationName = relatedElement.getTypeName().getName();
			if(elementRelationName.equals(AnalysisMethodHelper.BUSINESS_COLLABORATION) ||
				elementRelationName.equals(AnalysisMethodHelper.BUSINESS_INTERACTION) ||
				elementRelationName.equals(AnalysisMethodHelper.BUSINESS_FUNCTION)){
				if(!elementIsParent(relatedElement, parentElements)){						
					subElements.add(relatedElement);
				}
			}
		}
		if(element.getComponents().size()>0){
			EList<Component> subComponents = element.getComponents();				
			for(Component subComponent : subComponents){
				if(subComponent instanceof ElementImpl){
					ElementImpl subElement = (ElementImpl)subComponent;
					if(subElement.getTypeName().getName().equals(AnalysisMethodHelper.BUSINESS_PROCESS)){
						subElements.add(subElement);
					}
				}
			}
		}
		for(ElementImpl subElement : subElements){
			findBusinessActorsOrRolesInBusinessElement(subElement, parentElements, businessActorsOrRoles, recursiveLevel);						
		}
	}

	private boolean hasRegistries(ElementImpl element) {
		for(String[] registry : this.analysisMethodReport.getRegistries()){
			if(registry[1].equals(element.getName())){
				return true;
			}
		}
		return false;
	}

	private boolean elementIsParent(ElementImpl element, ArrayList<ElementImpl> parentElements) {
		for(ElementImpl parentElement : parentElements){
			if(parentElement==element){
				return true;
			}
		}
		return false;
	}

	private void addRegistry(ElementImpl element, ArrayList<ElementImpl> parentElements, ElementImpl businessActorOrRole){
		if(businessActorOrRole!=null){
			if(!existRegistry(element, parentElements, businessActorOrRole)){
				String []registry = new String[this.analysisMethodReport.getTitles().length];
				registry[0]="";
				registry[1]="";
				registry[2]=businessActorOrRole.getName();					
				registry[3]=businessActorOrRole.getTypeName().getName();
				registry[4]="";
				if(isFirstRegistry(element, parentElements)){
					registry[0]=getNextRegistryNumber(element, parentElements);
					if(parentElements.size()==0){
						registry[1]=element.getName();	
					}else{
						registry[1]=parentElements.get(0).getName();
						for(int i=1; i<parentElements.size(); i++){
							registry[4]+="via "+parentElements.get(i).getName()+" ("+parentElements.get(i).getTypeName().getName()+") ";					
						}
					}
				}else{
					if(parentElements.size()!=0){
						for(int i=1; i<parentElements.size(); i++){
							registry[4]+="via "+parentElements.get(i).getName()+" ("+parentElements.get(i).getTypeName().getName()+") ";					
						}
					}					
				}
				this.analysisMethodReport.addRegistry(registry);								
			}			
		}else{
			String []registry = new String[this.analysisMethodReport.getTitles().length];
			registry[0]=getNextRegistryNumber(element, parentElements);
			registry[1]=element.getName();
			registry[2]=" - ";
			registry[3]=" - ";
			registry[4]="No business actors or roles found";
			this.analysisMethodReport.addRegistry(registry);											
		}
	}
	
	public String getNextRegistryNumber(ElementImpl element, ArrayList<ElementImpl> parentElements){
		if(this.analysisMethodReport.getRegistries().size()==0){
			return "1";
		}
		for(int i=this.analysisMethodReport.getRegistries().size()-1; i>=0; i--){
			if(!this.analysisMethodReport.getRegistries().get(i)[0].equals("")){
				int number = Integer.parseInt(this.analysisMethodReport.getRegistries().get(i)[0]);
				number++;
				return String.valueOf(number);
			}
		}
		return "";
	}

	private boolean existRegistry(ElementImpl element, ArrayList<ElementImpl> parentElements, ElementImpl businessActorOrRole) {
		for(String[] registry : this.analysisMethodReport.getRegistries()){
			if(registry[2].contains(businessActorOrRole.getName())){
				if(registry[1].equals(element.getName())){
					return true;
				}else if(parentElements.size()>0){
					if(registry[1].equals(parentElements.get(0).getName())){
						return true;						
					}
				}
			}
		}
		return false;
	}

	private boolean isFirstRegistry(ElementImpl element, ArrayList<ElementImpl> parentElements) {
		for(String[] registry : this.analysisMethodReport.getRegistries()){
			if(registry[1].equals(element.getName())){
				return false;
			}else if(parentElements.size()>0){
				if(registry[1].equals(parentElements.get(0).getName())){
					return false;						
				}
			}
		}
		return true;		
	}

	private boolean areRelatedElements(ElementImpl element1, ElementImpl element2) {
		EList<Relation> element1Relations = element1.getRelations();
		for(Relation element1Relation : element1Relations){
			if(element1Relation.getTarget()==element2){
				return true;
			}
		}
		EList<Relation> element2Relations = element2.getRelations();
		for(Relation element2Relation : element2Relations){
			if(element2Relation.getTarget()==element1){
				return true;
			}
		}
		return false;
	}
}
