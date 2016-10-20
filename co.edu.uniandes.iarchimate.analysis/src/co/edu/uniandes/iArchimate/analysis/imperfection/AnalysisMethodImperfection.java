package co.edu.uniandes.iArchimate.analysis.imperfection;

import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import co.edu.uniandes.iArchimate.analysis.AnalysisMethodReport;
import co.edu.uniandes.iArchimate.utilities.emf.ModelingUtilities;
import co.edu.uniandes.iArchimate.utilities.persistance.ModelLoader;

public abstract class AnalysisMethodImperfection {
	protected EPackage intermediateMetaModel = ModelLoader.loadMetaModel(URI.createURI(ModelingUtilities.EiMM_URI));
	protected EObject activeModel; 
	protected AnalysisMethodReport analysisMethodReport;
	protected String[] registry;
	protected ArrayList<String[]>chartDataReport = new ArrayList<String[]>();
	
	public AnalysisMethodImperfection(){
		try {
			this.activeModel = ModelLoader.loadModel(ModelingUtilities.getModelPath(), intermediateMetaModel);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public AnalysisMethodReport getAnalysisMethodReport() {
		return analysisMethodReport;
	}

	public ArrayList<String[]> getChartDataReport() {
		return chartDataReport;
	}

	public abstract void performAnalysisMethod();
}
