package co.edu.uniandes.iArchimate.analysis;

public class AdditionalAttribute {
	private String name;
	private String type;
	private String restriction;
	private String calculated;
	
	public static String INT="EInt";
	public static String DOUBLE="EDouble";
	public static String STRING="EString";
	public static String BOOLEAN="EBoolean";
	public static String DATE="EDate";
	
	public static String CALCULATED="Calculated";
	public static String CALCULATED_IF_POSSIBLE="Calculated if possible";
	public static String MANDATORY="Mandatory";
	public static String OPTIONAL="Optional";
	
	
	public AdditionalAttribute(String name, String type, String restriction, String calculated) {
		this.name = name;
		this.type = type;
		this.restriction = restriction;
		this.calculated = calculated;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getRestriction() {
		return restriction;
	}

	public String getCalculated() {
		return calculated;
	}

	
	
}
