package co.edu.uniandes.iArchimate.analysis.methods;

import iArchimate.Relation;
import iArchimate.impl.ElementImpl;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import co.edu.uniandes.iArchimate.analysis.AffectedConcept;
import co.edu.uniandes.iArchimate.analysis.AnalysisMethodReport;

public class BusinessRoleParticipationInBusinessProcess extends AnalysisMethod {

	public BusinessRoleParticipationInBusinessProcess() {
		super();
		this.concept=AnalysisMethodHelper.BUSINESS_ROLE;
		this.analysisMethod=AnalysisMethodHelper.PARTICIPATION_IN_BUSINESS_PROCESS;
		this.validationFileName=AnalysisMethodHelper.BUSINESS_ROLE_PARTICIPATION_IN_BUSINESS_PROCESS;
	}
	
	@Override
	public String getDescription() {
		return "Determines for each business role the percentage of participation regarding all business processes";
	}

	@Override
	public void initAffectedConcepts() {
		AffectedConcept affectedConcept;
		affectedConcept = new AffectedConcept("BusinessRole");
		this.affectedConcepts.add(affectedConcept);
		affectedConcept = new AffectedConcept("BusinessProcess");
		this.affectedConcepts.add(affectedConcept);
	}

	@Override
	public String performAnalysisMethod() {
		try {
			String title="BUSINESS ROLE IN BUSINESS PROCESS\n";
			String message="The business role participation in business process is:\n";
			ArrayList<ElementImpl> businessRoles = findArrayOfElementImpl("BusinessRole");
			ArrayList<ElementImpl> businessProcesses = findArrayOfElementImpl("BusinessProcess");
			this.analysisMethodReport = new AnalysisMethodReport(new String[]{"BusinessRole","Percentage","Associated BusinessProcess"});			
			String associatedBusinessProcess="";
			for(ElementImpl businessRole : businessRoles){
				int numberOfBusinessProcesses = 0;
				for(ElementImpl businessProcess : businessProcesses){
					EList<Relation> businessProcessRelations = businessProcess.getRelations();
					for(Relation businessProcessRelation : businessProcessRelations){
						if(businessProcessRelation.getTarget().getName().equals(businessRole.getName())){
							numberOfBusinessProcesses++;
							associatedBusinessProcess+=businessProcess.getName()+". ";
						}						
					}
				}
				double percentage = ((double)numberOfBusinessProcesses)/((double)businessProcesses.size());
				percentage=(double)(Math.round(percentage*1000))/1000;
				message+="  - "+businessRole.getName()+" = "+percentage*100+"%\n";			
				
				String []registry = new String[3];
				registry[0]=businessRole.getName();
				registry[1]=String.valueOf(percentage);
				registry[2]="("+numberOfBusinessProcesses+") "+associatedBusinessProcess;
				this.analysisMethodReport.addRegistry(registry);
			}
			
			return title+message; 
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}
}
