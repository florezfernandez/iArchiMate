package co.edu.uniandes.iArchimate.ui.diagramCustomization;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

public class ElementCustomization {
	public static String BUSINESS_COMPONENTS = "BusinessActor;BusinessRole;BusinessCollaboration;BusinessInterface;Location;BusinessObject;" +
			"BusinessProcess;BusinessFunction;BusinessInteraction;BusinessEvent;BusinessService;Representation;Meaning;Value;Product;Contract";
	public static String APPLICATION_COMPONENTS = "ApplicationComponent;ApplicationCollaboration;ApplicationInterface;DataObject;" +
			"ApplicationFunction;ApplicationInteraction;ApplicationService";
	public static String TECHNOLOGY_COMPONENTS = "Node;Device;SystemSoftware;InfrastructureInterface;Network;CommunicationPath;" +
			"InfrastructureFunction;InfrastructureService;Artifact";
	public static String MOTIVATION_COMPONENTS_1= "Stakeholder;Driver;Assessment";
	public static String MOTIVATION_COMPONENTS_2= "Goal;Requirement;Constraint;Principle";
	public static String IMPLEMENTATION_COMPONENTS_1 = "WorkPackage;Deliverable";
	public static String IMPLEMENTATION_COMPONENTS_2 = "Plateau;Gap;";

	public static String Archimate_ICONS_URI="platform:/plugin/co.edu.uniandes.iArchimate.ui.diagramCustomization/icons/";

	public static void updateGraphicRepresentation(IFigure primaryShape, String typeName) {
		if(primaryShape.getClass().getSimpleName().equals("ElementFigure")){
			ElementCustomization.updateDefaultColor(primaryShape, typeName);			
		}
		ElementCustomization.updateIcon((WrappingLabel)primaryShape.getChildren().get(0), typeName);
	}

	public static void updateDefaultColor(IFigure primaryShape, String typeName) {
		Color newColor=null;
		org.eclipse.swt.graphics.Color primaryShapeColor = primaryShape.getBackgroundColor();				
		if((primaryShapeColor.getRed()==255 && primaryShapeColor.getGreen()==255 && primaryShapeColor.getBlue()==180)|| 
				(primaryShapeColor.getRed()==180 && primaryShapeColor.getGreen()==255 && primaryShapeColor.getBlue()==255) || 
				(primaryShapeColor.getRed()==200 && primaryShapeColor.getGreen()==220 && primaryShapeColor.getBlue()==180) || 
				(primaryShapeColor.getRed()==255 && primaryShapeColor.getGreen()==200 && primaryShapeColor.getBlue()==255) || 
				(primaryShapeColor.getRed()==200 && primaryShapeColor.getGreen()==200 && primaryShapeColor.getBlue()==255) || 
				(primaryShapeColor.getRed()==255 && primaryShapeColor.getGreen()==220 && primaryShapeColor.getBlue()==220) || 
				(primaryShapeColor.getRed()==220 && primaryShapeColor.getGreen()==255 && primaryShapeColor.getBlue()==220) || 
				(primaryShapeColor.getRed()==255 && primaryShapeColor.getGreen()==255 && primaryShapeColor.getBlue()==255)){
			if(ElementCustomization.BUSINESS_COMPONENTS.contains(typeName)){
				newColor = new Color(primaryShape.getBackgroundColor().getDevice(), 255,255,180);
			}else if(ElementCustomization.APPLICATION_COMPONENTS.contains(typeName)){
				newColor = new Color(primaryShape.getBackgroundColor().getDevice(), 180,255,255);				
			}else if(ElementCustomization.TECHNOLOGY_COMPONENTS.contains(typeName)){
				newColor = new Color(primaryShape.getBackgroundColor().getDevice(), 200,220,180);				
			}else if(ElementCustomization.MOTIVATION_COMPONENTS_1.contains(typeName)){
				newColor = new Color(primaryShape.getBackgroundColor().getDevice(), 255,200,255);
			}else if(ElementCustomization.MOTIVATION_COMPONENTS_2.contains(typeName)){
				newColor = new Color(primaryShape.getBackgroundColor().getDevice(), 200,200,255);
			}else if(ElementCustomization.IMPLEMENTATION_COMPONENTS_1.contains(typeName)){
				newColor = new Color(primaryShape.getBackgroundColor().getDevice(), 255,220,220);
			}else if(ElementCustomization.IMPLEMENTATION_COMPONENTS_2.contains(typeName)){
				newColor = new Color(primaryShape.getBackgroundColor().getDevice(), 220,255,220);
			}
			primaryShape.setBackgroundColor(newColor);
		}
	}

	public static void updateIcon(WrappingLabel label, String typeName) {
		URL url;
		try {
			url = FileLocator.toFileURL(new URL(ElementCustomization.Archimate_ICONS_URI+typeName+".gif"));
			label.setIcon(new Image(label.getIcon().getDevice(), url.getPath()));			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
