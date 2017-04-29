package com.eezon.views;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class ViewMyCheckInCheckOut {
	Button btnHome;
	Button btnBack;
	Combo cmbSelectCourse;
	Combo cmbSelectStudent;
	Display display;
	Shell shlEezon;
	Button btnView;
	private Table tblDetails;
	TableColumn tblColumn;
	
	
	/**
	 * Launch the application.
	 * @param args
	 */
//	public static void main(String[] args) {
//		try {
//			ViewMyCheckInCheckOut window = new ViewMyCheckInCheckOut();
//			window.open();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}


	/**
	 * Open the window.
	 */
	public ViewMyCheckInCheckOut() {
		display = Display.getDefault();
		shlEezon = new Shell();
		shlEezon.setSize(957, 554);
		shlEezon.setText("EEZON - View my Check IN / Check OUT - Student");
		
		btnHome = new Button(shlEezon, SWT.NONE);
		btnHome.setBounds(76, 23, 105, 35);
		btnHome.setText("HOME");
		btnHome.setData("btnHome");
		
		btnBack = new Button(shlEezon, SWT.NONE);
		btnBack.setBounds(224, 23, 105, 35);
		btnBack.setText("BACK");
		btnBack.setData("btnBack");
		
		cmbSelectCourse = new Combo(shlEezon, SWT.NONE);
		cmbSelectCourse.setItems(new String[] {"Embedded System Design", "Advanced Computer Architecture", "Internet Of Things "});
		cmbSelectCourse.setBounds(358, 125, 152, 33);
		cmbSelectCourse.setText("Select Course");
		
		cmbSelectStudent = new Combo(shlEezon, SWT.NONE);
		cmbSelectStudent.setItems(new String[] {"Mine", "All"});
		cmbSelectStudent.setBounds(358, 230, 152, 33);
		cmbSelectStudent.setText("Select Student");
		
		btnView = new Button(shlEezon, SWT.NONE);
		btnView.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnView.setBounds(375, 399, 105, 35);
		btnView.setText("VIEW");
		btnView.setData("btnView");
		
		tblDetails = new Table(shlEezon, SWT.BORDER | SWT.FULL_SELECTION);
		tblDetails.setBounds(192, 296, 440, 61);
		tblDetails.setHeaderVisible(true);
		tblDetails.setLinesVisible(true);
		
		tblColumn = new TableColumn(tblDetails, SWT.NULL);
		tblColumn.setWidth(70);
		tblColumn.setText("SerialNum");
		
		tblColumn = new TableColumn(tblDetails, SWT.NULL);
		tblColumn.setWidth(79);
		tblColumn.setText("CheckInDate");
		
		tblColumn = new TableColumn(tblDetails, SWT.NULL);
		tblColumn.setWidth(89);
		tblColumn.setText("CheckOutDate");
		
		tblColumn = new TableColumn(tblDetails, SWT.NULL);
		tblColumn.setWidth(83);
		tblColumn.setText("CourseName");
		
		tblColumn = new TableColumn(tblDetails, SWT.NULL);
		tblColumn.setWidth(65);
		tblColumn.setText("KitPenalty");
		
		tblColumn = new TableColumn(tblDetails, SWT.NULL);
		tblColumn.setWidth(51);
		tblColumn.setText("KitType");
		
		tblColumn = new TableColumn(tblDetails, SWT.NULL);
		tblColumn.setWidth(86);
		tblColumn.setText("StudentEmail");
		
		tblColumn = new TableColumn(tblDetails, SWT.NULL);
		tblColumn.setWidth(86);
		tblColumn.setText("StudentName");

	}	
	
	public TableColumn getTblColumn() {
		return tblColumn;
	}


	public void setTblColumn(TableColumn tblColumn) {
		this.tblColumn = tblColumn;
	}


	public Table getTblDetails() {
		return tblDetails;
	}


	public void setTblDetails(Table tblDetails) {
		this.tblDetails = tblDetails;
	}


	public Button getBtnHome() {
		return btnHome;
	}


	public void setBtnHome(Button btnHome) {
		this.btnHome = btnHome;
	}


	public Button getBtnBack() {
		return btnBack;
	}


	public void setBtnBack(Button btnBack) {
		this.btnBack = btnBack;
	}


	public Combo getCmbSelectCourse() {
		return cmbSelectCourse;
	}


	public void setCmbSelectCourse(Combo cmbSelectCourse) {
		this.cmbSelectCourse = cmbSelectCourse;
	}


	public Combo getCmbSelectStudent() {
		return cmbSelectStudent;
	}


	public void setCmbSelectStudent(Combo cmbSelectStudent) {
		this.cmbSelectStudent = cmbSelectStudent;
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


	public Button getBtnView() {
		return btnView;
	}


	public void setBtnView(Button btnView) {
		this.btnView = btnView;
	}
}
