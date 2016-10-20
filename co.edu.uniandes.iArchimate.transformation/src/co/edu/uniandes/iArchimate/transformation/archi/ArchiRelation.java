package co.edu.uniandes.iArchimate.transformation.archi;

import java.util.ArrayList;

public class ArchiRelation {
	private String id;
	private String name;
	private String archimateRelation;
	private ArchiElement source;
	private ArchiElement target;
	private ArrayList<ArchiProperty> archiProperties = new ArrayList<ArchiProperty>();
	
	public ArchiRelation(String id, String name, String archimateRelation,
			ArchiElement source, ArchiElement target) {
		super();
		this.id = id;
		this.name = name;
		this.archimateRelation = archimateRelation;
		this.source = source;
		this.target = target;
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

	public String getArchimateRelation() {
		return archimateRelation;
	}

	public void setArchimateRelation(String archimateRelation) {
		this.archimateRelation = archimateRelation;
	}

	public ArchiElement getSource() {
		return source;
	}

	public void setSource(ArchiElement source) {
		this.source = source;
	}

	public ArchiElement getTarget() {
		return target;
	}

	public void setTarget(ArchiElement target) {
		this.target = target;
	}

	public ArrayList<ArchiProperty> getArchiProperties() {
		return archiProperties;
	}

	public void setArchiProperties(ArrayList<ArchiProperty> archiProperties) {
		this.archiProperties = archiProperties;
	}

	@Override
	public String toString() {
		return "ArchiRelation [id=" + id + ", name=" + name
				+ ", archimateRelation=" + archimateRelation + ", source="
				+ source + ", target=" + target + ", archiProperties="
				+ archiProperties + "]";
	}
}
