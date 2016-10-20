package co.edu.uniandes.iArchimate.utilities.persistance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.jdom.Document;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class FileLoader {

	public static ArrayList<String[]> loadArchimateRelationFile(String filePath){
		try {
			ArrayList<String[]> relations = new ArrayList<String[]>();
			BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));
			String line;
			while((line=br.readLine())!=null){
				String []relationData = new String[4];
				String []data = line.split("->");
				String []refInfo = data[0].split(".");
				relationData[0]=refInfo[0];
				relationData[1]=refInfo[1];
				refInfo = data[1].split(".");
				relationData[2]=refInfo[0];
				relationData[3]=refInfo[1];				
				relations.add(relationData);
			}	
			br.close();
			return relations; 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void saveXMLFile(Document document, String fullPath) throws IOException{
		XMLOutputter xmlOutput = new XMLOutputter();			 
		xmlOutput.setFormat(Format.getPrettyFormat());
		xmlOutput.output(document, new FileWriter(fullPath));
	}

	public static void createFolderInProject(String folderPath){
		File folder = new File(folderPath);
		if (!folder.exists()) {
			folder.mkdir();  
		}		
	}
}