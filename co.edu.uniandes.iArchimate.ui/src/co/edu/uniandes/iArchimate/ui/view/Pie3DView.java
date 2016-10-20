package co.edu.uniandes.iArchimate.ui.view;

import java.awt.Color;
import java.awt.Frame;
import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;


public class Pie3DView extends ViewPart {

	private Composite swtAwtComponent;

	public Pie3DView() {

	}

	@Override
	public void createPartControl(Composite parent) {
		this.swtAwtComponent = new Composite(parent, SWT.EMBEDDED);
	}

	@Override
	public void setFocus() {

	}

	public void updateView(String title, ArrayList<String[]> data){
		PieDataset dataSet = new DefaultPieDataset();
		dataSet = createDataSet(data);
		JFreeChart chart = ChartFactory.createPieChart3D(title, dataSet, true, true, false);
		PiePlot3D plot = (PiePlot3D)chart.getPlot();
		plot.setStartAngle(0);
		plot.setDirection(Rotation.ANTICLOCKWISE);
		plot.setBackgroundPaint(Color.white);
		ChartPanel panel = new ChartPanel(chart);
		Frame frame = SWT_AWT.new_Frame(this.swtAwtComponent);
		frame.add(panel);
	}
	
	private PieDataset createDataSet(ArrayList<String[]> data) {
		DefaultPieDataset defaultDataSet =
		new DefaultPieDataset();
		for(String []values : data ){
			defaultDataSet.setValue(values[0], Integer.parseInt(values[1]));
		}		
		return defaultDataSet;
	}

}
