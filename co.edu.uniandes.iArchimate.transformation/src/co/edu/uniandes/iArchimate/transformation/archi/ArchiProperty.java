package co.edu.uniandes.iArchimate.transformation.archi;

public class ArchiProperty {
	private String key;
	private String value;
	
	public ArchiProperty(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "ArchiProperty [key=" + key + ", value=" + value + "]";
	}
	


}
