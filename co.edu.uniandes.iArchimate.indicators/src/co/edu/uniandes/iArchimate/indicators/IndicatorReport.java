package co.edu.uniandes.iArchimate.indicators;

import java.util.ArrayList;

public class IndicatorReport {
	private String [] titles;
	private ArrayList<String[]> registries = new ArrayList<String[]>();
	
	public IndicatorReport(String []titles) {
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
