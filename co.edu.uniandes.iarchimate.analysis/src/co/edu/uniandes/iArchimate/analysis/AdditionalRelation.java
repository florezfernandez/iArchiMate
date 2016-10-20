package co.edu.uniandes.iArchimate.analysis;

public class AdditionalRelation {
	private String name;
	private String type;
	private String target;
	
	public static String ASSOCIATION="Association";

	
	public AdditionalRelation(String name, String type, String target) {
		super();
		this.name = name;
		this.type = type;
		this.target = target;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getTarget() {
		return target;
	}
	
}
