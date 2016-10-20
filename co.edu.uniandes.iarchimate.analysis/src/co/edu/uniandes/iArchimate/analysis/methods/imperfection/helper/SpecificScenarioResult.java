package co.edu.uniandes.iArchimate.analysis.methods.imperfection.helper;


public class SpecificScenarioResult {
	private String sourceName = new String();
	private double sourceAttributeValue;
	private String targetName;
	private double targetAttributeValue;
	
	public SpecificScenarioResult(String sourceName, double sourceAttributeValue, String targetName, double targetAttributeValue) {
		this.sourceName = sourceName;
		this.sourceAttributeValue = sourceAttributeValue;
		this.targetName = targetName;
		this.targetAttributeValue = targetAttributeValue;
	}

	public String getSourceName() {
		return sourceName;
	}

	public double getSourceAttributeValue() {
		return sourceAttributeValue;
	}

	public String getTargetName() {
		return targetName;
	}

	public double getTargetAttributeValue() {
		return targetAttributeValue;
	}
	
	
	
	
}
