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
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.data.category.DefaultCategoryDataset;


public class Bar3DView extends ViewPart {

	private Composite swtAwtComponent;

	public Bar3DView() {

	}

	@Override
	public void createPartControl(Composite parent) {
		this.swtAwtComponent = new Composite(parent, SWT.EMBEDDED);
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	public void updateView(String title, String xLabel, String yLabel, ArrayList<String[]> data){
		DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
		dataSet = createDataSet(data);
		JFreeChart chart = ChartFactory.createBarChart3D(title, xLabel, yLabel, dataSet, PlotOrientation.VERTICAL, true, true, true);
		CategoryPlot plot = chart.getCategoryPlot();
		plot.setBackgroundPaint(Color.white);
		plot.setRangeGridlinePaint(Color.black);
        CategoryAxis axis = plot.getDomainAxis();
        axis.setCategoryLabelPositions(CategoryLabelPositions.createUpRotationLabelPositions(Math.PI/5));
		ChartPanel panel = new ChartPanel(chart);
		Frame frame = SWT_AWT.new_Frame(this.swtAwtComponent);
		frame.add(panel);
	}
	
	private DefaultCategoryDataset createDataSet(ArrayList<String[]> data) {
		DefaultCategoryDataset defaultDataSet = new DefaultCategoryDataset();
		for(String []values : data ){
			defaultDataSet.setValue(Double.parseDouble(values[0]), values[1], values[2]);
		}		
		return defaultDataSet;
	}

}
