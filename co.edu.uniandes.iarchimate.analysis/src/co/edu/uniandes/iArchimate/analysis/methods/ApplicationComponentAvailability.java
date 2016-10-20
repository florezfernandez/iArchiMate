package co.edu.uniandes.iArchimate.analysis.methods;

import iArchimate.impl.ElementImpl;

import java.util.ArrayList;

import co.edu.uniandes.iArchimate.analysis.AdditionalAttribute;
import co.edu.uniandes.iArchimate.analysis.AffectedConcept;
import co.edu.uniandes.iArchimate.analysis.AnalysisMethodReport;

public class ApplicationComponentAvailability extends AnalysisMethod {

	public ApplicationComponentAvailability() {
		super();
		this.concept=AnalysisMethodHelper.APPLICATION_COMPONENT;
		this.analysisMethod=AnalysisMethodHelper.AVAILABILITY;
		this.validationFileName=AnalysisMethodHelper.APPLICATION_COMPONENT_AVAILABILITY;
	}
	
	@Override
	public String getDescription() {
		return "Calculates the availability of all application components based on the availability of the devices, system software, and infrastructure services that support it. "
				+ "The availability value of system software and infrastructure services are calculated if possible.";
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
			ArrayList<ElementImpl> devices = findArrayOfElementImpl("Device");
			ArrayList<ElementImpl> systemSoftwares = findArrayOfElementImpl("SystemSoftware");
			ArrayList<ElementImpl> infrastructureServices = findArrayOfElementImpl("InfrastructureService");
			this.analysisMethodReport = new AnalysisMethodReport(new String[]{"Element Type","Element Name","Attribute=Value","Associated Elements","Action"});			
			ArrayList<ArrayList<ElementImpl>> collectionOfSources = new ArrayList<ArrayList<ElementImpl>>();
			collectionOfSources.add(devices);
			calculateAndCreateDoubleAttribute(systemSoftwares, collectionOfSources, AnalysisMethodHelper.ATT_AVAILABILITY, AnalysisMethodHelper.ATT_AVAILABILITY);
			calculateAndCreateDoubleAttribute(infrastructureServices, collectionOfSources, AnalysisMethodHelper.ATT_AVAILABILITY, AnalysisMethodHelper.ATT_AVAILABILITY);
			collectionOfSources.add(systemSoftwares);
			collectionOfSources.add(infrastructureServices);
			calculateAndCreateDoubleAttribute(applicationComponents, collectionOfSources, AnalysisMethodHelper.ATT_AVAILABILITY, AnalysisMethodHelper.ATT_AVAILABILITY);			
			return this.concept + " " + this.analysisMethod + "\n  The analysis method was executed correctly.\n  See the iArchiMate Analysis Results view for more details"; 
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}
}
