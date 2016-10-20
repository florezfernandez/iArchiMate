package co.edu.uniandes.iArchimate.analysis.imperfection;

import java.util.ArrayList;
import java.util.HashMap;

public class ElementHelper {
	private int totalElements;
	private int imperfectElements;
	private HashMap<String, AttributeHelper> attributeHelpers = new HashMap<String, AttributeHelper>();
	private ArrayList<String> attributeNames = new ArrayList<String>();
	private HashMap<String, RelationHelper> relationHelpers = new HashMap<String, RelationHelper>();
	private ArrayList<String> relationTypeNames = new ArrayList<String>();
	
	public ElementHelper(int imperfectElements) {
		this.totalElements = 1;
		this.imperfectElements = imperfectElements;
	}

	public int getTotalElements() {
		return totalElements;
	}

	public void addTotalElements(){
		this.totalElements++;
	}
	
	public int getImperfectElements() {
		return imperfectElements;
	}

	public void addImperfectElements(){
		this.imperfectElements++;
	}
	
	public HashMap<String, AttributeHelper> getAttributeHelpers() {
		return attributeHelpers;
	}

	public ArrayList<String> getAttributeNames() {
		return attributeNames;
	}

	public HashMap<String, RelationHelper> getRelationHelpers() {
		return relationHelpers;
	}

	public ArrayList<String> getRelationTypeNames() {
		return relationTypeNames;
	}

	public void addAttribute(String attributeName, boolean isImperfectAttribute){
		AttributeHelper attributeHelper = this.attributeHelpers.get(attributeName);
		if(attributeHelper==null){
			AttributeHelper newAttributeHelper = new AttributeHelper((isImperfectAttribute)?1:0);
			this.attributeHelpers.put(attributeName, newAttributeHelper);
			this.attributeNames.add(attributeName);
		}else{
			attributeHelper.addTotalAttributes();
			if(isImperfectAttribute){
				attributeHelper.addImperfectAttributes();
			}
		}			
	}

	public void addRelation(String relationTypeName, boolean isImperfectRelation) {
		RelationHelper relationHelper = this.relationHelpers.get(relationTypeName);
		if(relationHelper==null){
			RelationHelper newRelationHelper = new RelationHelper((isImperfectRelation)?1:0);
			this.relationHelpers.put(relationTypeName, newRelationHelper);
			this.relationTypeNames.add(relationTypeName);
		}else{
			relationHelper.addTotalRelations();
			if(isImperfectRelation){
				relationHelper.addImperfectRelations();
			}
		}					
	}
}
