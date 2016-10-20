package co.edu.uniandes.iArchimate.indicators;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import co.edu.uniandes.iArchimate.utilities.emf.ModelingUtilities;
import co.edu.uniandes.iArchimate.utilities.persistance.ModelLoader;

public abstract class Indicator {
	protected EPackage intermediateMetaModel = ModelLoader.loadMetaModel(URI.createURI(ModelingUtilities.EiMM_URI));
	protected EObject activeModel; 
	protected IndicatorReport indicatorReport;
	protected String[] registry;

	public Indicator(){
		try {
			this.activeModel = ModelLoader.loadModel(ModelingUtilities.getModelPath(), intermediateMetaModel);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public IndicatorReport getIndicatorReport() {
		return indicatorReport;
	}

	public abstract void calculateIndicator();
}
