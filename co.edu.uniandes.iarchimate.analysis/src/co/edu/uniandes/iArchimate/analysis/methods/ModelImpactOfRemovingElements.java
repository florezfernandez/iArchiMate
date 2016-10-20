package co.edu.uniandes.iArchimate.analysis.methods;

import iArchimate.Component;
import iArchimate.Relation;
import iArchimate.impl.ElementImpl;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import co.edu.uniandes.iArchimate.analysis.AdditionalAttribute;
import co.edu.uniandes.iArchimate.analysis.AffectedConcept;
import co.edu.uniandes.iArchimate.analysis.AnalysisMethodReport;

public class ModelImpactOfRemovingElements extends AnalysisMethod {

	public ModelImpactOfRemovingElements() {
		super();
		this.concept=AnalysisMethodHelper.MODEL;
		this.analysisMethod=AnalysisMethodHelper.IMPACT_OF_REMOVING_ELEMENTS;
		this.validationFileName=AnalysisMethodHelper.EMPTY;
	}

	@Override
	public String getDescription() {
		return "Assess the impact of removing one element from the model by means of the use one attribute in the element in order to simulate a logical "
				+ "removing process.";
	}

	@Override
	public void initAffectedConcepts() {
		AffectedConcept affectedConcept;
		affectedConcept = new AffectedConcept(AnalysisMethodHelper.ELEMENT);
		affectedConcept.addAttribute("remove", AdditionalAttribute.BOOLEAN, "true or false", AdditionalAttribute.OPTIONAL);
		this.affectedConcepts.add(affectedConcept);
	}

	@Override
	public String performAnalysisMethod() {
		try {
			ArrayList<ElementImpl> elements = findArrayOfElementImplByAttribute(AnalysisMethodHelper.ATT_REMOVE);
			this.analysisMethodReport = new AnalysisMethodReport(new String[]{"#","Element Name","Element Type","Impacted Element Name","Impacted Element Type", "Details"});			
			for(ElementImpl element : elements){
				this.findRelatedElements(element, new ArrayList<ElementImpl>(), 0);	
				String []registry = {"","","","",""};
				this.analysisMethodReport.addRegistry(registry);				
			}
			return this.concept + " " + this.analysisMethod + "\n  The analysis method was executed correctly.\n  See the iArchiMate Analysis Results view for more details"; 
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	private void findRelatedElements(ElementImpl element, ArrayList<ElementImpl> parentElements, int recursiveLevel) {
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

		ArrayList<ElementImpl> relatedElements = new ArrayList<ElementImpl>();
		EList<Relation> elementRelations = element.getRelations();
		for(Relation elementRelation : elementRelations){
			if(!elementIsParent((ElementImpl)elementRelation.getTarget(), parentElements)){						
				ElementImpl relatedElement = (ElementImpl)elementRelation.getTarget(); 
				relatedElements.add(relatedElement);	
				addRegistry(element, parentElements, relatedElement);
			}			
		}
		if(element.getComponents().size()>0){
			EList<Component> subComponents = element.getComponents();				
			for(Component subComponent : subComponents){
				if(subComponent instanceof ElementImpl){
					ElementImpl relatedElement = (ElementImpl)subComponent;
					relatedElements.add(relatedElement);
					addRegistry(element, parentElements, relatedElement);
				}
			}
		}
		for(ElementImpl relatedElement : relatedElements){
			findRelatedElements(relatedElement, parentElements, recursiveLevel);						
		}

	}

	private boolean elementIsParent(ElementImpl element, ArrayList<ElementImpl> parentElements) {
		for(ElementImpl parentElement : parentElements){
			if(parentElement==element){
				return true;
			}
		}
		return false;
	}

	private void addRegistry(ElementImpl element, ArrayList<ElementImpl> parentElements, ElementImpl relatedElement){
		if(!existRegistry(element, parentElements, relatedElement)){
			String []registry = new String[this.analysisMethodReport.getTitles().length];
			registry[0]="";
			registry[1]="";
			registry[2]="";
			registry[3]=relatedElement.getName();					
			registry[4]=relatedElement.getTypeName().getName();
			registry[5]="";
			if(isFirstRegistry(element, parentElements)){
				registry[0]=getNextRegistryNumber(element, parentElements);
				if(parentElements.size()==0){
					registry[1]=element.getName();	
					registry[2]=element.getTypeName().getName();	
				}else{
					registry[1]=parentElements.get(0).getName();
					registry[2]=parentElements.get(0).getTypeName().getName();	
					for(int i=1; i<parentElements.size(); i++){
						registry[5]+="via "+parentElements.get(i).getName()+" ("+parentElements.get(i).getTypeName().getName()+") ";					
					}
				}
			}else{
				if(parentElements.size()!=0){
					for(int i=1; i<parentElements.size(); i++){
						registry[5]+="via "+parentElements.get(i).getName()+" ("+parentElements.get(i).getTypeName().getName()+") ";					
					}
				}					
			}
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

	private boolean existRegistry(ElementImpl element, ArrayList<ElementImpl> parentElements, ElementImpl relatedElement) {
		for(String[] registry : this.analysisMethodReport.getRegistries()){
			if(registry[2].contains(relatedElement.getName())){
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
}
