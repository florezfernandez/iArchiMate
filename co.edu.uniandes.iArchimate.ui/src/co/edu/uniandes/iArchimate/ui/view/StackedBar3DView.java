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
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.title.LegendTitle;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.RectangleEdge;


public class StackedBar3DView extends ViewPart {

	private Composite swtAwtComponent;

	public StackedBar3DView() {

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
		JFreeChart chart = ChartFactory.createStackedBarChart3D(title, xLabel, yLabel, dataSet, PlotOrientation.VERTICAL, true, true, false);
		LegendTitle legendtitle = (LegendTitle)chart.getLegend(); 
		legendtitle.setPosition(RectangleEdge.RIGHT); 
		CategoryPlot plot = chart.getCategoryPlot();
		plot.setBackgroundPaint(Color.white);
		plot.setRangeGridlinePaint(Color.black);
		((BarRenderer3D) plot.getRenderer()).setMaximumBarWidth(0.05);
        CategoryAxis axis = plot.getDomainAxis();
        axis.setCategoryLabelPositions(CategoryLabelPositions.createUpRotationLabelPositions(Math.PI/5));
        ValueAxis rangeAxis = plot.getRangeAxis();
        rangeAxis.setRange(0,1);
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
