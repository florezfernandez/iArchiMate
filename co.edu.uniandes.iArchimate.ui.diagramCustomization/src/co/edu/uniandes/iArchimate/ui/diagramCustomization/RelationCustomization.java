package co.edu.uniandes.iArchimate.ui.diagramCustomization;


import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.notation.View;

public class RelationCustomization {

	public static RotatableDecoration updateSourceDecoration(View view, IMapMode mapMode, String typeName) {
		RelationDecoration decoration = new RelationDecoration(view, mapMode);
		if(typeName.equals("Composition")){
			return decoration.createRhombDecoration(true);
		}else if(typeName.equals("Aggregation")){
			return decoration.createRhombDecoration(false);
		}else if(typeName.equals("Assignment")){
			return decoration.createCircleDecoration(true);
		}else if(typeName.equals("NotSelected")){
			return decoration.createXDecoration();
		}else{
			return null;
		}
	}
	
	public static RotatableDecoration updateTargetDecoration(View view, IMapMode mapMode, String typeName) {
		RelationDecoration decoration = new RelationDecoration(view, mapMode);
		if(typeName.equals("Assignment")){
			return decoration.createCircleDecoration(true);
		}else if(typeName.equals("Realization")){
			return decoration.createClosedArrowDecoration(false);
		}else if(typeName.equals("UsedBy")){
			return decoration.createArrowDecoration();
		}else if(typeName.equals("Access")){
			return decoration.createArrowDecoration();
		}else if(typeName.equals("Triggering")){
			return decoration.createSmallClosedArrowDecoration(true);
		}else if(typeName.equals("Flow")){
			return decoration.createSmallClosedArrowDecoration(true);
		}else if(typeName.equals("Specialization")){
			return decoration.createClosedArrowDecoration(false);
		}else if(typeName.equals("NotSelected")){
			return decoration.createXDecoration();
		}else{
			return null;
		}
	}

	public static int updateLineStyle(String typeName) {
		if(typeName.equals("Realization")){
			return Graphics.LINE_DASH;
		}else if(typeName.equals("Access")){
			return Graphics.LINE_DOT;
		}else if(typeName.equals("Flow")){
			return Graphics.LINE_DASH;
		}else{
			return Graphics.LINE_SOLID;
		}
	}
}
