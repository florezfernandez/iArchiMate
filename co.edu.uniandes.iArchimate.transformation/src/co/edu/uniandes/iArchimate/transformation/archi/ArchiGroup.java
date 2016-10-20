package co.edu.uniandes.iArchimate.transformation.archi;

import java.util.ArrayList;

public class ArchiGroup {
	private String id;
	private String name;
	private ArchiBounds archiBounds;
	private ArrayList<ArchiGroup> archiGroups = new ArrayList<ArchiGroup>();
	private ArrayList<ArchiDiagramObject> archiDiagramObjects = new ArrayList<ArchiDiagramObject>();
	
	public ArchiGroup(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArchiBounds getArchiBounds() {
		return archiBounds;
	}

	public void setArchiBounds(ArchiBounds archiBounds) {
		this.archiBounds = archiBounds;
	}

	public ArrayList<ArchiDiagramObject> getArchiDiagramObjects() {
		return archiDiagramObjects;
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

	public void setArchiDiagramObjects(
			ArrayList<ArchiDiagramObject> archiDiagramObjects) {
		this.archiDiagramObjects = archiDiagramObjects;
	}

	public void addArchiDiagramObject(ArchiDiagramObject createdArchiDiagramObject) {
		this.archiDiagramObjects.add(createdArchiDiagramObject);
		
	}

	@Override
	public String toString() {
		return "ArchiGroup [id=" + id + ", name=" + name + ", archiBounds="
				+ archiBounds + ", archiGroups=" + archiGroups
				+ ", archiDiagramObjects=" + archiDiagramObjects + "]";
	}

	
	
	
	
}
