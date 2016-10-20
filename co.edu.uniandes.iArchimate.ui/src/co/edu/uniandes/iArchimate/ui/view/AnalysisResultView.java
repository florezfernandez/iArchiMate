package co.edu.uniandes.iArchimate.ui.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.part.ViewPart;

import co.edu.uniandes.iArchimate.analysis.AnalysisMethodReport;

public class AnalysisResultView extends ViewPart {

	private Table table;

	public AnalysisResultView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {		
		this.table = new Table(parent, SWT.SINGLE | SWT.BORDER | SWT.FULL_SELECTION);
		this.table.setLinesVisible (true);
		this.table.setHeaderVisible (true);
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);		
		this.table.setLayoutData(gridData);

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("deprecation")
	public void updateView(String title, AnalysisMethodReport analysisMethodReport){
		this.setTitle(title);
		this.table.removeAll();
		while ( table.getColumnCount() > 0 ) {
		    this.table.getColumns()[0].dispose();
		}
		for (int i=0; i<analysisMethodReport.getTitles().length; i++) {
			TableColumn column = new TableColumn (this.table, SWT.NONE);
			column.setText(analysisMethodReport.getTitles()[i]);
		}					
		TableItem item; 
		for (String[] registry : analysisMethodReport.getRegistries()) {
			item = new TableItem (this.table, SWT.NONE);
			for(int i=0; i<registry.length; i++){
				item.setText(i, registry[i]);				
			}
		}
		for(int i=0; i<this.table.getColumns().length; i++){
			this.table.getColumns()[i].pack();
		}
	}

}
