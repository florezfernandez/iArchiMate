package co.edu.uniandes.iArchimate.utilities.persistance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {

	public static void storeProperty(String propertiesPath, String [][]propertiesValues){
		try {
			File propertiesFile = new File(propertiesPath);
			Properties properties = new Properties();
			for(int i=0; i<propertiesValues.length; i++){
				properties.setProperty(propertiesValues[i][0], propertiesValues[i][1]);				
			}
			FileOutputStream output = new FileOutputStream(propertiesFile);
			properties.store(output, "");
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String[] loadProperties(String propertiesPath, String attributes[]){
		try {
			File propertiesFile = new File(propertiesPath);
			FileInputStream input = new FileInputStream(propertiesFile);
			Properties properties = new Properties();
			properties.load(input);
			String []values = new String[attributes.length];
			for(int i=0; i<attributes.length; i++){
				values[i]=properties.getProperty(attributes[i]);
			}
			return values;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String loadProperty(String propertiesPath, String attribute){
		try {
			File propertiesFile = new File(propertiesPath);
			FileInputStream input = new FileInputStream(propertiesFile);
			Properties properties = new Properties();
			properties.load(input);
			return properties.getProperty(attribute);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void storeDomainMMProperty(String propertiesPath, String domainMMPropertyValue){
		try {
			File propertiesFile = new File(propertiesPath);
			Properties properties = new Properties();
			properties.setProperty("domainMetamodel", domainMMPropertyValue);
			FileOutputStream output = new FileOutputStream(propertiesFile);
			properties.store(output, "");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String loadDomainMMProperty(String propertiesPath){
		try {
			File propertiesFile = new File(propertiesPath);
			FileInputStream input = new FileInputStream(propertiesFile);
			Properties properties = new Properties();
			properties.load(input);
			return properties.getProperty("domainMetamodel"); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
