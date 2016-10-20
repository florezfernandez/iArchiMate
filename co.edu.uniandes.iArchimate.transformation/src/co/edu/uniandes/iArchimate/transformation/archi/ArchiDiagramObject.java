package co.edu.uniandes.iArchimate.transformation.archi;

import java.util.ArrayList;

public class ArchiDiagramObject {
	private String id;
	private int fillColor10=-1;
	private ArchiElement archiElement;
	private ArchiBounds archiBounds;
	private ArrayList<ArchiRelation> archiRelations = new ArrayList<ArchiRelation>();
	private ArrayList<ArchiGroup> archiGroups = new ArrayList<ArchiGroup>();
	private ArrayList<ArchiDiagramObject> archiDiagramObjects = new ArrayList<ArchiDiagramObject>();
	
	public ArchiDiagramObject(String id, String fillColor16, ArchiElement archiElement) {
		super();
		this.id = id;
		if(fillColor16!=null){
			fillColor16 = fillColor16.substring(1);
			String r = fillColor16.substring(4,6);
			String g = fillColor16.substring(2,4);
			String b = fillColor16.substring(0,2);
			this.fillColor10=Integer.parseInt(r+g+b, 16);			
		}
		this.archiElement = archiElement;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getFillColor10() {
		return fillColor10;
	}

	public void setFillColor10(int fillColor10) {
		this.fillColor10 = fillColor10;
	}

	public ArchiElement getArchiElement() {
		return archiElement;
	}

	public void setArchiElement(ArchiElement archiElement) {
		this.archiElement = archiElement;
	}

	public ArchiBounds getArchiBounds() {
		return archiBounds;
	}

	public void setArchiBounds(ArchiBounds archiBounds) {
		this.archiBounds = archiBounds;
	}

	public ArrayList<ArchiRelation> getArchiRelations() {
		return archiRelations;
	}

	public void setArchiRelations(ArrayList<ArchiRelation> archiRelations) {
		this.archiRelations = archiRelations;
	}
	
	public ArrayList<ArchiGroup> getArchiGroups() {
		return archiGroups;
	}

	public void setArchiGroups(ArrayList<ArchiGroup> archiGroups) {
		this.archiGroups = archiGroups;
	}

	public void addArchiGroups(ArchiGroup createdArchiGroup) {
		this.archiGroups.add(createdArchiGroup);
	}
	
	public ArrayList<ArchiDiagramObject> getArchiDiagramObjects() {
		return archiDiagramObjects;
	}

	public void setArchiDiagramObjects(
			ArrayList<ArchiDiagramObject> archiDiagramObjects) {
		this.archiDiagramObjects = archiDiagramObjects;
	}

	public void addArchiDiagramObject(ArchiDiagramObject createdArchiDiagramObject) {
		this.archiDiagramObjects.add(createdArchiDiagramObject);
		
	}

	@Override
	public String toString() {
		return "ArchiDiagramObject [id=" + id + ", archiElement="
				+ archiElement + ", archiBounds=" + archiBounds
				+ ", archiRelations=" + archiRelations + ", archiGroups="
				+ archiGroups + ", archiDiagramObjects=" + archiDiagramObjects
				+ "]";
	}


}
