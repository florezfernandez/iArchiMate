package co.edu.uniandes.iArchimate.ui.view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

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
import org.jfree.data.category.DefaultCategoryDataset;


public class DualAxisView extends ViewPart {
	
	private Composite swtAwtComponent;

	public DualAxisView() {

	}

	@Override
	public void createPartControl(Composite parent) {
		this.swtAwtComponent = new Composite(parent, SWT.EMBEDDED);
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	public void updateView(String title, String xLabel, ArrayList<String> multipleYLabels, ArrayList<ArrayList<String[]>> multipleData){
		JPanel bigPanel = new JPanel();
		int rows;
		int columns;
		if(multipleYLabels.size()<=4){
			columns = 2;			
		}else{
			columns = 3;
		}
		rows = multipleYLabels.size()/columns;
		if(multipleYLabels.size()%columns!=0){
			rows++;
		}
		bigPanel.setLayout(new GridLayout(rows,columns,5,5));
		for(int i=0; i<multipleYLabels.size(); i++){
			DefaultCategoryDataset dataSet = createDataSet(multipleData.get(i));
			JFreeChart chart = ChartFactory.createLineChart(multipleYLabels.get(i), xLabel, multipleYLabels.get(i), dataSet, PlotOrientation.VERTICAL, true, true, false);
			CategoryPlot plot = chart.getCategoryPlot();
			//plot.getRenderer().setSeriesStroke(0, new BasicStroke(8.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 10.0f, new float[] {1f, 100.0f}, 0.0f));
			plot.setBackgroundPaint(Color.white);
			plot.setRangeGridlinePaint(Color.black);
			CategoryAxis axis = plot.getDomainAxis();
	        axis.setCategoryLabelPositions(CategoryLabelPositions.createUpRotationLabelPositions(Math.PI/10));
	        JPanel panel = new ChartPanel(chart);	
			bigPanel.add(panel);
		}
		Frame frame = SWT_AWT.new_Frame(this.swtAwtComponent);
		frame.add(bigPanel);
	}
	
	private DefaultCategoryDataset createDataSet(ArrayList<String[]> data) {
		DefaultCategoryDataset defaultDataSet = new DefaultCategoryDataset();
		for(String []values : data ){
			defaultDataSet.setValue(Double.parseDouble(values[0]), values[1], values[2]);
		}		
		return defaultDataSet;
	}

}
