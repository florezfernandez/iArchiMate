package co.edu.uniandes.iArchimate.ui.view;

import java.util.ArrayList;

import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class PolarViewLauncher {

	@SuppressWarnings("deprecation")
	public static void launchView(ArrayList<String> titles, ArrayList<ArrayList<String>> ticks, ArrayList<ArrayList<String[]>> data, ArrayList<String[]> series) {
		try {
			PolarView polarView=null;
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("co.edu.uniandes.iArchimate.ui.views.polar");
			IViewPart[] views = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getViews();
			for(IViewPart view : views){
				if(view instanceof PolarView){
					polarView = (PolarView)view;
					break;
				}
			}
			polarView.updateView(titles, ticks, data, series);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}
	
	public static void launchTest(){
		ArrayList<String> titles = new ArrayList<String>();
		titles.add("First Chart");
		titles.add("Second Chart");
		titles.add("Third Chart");
		titles.add("Fourth Chart");
		ArrayList<ArrayList<String>> ticks = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String[]>> data = new ArrayList<ArrayList<String[]>>();
		ArrayList<String[]> series = new ArrayList<String[]>();
		for(int i=1; i<=4; i++){
			ArrayList<String> theTick = new ArrayList<String>();
			ArrayList<String[]> theData = new ArrayList<String[]>();			
			String []serie = new String[i*3];
			for(int j=1; j<=i*3; j++){
				theTick.add(i+"->"+j);
				String []serieData = new String[i*3];
				serie[j-1]=String.valueOf((j+1)*10);
				for(int k=0; k<i*3; k++){
					double newi = ((double)i)/10;
					double newj = ((double)j)/10;
					double newk = ((double)(k+1))/10;
					serieData[k]=String.valueOf(newi*newj*newk);
				}
				theData.add(serieData);
			}
			series.add(serie);
			data.add(theData);
			ticks.add(theTick);
		}
		PolarViewLauncher.launchView(titles, ticks, data, series);
	}

}
