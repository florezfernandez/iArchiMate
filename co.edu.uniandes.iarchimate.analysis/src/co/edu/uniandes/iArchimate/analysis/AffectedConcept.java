package co.edu.uniandes.iArchimate.analysis;

import java.util.ArrayList;

public class AffectedConcept {
	private String typeName;
	private ArrayList<AdditionalAttribute> additionalAttributes = new ArrayList<AdditionalAttribute>();
	private ArrayList<AdditionalRelation> additionalRelations = new ArrayList<AdditionalRelation>();

	public AffectedConcept(String typeName){
		this.typeName = typeName;
	}
	
	public String getTypeName() {
		return typeName;
	}
	
	public void addAttribute(String name, String type, String restriction, String calculated){
		this.additionalAttributes.add(new AdditionalAttribute(name, type, restriction, calculated));		
	}

	public ArrayList<AdditionalAttribute> getAdditionalAttributes() {
		return additionalAttributes;
	}

	public ArrayList<AdditionalRelation> getAdditionalRelations() {
		return additionalRelations;
	}

	public void addRelation(String name, String type, String target){
		this.additionalRelations.add(new AdditionalRelation(name, type, target));		
	}

}
