package co.edu.uniandes.iArchimate.ui.diagramCustomization;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.notation.View;

public class RelationDecoration extends ConnectionNodeEditPart {
	private IMapMode mapMode;
	
	public RelationDecoration(View view, IMapMode mapMode) {
		super(view);
		this.mapMode = mapMode;
	}

	@Override
	protected Connection createConnectionFigure() {
		return null;
	}

	public RotatableDecoration createArrowDecoration() {
		return new PolylineDecoration();
	}

	public RotatableDecoration createClosedArrowDecoration(boolean filled) {
		PolygonDecoration df = new PolygonDecoration();
		df.setFill( true );
		if(filled){
			df.setBackgroundColor(ColorConstants.black);        	
		}else{
			df.setBackgroundColor(ColorConstants.white);        	
		}        
		PointList pl = new PointList();
		pl.addPoint(this.mapMode.DPtoLP(0), this.mapMode.DPtoLP(0));
		pl.addPoint(this.mapMode.DPtoLP(-2), this.mapMode.DPtoLP(2));
		pl.addPoint(this.mapMode.DPtoLP(-2), this.mapMode.DPtoLP(-2));
		pl.addPoint(this.mapMode.DPtoLP(0), this.mapMode.DPtoLP(0));
		df.setTemplate(pl);
		df.setScale(this.mapMode.DPtoLP(7), this.mapMode.DPtoLP(3));
		return df;
	}

	public RotatableDecoration createSmallClosedArrowDecoration(boolean filled) {
		PolygonDecoration df = new PolygonDecoration();
		df.setFill( true );
		if(filled){
			df.setBackgroundColor(ColorConstants.black);        	
		}else{
			df.setBackgroundColor(ColorConstants.white);        	
		}        
		PointList pl = new PointList();
		pl.addPoint(this.mapMode.DPtoLP(0), this.mapMode.DPtoLP(0));
		pl.addPoint(this.mapMode.DPtoLP(-1), this.mapMode.DPtoLP(1));
		pl.addPoint(this.mapMode.DPtoLP(-1), this.mapMode.DPtoLP(-1));
		pl.addPoint(this.mapMode.DPtoLP(0), this.mapMode.DPtoLP(0));
		df.setTemplate(pl);
		df.setScale(this.mapMode.DPtoLP(7), this.mapMode.DPtoLP(3));
		return df;
	}

	public RotatableDecoration createRhombDecoration(boolean filled) {
		PolygonDecoration df = new PolygonDecoration();
		df.setFill( true );
		if(filled){
			df.setBackgroundColor(ColorConstants.black);        	
		}else{
			df.setBackgroundColor(ColorConstants.white);        	
		}        
		PointList pl = new PointList();
		pl.addPoint(this.mapMode.DPtoLP(-1), this.mapMode.DPtoLP(1));
		pl.addPoint(this.mapMode.DPtoLP(0), this.mapMode.DPtoLP(0));
		pl.addPoint(this.mapMode.DPtoLP(-1), this.mapMode.DPtoLP(-1));
		pl.addPoint(this.mapMode.DPtoLP(-2), this.mapMode.DPtoLP(0));
		pl.addPoint(this.mapMode.DPtoLP(-1), this.mapMode.DPtoLP(1));
		df.setTemplate(pl);
		df.setScale(this.mapMode.DPtoLP(7), this.mapMode.DPtoLP(3));
		return df;
	}


	public RotatableDecoration createCircleDecoration(boolean filled) {
		PolygonDecoration df = new PolygonDecoration();
		df.setFill( true );
		if(filled){
			df.setBackgroundColor(ColorConstants.black);        	
		}else{
			df.setBackgroundColor(ColorConstants.white);        	
		}        
		PointList pl = new PointList();
		pl.addPoint(this.mapMode.DPtoLP(0), this.mapMode.DPtoLP(3));
		pl.addPoint(this.mapMode.DPtoLP(2), this.mapMode.DPtoLP(2));
		pl.addPoint(this.mapMode.DPtoLP(3), this.mapMode.DPtoLP(0));
		pl.addPoint(this.mapMode.DPtoLP(2), this.mapMode.DPtoLP(-2));
		pl.addPoint(this.mapMode.DPtoLP(0), this.mapMode.DPtoLP(-3));
		pl.addPoint(this.mapMode.DPtoLP(-2), this.mapMode.DPtoLP(-2));
		pl.addPoint(this.mapMode.DPtoLP(-3), this.mapMode.DPtoLP(0));
		pl.addPoint(this.mapMode.DPtoLP(-2), this.mapMode.DPtoLP(2));
		pl.addPoint(this.mapMode.DPtoLP(0), this.mapMode.DPtoLP(3));

//		pl.addPoint(this.mapMode.DPtoLP(1), this.mapMode.DPtoLP(4));
//		pl.addPoint(this.mapMode.DPtoLP(3), this.mapMode.DPtoLP(3));
//		pl.addPoint(this.mapMode.DPtoLP(4), this.mapMode.DPtoLP(1));
//		pl.addPoint(this.mapMode.DPtoLP(4), this.mapMode.DPtoLP(-1));
//		pl.addPoint(this.mapMode.DPtoLP(3), this.mapMode.DPtoLP(-3));
//		pl.addPoint(this.mapMode.DPtoLP(1), this.mapMode.DPtoLP(-4));
//		pl.addPoint(this.mapMode.DPtoLP(-1), this.mapMode.DPtoLP(-4));
//		pl.addPoint(this.mapMode.DPtoLP(-3), this.mapMode.DPtoLP(-3));
//		pl.addPoint(this.mapMode.DPtoLP(-4), this.mapMode.DPtoLP(-1));
//		pl.addPoint(this.mapMode.DPtoLP(-4), this.mapMode.DPtoLP(1));
//		pl.addPoint(this.mapMode.DPtoLP(-3), this.mapMode.DPtoLP(3));
//		pl.addPoint(this.mapMode.DPtoLP(-1), this.mapMode.DPtoLP(4));
//		pl.addPoint(this.mapMode.DPtoLP(1), this.mapMode.DPtoLP(4));
		df.setTemplate(pl);
		df.setScale(this.mapMode.DPtoLP(1), this.mapMode.DPtoLP(1));
		return df;
	}

	public RotatableDecoration createXDecoration() {
		PolylineDecoration df = new PolylineDecoration();
		PointList pl = new PointList();
		pl.addPoint(this.mapMode.DPtoLP(0), this.mapMode.DPtoLP(1));
		pl.addPoint(this.mapMode.DPtoLP(-2), this.mapMode.DPtoLP(-1));
		pl.addPoint(this.mapMode.DPtoLP(-1), this.mapMode.DPtoLP(0));
		pl.addPoint(this.mapMode.DPtoLP(-2), this.mapMode.DPtoLP(1));
		pl.addPoint(this.mapMode.DPtoLP(0), this.mapMode.DPtoLP(-1));
		df.setTemplate(pl);
		df.setScale(this.mapMode.DPtoLP(5), this.mapMode.DPtoLP(5));
		return df;
	}

}
