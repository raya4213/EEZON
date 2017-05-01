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
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

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
	private Button btnLogout;
	private Label lblNewLabel;
	private Label lblStudent;
	
	
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
		shlEezon.setText("EEZON - View my Check IN / Check OUT ");
		shlEezon.setLocation(450,200);
		
		btnHome = new Button(shlEezon, SWT.NONE);
		btnHome.setBounds(76, 23, 105, 35);
		btnHome.setText("Home");
		btnHome.setData("btnHome");
		
		btnBack = new Button(shlEezon, SWT.NONE);
		btnBack.setBounds(454, 23, 105, 35);
		btnBack.setText("Back");
		btnBack.setData("btnBack");
		
		cmbSelectCourse = new Combo(shlEezon, SWT.NONE);
		cmbSelectCourse.setItems(new String[] {"Embedded System Design", "Advanced Computer Architecture", "Internet Of Things"});
		cmbSelectCourse.setBounds(445, 125, 152, 33);
		
		cmbSelectStudent = new Combo(shlEezon, SWT.NONE);
		cmbSelectStudent.setItems(new String[] {"Mine", "All"});
		cmbSelectStudent.setBounds(445, 189, 152, 33);
		
		btnView = new Button(shlEezon, SWT.NONE);
		btnView.setBounds(467, 401, 105, 35);
		btnView.setText("View");
		btnView.setData("btnView");
		
		tblDetails = new Table(shlEezon, SWT.BORDER | SWT.FULL_SELECTION);
		tblDetails.setBounds(54, 286, 831, 97);
		tblDetails.setHeaderVisible(true);
		tblDetails.setLinesVisible(true);
		
		tblColumn = new TableColumn(tblDetails, SWT.NULL);
		tblColumn.setWidth(88);
		tblColumn.setText("SerialNum");
		
		tblColumn = new TableColumn(tblDetails, SWT.NULL);
		tblColumn.setWidth(97);
		tblColumn.setText("CheckInDate");
		
		tblColumn = new TableColumn(tblDetails, SWT.NULL);
		tblColumn.setWidth(109);
		tblColumn.setText("CheckOutDate");
		
		tblColumn = new TableColumn(tblDetails, SWT.NULL);
		tblColumn.setWidth(109);
		tblColumn.setText("CourseName");
		
		tblColumn = new TableColumn(tblDetails, SWT.NULL);
		tblColumn.setWidth(100);
		tblColumn.setText("KitPenalty");
		
		tblColumn = new TableColumn(tblDetails, SWT.NULL);
		tblColumn.setWidth(72);
		tblColumn.setText("KitType");
		
		tblColumn = new TableColumn(tblDetails, SWT.NULL);
		tblColumn.setWidth(122);
		tblColumn.setText("StudentEmail");
		
		tblColumn = new TableColumn(tblDetails, SWT.NULL);
		tblColumn.setWidth(109);
		tblColumn.setText("StudentName");
		
		btnLogout = new Button(shlEezon, SWT.NONE);
		btnLogout.setText("Logout");
		btnLogout.setBounds(799, 23, 105, 35);
		btnLogout.setData("btnLogout");
		
		lblNewLabel = new Label(shlEezon, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.BOLD));
		lblNewLabel.setBounds(330, 128, 70, 28);
		lblNewLabel.setText("Course");
	
		
		lblStudent = new Label(shlEezon, SWT.NONE);
		lblStudent.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.BOLD));
		lblStudent.setText("Student");
		lblStudent.setBounds(330, 192, 77, 28);

	}	
	
	public Button getBtnLogout() {
		return btnLogout;
	}

	public void setBtnLogout(Button btnLogout) {
		this.btnLogout = btnLogout;
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
