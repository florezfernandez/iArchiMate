package co.edu.uniandes.iArchimate.analysis.imperfection;

public class RelationHelper {
	private int totalRelations;
	private int imperfectRelations;
	
	public RelationHelper(int imperfectRelations) {
		this.totalRelations = 1;
		this.imperfectRelations = imperfectRelations;
	}

	public int getTotalRelations() {
		return totalRelations;
	}

	public void addTotalRelations() {
		this.totalRelations++;
	}

	public int getImperfectRelations() {
		return imperfectRelations;
	}

	public void addImperfectRelations() {
		this.imperfectRelations++;
	}

}
