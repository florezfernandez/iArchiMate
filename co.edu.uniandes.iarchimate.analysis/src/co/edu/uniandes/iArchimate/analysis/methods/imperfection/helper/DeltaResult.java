package co.edu.uniandes.iArchimate.analysis.methods.imperfection.helper;


public class DeltaResult {
	private String sourceName;
	private String targetName;
	private double sourceAttributeValue;
	private double targetMinAttributeValue;
	private double targetMaxAttributeValue;
	
	public DeltaResult(String sourceName, String targetName, double sourceAttributeValue, double targetMinAttributeValue, double targetMaxAttributeValue) {
		this.sourceName = sourceName;
		this.targetName = targetName;
		this.sourceAttributeValue = sourceAttributeValue;
		this.targetMinAttributeValue = targetMinAttributeValue;
		this.targetMaxAttributeValue = targetMaxAttributeValue;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourcesName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getTargetName() {
		return targetName;
	}

	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}

	public double getSourceAttributeValue() {
		return sourceAttributeValue;
	}

	public void setSourceAttributeValue(double sourceAttributeValue) {
		this.sourceAttributeValue = sourceAttributeValue;
	}

	public double getTargetMinAttributeValue() {
		return targetMinAttributeValue;
	}

	public void setTargetMinAttributeValue(double targetMinAttributeValue) {
		this.targetMinAttributeValue = targetMinAttributeValue;
	}

	public double getTargetMaxAttributeValue() {
		return targetMaxAttributeValue;
	}

	public void setTargetMaxAttributeValue(double targetMaxAttributeValue) {
		this.targetMaxAttributeValue = targetMaxAttributeValue;
	}
	
	
}
