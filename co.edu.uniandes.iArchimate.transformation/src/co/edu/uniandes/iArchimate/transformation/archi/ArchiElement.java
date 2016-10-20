package co.edu.uniandes.iArchimate.transformation.archi;

import java.util.ArrayList;

public class ArchiElement {
	private String id;
	private String layer;
	private String archimateConcept;
	private String name;
	private ArrayList<ArchiProperty> archiProperties = new ArrayList<ArchiProperty>();
	
	public ArchiElement(String id, String layer, String archimateConcept, String name) {
		super();
		this.id=id;
		this.layer = layer;
		this.archimateConcept = archimateConcept;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLayer() {
		return layer;
	}

	public void setLayer(String layer) {
		this.layer = layer;
	}

	public String getArchimateConcept() {
		return archimateConcept;
	}

	public void setArchimateConcept(String archimateConcept) {
		this.archimateConcept = archimateConcept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	

	public ArrayList<ArchiProperty> getArchiProperties() {
		return archiProperties;
	}

	public void setArchiProperties(ArrayList<ArchiProperty> archiProperties) {
		this.archiProperties = archiProperties;
	}

	@Override
	public String toString() {
		return "ArchiElement [id=" + id + ", layer=" + layer
				+ ", archimateConcept=" + archimateConcept + ", name=" + name
				+ ", archiProperties=" + archiProperties + "]";
	}
}
