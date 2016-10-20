package co.edu.uniandes.iArchimate.transformation.archi;

import java.util.ArrayList;

public class ArchiDiagram {
	private String id;
	private String name;
	private String viewPoint;
	private ArrayList<ArchiGroup> archiGroups = new ArrayList<ArchiGroup>();
	private ArrayList<ArchiDiagramObject> archiDiagramObjects = new ArrayList<ArchiDiagramObject>();
	
	public ArchiDiagram(String id, String name, String viewPoint) {
		super();
		this.id = id;
		this.name = name;
		this.viewPoint = viewPoint;
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

	public String getViewPoint() {
		return viewPoint;
	}

	public void setViewPoint(String viewPoint) {
		this.viewPoint = viewPoint;
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
		return "ArchiDiagram [id=" + id + ", name=" + name + ", viewPoint="
				+ viewPoint + ", archiGroups=" + archiGroups
				+ ", archiDiagramObjects=" + archiDiagramObjects + "]";
	}



	
	
}
