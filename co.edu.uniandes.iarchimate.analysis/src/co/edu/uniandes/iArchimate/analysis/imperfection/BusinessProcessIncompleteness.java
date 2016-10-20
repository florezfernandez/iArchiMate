package co.edu.uniandes.iArchimate.analysis.imperfection;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import co.edu.uniandes.iArchimate.analysis.AnalysisMethodReport;
import co.edu.uniandes.iArchimate.utilities.emf.MetaModelUtilities;
import co.edu.uniandes.iArchimate.utilities.emf.ModelUtilities;

public class BusinessProcessIncompleteness extends AnalysisMethodImperfection {

	private EClass eClassElement;
	private EReference eReferenceRelationsInElement;
	private EClass eClassRelation;
	private EReference eReferenceTargetInRelation;
	private EAttribute eAttributeTypeNameInElement;
	private EAttribute eAttributeNameInElement;
	private ArrayList<String> relatedActors;
	private ArrayList<String> relatedRoles;
	
	public BusinessProcessIncompleteness(){
		super();
	}

	@Override
	public void performAnalysisMethod(){
		try {
			this.eClassElement = MetaModelUtilities.findEClass(this.intermediateMetaModel, "Element");
			this.eClassRelation = MetaModelUtilities.findEClass(this.intermediateMetaModel, "Relation");
			
			this.eAttributeTypeNameInElement = MetaModelUtilities.findEAttribute(eClassElement, "typeName");
			this.eAttributeNameInElement = MetaModelUtilities.findEAttribute(eClassElement, "name");
			
			this.eReferenceRelationsInElement = MetaModelUtilities.findEReference(eClassElement, "relations");						
			this.eReferenceTargetInRelation = MetaModelUtilities.findEReference(eClassRelation, "target");

			
			this.analysisMethodReport = new AnalysisMethodReport(new String[]{"Business Process Name","Total","Related Business Actors","Related Business Roles"});			
			
			ArrayList<EObject> businessProcesses = ModelUtilities.getElementsByTypeName(this.activeModel, "BusinessProcess");
			sortBusinessProcesses(businessProcesses);
			ArrayList<EObject> businessActors = ModelUtilities.getElementsByTypeName(this.activeModel, "BusinessActor");
			ArrayList<EObject> businessRoles = ModelUtilities.getElementsByTypeName(this.activeModel, "BusinessRole");
			
			int []totals = new int[20];
			
			for(EObject businessProcess : businessProcesses){
				this.relatedActors = new ArrayList<String>();
				this.relatedRoles = new ArrayList<String>();
				int amountOfActorsOrRoles=0;
				amountOfActorsOrRoles+=findActorsOrRoles(businessProcess, businessActors, businessRoles);	

				String relatedActorsString = "";
				for(String relatedActor : this.relatedActors){
					relatedActorsString+=relatedActor+". ";
				}
				String relatedRolesString = "";
				for(String relatedRole : this.relatedRoles){
					relatedRolesString+=relatedRole+". ";
				}
				
				this.registry=new String[this.analysisMethodReport.getTitles().length];
				this.registry[0]=businessProcess.eGet(this.eAttributeNameInElement).toString();
				this.registry[1]=String.valueOf(amountOfActorsOrRoles);
				this.registry[2]=relatedActorsString;
				this.registry[3]=relatedRolesString;
				this.analysisMethodReport.addRegistry(this.registry);
			
				totals[amountOfActorsOrRoles]++;
			}
			
			for(int i=0; i<totals.length; i++){
				if(totals[i]!=0){
					String [] chartRegistry = new String[2];
					chartRegistry[0] = totals[i] + " Processes with \n"+i+" Actors or Roles";
					chartRegistry[1] = String.valueOf(totals[i]);
					this.chartDataReport.add(chartRegistry);												
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void sortBusinessProcesses(ArrayList<EObject> businessProcesses) {
		for(int i=0; i<businessProcesses.size()-1; i++){
			for(int j=i+1; j<businessProcesses.size(); j++){
				if(businessProcesses.get(i).eGet(this.eAttributeNameInElement).toString().compareTo(businessProcesses.get(j).eGet(this.eAttributeNameInElement).toString())>0){
					EObject bp = businessProcesses.get(i); 
					businessProcesses.set(i, businessProcesses.get(j));
					businessProcesses.set(j, bp); 
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	private int findActorsOrRoles(EObject element, ArrayList<EObject> actors, ArrayList<EObject> roles) {
		int total=0;
		EList<EObject> relationsOfElement = (EList<EObject>)element.eGet(this.eReferenceRelationsInElement);
		for(EObject relation : relationsOfElement){
			EObject target = (EObject)relation.eGet(this.eReferenceTargetInRelation);
			String targetTypeName = target.eGet(this.eAttributeTypeNameInElement).toString();
			if(targetTypeName.equals("BusinessActor") || targetTypeName.equals("BusinessRole")){				
				total++;
			}else if (targetTypeName.equals("BusinessProcess")){
				total+=findActorsOrRoles(target, actors, roles);
			}
		}
		total+=relatedActors(element, actors);
		total+=relatedRoles(element, roles);
		return total;
	}

	@SuppressWarnings("unchecked")
	private int relatedActors(EObject element, ArrayList<EObject> actors){
		int total=0;
		for(EObject actor : actors){
			EList<EObject> relationsOfActor = (EList<EObject>)actor.eGet(this.eReferenceRelationsInElement);
			for(EObject relation : relationsOfActor){
				EObject target = (EObject)relation.eGet(this.eReferenceTargetInRelation);
				if(target==element){
					if(!alreadyActorAdded(actor.eGet(this.eAttributeNameInElement).toString())){
						this.relatedActors.add(actor.eGet(this.eAttributeNameInElement).toString());
						total++;
					}
				}
			}
		}
		return total;
	}
	
	@SuppressWarnings("unchecked")
	private int relatedRoles(EObject element, ArrayList<EObject> roles){
		int total=0;
		for(EObject role : roles){
			EList<EObject> relationsOfActor = (EList<EObject>)role.eGet(this.eReferenceRelationsInElement);
			for(EObject relation : relationsOfActor){
				EObject target = (EObject)relation.eGet(this.eReferenceTargetInRelation);
				if(target==element){
					if(!alreadyRoleAdded(role.eGet(this.eAttributeNameInElement).toString())){
						this.relatedRoles.add(role.eGet(this.eAttributeNameInElement).toString());
						total++;						
					}
				}
			}
		}
		return total;
	}

	private boolean alreadyActorAdded(String actorName){
		for(String relatedActor : this.relatedActors){
			if(relatedActor.equals(actorName)){
				return true;
			}
		}
		return false;
	}

	private boolean alreadyRoleAdded(String roleName){
		for(String relatedRole : this.relatedRoles){
			if(relatedRole.equals(roleName)){
				return true;
			}
		}
		return false;
	}

	
}
