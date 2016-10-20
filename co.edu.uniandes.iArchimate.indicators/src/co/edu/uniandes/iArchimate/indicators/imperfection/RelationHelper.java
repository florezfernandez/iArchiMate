package co.edu.uniandes.iArchimate.indicators.imperfection;

public class RelationHelper {
	private int totalRelations;
	private int imperfectRelatinos;
	
	public RelationHelper(int imperfectRelations) {
		this.totalRelations = 1;
		this.imperfectRelatinos = imperfectRelations;
	}

	public int getTotalRelations() {
		return totalRelations;
	}

	public void addTotalRelations() {
		this.totalRelations++;
	}

	public int getImperfectRelatinos() {
		return imperfectRelatinos;
	}

	public void addImperfectRelatinos() {
		this.imperfectRelatinos++;
	}

}
