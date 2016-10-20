package co.edu.uniandes.iArchimate.analysis.methods.imperfection.helper;

import java.util.ArrayList;

public class ScenarioResult {
	private ArrayList<String> sourcesNames = new ArrayList<String>();
	private ArrayList<String> sourcesAttributeValues = new ArrayList<String>();
	private String targetName;
	private double targetAttributeValue;
	
	public ArrayList<String> getSourcesNames() {
		return sourcesNames;
	}
	
	public void setSourcesNames(ArrayList<String> sourcesNames) {
		this.sourcesNames = sourcesNames;
	}
	
	public ArrayList<String> getSourcesAttributeValues() {
		return sourcesAttributeValues;
	}
	
	public void setSourcesAttributeValues(ArrayList<String> sourcesAttributeValues) {
		this.sourcesAttributeValues = sourcesAttributeValues;
	}
	
	public String getTargetName() {
		return targetName;
	}
	
	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}
	
	public double getTargetAttributeValue() {
		return targetAttributeValue;
	}
	
	public void setTargetAttributeValue(double targetAttributeValue) {
		this.targetAttributeValue = targetAttributeValue;
	}
	
	
	
}
