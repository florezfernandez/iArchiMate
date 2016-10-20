package co.edu.uniandes.iArchimate.analysis.imperfection;

public class AttributeHelper {
	private int totalAttributes;
	private int imperfectAttributes;
	
	public AttributeHelper(int imperfectAttributes) {
		this.totalAttributes = 1;
		this.imperfectAttributes = imperfectAttributes;
	}

	public int getTotalAttributes() {
		return totalAttributes;
	}

	public void addTotalAttributes() {
		this.totalAttributes++;
	}

	public int getImperfectAttributes() {
		return imperfectAttributes;
	}

	public void addImperfectAttributes() {
		this.imperfectAttributes++;
	}
}
