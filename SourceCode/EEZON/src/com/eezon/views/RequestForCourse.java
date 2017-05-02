package com.eezon.views;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Label;

public class RequestForCourse {
	private Table table;
	Display display;
	Shell shell;
	Button btnNewButton;
	Button btnNewButton_1;
	Button btnNewButton_2;
	TableColumn tblclmnNewColumn;
	TableColumn tblclmnNewColumn_1;
	TableColumn tblclmnNewColumn_2;
	TableColumn tblclmnNewColumn_3;
	List list;
	Label lblSelectMultipleCourses;
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			RequestForCourse window = new RequestForCourse();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		display = Display.getDefault();
		shell = new Shell();
		shell.setSize(918, 699);
		shell.setText("SWT Application");
		
		btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setBounds(39, 43, 90, 30);
		btnNewButton.setText("Home");
		
		btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.setBounds(768, 43, 90, 30);
		btnNewButton_1.setText("Back");
		
		btnNewButton_2 = new Button(shell, SWT.NONE);
		btnNewButton_2.setBounds(410, 43, 90, 30);
		btnNewButton_2.setText("Request");
		
		table = new Table(shell, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(85, 119, 733, 188);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		tblclmnNewColumn = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn.setWidth(117);
		tblclmnNewColumn.setText("Req ID");
		
		tblclmnNewColumn_1 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_1.setWidth(147);
		tblclmnNewColumn_1.setText("Req Type");
		
		tblclmnNewColumn_2 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_2.setWidth(229);
		tblclmnNewColumn_2.setText("Course");
		
		tblclmnNewColumn_3 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_3.setWidth(331);
		tblclmnNewColumn_3.setText("Status");
		
		list = new List(shell, SWT.BORDER);
		list.setBounds(309, 388, 317, 205);
		
		lblSelectMultipleCourses = new Label(shell, SWT.NONE);
		lblSelectMultipleCourses.setText("Select Multiple Courses");
		lblSelectMultipleCourses.setBounds(311, 348, 303, 20);

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public Shell getShell() {
		return shell;
	}

	public void setShell(Shell shell) {
		this.shell = shell;
	}

	public Button getBtnNewButton() {
		return btnNewButton;
	}

	public void setBtnNewButton(Button btnNewButton) {
		this.btnNewButton = btnNewButton;
	}

	public Button getBtnNewButton_1() {
		return btnNewButton_1;
	}

	public void setBtnNewButton_1(Button btnNewButton_1) {
		this.btnNewButton_1 = btnNewButton_1;
	}

	public Button getBtnNewButton_2() {
		return btnNewButton_2;
	}

	public void setBtnNewButton_2(Button btnNewButton_2) {
		this.btnNewButton_2 = btnNewButton_2;
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

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public Label getLblSelectMultipleCourses() {
		return lblSelectMultipleCourses;
	}

	public void setLblSelectMultipleCourses(Label lblSelectMultipleCourses) {
		this.lblSelectMultipleCourses = lblSelectMultipleCourses;
	}
	
}
