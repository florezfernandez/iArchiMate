package co.edu.uniandes.iArchimate.ui.view;

import java.awt.Frame;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTick;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.renderer.DefaultPolarItemRenderer;
import org.jfree.chart.renderer.PolarItemRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.TextAnchor;


public class PolarView extends ViewPart {

	private Composite swtAwtComponent;
	private JFreeChart chart;

	public PolarView() {

	}

	@Override
	public void createPartControl(Composite parent) {
		this.swtAwtComponent = new Composite(parent, SWT.EMBEDDED);
	}

	@Override
	public void setFocus() {

	}

	@SuppressWarnings("serial")
	public void updateView(ArrayList<String> titles, ArrayList<ArrayList<String>> ticks, ArrayList<ArrayList<String[]>> data, ArrayList<String[]> series) {
		JPanel bigPanel = new JPanel();
		int rows;
		int columns;
		if(titles.size()<=6){
			columns = 2;			
		}else{
			columns = 3;
		}
		rows = titles.size()/columns;
		if(titles.size()%columns!=0){
			rows++;
		}
		bigPanel.setLayout(new GridLayout(rows,columns,5,5));
		for(int i=0; i<titles.size(); i++){
			XYSeriesCollection dataSet = new XYSeriesCollection();		
			dataSet = createDataSet(data.get(i), series.get(i));
			ValueAxis radiusAxis = new NumberAxis();
			radiusAxis.setAutoRange(false);
	        //radiusAxis.setTickLabelsVisible(false);
	        PolarItemRenderer renderer = new DefaultPolarItemRenderer();
	        final ArrayList<String> currentTicks = ticks.get(i);
	        PolarPlot plot = new PolarPlot(dataSet, radiusAxis, renderer) {
	            @SuppressWarnings("rawtypes")
				@Override
	            protected List refreshAngleTicks() {
	                List<NumberTick> newTicks = new ArrayList<NumberTick>();
	                double quarter = ((double)currentTicks.size())/4;
	                double half = ((double)currentTicks.size())/2;
	                double threeQuarter = ((double)currentTicks.size()*3)/4;
	                for(int i=0; i<currentTicks.size(); i++){
	                	TextAnchor anchor=TextAnchor.BOTTOM_CENTER;
	                	if(i==0){
	                		anchor = TextAnchor.BOTTOM_CENTER;
	                	}else if(i<quarter){
	                		anchor = TextAnchor.BOTTOM_LEFT;
	                	}else if(i==quarter){
	                		anchor = TextAnchor.CENTER_LEFT;
	                	}else if(i>quarter && i<half){
	                		anchor = TextAnchor.TOP_LEFT;
	                	}else if(i==half){
	                		anchor = TextAnchor.TOP_CENTER;
	                	}else if(i>half && i<threeQuarter){
	                		anchor = TextAnchor.TOP_RIGHT;
	                	}else if(i==threeQuarter){
	                		anchor = TextAnchor.CENTER_RIGHT;
	                	}else if(i>threeQuarter){
	                		anchor = TextAnchor.BOTTOM_RIGHT;
	                	}
	                	String currentTickLabel = currentTicks.get(i).replace("Management", "Mgmt.");
	                	if(currentTickLabel.length()>20){
	                		currentTickLabel=currentTickLabel.substring(0,17)+"...";
	                	}
	                	newTicks.add(new NumberTick(i*(360/currentTicks.size()), currentTickLabel, anchor, TextAnchor.TOP_LEFT, 0));
	                }
	                return newTicks;
	            }
	        };
	        plot.setRadiusMinorGridlinesVisible(false);
	        chart = new JFreeChart(titles.get(i), JFreeChart.DEFAULT_TITLE_FONT, plot, true);
	        JPanel panel = new ChartPanel(chart);	
			bigPanel.add(panel);
		}
		Frame frame = SWT_AWT.new_Frame(this.swtAwtComponent);
		frame.add(bigPanel);
	}

	private XYSeriesCollection createDataSet(ArrayList<String[]> data, String[] series) {
		XYSeriesCollection dataSet = new XYSeriesCollection();
		for(int i=0; i<data.size(); i++){
			String [] values = data.get(i);
			XYSeries serie = new XYSeries("Availability="+series[i]);
			for(int j=0; j<values.length; j++){
				double angle = j * (360 / values.length);
				serie.add(angle, Double.parseDouble(values[j]));				
			}
			dataSet.addSeries(serie);
		}		
		return dataSet;
	}

}

