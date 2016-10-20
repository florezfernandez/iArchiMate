package co.edu.uniandes.iArchimate.analysis.methods;

import java.net.URL;
import java.util.ArrayList;

import org.eclipse.core.runtime.FileLocator;

import co.edu.uniandes.iArchimate.utilities.emf.ModelingUtilities;
import co.edu.uniandes.iArchimate.utilities.persistance.PropertiesLoader;

public class AnalysisChain {	
	private ArrayList<AnalysisMethod> analisysMethods = new ArrayList<AnalysisMethod>();

	public void addAnalysisMethod(AnalysisMethod analysisMethod){
		this.analisysMethods.add(analysisMethod);
	}

	public String selectAnalysisChain(){
		try {
			boolean validationFileCreated=false;
			String message="Analysis Chain.\nAnalysis Methods Selected:\n";
			int i=0;
			String [][]propertiesValues=new String[(this.analisysMethods.size()*2)+1][2];
			propertiesValues[0][0] = "numberOfAnalysisMethods";			
			propertiesValues[0][1] = String.valueOf(this.analisysMethods.size());			
			for(AnalysisMethod analysisMethod : this.analisysMethods){
				if(!validationFileCreated){
					final URL urlSource = FileLocator.toFileURL(new URL("platform:/plugin/co.edu.uniandes.iArchimate.analysis/rulesFiles/"+analysisMethod.validationFileName+".evl"));
					AnalysisMethodHelper.copyValidationFile(urlSource);					
				}
				propertiesValues[(2*i)+1][0] = "concept"+i;
				propertiesValues[(2*i)+1][1] = analysisMethod.getConcept();
				propertiesValues[(2*i)+2][0] = "analysisMethod"+i;
				propertiesValues[(2*i)+2][1] = analysisMethod.getAnalysisMethod();
				i++;
				message+=" - "+analysisMethod.getConcept()+" -> "+analysisMethod.getAnalysisMethod()+"\n";
			}
			String propertiesPath = ModelingUtilities.getAbsolutProjectPath()+"/analysis.properties";		
			PropertiesLoader.storeProperty(propertiesPath, propertiesValues);
			return message;
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}		
	}


}
