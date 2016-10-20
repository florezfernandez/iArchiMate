package co.edu.uniandes.iArchimate.utilities.xml;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class XMLUtil {

	public void updateCollapsedExtensionCompartments(String path, String modelName, int idExtension, boolean collapseValue){
		try {
			SAXBuilder builder=new SAXBuilder(false); 
			Document doc;
			doc = builder.build(path);
			Element root=doc.getRootElement();
			iterateChildrenExtensionCompartment(root, modelName, idExtension, collapseValue, 0);
			XMLOutputter xmlOutput = new XMLOutputter();
			xmlOutput.setFormat(Format.getPrettyFormat());
			xmlOutput.output(doc, new FileWriter(path));
		} catch (JDOMException | IOException e) {
			e.printStackTrace();
		}
		
	}

	@SuppressWarnings("unchecked")
	public boolean iterateChildrenExtensionCompartment(Element root, String modelName, int idExtension, boolean collapseValue, int treeLevel){
		List<Element> elements=root.getChildren("element");
		boolean elementFounded=false;
		for(Element element : elements){
			for(int i=0; i<treeLevel; i++){
				System.out.print("\t");
			}
			System.out.println("Element: href= " +element.getAttribute("href"));
			String href = element.getAttributeValue("href");
			String idExtensionPrefix = modelName+"#//@modelExtensions."+idExtension+"/@";
			if(href.equals(idExtensionPrefix+"decisions.0")||
					href.equals(idExtensionPrefix+"facts.0")||
					href.equals(idExtensionPrefix+"observations.0")||
					href.equals(idExtensionPrefix+"sources.0")
					){
				return true;
			}
		}

		List<Element> children=root.getChildren("children");
		for(Element child : children){
			for(int i=0; i<treeLevel; i++){
				System.out.print("\t");
			}
			System.out.println("Children: type="+child.getAttribute("type"));
			elementFounded=iterateChildrenExtensionCompartment(child, modelName, idExtension, collapseValue, treeLevel+1);
			int idFounded=Integer.parseInt(child.getAttributeValue("type"));
			if(elementFounded){
				if(idFounded>=7002 && idFounded<=7005){
					Attribute collpasedAttribute = new Attribute("collapsed", String.valueOf(collapseValue));
					child.setAttribute(collpasedAttribute);
				}else{
					return true;
				}
			}		
		}
		return elementFounded;
	}	
	
	public static void main(String[] args) {
		XMLUtil util = new XMLUtil();
		util.updateCollapsedExtensionCompartments("C:/Users/HectorFlorez/Dropbox/Doctorado/runtime-EclipseApplication/prueba/model/imprecision/imp_1.iModel_diagram", "imp_1.iModel", 0, true);
	}
}
