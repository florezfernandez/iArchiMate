package co.edu.uniandes.iArchimate.analysis;

import java.util.ArrayList;

public class AnalysisMethodReport {
	private String [] titles;
	private ArrayList<String[]> registries = new ArrayList<String[]>();
	
	public AnalysisMethodReport(String []titles) {
		this.titles = titles;
	}

	public String[] getTitles() {
		return titles;
	}

	public ArrayList<String[]> getRegistries() {
		return registries;
	}
	
	public void addRegistry(String [] registry){
		this.registries.add(registry);
	}

}
