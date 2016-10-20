package co.edu.uniandes.iArchimate.analysis.methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;

import co.edu.uniandes.iArchimate.utilities.emf.ModelingUtilities;
import co.edu.uniandes.iArchimate.utilities.persistance.PropertiesLoader;

public class AnalysisMethodHelper {
	//Elements
	public static String MODEL="Model";
	public static String ELEMENT="Elements";
	public static String APPLICATION_COMPONENT="ApplicationComponent";
	public static String APPLICATION_SERVICE="ApplicationService";
	public static String BUSINESS_ACTOR="BusinessActor";
	public static String BUSINESS_ROLE="BusinessRole";
	public static String BUSINESS_PROCESS="BusinessProcess";
	public static String BUSINESS_INTERACTION="BusinessInteraction";
	public static String BUSINESS_COLLABORATION="BusinessCollaboration";
	public static String BUSINESS_FUNCTION="BusinessFunction";
	public static String DEVICE="Device";
	public static String INFRASTRUCTURE_SERVICE="InfrastructureService";
	public static String REQUIREMENT="Requirement";
	public static String SYSTEM_SOFTWARE="SystemSoftware";

	//Relations
	public static String COMPOSITION="Composition";

	//Analysis Methods
	public static String AVAILABILITY="Availability";
	public static String FAULT_SUSCEPTIBILITY="Fault Susceptibility";
	public static String FRAGMENTATION_LEVEL="Fragmentation Level";
	public static String STORAGE_AVAILABILITY="Storage Availability";
	public static String IMPACT_OF_REMOVING_ELEMENTS="Impact of Removing Elements";
	public static String IMPACT_OVER_DEVICE="Impact over Device";
	public static String IMPACT_OVER_IT_ELEMENTS="Impact over IT Elements";
	public static String IMPORTANCE_LEVEL="Importance Level";
	public static String PARTICIPATION_IN_BUSINESS_PROCESS="Participation in Business Process";
	public static String PARTICIPATS="Participants";

	//Validation Scripts
	public static String APPLICATION_COMPONENT_AVAILABILITY="ApplicationComponentAvailability";
	public static String APPLICATION_COMPONENT_IMPORTANCE_LEVEL="ApplicationComponentImportanceLevel";
	public static String DEVICE_STORAGE_AVAILABILITY="DeviceStorageAvailability";
	public static String BUSINESS_PROCESS_FAULT_SUSCEPTIBILITY="BusinessProcessFaultSusceptibility";
	public static String BUSINESS_PROCESS_PARTICIPANTS="BusinessProcessParticipants";
	public static String BUSINESS_ROLE_PARTICIPATION_IN_BUSINESS_PROCESS="BusinessRoleParticipationInBusinessProcess";
	public static String EMPTY="Empty";
	public static String REQUIREMENT_IMPACT_OVER_DEVICE="RequirementImpactOverDevice";
	public static String REQUIREMENT_IMPACT_OVER_IT_ELEMENTS="RequirementImpactOverITElements";
	
	//Attributes
	public static String ATT_AVAILABILITY="availability";
	public static String ATT_REMOVE="remove";
	public static String ATT_FAULT_SUCSEPTIBILITY="faultSusceptibility";
	public static String ATT_IMPORTANCE_LEVEL="importanceLevel";
	public static String ATT_STORAGE_AVAILABILITY="storageAvailability";
	public static String ATT_STORAGE_CAPACITY="storageCapacity";
	public static String ATT_STORAGE_INCREMENT_PER_MONTH="storageIncrementPerMonth";
	public static String ATT_STORAGE_USED="storageUsed";
	
	//ImperfectionTypes
	public static String NUMERIC_RANGE="NumericRange";
	public static String NUMERIC_SET="NumericSet";
	public static String STRING_SET="StringSet";
	public static String NUMERIC_VALUE_CERTAINTY_DEGREE="NumericValueCertaintyDegree";
	public static String STRING_VALUE_CERTAINTY_DEGREE="StringValueCertaintyDegree";
	public static String LINGUISTIC_VALUE="LinguisticValue";
	public static String NO_VALUE="NoValue";
	
	public static String CREATED="Created";
	public static String UPDATED="Updated";
	public static String NULL="null";

	public static String[] CONCEPTS={
		MODEL,
		APPLICATION_COMPONENT,
		BUSINESS_PROCESS,
		DEVICE,
		REQUIREMENT
		};
	
	public static String[][] ANALYSIS_METHODS={
		{IMPACT_OF_REMOVING_ELEMENTS},
		{AVAILABILITY,IMPORTANCE_LEVEL},
		{FAULT_SUSCEPTIBILITY,PARTICIPATS},
		{STORAGE_AVAILABILITY},		
		{IMPACT_OVER_IT_ELEMENTS}
	};
	
	public static String[] CONCEPTS_PLUS_ANALYSIS_METHODS={
		"ApplicationComponent->Availability",
		"ApplicationComponent->Importance Level",
		"BusinessProcess->Fault Susceptibility",
		"BusinessProcess->Fragmentation Level",
		"BusinessProcess->Participants",
		"BusinessRole->Participation in Business Process",
		"Device->Storage Availability",
		"Requirement->Impact over Device"
	};
		
	public static String[][] POSSIBLE_NEXT_CONCEPTS_PLUS_ANALYSIS_METHODS={
		{"ApplicationComponent->Availability","ApplicationService->Availability"},
		{"ApplicationComponent->Availability","BusinessProcess->Fault Susceptibility"},
		{"ApplicationComponent->Availability","BusinessProcess->Recovery Time Objective"},
	};
	
	public static String[] getPossibleAnalysisMethods(String previousAnalysisMethod){
		String []possibleAnalysisMethodsTemp = new String[POSSIBLE_NEXT_CONCEPTS_PLUS_ANALYSIS_METHODS.length];
		int numPossibleAnalysisMethods=0;
		for(int i=0; i<POSSIBLE_NEXT_CONCEPTS_PLUS_ANALYSIS_METHODS.length; i++){
			if(POSSIBLE_NEXT_CONCEPTS_PLUS_ANALYSIS_METHODS[i][0].equals(previousAnalysisMethod)){
				possibleAnalysisMethodsTemp[numPossibleAnalysisMethods]=POSSIBLE_NEXT_CONCEPTS_PLUS_ANALYSIS_METHODS[i][1];
				numPossibleAnalysisMethods++;
			}
		}
		String []possibleAnalysisMethods = new String[numPossibleAnalysisMethods];
		for(int i=0; i<numPossibleAnalysisMethods; i++){
			possibleAnalysisMethods[i]=possibleAnalysisMethodsTemp[i];
		}
		return possibleAnalysisMethods;
	}
	
	public static void unselectAnalysisMethod() {
		try {
			final URL urlSource = FileLocator.toFileURL(new URL("platform:/plugin/co.edu.uniandes.iArchimate.analysis/rulesFiles/Empty.evl"));
			AnalysisMethodHelper.copyValidationFile(urlSource);
			String propertiesPath = ModelingUtilities.getAbsolutProjectPath()+"/analysis.properties";		
			String [][]propertiesValues = {{"concept", AnalysisMethodHelper.NULL},{"analysisMethod", AnalysisMethodHelper.NULL}};
			PropertiesLoader.storeProperty(propertiesPath, propertiesValues);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void copyValidationFile(URL urlSource) throws MalformedURLException, IOException{
		File sourceValidationFile = new File(urlSource.getPath());
		final URL urlTarget = FileLocator.toFileURL(new URL("platform:/plugin/co.edu.uniandes.iArchimate.validation/rules/generatedOntologicalRulesForAnalysis.evl"));
		File targetValidationFile = new File(urlTarget.getPath());
		InputStream in = new FileInputStream(sourceValidationFile);
		OutputStream out = new FileOutputStream(targetValidationFile);
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();
	}
	
	public static String loadAnalysisProperty(String attribute){
		return PropertiesLoader.loadProperty(ModelingUtilities.getAbsolutProjectPath()+"/analysis.properties", attribute);
	}

	public static String[] loadAnalysisProperties(String []attributes){		
		return PropertiesLoader.loadProperties(ModelingUtilities.getAbsolutProjectPath()+"/analysis.properties", attributes);
	}

}

