package com.eezon.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class RequestsApproval {
	Display display;
	Shell shlEezon;
	Button btnBack;
	Button btnHome;
	private Table table;
	TableColumn tblclmnNewColumn;
	TableColumn tblclmnNewColumn_1;
	TableColumn tblclmnNewColumn_2;
	TableColumn tblclmnNewColumn_3;

	public RequestsApproval() {
		
		display = Display.getDefault();
		shlEezon = new Shell();
		shlEezon.setSize(662, 698);
		shlEezon.setText("EEZON-Requests Approval");
		
		btnHome = new Button(shlEezon, SWT.NONE);
		btnHome.setBounds(71, 10, 105, 35);
		btnHome.setText("Home");
		
		btnBack = new Button(shlEezon, SWT.NONE);
		btnBack.setText("Back");
		btnBack.setBounds(480, 10, 105, 35);
		
		table = new Table(shlEezon, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(116, 119, 435, 166);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnNewColumn = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn.setWidth(100);
		tblclmnNewColumn.setText("Req ID");
		
		TableColumn tblclmnNewColumn_1 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_1.setWidth(100);
		tblclmnNewColumn_1.setText("Req Type");
		
		TableColumn tblclmnNewColumn_2 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_2.setWidth(100);
		tblclmnNewColumn_2.setText("Course");
		
		TableColumn tblclmnNewColumn_3 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_3.setWidth(100);
		tblclmnNewColumn_3.setText("Action");

		shlEezon.open();
		shlEezon.layout();
		while (!shlEezon.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public Shell getShlEezon() {
		return shlEezon;
	}

	public void setShlEezon(Shell shlEezon) {
		this.shlEezon = shlEezon;
	}

	public Button getBtnBack() {
		return btnBack;
	}

	public void setBtnBack(Button btnBack) {
		this.btnBack = btnBack;
	}

	public Button getBtnHome() {
		return btnHome;
	}

	public void setBtnHome(Button btnHome) {
		this.btnHome = btnHome;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public TableColumn getTblclmnNewColumn() {
		return tblclmnNewColumn;
	}

	public void setTblclmnNewColumn(TableColumn tblclmnNewColumn) {
		this.tblclmnNewColumn = tblclmnNewColumn;
	}

	public TableColumn getTblclmnNewColumn_1() {
		return tblclmnNewColumn_1;
	}

	public void setTblclmnNewColumn_1(TableColumn tblclmnNewColumn_1) {
		this.tblclmnNewColumn_1 = tblclmnNewColumn_1;
	}

	public TableColumn getTblclmnNewColumn_2() {
		return tblclmnNewColumn_2;
	}

	public void setTblclmnNewColumn_2(TableColumn tblclmnNewColumn_2) {
		this.tblclmnNewColumn_2 = tblclmnNewColumn_2;
	}

	public TableColumn getTblclmnNewColumn_3() {
		return tblclmnNewColumn_3;
	}

	public void setTblclmnNewColumn_3(TableColumn tblclmnNewColumn_3) {
		this.tblclmnNewColumn_3 = tblclmnNewColumn_3;
	}
	
}


